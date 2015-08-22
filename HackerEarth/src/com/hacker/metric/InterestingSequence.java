package com.hacker.metric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class InterestingSequence {
	
	public static BigInteger ipow(BigInteger base, long exp)
	{
	    BigInteger result = new BigInteger("1");
	    while (exp != 0)
	    {
	        if ((exp & 1) == 1)
	        	result = result.multiply(base);
	        exp >>= 1;
	        base = base.multiply(base);
	    }

	    return result;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int testCases = Integer.parseInt(line);
		BigInteger sum;
		long num;
		for(int i =0;i<testCases ;i++){
			
			line = br.readLine();
			num = Long.parseLong(line)+ 1;
			BigInteger gi = new BigInteger("26");
			sum = ipow(gi, num/2);
			System.out.println(sum);
		}
	}

}
