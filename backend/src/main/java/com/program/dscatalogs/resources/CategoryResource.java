package com.program.dscatalogs.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.dscatalogs.entities.Category;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@GetMapping
	ResponseEntity<List<Category>> findAll(){
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "BOOKS"));
		list.add(new Category(2L, "ELETRONICS"));
		return ResponseEntity.ok().body(list);	
		
	}
}
