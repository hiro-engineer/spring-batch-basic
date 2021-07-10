create database testdb ENCODING = 'UTF8';

\c testdb;

CREATE TABLE people (
  first_name varchar(20),
  last_name varchar(20)
);

INSERT INTO people (first_name, last_name) VALUES ('taro', 'tanaka');
INSERT INTO people (first_name, last_name) VALUES ('hanako', 'suzuki');