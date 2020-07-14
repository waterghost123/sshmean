package DAO;

import hibernate.HibernateSessionFactory;
import hibernate.Student;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;







public class Studentdao {
public void add(Object student){
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=null;
		
		try{
		tx=session.beginTransaction();
		session.save(student);
//		Student s1=(Student)session.get(Student.class, 2);
//		s1.setStudentname("bbbbb");
		//session.delete(s1);
//		session.update(s1);
		tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
public List<Student> deletename( Student student){
	
	
	Session session=HibernateSessionFactory.getSession();
	Transaction tx=null;
	tx=session.beginTransaction();
    Criteria criteria = session.createCriteria(Student.class);
    criteria.add(Restrictions.and(Restrictions.eq("username",student.getUsername()),
			Restrictions.eq("password",student.getPassword())));

	List<Student> cs = criteria.list();
	
	
	tx.commit();
	session.close();
	
	
	return cs;
	
}
public void delete(int id){
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=null;
		
		try{
		tx=session.beginTransaction();
		Student student1=(Student)session.get(Student.class, id);
		session.delete(student1);
//		Student s1=(Student)session.get(Student.class, 2);
//		s1.setStudentname("bbbbb");
		//session.delete(s1);
//		session.update(s1);
		tx.commit();
		}catch(Exception e){
			if(tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
public void update(Object object){
	
	Session session=HibernateSessionFactory.getSession();
	Transaction tx=null;
	
	try{
	tx=session.beginTransaction();
	session.update(object);
//	Student s1=(Student)session.get(Student.class, 2);
//	s1.setStudentname("bbbbb");
	//session.delete(s1);
//	session.update(s1);
	tx.commit();
	}catch(Exception e){
		if(tx!=null){
			tx.rollback();
		}
		e.printStackTrace();
	}finally{
		session.close();
	}
}
public Object get(Class cla,Serializable id){
	Object object=null;
	Session session=HibernateSessionFactory.getSession();
	
	
	try{
	object=session.get(cla,id);
	}catch(Exception e){
		
		e.printStackTrace();
	}finally{
		session.close();
	}
	return object;
}
public List<Student> check(Student student) {
	  
	Session session=HibernateSessionFactory.getSession();
	Transaction tx=null;
	tx=session.beginTransaction();
    Criteria criteria = session.createCriteria(Student.class);
    criteria.add(Restrictions.and(Restrictions.eq("username",student.getUsername()),
			Restrictions.eq("password",student.getPassword())));

	List<Student> cs = criteria.list();
	
	
	tx.commit();
	session.close();
	
	
	return cs;
}

}
