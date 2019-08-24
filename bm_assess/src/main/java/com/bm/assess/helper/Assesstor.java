package com.bm.assess.helper;

import com.bm.assess.entity.DescribeAndScore;

import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Assesstor implements Assessable {

    protected Integer minStore;

    protected Integer maxStore;

    protected Integer offDays;

    protected Map<String, Object> param;

    protected Map<String, Object> assessConfigInfo;

    protected Random rand = new Random();
    //int randNumber =rand.nextInt(MAX - MIN + 1) + MIN; // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数

    protected Integer currentScore = 0;

    private DescribeAndScore transfer = null;

    /**
     * 考勤
     *
     * @param
     * @return void
     * @author invokerofmoon
     * @date 2019/8/24
     */
    protected void setAttendance() {
        Integer attendanceScore;
        switch (this.offDays) {
            case 0:
                this.param.put("attendanceMsg", "全勤");
                attendanceScore = 15;
                break;
            case 1:
                this.param.put("attendanceMsg", "每月最多请假1天");
                attendanceScore = 14;
                break;
            case 2:
                this.param.put("attendanceMsg", "每月最多请假2天");
                attendanceScore = 13;
                break;
            case 3:
                this.param.put("attendanceMsg", "每月最多请假3天");
                attendanceScore = 12;
                break;
            default:
                this.param.put("attendanceMsg", "请假比较频繁");
                attendanceScore = rand.nextInt(2) + 9;//9~11
                break;

        }
        this.param.put("attendanceScore", attendanceScore);
        currentScore += attendanceScore;
    }

    protected boolean isAvailableResult() {
        return currentScore >= minStore && currentScore < maxStore;
    }

    protected DescribeAndScore randomGetOneFromList(List<DescribeAndScore> list) {
        transfer = list.get(rand.nextInt(list.size()));
        currentScore += transfer.getScore();
        return transfer;
    }

    public Assesstor() {
        super();
    }

    public Assesstor(Integer minStore, Integer maxStore, Integer offDays, Map<String, Object> param, Map<String, Object> assessConfigInfo) {
        this();
        this.minStore = minStore;
        this.maxStore = maxStore;
        this.offDays = offDays;
        this.param = param;
        this.assessConfigInfo = assessConfigInfo;
    }
}
