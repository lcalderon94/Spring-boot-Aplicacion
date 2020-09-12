package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Role;



@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
