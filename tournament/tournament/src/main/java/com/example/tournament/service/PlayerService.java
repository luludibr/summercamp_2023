package com.example.tournament.service;

import com.example.tournament.model.Game;
import com.example.tournament.model.Player;
import com.example.tournament.repository.GameRepository;
import com.example.tournament.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> findAll(){
        return playerRepository.findAll();
    }
}
