package com.springboot.weixinxcx.service;

import com.springboot.weixinxcx.common.DAOException;
import com.springboot.weixinxcx.entity.Area;

import java.util.List;

public interface AreaService {
    boolean deleteByPrimaryKey(Integer areaId) throws DAOException;
    boolean insert(Area record) throws DAOException;
    boolean insertSelective(Area record) throws DAOException;
    Area selectByPrimaryKey(Integer areaId);
    List<Area> selectAll();
    boolean updateByPrimaryKey(Area record) throws DAOException;
}
