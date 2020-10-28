package Solution;

public class Buy_Sell_ii {
	
    public static  int maxProfit(int[] prices) {
        
       int left[]  =  new int[prices.length];
       int right[] =  new int[prices.length];
       
       
       left[0] = 0;
       int lmin = prices[0];
       for(int i=1;i<prices.length;i++) {
    	   left[i] = Math.max(left[i-1], prices[i] - lmin);
    	   if (lmin> prices[i]) {
    		   lmin = prices[i];
    		   
    	   }
       }
       
       right[right.length-1] = 0;
       int Rmax = prices[prices.length-1];
       for(int i=prices.length-2;i>=0;i--) {
    	   right[i] = Math.max(right[i+1], Rmax - prices[i]);
    	   if (Rmax < prices[i]) {
    		   Rmax = prices[i];
    		   
    	   }
       }
       int profit = right[0] ;
       for (int i=1 ; i<prices.length;i++) {
    	   profit = Math.max(profit,left[i-1]+right[i] );
       }
       return profit;
       
    	
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		System.out.println(maxProfit(a));

	}

}
