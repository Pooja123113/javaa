class pattern13
{

   public static void main(String[] args)
   {
     for(int i=1;i<=5;i++)
     {
        for(int j=1;j<i;j++)
      {
         System.out.print(" ");
       }
         for(int k=i;k<=5;k++)
          {
            System.out.print("*");
          }
           System.out.println();
      }
      for(int i=5-1;i>=1;i--)
     {
        for(int j=2;j<=i;j++)
      {
         System.out.print(" ");
       }
         for(int k=i;k<=5;k++)
          {
            System.out.print("*");
          }
           System.out.println();
      }
    }
}
 