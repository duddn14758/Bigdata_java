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
		int qsort[]={3,5,4,7,54,34,245,36};
		quick(qsort,0,7);
		for(int i=0;i<7;i++)
			System.out.print(qsort[i]+" ");
		System.out.println("");
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
	static void quick(int []arr,int left, int right){
		int i,j,pivot,tmp;
		i=left+1;
		j=right;
		pivot=left;
		if(left<right){
			while(i>right){
				if(arr[i]<arr[pivot]){
					j++;
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}				
			}
			tmp=arr[left];
			arr[left]=arr[j];
			arr[j]=tmp;
			pivot=j;
			quick(arr,left,pivot-1);
			quick(arr,pivot+1,right);
		}
		
	}
}