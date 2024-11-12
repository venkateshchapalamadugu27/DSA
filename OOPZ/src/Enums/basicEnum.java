package Enums;

public class basicEnum {
    enum Week{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }

    public static void main(String[] args) {
        Week week=Week.Monday;
        for(Week day:Week.values()){
            System.out.print(day+",");
        }
        System.out.println(week.ordinal());
    }
}
