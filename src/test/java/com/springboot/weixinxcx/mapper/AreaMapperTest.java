package com.springboot.weixinxcx.mapper;

import com.springboot.weixinxcx.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaMapperTest {

    @Autowired
    private AreaMapper mapper;

    @Test
    @Ignore
    public void insert(){
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int result = mapper.insert(area);
        assertEquals(1,result);
    }

    @Test
    @Ignore
    public void selectByPrimaryKey(){
        Area area = mapper.selectByPrimaryKey(1);
        assertEquals("东苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void selectAll(){
        List<Area> list = mapper.selectAll();
        assertEquals(2,list.size());
    }

    @Test
    @Ignore
    public void updateByPrimaryKey(){
        Area area = new Area();
        area.setAreaId(3);
        area.setAreaName("西苑");
        area.setPriority(1);//必填
        int result = mapper.updateByPrimaryKey(area);
        assertEquals(1,result);
    }

    @Test
    public void deleteByPrimaryKey(){
        int result = mapper.deleteByPrimaryKey(3);
        assertEquals(1,result);
    }
}