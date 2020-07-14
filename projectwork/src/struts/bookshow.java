package struts;

import hibernate.Book;
import hibernate.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class bookshow extends ActionSupport {
	List<Book> list;
	
	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	
	public String biao(){
		Session session=HibernateSessionFactory.getSession();
		ActionContext context=ActionContext.getContext();
		ArrayList mylist=(ArrayList) session.createQuery("from Book").list();
		this.list = mylist;
       for(int i=0;i<mylist.size();i++){  
           Book stu=(Book)mylist.get(i);  
           System.out.println("indentifier:"+stu.getIndentifier()+"bookname:"+stu.getBookname()+"number:"+stu.getNumber());
       }
       session.close();
       return "body";
	}

	
}
