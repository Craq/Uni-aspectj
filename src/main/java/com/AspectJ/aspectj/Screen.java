package com.AspectJ.aspectj;

import org.springframework.stereotype.Component;

@Component
public class Screen {
    String name;
    String resolution;
    Screen(String name, String resolution){
        this.name = name;
        this.resolution = resolution;
    }
    public void screenInfo(){
        System.out.println("Screen: "+name+"; resoluction: "+resolution);
    }
}
