package struts;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import hibernate.Book;
import hibernate.HibernateSessionFactory;
import hibernate.Student;


import Been.Twobeen;
import Been.been;
import DAO.Studentdao;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class strutstest extends ActionSupport {
	been beener;
	
	public been getBeener() {
		return beener;
	}

	public void setBeener(been beener) {
		this.beener = beener;
	}

	public String actionlist()throws Exception{
		if(beener.getWho().equals("学生")){
			if(beener.getCaozuo().equals("注册")){
				Student student=new Student();
				Studentdao studentdao=new Studentdao();
				student.setUsername(beener.getUsername());
				student.setPassword(beener.getPassword());
				studentdao.add(student);
				return "zhuceto";
			}else{
				String cc=null;
				String cq=null;
				Studentdao studentdao=new Studentdao();
				Student student=new Student();
				student.setUsername(beener.getUsername());
				student.setPassword(beener.getUsername());
				List <Student>list= studentdao.check(student);
				  for (Student c :  list) {  //������
						cc=c.getUsername();
						cq=c.getPassword();
					}
				if((cc!=null)&&(cq!=null)){
					return "biaobb";	
				}else{
					return "failt";
				}
			}
		}else {
			if(beener.getCaozuo().equals("注册")){
				Student student=new Student();
				Studentdao studentdao=new Studentdao();
				student.setUsername(beener.getUsername());
				student.setPassword(beener.getPassword());
				studentdao.add(student);
				return "zhuceto";
			}else{
				String cc=null;
				String cq=null;
				Studentdao studentdao=new Studentdao();
				Student student=new Student();
				student.setUsername(beener.getUsername());
				student.setPassword(beener.getUsername());
				List <Student>list= studentdao.check(student);
				  for (Student c :  list) {  //������
						cc=c.getUsername();
						cq=c.getPassword();
					}
				if((cc!=null)&&(cq!=null)){
					return "biaoll";	
				}else{
					return "failt";
				}
			
		}
		
		}
	}
}

	
	
	

