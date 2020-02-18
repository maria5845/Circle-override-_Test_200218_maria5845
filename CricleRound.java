package circle;

public class CricleRound extends Circle {
	public CricleRound(int r) {
		  super(r);
	  }
		
		public void compute() {
			System.out.print(r*2*PI);
			System.out.print("\n");
		}
		public void output() {
			System.out.print("원의둘레 : ");
		}
}
