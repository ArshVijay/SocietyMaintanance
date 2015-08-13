package in.society.maintain.service;

import java.util.List;
import in.society.maintain.controller.UserDetailsVO;

public interface UserDetailService {
	
	String addUser(UserDetailsVO userDetail);

	UserDetailsVO updateUser(UserDetailsVO userDetail);

	String deleteUser(Integer userId);

	UserDetailsVO getUserDetails(Integer userId);

	List<UserDetailsVO> getAllUsers();

}
