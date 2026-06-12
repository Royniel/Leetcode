"imagine a bar graph where you have to multiply the x axis and y axis to find the maximum area, this gives the max area to hold water and X,Y acts as the border of container"
class Solution(object):
    def maxArea(self, height):
        l, r = 0, len(height) - 1
        max_water = 0

        while l < r:
            if height[l] < height[r]:
                water = height[l] * (r - l)
                l += 1
            else:
                water = height[r] * (r - l)
                r -= 1
            
            if water > max_water:
                max_water = water

        return max_water