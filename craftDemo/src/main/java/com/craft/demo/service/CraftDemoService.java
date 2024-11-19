package com.craft.demo.service;

import com.craft.demo.entity.CraftUser;
import com.craft.demo.entity.Player;
import com.craft.demo.entity.PlayerAge;
import com.craft.demo.exception.PermissionException;
import com.craft.demo.repository.CraftUserRepository;
import com.craft.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class CraftDemoService {

    @Autowired
    private CraftUserRepository craftUserRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public List<PlayerAge> getAllPlayersAges() {
        List<Player> playerList = playerRepository.findAll();
        List<PlayerAge> playerAges = new ArrayList<>();
        // key = playerAges2024
            for (Player player : playerList) {
                Instant instant = Instant.ofEpochMilli((Long)player.getDob());
                LocalDate date = instant.atZone(ZoneId.systemDefault()).toLocalDate();

                int years = (date.getYear() - LocalDate.now().getYear());
                PlayerAge playerAge = new PlayerAge();
                playerAge.setName(player.getFirstName() + player.getLastName());
                playerAge.setAge(years);
                playerAges.add(playerAge);
            }
        return playerAges;
    }

    public List<Player> getAllPlayers(boolean isAdmin) {
        List<Player> playerList = playerRepository.findAll();
        if (!isAdmin) {
            for (Player player : playerList) {
                player.setLastName(null);
            }
        }
        player.setDob(null);
        return  playerList;
    }

    public Player savePlayer(Player player, boolean isAdmin) {
        if (isAdmin) {
            return playerRepository.save(player);
        }
        throw new PermissionException("");
    }

    public CraftUser saveUser(CraftUser craftUser, boolean isAdmin) {
        if (isAdmin) {
            craftUser.setAdmin(true);
            return craftUserRepository.save(craftUser);
        }
        throw new PermissionException("");
    }

//    private String getRole(String role) {
//
//    }
}
