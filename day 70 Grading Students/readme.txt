HackerLand University has the following grading policy:

   1. Every student receives a grade in the inclusive range from 1 to 100.
   2. Any grade less than 30 is a failing grade. 

     

Sam is a professor at the university and likes to round each student's grade according to these rules:

  1.If the difference between the grade and the next multiple of 5 is less than 3 , round up to the next multiple of 5.
  2.If the value of grade  is less than 38 , no rounding occurs as the result will still be a failing grade.

Examples

  1. grade = 84 round to85 (85 - 84 is less than 3)
  2. grade = 29 do not round (result is less than 40)
  3. grade = do not round (60 - 57 is 3 or higher)

Given the initial value of  grade for each of Sam's n students, write code to automate the rounding 
process. 

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

    int grades[n]: the grades before rounding

Returns

    int[n]: the grades after rounding as appropriate

Input Format

The first line contains a single integer,n , the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i].

Constraints
  
  1<= n < =60
  0 <= grades[i] <= 100
  
  
  
  Input (stdin)

Download
4
73
67
38
33
Expected Output

Download
75
67
40
33

Input (stdin)

Download
57
97
56
81
38
30
1
9
23
69
24
44
69
12
61
50
84
3
17
91{-truncated-}

Download to view the full testcase
Expected Output

Download
97
56
81
40
30
1
9
23
70
24
45
70
12
61
50
85
3
17
91
40{-truncated-}

Download to view the full testcase


