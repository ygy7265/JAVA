#실습 4-1
CREATE DATABASE `BookStore`;
CREATE USER 'admin11'@'%'IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON `BookStore`.* TO 'admin'@'%';
FLUSH PRIVILEGES;

#실습 4-2
CREATE TABLE `Customer`(
	`custId` int auto_increment not null PRIMARY key,
	`name` VARCHAR(10) NOT null,
	`address`VARCHAR(20) DEFAULT null,
	`phone` VARCHAR(13) DEFAULT null
);
CREATE TABLE `Book`(
	`bookId` INT NOT NULL PRIMARY key,
	`bookName` VARCHAR(20) NOT null,
	`publisher` VARCHAR(20) NOT null,
	`price` INT DEFAULT null
);
CREATE TABLE `Order`(
	`orderId` int auto_increment not null PRIMARY key,
	`custid` INT NOT NULL ,
	`bookid`INT NOT null,
	`salePrice` INT NOT NULL,
	`orderDate` DATE NOT null
);
#실습 4-3
INSERT INTO `Customer`(`name`,`address`,`phone`) VALUES ('박지성','영국 맨체서타','000-5000-0001');
INSERT INTO `Customer`(`name`,`address`,`phone`) VALUES ('김연아','대한민국 서울','000-6000-0001');
INSERT INTO `Customer`(`name`,`address`,`phone`) VALUES ('장미란','대한민국 강원도','000-7000-0001');
INSERT INTO `Customer`(`name`,`address`,`phone`) VALUES ('추신수','미국 클리블랜드','000-8000-0001');
INSERT INTO `Customer`(`name`,`address`,`phone`) VALUES ('박세리','대한민국 대전',NULL);

INSERT INTO `Book` VALUES(1,'축구의역사','굿스포츠',7000);
INSERT INTO `Book` VALUES(2,'축구아는여자','나무수',13000);
INSERT INTO `Book` VALUES(3,'축구의의해','대한미디어',22000);
INSERT INTO `Book` VALUES(4,'골프 바이블','대한미디어',35000);
INSERT INTO `Book` VALUES(5,'피겨교본','굿스포츠',8000);
INSERT INTO `Book` VALUES(6,'역도 단계별기술','굿스포츠',6000);
INSERT INTO `Book` VALUES(7,'야구의 추억','이상미디어',20000);
INSERT INTO `Book` VALUES(8,'야구를 부탁해','이상미디어',13000);
INSERT INTO `Book` VALUES(9,'올림픽 이야기','삼성당',7500);
INSERT INTO `Book` VALUES(10,'Olympic Champions','Pearson',13000);

INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (1,1,6000,20140701);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (1,3,21000,20140703);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (2,5,8000,20140703);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (3,6,6000,20140704);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (4,7,20000,20140705);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (1,2,12000,20140707);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (4,8,13000,20140707);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (3,10,12000,20140708);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (2,10,7000,20140709);
INSERT INTO `Order`(`custid`,`bookid`,`saleprice`,`orderdate`) VALUES (3,8,13000,20140710);

