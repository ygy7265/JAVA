# 날짜 : 2023/06/13
# 이름 : 윤경엽
# 내용 : 1장 SQL 기초

#실습 1-1
create database `userdb`;
#실습 1-2
drop database `userdb`;
create table `usedb`(
	`uid` varchar(10),
	`name`varchar(10),
    `hp`char(13),
    `age` tinyint
);
#실습 1-3
insert into `usedb` values('A101','김유신','010-1234-1111',25);
insert into `usedb` values('A102','김춘추','010-1234-2222',23);
insert into `usedb` values('A103','장보고','010-1234-3333',32);
insert into `usedb` (`uid`,`name`,`age`) values('A104','강감찬',45);
insert into `usedb` set `uid`='A105',`name`='이순신',`hp` = '010-1234-5555';

#실습 1-4
select * from `usedb`;
select * from `usedb` where `uid` = 'A101';
select * from `usedb` where `name` = '김춘추';
select * from `usedb` where `age` < 30;
select * from `usedb` where `age` >= 30;
select `uid`,`name`,`age`from `usedb`;


#실습 1-5
update `usedb` set `hp` = '010-1234-4444'where `name` = '강감찬';
update `usedb` set `age` = 51 where `uid` = 'A105';

#실습 1-6
delete from `usedb` where `uid` = 'A101';
delete from `usedb` where `uid` = 'A102' and `age` = 25;
delete from `usedb` where `age` >= 30;

#실습 1-7
create table `TblUser`(
`userId` varchar(10),
`username` varchar(10),
`useHp` char(13),
`userAge` tinyint,
`userAddr` varchar(20)
);

create table `TblProduct`(
	`prdCode` int,
    `prdName` varchar(10),
    `prdPrice`int,
    `prdAmount`int,
    `prdCompany`varchar(10),
    `prdMarkDate` date
    );
    
#실습 1-8

insert into `TblUser` values('p101','김유신','010-1234-1001',25,'서울시중구');
insert into `TblUser` values('p102','김춘추','010-1234-1002',23,'부산시금정구');
insert into `TblUser` values('p103','장보고','',31,'경기도광주군');
insert into `TblUser` values('p104','강감찬','',null,'경남창원시');
insert into `TblUser` values('p104','강감찬','010-1234-1005',50,'');

insert into `TblProduct` values(1,'냉장고',800,10,'LG',20220106);
insert into `TblProduct` values(2,'노트북',1200,20,'삼성',20220106);
insert into `TblProduct` values(3,'TV',1400,6,'LG',20220106);
insert into `TblProduct` values(4,'세탁기',1000,8,'LG',20220106);
insert into `TblProduct` values(5,'컴퓨터',1100,0,null,null);
insert into `TblProduct` values(6,'휴대폰',900,102,'삼성',20220106);
select * from `TblUser`;
select * from `TblProduct`;

update `TblUser` set `useHp` = null where `userId` = 'p103' or `userId` = 'p104';
update `TblUser` set `username` = '이순신' where `userAge` = 50;
update `TblUser` set `userAddr` = null where `username` = '이순신';
#실습 1-9
select * from `TblUser`;
select `username` from `TblUser`;
select `usename` , `userHp` from `TblUser`;
select * from `TblUser` where `userId` = 'p102';
select * from `TblUser` where `userId` = 'p104' or `userUd` = 'p105';
select * from `TblUser` where `useAddr` = '부산시금정구';
select * from `TbUser` where `useAge` > 30;
select * from `TblUser` where `userHp` is null;
update `TblUser` set `userAge` = 42 where `userId` = 'p104';
update `TblUser` set `userAddr`='경남김해시' where `userId` = 'p105';
delete from `TblUser` where `userId` = 'p103';
delete from `TblProduct` where `prdCode` = 1;

select * from `TblProduct`;

