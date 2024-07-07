package com.app.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private final Coach theCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        this.theCoach = theCoach;
    }

    @RequestMapping("/dailyworkout")
    public String getDailyWorkout() {
        return theCoach.getDailyWorkout();
    }
}
