package twine;

import java.util.Scanner;
import twine.cipher.TwineCipher;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========== TWINE Encryption ==========");

        System.out.print("Enter Plaintext: ");
        String plaintext = input.nextLine();

        System.out.print("Enter Secret Key: ");
        String key = input.nextLine();

        TwineCipher cipher = new TwineCipher(key);

        String ciphertext = cipher.encrypt(plaintext);

        System.out.println();
        System.out.println("Plaintext : " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);

        input.close();
    }
}