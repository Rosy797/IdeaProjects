DROP DATABASE IF EXISTS friendlist;
CREATE DATABASE friendlist;
USE friendlist;
CREATE TABLE friend
(
    id int auto_increment primary key not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null
);