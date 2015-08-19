package in.society.maintain.controller;

import org.springframework.stereotype.Component;

import in.society.maintain.common.CommonUtils;
import in.society.maintain.service.UserDetailsVO;

@Component
public class UserControllerHelper {

	public UserDetailsVO populateUserDetailsVO(UserDetailsFormBean userDetailsFormBean) {
		UserDetailsVO userDetailsVO = new UserDetailsVO();

		/*if (null != Integer.valueOf(userDetailsFormBean.getUserId())) {
			userDetailsVO.setUserId(Integer.valueOf(userDetailsFormBean.getUserId()));
		}*/

		if (!CommonUtils.isNullorEmpty(userDetailsFormBean.getUserName())) {
			userDetailsVO.setUserName(userDetailsFormBean.getUserName());
		}
		if (!CommonUtils.isNullorEmpty(userDetailsFormBean.getPassword())) {
			userDetailsVO.setPassword(userDetailsFormBean.getPassword());
		}

		return userDetailsVO;
	}

}
