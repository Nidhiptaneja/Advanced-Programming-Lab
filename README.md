# Advanced-Programming-Lab
Week 1 - 
1a	Number guessing with a twist (Binary Search):
Given – a sorted list of student roll numbers (6 digit integers).
User enters a specific number to search for.
If the number is not found in the list, then program returns -1. If found, program returns the number of comparisons made for finding it.
Input: int N (number of elements), <numbers>, <number_to_search_for>
Output: int	2 points
1b	Little Jill likes to count. Give her a number, say N, and she’ll starting counting from 1 to N. She counts by using the fingers of her left hand as follows: she starts with her thumb: 1, then the index finger: 2, middle finger: 3, ring finger: 4 and little finger: 5. Then she reverses direction, counting 6 with her ring finger, 7 on her middle finger, 8 on her index finger: 8, 9 on her thumb, after which she counts 10 on her first finger again, and so on. For a given N, If she counts in this manner, your program must determine which finger she will stop on.
Input: int N
Output: String {thumb, index, middle, ring, little}	2 points
1c	The King and the Chess board. A king is so impressed by one of his courtiers that he offers to give him whatever he desires. The wily courtier replies that all he wants are some grains, as many as could be placed on a chess board. Specifically, grains are to be placed on each square of a chess board, as follows. One grain is to be placed in the first square, two in the second square, four in the third square and so on. (We’ll assume the squares are big enough to accommodate the increasing numbers of grain they’re each expected to hold). Assuming an NxN Chess board, WAP that displays the exact number of grains required to cover an NxN board.
Input: integer N
Output: integer P (number of grains)	3 points
1d	There are N books, and M<N locations in a library. There are different ways in which these N books can be arranged in the locations available. We’ll assume that the remaining books are put on the table. The librarian, Miss Bored-with-it-all goes about arranging these books in different ways all the time. You know, just to pass the time. Then she gets this bright idea to count the number of different ways that she can arrange all these books, so that she has something cool to fill into her appraisal report. However, when she finally does compute this number and starts to write it down, she gets so lethargic she skips writing the trailing zero digits in the number. So now she wants you to WAP to count the number of digits she’s skipped. For example, if the number is 12340012000, then she only writes 12340012, i.e., she skips writing the last three digits (three zeroes). So, given N and M, what’s the number of digits that she does not write down?
Input: N M (two integers, single space separated)
Output: P (single integer, representing the number of skipped digits)	3 points

Week 2 - 
2a) Write a program that counts the number of occurrences of each letter in a given sentence. The program should read an input string from standard input and display the number of occurrences of each letter in the string in decreasing order (single-space separated, as shown in example below). Ignore case (H and h are same) and all other characters. 
2b) WAP that takes a simple expression of the form OP(x1, x2), where x1 and x2 are both integers, and OP may be one of ADD, SUB, MUL, DIV or POW. The program should display the value of x1 OP x2. Zero or more spaces are allowed between OP and opening ‘(‘. Assume division returns only the integer quotient.
Example:
Input: ADD(10,20)
Output: 30	Example:
Input: SUB (10,20)
Output: -10	Example:
Input: DIV(30,20)
Output: 1
2c) Write a program that reads a string from keyboard and encrypts it by alternating characters from the beginning and end of an array. For example, Index 0 (H) of the original string below is stored in index 0 of the result string. Next, the last letter O (index 4) of the original string is stored in location 1 of the result string. Next, letter E (index 1 of original string) is copied to index 2 of the result string. Then the second last letter L (index 4) is copied to index 3 of the result string. And so on. This continues until the entire string has been encrypted. Your program should display the encrypted string. 
Example:
Input: HEKLO
Output: HOELK

Week 3 - 
3a) Write a class counter application, whose job would be to parse a given input source file (a simple text file) and count the number of java classes defined inside the file. Six sample test cases have been provided. 
3b) Compare String, StringBuffer and StringBuilder for very large numbers of appends, as discussed in class. Also plot a iterations(x) versus exec time (y) graph. Your program will take # of iterations as input and return the execution time (space separated) for String, StringBuilder and StringBuffer respectively. In the test case for 3b, I used currentTimeMillis(), and provided the results on my system for N=100,000. 

Week 4 -
4a) OOP Concept
4b) Generate a random sequence of musical notes. You could use a fibo-like sequence like in the example midi (or anything else) to generate your musical notes. If you are more musically inclined and would like to do something else, feel free to use some other instrument – maybe to produce a melody in Rag Bhupali on Flute, or anything that you like. Your output will be a .mid file, no longer than 1 minute. Download JFugue (I have version 4 installed, so please use the same, for testing convenience), look up its manual and write your code. You will submit the source code as well as the midi file.
                               
Week 5 - 
MultiThreading
Week 6 - 
Collections
Week 7-
Java Swing API
