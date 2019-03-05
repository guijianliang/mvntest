package com.gui.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;


/**
 * Created by guijianliang on 2019-03-05.
 */


@Configuration
@ComponentScan("com.gui.springel")
@PropertySource("classpath:com/gui/springe/test.properties")
public class ELConfig {
    @Value("i love you")
    private String normal;

    @Value("#{DemoService.another}")
    private String fromAnother;


    @Value("classpath:com/gui/springe/test.txt")
    private Resource testfile;

    @Value("http://www.baidu.com")
    private Resource testUrl;


    @Value("${book.name}")
    private String bookname;


    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testfile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookname);
        } catch (Exception e) {
        }

    }
}