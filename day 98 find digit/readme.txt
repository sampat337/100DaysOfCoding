/*


An integer d is a divisor of an integer n if the remainder of n/d = 0.

Given an integer, for each digit that makes up the integer determine whether it is a divisor.
Count the number of divisors occurring within the integer.

Example
n = 124
Check whether 1, 2 and 4 are divisors of 124. All 3 numbers divide evenly into 124 so return 3.

n = 111
Check whether 1, 1, 1 and  are divisors of 111. All 3 numbers divide evenly into 111 so return 3.

n = 10
Check whether 1 and 0 are divisors of 10. 1 is, but 0 is not. Return 1.


Function Description

Complete the findDigits function in the editor below.
findDigits has the following parameter(s):
int n: the value to analyze

Returns
int: the number of digits in n that are divisors of n


Input Format

The first line is an integer, t, the number of test cases.
The t subsequent lines each contain an integer, n.


Constraints
1 <= t <= 15
0 < n < 10^9


Input (stdin)

Download
2
12
1012
Expected Output

Download
2
3



Input (stdin)

Download
11
123456789
114108089
110110015
121
33
44
55
66
77
88
106108048
Expected Output

Download
3
3
6
2
2
2
2
2
2
2
5




*/

