package com.jjw.ecommerce.mapper;

import cn.hutool.crypto.digest.MD5;
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
    public void mainTest01() {
        EcommerceUser ecommerceUser = EcommerceUser.builder()
                .username("jjw@163.com")
                .password(MD5.create().digestHex("888888"))
                .extraInfo("{}")
                .build();

        int count = this.ecommerceUserMapper.insert(ecommerceUser);
        log.info(String.valueOf(count));
    }

    @Test
    public void mainTest02() {
        EcommerceUser ecommerceUser = EcommerceUser.builder()
                .id(17L)
                .password(MD5.create().digestHex("999999"))
                .build();

        int count = this.ecommerceUserMapper.updateById(ecommerceUser);
        log.info(String.valueOf(count));
    }
}
