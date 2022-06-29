package com.jjw.ecommerce.mapper;

import com.jjw.ecommerce.domain.entity.EcommerceUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class EcommerceUserMapperTest {

    @Resource
    private EcommerceUserMapper ecommerceUserMapper;

    @Test
    public void mainTest() {
        EcommerceUser ecommerceUser = EcommerceUser.builder()
                .username("jjw@163.com")
                .password("")
                .extraInfo("{}")
                .createTime(new Date())
                .build();

        int count = this.ecommerceUserMapper.insert(ecommerceUser);
        log.info(String.valueOf(count));
    }
}
