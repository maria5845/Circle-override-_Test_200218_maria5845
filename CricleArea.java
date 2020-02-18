package circle;

public class CricleArea extends Circle {
 
	public CricleArea(int r) {
	  super(r);
  }
	
	public void compute() {
		System.out.print(r*r*PI);
		System.out.print("\n");
	}
	public void output() {
		System.out.print("¿øÀÇ³ÐÀÌ : " );
	}
}
