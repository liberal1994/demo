package algorithm;

/**
 * 求最长字符串长度问题
 */
public class LongestSubstring {
    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("shoreabasdahhdsvav");
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int stIdx = 0, maxLen = 0;
        int arr[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
            stIdx = Math.max(arr[s.charAt(i)], stIdx);
            maxLen = Math.max(maxLen, i - stIdx + 1);
            arr[s.charAt(i)] = i + 1;
        }
        return maxLen;
    }
}
