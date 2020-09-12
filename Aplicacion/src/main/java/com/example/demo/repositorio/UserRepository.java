package com.example.demo.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	

}
