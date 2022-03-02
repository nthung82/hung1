package com.kaviddiss.bootquartz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;

/**
 * Created by david on 2015-01-20.
 */
@Service
public class SampleService {

    private static final Logger LOG = LoggerFactory.getLogger(SampleService.class);
    @Autowired
    ResourceLoader resourceLoader;
    public void hello() {
      /*  File f = new File("a.txt");
        if(f.exists() && !f.isDirectory()) {
            System.out.println("Ton tai");
        }*

       */
        try {
         //   File file = ResourceUtils.getFile("classpath:application.properties");
            File file1 = ResourceUtils.getFile("dateutils.jar");
            Resource resource = resourceLoader.getResource("classpath:a.properties");
            Resource r = new ClassPathResource("classpath:a.txt");
            System.out.println("aaaaaa" + r.exists()+resource.exists()+file1.exists());
        }catch (Exception e){e.printStackTrace();}
        String classpath = System.getProperty("java.class.path");
        String[] paths = classpath.split(System.getProperty("path.separator"));
        for (String s : paths)

            LOG.info("Hello World!" + s);
    }
}
