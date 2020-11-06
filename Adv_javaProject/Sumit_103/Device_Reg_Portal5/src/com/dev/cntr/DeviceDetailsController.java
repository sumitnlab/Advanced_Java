package com.dev.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.dev.dto.Device;
import com.dev.dto.DeviceDetails;
import com.dev.service.DeviceDetailsService;



@Controller
public class DeviceDetailsController {
	
	@Autowired
	private DeviceDetailsService deviceDetailsService;
	
	@RequestMapping(value = "/prep_device_add_form.htm",method = RequestMethod.GET)
	public String prepDeviceAddForm(ModelMap map) {
		map.put("deviceDetails", new DeviceDetails());
		return "device_add_form";
	}
	
	@RequestMapping(value = "/device_add.htm",method = RequestMethod.POST)
	public String expenseAdd(DeviceDetails deviceDetails,HttpSession session) {
		int userId = ((Device)session.getAttribute("device")).getUserId();
		deviceDetails.setUserId(userId); 
		deviceDetailsService.addDeviceDetails(deviceDetails);
		return "home";
	}
	
	@RequestMapping(value = "/view_device.htm",method = RequestMethod.GET)
	public String allDeviceDetails(ModelMap map,HttpSession session,DeviceDetails deviceDetails) {
		int userId = ((Device)session.getAttribute("device")).getUserId();
		System.out.println(userId);
		List<DeviceDetails> li = deviceDetailsService.selectAll(userId);
		map.put("expList", li);
		return "view_device";
	}					
	

	
	@RequestMapping(value = "/device_delete.htm",method = RequestMethod.GET)
	public String deviceDetailsDelete(@RequestParam int deviceId,ModelMap map,HttpSession session) {
		
		deviceDetailsService.removeDeviceDetails(deviceId); 
		
		int userId = ((Device)session.getAttribute("device")).getUserId();
		//List li = (List) deviceDetailsService.selectAll(userId);
		List<DeviceDetails> li = deviceDetailsService.selectAll(userId);
		map.put("expList", li);
		return "view_device";
	}
	
//	@RequestMapping(value = "/device_update_form.htm",method = RequestMethod.GET)
//	public String deviceUpdateForm(@RequestParam int deviceId,ModelMap map) {
//		
//		DeviceDetails d = deviceDetailsService.findDeviceDetails(deviceId);
//		map.put("deviceDetails", d);
//		
//		return "device_update_form";
//	}
//	
//	@RequestMapping(value = "/device_update.htm",method = RequestMethod.POST)
//	public String deviceDetailsUpdate(DeviceDetails deviceDetails,ModelMap map,HttpSession session) {
//		
//		int userId = ((Device)session.getAttribute("device")).getUserId();
//		System.out.println("hello suraj"+userId);
//		deviceDetails.setUserId(userId);
//		//deviceDetails.setDeviceId(userId);
//		deviceDetailsService.modifyDeviceDetails(deviceDetails);
//			
//		List<DeviceDetails> li = deviceDetailsService.selectAll(userId);
//		map.put("expList", li);
//		return "view_device";
//	}
//	
	
	@RequestMapping(value = "/device_update_form.htm", method = RequestMethod.GET)
	public String deviceUpdateForm(@RequestParam int deviceId, ModelMap map) {

		DeviceDetails d = deviceDetailsService.findDeviceDetails(deviceId);
		map.put("deviceDetails", d);

		return "device_update_form";
	}

	@RequestMapping(value = "/device_update.htm", method = RequestMethod.POST)
	public String deviceDetailsUpdate(DeviceDetails deviceDetails, ModelMap map, HttpSession session) {

		// int userId = ((Device)session.getAttribute("device")).getUserId();
		// int userId = ((Device)session.getAttribute("device")).getUserId();
		// int userId = (Integer)session.getAttribute("device");
		// System.out.println("hello suraj"+userId);
		// deviceDetails.setUserId(userId);
		// deviceDetails.setDeviceId(userId);
		deviceDetailsService.modifyDeviceDetails(deviceDetails);

		List<DeviceDetails> li = deviceDetailsService.selectAll(0);
		map.put("expList", li);
		return "view_device";
	}
	
}
