package remote.entity;

public class TV {
	String location = "";
	int channel;
	
	public TV(String location) {
		this.location= location;
	}
	public void on() {
		System.out.println("TV is on");
	}
	public void off() {
		System.out.println("TV is off");
	}
	public void setInputChannel(int channel) {
		this.channel=channel;
		System.out.println(location+" TV is set channel "+channel);
	}

} 
  