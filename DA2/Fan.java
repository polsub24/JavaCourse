import java.util.*;
public class Fan {
	public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
	private int speed ;
	private boolean state;
	private double radius;
	String colour;
	public Fan(){//No arg constructor
		this.speed = SLOW;
		this.state = false;
		this.radius = 5;
		this.colour = "Blue";
	}
	public void getdata(){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the fan speed 1 for SLOW, 2 for MEDIUM or 3 for FAST: ");
		this.speed = sc.nextInt();
		System.out.println("Enter the fan state true for on and false for off: ");
		this.state = sc.nextBoolean();
		System.out.println("Enter the radius of the fan: ");
		this.radius = sc.nextDouble();
		System.out.println("Enter the colour of the fan: ");
		this.colour = sc.next();
	}
	public String toString(){
		if (state){
			return "Fan is on: Speed = "+speed+", Colour = "+colour+", Radius = "+radius;
		}
		else{
			return "Fan is off: Colour = "+colour+", Radius = "+radius;
		}
	}
	public static void main(String[] args) {
		Fan f = new Fan();
		Fan f1 = new Fan();
		Scanner obj = new Scanner(System.in);
		f.speed = FAST;
		f.state = true;
		f.radius = 10;
		f.colour = "yellow";
		System.out.println(f.toString());
		f1.speed = MEDIUM;
		f1.state = false;
		f1.radius = 5;
		f1.colour ="blue";
		System.out.println(f1.toString());
	}
}
