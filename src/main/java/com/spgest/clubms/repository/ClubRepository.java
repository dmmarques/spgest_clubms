package com.spgest.clubms.repository;

import com.spgest.clubms.domain.Club;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClubRepository extends MongoRepository<Club, String> {
    Club findClubByName(String name);
}
