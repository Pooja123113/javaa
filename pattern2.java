class pattern2
{
	public static void main(String[]args)
{
	int i,j,k,n=10;
	for(i=0;i<=n-1;i++)
	{
	
	for(j=0;j<=i;j++)
	{
	System.out.print(" ");
	}
	for(k=0;k<=n-1-i;k++)
	{
	System.out.print("*" + " ");
	}
	System.out.println();
   }
  }
}