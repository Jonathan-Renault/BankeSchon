# coding=UTF-8
# !/usr/bin/ python3
import os
import time
import pipes
from functions import get_env
from subprocess import Popen, PIPE

get_env('/Users/yamna/Projets/Bankeschon/Script/database_credentials.env')
db_host = os.getenv('DB_HOST')
db_user = os.getenv('DB_USER')
db_user_password = os.getenv('DB_USER_PASSWORD')
db_name = os.getenv('DB_NAME')
backup_path = os.getenv('BACKUP_PATH')


# Nom du dossier de sauvegarde à la date du jour
datetime = time.strftime('%d%m%Y-%H:%M:%S')
today_back_up_path = backup_path + datetime

# Creation du dossier de sauvegarde
try:
    os.stat(today_back_up_path)
except:
    os.makedirs(today_back_up_path)

print("Sauvegarde de la base de donnée " + db_name + " en cours...")

# Lancement de la commande du process de sauvegarde
back_up_command = "exec /usr/local/bin/pg_dump -h " + db_host + " -U " + db_user + " -Ft " \
                  + db_name + " > " + pipes.quote(today_back_up_path) \
                  + "/" + db_name + ".tar"
Popen(back_up_command, shell=True, stdin=PIPE)

print("Sauvegarde enregistrée")
print("Votre sauvegarde a été créée dans le dossier suivant " + today_back_up_path)
