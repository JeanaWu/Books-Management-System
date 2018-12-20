package dao;

import java.util.List;

import vo.TBook;

public interface IBDAO {
 public void addBook(TBook tbook);
 public void updateBook(TBook tbook);
 public List findBookPrice(int min,int max);
 public List findbook(String bname);
 public TBook find(String ID);
 
}
