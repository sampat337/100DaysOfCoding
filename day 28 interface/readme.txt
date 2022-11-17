/*
question : why we cant use multiple inhertiance in java ?

  explanation : Java doesn't support multiple inheritances in classes because it can lead to diamond problem and rather than providing some complex way to solve it,
                 there are better ways through which we can achieve the same result as multiple inheritances. 
                 
 question : how we can apply multiple inheritance though interface ? 
    
    explanation : An interface contains variables and methods like a class but the methods in an interface are abstract by default unlike a class. 
                  Multiple inheritance by interface occurs if a class implements multiple interfaces or also if an interface itself extends multiple interfaces
                  
                  
                  
                  
  in the code we use interface class a1  in which we declare the method show .
  then we take anoter interface class j1 and declare the method disp in it .
   after that we define a class in which we use by using the keyword implements which is used to declare 
   the interface in  a program . after that we define the method we decalre in interface a1 and j1 .
     then we define the main method in which we create the object of method which will initialize the 
     obejct and sjow the output .
  
