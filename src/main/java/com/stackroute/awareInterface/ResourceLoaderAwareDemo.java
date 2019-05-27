package com.stackroute.awareInterface;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceLoaderAwareDemo implements ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource resource=resourceLoader.getResource("data.txt");
        try {
            InputStream inputStream=resource.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

            while (true){
                String text=bufferedReader.readLine();
                if (text==null)
                {
                    break;
                }
                System.out.println(text);
            }
            bufferedReader.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
