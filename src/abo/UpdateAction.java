package abo;

import com.opensymphony.xwork2.ActionSupport;

import dao.bookDAO;

import vo.TBook;

public class UpdateAction extends ActionSupport{
 
	
	private String bid,bamount;
	private bookDAO dao;

	
	public String getBid() {
		return bid;
	}


	public void setBid(String bid) {
		this.bid = bid;
	}


	public String getBamount() {
		return bamount;
	}


	public void setBamount(String bamount) {
		this.bamount = bamount;
	}


	public bookDAO getDao() {
		return dao;
	}


	public void setDao(bookDAO dao) {
		this.dao = dao;
	}


	public String updateBook(){
		TBook tbook=this.dao.find(bid);
		tbook.setBamount(Integer.parseInt(bamount));
		this.dao.updateBook(tbook);
		return "success";
	}

}
	

