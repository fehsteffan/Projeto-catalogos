package com.program.dscatalogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.program.dscatalogs.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
		
	
	
}
