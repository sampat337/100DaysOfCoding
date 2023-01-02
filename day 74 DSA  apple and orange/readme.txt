/*

Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

In the diagram below:

    The red region denotes the house, where s is the start point, and t is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right. 
    Assume the trees are located on a single point, where the apple tree is at point a , and the orange tree is at point b
    When a fruit falls from its tree, it lands d  units of distance from its tree of origin along the x-axis. *A negative value of d . means the fruit fell d  units to the tree's left, and a positive value of d means it falls d units to the tree's right. *



Function Description

Complete the countApplesAndOranges function in the editor below. 
It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

    s: integer, starting point of Sam's house location.
    t: integer, ending location of Sam's house location.
    a: integer, location of the Apple tree.
    b: integer, location of the Orange tree.
    apples: integer array, distances at which each apple falls from the tree.
    oranges: integer array, distances at which each orange falls from the tree.

Input Format

The first line contains two space-separated integers denoting the respective values of s and t.
The second line contains two space-separated integers denoting the respective values of a and b.
The third line contains two space-separated integers denoting the respective values of m and n.
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a .
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.


Constraints

  1 <= s,t,a,b,m,n <= 10^5
  -10^5 <= d <= 10^5
   a < s < t <b

Output Format

Print two integers on two different lines:

   1. The first integer: the number of apples that fall on Sam's house.
   2 . The second integer: the number of oranges that fall on Sam's house.
   
   
   
   The first apple falls at position .
The second apple falls at position .
The third apple falls at position .
The first orange falls at position .
The second orange falls at position .
Only one fruit (the second apple) falls within the region between  and , so we print  as our first line of output.
Only the second orange falls within the region between  and , so we print  as our second line of output.






Input (stdin)

Download
7 11
5 15
3 2
-2 2 1
5 -6
Expected Output

Download
1
1




Input (stdin)

Download
2 3
1 5
1 1
-2
-1
Expected Output

Download
0
0



*/
   
   
   
