public class met_over {
   void show()
   {
       int c ,a = 10,b=20;
       c=a+b;
       System.out.println(c);
   }
   void show(int x,int y)
   {
       int c = x+y;
       System.out.println(c);
   }
   void show(double x,int y)
   {
       double c = x+y;
       System.out.println(c);
   }
    public static void main(String[]args){
       met_over r =new met_over();
       r.show();
       r.show(34,56);
       r.show(24.5,65);

    }
}
