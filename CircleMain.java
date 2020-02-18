package circle;

public class CircleMain extends Circle  {

	public static void main(String[] args) {
		CricleArea  ob1 = new CricleArea (10);
		CricleRound ob2 = new CricleRound (10);
		
		ob1.output();
		ob1.compute();
		ob2.output();
		ob2.compute();
		
	}

}
