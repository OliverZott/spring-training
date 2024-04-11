-- Role: spring
-- DROP ROLE IF EXISTS spring;

CREATE ROLE spring WITH
  LOGIN
  SUPERUSER
  INHERIT
  CREATEDB
  NOCREATEROLE
  NOREPLICATION;


-- Database: spring-training

-- DROP DATABASE IF EXISTS "spring-training";

CREATE DATABASE "spring-training"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_Austria.1252'
    LC_CTYPE = 'English_Austria.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

GRANT TEMPORARY, CONNECT ON DATABASE "spring-training" TO PUBLIC;

GRANT ALL ON DATABASE "spring-training" TO postgres;

GRANT TEMPORARY ON DATABASE "spring-training" TO spring;

-- GRANT ALL ON DATABASE "spring-training" TO spring;