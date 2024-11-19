package com.craft.demo.controller;

import com.craft.demo.entity.CraftUser;
import com.craft.demo.entity.Player;
import com.craft.demo.entity.PlayerAge;
import com.craft.demo.service.CraftDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CraftDemoController {

    @Autowired
    private CraftDemoService craftDemoService;

    @GetMapping("/v1/players")
    public ResponseEntity<List<PlayerAge>> findAllPlayersAges() {
        List<PlayerAge> playerList = craftDemoService.getAllPlayersAges();
        return new ResponseEntity<>(playerList, HttpStatus.OK);
    }

    @GetMapping("/players")
    public ResponseEntity<List<Player>> findAllPlayers(@RequestParam  boolean isAdmin) {
        List<Player> playerList = craftDemoService.getAllPlayers(isAdmin);
        return new ResponseEntity<>(playerList, HttpStatus.OK);
    }

    @PostMapping("/players")
    public ResponseEntity<Player> createPlayer(@RequestBody Player player, @RequestParam  boolean isAdmin) {
        return new ResponseEntity<>(craftDemoService.savePlayer(player, isAdmin), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<CraftUser> createUser(@RequestBody CraftUser craftUser, @RequestParam boolean isAdmin) {
        return new ResponseEntity<>(craftDemoService.saveUser(craftUser, isAdmin), HttpStatus.OK);
    }
}
