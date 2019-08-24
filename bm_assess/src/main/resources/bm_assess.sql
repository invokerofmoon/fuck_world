/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50621
 Source Host           : localhost:3306
 Source Schema         : bm_assess

 Target Server Type    : MySQL
 Target Server Version : 50621
 File Encoding         : 65001

 Date: 24/08/2019 22:29:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for describe_and_score
-- ----------------------------
DROP TABLE IF EXISTS `describe_and_score`;
CREATE TABLE `describe_and_score`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `describe_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `score` int(11) NULL DEFAULT NULL,
  `item_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 54 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of describe_and_score
-- ----------------------------
INSERT INTO `describe_and_score` VALUES (1, '运行良好，极少出现bug', 4, 2);
INSERT INTO `describe_and_score` VALUES (2, '线上运行良好，尚未发现bug', 5, 2);
INSERT INTO `describe_and_score` VALUES (3, '运行良好，尚未出现重大bug', 4, 2);
INSERT INTO `describe_and_score` VALUES (4, '运行良好，未出现性能问题', 5, 4);
INSERT INTO `describe_and_score` VALUES (5, '线上运行良好，尚未发现性能问题', 5, 4);
INSERT INTO `describe_and_score` VALUES (6, '功能完善，性能基本达标', 4, 4);
INSERT INTO `describe_and_score` VALUES (7, '能实现功能，系统偶发卡顿', 3, 4);
INSERT INTO `describe_and_score` VALUES (8, '代码书写规范，注释清晰，可读性强', 5, 5);
INSERT INTO `describe_and_score` VALUES (9, '代码注释合理，语义清晰规范', 5, 5);
INSERT INTO `describe_and_score` VALUES (10, '代码风格清晰简约，十分优雅', 5, 5);
INSERT INTO `describe_and_score` VALUES (11, '关键代码有注释，冗余较少', 4, 5);
INSERT INTO `describe_and_score` VALUES (12, '代码冗余较多，仍需优化', 3, 5);
INSERT INTO `describe_and_score` VALUES (13, '文档书写规范，思路清晰', 5, 6);
INSERT INTO `describe_and_score` VALUES (14, '没有输出文档', 4, 6);
INSERT INTO `describe_and_score` VALUES (15, '按客户要求，认真书写文档', 5, 6);
INSERT INTO `describe_and_score` VALUES (16, '工作完成情况完成率达90%', 18, 7);
INSERT INTO `describe_and_score` VALUES (17, '工作完成情况完成率达92%', 18, 7);
INSERT INTO `describe_and_score` VALUES (18, '工作完成情况完成率达95%', 5, 7);
INSERT INTO `describe_and_score` VALUES (19, '工作完成情况完成率达95%', 19, 7);
INSERT INTO `describe_and_score` VALUES (20, '专业知识有一定广度和深度，但理论实际结合的经验不足。', 3, 8);
INSERT INTO `describe_and_score` VALUES (21, '本专业知识扎实，接受新技术较快，在实际工作中运用合理。', 4, 8);
INSERT INTO `describe_and_score` VALUES (22, '专业知识能够满足客户需求', 4, 8);
INSERT INTO `describe_and_score` VALUES (23, '具备全面的知识，能运用自如', 5, 8);
INSERT INTO `describe_and_score` VALUES (24, '具有较强的专业知识，能够满足开发工作', 4, 8);
INSERT INTO `describe_and_score` VALUES (25, '能及时发现问题，对一般问题能作出决断', 3, 9);
INSERT INTO `describe_and_score` VALUES (26, '发现问题及时，处理问题能力较强', 4, 9);
INSERT INTO `describe_and_score` VALUES (27, '能及早发现问题，解决问题，且不出现差错', 5, 9);
INSERT INTO `describe_and_score` VALUES (28, '具有良好的发现问题，解决问题能力', 4, 9);
INSERT INTO `describe_and_score` VALUES (29, '准确定位问题，无较大失误', 3, 10);
INSERT INTO `describe_and_score` VALUES (30, '能够较好的分析定位问题', 3, 10);
INSERT INTO `describe_and_score` VALUES (31, '定位问题能力较强，无判断失误', 4, 10);
INSERT INTO `describe_and_score` VALUES (32, '分析问题全面，逻辑性强，判断准确', 5, 10);
INSERT INTO `describe_and_score` VALUES (33, '能够全面分析问题，快速定位', 5, 10);
INSERT INTO `describe_and_score` VALUES (34, '责任心较强，清楚地知道自己的责任，并勇于作为', 3, 11);
INSERT INTO `describe_and_score` VALUES (35, '对工作有强烈责任心，能够主动担责', 4, 11);
INSERT INTO `describe_and_score` VALUES (36, '具有较强责任心，能按计划完成工作', 3, 11);
INSERT INTO `describe_and_score` VALUES (37, '责任心较强，按照计划配合工作进行', 3, 11);
INSERT INTO `describe_and_score` VALUES (38, '面对问题和困难，能主动寻找帮助并基本完成任务', 2, 12);
INSERT INTO `describe_and_score` VALUES (39, '不知疲倦，不断进取，对工作不挑不拣，积极主动找到解决方法并较好完成任务', 3, 12);
INSERT INTO `describe_and_score` VALUES (40, '积极主动找到解决方法，工作完成情况较好', 3, 12);
INSERT INTO `describe_and_score` VALUES (41, '较强的合作意识，理解团队目标，乐意为团队目标的实现做贡献', 3, 13);
INSERT INTO `describe_and_score` VALUES (42, '能够主动分担，帮助同事解决问题', 2, 13);
INSERT INTO `describe_and_score` VALUES (43, '只考虑本职工作，对团队的其他事情贡献较少', 1, 13);
INSERT INTO `describe_and_score` VALUES (44, '能服从项目组新技术，并能尝试改进自己的工作', 5, 14);
INSERT INTO `describe_and_score` VALUES (47, '有一定的创新意识，能服从项目组新技术，并能尝试改进自己的工作', 7, 14);
INSERT INTO `describe_and_score` VALUES (45, '能够被动参加新技术的学习，但不愿主动应用新工具，工作中较为保守', 3, 14);
INSERT INTO `describe_and_score` VALUES (46, '有一定的创新意识，能服从项目组新技术的学习、应用', 6, 14);
INSERT INTO `describe_and_score` VALUES (48, '积极主动研究新技术，积极用于改进自己的工作，并有一定成效', 8, 14);
INSERT INTO `describe_and_score` VALUES (49, '积极主动研究新工具，改进自己的工作，并提高了工作效率', 8, 14);
INSERT INTO `describe_and_score` VALUES (50, '能够主动掌握灵活运用各种技术，工作中提出独特见解', 8, 14);
INSERT INTO `describe_and_score` VALUES (51, '组织纪律性较强，自觉遵守各项规章制度，每季度或一个考核周期内无违反工作纪律情况', 8, 15);
INSERT INTO `describe_and_score` VALUES (52, '具有良好的组织纪律性，无违反工作纪律情况', 7, 15);
INSERT INTO `describe_and_score` VALUES (53, '组织纪律性较强，能够自觉遵守各项规章制度，无违纪情况', 8, 15);

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = MyISAM CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);

