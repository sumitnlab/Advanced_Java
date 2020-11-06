package com.dev.service;

import java.util.List;


import com.dev.dto.Device;
import com.dev.dto.DeviceDetails;

public interface DeviceDetailsService {
	void addDeviceDetails(DeviceDetails deviceDetails);
	void removeDeviceDetails(int deviceId);
	DeviceDetails findDeviceDetails(int deviceId);
	void modifyDeviceDetails(DeviceDetails deviceDetails);
	List<DeviceDetails> selectAll(int userId);


}
