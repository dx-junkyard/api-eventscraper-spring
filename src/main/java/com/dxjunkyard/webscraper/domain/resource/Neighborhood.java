package com.dxjunkyard.webscraper.domain.resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Neighborhood {
    private Integer id;
    private String longitude;
    private String latitude;
    private Double distance;
}
