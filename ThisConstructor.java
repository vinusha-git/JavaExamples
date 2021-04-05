package com.javaExamples;

public class ThisConstructor {
	int id;
	String name;
	String place;
	int zip;
	ThisConstructor(int cwid,String fullname,String place){
		this.id=cwid;
		this.name=fullname;
		this.place=place;
		}
	ThisConstructor(int cwid,String fullname,String place,int zipcode)
	{
		this(cwid,fullname,place);
		this.zip=zipcode;
	}
	
void display() {
	System.out.println(id +"  "+ name +"  "+ place +"  "+ zip);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor c1=new ThisConstructor(1, "john", "chicago");
		ThisConstructor c2=new ThisConstructor(2, "riya", "buffalo",120);

		c1.display();
		c2.display();
		

	}

}
