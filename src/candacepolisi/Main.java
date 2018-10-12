package candacepolisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("heya, enter an integer and let me give you the sum of all the integers from 1 to that number");
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        int r= 0;
        for (int c=x; c>0; c--){
                r+=c;
        }
        System.out.println("the sum of all the numbers 1-" + x+ "  is  "+ r);
        }
    }

