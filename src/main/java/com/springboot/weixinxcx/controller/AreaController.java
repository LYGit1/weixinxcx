package com.springboot.weixinxcx.controller;

import com.springboot.weixinxcx.common.Constants;
import com.springboot.weixinxcx.common.DAOException;
import com.springboot.weixinxcx.entity.Area;
import com.springboot.weixinxcx.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping("/getAllAreas")
    public Map<String,Object> getAllAreas(){
        Map<String,Object> map = new HashMap<>();
        List<Area> list = areaService.selectAll();
        map.put("result",list);
        map.put(Constants.SUCCESS,true);
        return map;
    }

    @RequestMapping("/getAreaById")
    public Map<String,Object> getAreaById(int id){
        Map<String,Object> map = new HashMap<>();
        Area area = areaService.selectByPrimaryKey(id);
        map.put("result",area);
        map.put(Constants.SUCCESS,true);
        return map;
    }

    @RequestMapping("/addArea")
    public Map<String,Object> addArea(Area area) throws DAOException {
        Map<String,Object> map = new HashMap<>();
        areaService.insert(area);
        map.put(Constants.SUCCESS,true);
        return map;
    }

    @RequestMapping("/updateArea")
    public Map<String,Object> updateArea(Area area) throws DAOException {
        Map<String,Object> map = new HashMap<>();
        areaService.updateByPrimaryKey(area);
        map.put("success",true);
        return map;
    }

    @RequestMapping("/deleteArea")
    public Map<String,Object> deleteArea(int id) throws DAOException {
        Map<String,Object> map = new HashMap<>();
        areaService.deleteByPrimaryKey(id);
        map.put("success",true);
        return map;
    }
}
