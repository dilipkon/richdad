package Zombie;

public class Variables {
static int a;
static String b;
private void mm() {
	a=100;
	System.out.println(a);
}
private void mjk() {
	b="dilip";
	System.out.println(b);
}
	
public static void main(String[] args) {
	System.out.println("before object creation"+a);
	Variables h=new Variables();
	h.mm();
	h.mjk();
	System.out.println("after obj create"+b);
	System.out.println("before call new obj"+a);
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
}
