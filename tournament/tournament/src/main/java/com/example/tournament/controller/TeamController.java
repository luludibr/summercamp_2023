package com.example.tournament.controller;

import com.example.tournament.dto.TeamDto;
import com.example.tournament.model.Team;
import com.example.tournament.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> getAll() {
        return teamService.findAll();
    }


    @PostMapping("/create")
    public Team create(@RequestBody TeamDto teamDto) {
        return teamService.save(teamDto);
    }
}
