package javacode;

public class pibonacci {
	public static void main(String[] args){
		int first=1;
		int second=1;
		int i;
		
		System.out.print(first+" ");
		
		for(i=0;i<=8;i++){
			int pibonacci=first+second;
			first=second;
			second=pibonacci;
			System.out.print(first+" ");
		}
	}
	
}
