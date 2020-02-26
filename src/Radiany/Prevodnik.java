package Radiany;

public class Prevodnik {


    public static double stupenRadian(double uhol) {
        return (Math.PI * uhol) / 180;
    }
    public static double radianStupen(double radian){
        return (radian*180)/Math.PI;
    }
}
