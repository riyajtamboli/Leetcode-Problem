import java.util.Arrays;

public class L34_FirstLastOccurence {
    void main(){

        int arr[] = {5,7,7,8,8,10};
        int ans [] = searchRange(arr, 8);
        System.out.println(Arrays.toString(ans));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        if (nums.length == 0) {
            return ans;
        }

        ans[0] = firstOccurrence(nums, target);
        ans[1] = lastOccurrence(nums, target);

        return ans;
    }

    public static int firstOccurrence(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                ans = mid;
                end = mid - 1; // search left
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                ans = mid;
                start = mid + 1; // search right
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}


