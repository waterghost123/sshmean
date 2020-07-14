package DAO;

import hibernate.Book;
import hibernate.HibernateSessionFactory;
import hibernate.Student;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class Bookdao {
public void add(Book book){
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=null;
		
		try{
		tx=session.beginTransaction();
		session.save(book);
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
public List<Book> deletename( Book book){
	
	
	Session session=HibernateSessionFactory.getSession();
	Transaction tx=null;
	tx=session.beginTransaction();
    Criteria criteria = session.createCriteria(Book.class);
    criteria.add(Restrictions.and(Restrictions.eq("indetifier",book.getIndentifier()),
			Restrictions.eq("bookname",book.getBookname())));

	List<Book> cs = criteria.list();
	
	
	tx.commit();
	session.close();
	
	
	return cs;
	
}
public void delete(int id){
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=null;
		
		try{
		tx=session.beginTransaction();
		Book book=(Book)session.get(Book.class, id);
		if(book != null){
			session.delete(book);
		}
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
public void update(int id,Book book){
	
	Session session=HibernateSessionFactory.getSession();
	Transaction tx=null;
	
	try{
	tx=session.beginTransaction();	
	Book s1=(Book)session.get(Book.class, id);
	s1.setIndentifier(book.getIndentifier());
	s1.setBookname(book.getBookname());
	s1.setNumber(book.getNumber());
	
		session.update(s1);
	
	
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
public List<Book> check(Book book) {
	  
	Session session=HibernateSessionFactory.getSession();
	Transaction tx=null;
	tx=session.beginTransaction();
    Criteria criteria = session.createCriteria(Book.class);
    criteria.add(Restrictions.or(Restrictions.eq("indentifier",book.getIndentifier()),
			Restrictions.eq("bookname",book.getBookname())));
    

	List<Book> cs = criteria.list();
	
	
	tx.commit();
	session.close();
	
	
	return cs;
}
}
