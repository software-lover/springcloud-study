

drop database if exists cloudDB01;
create database cloudDB01 character set UTF8;
use cloudDB01;
create table dept
(
    deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    dname VARCHAR(60),
    db_source VARCHAR(60)
);

insert into dept(dname, db_source) VALUES ('开发部', database());
insert into dept(dname, db_source) VALUES ('人事部', database());
insert into dept(dname, db_source) VALUES ('财务部', database());
insert into dept(dname, db_source) VALUES ('市场部', database());
insert into dept(dname, db_source) VALUES ('运维部', database());

select * from dept;



drop database if exists cloudDB02;
create database cloudDB02 character set UTF8;
use cloudDB02;
create table dept
(
    deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    dname VARCHAR(60),
    db_source VARCHAR(60)
);

insert into dept(dname, db_source) VALUES ('开发部', database());
insert into dept(dname, db_source) VALUES ('人事部', database());
insert into dept(dname, db_source) VALUES ('财务部', database());
insert into dept(dname, db_source) VALUES ('市场部', database());
insert into dept(dname, db_source) VALUES ('运维部', database());

select * from dept;



drop database if exists cloudDB03;
create database cloudDB03 character set UTF8;
use cloudDB03;
create table dept
(
    deptno BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    dname VARCHAR(60),
    db_source VARCHAR(60)
);

insert into dept(dname, db_source) VALUES ('开发部', database());
insert into dept(dname, db_source) VALUES ('人事部', database());
insert into dept(dname, db_source) VALUES ('财务部', database());
insert into dept(dname, db_source) VALUES ('市场部', database());
insert into dept(dname, db_source) VALUES ('运维部', database());

select * from dept;