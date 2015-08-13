package in.society.maintain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addUser(Model model) {
		return null;
	}

	@RequestMapping(value="/edit",method = RequestMethod.POST)
	public String updateUser(Model model) {
		return null;
	}
	@RequestMapping(value="/getUser",method = RequestMethod.GET)
	public String getUser(Model model) {
		return null;
	}
	@RequestMapping(value="/delete",method = RequestMethod.GET)
	public String deleteUser(Model model) {
		return null;
	}
	@RequestMapping(value="/getAllUsers",method = RequestMethod.GET)
	public String getAllUsers(Model model) {
		return null;
	}
}
