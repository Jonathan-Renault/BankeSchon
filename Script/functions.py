def get_env(env_file):
    from pathlib import Path
    from dotenv import load_dotenv
    env_path = Path('.') / env_file
    load_dotenv(dotenv_path=env_path)


def query_to_array(connection, array, query):
    cursor = connection.cursor()
    cursor.execute(query)
    rows = cursor.fetchall()

    for row in rows:
        columns = [desc[0] for desc in cursor.description]
        row = dict(zip(columns, row))
        array.append(row)

