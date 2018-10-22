/*
Navicat MySQL Data Transfer

Source Server         : 本地开发库(密码123456)
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : stock

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-10-22 15:22:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sina_stock_trade
-- ----------------------------
DROP TABLE IF EXISTS `sina_stock_trade`;
CREATE TABLE `sina_stock_trade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `stock_num` varchar(20) NOT NULL,
  `short_stock_name` varchar(30) NOT NULL,
  `old_stock_name` varchar(255) DEFAULT NULL,
  `full_stock_name` varchar(255) DEFAULT NULL,
  `register_place` varchar(255) DEFAULT NULL,
  `up_date` datetime DEFAULT NULL,
  `remarks` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22257 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sina_stock_trade
-- ----------------------------
INSERT INTO `sina_stock_trade` VALUES ('11', '600077', '宋都股份', null, '宋都基业股份有限公司', '杭州', '2018-07-30 10:43:53', '从15年3、4月份购买');
INSERT INTO `sina_stock_trade` VALUES ('22', '002024', '苏宁易购', null, null, '北京', '2018-08-10 09:45:45', null);
INSERT INTO `sina_stock_trade` VALUES ('33', '000090', '天健集团', null, '深圳市天健水务地产有限责任公司', null, null, '15年7月购买过');
INSERT INTO `sina_stock_trade` VALUES ('22256', '002274', '华昌化工', '张家港市化肥厂', '江苏华昌化工股份有限公司\r\n', '江苏张家港', '2018-08-01 09:07:28', '2016年后频繁操作，亏损巨大');
