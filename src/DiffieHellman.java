import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;

public class DiffieHellman {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of p: ");
        BigInteger p = in.nextBigInteger();

        System.out.print("Enter the value of g: ");
        BigInteger g = in.nextBigInteger();

        Random random = new Random();
        BigInteger SA = new BigInteger(p.bitLength() - 1, random);
        BigInteger SB = new BigInteger(p.bitLength() - 1, random);

        BigInteger A = g.modPow(SA, p);
        BigInteger B = g.modPow(SB, p);

        BigInteger secret = B.modPow(SA, p);

        System.out.println("SA: " + SA);
        System.out.println("SB: " + SB);
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("Shared secret: " + secret);
    }
}
