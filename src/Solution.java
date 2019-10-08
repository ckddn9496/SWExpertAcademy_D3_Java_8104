import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String[] NK = sc.nextLine().split(" ");
			int N = Integer.parseInt(NK[0]);
			int K = Integer.parseInt(NK[1]);
			
			int q = N/2;
			int r = N%2;
			
			StringBuilder result = new StringBuilder();
			int num;
			
			if (r == 0) {
				num = 2*q*q*K + q;
				result.append("#"+test_case+" ");
				for (int i = 0; i < K; i++) {
					result.append(Integer.toString(num)+" ");
				}
				System.out.println(result.toString());
			} else {
				num = 2*q*q*K + q + 2*q*K + 1;
				result.append("#"+test_case+" ");
				for (int i = 0; i < K; i++) {
					result.append(Integer.toString(num++)+" ");
				}
				System.out.println(result.toString());
			}
			
		}
	}
}