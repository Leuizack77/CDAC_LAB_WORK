package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a1=new Address("F. C. Road","Pune","411016");
		MyUser u1=new MyUser(11,"Abhishek","1111",a1);
		Address a2=new Address("Moshi","Pune","411045");
		MyUser u2=new MyUser(15,"Naksh","2222",a2);
		session.save(a1);
		session.save(u1);
		session.save(a2);
		session.save(u2);
		tr.commit();
		session.close();
		sf.close();
	}

}
