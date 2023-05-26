public class BmiService {
    public int calculate(double height, int weight) {
        double ht = height * height;
        double wt = (double) weight;
        double bmid;
        bmid = wt / ht;
        int bmi = (int) bmid;
        return bmi;
    }
}
