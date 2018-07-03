package javacode;

public class array {
	public static void main(String[] args){
		int a1=4;
		int a2=5;
		int a3=1;
		int a4=2;
		int a5=3;
		int temp;
		int numbers[]=new int[5];
		numbers[0]=a1;numbers[1]=a2;numbers[2]=a3;numbers[3]=a4;numbers[4]=a5;

		for(int i=0;i<4;i++){
			for(int j=i+1;j<5;j++){
				if(numbers[i]>numbers[j]){
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
			System.out.println(numbers[i]);
		}
		System.out.println(numbers[4]);
		

	}
}