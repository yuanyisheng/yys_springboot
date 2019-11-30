/*
Navicat MySQL Data Transfer

Source Server         : yys
Source Server Version : 50728
Source Host           : 127.0.0.1:3306
Source Database       : yys_order

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-11-30 15:56:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'ID，自增列',
  `amount` double(11,2) NOT NULL COMMENT '订单金额',
  `address` varchar(32) NOT NULL COMMENT '地址',
  `status` tinyint(2) NOT NULL DEFAULT '1' COMMENT '状态：-1-删除；1-正常；',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
