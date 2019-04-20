package com.springboot.weixinxcx.service.impl;

import com.mysql.cj.util.StringUtils;
import com.springboot.weixinxcx.entity.Area;
import com.springboot.weixinxcx.mapper.AreaMapper;
import com.springboot.weixinxcx.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 增、删、查需要有事务控制
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper mapper;

    @Override
    @Transactional
    public boolean deleteByPrimaryKey(Integer areaId) {
        if(null != areaId){
            try{
                int result = mapper.deleteByPrimaryKey(areaId);
                if(1 == result){
                    return true;
                }else{
                    return false;
                }
            }catch (Exception e){
                throw new RuntimeException("删除区域信息异常："+e.getLocalizedMessage());
            }
        }else{
            throw new RuntimeException("区域ID不能为空！");
        }
    }

    /**
     * 默认的事务处理，当抛出RuntimeException时，事务就会回滚
     * @param record
     * @return
     */
    @Transactional
    @Override
    public boolean insert(Area record) {
        if(null != record){
            if(!StringUtils.isNullOrEmpty(record.getAreaName()) && null != record.getPriority()){
                record.setCreateTime(new Date());
                record.setLastUpdateTime(new Date());
                try{
                    int result = mapper.insert(record);
                    if(1 == result){
                        return true;
                    }else{
                        return false;
                    }
                }catch (Exception e){
                    throw new RuntimeException("执行新增区域信息异常："+e.getLocalizedMessage());
                }
            }else{
                throw new RuntimeException("区域名称信息或优先级信息不存在！");
            }
        }else{
            throw new RuntimeException("区域信息不存在！");
        }
    }

    @Transactional
    @Override
    public boolean insertSelective(Area record) {
        if(null != record){
            if(!StringUtils.isNullOrEmpty(record.getAreaName()) && null != record.getPriority()){
                record.setCreateTime(new Date());
                record.setLastUpdateTime(new Date());
                try{
                    int result = mapper.insertSelective(record);
                    if(1 == result){
                        return true;
                    }else{
                        return false;
                    }
                }catch (Exception e){
                    throw new RuntimeException("执行新增区域信息异常："+e.getLocalizedMessage());
                }
            }else{
                throw new RuntimeException("区域名称信息或优先级信息不存在！");
            }
        }else{
            throw new RuntimeException("区域信息不存在！");
        }
    }

    @Override
    public Area selectByPrimaryKey(Integer areaId) {
        return mapper.selectByPrimaryKey(areaId);
    }

    @Override
    public List<Area> selectAll() {
        return mapper.selectAll();
    }

    @Transactional
    @Override
    public boolean updateByPrimaryKey(Area record) {
        if(null == record)
            throw new RuntimeException("区域信息不存在！");
        if(null == record.getAreaId())
            throw new RuntimeException("区域ID不能为空！");
        try{
            record.setLastUpdateTime(new Date());
            int result = mapper.updateByPrimaryKeySelective(record);
            if(1 == result){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new RuntimeException("更新区域信息异常："+e.getLocalizedMessage());
        }
    }
}
