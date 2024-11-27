create database mydbsubject1126;
use mydbsubject1126;

create table product(product
num int unsigned auto_increment,
name varchar(100) not null unique,
price int not null,
primary key(num)
);

#제품명 추가
insert into product(name,price)values('춘배',3000);
#jdbc --> insert into product(name,price)values(?,?);

#제품 전체출력
select*from product;
#jdbc-->select*from product;

# 제품삭제
delete from product where num=1;
#jdbc--> delete from product where num=?;

#특정 제품, 가격 수정
update product set name='수정제품명'where num=1;
update product set price=2000 where num=1;
update product set name='춘배',price=5000 where num=1;
#jdbc-->update product set name=? where num=?;
#       update product set price=? where num=?;
#update product set name=?,price=? where num=?;--> 조건이 여러개

