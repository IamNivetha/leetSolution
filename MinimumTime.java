class MinimumTime {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for(int i = 1;i<points.length;i++)
        {
          int  dx = Math.abs(points[i][0] - points[i-1][0]);
          int  dy = Math.abs(points[i][1] - points[i-1][1]);
            time += Math.max(dx,dy);
        }
        return time;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][n];
        for(int i = 0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                points[i][j] = sc.nextInt();
            }
        }
       MinimumTime obj = new MinimumTime();
       int result = obj.minTimeTovisitAllPoints(points);
       System.out.println(result);
    }
}