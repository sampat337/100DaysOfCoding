/*
 
QUESTION : 1.Write a JAVA program for checking the speed of drivers.
             Enter the value of  speed If speed is less than 70, it should print “Ok”.
             Otherwise, for every 5km above the speed limit (70), it should give the driver one demerit point and print the total number of demerit points.
             For example, if the speed is 80, it should print: “Points: 2”. If the driver gets more than 12 points, the function should print: “License suspended” 
             
EXPLANATION :        
             first we declare the public class speed in which we take a main method 
             in which we declare a variable int a , flag = 0 , b = 0 ;
             then we take a scanner class with  ref variable sc . then we print "enter the speed of the driver "
             and take input from the user the speed . and we declare if(a<=70) if the user input the speed equal or less than 70
             .
             the  system will print ok . 
              else (a >= 70)
               if the user input the speed greater than 70 .it perform operation b = a - 70;
               b = b / 5;
               then it should print point and the value of b  .
               then we compare the vlaue of b . if the value of b is greater than or equal to 12 .
               the code will print "license suspended" .
              
output : case 1 : enter the speed of the driver

                  50
                  ok
                  Process finished with exit code 0
                 
                 
        case 2 : enter the speed of the driver

                 150
                 Points:16
                 License suspended!!! 
                 Process finished with exit code 0   
                 
                 
                 */
          
