package com.dev.dao;


import java.util.List;

import com.dev.dto.Device;


public interface DeviceDao {
	void insertDevice(Device device);
	boolean checkDevice(Device device);
	String forgotPassword(String userName);
	boolean verifyUser(Device device);
	Device selectUser(int userId);
	void resetPassword(Device device);
	List<Device> selectAll(int userId);
	void uploadImage(String profilePic,int userId);
}
