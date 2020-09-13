package com.example.demo.servicio;



import com.example.demo.dto.ChangePasswordForm;
import com.example.demo.entidad.User;
import com.example.demo.excepcion.UsernameOrIdNotFound;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;

}
