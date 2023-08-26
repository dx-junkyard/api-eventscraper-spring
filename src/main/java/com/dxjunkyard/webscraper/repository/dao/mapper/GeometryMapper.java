package com.dxjunkyard.webscraper.repository.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.dxjunkyard.webscraper.domain.resource.Neighborhood;

import java.util.List;

@Mapper
public interface GeometryMapper {
    void addLocation(Integer id, String webscraper);
    List<Neighborhood> getNeighborhood(String webscraper);
}
