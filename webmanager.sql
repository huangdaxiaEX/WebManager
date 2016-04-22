/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : webmanager

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-04-22 21:46:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for crowdfunding
-- ----------------------------
DROP TABLE IF EXISTS `crowdfunding`;
CREATE TABLE `crowdfunding` (
  `doneperson` int(10) DEFAULT NULL,
  `totalperson` int(10) DEFAULT NULL,
  `crowdfundingid` bigint(20) NOT NULL DEFAULT '0',
  `entryid` int(11) DEFAULT NULL,
  `entrytitle` varchar(255) NOT NULL,
  `entrytype` varchar(255) NOT NULL,
  `entryprice` varchar(11) NOT NULL,
  `entrycontent` text NOT NULL,
  `entrystatus` int(11) DEFAULT NULL,
  `doneprice` int(11) DEFAULT NULL,
  `process` double DEFAULT NULL,
  `publisherid` int(11) NOT NULL,
  `publishtime` datetime NOT NULL,
  `deadtime` datetime NOT NULL,
  `image` varchar(50) NOT NULL,
  PRIMARY KEY (`crowdfundingid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of crowdfunding
-- ----------------------------
INSERT INTO `crowdfunding` VALUES (null, null, '1', '998', '我是测试人员', '生物', '10000', '我不是内容', '1', '8888', '88', '10000', '2016-04-17 21:49:02', '2016-04-30 21:49:06', 'edx.jpg,qaz.jpg');
INSERT INTO `crowdfunding` VALUES (null, null, '2', '997', '我是测试的订单', '化学', '9999', '我是内容', '1', '7777', '83', '10000', '2016-04-18 22:05:59', '2016-04-30 22:06:01', 'yhn.jpg,okm.jpg');

-- ----------------------------
-- Table structure for joininfo
-- ----------------------------
DROP TABLE IF EXISTS `joininfo`;
CREATE TABLE `joininfo` (
  `joininfoid` bigint(20) NOT NULL DEFAULT '0',
  `personid` int(11) NOT NULL,
  `jointime` datetime NOT NULL,
  `entryid` int(11) NOT NULL,
  PRIMARY KEY (`joininfoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of joininfo
-- ----------------------------
INSERT INTO `joininfo` VALUES ('1', '10086', '2016-04-18 21:47:29', '998');
INSERT INTO `joininfo` VALUES ('12', '10086', '2016-04-17 22:04:29', '997');

-- ----------------------------
-- Table structure for manage
-- ----------------------------
DROP TABLE IF EXISTS `manage`;
CREATE TABLE `manage` (
  `manageid` bigint(20) NOT NULL DEFAULT '0',
  `imageid` int(11) NOT NULL,
  PRIMARY KEY (`manageid`),
  UNIQUE KEY `manageid` (`manageid`,`imageid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manage
-- ----------------------------

-- ----------------------------
-- Table structure for uesrinfo
-- ----------------------------
DROP TABLE IF EXISTS `uesrinfo`;
CREATE TABLE `uesrinfo` (
  `uesrinfoid` bigint(20) NOT NULL DEFAULT '0',
  `username` varchar(255) NOT NULL,
  `userid` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `leve1` int(11) NOT NULL,
  PRIMARY KEY (`uesrinfoid`),
  UNIQUE KEY `userid` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uesrinfo
-- ----------------------------
