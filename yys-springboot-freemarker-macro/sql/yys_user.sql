/*
Navicat MySQL Data Transfer

Source Server         : yys
Source Server Version : 50728
Source Host           : 127.0.0.1:3306
Source Database       : yys_springboot_jdbc

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2019-12-10 22:47:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yys_user
-- ----------------------------
DROP TABLE IF EXISTS `yys_user`;
CREATE TABLE `yys_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT 'ID，自增列',
  `user_name` varchar(32) NOT NULL COMMENT '用户名',
  `age` int(11) NOT NULL COMMENT '用户年龄',
  `status` tinyint(2) NOT NULL DEFAULT '1' COMMENT '状态：-1-删除；1-正常；',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

INSERT INTO `yys_user` (`id`, `user_name`, `age`, `status`, `create_time`, `update_time`) VALUES ('1', 'yys', '18', '1', NOW(), NOW());
INSERT INTO `yys_user` (`id`, `user_name`, `age`, `status`, `create_time`, `update_time`) VALUES ('2', '洞人', '23', '1', NOW(), NOW());

-- ----------------------------
-- Records of yys_user
-- ----------------------------