-- ----------------------------
-- Table structure for scoring_item
-- ----------------------------
DROP TABLE IF EXISTS `scoring_item`;
CREATE TABLE `scoring_item`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of scoring_item
-- ----------------------------
INSERT INTO `scoring_item` VALUES (1, '考勤');
INSERT INTO `scoring_item` VALUES (2, '代码bug率');
INSERT INTO `scoring_item` VALUES (4, '代码执行效率');
INSERT INTO `scoring_item` VALUES (5, '代码可读性');
INSERT INTO `scoring_item` VALUES (6, '文档质量');
INSERT INTO `scoring_item` VALUES (7, '工作完成情况');
INSERT INTO `scoring_item` VALUES (8, '专业知识');
INSERT INTO `scoring_item` VALUES (9, '发现解决问题能力');
INSERT INTO `scoring_item` VALUES (10, '分析判断能力');
INSERT INTO `scoring_item` VALUES (11, '责任心');
INSERT INTO `scoring_item` VALUES (12, '积极性');
INSERT INTO `scoring_item` VALUES (13, '协作精神');
INSERT INTO `scoring_item` VALUES (14, '创新能力');
INSERT INTO `scoring_item` VALUES (15, '遵章守纪');

SET FOREIGN_KEY_CHECKS = 1;
