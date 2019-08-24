package com.bm.assess.dto;

import lombok.Data;

@Data
public class ExportWordDto {
    public static Integer LEVEL_FINE = 1;
    public static Integer LEVEL_EXCELLENT = 2;
    String name;
    String workerType;
    String projectName;
    Integer level;
    Integer offDays;

}
