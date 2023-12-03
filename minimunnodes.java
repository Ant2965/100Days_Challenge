// O(N)time O(1)space
class minimumnodes {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length == 1) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            res += Math.max(Math.abs(points[i][0] - points[i - 1][0]),
                    Math.abs(points[i][1] - points[i - 1][1]));
        }
        return res;
    }
}