
create database mydb11211;
use mydb11211;

create table 회원테이블(
회원번호pk int unsigned not null auto_increment,
아이디 varchar(10)unique,
비밀번호 varchar(15),
핸드폰번호 char(13),
주소 varchar(50),
primary key(회원번호pk)
);

create table 카테고리(
카테고리번호pk int,
카테고리명 varchar(10),
회원번호fk int unsigned not null auto_increment,
primary key(카테고리번호pk)
);

create table 제품(
제품번호pk int,
제품명 varchar(15),
카테고리번호FK int,
primary key(제품번호pk)
);

create table 주문(
주문번호PK int,
주문날짜 datetime,
제품번호Fk int,
primary key(주문번호번호pk)
);

create table 주문상세(
주문상세정보PK int,
주문수량 int,
제품번호Fk int,
주문번호FK int
);
