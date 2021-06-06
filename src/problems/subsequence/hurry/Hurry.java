package problems.subsequence.hurry;

public class Hurry {

    public int solve(int n, int t, int[][] task) {

        int noOfTasks = 0;
        int loc, time, totalTime = 0, lastLoc = 0;
        for(int i = 0; i < n; i++) {

            loc = task[i][0];
            time = task[i][1];

            if(i == 0) {
                totalTime = loc + time;
                if((totalTime < t) && (t - loc) > 0) {
                    System.out.println(i + " " + t );
                    lastLoc = loc;
                    t -= totalTime;
                    noOfTasks++;
                }
            }
            else {
                totalTime = (loc - lastLoc) + time;
                if((t - totalTime) > 0 && (Math.abs(t - loc)) > 0) {
                    System.out.println(i + " " + t );
                    lastLoc = loc;
                    t -= totalTime;
                    noOfTasks++;
                }
            }

        }

        return noOfTasks;

    }

}
