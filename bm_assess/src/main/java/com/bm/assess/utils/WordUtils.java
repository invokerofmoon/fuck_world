package com.bm.assess.utils;

import cn.afterturn.easypoi.word.WordExportUtil;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileOutputStream;
import java.util.Date;
import java.util.Map;

/**
 * @program byh-service-referral
 * @description: word工具类
 * @author: chenmet
 * @create: 2019/01/10 11:33
 */
public class WordUtils {

    /**
     * 根据参数与文件路径生成word文件
     *
     * @param param
     * @param wordPath
     */
    public static String saveWord(Map<String, Object> param, String wordPath, String templPath) {
        String dateTime = DateFormatUtils.format(new Date(), "yyyyMMdd_HHmmssSSS");
        String temFilePath = wordPath + param.get("name") + dateTime + ".docx";
        try {
            XWPFDocument doc = WordExportUtil.exportWord07(templPath, param);
            FileOutputStream fos = new FileOutputStream(temFilePath);
            doc.write(fos);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temFilePath;
    }

}
