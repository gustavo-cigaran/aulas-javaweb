package com.gustavo.ExampleSoccer.controller;

import com.gustavo.ExampleSoccer.model.Ball;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Gustavo Cigaran
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class BallController {

    /**
     *
     * @return index page
     */
    @GetMapping("/")
    public String index() {
        return "Welcome!!!";
    }

    /**
     *
     * @return soccer balls in an array
     */
    @GetMapping("/balls")
    public ArrayList<Ball> getBall() {
        Ball ball = new Ball();
        ball.setName("Jabulani");
        ball.setReleaseDate("December 4th, 2009");

        Ball ball2 = new Ball();
        ball2.setName("Brazuca");
        ball2.setReleaseDate("December 4th, 2013");

        Ball ball3 = new Ball();
        ball3.setName("Telstar 18");
        ball3.setReleaseDate("November 9th, 2017");

        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(ball);
        balls.add(ball2);
        balls.add(ball3);

        return balls;
    }
}
