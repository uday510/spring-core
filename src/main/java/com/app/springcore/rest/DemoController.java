package com.app.springcore.rest;

import com.app.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach theCoach;

    // define a constructor for dependency injection
    // constructor injection
//    @Autowired
//    public DemoController(Coach theCoach) {
//        this.theCoach = theCoach;
//    }


    // define a setter method for dependency injection
    // setter injection
    @Autowired
    public void setTheCoach(Coach theCoach) {
        this.theCoach = theCoach;
    }

    @RequestMapping("/dailyworkout")
    public String getDailyWorkout() {
        return theCoach.getDailyWorkout();
    }
}
