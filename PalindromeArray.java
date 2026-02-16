class PalindromeArray {
    public static void main(String[] args) {

        int[] a = {1,2,3,2,1};

        boolean flag = true;

        for(int i = 0; i < a.length/2; i++) {
            if(a[i] != a[a.length-1-i]) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Palindrome Array");
        else
            System.out.println("Not Palindrome");
    }
}
