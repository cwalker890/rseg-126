import java.util.*;

public class prime_number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        int max = Integer.parseInt(args[0]);
		for(int i = 1; i <= max; i++) {
			boolean check = checkPrime(i);
			if(check) {
				numList.add(i);
			}
		}
		System.out.println("Prime numbers through " + max);
		System.out.println(numList);
	}

	public static boolean checkPrime(int number){
        for(int i =2; i < number; i++){
        	if(number % i == 0) {
        		return false;
        	}	
        }
        return true;
        
    }
}
