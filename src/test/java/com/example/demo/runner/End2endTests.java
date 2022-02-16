package com.example.demo.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Feature", glue = "com.example.demo.glue",
        monochrome = true)
public class End2endTests {


}
