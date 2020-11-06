package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dao.DeviceDetailsDao;
import com.dev.dto.Device;
import com.dev.dto.DeviceDetails;


@Service
public class DeviceDetailsServiceImple implements DeviceDetailsService{

	@Autowired
	private DeviceDetailsDao deviceDetailDao;

	@Override
	public void addDeviceDetails(DeviceDetails deviceDetails) {
		deviceDetailDao.insertDeviceDetails(deviceDetails);
		
	}

	@Override
	public void removeDeviceDetails(int deviceId) {
		
		deviceDetailDao.deleteDeviceDetails(deviceId);
		
	}

	@Override
	public DeviceDetails findDeviceDetails(int deviceId) {
		return deviceDetailDao.selectDeviceDetails(deviceId);
	}

	@Override
	public void modifyDeviceDetails(DeviceDetails deviceDetails) {
		deviceDetailDao.updateDeviceDetails(deviceDetails);
		
	}

	@Override
	public List<DeviceDetails> selectAll(int userId) {
		return deviceDetailDao.selectAll(userId);
	}

	

	}
