package in.society.maintain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.society.maintain.common.SocietyMaintenanceException;
import in.society.maintain.dao.UserDAO;


@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public String addUser(UserDetailsVO userDetail) throws SocietyMaintenanceException{
		return null;
	}

	@Override
	public UserDetailsVO updateUser(UserDetailsVO userDetail) throws SocietyMaintenanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Integer userId) throws SocietyMaintenanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailsVO getUserDetails(Integer userId) throws SocietyMaintenanceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetailsVO> getAllUsers() throws SocietyMaintenanceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
