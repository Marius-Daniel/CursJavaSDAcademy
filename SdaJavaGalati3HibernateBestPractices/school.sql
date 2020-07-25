drop database if exists school; -- comanda asta sterge baza de date daca exista 
create database school; -- creem baza de date 

use school; -- utilizam baza de date

CREATE table students(
id INT PRIMARY KEY  NOT NULL auto_increment,
name  VARCHAR(15) NOT NULL,
first_name varchar(50) NOT NULL
); -- creem tabelul

create table teachers(
id INT  primary key not null auto_increment,
name varchar(15) NOT NULL,
surname varchar(50) NOT NULL,
age int(3) NOT NULL,
subject varchar(50) NOT NULL
); 

alter table students
add year_of_birth INT NOT NULL;
alter table students
add major varchar(20) NOT NULL;
alter table students 
add elective varchar(50);
alter table students
drop column major;

alter table teachers
add tenure TINYINT NOT NULL;

alter table teachers
ADD secondary_subject VARCHAR (20)  NOT NULL;

alter table teachers
ADD group_master VARCHAR(20) NOT NULL;


use school;

insert into students 
(name, first_name, year_of_birth, elective)
values
('George','Vladimir',1984,'fizica');

insert into students
( name, first_name, year_of_birth, elective)
value
('Danaila', 'Ciprian','1995', 'informatica');
insert into students
(name, first_name, year_of_birth, elective)
value
('Ivan', 'Laurentiu','1980', 'matematica');

insert into students
(name, first_name, year_of_birth, elective)
value
('Onofrei', 'Maria','1986', 'informatica');

insert into students
(name, first_name, year_of_birth, elective)
value
('Marin', 'Andreea','1987', 'informatica');


insert into students 
(name, first_name, year_of_birth, elective)
values
('Vasile','Ionela',1985,'fizica');

insert into students
(name, first_name, year_of_birth, elective)
value
('Danaila', 'Amalia','1996', 'muzica');
insert into students
(name, first_name, year_of_birth, elective)
value
('Ivan', 'Florentina','1980', 'matematica');

select * from teachers;

create table if not exists adress(
id int not null auto_increment primary key,
city varchar(50) not null,
street varchar(50) not null
);


delete from students where year_of_birth > 1000;

alter table students
add column adress_id int not null,
add constraint fk_students_adress foreign key(adress_id) references adress(id);

select * from students;

insert into adress(city, street)
values('Galati', 'str Brailei');

insert into adress(city, street)
values('Bucuresti', 'str Galati');

insert into students (name, first_name, year_of_birth, elective, adress_id)
values('Ion', 'Gabriel', 25, 'informatica', 1);

insert into students (name, first_name, year_of_birth, elective, adress_id)
values('Marius', 'Ionescu', 25, 'informatica', 1);


