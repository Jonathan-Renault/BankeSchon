# coding=UTF-8
# !/usr/bin/ python3
import os
import psycopg2
from sendgrid import SendGridAPIClient, Content
from sendgrid.helpers.mail import Mail
from functions import get_env, query_to_array
from builtins import Exception

get_env('/Users/yamna/Projets/Bankeschon/Script/database_credentials.env')
get_env('/Users/yamna/Projets/Bankeschon/Script/sendgrid.env')

connection = psycopg2.connect(database=os.getenv('DB_NAME'),
                              user=os.getenv('DB_USER'),
                              password=os.getenv('DB_USER_PASSWORD'),
                              host=os.getenv('DB_HOST'),
                              port=os.getenv('DB_PORT'))

# Récuperation des donnees client

query = '''SELECT surname, name, mail ,adapted_offers from prospects where is_customer = 1 order by id'''

customers_array = []
query_to_array(connection, customers_array, query)

# Parcours du tableau et envoie de mail aux clients correspondants


length = len(customers_array)
for i in range(0, length):
    adapted_offers_array = customers_array[i]['adapted_offers'].split('-', 3)
    customers_email = customers_array[i]['mail']
    sender_email = 'contact@bankeschon.com'
    customers_name = customers_array[i]['surname']
    customers_first_name = customers_array[i]['name']
    subject = 'Vos offres'
    separator = ', '
    adapted_offers = separator.join(adapted_offers_array)
    logo_url = 'https://i.ibb.co/9wKPR0S/bankeschon-logo.png'
    html = '''
            <body style="background:#efefef;font-family:'Open Sans',sans-serif;margin:0 auto;font-size:15px;">
                <header style="margin:auto;text-align:center;padding:30px;">
                    <img src="{logo_url}" width="100" height="100">
                </header>
                <section style="background:white;margin:auto;width:50%;padding:30px;">
                    <h2 style="font-weight:bold;text-transform:capitalize;font-size:19px;margin:0;">
                    Bonjour {first_name} {name}</h2>
                    <p>Merci de votre fidelité !</p>
                    <p>Nous vous proposons ces offres personnalisees :
                    <br>
                    {adapted_offers}
                    </p>
                    <br>
                    <a href="google.fr" style="background:linear-gradient(135deg, #00CA94, #00A5E9);
                    padding:10px;border:2px solid;border-image:linear-gradient(135deg, #00CA94, #00A5E9) 20;
                    text-decoration:none;color:white;margin:10px 0;
                    border: 2px solid;
                    border-image: linear-gradient(135deg, #00CA94, #00A5E9) 20;
                    background: linear-gradient(135deg, #00CA94, #00A5E9);
                    -webkit-background-clip: text;
                    -webkit-text-fill-color: transparent;">En savoir plus</a>
                    <br>
                    <br>
                    <p>Cordialement,<br>Votre conseiller BankeSchon</p>
                    </section>
            </body>'''
    html_content = html.format(
        name=customers_name,
        first_name=customers_first_name,
        adapted_offers=adapted_offers,
        logo_url=logo_url,
    )
    content = Content("text/html", html_content)
    message = Mail(sender_email, customers_email, subject, content)

    try:
        sg = SendGridAPIClient(os.getenv('SENDGRID_API_KEY'))
        response = sg.send(message)
        print(response.status_code)
        print(response.body)
        print(response.headers)
        print('Email envoyé avec succès')
    except Exception as e:
        print(e)
