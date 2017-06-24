package edu.learningSpring;

public class Doctor {
	public int DocID;
	public String name;
	
	public int getDocID() {
		return DocID;
	}

	public void setDocID(int docID) {
		DocID = docID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Doctor(int docID, String name) {
		super();
		DocID = docID;
		this.name = name;
	}

	public Doctor() {
		super();
	}

	public void check(){
		System.out.println("checking patient!!!!");
		
	}

}
