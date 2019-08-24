package com.bm.assess.service.assess;

import com.bm.assess.dao.DescribeAndScoreRepository;
import com.bm.assess.dao.ScoringItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BMAssessService {
    @Autowired
    private DescribeAndScoreRepository describeAndScoreRepository;
    @Autowired
    private ScoringItemRepository scoringItemRepository;

    public Map<String, Object> getAssessConfigInfo() {
        Map<String, Object> assessConfigInfo = new HashMap<>();
        assessConfigInfo.put("describeAndScoreList", describeAndScoreRepository.findAll());
        assessConfigInfo.put("scoringItemList", scoringItemRepository.findAll());
        return assessConfigInfo;
    }
}
