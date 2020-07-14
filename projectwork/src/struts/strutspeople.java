package struts;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import hibernate.Book;
import hibernate.HibernateSessionFactory;
import hibernate.Student;
import Been.Beener;
import DAO.Bookdao;
import DAO.Peopledao;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class strutspeople extends ActionSupport {
	Beener beener;
	List<Student> list;
	
	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Beener getBeener() {
		return beener;
	}

	public void setBeener(Beener beener) {
		this.beener = beener;
	}
	public String workdo() throws Exception{
		if(beener.getChaozuo().equals("删除")){
			int ch=0;
			Student student=new Student();
			Peopledao peopledao=new Peopledao();
			student.setUsername(beener.getUsername());
			student.setPassword(beener.getPassword());
			List<Student>cs=peopledao.check(student);
			 for (Student c :  cs) {  
					ch=c.getId();
				}
			peopledao.delete(ch);
			return "bodyto";
		
		}else if(beener.getChaozuo().equals("添加")){
			Student student=new Student();
			Peopledao peopledao=new Peopledao();
			student.setUsername(beener.getUsername());
			student.setPassword(beener.getPassword());
			peopledao.add(student);
			return "bodyto";
		}else if(beener.getChaozuo().equals("修改")){
			int ch=0;
			Student student=new Student();
			Peopledao peopledao=new Peopledao();
			student.setUsername(beener.getUsername());
			student.setPassword(beener.getPassword());
			List<Student>cs=peopledao.check(student);
			 for (Student c :  cs) {  
					ch=c.getId();
				}
			 Student student1=new Student();
				Peopledao peopledao1=new Peopledao();
				student1.setUsername(beener.getUsername());
				student1.setPassword(beener.getPassword());
				peopledao1.update(ch, student1);
				return "bodyto";
		}
		return null;
	}
	public String biao(){
		Session session=HibernateSessionFactory.getSession();
		ActionContext context=ActionContext.getContext();
		ArrayList mylist=(ArrayList) session.createQuery("from Student").list();
		this.list = mylist;
       for(int i=0;i<mylist.size();i++){  
           Student stu=(Student)mylist.get(i);  
           System.out.println("username:"+stu.getUsername()+"password:"+stu.getPassword());
       }
       session.close();
       return "bodytwo";
	}
	
}
