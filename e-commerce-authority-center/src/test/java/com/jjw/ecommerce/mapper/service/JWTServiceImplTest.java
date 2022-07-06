package com.jjw.ecommerce.mapper.service;

import cn.hutool.crypto.digest.MD5;
import com.jjw.ecommerce.service.impl.JWTServiceImpl;
import com.jjw.ecommerce.vo.UsernameAndPassword;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class JWTServiceImplTest {

    @Autowired
    private JWTServiceImpl jwtService;

    @Test
    public void Test01() throws Exception {

        log.info(this.jwtService.generateToken("jjw@163.com", MD5.create().digestHex("888888")));
    }

    @Test
    public void Test02() throws Exception {
        log.info(this.jwtService.generateToken("jjw@163.com", MD5.create().digestHex("888888"), 10));
    }

    @Test
    public void Test03() throws Exception {
        UsernameAndPassword usernameAndPassword = new UsernameAndPassword();
        usernameAndPassword.setUsername("93108@qq.com");
        usernameAndPassword.setPassword(MD5.create().digestHex("888888"));

        log.info(this.jwtService.registerUserAndGenerateToken(usernameAndPassword));
    }
}
