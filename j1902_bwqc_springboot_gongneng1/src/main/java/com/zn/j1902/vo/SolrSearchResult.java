package com.zn.j1902.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by Qxk on 2019/7/8.
 */
@Data
public class SolrSearchResult {
    private long recordCount;
    private List<?> data;
}
