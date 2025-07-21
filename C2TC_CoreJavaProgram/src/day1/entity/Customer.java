package day1.entity;

public class Customer {
	private int cid;
	private String cname;
	private String city;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCName() {
		return cname;
	}
	public void setCName(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [Customer id=" + cid + ", Customer name=" + cname + ", city=" + city + "]";
	}

	
	
}
