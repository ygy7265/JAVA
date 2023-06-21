#날짜 : 2023/06/20
#이름 : 윤경여
#내용 SQL 연습문제

#실습1-1
shopshop

CREATE DATABASE `shop`;
#실습1-2
CREATE TABLE `Customer` (
	`custid` VARCHAR(10) PRIMARY KEY,
	`name` VARCHAR(10)NOT null,
	`hp` CHAR(13),
	`addr` VARCHAR(100),
	`rdate` date
);
CREATE TABLE `Product`(
	`prodNo` INT not null,
	`prodName` VARCHAR(10) NOT null,
	`stock` INT not null DEFAULT 0,
	`price` INT DEFAULT NULL,
	`company` VARCHAR(20) NOT null
);
CREATE TABLE `Order`(
	`orderNo` INT NOT NULL,
	`orderid` VARCHAR(10) NOT NULL,
	`orderProduct` INT NOT NULL,
	`orderCount` INT NOT NULL DEFAULT 1,
	`drderDate` DATETIME NOT null
);
#실습1-3
INSERT INTO `Customer` VALUES('c101','김유신','010-1234-1001','김해시 봉황동',20220101);
INSERT INTO `Customer` VALUES('c102','김춘추','010-1234-1002','경주시 보문동',20220102);
INSERT INTO `Customer` VALUES('c103','장보고','010-1234-1003','완도군 청산면',20220103);
INSERT INTO `Customer` VALUES('c104','강감찬','010-1234-1004','서울시 마포동',20220104);
INSERT INTO `Customer` VALUES('c105','이성계',NULL,null,20220105);
INSERT INTO `Customer` VALUES('c106','정렬','010-1234-1006','경기도 용인시',20220106);
INSERT INTO `Customer` VALUES('c107','허준',null,null,20220107);
INSERT INTO `Customer` VALUES('c108','이순신','010-1234-1008','서울시 영등포구',20220108);
INSERT INTO `Customer` VALUES('c109','송상현','010-1234-1009','부산시 동래구',20220109);
INSERT INTO `Customer` VALUES('c110','정약용','010-1234-1010','경기도 광주시',20220110);

DROP TABLE `Product`;
INSERT INTO `Product` VALUES(1,'새우깡',5000,1500,'농심');
INSERT INTO `Product` VALUES(2,'초코파이',2500,2500,'오리온');
INSERT INTO `Product` VALUES(3,'포카칩',2500,2500,'오리온');
INSERT INTO `Product` VALUES(4,'양파링',2500,2500,'농심');
INSERT INTO `Product` VALUES(5,'죠리퐁',2500,null,'크라운');
INSERT INTO `Product` VALUES(6,'마가렛트',2500,2500,'롯데');
INSERT INTO `Product` VALUES(7,'뿌셔뿌셔',2500,2500,'오뚜기');

INSERT INTO `Order` VALUES(1,'c102',3,2,'2022-07-01 13:15:10');
INSERT INTO `Order` VALUES(2,'c101',4,1,'2022-07-01 14:16:11');
INSERT INTO `Order` VALUES(3,'c108',1,1,'2022-07-01 17:23:18');
INSERT INTO `Order` VALUES(4,'c109',6,5,'2022-07-02 10:46:36');
INSERT INTO `Order` VALUES(5,'c102',2,1,'2022-07-03 09:15:37');
INSERT INTO `Order` VALUES(6,'c101',7,3,'2022-07-03 12:35:12');
INSERT INTO `Order` VALUES(7,'c110',1,2,'2022-07-03 16:55:36');
INSERT INTO `Order` VALUES(8,'c104',2,4,'2022-07-04 14:23:23');
INSERT INTO `Order` VALUES(9,'c102',1,3,'2022-07-04 21:54:34');
INSERT INTO `Order` VALUES(10,'c107',6,1,'2022-07-05 14:21:03');


UPDATE `product` SET `stock` = 3600 WHERE `prodname` = '포카칩';
UPDATE `product` SET `stock` = 1250 WHERE `prodname` = '양파링';
UPDATE `product` SET `stock` = 2200 WHERE `prodname` = '죠리퐁';
UPDATE `product` SET `stock` = 3500 WHERE `prodname` = '마가렛트';
UPDATE `product` SET `stock` = 1650 WHERE `prodname` = '뿌셔뿌셔';
#실습1-4
SELECT * FROM `Customer`;
#실습1-5
SELECT `custid`,`name`,`hp` FROM `Customer`;
#실습1-6
SELECT * FROM `Product`;
#실습1-7
SELECT `company` FROM `Product`;
#실습1-8
SELECT DISTINCT `company` FROM `Product`;
#실습1-9
SELECT `prodname`,`price` FROM `product`;
#실습1-10
SELECT `prodname`,`price`+500 AS `조정단가` FROM `product`;
#실습1-11
SELECT `prodName`,`stock`,`price` FROM `product` WHERE `company`='오리온';
#실습1-12
SELECT `orderProduct`,`ordercount`,`orderdate` FROM `order` WHERE `orderid` = 'c102';
#실습1-13
SELECT `orderproduct`,`ordercount`,`orderdate` FROM `order` WHERE `orderid` = 'c102' AND `ordercount` >= 2;

#실습1-14
SELECT * FROM `product` WHERE `price` <= 2000 AND `price` >= 1000;
#실습1-15
SELECT `custid`,`name`,`hp`,`addr` FROM `customer` WHERE `name` LIKE '%김%';

#실습1-16
SELECT `custid`,`name`,`hp`,`addr` FROM `customer` WHERE CHAR_LENGTH(`name`) = 2;
#실습1-17
SELECT * FROM `customer` WHERE `hp` is NULL;
#실습1-18
SELECT * FROM `customer` WHERE `addr` IS NOT NULL;
#실습1-19
SELECT * FROM `customer` order BY `rdate`DESC;
#실습1-20
SELECT * FROM `Order` WHERE `orderCount` >=3 order BY `ordercount`DESC,`orderproduct` asc;
#실습1-21
SELECT AVG(price)FROM `product`;
#실습1-22
SELECT SUM(`stock`)  AS `재고량합계` FROM `product` WHERE `company`='농심';
#실습1-23
SELECT count(`custid`) AS `고객수` FROM`customer`;
#실습1-24
SELECT COUNT(distinct`company`)AS `제조업체 수` FROM `product`;
#실습1-25
SELECT `orderproduct` AS `주문상품번호`,SUM(`ordercount`) AS `총주문수량`FROM`order` group BY `orderproduct`order BY `orderproduct`asc;
#실습1-26
SELECT `company` AS `제조업체`,COUNT(*)AS`제품수`,MAX(`price`) AS `최고가` FROM `product` GROUP BY `company`order BY`제조업체`;
#실습1-27
SELECT `company`AS`제조업체`,COUNT(*)AS`제품수`,MAX(`price`)AS`최고가` FROM `product` GROUP BY `company` HAVING `제품수`>=2;
#실습1-28
SELECT `orderProduct`,`orderid`,SUM(`ordercount`)AS `총주문수량` FROM `order` GROUP BY `orderproduct`,`orderid`order BY `orderproduct`;
#실습1-29
SELECT `orderid`,`prodname`,FROM `order` AS a JOIN `product` AS b ON a.orderProduct=b.prodNo WHERE `orderid`='c102';
#실습1-30
SELECT `orderid`,`name`,`prodname`,`orderdate`FROM `order` AS a JOIN `customer` AS b ON a.orderid = b.custid JOIN `product` AS c ON a.orderProduct = c.prodNo
WHERE SUBSTR(`orderdate`,1,10) = '2022-07-03'; 
