import java.util.Arrays;

public class FindPivotIndex {

  int pivotIndex(int[] nums) {

    int rightSum = 0;
    for (int num : nums) {
      rightSum += num;
    }

    int leftSum = 0;

    for (int i = 0; i < nums.length; i++) {

      rightSum -= nums[i];

      if (leftSum == rightSum) {
        return i;
      }
      
      leftSum += nums[i];
    }

    return -1;
  }
  public static void main(String[] args) {

        FindPivotIndex obj = new FindPivotIndex();

        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};

        System.out.println("Array 1: " + Arrays.toString(nums1));
        System.out.println("Pivot Index: " + obj.pivotIndex(nums1));

        System.out.println();

        System.out.println("Array 2: " + Arrays.toString(nums2));
        System.out.println("Pivot Index: " + obj.pivotIndex(nums2));
    }

}