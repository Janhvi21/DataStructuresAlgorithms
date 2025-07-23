
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int mostWaterFilled = maxArea(height);
        System.out.println(mostWaterFilled); // expected output: 49
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            int min = Math.min(height[left], height[right]);
            area = Math.max(area, min * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}
