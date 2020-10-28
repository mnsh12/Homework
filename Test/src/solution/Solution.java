package solution;

import java.io.*;
import java.util.*;

public class Solution {
    
    public static int find_negative_sum_count(int a[]){
        int current_sum = 0;
        int current_previous = 0;
        int count = 0;
        for(int i =0;i< a.length ;i++){
            
            if(a[i]< 0 ){
                count++;
            }
            int sum = 0;
           for(int j = i+1;j<a.length;j++) {
        	   sum+=a[j];
        	   if(a[i]+sum<0) {
        		   count++;
        	   }
           }
            
        }
        return count;
        
        
    }
    
    
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        int i = 0;
        while(i< num){
            a[i] = sc.nextInt();
            i++;
        }
        System.out.print(find_negative_sum_count(a));
        
        
        
        
    }
}