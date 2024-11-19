package com.craft.demo.service;

import com.craft.demo.entity.CraftUser;
import com.craft.demo.entity.Player;
import com.craft.demo.repository.CraftUserRepository;
import com.craft.demo.repository.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class CraftDemoServiceTest {

    @MockBean
    CraftUserRepository craftUserRepository;

    @MockBean
    PlayerRepository playerRepository;

    @Autowired
    private CraftDemoService craftDemoService;

    CraftUser craftUser;

    Player player;

    List<Player> playerList = new ArrayList<>();

    @BeforeEach
    void setUp() {
        craftUser = CraftUser.builder()
                .name("Sunil")
                .isAdmin(true)
                .build();

        player = Player.builder()
                .firstName("sudheer")
                .lastName("kumar")
                .build();

        Player player1 = Player.builder()
                        .firstName("John")
                        .lastName("Marshal")
                        .build();
        playerList.add(player);
        playerList.add(player1);
       when(playerRepository.findAll()).thenReturn(playerList);
    }

//    @Test
//    void test_savePlayer_happyCase() {
//        when(craftUserRepository.save(any())).thenReturn(craftUser);
//    }

    @Test
    void test_getAllPlayers_isAdmin() {
        List<Player> playerList1 = craftDemoService.getAllPlayers(true);
        for (Player player1 : playerList1) {
            Assertions.assertNotNull(player1.getLastName());
        }
    }

    @Test
    void test_getAllPlayers_isNotAdmin() {
        List<Player> playerList1 = craftDemoService.getAllPlayers(false);
        for (Player player1 : playerList1) {
            Assertions.assertEquals(player1.getLastName(), "");
        }
    }
}