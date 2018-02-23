import java.util.Scanner;

public class ClimbStairs {
	public int climbStairs(int n) {
        //Approach-1: This is basically a fibonacci sequence,just check till
        // n=5 and we can figure it out. 
        // if(n==1){
        //     return 1;
        // }
        // int first=1;
        // int second=2;
        // for(int i=3;i<=n;i++){
        //     int third=first+second;
        //     first=second;
        //     second=third;
        // }
        // return second;
        
        /*Approach-2: DP
        1) dp[]=[0 1        ]
        2) dp[]=[0 1 2      ]
        3) dp[]=[0 1 2 3    ]
        4) dp[]=[0 1 2 3 5  ]
        5) dp[]=[0 1 2 3 5 8]
        
        So here we observe that 
        dp[i]=dp[i-1]+dp[i-2]
        */
        int[] dp=new int[n+1];
        if(n==1){
            return 1;
        }
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
	
	public static void main(String[] args) {
		ClimbStairs obj=new ClimbStairs();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter input : ");
		int n=input.nextInt();
		System.out.println("Number of ways to climb stairs is : ");
		int out=obj.climbStairs(n);
		System.out.println(out);
	}
}
