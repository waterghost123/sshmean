package struts;

import hibernate.Book;
import hibernate.HibernateSessionFactory;
import hibernate.Student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Been.Twobeen;
import DAO.Bookdao;
import DAO.Studentdao;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class strutswork extends ActionSupport {
	List<Book> list;
	Twobeen twobeener;
	
	public Twobeen getTwobeener() {
		return twobeener;
	}

	public void setTwobeener(Twobeen twobeener) {
		this.twobeener = twobeener;
	}

	
	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public String bookdo() throws Exception{
		if(twobeener.getChaozuo().equals("删除")){
		int ch=0;
		Book book=new Book();
		Bookdao bookdao=new Bookdao();
		book.setIndentifier(twobeener.getIndentifier());
		book.setBookname(twobeener.getBookname());
		List<Book>cs=bookdao.check(book);
		 for (Book c :  cs) {  
				ch=c.getId();
			}
		bookdao.delete(ch);
		return "biao";
		}else if(twobeener.getChaozuo().equals("添加")){
			Book book=new Book();
			Bookdao bookdao=new Bookdao();
			book.setIndentifier(twobeener.getIndentifier());
			book.setBookname(twobeener.getBookname());
			book.setNumber(twobeener.getNumber());
			bookdao.add(book);
			return "biao";
		}else if(twobeener.getChaozuo().equals("修改")){
			int ch=0;
			Book book=new Book();
			Bookdao bookdao=new Bookdao();
			book.setIndentifier(twobeener.getIndentifier());
			book.setBookname(twobeener.getBookname());
			List<Book>cs=bookdao.check(book);
			 for (Book c :  cs) {  
					ch=c.getId();
				}
			 Book book1=new Book();
			 Bookdao bookdao1=new Bookdao();
			 book1.setIndentifier(twobeener.getIndentifier());
				book1.setBookname(twobeener.getBookname());
				book1.setNumber(twobeener.getNumber());
				bookdao1.update(ch, book1);
				return "biao";
		}
		return null;
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
