package tel;

public class Mobilephone extends Telephone {
	private String networkType;
	private double callingTime;
	private double calledTime;
	
	
	public Mobilephone(String phoneBrand, String phoneNumber,double rate,String networkType,double callingTime,double calledTime) {
		super(phoneBrand, phoneNumber,rate);
		this.networkType=networkType;
		this.callingTime=callingTime;
		this.calledTime=calledTime;
	}

	public String getNetworkType() {
		return networkType;
	}


	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}


	public double getCallingTime() {
		return callingTime;
	}


	public void setCallingTime(double callingTime) {
		this.callingTime = callingTime;
	}


	public double getCalledTime() {
		return calledTime;
	}


	public void setCalledTime(double calledTime) {
		this.calledTime = calledTime;
	}

}
