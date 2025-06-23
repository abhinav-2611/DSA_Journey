package Numbers;

public class Checkpalindrone {
    public static void main(String[] args) {
        int n = 121;
        int copy =n;
        int rev =0;
        while (n!=0) {
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }

        if (copy < 0) {  //Handle negative numbers, which are never palindromes:
    System.out.println("not a palindrone"); 
} else if (rev == copy) {
    System.out.println("given number is palindrone");
} else {
    System.out.println("not a palindrone");
}

    }
}

/*⚠️ Don't forget:

Negative numbers are not palindromes (e.g., -121 ≠ 121-)

Edge case: 0 is a palindrome */