package com.dxjunkyard.webscraper.service;

import com.dxjunkyard.webscraper.repository.dao.mapper.GeometryMapper;
import com.dxjunkyard.webscraper.config.WebScraper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GeometryService {
    @Autowired
    GeometryMapper geometryMapper;

    @Autowired
    WebScraper webScraper;

    public void scraper() {
        webScraper.scraper();
    }

}
