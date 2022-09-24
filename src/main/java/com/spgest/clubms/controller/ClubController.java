package com.spgest.clubms.controller;

import com.spgest.clubms.dto.ClubDTO;
import com.spgest.clubms.service.ClubService;
import com.spgest.clubms.service.ClubServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/clubms/")
public class ClubController {

    @Autowired
    ClubServiceImp clubServiceImp;

    @GetMapping(path = "clubs")
    public List<ClubDTO> getAllClubs(){
        return clubServiceImp.getClubs();
    }
}
