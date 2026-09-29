package practice._example.ziv;

public class e05 {
    public static void main(String[]args){ 
        double []  readings ={};
        System.out.println(averageOf(readings));  

    }
    static double inchesToMeters(double inches){
        return inches*0.0254;
    }
    static double clamp(double value, double min, double max)
    {
        if(value<=min){return min;}
        if(value>=max){return max;}
        return value;
    }
    static double deadband(double value, double band){
        if(Math.abs(value)<band){return 0;}
        return value;
    }
    static boolean isAtTarget(double measured, double target, double tol){
        if(measured <target-tol){return false;}
        if(measured>target+tol){return false;}
        return true;
    }
    static double averageOf(double[] readings)
    {
        double sum=0;
        for(int i=0;i<readings.length;i++){
            sum+=readings[i];
        }
        double avg =sum/readings.length;
        return avg;
        /*I will return NaN for an empty arry becasue its the defult return value for that */
    }
    static double rpm_to_rad_per_sec(double rpm){
        return rpm*(2.0 * Math.PI / 60.0);
    }
}
