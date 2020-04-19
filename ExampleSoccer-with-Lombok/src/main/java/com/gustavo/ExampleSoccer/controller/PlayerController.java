package com.gustavo.ExampleSoccer.controller;

import com.gustavo.ExampleSoccer.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Gustavo Cigaran
 * @since 15/04/2020
 * @version 1.0
 */
@RestController
public class PlayerController {


    /**
     *
     * @return players in an array
     */
    @GetMapping("/players")
    public ArrayList<Player> getPlayer() {
        Player player = new Player();
        player.setName("Cristiano Ronaldo");
        player.setTeam("Juventus");

        Player player2 = new Player();
        player2.setName("Lionel Messi");
        player2.setTeam("Barcelona");

        Player player3 = new Player();
        player3.setName("Neymar Jr");
        player3.setTeam("PSG");

        ArrayList<Player> players = new ArrayList<>();
        players.add(player);
        players.add(player2);
        players.add(player3);

        return players;
    }
}