drop table if exists tbl_mployee;


create table tbl_employee (
    id bigserial primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(100) not null unique
);


