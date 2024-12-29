/*
 Navicat Premium Data Transfer

 Source Server         : RDS
 Source Server Type    : MySQL
 Source Server Version : 80036 (8.0.36)
 Source Host           : rm-bp15uvu71084pz96soo.mysql.rds.aliyuncs.com:3306
 Source Schema         : dev

 Target Server Type    : MySQL
 Target Server Version : 80036 (8.0.36)
 File Encoding         : 65001

 Date: 29/12/2024 12:54:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for meetroom_admin
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_admin`;
CREATE TABLE `meetroom_admin`  (
  `ADMIN_ID` int NOT NULL AUTO_INCREMENT,
  `ADMIN_NAME` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ADMIN_PASSWORD` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ADMIN_DESC` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ADMIN_PHONE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ADMIN_LOGIN_CNT` int NOT NULL DEFAULT 0,
  `ADMIN_TYPE` int NOT NULL DEFAULT 0,
  `ADMIN_STATUS` int NOT NULL DEFAULT 1,
  `ADMIN_LOGIN_TIME` bigint NOT NULL DEFAULT 0,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`ADMIN_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

INSERT INTO `meetroom_admin` VALUES (1, 'admin', 'e10adc3949ba59abbe56e057f20f883e', 'admin', NULL, 1, 1, 1, 1735302901541, 0, 1734786380484);

-- ----------------------------
-- Table structure for meetroom_fav
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_fav`;
CREATE TABLE `meetroom_fav`  (
  `FAV_ID` int NOT NULL AUTO_INCREMENT,
  `FAV_USER_ID` int NOT NULL DEFAULT 0,
  `FAV_TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `FAV_TYPE` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `FAV_OID` int NOT NULL DEFAULT 0,
  `FAV_PATH` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`FAV_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for meetroom_meet
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_meet`;
CREATE TABLE `meetroom_meet`  (
  `MEET_ID` int NOT NULL AUTO_INCREMENT,
  `MEET_TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_CATE_ID` int NOT NULL DEFAULT 0,
  `MEET_CATE_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `MEET_STATUS` int NOT NULL DEFAULT 1,
  `MEET_ORDER` int NOT NULL DEFAULT 9999,
  `MEET_VOUCH` int NOT NULL DEFAULT 0,
  `MEET_DAYS` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_VIEW_CNT` int NOT NULL DEFAULT 0,
  `MEET_MAX_CNT` int NOT NULL DEFAULT 0,
  `MEET_FORMS` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_OBJ` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`MEET_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for meetroom_meet_join
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_meet_join`;
CREATE TABLE `meetroom_meet_join`  (
  `MEET_JOIN_ID` int NOT NULL AUTO_INCREMENT,
  `MEET_JOIN_USER_ID` int NOT NULL DEFAULT 0,
  `MEET_JOIN_MEET_ID` int NOT NULL DEFAULT 0,
  `MEET_JOIN_CODE` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_JOIN_IS_CHECK` int NOT NULL DEFAULT 0,
  `MEET_JOIN_CHECK_TIME` bigint NOT NULL DEFAULT 0,
  `MEET_JOIN_FORMS` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_JOIN_OBJ` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_JOIN_STATUS` int NOT NULL DEFAULT 0,
  `MEET_JOIN_TIME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_JOIN_DAY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `MEET_JOIN_MEET_TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`MEET_JOIN_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11193 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for meetroom_news
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_news`;
CREATE TABLE `meetroom_news`  (
  `NEWS_ID` int NOT NULL AUTO_INCREMENT,
  `NEWS_TITLE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `NEWS_CATE_ID` int NOT NULL DEFAULT 0,
  `NEWS_CATE_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NEWS_STATUS` int NOT NULL DEFAULT 1,
  `NEWS_ORDER` int NOT NULL DEFAULT 9999,
  `NEWS_VOUCH` int NOT NULL DEFAULT 0,
  `NEWS_CONTENT` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `NEWS_VIEW_CNT` int NOT NULL DEFAULT 0,
  `NEWS_PIC` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `NEWS_OBJ` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `NEWS_FORMS` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`NEWS_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 66 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for meetroom_setup
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_setup`;
CREATE TABLE `meetroom_setup`  (
  `SETUP_ID` int NOT NULL AUTO_INCREMENT,
  `SETUP_TYPE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `SETUP_KEY` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `SETUP_VALUE` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`SETUP_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for meetroom_user
-- ----------------------------
DROP TABLE IF EXISTS `meetroom_user`;
CREATE TABLE `meetroom_user`  (
  `USER_ID` int NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `USER_ACCOUNT` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `USER_STATUS` int NOT NULL DEFAULT 1,
  `USER_PASSWORD` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `USER_LOGIN_TIME` bigint NOT NULL DEFAULT 0,
  `USER_LOGIN_CNT` int NOT NULL DEFAULT 0,
  `USER_OBJ` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `USER_FORMS` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  `ADD_TIME` bigint NOT NULL DEFAULT 0,
  `EDIT_TIME` bigint NOT NULL DEFAULT 0,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 116 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
