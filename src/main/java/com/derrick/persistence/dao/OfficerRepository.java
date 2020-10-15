package com.derrick.persistence.dao;

import com.derrick.persistence.entities.Officer;
import com.derrick.persistence.entities.Rank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficerRepository extends JpaRepository<Officer, Integer> {
    List<Officer> findByLast(String last);

    List<Officer> findAllByRankAndLastLike(Rank rank, String last);
}
