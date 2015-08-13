package in.society.maintain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.society.maintain.controller.UserDetailsVO;
import in.society.maintain.dao.UserDAO;


@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public String addUser(UserDetailsVO userDetail) {
		return null;
	}

	@Override
	public UserDetailsVO updateUser(UserDetailsVO userDetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailsVO getUserDetails(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetailsVO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
