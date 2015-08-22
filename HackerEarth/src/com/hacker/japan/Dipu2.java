package com.hacker.japan;


/* IMPORTANT: class must not be public. */

//uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;


class Dipu2 {
 public static void main(String args[] ) throws Exception {
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String line = br.readLine();
     String l,r;
     int N = Integer.parseInt(line);
     long a,b,ans;
     double leftSqrt, rightSqrt;
     int index;
     for (int i = 0; i < N; i++)
     {
         line = br.readLine();
         index=line.indexOf(' ');
         l=line.substring(0,index);
         r=line.substring(index+1);
         a=Long.parseLong(l);
         b=Long.parseLong(r);
         leftSqrt=Math.sqrt(a);
         rightSqrt=Math.sqrt(b);
         a=(long)leftSqrt;
         b=(long)rightSqrt;
         if((leftSqrt-a)!=0)
         	a=a+1;
         ans=(long)(b-a+1);
         System.out.println(ans);
     }  
}
}

