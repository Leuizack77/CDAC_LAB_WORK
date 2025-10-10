import java.util.Date;

public class Vehicle {
	private int vid;
	private String Oname;
	private String vtype;
	private Date dop;
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getOname() {
		return Oname;
	}
	public void setOname(String oname) {
		Oname = oname;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	
	
	public Vehicle(int vid, String oname, int i, Date dop) {
		super();
		this.vid = vid;
		this.Oname = oname;
		this.vtype = vtype;
		this.dop = dop;
	}
	
	
	public Vehicle() {
		super();
		this.vid = 0;
		this.Oname = null;
		this.vtype = null;
		this.dop = null;	
	}
	
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", Oname=" + Oname + ", vtype=" + vtype + ", dop=" + dop + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
