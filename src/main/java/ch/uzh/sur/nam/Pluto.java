package ch.uzh.sur.nam;

public class Pluto {

	private String name;
	
	public Pluto(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public void print(){
		System.out.println(getName());
	}
	
	public void print1(){
		System.out.println(getName());
	}
	
	
	
}
