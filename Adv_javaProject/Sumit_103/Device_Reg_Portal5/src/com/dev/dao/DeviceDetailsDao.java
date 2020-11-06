package com.dev.dao;

import java.util.List;
import com.dev.dto.DeviceDetails;

public interface DeviceDetailsDao {
	void insertDeviceDetails(DeviceDetails deviceDetails);
	void deleteDeviceDetails(int deviceId);
	DeviceDetails selectDeviceDetails(int deviceId);
	void updateDeviceDetails(DeviceDetails deviceDetails);
	List<DeviceDetails> selectAll(int userId);
}
