package com.zn.j1902.service;

import com.zn.j1902.vo.MsgResult;
import com.zn.j1902.vo.SolrSearchResult;

/**
 * Created by Qxk on 2019/7/8.
 */
public interface SolrService {
    //导入数据库中信息到solr索引库中
    public MsgResult importDb2Solr();
    // 根据查询条件从solr中分页查询
    SolrSearchResult findDocFromSolr(String keyword, int page, int pageSize);
}
