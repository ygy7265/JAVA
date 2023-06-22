collegeCREATE DATABASE `College`;
CREATE USER `admin3`@'%'IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON College.* TO 'admin3'@'%';
FLUSH PRIVILEGES;

#실습3-2
CREATE TABLE `Student`(
	`stdNo` VARCHAR(8) not null PRIMARY KEY, 
	`stdName` VARCHAR(20) not NULL,
	`stdHp` VARCHAR(13) not NULL,
	`stdYear` INT not NULL,
	`stdAddress` VARCHAR(100) DEFAULT null
);
CREATE TABLE `Lecture`(
	`lecNo` int not null PRIMARY KEY, 
	`lecName` VARCHAR(20) not NULL,
	`lecCredit` int not NULL,
	`lecTime` INT not NULL,
	`lecClass` VARCHAR(10) DEFAULT null
);
CREATE TABLE `Register`(
	`regStdNo` VARCHAR(8) not NULL, 
	`regLecNo` int not NULL,
	`regMidScore` INT DEFAULT NULL,
	`regFinalScore` int DEFAULT NULL,
	`regTotalScore` VARCHAR(100) DEFAULT NULL,
	`regGrade`TINYINT DEFAULT NULL 
);

#실습3-3
INSERT INTO `student` VALUES('20201016','김유신','010-1234-1001',3,null);
INSERT INTO `student` VALUES('20201126','김춘추','010-1234-1002',3,'경상남도 경주시');
INSERT INTO `student` VALUES('20210216','장보고','010-1234-1003',2,'전라남도 완도시');
INSERT INTO `student` VALUES('20210326','강감찬','010-1234-1004',2,'서울시영등포구');
INSERT INTO `student` VALUES('20221416','이순신','010-1234-1005',1,'부산시부산진구');
INSERT INTO `student` VALUES('20220516','송상현','010-1234-1006',1,'부산시동래구');

INSERT INTO `Lecture` VALUES(159,'인지행동심리학',3,40,'본304');
INSERT INTO `Lecture` VALUES(167,'운영체제론',3,25,'본605');
INSERT INTO `Lecture` VALUES(234,'중급영문법',3,20,'본201');
INSERT INTO `Lecture` VALUES(239,'세법개론',3,40,'본204');
INSERT INTO `Lecture` VALUES(248,'빅데이터개론',3,20,'본601');
INSERT INTO `Lecture` VALUES(253,'컴퓨터사고와 코딩',2,10,'본602');
INSERT INTO `Lecture` VALUES(349,'사회복지 마케팅',2,50,'본301');

INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20201126,234);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20201016,248);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20201016,253);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20201126,239);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20210216,349);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20210326,349);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20201016,167);
INSERT INTO `Register`(`regStdNo`,`regLecNo`)values(20220426,349);

#실습3-4
SELECT * FROM `Lecture`;
#실습3-5
SELECT * FROM `Student`;
#실습3-6
SELECT * FROM `register`;
#실습3-7
SELECT * FROM `Student` WHERE `stdYear` = 3;
#실습3-8
SELECT * FROM `Lecture` WHERE `lecCredit` = 2;
#실습3-9
UPDATE `Register` SET `regMidScore` = 36, `regFinalScore` = 42 WHERE `regStdNo` = '20201126' AND `regLecNo` = 234;
UPDATE `Register` SET `regMidScore` = 24, `regFinalScore` = 62 WHERE `regStdNo` = '20201026' AND `regLecNo` = 238;
UPDATE `Register` SET `regMidScore` = 28, `regFinalScore` = 40 WHERE `regStdNo` = '20201026' AND `regLecNo` = 253;
UPDATE `Register` SET `regMidScore` = 37, `regFinalScore` = 57 WHERE `regStdNo` = '20201126' AND `regLecNo` = 239;
UPDATE `Register` SET `regMidScore` = 28, `regFinalScore` = 68 WHERE `regStdNo` = '20210216' AND `regLecNo` = 349;
UPDATE `Register` SET `regMidScore` = 16, `regFinalScore` = 65 WHERE `regStdNo` = '20210326' AND `regLecNo` = 349;
UPDATE `Register` SET `regMidScore` = 18, `regFinalScore` = 38 WHERE `regStdNo` = '20201026' AND `regLecNo` = 167;
UPDATE `Register` SET `regMidScore` = 25, `regFinalScore` = 58 WHERE `regStdNo` = '20220426' AND `regLecNo` = 349;

SELECT * FROM `Register`;

#실습3-10
UPDATE`Register`SET
`regTotalScore` = `regMidScore` + `regFinalScore`,
`regGrade`= if(`regTotalScore` >= 90,'A',
		 		 if(`regTotalScore` >= 80,'B',
				 if(`regTotalScore` >= 70,'C',
				 if(`regTotalScore` >= 60,'D','F'))));
