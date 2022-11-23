 

import java.util.*;

 class thread1 extends Thread
 {
    public void run()
    {
        for(int i =0;i<=100;i++)
        {
         if(i/7==0 && i/11==0)
           {
             System.out.println(i);
           }
        }

    }
  }
  class thread2 extends Thread
  {
     public void run()
      {
          for(int i =0;i<=100;i++)
          {
              if(i/5==0 || i==13)
              {
                  System.out.println(i);
              }
          }
      }
  }

public class th {
    public static void main(String[]args)
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
