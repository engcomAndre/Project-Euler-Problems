public class Solution{
    public static boolean isPalindrome(long val) {
            boolean isPalindrome = true;
            String str = Long.toString(val);
            int len = str.length();
            int i = 0;
            while (isPalindrome && i <= (len-1)/2){
                isPalindrome = str.charAt(i) == str.charAt(len-1-i);
                i++;
            }
            return isPalindrome;
        }

        public static void main(String[] args) {
            int i = 999;
            long largest = 1;
            String str = "";
            long val = 1;
        while (i>=100)
        {
            int j = i;
            while (j>=100)
            {
                val = i * j;
                if(isPalindrome(val) && largest < val)
                {
                    largest = val;
                    str = i + " x " + j;
                }
                isPalindrome (val);
                j--;
            }
            i--;
        }
        System.out.println(str+ "= "+ largest);

    }
}
