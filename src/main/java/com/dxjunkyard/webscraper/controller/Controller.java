package com.dxjunkyard.webscraper.controller;

import com.dxjunkyard.webscraper.domain.resource.response.NormalResponse;
import com.dxjunkyard.webscraper.service.GeometryService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/api")
@Slf4j
public class Controller {
    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private GeometryService geometryService;

    @GetMapping("/hello")
    @ResponseBody
    public NormalResponse hello(){
        geometryService.scraper();
        logger.info("疎通確認 URL");
        return NormalResponse.builder().result("OK").build();
    }

}
