package com.AspectJ.aspectj;

import org.springframework.stereotype.Component;

@Component
public class CPU {
    String name;
    Integer cores;
    public CPU(String name, Integer cores){
        this.name = name;
        this.cores = cores;
    }
    public void cpuInfo(){
        System.out.println("Name: "+name+"; cores: "+cores);
    }
}
