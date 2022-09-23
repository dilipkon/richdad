package Zombie;

public class Saviour implements Duty {
@Override
public void kg() {
	System.out.println("dilip is");
	
}
@Override
	public void good() {
		// TODO Auto-generated method stub
	System.out.println("kingmaker");	
	}
@Override
	public void happy() {
		// TODO Auto-generated method stub
	System.out.println("u cannot beat me");	
	}
@Override
	public void jj() {
		// TODO Auto-generated method stub
	System.out.println("forever");	
	}
	
	public static void main(String[] args) {
		Saviour l=new Saviour();
		l.kg();
		l.good();
		
		l.jj();
		l.happy();
	}
	
	
}
