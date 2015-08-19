package in.society.maintain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.society.maintain.common.SocietyMaintenanceException;
import in.society.maintain.controller.UserControllerHelper;
import in.society.maintain.dao.UserDAO;
import in.society.maintain.model.User;


@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private UserDetailServiceHelper userDetailServiceHelper;
	
	@Override
	@Transactional
	public String addUser(UserDetailsVO userDetailVO) throws SocietyMaintenanceException {
		String userName = null;
		try {
			//UserDetailServiceHelper userDetailServiceHelper = new UserDetailServiceHelper(); 
			User user = userDetailServiceHelper.populateUser(userDetailVO);
			userName = userDAO.addUser(user);
		} catch (Exception e) {
			System.out.println("Execption while adding user");
			throw new SocietyMaintenanceException(e.getMessage(), e);
		}
		return userName;
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

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
