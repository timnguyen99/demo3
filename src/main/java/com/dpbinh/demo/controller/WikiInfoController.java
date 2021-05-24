package com.dpbinh.demo.controller;

import com.dpbinh.demo.dto.HtmlResponse;
import com.dpbinh.demo.service.WikiInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wiki-info")
public class WikiInfoController {

    @Autowired
    private WikiInfoService wikiInfoService;

    @GetMapping("/history")
    public ResponseEntity<HtmlResponse>  getHistory() {
        HtmlResponse response = wikiInfoService.getHistory();
        return ResponseEntity.ok(response);    }

    @GetMapping("/government")
    public ResponseEntity<HtmlResponse>  getGovernment() {
        HtmlResponse response = wikiInfoService.getGovernment();
        return ResponseEntity.ok(response);    }

    @GetMapping("/media")
    public ResponseEntity<HtmlResponse>  getMedia() {
        HtmlResponse response = wikiInfoService.getMedia();
        return ResponseEntity.ok(response);    }
}
