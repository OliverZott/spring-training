# Hibernate / JPA

## Setup

- Sql file for postgres:
  - user / pw
  - database
  - sample table
  - `psql -h localhost -U username -d myDataBase -a -f myInsertFile.sql` or
  - in folder with sql scripts: 
    - `psql -U postgres -p 5433` and `\c spring-training` and `\i 01_create_table.sql`
- Console application setup:
  - `CommandLineRunner Bean` in `Application.java`
- set env vars for postgres user:
  - PG_NAME
  - PG_PW
