package com.restapi.board.article.service.impl;

import com.restapi.board.article.service.articleService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class articleServiceImpl implements articleService {

    @Override
    public Map<String, Object> getArticleData() {

        Map<String, Object> articleData = new HashMap<>();

        articleData.put("Key 1", "Dummy Data 1");
        articleData.put("Key 2", "Dummy Data 2");
        articleData.put("Key 3", "Dummy Data 3");

        return articleData;
    }

}
