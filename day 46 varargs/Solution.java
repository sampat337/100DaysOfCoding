class Add
{
    static void add(int...numbers)
    {
        int sum = 0;
        for(int num:numbers)
        {
            if(sum !=0){
                System.out.print("+");
            }
            sum+=num;
            System.out.print(num);
        }
        System.out.println("="+sum);
    }
}
