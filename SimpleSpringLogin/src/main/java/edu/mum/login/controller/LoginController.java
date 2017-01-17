package edu.mum.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.login.domain.User;
import edu.mum.login.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value={"/login"}, method= RequestMethod.GET)
	public String getLoginForm(Model model){		
		return "login";
	}
	
	@RequestMapping(value = "/login", method= RequestMethod.POST)
	public String processLogin(Model model,HttpServletRequest request){
		
		User user = new User();		
		user.setUserName(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));		
				
		boolean loginStatus = loginService.authenticateUser(user.getUserName(), user.getPassword());
		
		HttpSession userSession = request.getSession();
		userSession.setAttribute("currentSessionUser", user);
		
		
		if(loginStatus)
			return "redirect:/welcome";
		else	
			model.addAttribute("error", "true");
		
		return "login";
	}
	
	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public String welcome(Model model){		
		return "welcome";
	}
	
	
}
