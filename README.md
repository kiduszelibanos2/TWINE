# TWINE Cipher Encryption System

## Project Description

NB:The TWINE Cipher Encryption System is a Java application that demonstrates a lightweight block cipher based on the TWINE encryption algorithm. The project accepts plaintext and a secret key from the user, encrypts the plaintext through multiple encryption rounds, and produces ciphertext.

This project is designed for educational purposes to demonstrate the fundamental concepts of lightweight cryptography, including key generation, substitution, permutation, and multiple-round encryption.

---

# Features

- Encrypts user-entered plaintext
- Accepts a secret key from the user
- Performs 36 rounds of encryption
- Uses S-Box substitution
- Uses permutation (data shuffling)
- Generates round keys
- Displays ciphertext in hexadecimal format
- Object-Oriented Java implementation
- Organized using Java packages

---

# Project Structure

```
TWINE_UserInput_Project
│
├── src
│   │
│   └── twine
│        │
│        ├── Main.java
│        │
│        ├── cipher
│        │      ├── TwineCipher.java
│        │      └── Encryption.java
│        │
│        ├── key
│        │      └── KeySchedule.java
│        │
│        ├── sbox
│        │      └── SBox.java
│        │
│        ├── permutation
│        │      └── Permutation.java
│        │
│        └── util
│               └── Utils.java
│
└── README.md
```

---

# Requirements

- Java JDK 8 or higher
- Any Java IDE
    - IntelliJ IDEA
    - Eclipse
    - NetBeans
    - Visual Studio Code

---

# How to Run

### Step 1

Download or clone the project.

### Step 2

Open the project in your preferred Java IDE.

### Step 3

Run the `Main.java` file.

### Step 4

Enter the plaintext.

Example

```
Enter Plaintext:
Hello World
```

### Step 5

Enter the secret key.

Example

```
Enter Secret Key:
MySecret123
```

### Step 6

The program encrypts the plaintext and displays the ciphertext.

Example

```
Ciphertext:
8F3A9D4170BC12EF
```

---

# Encryption Process

The encryption process follows these steps:

```
User Input
     │
     ▼
Enter Plaintext
     │
     ▼
Enter Secret Key
     │
     ▼
Generate Round Keys
     │
     ▼
36 Encryption Rounds
     │
     ├── XOR with Round Key
     ├── S-Box Substitution
     └── Permutation
     │
     ▼
Generate Ciphertext
```

---

# Classes

## Main.java

Responsible for:

- Reading user input
- Creating the cipher object
- Calling the encryption method
- Displaying ciphertext

---

## TwineCipher.java

Responsible for:

- Managing the complete encryption process
- Generating round keys
- Executing all encryption rounds

---

## Encryption.java

Performs one encryption round.

Each round contains:

- XOR operation
- S-Box substitution
- Permutation

---

## KeySchedule.java

Generates the round keys used during encryption.

---

## SBox.java

Stores the substitution table.

Provides nonlinear transformation for each nibble.

---

## Permutation.java

Rearranges the encrypted data after substitution.

Provides diffusion.

---

## Utils.java

Contains helper functions for:

- Converting plaintext to byte arrays
- Converting encrypted bytes into hexadecimal

---

# Algorithm

1. Read plaintext from the user.
2. Read the secret key.
3. Convert plaintext into a data block.
4. Generate round keys.
5. Perform 36 rounds of encryption.
6. In each round:
   - XOR with the round key.
   - Apply S-Box substitution.
   - Perform permutation.
7. Convert the encrypted block to hexadecimal.
8. Display the ciphertext.

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Packages
- Scanner Class
- Byte Arrays

---

# Advantages

- Lightweight implementation
- Easy to understand
- Modular design
- Object-oriented architecture
- Suitable for learning lightweight cryptography
- Easy to extend with decryption or GUI

---

# Limitations

This implementation is a simplified educational version inspired by the TWINE cipher.

It does not fully implement the official TWINE specification, including:

- Official Type-2 Generalized Feistel Network
- Official 80-bit/128-bit key schedule
- Official permutation table
- Official round constants
- Complete decryption algorithm

---

# Future Improvements

- Add decryption support
- Encrypt and decrypt files
- Support multiple block encryption
- Improve key schedule implementation

---

# Author

Project developed for educational purposes to demonstrate the concepts of lightweight block cipher encryption using Java.
