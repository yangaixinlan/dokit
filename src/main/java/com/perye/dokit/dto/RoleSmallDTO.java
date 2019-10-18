package com.perye.dokit.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleSmallDTO implements Serializable {

    private Long id;

    private String name;

    private Integer level;

    private String dataScope;
}

