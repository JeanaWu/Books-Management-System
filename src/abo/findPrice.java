package abo;


import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import dao.bookDAO;

public class findPrice {
	private String min;
	private String max;
	private bookDAO dao;
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public bookDAO getDao() {
		return dao;
	}
	public void setDao(bookDAO dao) {
		this.dao = dao;
	}
	
	public String findPrice(){
		List list=this.dao.findBookPrice((Integer.parseInt(min)), (Integer.parseInt(max)));
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> request=ac.getContextMap();
		request.put("result", list);
		return "find";
	}
}
