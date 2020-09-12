package com.example.demo.servicio;

import javax.validation.Valid;

import com.example.demo.entidad.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

}
