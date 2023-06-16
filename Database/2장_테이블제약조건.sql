#실습 2-1
CREATE TABLE `User2`(
	`uid` VARCHAR(10)PRIMARY KEY,
	`name` VARCHAR(10),
	`hp` CHAR(13),
	`age` int
);
#실습 2-2
INSERT INTO `User2`VALUES('1','윤경엽','010-1234-1111',26);
#실습 2-3
CREATE TABLE `User3`(
	`uid` VARCHAR(10)PRIMARY KEY,
	`name` VARCHAR(10),
	`hp` CHAR(13) UNIQUE,
	`age` int
);

#실습 2-4 
INSERT INTO `User3` VALUES('1','김춘추','010-1234-2222',54);

#실습 2-5
CREATE TABLE `Parent`(
	`pid` VARCHAR(10) PRIMARY KEY,
	`name` VARCHAR(10),
	`hp` CHAR(13)UNIQUE
);
CREATE TABLE `Child`(
	`cid` VARCHAR(10) PRIMARY KEY,
	`name` VARCHAR(10),
	`hp` CHAR(13)UNIQUE,
	`pid` VARCHAR(10),
	FOREIGN KEY (`pid`) REFERENCES `Parent`(`pid`)
);

#실습 2-6
INSERT INTO `Parent`VALUES('1','이순신','010-1234-1111');
INSERT INTO `Child` VALUES('1','이순자','010-1234-2222','1');

#실습 2-7
CREATE TABLE `User4`(
	`seq` INT AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR(10),
	`gender` TINYINT,
	`age` INT,
	`addr` VARCHAR(255)
);

#실습 2-8
INSERT INTO `User4` VALUES(NULL,'윤경엽',1,26,'창원시진해구');

#실습 2-9
CREATE TABLE `User5`(
	`name` VARCHAR(10) NOT NULL,
	`gender` TINYINT,
	`age` INT DEFAULT 1,
	`addr` VARCHAR(10)
);

#실습 2-10
INSERT INTO `User5` VALUES ('이순신',1,NULL,'조선');

#실습 2-11
ALTER TABLE `User5` ADD `hp` VARCHAR(20);
ALTER TABLE `User5` ADD `birth`CHAR(10) DEFAULT '0000-00-00' AFTER `name`;

#실습 2-12
ALTER TABLE `User5` MODIFY `hp` CHAR(13);
ALTER TABLE `User5` MODIFY `age` TINYINT;

#실습 2-13
ALTER TABLE `User5` CHANGE COLUMN `addr` `address` VARCHAR(100);

#실습 2-14
ALTER TABLE `User5` DROP `gender`;

#실습 2-15
CREATE TABLE `User6` LIKE `user5`;

#실습 2-16
INSERT INTO `User6` SELECT * FROM `User5`;