import java.util.Arrays;

/**
 * @description: TODO
 * @author: chz
 * @date: 2026/7/5 14:41
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int x : nums) {
            if (x != val) {
                nums[k++] = x;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7};
        int i = new RemoveElement().removeElement(nums, 3);
        System.out.println(Arrays.toString(nums)+", i="+i);
    }
}