#날짜 2023/06/16
#이름 : 윤경엽
#내용 : 1장_SQL기초

#실습 1-1
CREATE DATABASE `UserDB`;


DROP DATABASE `UserDB`;


#실습 1-2
CREATE TABLE `User1`(
 `uid` VARCHAR(10),
 `name` VARCHAR(10),
 `hp` CHAR(13),
 `age` int
 );
 
 DROP TABLE `User1`;
 
 #실습 1-3
INSERT INTO `User1` VALUES('A101','김유신','010-1234-1111',26);
INSERT INTO `User1` VALUES('A102','김춘추','010-1234-1111',26);
INSERT INTO `User1` VALUES('A103','장보고','010-1234-1111',26);
INSERT INTO `User1` (`uid`,`name`,`age`)VALUES('A104','강감찬',45);
INSERT INTO `User1` SET `uid`='A105',`name`='이순신',`hp`='010-1234-5555';

#실습 1-4
SELECT * FROM `User1`;
SELECT * FROM `User1` WHERE `uid` = 'A101';
SELECT * FROM `User1` WHERE `name` = '김춘추';
SELECT * FROM `User1` WHERE `age` <30;
SELECT * FROM `User1` WHERE `age` >=30;
SELECT `uid`,`name`,`age` FROM `User1;


#실습 1-5
UPDATE `User1` SET `hp` = '010-1234-4444' WHERE `uid` = 'A104';
UPDATE `User1` SET `age` = 52 WHERE `uid`='A105';
UPDATE `User1` SET `hp` = '010-1234-1001',`age`=27 WHERE `uid`='A101';

#실습 1-6
DELETE FROM `User1` WHERE `uid` = 'A101';
DELETE FROM `User1` WHERE `uid`='A102'AND`age`=25;
DELETE FROM `User1` WHERE `age`>=30;


#실습 1-7
CREATE Table`TblUser`(
	`userid`  VARCHAR(10),
	`username`  VARCHAR(10),
	`userHp`  CHAR(13),
	`userAge`  TINYINT,
	`userAddr` VARCHAR(20)
);
CREATE TABLE `TblProduct` (
	`prdCode` INT,
	`prdName` VARCHAR(10),
	`prdPrice` INT,
	`prdAmount` INT,
	`prdCompany` VARCHAR(10),
	`prdMakeDate` date
);

DESC `TblUser`;

ALTER TABLE `TblUser` ALTER COLUMN `userHp` CHAR(13);
INSERT INTO `TblUser` VALUES('p101','김유신','010-1234-1002',25,'서울시 중구');
INSERT INTO `TblUser` VALUES('p102','김춘추','010-1234-1002',23,'부산시 금정구');
INSERT INTO `TblUser` VALUES('p103','장보고',NULL,25,'경기도광주군');
INSERT INTO `TblUser` VALUES('p104','강감찬',NULL,NULL,'서울시 중구');
INSERT INTO `TblUser` VALUES('p105','이순신','010-1234-1005',50,NULL);

INSERT INTO `TblProduct` VALUES(1,'냉장고',800,10,'LG',20220106);
INSERT INTO `TblProduct` VALUES(2,'노트북',1200,20,'LG',20220106);
INSERT INTO `TblProduct` VALUES(3,'TV',1400,6,'LG',20220106);
INSERT INTO `TblProduct` VALUES(4,'세탁기',1000,8,'LG',20220106);
INSERT INTO `TblProduct` VALUES(5,'컴퓨터',1100,0,NULL,null);
INSERT INTO `TblProduct` VALUES(6,'휴대폰',900,102,'LG',20220106);

#실습 1-9
SELECT * FROM `TblUser`;
SELECT * FROM `useName` FROM `TblUser`;
SELECT `userName`,`userHp` FROM `TblUser`;
SELECT * FROM `TblUser` WHERE `userId`='p102';
SELECT * FROM `TblUser` WHERE `userId`='p194' OR `userId` = 'p105';
SELECT * FROM `TblUser` WHERE `userAddr`='부산시 금정구';
SELECT * FROM `TblUser` WHERE `userAge` > 30;
SELECT * FROM `TblUser` WHERE `userHp` IS NULL;
UPDATE `TblUser` SET `userAge`=42 WHERE `userid`='p104';
UPDATE `TblUser` SET `userAddr`='경남 김해시' WHERE `userid` ='p105';
DELETE FROM `TblUser` WHERE `userid` = 'p103';

SELECT * FROM `TblProduct`;
SELECT `prdName` FROM `TblProduct`;
SELECT `prdName` ,`prdPrice` FROM `TblProduct`;
SELECT * FROM `TblProduct` WHERE `prdCompany` = 'LG';
SELECT * FROM `TblProduct` WHERE `prdcompany` = '삼성';
UPDATE `TblProduct` SET `prdname` = '삼성',`prdMakedate` = '2021-01-01' WHERE `prdcode` = 5;


