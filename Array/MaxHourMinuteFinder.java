package com.String;

public class MaxHourMinuteFinder {

	public static void main(String[] args) {

		int h=0,m=0;
		int[] a={1,3,3,1};
		int maxH=0 , maxM=0;
		for(int i =0 ;i <a.length; i++)
		{
			int n1=a[i];
			for(int j=i+1;j< a.length ;j++)
			{
				int n2=a[j];
				String s=""+n1+n2;
				int k=Integer.parseInt(s);
				if(k<24) {
					if(k>=h) 
						h=k;
				} else {
					if(k>=maxH) 
						maxH=k;
				}
			}    
		}

		for(int i =a.length-1;i>=0; i--)
		{
			int n1=a[i];

			for(int j=i-1;j>=0 ;j--)
			{
				int n2=a[j];
				String s=""+n1+n2;
				int k=Integer.parseInt(s);   
				if(k<24) {
					if(k>=h) 
						h=k;
				} else {
					if(k>=maxH) 
						maxH=k;
				} 
			}    

		}


		int x1=h%10,x2=h/10;

		int miArr[] = new int[2];
		int hIndex1=0;
		int hIndex2=0;

		for(int i =0 ;i <a.length; i++){
			int n1=a[i];
			if(n1 == x1) {
				hIndex1 = i;
			} else if(n1 == x2) {
				hIndex2 = i;
			}
		}
		
		
		for(int i =0 ;i <a.length; i++)
		{
			int n1=a[i];
			if(i != hIndex1  && i != hIndex2 ) {
				for(int j=i+1;j< a.length ;j++)
				{
					int n2=a[j];

					if(j != hIndex1  && j != hIndex2)
					{
						String s=""+n1+n2;
						int k=Integer.parseInt(s);
						if(k<60) {
							if(k>=m) 
								m=k;
						} else {
							if(k>=maxM) 
								maxM=k;
						}
							
					} 
				}    
			}


		}



		for(int i =a.length-1;i>=0; i--) { 
			int n1=a[i]; if(i != hIndex1 && i !=hIndex2 ) { 
				for(int j=i-1;j>=0 ;j--) {
					int n2=a[j]; 
					if(j != hIndex1 && j !=hIndex2) {
						String s=""+n1+n2; 
						int k=Integer.parseInt(s); 
						if(k<60) {
							if(k>=m) 
								m=k;
						} else {
							if(k>=maxM) 
								maxM=k;
						}
					}
				}
			}
		}
		/*
		 * String firstPart = ""+a[i]+a[j]; String secondPart = ""+a[k]+a[l]; int
		 * firstNo = Integer.parseInt(firstPart); int secondNo =
		 * Integer.parseInt(secondPart); int maxNo = firstNo > secondNo ?
		 * firstNo:secondNo; if(maxNo<24) { if(maxNo>=h) h=maxNo; } else {
		 * if(maxNo>=maxH) maxH=maxNo; }
		 */

		/*System.out.println("hh : "+h +" mm : "+m);
		System.out.println("hhM : "+maxH +" mmM : "+maxM); */
		
		if( h==0 && m<60 && maxH>=24 ) {
			System.out.print("Invalid Time Format ");
		}
		else if( h<24 && m<60  ) {
			System.out.print("The time is "+h+" hours "+m+" minutes ");
		} 
		else
			System.out.print("Invalid Time Format ");

	}

}
