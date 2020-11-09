package undo.entity;

public class Stereo {
	String location = "";
	public Stereo(String location) {
		this.location= location;
	}
	public void on() {
		System.out.println("Stereo is on");
	}
	public void off() {
		System.out.println("Stereo is off");
	}
	public void setCD() {
		System.out.println(location+" stero is set for cd");
	}
	public void setVolumne(int volume) {
		System.out.println(location+" stero is set to "+volume);
	}
} 
  