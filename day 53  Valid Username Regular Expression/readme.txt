/*


Regular expressions (regexpregexp) help us match or search for patterns in strings. In this problem, you will be given a username.
Your task is to check whether that username is valid. A valid username will have the following properties:


1. The username can contain alphanumeric characters and/or underscores(_).
2. The username must start with an alphabetic character.
      8 ≤≤ |Username| ≤≤ 30.
      
      
To simplify your task, we have provided a portion of the code in the editor. 
You just need to write down the regexregex pattern which will be used to validate the username input.


Input Format

The first line of input contains an integer NN, representing the number of testcases. 
Each of the next NN lines contains a string that represents a username.

Constraints

The username consists of any printable characters.
    1≤N≤1001≤N≤100


Output Format

For each username, output Valid if the username is valid; otherwise, output Invalid.



Input (stdin)

julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007


Your Output (stdout)

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid


Expected Output

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid




*/
