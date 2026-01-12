import java.util.Scanner;


class SumofDiagonal {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
      for(int i = 0;i<mat.length;i++)
      {
        sum+=mat[i][i];

        if(i != mat.length-1-i)
        {
            sum+=mat[i][mat.length-1-i];
        }
      } 
      return sum; 
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mat = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        SumofDiagonal obj = new SumofDiagonal();
        int result = obj.diagonal(mat);
    }
}