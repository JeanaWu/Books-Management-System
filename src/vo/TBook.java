package vo;

import java.util.Date;

/**
 * TBook entity. @author MyEclipse Persistence Tools
 */

public class TBook implements java.io.Serializable {

	// Fields

	private String bid;
	private String bname;
	private String bauther;
	private String btype;
	private Integer bprice;
	private Integer bamount;
	private Date bpubdate;


	@Override
	public String toString() {
		return "TBook [bid=" + bid + ", bname=" + bname + ", bauther=" + bauther + ", btype=" + btype + ", bprice="
				+ bprice + ", bamount=" + bamount + ", bpubdate=" + bpubdate + "]";
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		System.out.println("444:"+bid);

		this.bid = bid;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		System.out.println("444:"+bname);

		this.bname = bname;
	}

	public String getBauther() {
		return this.bauther;
	}

	public void setBauther(String bauther) {
		this.bauther = bauther;
	}

	public String getBtype() {
		return this.btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public Integer getBprice() {
		return this.bprice;
	}

	public void setBprice(Integer bprice) {
		this.bprice = bprice;
	}

	public Integer getBamount() {
		return this.bamount;
	}

	public void setBamount(Integer bamount) {
		this.bamount = bamount;
	}

	public Date getBpubdate() {
		return this.bpubdate;
	}

	public void setBpubdate(Date bpubdate) {
		this.bpubdate = bpubdate;
	}

}