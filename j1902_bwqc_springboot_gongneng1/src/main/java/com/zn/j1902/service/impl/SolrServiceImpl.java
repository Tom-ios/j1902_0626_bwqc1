package com.zn.j1902.service.impl;

import com.zn.j1902.mapper.ChexingkuguanliMapper;
import com.zn.j1902.pojo.Chexingkuguanli;
import com.zn.j1902.pojo.ChexingkuguanliExample;
import com.zn.j1902.service.SolrService;
import com.zn.j1902.vo.MsgResult;
import com.zn.j1902.vo.SolrSearchResult;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.List;

/**
 * Created by Qxk on 2019/7/8.
 */
public class SolrServiceImpl implements SolrService {
    @Value("solr.baseUrl")
    private String url;
    @Autowired
    private ChexingkuguanliMapper kuguanliMapper;
    @Override
    public MsgResult importDb2Solr() {
        MsgResult result = new MsgResult();

            try {
                HttpSolrServer httpSolrServer = new HttpSolrServer(url);
                ChexingkuguanliExample example = new ChexingkuguanliExample();
                List<Chexingkuguanli> list = kuguanliMapper.selectByExample(example);
                for (Chexingkuguanli car : list) {
                    SolrInputDocument doc = new SolrInputDocument();
                    doc.setField("id", car.getId() + "");
                    doc.setField("item_title", car.getPingpai());
                    doc.setField("item_sell_point", car.getLeixing());
                    doc.setField("item_image", car.getLogo());
                    doc.setField("item_category_name", car.getChangshang());
                    doc.setField("item_desc", car.getNiankuan());
                    httpSolrServer.add(doc);
                }
                httpSolrServer.commit();//提交数据 到solr索引库中
                result.setStatus(200);
                result.setMessage("success");
                return result;
            }catch (SolrServerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        result.setStatus(-1);
        result.setMessage("数据导入失败！");
        return result;
    }

    @Override
    public SolrSearchResult findDocFromSolr(String keyword, int page, int pageSize) {
        return null;
    }
}
