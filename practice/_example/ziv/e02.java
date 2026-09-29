package practice._example.ziv;

public class e02 {
    public static void main(String[] args)
    {
        System.out.println(9 / 4);/*int/int = int */
        System.out.println(9.0 / 4);/*double/int=double */
        System.out.println(9 % 4);/*reminder of 9/4 */
        System.out.println(9.0 / 4.0);/*double/souble=double */

        final double wheel_radius_meters =0.0508;
        double distance_wheel_rotation=2*Math.PI*wheel_radius_meters;
        System.out.println(distance_wheel_rotation*3);
        double joystick_val=-0.6;
        final double max_speed_meter_per_second=4;
        double movment_speed=joystick_val*max_speed_meter_per_second;
        System.out.println(movment_speed);
        System.out.println("absulote speed:"+Math.abs(movment_speed));

        double target = 100.0; 
        double measured = 96.5;
        boolean are_5_to_each_other=target-measured<=5;
        System.out.println(are_5_to_each_other);

        int total = 5;
        int count = 2;
        double average = (double)total / count;
        System.out.println(average);
        System.out.println(Math.sin(Math.toRadians(45)));
    }
}
