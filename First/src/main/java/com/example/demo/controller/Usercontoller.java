package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Userentity;
import com.example.demo.repository.Userrepo;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
public class Usercontoller {
	@Autowired
	private  Userrepo repo;
	 @CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/add")
	public Userentity addpro(@RequestBody Userentity pro) {
	try {
		repo.save(pro);
		return pro;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	@GetMapping("/getuser")
	public List<Userentity>getuser(){
		try {
			return repo.findAll();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PutMapping("/update")
	public Userentity putpro(@RequestBody Userentity pro) {
	try {
		repo.save(pro);
		return pro;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	}
	@DeleteMapping("/delete/{Id}")
	public String deleteruser(@PathVariable int Id) {
		try {
			@SuppressWarnings("deprecation")
			Userentity user=repo.getOne(Id);
			repo.delete(user);
			return"user deleted";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
