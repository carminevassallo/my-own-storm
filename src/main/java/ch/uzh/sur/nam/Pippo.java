package ch.uzh.sur.nam;

public class Pippo {

	private String name;
	
	public Pippo(String name){
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println("hello "+getName());
	}
	
}
