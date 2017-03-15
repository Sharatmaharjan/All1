package com.ittraining.encapsulations.learn;

public class Home {
	private String name;
	private String address;
	private String homeNumber;
	private String neaNumber;
	private String totalNumberofRoom;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getNeaNumber() {
		return neaNumber;
	}
	public void setNeaNumber(String neaNumber) {
		this.neaNumber = neaNumber;
	}
	public String getTotalNumberofRoom() {
		return totalNumberofRoom;
	}
	public void setTotalNumberofRoom(String totalNumberofRoom) {
		this.totalNumberofRoom = totalNumberofRoom;
	}
public boolean equals(Object paramObject){
	if(paramObject instanceof Home){
		Home home = (Home) paramObject;
		return this.name.equals(home.name);
	}
	return false;
}
@override
public int hashCode(){
int a=10;
a+=this.name.hashCode();
return a;
}
}
