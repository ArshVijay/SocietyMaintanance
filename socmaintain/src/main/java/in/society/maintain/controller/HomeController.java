package in.society.maintain.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.society.maintain.common.SocietyMaintenanceException;
import in.society.maintain.model.Module;
import in.society.maintain.service.ModuleService;
import in.society.maintain.service.ModuleServiceHelper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private ModuleService moduleService;
	

	private ModuleServiceHelper moduleServiceHelper= new ModuleServiceHelper();

	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	Map<String, List<String>> moduleslist = new HashMap<String, List<String>>();
	List<String> mlist1 = new ArrayList<String>();
	List<String> mlist2 = new ArrayList<String>();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap model) {
		Map<String, List<Module>> subModuleMap;
		Set<String> topModulelist;
		List<Module> modulelist;
		try {
			modulelist = moduleService.getAllTopModules("ADMIN_ROLE");
			topModulelist=moduleServiceHelper.getTopbModules(modulelist);
			subModuleMap=moduleServiceHelper.getSubModules(modulelist);
			model.addAttribute("topModuleList",topModulelist);
			model.addAttribute("subModuleMap",subModuleMap);
			model.addAttribute("modulelist", modulelist);
			
		} catch (SocietyMaintenanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}

	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public String accessdenied(Model model) {
		model.addAttribute("error", "true");
		return "denied";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		return "logout";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomePage(Locale locale, ModelMap model) {
		try {
			List<Module> modulelist = moduleService.getAllTopModules("ADMIN_ROLE");
			model.addAttribute("modulelist", modulelist);
		} catch (SocietyMaintenanceException e) {
			e.printStackTrace();
		}
		return "home";
	}
}
