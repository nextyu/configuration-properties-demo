package com.nextyu.demo;

import com.nextyu.demo.properties.MallProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationPropertiesDemoApplicationTests {


    @Autowired
    private MallProperties mallProperties;

    @Test
    public void contextLoads() {
        System.out.println(mallProperties.getQiniu().getAccessKey());
        System.out.println(mallProperties.getQq().getSecretKey());
    }

}
