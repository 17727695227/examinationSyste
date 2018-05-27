/*
Navicat MySQL Data Transfer

Source Server         : ssm
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : exam

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2018-05-27 23:16:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for alldatabase
-- ----------------------------
DROP TABLE IF EXISTS `alldatabase`;
CREATE TABLE `alldatabase` (
  `id` varchar(255) NOT NULL,
  `section` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alldatabase
-- ----------------------------

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
  `id` varchar(255) NOT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `allData_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answer
-- ----------------------------

-- ----------------------------
-- Table structure for blank
-- ----------------------------
DROP TABLE IF EXISTS `blank`;
CREATE TABLE `blank` (
  `id` varchar(255) NOT NULL,
  `section` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blank
-- ----------------------------

-- ----------------------------
-- Table structure for finishdatabase
-- ----------------------------
DROP TABLE IF EXISTS `finishdatabase`;
CREATE TABLE `finishdatabase` (
  `id` varchar(255) NOT NULL,
  `section` varchar(255) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `A` varchar(255) DEFAULT NULL,
  `B` varchar(255) DEFAULT NULL,
  `C` varchar(255) DEFAULT NULL,
  `D` varchar(255) DEFAULT NULL,
  `anwser` varchar(255) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  `torf` varchar(255) DEFAULT NULL,
  `username` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of finishdatabase
-- ----------------------------

-- ----------------------------
-- Table structure for resultdatabase
-- ----------------------------
DROP TABLE IF EXISTS `resultdatabase`;
CREATE TABLE `resultdatabase` (
  `id` varchar(255) NOT NULL,
  `clas` varchar(255) DEFAULT NULL,
  `username` bigint(20) DEFAULT NULL,
  `section` varchar(255) DEFAULT NULL,
  `done` varchar(255) DEFAULT NULL,
  `chooseScore` int(11) DEFAULT NULL,
  `blankScore` int(11) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `stopTime` datetime DEFAULT NULL,
  `useTime` datetime DEFAULT NULL,
  `rightNumber` int(11) DEFAULT NULL,
  `totalScore` int(11) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `student_id` varchar(255) DEFAULT NULL,
  `index_` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resultdatabase
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(255) NOT NULL,
  `username` bigint(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `authority` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `clas` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1234567890', '123456789y', '23', '23', '23', '23', '23', '23', '23');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` varchar(255) NOT NULL,
  `username` bigint(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `clas1` varchar(255) DEFAULT NULL,
  `clas2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
