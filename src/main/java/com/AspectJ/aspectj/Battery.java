package com.AspectJ.aspectj;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    Integer mAh;
    Battery(Integer mAh){
        this.mAh = mAh;
    }
    public void batteryInfo(){
        System.out.println("Battery power: "+mAh);
    }
}
