package Numbers;

import java.util.Scanner;
import java.math.BigInteger;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        if (!sc.hasNextLong()) {
            System.out.println("Enter a valid integer value!");
            sc.close();
            return;
        }

        long num = sc.nextLong();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers!");

        } else {
            BigInteger fact = BigInteger.ONE;

            for (long i = 2; i <= num; i++) {

                 fact = fact.multiply(BigInteger.valueOf(i));
            }

            System.out.println("Factorial of " + num + " is " + fact);
        }

        sc.close();
    }
}

/*
  🔍 Problem with int and long

✅ Data Types:
int can hold values up to ~2.1 billion (2^31 - 1)

long can hold values up to ~9.2 quintillion (2^63 - 1)

But 99! has 156 digits, which is way beyond what long can store.

✅ What is BigInteger?

BigInteger is a class in java.math package used for arbitrary-precision integers.
That means it can store numbers as big as you want — only limited by memory.

✅ How it's used (Step-by-Step):

java

import java.math.BigInteger; // import BigInteger class

1️⃣ Initialize a BigInteger to 1:
java

BigInteger fact = BigInteger.ONE;
Here, BigInteger.ONE is a constant for the number 1.

2️⃣ Loop to multiply numbers 2 to n:
java

for (int i = 2; i <= num; i++) {
    fact = fact.multiply(BigInteger.valueOf(i));
}

    ❌ Problem:
if trying to multiply a BigInteger with a long directly:

java

fact.multiply(i); // ← ❌ invalid: i is a long
Java doesn’t allow mixing object types (BigInteger) and primitives (long) directly with methods like .multiply().

BigInteger.valueOf(i) converts a regular int to BigInteger.

.multiply() is used instead of * because * only works with primitives (int, long).

The result is stored back in fact.

3️⃣ Print the result:
java

System.out.println(num + "! = " + fact);
This prints the full factorial value even if it's hundreds or thousands of digits long.

✅ Why can't we use * or +=?

Because BigInteger is an object, not a primitive. You must use its methods:

Operation	  BigInteger Method
---------     -----------------
Multiply	   a.multiply(b)
Add	           a.add(b)
Subtract	   a.subtract(b)
Divide	       a.divide(b)
Power	       a.pow(n)
Modulo	       a.mod(b)
 */