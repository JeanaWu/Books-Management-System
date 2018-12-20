package abo;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;


import dao.bookDAO;

public class Findname {
	private bookDAO dao;
	private String bname;
	

 
	public bookDAO getDao() {
		return dao;
	}

	public void setDao(bookDAO dao) {
		this.dao = dao;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}


	
	public String find(){
		List list=this.dao.findbook(bname);
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> request=ac.getContextMap();
		request.put("result", list);
		return "find";
	}
}
