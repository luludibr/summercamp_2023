package com.example.tournament.service;

import com.example.tournament.dto.TeamDto;
import com.example.tournament.model.Player;
import com.example.tournament.model.Team;
import com.example.tournament.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> findAll() {
       return teamRepository.findAll();
    }

    public Team save(TeamDto teamDto){
        Team team = new Team();
        team.setName(teamDto.getName());
        return teamRepository.save(team);
    }
}
