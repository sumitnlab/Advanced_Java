package com.dev.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dev.dto.Device;
import com.dev.dto.DeviceDetails;

@Repository
public class DeviceDetailsDaoImple implements DeviceDetailsDao{
	@Autowired	
	private HibernateTemplate hibernateTemplate;
	
	

	@Override
	public void insertDeviceDetails(DeviceDetails deviceDetails) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(deviceDetails);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

		
	}

	@Override
	public void deleteDeviceDetails(int deviceId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new DeviceDetails(deviceId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public DeviceDetails selectDeviceDetails(int deviceId) {
		DeviceDetails deviceDetails = hibernateTemplate.execute(new HibernateCallback<DeviceDetails>() {

			@Override
			public DeviceDetails doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				DeviceDetails ex = (DeviceDetails)session.get(DeviceDetails.class, deviceId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return deviceDetails;

	}

	@Override
	public void updateDeviceDetails(DeviceDetails deviceDetails) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();

				//DeviceDetails ex = (DeviceDetails)session.get(DeviceDetails.class, deviceDetails.getDeviceId());
				//ex.setCustName(deviceDetails.getCustName());
				System.out.println(deviceDetails.getCustName());
//				ex.setCompany(deviceDetails.getCompany());
//				ex.setEmail(deviceDetails.getEmail());
//				ex.setImeiNo(deviceDetails.getImeiNo());
//				ex.setMobile(deviceDetails.getMobile());
//				ex.setModelName(deviceDetails.getModelName());
//				ex.setModelNo(deviceDetails.getModelNo());
//				ex.setPurchaseDate(deviceDetails.getPurchaseDate());
//				ex.setUidaiNo(deviceDetails.getUidaiNo());
//	
				session.update(deviceDetails);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});

		
	}

	@Override
	public List<DeviceDetails> selectAll(int userId) {
		List<DeviceDetails> expList = hibernateTemplate.execute(new HibernateCallback<List<DeviceDetails>>() {

			@Override
			public List<DeviceDetails> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from DeviceDetails");
				//q.setInteger(0, userId);
				List<DeviceDetails> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return expList;
	}
	

}
