# Check-Pangram-Or-Not
Here's an explanation of how the program works:
The allLetter method takes a single argument, str, which is the input string to be checked for pangramness.
It first converts the input string str to lowercase using str.toLowerCase(). This ensures that the program is case-insensitive, as pangrams can contain both uppercase and lowercase letters.
The program initializes a boolean variable allLetterPresent to true. This variable will be used to track whether all letters of the alphabet are present in the string.
The program enters a loop that iterates over all lowercase letters from 'a' to 'z'.
Inside the loop, it checks whether the current letter (ch) is present in the converted lowercase string str using the str.contains(String.valueOf(ch)) method. If the letter is not present, it sets allLetterPresent to false and breaks out of the loop because finding one missing letter is enough to determine that it's not a pangram.
After the loop completes, the program checks the value of allLetterPresent. If it's true, it prints "YES" to indicate that the input string is a pangram. Otherwise, it prints "NO" to indicate that it's not a pangram.
In the main method, the program reads a line of input from the user using the Scanner class and stores it in the str variable. Then, it calls the allLetter method to check whether the input string is a pangram.
