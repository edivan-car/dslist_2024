package br.com.lea3.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lea3.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
