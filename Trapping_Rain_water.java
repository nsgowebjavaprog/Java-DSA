// 12. TRAPPING RAIN_WATER

public class Trapping_Rain_water{
   public static int Trapped_Rain_Water(int heigth[]) {
       int n = heigth.length;

       //left max boundary

       int leftMax[] = new int[n];
       leftMax[0] = heigth[0];
       for (int i = 1; i < n; i++) {
           leftMax[i] = Math.max(heigth[i], leftMax[i - 1]);
       }

       // right max boundary

       int rightMax[] = new int[n];
       rightMax[n - 1] = heigth[n - 1];
       for (int i = n - 2; i >= 0; i--) {
           rightMax[i] = Math.max(heigth[i], rightMax[i + 1]);

       }
       int trpped_watwr = 0;
       //looop
       for (int i = 0; i < n; i++) {
           // water level
           int waterlevel = Math.min(leftMax[i], rightMax[i]);

           // trapped water
           trpped_watwr += waterlevel - heigth[i];
       }
       return trpped_watwr;
   }

   public static void main(String[] args) {
       int height [] = {4,2,0,6,3,2,5};
       System.out.println("Trappped Water  : "+Trapped_Rain_Water(height));
   }
}