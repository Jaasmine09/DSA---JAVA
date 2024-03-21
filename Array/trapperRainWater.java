public class trapperRainWater {

    public static int trapper_RainWater(int height[]) {
        // calculate left boundary
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trapperWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftbound, right bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapperWater = (waterLevel - height) * width
            trapperWater += waterLevel - height[i];
        }
        return trapperWater;

    }

    public static void main(String args[]) {
        int height[] = { 4,2,0,3,2,5 };
        System.out.println(trapper_RainWater(height));
    }
}
