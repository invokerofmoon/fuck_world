package com.bm.assess.helper;

import com.bm.assess.entity.DescribeAndScore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AssesstorForExcellent extends Assesstor {

    @Override
    public void doAssess() {
        super.setAttendance();
        List<DescribeAndScore> describeAndScoreList = (List<DescribeAndScore>) assessConfigInfo.get("describeAndScoreList");
// TODO       List<ScoringItem> scoringItemList = (List<ScoringItem>) assessConfigInfo.get("scoringItemList");
        DescribeAndScore describeAndScore = null;
//        代码bug率
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(2l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("codeBugRateScore", describeAndScore.getScore());
        this.param.put("codeBugRateMsg", describeAndScore.getDescribeInfo());
//        代码执行效率
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(4l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("codeEfficiencyScore", describeAndScore.getScore());
        this.param.put("codeEfficiencyMsg", describeAndScore.getDescribeInfo());
//        代码可读性
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(5l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("codeReadabilityScore", describeAndScore.getScore());
        this.param.put("codeReadabilityMsg", describeAndScore.getDescribeInfo());
//        文档质量
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(6l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("documentQualityScore", describeAndScore.getScore());
        this.param.put("documentQualityMsg", describeAndScore.getDescribeInfo());
//        工作完成情况
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(7l)&&(des.getScore().equals(19)||des.getScore().equals(18))).collect(Collectors.toList()));
        this.param.put("workFinishScore", describeAndScore.getScore());
        this.param.put("workFinishMsg", describeAndScore.getDescribeInfo());
//        专业知识
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(8l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("knowledgeScore", describeAndScore.getScore());
        this.param.put("knowledgeMsg", describeAndScore.getDescribeInfo());
//        发现解决问题能力
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(9l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("solveProblemScore", describeAndScore.getScore());
        this.param.put("solveProblemMsg", describeAndScore.getDescribeInfo());
//        分析判断能力
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(10l)&&des.getScore().equals(5)).collect(Collectors.toList()));
        this.param.put("analysisScore", describeAndScore.getScore());
        this.param.put("analysisMsg", describeAndScore.getDescribeInfo());
//        责任心
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(11l)).collect(Collectors.toList()));
        this.param.put("responsibilityScore", describeAndScore.getScore());
        this.param.put("responsibilityMsg", describeAndScore.getDescribeInfo());
//        积极性
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(12l)).collect(Collectors.toList()));
        this.param.put("enthusiasmScore", describeAndScore.getScore());
        this.param.put("enthusiasmMsg", describeAndScore.getDescribeInfo());
//        协作精神
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(13l)).collect(Collectors.toList()));
        this.param.put("teamworkScore", describeAndScore.getScore());
        this.param.put("teamworkMsg", describeAndScore.getDescribeInfo());
//        创新能力
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(14l)&&des.getScore().equals(8)).collect(Collectors.toList()));
        this.param.put("innovateScore", describeAndScore.getScore());
        this.param.put("innovateMsg", describeAndScore.getDescribeInfo());
//        遵章守纪
        describeAndScore = super.randomGetOneFromList(describeAndScoreList.stream().filter(des -> des.getItemId().equals(15l)&&des.getScore().equals(8)).collect(Collectors.toList()));
        this.param.put("disciplineScore", describeAndScore.getScore());
        this.param.put("disciplineMsg", describeAndScore.getDescribeInfo());
        if (!super.isAvailableResult()) {
            doAssess();
        }
        this.param.put("currentScore", currentScore);
    }

    public AssesstorForExcellent(Integer minStore, Integer maxStore, Integer offDays, Map<String, Object> param, Map<String, Object> assessConfigInfo) {
        super(minStore, maxStore, offDays, param, assessConfigInfo);
    }
}