#실습 4-4
SELECT `custid`,`name`,`address` FROM `customer`;
#실습 4-5
SELECT `bookname`,`price` FROM `book`;
#실습 4-6
SELECT `price`,`bookname` FROM `book`;
#실습 4-7
SELECT `bookid`,`bookname`,`publisher`,`price` FROM `book`;
#실습 4-8
SELECT `publisher` FROM `Book`;
#실습 4-9
SELECT DISTINCT `publisher` FROM `Book`;
#실습 4-10
SELECT * FROM `book` WHERE `price` >= 20000;
#실습 4-11
SELECT * FROM `book` WHERE `price` <= 20000;
#실습 4-12
SELECT * FROM `book` WHERE `price` <= 20000 AND `price` >= 10000;
#실습 4-13
SELECT * FROM `book` WHERE `price` <= 30000 AND `price` >= 15000;
#실습 4- 14
SELECT * FROM `book` WHERE `bookid` = 2 OR`bookid` = 3 OR `bookid` = 5 ;
#실습 4-15
SELECT * FROM `book` WHERE `bookid` % 2 = 0 ;
#실습 4-16
SELECT * FROM `customer` WHERE `name` LIKE '%박%';
#실습 4-17
SELECT * FROM `customer` WHERE `address` LIKE '%대한민국%';
#실습 4-18
SELECT * FROM `customer` WHERE `phone` IS not NULL;
#실습 4-19
SELECT * FROM `book` WHERE `publisher` LIKE '%굿%' OR '%대한%';
#실습 4- 20
SELECT `publisher` FROM `book` WHERE `bookname` LIKE '%축구의역사%';
#실습 4-21
SELECT `publisher` FROM `book` WHERE `bookname` LIKE '%축구%';
#실습 4-22
SELECT * FROM `book` WHERE `bookname` LIKE '%_구%';
#실습 4-23 
SELECT * FROM `book` WHERE `price` >= 20000 AND `bookname` LIKE '%축구%';
#실습 4-24
SELECT * FROM `book` ORDER BY `bookname` ASC;
#실습 4-25
SELECT * FROM `book` ORDER BY `price` ASC ,`bookname` ASC;
#실습 4-26
SELECT * FROM `book` ORDER BY `price` DESC ,`bookname` ASC;
#실습 2-27
SELECT * FROM `book` ORDER BY `price` DESC LIMIT 3;
#실습 4-28
SELECT * FROM `book` ORDER BY `price` ASC LIMIT 3;
#실습 4-29
SELECT SUM(`saleprice`) AS `총판매액` FROM `order`;
#실습 4- 30
SELECT SUM(`saleprice`)AS `총판매액`,AVG(`saleprice`)
AS `평균값`,MIN(`saleprice`) AS 최저가 ,MAX(`saleprice`) AS `최고가` FROM `order`;
#실습 4-31
SELECT COUNT(`bookid`) AS `판매건수`FROM `order` ;
#실습 4- 32
UPDATE `book`
SET `bookname` = '야구'
WHERE `bookname`= '농구';
SELECT * FROM `book`;
#실습 4- 33 - 
SELECT a.`custid`,count(b.`bookid`) AS `수량` FROM `customer` AS a JOIN `order` AS b ON a.custId = b.custid WHERE `salePrice` >= 8000 AND GROUP BY a.custId ;
#실습 4-34 
SELECT * FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid order BY a.`custid` ASC;
#실습 4-35
SELECT * FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid order BY a.`custid` ASC;
#실습 4-36
SELECT `name`,`saleprice` FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid;
#실습 4-37
SELECT `name`,SUM(`saleprice`) FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid GROUP BY a.`custid` order BY SUM(`saleprice`)ASC;
#실습 4-38
SELECT `name`,`bookname` FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid JOIN `book` AS c on b.bookid = c.bookId;
#실습 4-39
SELECT `name`,`bookname` FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid JOIN `book` AS c on b.bookid = c.bookId WHERE `price`= 20000;
#실습 4-40
SELECT `name`,`saleprice` FROM `customer` AS A left JOIN `Order` AS b ON  a.custId = b.custid left JOIN `book` AS c on b.bookid = c.bookId;
#실습 4-41
SELECT sum(`saleprice`) AS `총매출`FROM `customer` AS A JOIN `Order` AS b ON  a.custId = b.custid WHERE `name` = '김연아';
#실습 4-42
SELECT `bookname` FROM `book` order BY `price` DESC LIMIT 1;
#실습 4-43
SELECT `name` FROM `customer` AS A left JOIN `Order` AS b ON  a.custId = b.custid WHERE b.custid IS NULL;
#실습 4-44
INSERT INTO `book`VALUES(11,'스포츠의학','한술의학서적',NULL);
#실습 4-45
UPDATE `customer` SET `address` = '대한민국부산' WHERE `custid`= 5;
#실습 4-46
DELETE FROM `customer` WHERE `custid` = 5;


