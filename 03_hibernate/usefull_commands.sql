-- if problem with roles:
-- connect to database as admin (user postgres) and check/apply:

SELECT current_user;

GRANT ALL PRIVILEGES ON DATABASE spring_training TO spring;

SELECT * FROM information_schema.role_table_grants WHERE grantee = 'spring';


-- create user for database

CREATE USER spring WITH PASSWORD 'spring';

GRANT ALL PRIVILEGES ON DATABASE spring_training TO spring;

