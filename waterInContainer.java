//imagine aa bar graph where you have to multiply the x axis and y axis to find the maximum area
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxWater = 0;

        while (l < r) {
            int water;
            if (height[l] < height[r]) {
                water = height[l] * (r - l);
                l++;
            } else {
                water = height[r] * (r - l);
                r--;
            }
            
            if (water > maxWater) {
                maxWater = water;
            }
        }

        return maxWater;
    }
}