create database crudbudget;

create table expense (
	expense_id int auto_increment,
	name varchar(30) not null,
	description varchar(200),
	category_id int not null,
	amount decimal(13,2) not null,
	created_date timestamp not null,
	modified_date timestamp,
	primary key (expense_id)
);

alter table expense 
add foreign key (category_id) references category(category_id)
;

insert into category
(name, description, created_date, modified_date)
values
('catest','destes',curdate(), curdate())
;

insert into expense 
(name, description, category_id, amount, created_date, modified_date)
values
('testing','testingtest',1,50000, curdate(), curdate())
;

create table income (
	income_id int auto_increment,
	name varchar(30) not null,
	description varchar(200),
	category_id int not null,
	amount decimal(13,2),
	created_date timestamp,
	modified_date timestamp,
	primary key (income_id)
);

create table category (
	category_id int auto_increment,
	name varchar(30) not null,
	description varchar(200),
	created_date timestamp,
	modified_date timestamp,
	primary key (category_id)
);

create table user (
	user_id int auto_increment,
    username varchar(30),
    password varchar(32),
    role varchar(10),
    created_date timestamp,
    modified_date timestamp,
    primary key (user_id)
);

	