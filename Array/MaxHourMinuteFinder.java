package com.String;

public class MaxHourMinuteFinder {

	  public static void main(String[] args) {

		  int h=0,m=0;
		  int[] a={1,3,5,2};

		  for(int i =0 ;i <a.length; i++)
		  {
		     int n1=a[i];
		     for(int j=i+1;j< a.length ;j++)
		     {
		       int n2=a[j];
		       String s=""+n1+n2;
		       int k=Integer.parseInt(s);
		       if(k<24)
		         if(k>=h) 
		              h=k;
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
		       if(k<24)
		         if(k>=h)
		              h=k;  
		      }    
		       
		  }
		     

		  int x1=h%10,x2=h/10;
		     
		     
		  for(int i =0 ;i <a.length; i++)
		  {
		     int n1=a[i];
		     if(n1 != x1  && n1 != x2 )
		     for(int j=i+1;j< a.length ;j++)
		     {
		       int n2=a[j];
		        if(n2!=x1  && n2!=x2)
		        {
		           String s=""+n1+n2;
		           int k=Integer.parseInt(s);
		           if(k<60)
		              if(k>=m) 
		                m=k;
		        } 
		     }    
		       
		  }
		     
		     
		  for(int i =a.length-1;i>=0; i--)
		  {
		     int n1=a[i];
		     if(n1!=x1  && n1!=x2)
		     for(int j=i-1;j>=0 ;j--)
		     {
		       int n2=a[j];
		       if(n2!=x1  && n2!=x2)
		       {
		           String s=""+n1+n2;
		           int k=Integer.parseInt(s);   
		           if(k<60)
		              if(k>=m)
		                m=k;
		        }    
		     }    
		       
		  }
		     if(h!=0 && m!=0)
		      System.out.print("The time is "+h+" hours "+m+" minutes ");
		      else
		      System.err.println("Bhai bohat zyada galat input hai");
		    }

}
