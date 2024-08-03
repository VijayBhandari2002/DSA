public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Initialize pointers and list to hold the intersection
        int i = 0, j = 0;
        List<Integer> intersection = new ArrayList<>();

        // Find intersection
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Avoid adding duplicates
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != nums1[i]) {
                    intersection.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert List to int array
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        return result;
    }
}