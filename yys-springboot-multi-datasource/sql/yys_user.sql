/*
Navicat MySQL Data Transfer

Source Server         : yys
Source Server Version : 50728
Source Host           : 127.0.0.1:3306
Source Database       : yys_user

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-11-30 15:58:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'ID，自增列',
  `name` varchar(32) NOT NULL COMMENT '用户名',
  `age` int(11) NOT NULL COMMENT '用户年龄',
  `status` tinyint(2) NOT NULL DEFAULT '1' COMMENT '状态：-1-删除；1-正常；',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;
