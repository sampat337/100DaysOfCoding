public class contructor {
    int a ;double b ;String c;
    contructor()
    {
        a=10;
        b=20.5;
        c="sampat";

    }
        contructor(int x)
        {
            a=x;
        }
        contructor(int x, String z)
        {
            a=x ; c=z;

        }
        public static void main(String[]args){
        contructor r = new contructor();
        contructor r1 = new contructor(100);
        contructor r2 = new contructor(200,"aman");
            System.out.println(r.a+" "+r.b+" "+r.c);
            System.out.println(r1.a+" ");
            System.out.println(r2.a+" "+r2.c);


        }
}
