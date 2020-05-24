package com.pankin.the_bull_cow.repository;

import com.pankin.the_bull_cow.data.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
