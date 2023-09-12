package com.national.cloud.dubbo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * 
 */


@Service
@Slf4j
public class TestServiceImpl implements  TestService {
    @Override
    public void Test(Long id) {
        log.info("dubbo test {}",id);
    }
}