#실습3-11
SELECT * FROM `register` ORDER BY `regTotalScore` DESC;
#실습3-12
SELECT * FROM `register` WHERE `regLecNo` = 349 ORDER BY `regTotalScore` DESC;
#실습3-13
SELECT * FROM `Lecture` WHERE `lecTime` >= 40;
#실습3-14
SELECT `lecName`,`lecClass` FROM `lecture`;
#실습3-15
SELECT `stdNo`,`stdName` FROM `student`;
#실습3-16
SELECT * FROM `student` WHERE `stdAddress` IS NULL;
#실습3-17
SELECT * FROM `student` WHERE `stdAddress` LIKE '%부산시%';
#실습3-18
SELECT * FROM `student` AS a left join`register` AS b ON a.stdNo = b.regStdNo;
#실습3-19
SELECT 
`stdNo`,
`stdName`,
`regLecNo`,
`regMidScore`,
`regFinalScore`,
`regTotalScore`,
`regGrade`
FROM `student` AS A, `register` AS b WHERE a.stdNo = b.regStdNo;
#실습3-20
SELECT `stdName`,`stdNo`,`regLecNo`
FROM `student` AS a JOIN `register` AS b ON a.stdNo = b.regStdNo WHERE `reglegNo` = 349;
#실습3-21
SELECT `stdNo`,
`stdName`,
COUNT(`stdNo`) AS `수강신청건수`,
SUM(`regTotalScore`) AS `종합점수`,
SUM(`regTotalScore`) / COUNT(`stdNo`) AS `평균`
FROM `student` AS a
JOIN `Register` AS b
ON a.stdNo = b.regStdNo
GROUP BY `stdNo` ORDER BY `종합점수` desc;
#실습3-22
SELECT * FROM `Register` AS a JOIN `lecture` AS b on a.regLecNo = b.lecNo;
#실습3-23
SELECT
`regStdNo`,
`regLecNo`,
`lecName`,
`regMidScore`,
`regFinalScore`,
`regTotalScore`,
`regGrade`
FROM 
`Register` AS a JOIN `lecture` AS b on a.regLecNo = b.lecNo;
#실습3-24
SELECT COUNT(*) AS `사회복지 마케팅 수강 신청건수`,
AVG(`regTotalScore`) AS `사회복지 마케팅 평균`
FROM `Register` AS a JOIN `Lecture` AS b ON a.regLecNo = b.lecNo
WHERE `lecName` LIKE '%사회복지%';
#실습3-25
SELECT
`regStdNo`,
`lecName`
FROM `register` AS a JOIN `Lecture` AS b ON a.regLecNo = b.lecNo WHERE `regGrade` = 'A';
#실습3-26
SELECT * FROM `Student` AS a JOIN `Register` AS b  ON 
a.stdNo = b.regStdNo JOIN `Lecture` AS c ON b.regLecNo = c.lecNo;
#실습3-27
SELECT
`stdNo`,
`stdName`,
`lecNo`,
`lecName`,
`regMidScore`,
`regFinalScore`,
`regTotalScore`,
`regGrade`
FROM `student`  AS a
JOIN `Register` AS b  
ON a.stdNo = b.regStdNo 
JOIN `Lecture`  AS c
ON b.regLecNo = c.lecNo
ORDER BY `regTotalScore` DESC;
#실습3-28
SELECT 
`stdNo`,
`stdName`,
`lecName`,
`regTotalScore`,
`regGrade`
FROM `student` AS a
 JOIN `Register` AS b  ON 
a.stdNo = b.regStdNo JOIN `Lecture` AS c ON b.regLecNo = c.lecNo
where `regGrade` = 'F';

#실습3-29
SELECT
`stdNo`,
`stdName`,
SUM(`lecCredit`) AS `이수학점`
FROM `Student` AS a
 JOIN `Register` AS b  ON 
a.stdNo = b.regStdNo JOIN `Lecture` AS c ON b.regLecNo = c.lecNo
WHERE `regGrade` != 'F'
GROUP BY `stdNo` 
ORDER BY `stdNo` asc;
#실습3-30
SELECT 
`stdNo`,
`stdName`,
GROUP_CONCAT(`lecName`) AS `신청과목`,
GROUP_CONCAT(if(`regTotalScore` >= 60,`lecName`,NULL)) AS `이수과목`
FROM `student` AS a
JOIN `Register` AS b  ON 
a.stdNo = b.regStdNo JOIN `Lecture` AS c ON b.regLecNo = c.lecNo
GROUP BY `stdNo`;