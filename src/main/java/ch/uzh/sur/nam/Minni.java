package ch.uzh.sur.nam;

public class Minni {

	private Pippo pippo;
	private Pluto pluto;
	
	public Minni(String name){
		this.pippo = new Pippo(name);
		this.pluto = new Pluto(name);
	}
	
 
	public void print(){
		System.out.println(pippo.getName());
	}
}
