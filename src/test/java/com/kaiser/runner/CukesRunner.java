package com.kaiser.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;





    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "com/kaiser/stepDefinitions",
            dryRun = false,
            tags = "@smoke_test",
            monochrome = true,  //clearly shows
            plugin = {"pretty",  //prints gherkin steps in console
                    "html:target/default-cucumber-reports",   //creates basic html report in target folder
                    "json:target/cucumber.json",    //creates cucumber.json
                    "rerun:target/rerun.txt"        //rerun: fail olan testleri
                     // cucumber buraya store ediyor,hangileri fail hangi satirda detaylari ile
                    //failed runner a gidip feauture in icine koyuyoruz
            }
    )

//dry run true: testleri run etmeden dry sekilde run eder
// ----methodlari calistirir ve creates the snipppets====true methodlarin var olup olmadigina bakar


//cucumber junitle calisiyor
//testng de entegre edip testng.xml dosyasi olusturup parelel testing bunun uzerinden yapilabilir
//testng ve junit birlikte calisabilir

    public class CukesRunner {

    }
