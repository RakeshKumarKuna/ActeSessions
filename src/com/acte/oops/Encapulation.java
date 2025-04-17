package com.acte.Oops;

public class Encapulation {
private int stuid=45;
public int getStuid() {
	return stuid;
}
//this means current class objects
public void setStuid(int stuid) {
	//this.stuid = stuid;
	 this.stuid=stuid;
}
private String stuName="prasanna";
/*
public int getstuId() {
	return stuid;
}

public void setstuId(int id) {
	stuid=id;
}*/
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}


}
