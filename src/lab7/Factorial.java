package lab7;

public class Factorial {
	
	public int getFact(int fac){
		
		int result = 1;
		for (int i = 1; i <= fac; i++) {
			result = result * i;
		}
		return result;
	}
}
