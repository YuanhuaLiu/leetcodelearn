package Medium;

public class GasStationbest {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int sum = 0;
        int start = 0;
        for (int i=0; i<gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            sum += diff;
             
            if (sum<0) {
                sum = 0;
                start = i+1;
            }
        }
         
        if (total<0)
            return -1;
        return start;
    }
}
