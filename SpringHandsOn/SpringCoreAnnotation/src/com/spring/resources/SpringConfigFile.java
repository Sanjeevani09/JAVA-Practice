package com.spring.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.beans")
//OR
@ComponentScan({"com.spring.beans"})  //Can pass multiple locations {"---", "----","----"}
public class SpringConfigFile {

}
