package practice._example.ziv;

public class e03 {
    public static void main(String[]args)
    {
        double batteryVolts=12;
        if(batteryVolts<10.5){
            System.out.println("critical");
        }
        else if (batteryVolts<11.5){
            System.out.println("low");
        }
        else{
            System.out.println("ok");
        }

        boolean isEnabled=true;
        double joystick=1;
        if(!isEnabled){
            System.out.println(0.0);
        }
        else if(joystick<-0.8){
            System.out.println(-0.8);
        }
        else if(joystick>0.8){
            System.out.println(0.8);
        }
        else{System.out.println(joystick);}
        
        double armDegrees=44;
        double tolorance=2;
        double target=45;
        if(armDegrees>=target-tolorance&&armDegrees<=target+tolorance){
            System.out.println("at target");
        }
        else if (armDegrees>target){
            System.out.println("go down");
        }
        else{ System.out.println("go up");}
        
        boolean seesTarget=true;
        boolean isAimed=false;
        boolean hasGamePiece=true;
        if(seesTarget&&isAimed&&hasGamePiece){
            System.out.println("SHOOT");
        }
        else{System.out.println("WAIT");}
        
        if (!isEnabled) {return;}
        if (!hasGamePiece) {return;}
        if (!seesTarget) {return;}
        System.out.println("ready");
              









    }
}
