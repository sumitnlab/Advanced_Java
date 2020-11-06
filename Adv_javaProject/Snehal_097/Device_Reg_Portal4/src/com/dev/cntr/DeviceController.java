package com.dev.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dev.dto.Device;
import com.dev.service.DeviceService;
import com.dev.valid.DeviceLoginValidator;


@Controller
@SessionAttributes({"userId"})
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private MailSender mailSender;
	@Autowired
	private DeviceLoginValidator deviceValidator;
	
	@RequestMapping(value = "/prep_reg_form.htm",method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
		map.put("device", new Device());
		return "reg_form";
	}
	
	@RequestMapping(value = "/reg.htm",method = RequestMethod.POST)
	public String register(Device device,ModelMap map) {
		deviceService.addDevice(device);
		return "index";
	}
	//mail sending
	@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String userName,ModelMap map) {		
		String pass = deviceService.forgotPassword(userName);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("cdacmumbai3@gmail.com");  
	        message.setTo(userName);  
	        message.setSubject("Your password");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "check the mail for password";
		}
		map.put("msg", msg);
		return "info";
	}
	
	@RequestMapping(value = "/prep_log_form.htm",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map) {
		map.put("device", new Device());
		return "login_form";
	}
	
	@RequestMapping(value = "/login.htm",method = RequestMethod.POST)
	public String login(Device device,BindingResult result, ModelMap map,HttpSession session) {
		
		System.out.println(session.getAttribute("userId"));
		
		deviceValidator.validate(device, result);
		if(result.hasErrors()){
			//System.out.println("Hello");
			return "login_form";
		}
		
		
		
		
		boolean b = deviceService.findDevice(device);
		if(b) {
			session.setAttribute("device", device); 
			session.setAttribute("userId",device.getUserId());
			
			return "home";
		}else {
			map.put("device", new Device());
			return "login_form";
		}
		
	}
	
	
	
//	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
//	public String login(Device device,
//		@RequestParam("userName") String userName,
//		@RequestParam("userPass") String userPass,
//		HttpSession session,
//		ModelMap modelMap) {
//		if(userName.equalsIgnoreCase("userName") && userPass.equalsIgnoreCase("userPass")) {
//			session.setAttribute("userName", userName);
//			return "home";
//		} else {
//			modelMap.put("error", "Invalid Account");
//			return "login_form";
//		}
//	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "redirect:../index";
	}
	
	
	//reset pass
	@RequestMapping(value = "/prep_forgot_form.htm", method = RequestMethod.GET)
	public String prepForgotForm(ModelMap map) {
		map.put("device", new Device());
		return "forgot_pass_form";
	}
	
	@RequestMapping(value = "/forgot.htm" , method = RequestMethod.POST)
	public String forgot(Device device,ModelMap map,HttpSession session) {
		
		boolean b = deviceService.validateDevice(device);
		if(b) {
			session.setAttribute("device", device);
			System.out.println(device.getUserId());
			int userId = ((Device)session.getAttribute("device")).getUserId();
			
			List<Device> li = deviceService.selectAll(userId);
			map.put("device", li);
			return "cnfrm_form";
		}else {
			map.put("device", new Device());
			return "login_form";
		}
	}
	
	@RequestMapping(value = "/prep_reset_form.htm", method = RequestMethod.GET)
	public String prepResetForm(@RequestParam int userId, ModelMap map) {
		
		Device device = deviceService.findDevice(userId);
		
		map.put("device", device);
		return "reset_form";
	}
	
	
	@RequestMapping(value = "/reset.htm" , method = RequestMethod.POST)
	public String reset(Device device,ModelMap map ,HttpSession session) {
		
		int userId = ((Device)session.getAttribute("device")).getUserId();
		device.setUserId(userId);
	
		deviceService.updatePassword(device);
		return "index";
	}
	
	

}
