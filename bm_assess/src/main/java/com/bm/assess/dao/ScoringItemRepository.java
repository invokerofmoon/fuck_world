package com.bm.assess.dao;

import com.bm.assess.entity.DescribeAndScore;
import com.bm.assess.entity.ScoringItem;
import org.springframework.data.repository.CrudRepository;

public interface ScoringItemRepository extends CrudRepository<ScoringItem,Long> {
}