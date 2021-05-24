package com.dpbinh.demo.service;

import com.dpbinh.demo.dto.HtmlResponse;

public interface WikiInfoService {

    HtmlResponse getHistory();

    HtmlResponse getGovernment();

    HtmlResponse getMedia();
}
