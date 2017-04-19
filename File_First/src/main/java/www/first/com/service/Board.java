package www.first.com.service;

public class Board {
	//AS를 쓰지 않으려면 DB컬럼명과 동일하게 적어야함
	private int noard_no;
	private String noard_pw;
	private String noard_title;
	private String noard_content;
	private String noard_user;
	private String noard_date;
	public int getNoard_no() {
		return noard_no;
	}
	public void setNoard_no(int noard_no) {
		this.noard_no = noard_no;
	}
	public String getNoard_pw() {
		return noard_pw;
	}
	public void setNoard_pw(String noard_pw) {
		this.noard_pw = noard_pw;
	}
	public String getNoard_title() {
		return noard_title;
	}
	public void setNoard_title(String noard_title) {
		this.noard_title = noard_title;
	}
	public String getNoard_content() {
		return noard_content;
	}
	public void setNoard_content(String noard_content) {
		this.noard_content = noard_content;
	}
	public String getNoard_user() {
		return noard_user;
	}
	public void setNoard_user(String noard_user) {
		this.noard_user = noard_user;
	}
	public String getNoard_date() {
		return noard_date;
	}
	public void setNoard_date(String noard_date) {
		this.noard_date = noard_date;
	}
}
