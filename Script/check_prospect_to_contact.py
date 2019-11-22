#! /usr/bin/env python
import datetime
import json
import os
import psycopg2
from functions import get_env, query_to_array

get_env('database_credentials.env')
connection = psycopg2.connect(database=os.getenv('DB_NAME'),
                              user=os.getenv('DB_USER'),
                              password=os.getenv('DB_USER_PASSWORD'),
                              host=os.getenv('DB_HOST'),
                              port=os.getenv('DB_PORT'))

query = '''SELECT * FROM prospects WHERE last_contact 
        < CURRENT_DATE - INTERVAL '1 month' AND is_customer = 0 ORDER BY id'''


customers_to_contact = []
query_to_array(connection, customers_to_contact, query)


length = len(customers_to_contact)
for i in range(0, length):
    customers_json = json.dumps(customers_to_contact[i], default=str)
    with open("../src/main/webapp/WEB-INF/prospects_output.json", "w") as f:
        json.dump(customers_json, f)



