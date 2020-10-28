package Solution;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	

	    public static List<Integer> majorityElement(int[] nums) {
	        
	        
	        int nums1= -1;
	        int nums2 = -1;
	        int c1 = 0;
	        int c2 =0;
	        
	        for(int i: nums){
	            
	            if(nums1 == i)
	                c1++;
	            else if(nums2 == i)
	                c2++;
	            else if(c1 == 0)
	            {
	                nums1 = i;
	                c1++;
	            }
	            else if(c2 == 0){
	                nums2 = i;
	                c2++;
	            }
	            else{
	                c1--;
	                c2--;
	            }
	                
	        }
	        List<Integer> li = new ArrayList<>();
	        c1 = 0 ;
	        c2 = 0;
	        
	        for(int i:nums){
	            if (i  == nums1)
	                c1++;
	            else if (i == nums2)
	                c2++;
	            
	        }
	        
	        
	        
	        
	        if (c1 > nums.length/3)
	            li.add(nums1);
	        if(c2 > nums.length/3)
	            li.add(nums2);
	        return li;
	        
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,2,3};
		majorityElement(a);
	}



}
