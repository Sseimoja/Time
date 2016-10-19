/**
 * Created by opilane on 19.10.2016.
 */
public class Time {public static void main(String[] args) {
    String tunnid = "15:";
    System.out.print(tunnid);
    String minutid = "19 ";
    System.out.print(minutid);
    int hour = 15;
    int minute = 19;
    System.out.print("Number of seconds since midnight: ");
    System.out.println((hour*60+minute)*60);
    int hou = 8;
    int minut = 41;
    System.out.print("Number of seconds remaining in the day: ");
    System.out.println((hou*60+minut)*60);
    double mi = 55140;
    System.out.print("Fraction of the day that has passed: ");
    System.out.println(mi / 86400.0);

}}
