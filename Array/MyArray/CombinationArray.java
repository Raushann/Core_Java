package com.Array.MyArray;

public class CombinationArray {
public static void main(String[] args) {
        
        int a[]={1,2,3,4};
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a.length; j++)
                if(a[i]!=a[j])
                {   
                    for(int k=0; k<a.length; k++)
                    if(a[k]!=a[i] && a[k]!=a[j])
                    {
                        for(int l=0; l<a.length; l++)
                            if(a[l] !=a[i] && a[l] != a[j] && a[l]!=a[k])
                                System.out.println(""+a[i]+a[j]+a[k]+a[l]);
                    }
                }
    }
}
