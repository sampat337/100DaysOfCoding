/* 
question : Write a multithreading program in JAVA to perform the             

                following task



                display all numbers between 1 to 100 which are divisible          

                by 

                both 

                7

                and 11



                Display all numbers between 1 to 100 which are 

                divisible by either 5 or 13

 . 
explanation :
               first we create a thread1 classs which extends the Thread 
               in which we define a runnable method void run .
               after that we take for loop in which we declare a conditional statement .
               in which we provide a condition if i/7=0 and i/11=0 and print the output i 
                
                then we take another class name thread2 which extends thread class in java lang 
                package in which we define men=thod run in which we done the same thing applying the 
                for loop in which we declare the conditional statement if (i/5==0 || i==13) 
                then we print the output . 
                
                after that we declare the public class in which we declare the main method 
                then we create the object of thread 1 and thread 2 
                after that we initialize the object by declaring t1.start() and t2.start();
              
output :        0
                1
                2
                3
                4
                5
                6
                0
                1
                2
                3
                4
                13

                Process finished with exit code 0    
                
                
                */
                           
  
