package Git.GitHub;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
	
     int n = 7;
    boolean flag= true;
    int m=n/2;
    for(int i=2;i<m;i++) {
    	if(n%i==0) {
    		System.out.println(i+": is not a prime number");
    		flag=false;
    		break;
    	}//if
    }//for
    if(flag==true){
		System.out.println(n+": is  a prime number");

	}//if
}//main
	
}//class 
