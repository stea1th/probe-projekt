drop table if exists tbl_employee;

-- create sequence employee_id_seq;

create table tbl_employee
(
    id int auto_increment primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(100) not null unique
)
