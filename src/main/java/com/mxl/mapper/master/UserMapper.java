package com.mxl.mapper.master;

import com.mxl.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

	void insertUser(User user);
	void updateUser(User user);
	User selectUsersById(Long id);
	List<User> selectUsersByPage(@Param("user") User example,
								 @Param("startIndex") int startIndex, @Param("size") int size);
	void deleteUserById(Long id);
	
}
