package it.exolab.exobank.mapper;

import java.util.List;



import it.exolab.exobank.model.User;

public interface UserMapper {
	
	 List<User>  findAllUser();
	 
	 public void deleteUser(Integer id );
	 
	 public void insertUser(User user);
	 
	 public User findByEmailPassword(User user) ;
	 
	 public void updateUser(User user);
		 
	 

}
