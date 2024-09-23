<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI4174

### Diffie-Hellman Key Exchange Implementation
This repository contains a Java implementation of the Diffie-Hellman key exchange algorithm. The Diffie-Hellman key exchange is a method of securely exchanging cryptographic keys over a public channel.

#### File in this Repository

- DiffieHellman.java: Implementation of the Diffie-Hellman key exchange algorithm

#### Features

- Generation of private keys for two parties (SA and SB)
- Calculation of public keys (A and B)
- Computation of the shared secret
- User input for prime number (p) and generator (g)
- Use of Java's BigInteger class for handling large numbers

#### How to Use

1. Compile the Java file.
2. Run the program.
3. Follow the prompts.

#### Notes
- This implementation is for educational purposes and may not be suitable for production use without further security measures.
- The program uses Java's Random class to generate private keys. For cryptographic purposes, a more secure random number generator should be used.
- Large prime numbers should be used for real-world applications to ensure security.

#### Sample input and output
```
Inputs:
a. p = 11, g = 13

Outputs:
Enter the value of p: 11
Enter the value of g: 13
SA: 2
SB: 4
A: 4
B: 5
Shared secret: 3

Process finished with exit code 0

Inputs:
b. p = 7, g = 17

Outputs:
Enter the value of p: 7
Enter the value of g: 17
SA: 2
SB: 2
A: 2
B: 2
Shared secret: 4

Process finished with exit code 0

Inputs:
c. p = 17, g = 13

Outputs:
Enter the value of p: 17
Enter the value of g: 13
SA: 6
SB: 1
A: 16
B: 13
Shared secret: 16

Process finished with exit code 0
```
