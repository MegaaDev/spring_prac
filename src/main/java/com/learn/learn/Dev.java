package com.learn.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer computer;
    public void Build(){
        computer.compile();
        System.out.println("Build successful");
    }
}
