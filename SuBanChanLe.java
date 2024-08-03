package sadasdádasdas;

import java.util.Random;
import java.util.Scanner;

public class ádasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int a1=n;
		int M[]=new int[n];
		int ok1=1;
		for(int i=0;i<n;i++) {
			M[i]=ok1;
			ok1++;
		}
		
		int N[]=new int[n];
		N=M;
		int count1=0;
		while(n>1) {
			int count=0;
			if(count1%2==0) {
				for(int i=0;i<n;i++) {
					if(i%2!=0) {
						N[count]=N[i];
						count++;
					}
				}
			}
			else {
				for(int i=0;i<n;i++) {
					if(i%2==0) {
						N[count]=N[i];
						count++;
					}
				}
			}
			n=count;
			count1++;
		}
		int a=N[0];
		int ok=1;

		int M1[]=new int[a1];
		Random rd=new Random();
		for(int i=0;i<a1;i++) {
			M1[i]=ok;
			ok++;
		}
		for(int i=0;i<a1;i++) {
			System.out.print(M1[i]+" ");
		
		}
		System.out.println();
	
		int N1[]=new int[a1];
		N1=M1;
		int count11=0;
		while(a1>1) {
			int count=0;
			if(count11%2==0) {
				for(int i=0;i<a1;i++) {
					if(i%2!=0) {
						N1[count]=N1[i];
						count++;
					}
				}
			}
			else {
				for(int i=0;i<a1;i++) {
					if(i%2==0) {
						N1[count]=N1[i];
						count++;
					}
				}
			}
			
			a1=count;
			for(int i=0;i<count;i++) {
				System.out.print(N1[i]+" ");
			}
			System.out.println("");
			
			count11++;
			
			
		}
		int a111=N1[0];
		System.out.println("Vị Trí của người đó là "+a+" - người được tha là "+ a111);

	}
}
