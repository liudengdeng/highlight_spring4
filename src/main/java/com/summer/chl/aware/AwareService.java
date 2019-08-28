package com.summer.chl.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("bean 的名称为：" + beanName);
        Resource resource = loader.getResource("classpath:com/summer/chl/aware/test.txt");
        try {
            String s = IOUtils.toString(resource.getInputStream());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
