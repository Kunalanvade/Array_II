import java.util.*;

public class Trapped_Water {
    public static void trapped_water(int height[]) {

        //calculating left max boundary
        int n = height.length;
        int leftMax[]= new int[height.length];
        leftMax[0]= height[0];
        for(int i=1; i<n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

    
    }

    public static void main(String[] args) {

        int height[]= [4,2,0,6,3,2,5];
    }
}
