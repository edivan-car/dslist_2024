package br.com.lea3.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lea3.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
