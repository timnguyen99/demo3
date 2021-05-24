package com.dpbinh.demo.dto;

import java.io.Serializable;

public class HtmlResponse implements Serializable {
    private String content;

    public HtmlResponse() {
    }

    public HtmlResponse(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
