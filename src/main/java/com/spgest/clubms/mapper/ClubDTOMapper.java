package com.spgest.clubms.mapper;

import com.spgest.clubms.domain.Club;
import com.spgest.clubms.dto.ClubDTO;

public class ClubDTOMapper {

    public ClubDTO clubToDTO(Club club){
        return new ClubDTO(club.getName(), club.getCountry());
    }


}
