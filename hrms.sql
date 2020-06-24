/*
 Navicat Premium Data Transfer

 Source Server         : guoren
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : hrms

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 24/06/2020 16:50:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `dept_id` int(5) NOT NULL COMMENT '部门编号',
  `dept_name` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `dept_lead` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门负责人',
  `dept_nature` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门性质',
  `dept_membershipFunction` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '隶属关系',
  `dept_rank` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门级别',
  `dept_industryInvolved` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属行业',
  `dept_affiliation` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附属关系',
  `dept_economicType` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经济类型',
  `dept_financialResources` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经费来源',
  `dept_managementModeOfPublicInstitution` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '事业单位管理方式',
  `dept_homeCountry` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门所在国家',
  `dept_homeCity` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门所在地',
  `dept_address` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门地址',
  `dept_postalCode` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮政编码',
  `dept_phoneNumber` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门电话号码',
  `dept_faxNumber` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门传真号',
  `dept_parent_id` int(5) NOT NULL COMMENT '上级部门编号',
  `dept_state` int(1) NOT NULL COMMENT '部门状态：1-存在 0-删除',
  PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '辽阳市人民医院', '部门负责人', '部门性质', '隶属关系', '单位级别', '所属行业', '附属关系', '经济类型', '部门经费来源', '事业单位管理方式', '部门所在国家', '部门所在地', '部门地址', '邮政编码', '部门电话号码', '部门传真号', 0, 1);
INSERT INTO `department` VALUES (2, '医师科', '阿萨德', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 1, 1);
INSERT INTO `department` VALUES (3, '护士科', '阿萨德', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 1, 1);
INSERT INTO `department` VALUES (4, '医生一科', '热天', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 2, 1);
INSERT INTO `department` VALUES (5, '医生二科', '而已', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 2, 1);
INSERT INTO `department` VALUES (6, '护士一科', '第三方', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 3, 1);
INSERT INTO `department` VALUES (7, '护士一科', '冯老师', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 2, 1);
INSERT INTO `department` VALUES (8, '一生二二科', '暗色', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 5, 1);
INSERT INTO `department` VALUES (9, '医生三科', '撒的', '无性质', '无关系', '无级别', '医疗行业', '无关系', '无类型', '无来源', '无方式', '中国', '沈阳', '浑南区', '555555', '15555555555', '0598-5245686', 2, 1);

-- ----------------------------
-- Table structure for department_indicator
-- ----------------------------
DROP TABLE IF EXISTS `department_indicator`;
CREATE TABLE `department_indicator`  (
  `dept_indicator_id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '科室指标使用-id',
  `dept_indicator_year` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室指标使用-年份',
  `dept_indicator_month` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室指标使用-月份',
  `dept_indicator_bedAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-床位数',
  `dept_indicator_doctorTargetAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-医生目标数',
  `dept_indicator_nurseTargetAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-护士目标数',
  `dept_indicator_otherTargetAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-其它目标数',
  `dept_indicator_targetSum` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-目标总数',
  `dept_indicator_doctorRealityAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-医生实际数',
  `dept_indicator_nurseRealityAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-护士实际数',
  `dept_indicator_otherRealityAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-其它实际数',
  `dept_indicator_realitySum` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-实际总数',
  `dept_indicator_doctorSurplusAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-医生结余数',
  `dept_indicator_nurseSurplusAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-护士结余数',
  `dept_indicator_otherSurplusAmount` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-其它结余数',
  `dept_indicator_surplusSum` int(5) NULL DEFAULT NULL COMMENT '科室指标使用-结余总数',
  `dept_indicator_remarkOne` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室指标使用-备注1',
  `dept_indicator_remarkTwo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科室指标使用-备注2',
  `dept__indicator_state` int(1) NOT NULL COMMENT '科室指标使用状态：1-存在 0-删除',
  `dept__indicator_belongToDeptId` int(5) NOT NULL COMMENT '科室指标使用-所属部门',
  PRIMARY KEY (`dept_indicator_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department_indicator
-- ----------------------------
INSERT INTO `department_indicator` VALUES (1, '2020', '12', 9999, 20, 20, 20, 60, 15, 15, 15, 45, 5, 5, 5, 15, NULL, NULL, 1, 2);
INSERT INTO `department_indicator` VALUES (2, '2020', '5', 8888, 20, 20, 20, 60, 15, 15, 15, 45, 5, 5, 5, 15, NULL, NULL, 1, 2);

-- ----------------------------
-- Table structure for tb_permissions
-- ----------------------------
DROP TABLE IF EXISTS `tb_permissions`;
CREATE TABLE `tb_permissions`  (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_code` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `permission_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`permission_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_permissions
-- ----------------------------
INSERT INTO `tb_permissions` VALUES (1, 'jgsave', '新增机构');
INSERT INTO `tb_permissions` VALUES (2, 'jgdelete', '删除机构');
INSERT INTO `tb_permissions` VALUES (3, 'jgupdata', '修改机构');
INSERT INTO `tb_permissions` VALUES (4, 'jgfind', '查询机构');
INSERT INTO `tb_permissions` VALUES (5, 'rysavue', '新增人员');
INSERT INTO `tb_permissions` VALUES (6, 'rydelete', '删除人员');
INSERT INTO `tb_permissions` VALUES (7, 'ryupdata', '修改人员');
INSERT INTO `tb_permissions` VALUES (8, 'ryfind', '查询人员');

-- ----------------------------
-- Table structure for tb_roles
-- ----------------------------
DROP TABLE IF EXISTS `tb_roles`;
CREATE TABLE `tb_roles`  (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_roles
-- ----------------------------
INSERT INTO `tb_roles` VALUES (1, 'admin');
INSERT INTO `tb_roles` VALUES (2, 'jgmanager');
INSERT INTO `tb_roles` VALUES (3, 'rymanager');
INSERT INTO `tb_roles` VALUES (4, 'rymanager');

-- ----------------------------
-- Table structure for tb_roles_permissions
-- ----------------------------
DROP TABLE IF EXISTS `tb_roles_permissions`;
CREATE TABLE `tb_roles_permissions`  (
  `rid` int(11) NOT NULL,
  `pid` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_roles_permissions
-- ----------------------------
INSERT INTO `tb_roles_permissions` VALUES (2, 1);
INSERT INTO `tb_roles_permissions` VALUES (2, 2);
INSERT INTO `tb_roles_permissions` VALUES (2, 3);
INSERT INTO `tb_roles_permissions` VALUES (2, 4);
INSERT INTO `tb_roles_permissions` VALUES (3, 5);
INSERT INTO `tb_roles_permissions` VALUES (3, 6);
INSERT INTO `tb_roles_permissions` VALUES (3, 7);
INSERT INTO `tb_roles_permissions` VALUES (3, 8);
INSERT INTO `tb_roles_permissions` VALUES (4, 5);
INSERT INTO `tb_roles_permissions` VALUES (4, 6);
INSERT INTO `tb_roles_permissions` VALUES (4, 7);
INSERT INTO `tb_roles_permissions` VALUES (4, 8);

-- ----------------------------
-- Table structure for tb_users
-- ----------------------------
DROP TABLE IF EXISTS `tb_users`;
CREATE TABLE `tb_users`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password_salt` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_users
-- ----------------------------
INSERT INTO `tb_users` VALUES (1, 'zs', '123456', NULL);
INSERT INTO `tb_users` VALUES (2, 'ls', '123456', NULL);
INSERT INTO `tb_users` VALUES (3, 'ww', '123456', NULL);
INSERT INTO `tb_users` VALUES (4, 'zl', '123456', NULL);
INSERT INTO `tb_users` VALUES (7, 'zss', '5655', NULL);

-- ----------------------------
-- Table structure for tb_users_roles
-- ----------------------------
DROP TABLE IF EXISTS `tb_users_roles`;
CREATE TABLE `tb_users_roles`  (
  `uid` int(11) NOT NULL,
  `rid` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_users_roles
-- ----------------------------
INSERT INTO `tb_users_roles` VALUES (1, 1);
INSERT INTO `tb_users_roles` VALUES (2, 2);
INSERT INTO `tb_users_roles` VALUES (3, 3);
INSERT INTO `tb_users_roles` VALUES (4, 4);
INSERT INTO `tb_users_roles` VALUES (5, 5);
INSERT INTO `tb_users_roles` VALUES (1, 2);
INSERT INTO `tb_users_roles` VALUES (1, 3);
INSERT INTO `tb_users_roles` VALUES (1, 4);
INSERT INTO `tb_users_roles` VALUES (1, 5);

SET FOREIGN_KEY_CHECKS = 1;
