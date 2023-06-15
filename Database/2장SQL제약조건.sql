#날짜 : 2023/06/15
#이름 : 윤경엽
#내용 : 2장 테이블 제약조건

#실습2-1
create table `user2`(
	`uid` varchar(10)primary key,
    `name` varchar(10),
    `hp` char(13),
    `age` int
    );

#실습 2-2
insert into `user2` values('A101','김유신','010-1234-1111',23);
insert into `user2` values('A102','김춘추','010-1234-1112',21);
insert into `user2` values('A103','장보고','010-1234-1113',24);
insert into `user2` values('A104','박혁거세','010-1234-1111',23);
insert into `user2` values('A105','이순신','010-1234-1111',23);

#실습2-3
create table `user3`(
	`uid` varchar(10)primary key,
    `name` varchar(10),
    `hp` char(13)unique,
    `age`int
    );
#실습2-4
insert into `user3` values('A101','김유신','010-8270-7265',24);
insert into `user3` (`uin`,`name`,`hp`,`age`)values('A102','김유신','010-8820-7265',24);
insert into `user3` set `uid` = 'A103',`name` = '강감찬',`hp`='010-1234-1001',`age`=25;
insert into `user3` values('A104','강감찬','010-1234-1001',41);
insert into `user3` values('A105','이순신','010-1232-2142',42);

#실습2-5
create table `parent`(
	`pid` varchar(10) primary key,
    `name` varchar(10),
    `hp` char(13)unique
    );
create table `child`(
	`cid` varchar(10) primary key,
    `name` varchar(10),
    `hp` char(13)unique,
    `pid` varchar(10),
    foreign key(`pid`)references`parent`(`pid`)
    );
#실습 2-6
    insert into `parent` values('p101','홍길동','010-1234-1001');
    insert into `parent` values('p102','임꺾정','010-1234-1002');
    insert into `parent` values('p103','이성계','010-123-1003');

	insert into `child` values('c101','홍깅남','010-1234-2001','p101');
	insert into `child` values('c102','임철수','010-1234-2002','p102');
	insert into `child` values('c103','이방원','010-1234-2003','p103');
    
#실습 2-7
create table `user4`(
	`seq` int auto_increment primary key,
	`name` varchar(10),
	`gender`tinyint,
	`age`int,
	`addr`varchar(255)
    );
#실습2-8
    insert into `user4` (`name`,`gender`,`age`,`addr`)values('김유신',1,'23','김해시');
    
#실습 2-9
create table `user5`(
	`name` varchar(10)not null, #빈공간이면 삽입안됨.
	`gender` tinyint,
	`age` int default 1,
	`addr` varchar(10)
    );
#실습 2-10 
insert into `user5` values('김유신',1,23,'김해시');
insert into `user5` (`name`,`addr`)values('김춘추','경주시');
insert into `user5` set `name`= '신사임당',`gender` = 2,`addr` = '강릉시';

#실습 2-11
alter table `user5` add `hp` varchar(20); #테이블 추가user5
alter table `user5` add `birth` char(10) default '0000-00-00' after `name`;

#실습 2-12
alter table `user5` modify `hp` char(13);#자료형수정
alter table `user5` modify `age` tinyint;

#실습 2-13
alter table `user5` change column `addr` `address` varchar(10);

#실습 2-14
alter table  `user5` drop `gender`;

#실습 2-15
create table `user6` like `user5`; # 데이터 뺴고 테이블만 복사 

#실습 2-16
insert into `user6` select * from `user5`;




    
	