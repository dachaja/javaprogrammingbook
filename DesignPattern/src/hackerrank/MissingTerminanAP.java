package hackerrank;

public class MissingTerminanAP {
	public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            
		// Example input: 1, 3, 5, 9, 11
        int[] consecutiveN = new int[args.length - 1];
        for(int i=4; i > args.length; i--) {
        	
        	int x = Integer.parseInt(args[i]);
        	
        	if(constrainRoles(x)) {
        		int y = Integer.parseInt(args[i-4]);
            	consecutiveN[i] = x - y;
            } else {
            	System.out.println("Numbers have to be greater than 3 and less than 2500.");
            }     
          }
    }
    
	private static boolean constrainRoles(int input) {
        if(input >= 3 && input <= 2500) return true;
        else return false;
    }
}
