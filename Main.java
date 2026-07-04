/*package twine;

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

 */

package twine;

import javax.swing.*;
import java.awt.event.*;
import twine.cipher.TwineCipher;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("TWINE Cipher Encryption");
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // Plaintext Label
        JLabel lblPlain = new JLabel("Plaintext:");
        lblPlain.setBounds(20, 20, 100, 25);
        frame.add(lblPlain);

        // Plaintext Area
        JTextArea txtPlain = new JTextArea();
        JScrollPane scrollPlain = new JScrollPane(txtPlain);
        scrollPlain.setBounds(20, 50, 540, 80);
        frame.add(scrollPlain);

        // Secret Key Label
        JLabel lblKey = new JLabel("Secret Key:");
        lblKey.setBounds(20, 150, 100, 25);
        frame.add(lblKey);

        // Secret Key Field
        JTextField txtKey = new JTextField();
        txtKey.setBounds(120, 150, 250, 25);
        frame.add(txtKey);

        // Encrypt Button
        JButton btnEncrypt = new JButton("Encrypt");
        btnEncrypt.setBounds(390, 150, 170, 30);
        frame.add(btnEncrypt);

        // Ciphertext Label
        JLabel lblCipher = new JLabel("Ciphertext:");
        lblCipher.setBounds(20, 200, 100, 25);
        frame.add(lblCipher);

        // Ciphertext Area
        JTextArea txtCipher = new JTextArea();
        txtCipher.setEditable(false);
        JScrollPane scrollCipher = new JScrollPane(txtCipher);
        scrollCipher.setBounds(20, 230, 540, 120);
        frame.add(scrollCipher);

        // Encrypt Button Action
        btnEncrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String plaintext = txtPlain.getText();
                String key = txtKey.getText();

                if (plaintext.isEmpty() || key.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter both Plaintext and Secret Key.");
                    return;
                }

                TwineCipher cipher = new TwineCipher(key);
                String ciphertext = cipher.encrypt(plaintext);

                txtCipher.setText(ciphertext);
            }
        });

        frame.setVisible(true);
    }
}
