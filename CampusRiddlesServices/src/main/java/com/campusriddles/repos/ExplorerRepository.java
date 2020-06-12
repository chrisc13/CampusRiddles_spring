package com.campusriddles.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusriddles.entities.Explorer;


public interface ExplorerRepository extends JpaRepository<Explorer, Integer> {
	Optional<Explorer> findByUsername(String username);
}
