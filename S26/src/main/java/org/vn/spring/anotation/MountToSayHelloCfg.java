/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vn.spring.anotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 *
 * @author danglph
 */
@Configuration
public class MountToSayHelloCfg {
    
    @Bean(name = "helloWBean")
    @Description("Dinh nghia bean annotation")
    
    public MountSayHello helloWorld() {
        return new MountToSayHelloImpl();
    }

    
    
}
