package com.bm.assess.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class DescribeAndScore {
    @Id
    @GeneratedValue
    private Long id;
    private Long itemId;
    private String describeInfo;
    private Integer score;
}