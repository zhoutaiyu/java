package tel;

public class Telephone {
  //�绰Ʒ�ơ��绰���롢ͨ��ʱ�䡢����
	private String phoneBrand;
	private String phoneNumber;
	private double callTime;
	private double rate;
	
	public Telephone(String phoneBrand,String phoneNumber,double callTime,double rate){
		this.phoneBrand=phoneBrand;
		this.phoneNumber=phoneNumber;
		this.callTime=callTime;
		this.rate=rate;
	}
	
	public Telephone(String phoneBrand,String phoneNumber,double rate){
		this.phoneBrand=phoneBrand;
		this.phoneNumber=phoneNumber;
		this.rate=rate;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getCallTime() {
		return callTime;
	}

	public void setCallTime(double callTime) {
		this.callTime = callTime;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	

}
