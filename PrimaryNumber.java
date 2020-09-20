import java.util.Scanner;

public class Primary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		int num;
    	System.out.print("Enter Number: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
        for(int i = 2 ; i<num/2; i++) {
        	if(num%2 == 0) {
        		flag = true;
        		break;
        	}
        }
        if(!flag)
        	System.out.println("Prime Number");
        else
        	System.out.println("Not Prime");
        scan.close();

	}

}
