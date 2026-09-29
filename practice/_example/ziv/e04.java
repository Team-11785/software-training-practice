package practice._example.ziv;

public class e04 {
    public static void main(String[]args){
        for (int i=0;i<=20;i+=2){
            System.out.println(i);
        }
        for(int i=7;i<=70;i+=7){
            System.out.println(i);
        }
        int sum=0;
        for(int i=1;i<=50;i++){
            sum+=i;
        }
        System.out.println(sum);
        for(int i=1;i<=30;i++){
            if(i%3==0||i%5==0)
            {
                if(i%3==0){System.out.print("fizz");}
                if(i%5==0){System.out.print("buzz");}
                System.out.println();
            }
            else{System.out.println(i);}


        }
        double[] readings = {1.5, -2.0, 3.0, 9.9, 0.4};
        double sumreadings=0;
        int above_one=0;
        double max=readings[0];
        for (double r:readings){
            sumreadings+=r;
            if(r>1){above_one++;}
            if(r>max){max=r;}
        }
        System.out.println(sumreadings);
        System.out.println(sumreadings/readings.length);
        System.out.println(above_one);
        System.out.println(max);
        
        final double arm_movment_degrees=1.5;
        double sum_dgreas=0;
        int count=0;
        while(sum_dgreas<90){
            sum_dgreas+=arm_movment_degrees;
            count++;
            System.out.println(count);
        }


    }
    
}
