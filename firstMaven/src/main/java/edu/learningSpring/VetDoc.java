package edu.learningSpring;

public class VetDoc extends Doctor{
	
	public Animal animal;
	
//constructors
	public VetDoc(int docID, String name, Animal animal) {
		super(docID, name);
		this.animal = animal;
	}
	public VetDoc(Animal animal) {
		super();
		this.animal = animal;
	}
	public VetDoc(int docID, String name) {
		super(docID, name);
	}


	@Override
	public void check() {
		super.check();
		System.out.println("patient resolved to be an animal");
		animal.details();
	}


}
