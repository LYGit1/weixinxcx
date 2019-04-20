package com.springboot.weixinxcx.service;

import com.springboot.weixinxcx.entity.Area;

import java.util.List;

public interface AreaService {
    boolean deleteByPrimaryKey(Integer areaId);
    boolean insert(Area record);
    boolean insertSelective(Area record);
    Area selectByPrimaryKey(Integer areaId);
    List<Area> selectAll();
    boolean updateByPrimaryKey(Area record);
}
