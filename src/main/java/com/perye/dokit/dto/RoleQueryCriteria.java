package com.perye.dokit.dto;

import com.perye.dokit.annotation.Query;
import lombok.Data;

@Data
public class RoleQueryCriteria {

    // 多字段模糊
    @Query(blurry = "name,remark")
    private String blurry;
}
