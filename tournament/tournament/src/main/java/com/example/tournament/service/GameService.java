package com.example.tournament.service;

import com.example.tournament.model.Game;
import com.example.tournament.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
