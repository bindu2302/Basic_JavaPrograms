
public class RealNumbers {

	public static void main(String[] args) {
		float athlete1Weight = 68.45F;
		float athlete2Weight = 70.55F;
		double athlete1Time = 9.8576341234;
		double athlete2Time = 10.001233445678;
		String winner = (athlete1Time > athlete2Time)?"Winner of the race: Athelet1": "Winner of the race: Athelet2";
		System.out.println("Weight of Athlete 1: "+ athlete1Weight+" kg");
		System.out.println("Weight of Athlete 2: "+ athlete2Weight+" kg");
		System.out.println("Time taken by  Athlete 1: "+ athlete1Time+" seconds");
		System.out.println("Time taken by  Athlete 2: "+ athlete2Time+" seconds");
		System.out.println(winner);

		
	}

}
