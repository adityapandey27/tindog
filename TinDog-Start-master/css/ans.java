public class ans{
    public static void main(String args[])
    {
        int ans=4;
        int count=0;
        while(ans!=11)
        {
            if(count==0)
            {
                ans=ans+3;
                count=1;
                System.out.print(" "+ans);
            }
            else
            {
                ans=ans-2;
                count=0;
                System.out.print(" "+ans);

            }
        }
    }
}