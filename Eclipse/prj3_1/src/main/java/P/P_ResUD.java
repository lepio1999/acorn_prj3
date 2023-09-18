package ptj3_1team;

public class P_ResUD {

	private String resno;
	private String fcode;
	private String departure;
	private String arrival;
	private String sday;
	private String eday;
	private String stime;
	private String etime;
	private String airnum;
	private String airname;

public P_ResUD() {
	// TODO Auto-generated constructor stub
}


	


	public P_ResUD(String resno, String fcode, String departure, String arrival, String sday, String eday, String stime,
		String etime, String airnum, String airname) {
	super();
	this.resno = resno;
	this.fcode = fcode;
	this.departure = departure;
	this.arrival = arrival;
	this.sday = sday;
	this.eday = eday;
	this.stime = stime;
	this.etime = etime;
	this.airnum = airnum;
	this.airname = airname;
}





	@Override
	public String toString() {
		return "P_ResUD [resno=" + resno + ", fcode=" + fcode + ", departure=" + departure + ", arrival=" + arrival
				+ ", sday=" + sday + ", eday=" + eday + ", stime=" + stime + ", etime=" + etime + ", airnum=" + airnum
				+ ", airname=" + airname + "]";
	}





	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getSday() {
		return sday;
	}

	public void setSday(String sday) {
		this.sday = sday;
	}

	public String getEday() {
		return eday;
	}

	public void setEday(String eday) {
		this.eday = eday;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public String getAirnum() {
		return airnum;
	}

	public void setAirnum(String airnum) {
		this.airnum = airnum;
	}

	public String getAirname() {
		return airname;
	}

	public void setAirname(String airname) {
		this.airname = airname;
	}





	public String getResno() {
		return resno;
	}





	public void setResno(String resno) {
		this.resno = resno;
	}



}
