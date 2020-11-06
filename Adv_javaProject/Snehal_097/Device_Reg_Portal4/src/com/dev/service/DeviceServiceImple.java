package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dao.DeviceDao;
import com.dev.dto.Device;

@Service
public class DeviceServiceImple implements DeviceService{

	@Autowired
	private DeviceDao deviceDao;
	
	

	@Override
	public void addDevice(Device device) {
		deviceDao.insertDevice(device);
	}



	@Override
	public boolean findDevice(Device device) {
		
		return deviceDao.checkDevice(device);
	}



	@Override
	public boolean validateDevice(Device device) {
		// TODO Auto-generated method stub
		return deviceDao.verifyUser(device);
	}



	@Override
	public Device findDevice(int userId) {
		// TODO Auto-generated method stub
		return deviceDao.selectUser(userId);
	}



	@Override
	public void updatePassword(Device device) {
		deviceDao.resetPassword(device);
		
	}



	@Override
	public List<Device> selectAll(int userId) {
		// TODO Auto-generated method stub
		return deviceDao.selectAll(userId);
	}



	@Override
	public String forgotPassword(String userName) {
		return deviceDao.forgotPassword(userName);
	}

}
