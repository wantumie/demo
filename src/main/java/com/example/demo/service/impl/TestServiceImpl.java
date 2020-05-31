package com.example.demo.service.impl;

import com.example.demo.dao.TestDao;
import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * describe
 *
 * @Auther Mr.Garfield
 * @Date 2020/06/2020/6/1
 */

@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;
    @Override
    public String testService(String id) {
        log.info("接口实现类！");
        log.info("ID="+id);
        String name = testDao.queryName(id);
        return name;
    }
}
