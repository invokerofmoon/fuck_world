package com.bm.assess.controller;

import com.bm.assess.dto.ExportWordDto;
import com.bm.assess.helper.Assessable;
import com.bm.assess.helper.AssesstorFactory;
import com.bm.assess.service.assess.BMAssessService;
import com.bm.assess.utils.CusAccessObjectUtil;
import com.bm.assess.utils.FileUtils;
import com.bm.assess.utils.WordUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author invokerofmoon
 * @date 2019/8/24
 * @return
 */
@Controller
public class ExportWordController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    BMAssessService bmAssessService;

    @RequestMapping("/gotoExport")
    public String test() {
        return "export";
    }

    @RequestMapping("exportWord")
    public void exportWord(HttpServletRequest request, HttpServletResponse response, ExportWordDto exportWordDto) {
        logger.info("请求的IP地址为：{}",CusAccessObjectUtil.getIpAddress(request));
        logger.info(exportWordDto.toString());
        String path = this.getClass().getClassLoader().getResource("application.yml").getPath();
        String wordPath = FileUtils.getPath(path, FileUtils.WORD_PATH);
        Map<String, Object> param = new HashMap<>();
        param.put("name", exportWordDto.getName());
        param.put("workerType", exportWordDto.getWorkerType());
        param.put("projectName", exportWordDto.getProjectName());
        AssesstorFactory.getAssesstor(param, exportWordDto, bmAssessService.getAssessConfigInfo()).doAssess();
        String templPath = "templates/kaohebiao.docx";
        String temFilePath = WordUtils.saveWord(param, wordPath, templPath);
        FileUtils.downloadFile(response, new StringBuilder("考核表").append("_").append(exportWordDto.getName()).append("_").append(exportWordDto.getProjectName()).append(".docx").toString(), temFilePath, temFilePath, true);
    }


}
