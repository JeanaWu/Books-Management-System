package dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import vo.TBook;

@Resource
public class bookDAO extends HibernateDaoSupport implements IBDAO {


	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void updateBook(TBook tbook) {
		this.getHibernateTemplate().update(tbook);
	}


	@Override
	public List findBookPrice(int min, int max) {
		String hql="from TBook where BPRICE  between "+min+" and "+max;
		List list= super.getHibernateTemplate().find(hql);
		return list;
	}


	@Override
	public List findbook(String bname) {
		// TODO Auto-generated method stub
		String hql="from TBook as tbook where tbook.bname like '%"+bname+"%'";
		List list=super.getHibernateTemplate().find(hql);
		return list;
	}


	@Override
	public TBook find(String ID) {
		TBook tbook=this.getHibernateTemplate().get(TBook.class, ID);
		return tbook;
	}


	@Override
	public void addBook(TBook tbook) {
		System.out.println("111:"+tbook.getBname());
		this.getHibernateTemplate().save(tbook);
		
	}


	

}
