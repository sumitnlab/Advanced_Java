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



@Repository
public class DeviceDaoImple implements DeviceDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertDevice(Device device) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(device);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}
	
	@Override
	public boolean checkDevice(Device device) {
		boolean bool = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Device where userName = ? and userPass = ?");
				q.setString(0, device.getUserName());
				q.setString(1, device.getUserPass());
				List<Device> li = q.list();
				boolean flag = !li.isEmpty();
				device.setUserId(li.get(0).getUserId());
			//	System.out.println();
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return bool;
	}

	@Override
	public boolean verifyUser(Device device) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Device where Email = ? ");
				q.setString(0, device.getEmail());
				//q.setString(1, device.getUserName());
				List<Device> li  = q.list();
				boolean flag = !li.isEmpty();
				//user.setUserId(li.get(0).getUserId());
				device.setUserId(li.get(0).getUserId());
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	
	}

	@Override
	public Device selectUser(int userId) {
		Device usr = hibernateTemplate.execute(new HibernateCallback<Device>() {

			@Override
			public Device doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Device us = (Device) session.get(Device.class, userId);
				tr.commit();
				session.flush();
				session.close();
				return us;
			}
			
		});
		return usr;
	}

	@Override
	public void resetPassword(Device device) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr =  session.beginTransaction();
				Device usr =	(Device) session.get(Device.class, device.getUserId());
				//usr.setPassword(device.getPassword());
				usr.setUserPass(device.getUserPass());
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
				
	}

	@Override
	public List<Device> selectAll(int userId) {
		List<Device> list = hibernateTemplate.execute(new HibernateCallback<List<Device>>() {

			@Override
			public List<Device> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Device where userId = ?");
				q.setInteger(0, userId);
				List<Device> li = q.list();
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return list;
	}

	@Override
	public String forgotPassword(String userName) {
		String password = hibernateTemplate.execute(new HibernateCallback<String>() {

			@Override
			public String doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Device where Email = ?");
				q.setString(0, userName);
				List<Device> li = q.list();
				String pass = null;
				if(!li.isEmpty())
					pass = li.get(0).getUserPass();
				tr.commit();
				session.flush();
				session.close();
				return pass;
			}
			
		});
		return password;
	}

		
}
