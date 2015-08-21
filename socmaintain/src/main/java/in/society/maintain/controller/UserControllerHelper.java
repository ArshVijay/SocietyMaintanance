package in.society.maintain.controller;

import java.util.ArrayList;
import java.util.List;

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
	public List<UserDetailsFormBean> populateUserDetailsFormBeanVOList(List<UserDetailsVO> userDetailsVO) {
		List<UserDetailsFormBean> userDetailsFormBean = new ArrayList<UserDetailsFormBean>();
		
		for (UserDetailsVO userDetailVO : userDetailsVO) {
			UserDetailsFormBean userDetailFormBean = new UserDetailsFormBean();
			
			userDetailFormBean.setUserId(userDetailVO.getUserId());
			userDetailFormBean.setUserName(userDetailVO.getUserName());
			userDetailFormBean.setPassword(userDetailVO.getPassword());
			userDetailsFormBean.add(userDetailFormBean);
		}
		
		return userDetailsFormBean;
	}

}
