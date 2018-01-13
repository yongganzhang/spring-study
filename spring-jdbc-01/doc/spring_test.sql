/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : spring_test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-01-13 13:59:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `stuid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('1', '1', 'zs', '数学', '89');
INSERT INTO `test` VALUES ('2', '1', 'zs', '语文', '80');
INSERT INTO `test` VALUES ('3', '1', 'zs', '英语', '70');
INSERT INTO `test` VALUES ('4', '2', 'ls', '数学', '90');
INSERT INTO `test` VALUES ('5', '2', 'ls', '语文', '70');
INSERT INTO `test` VALUES ('6', '2', 'ls', '英语', '80');

-- ----------------------------
-- Table structure for test01
-- ----------------------------
DROP TABLE IF EXISTS `test01`;
CREATE TABLE `test01` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test01
-- ----------------------------

-- ----------------------------
-- Table structure for yg_customer
-- ----------------------------
DROP TABLE IF EXISTS `yg_customer`;
CREATE TABLE `yg_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_balance` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of yg_customer
-- ----------------------------
INSERT INTO `yg_customer` VALUES ('1', 'yonggan', '500');
INSERT INTO `yg_customer` VALUES ('2', 'zhaoliying', '900.0');
INSERT INTO `yg_customer` VALUES ('3', 'yongganok', '500000');

-- ----------------------------
-- Table structure for yg_goods
-- ----------------------------
DROP TABLE IF EXISTS `yg_goods`;
CREATE TABLE `yg_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) DEFAULT NULL,
  `goods_price` decimal(10,2) DEFAULT NULL,
  `goods_stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of yg_goods
-- ----------------------------
INSERT INTO `yg_goods` VALUES ('1', 'spring', '44.50', '0');
INSERT INTO `yg_goods` VALUES ('2', 'netty', '59.90', '12');
INSERT INTO `yg_goods` VALUES ('4', 'web', '2.01', '10');
