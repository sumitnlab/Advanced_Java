package com.dev.service;

import java.util.List;

import com.dev.dto.Device;

public interface DeviceService {
	void addDevice(Device device);
	boolean findDevice(Device device);
	String forgotPassword(String userName);//for mail
	boolean validateDevice(Device device);
	Device findDevice(int userId);
	void updatePassword(Device device);
	List<Device> selectAll(int userId);

}
