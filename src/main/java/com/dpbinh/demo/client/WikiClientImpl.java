package com.dpbinh.demo.client;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WikiClientImpl implements WikiClient {

    @Value("${app.wiki.info}")
    private String infoPath;

    public String getPage(String id) {
        StringBuilder builder = new StringBuilder();

        try {
            Document document = Jsoup.connect(infoPath).validateTLSCertificates(false).get();

            Elements elements = document.getElementsByClass("mw-parser-output");

            Boolean isContent = null;
            for(Element element : elements.get(0).children()) {
                if(element.tag().getName().equalsIgnoreCase("h2")) {
                    if(element.getElementById(id) != null) {
                        isContent = true;
                    }
                }

                if(isContent == null) {
                    continue;
                }

                if(isContent) {
                    builder.append(element.toString());
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return builder.toString();
    }
}
