package com.AspectJ.aspectj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class iPhone {
    @Autowired
    @Qualifier("med")
    public Battery battery;
    @Autowired
    @Qualifier("retina")
    public Screen screen;
    @Autowired
    @Qualifier("bionic")
    public CPU cpu;
    public String name;
    public Integer code;
    iPhone(String name){
        this.name = name;
    }
    public void getInfo(){
        System.out.println("Name: "+name);
        try{
        	screen.screenInfo();
        	battery.batteryInfo();
        	cpu.cpuInfo();
        }catch(Exception e){
        	
        }
    }
    public void updateCode(Integer code){
    	this.code = code;
    }
}