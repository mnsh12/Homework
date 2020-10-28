package Solution;

public class Tapping_water {
	   
    public static int trap(int[] height) {
         int min = 0;
    int max = 0;
        
        if(height.length==0){
            return 0;
        }
        
        int sum = 0;
        int leftWall[] = new int[height.length];
        int rightWall[] = new int[height.length];
        leftWall[0] = height[0];
        for(int i=1;i<height.length;i++){
           leftWall[i]= Math.max(leftWall[i-1],height[i]);
      
    }
        rightWall[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
           rightWall[i]= Math.max(rightWall[i+1],height[i]);
      
    }
        for(int i =0;i<height.length;i++){
            sum += Math.min(leftWall[i],rightWall[i]) -height[i];
        }
        return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,0,3,2,5};
	   trap(a);
	}

}
