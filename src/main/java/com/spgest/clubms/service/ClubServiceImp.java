package com.spgest.clubms.service;

import com.spgest.clubms.dto.ClubDTO;
import com.spgest.clubms.mapper.ClubDTOMapper;
import com.spgest.clubms.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClubServiceImp implements ClubService{

    @Autowired
    ClubRepository clubRepository;
    ClubDTOMapper clubDTOMapper;

    /*
    What this method does is:
        - Gets all the CLUB from the repository by getting the list return by the repository
        - It then applies a stream method to the list which basically applies the mapper method to transfor the CLUB
            into a CLUBDTO
     */
    @Override
    public List<ClubDTO> getClubs() {
        return clubRepository.findAll().stream().map(clubDTOMapper::clubToDTO).collect(Collectors.toList());
    }

    @Override
    public ClubDTO getClub(String name) {
        return clubDTOMapper.clubToDTO(clubRepository.findClubByName(name));
    }
}
