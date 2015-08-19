package in.society.maintain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import in.society.maintain.common.CommonUtils;
import in.society.maintain.model.User;

@Component
public class UserDetailServiceHelper {

	public User populateUser(UserDetailsVO userDetailsVO) {

		User user = new User();

		/*
		 * if (null != Integer.valueOf(userDetailsVO.getUserId())) {
		 * user.setUserId(userDetailsVO.getUserId()); }
		 */

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

	public List<UserDetailsVO> populateUserDetailVOList(List<User> user) {

		List<UserDetailsVO> userDetailvo = new ArrayList<UserDetailsVO>();
		for (User user1 : user) {
			UserDetailsVO userDetailsVO = new UserDetailsVO();
			userDetailsVO.setUserId(user1.getUserId());
			userDetailsVO.setUserName(user1.getUserName());
			userDetailsVO.setPassword(user1.getPassword());
			userDetailvo.add(userDetailsVO);
		}
		return userDetailvo;
	}
}
