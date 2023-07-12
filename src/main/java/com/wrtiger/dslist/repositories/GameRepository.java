package com.wrtiger.dslist.repositories;

import com.wrtiger.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
