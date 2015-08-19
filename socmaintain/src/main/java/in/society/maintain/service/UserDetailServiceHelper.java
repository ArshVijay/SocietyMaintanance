package in.society.maintain.service;

import org.springframework.stereotype.Component;

import in.society.maintain.common.CommonUtils;
import in.society.maintain.model.User;

@Component
public class UserDetailServiceHelper {
	
	public User populateUser(UserDetailsVO userDetailsVO) {
		
		User user = new User();

		/*if (null != Integer.valueOf(userDetailsVO.getUserId())) {
			user.setUserId(userDetailsVO.getUserId());
		}*/

		if (!CommonUtils.isNullorEmpty(userDetailsVO.getUserName())) {
			user.setUserName(userDetailsVO.getUserName());
		}
		if (!CommonUtils.isNullorEmpty(userDetailsVO.getPassword())) {
			user.setPassword(userDetailsVO.getPassword());
		}
		return user;
	}

	public UserDetailsVO populateUserDetailVO(User user) {
		
		UserDetailsVO userDetailsVO = new UserDetailsVO();

		if (null != Integer.valueOf(user.getUserId())) {
			userDetailsVO.setUserId(user.getUserId());
		}
		if (!CommonUtils.isNullorEmpty(user.getUserName())) {
			userDetailsVO.setUserName(user.getUserName());
		}
		if (!CommonUtils.isNullorEmpty(user.getPassword())) {
			userDetailsVO.setPassword(user.getPassword());
		}
		return userDetailsVO;
	}

}
