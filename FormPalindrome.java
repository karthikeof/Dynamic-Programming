
import java.util.Scanner;

public class FormPalindrome {
    public static void main(String ar[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            String s=in.next();
            char[] str=s.toCharArray();
            int dp[][]=new int[str.length+1][str.length+1];
            for(int i=0;i<str.length;i++)
            {
                dp[i][i]=0;
            }
            for(int i=0;i<str.length-1;i++)
            {
                if(str[i]==str[i+1])
                dp[i][i+1]=0;
                else
                     dp[i][i+1]=1;
            }
                for(int i=2;i<str.length;i++)
                {
                    for(int j=0;j+i<str.length;j++)
                    {
                     if(str[j]==str[j+i])
                     {
                         
                             dp[j][j+i]=dp[j+1][(j+i)-1];
                     }
                     else
                         dp[j][j+i]=(dp[j][(j+i)-1]<dp[j+1][(j+i)]?dp[j][(j+i)-1]:dp[j+1][(j+i)])+1;
                    }
                }
            
            System.out.println(dp[0][str.length-1]);
            t--;
        }
        
    }
    
}
