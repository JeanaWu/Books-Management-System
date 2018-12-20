package abo;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.bookDAO;
import vo.TBook;

public class ZJAction extends ActionSupport {

	private TBook tbook;
	private bookDAO dao;
	
	public String addBook(){
		  this.dao.addBook(tbook);
		  System.out.println("222:"+tbook.getBname());
		  return "success";
	}
		//tbook = new TBook();
		/*HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("bname");
		System.out.println(name);
		String id = request.getParameter("bid");
		System.out.println(id);
		String auther = request.getParameter("bauther");
		System.out.println(auther);
		String type = request.getParameter("btype");
		System.out.println(type);
		String price = request.getParameter("bprice");
		System.out.println(price);
		String amount = request.getParameter("bamount");
		System.out.println(amount);
		String pubdate = request.getParameter("bpubdate");
		System.out.println(pubdate);
		try {
			//tbook.setBamount(Integer.parseInt(amount));
			//tbook.setBauther(auther);
//			tbook.setBid(id);
//			tbook.setBname(name);
//		
//			tbook.setBpubdate(new Date());
//			tbook.setBprice(Integer.parseInt(price));
//			tbook.setBtype(type);
			System.out.println("********************");
			System.out.println(tbook);
			System.out.println("***********************888");
			this.dao.addBook(tbook);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return "success";
	}
	*/
	public TBook getTbook() {
		return tbook;
	}

	public void setTbook(TBook tbook) {
		System.out.println("333:"+tbook.getBname());
		this.tbook = tbook;
	}

/*	
	public TBook getBook(){
		return tbook;
	}
	
	public void setBook(TBook tbook) {
		System.out.println("333:"+tbook.getBname());
		this.tbook = tbook;
	}
*/
	public bookDAO getDao() {
		return dao;
	}

	public void setDao(bookDAO dao) {
		this.dao = dao;
	}
	

}
	

