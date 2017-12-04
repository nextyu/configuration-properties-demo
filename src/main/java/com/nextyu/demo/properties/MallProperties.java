package com.nextyu.demo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 2017-11-14 20:50
 *
 * @author nextyu
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "mall")
public class MallProperties {
    private QiniuProperties qiniu = new QiniuProperties();
    private QQProperties qq = new QQProperties();
}
