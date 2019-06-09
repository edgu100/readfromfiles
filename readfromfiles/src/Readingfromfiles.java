

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import com.sun.java_cup.internal.internal_error;



public class Readingfromfiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f= new File("C:\\Users\\edgu1\\Desktop\\111.txt");
		readfile(f);
		
	}
	
	public static void readfile(File f){
		List myArray= new ArrayList();
		
		try{
			Scanner sc=new Scanner(f);
			
			while(sc.hasNext()){
				myArray.add(sc.nextInt());
			}
			
			int[] myIntArray=new int[myArray.size()];
			int i=0;
			for(Iterator iterator=myArray.iterator();iterator.hasNext();){
				myIntArray[i]=(Integer)iterator.next();
				i++;
			}
			
			System.out.println(findmax(myIntArray)); 
			prinum(myIntArray);
			System.out.println(avebignum(myIntArray));
			equalnum(myIntArray);
			diffnum(myIntArray);
		}catch (Exception e) {
			System.out.println("cant find the file");
		}
		
	}
	
	public static int findmax(int[] A){
		int num=A[0];
		for(int c=1;c<A.length;c++){
			if(num<A[c]){
				num=A[c];
			}
		}
		System.out.println("the maximum number is:");
		return num;
	}
	
	
	public static void prinum(int[] A){
		System.out.println("the number of prime numbers are");
		for(int a=0;a<A.length;a++){
			int nu=A[a];
			boolean flag=true;
			for(int b=2;b<Math.sqrt(nu);b++){
				if(nu%b==0){
					flag=false;
				}	
			}
			if(flag==true){
				System.out.println(A[a]);
			}	
		}
		
		
	}
	
	public static int avebignum(int[] A){
		float totalnum=0;
		float ave;
		for(int d=0;d<A.length;d++){
			totalnum=totalnum+A[d];
		}
		System.out.println("the average number is:");
		ave=totalnum/A.length;
		System.out.println(ave);
		System.out.println("the numbers that bigger than the average number are:");
		int f=0;
		for(int e=0;e<A.length;e++){
			if(A[e]>ave){
				f++;
				System.out.println(A[e]);
			}
		}
		System.out.println("the number of numbers that bigger than the average number is:");
		return f;	
	}
	
	public static void equalnum(int[] A){
		int f,h=0;
		for(f=0;f<A.length-1;f++){
			if(A[f]==A[f+1]){
				h++;
			}
			else if(A[f]!=A[f+1]){
				System.out.println("not all numbers are equal");
				break;
			}	
		}
		if(h==A.length-1){
			System.out.println("all numbers are equal");
		}
		
	}
	
	public static void diffnum(int[] A){
		int i=0;
		for(int g=0;g<A.length;g++ ){
			for(int h=g+1;h<A.length;h++){
				
				
				if(A[g]==A[h]){
					i++;
				}
				}
			}
		if(i==0){
			System.out.println("all the numbers are different:");
			}
		if(i>0){
			System.out.println("not all the numbers are different:");
		}
		
		
	}
	
}