package com.bm.assess.helper;

import com.bm.assess.dto.ExportWordDto;

import java.util.Map;

public class AssesstorFactory {
    public static Assesstor getAssesstor(Map<String, Object> param, ExportWordDto exportWordDto, Map<String, Object> assessConfigInfo) {
        Assesstor assesstor = null;
//        A：90分（含）以上							优秀
//        B：70分（含）—90分（不含）			良好
//        C：60分（含）—70分（不含）			合格
//        D：60分以下 									不合格
        switch (exportWordDto.getLevel()) {
            case 2:
                assesstor = new AssesstorForExcellent(90, 101, exportWordDto.getOffDays(), param, assessConfigInfo);
                param.put("level","优秀");
                break;
            default:
                assesstor = new AssesstorForFine(70, 90, exportWordDto.getOffDays(), param, assessConfigInfo);
                param.put("level","良好");
                break;
        }
        return assesstor;
    }
}
