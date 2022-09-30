package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year%4)
        {
            case 0:
                if(year%100==0&&year%400!=0)
                    System.out.println("not leap");
                else
                    System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
        }

    }
}
