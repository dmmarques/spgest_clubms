package com.spgest.clubms.service;

import com.spgest.clubms.dto.ClubDTO;

import java.util.List;

public interface ClubService {
    List<ClubDTO> getClubs();
    ClubDTO getClub(String name);

}
