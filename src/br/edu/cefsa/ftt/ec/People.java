package br.edu.cefsa.ftt.ec;

public class People {

	private int size = 0;
	private String name;
	private float val = 0;
	
	//Construtor
	public People(int size, String name, float val ) {
		super();
		/*
		this.size = size;
		this.name = name;
		this.val = val;
		*/
		this.setSize(size);
		this.setName(name);
		this.setVal(val);
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getVal() {
		return val;
	}
	public void setVal(float val) {
		
		if (val < 0)
			this.val = 0;
		else
			this.val = val;
		
	} //setVal

	//Sobre escrevendo "toString"
	public String toString() {
		return this.getName() + " - " + this.getVal();
	} //toString
	
} //People
