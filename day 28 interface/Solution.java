
interface a1 {
     public void show();

}
interface j1
{
    public void disp();
}
class a implements j1,a1
     {
       public void show()
       {
           System.out.println("aman");
       }
       public void disp()
       {
           System.out.println("shubu");
       }
      public static void main(String [] args){
       a ref = new a();
       ref.show();
       ref.disp();
       }
     }
