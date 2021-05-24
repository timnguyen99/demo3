package com.dpbinh.demo.service;

import com.dpbinh.demo.client.WikiClient;
import com.dpbinh.demo.dto.HtmlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WikiInfoServiceImpl implements WikiInfoService {
    @Autowired
    private WikiClient wikiClient;

    @Override
    public HtmlResponse getHistory() {
        String content = wikiClient.getPage("History");

        return new HtmlResponse(content);
    }

    @Override
    public HtmlResponse getGovernment() {
        String content = wikiClient.getPage("Government");

        return new HtmlResponse(content);
    }

    @Override
    public HtmlResponse getMedia() {
        String content = wikiClient.getPage("Music");

        return new HtmlResponse(content);
    }
}
