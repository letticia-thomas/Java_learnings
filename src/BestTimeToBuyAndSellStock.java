/*
 You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

import java.util.*; 
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		 int prices[] = {1,2,7}; 
		 /*
		 // brute force solution - time limit exceeded
		 int max =0;
	        for(int i=0;i<prices.length-1;i++)
	        {
	        	for(int j=i+1;j<prices.length;j++)
	        	{
	        		if((prices[j]-prices[i])>max)
	        		{
	        			max = prices[j]-prices[i];
	        		}
	        	}
	        }
	        System.out.println(max);*/
		 
		 
		 int buy = prices[0];
		 int profit = 0;
		 int current;
		 for(int i=0;i<=prices.length-1;i++)
		 {
			 current = prices[i];
			 if(current-buy>profit)
			 {
				 profit = current - buy;
			 }
			 if(buy>current)
			 {
				 buy = current;
			 }
		 }
		 System.out.println(profit);
	}

}
