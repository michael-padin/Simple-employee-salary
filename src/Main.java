import java.util.Scanner;

public class Main {
    String name;
    int hoursWorkPerWeek, ratePerHour, hoursAbsent, salary;

    public Main(String name, int hoursWorkPerWeek, int hoursAbsent, int ratePerHour) {
        this.name = name;
        this.hoursWorkPerWeek = hoursWorkPerWeek;
        this.hoursAbsent = hoursAbsent;
        this.ratePerHour = ratePerHour;
        this.salary = (hoursWorkPerWeek - hoursAbsent) * ratePerHour;
    }

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee name: ");
        String name = scan.nextLine();
        System.out.println("Hours work for the week: ");
        int hoursPerWeek = scan.nextInt();
        System.out.println("Hours absent: ");
        int HoursAbsent =scan.nextInt();
        System.out.println("Rate per hour: ");
        int ratePerHour = scan.nextInt();
        scan.close();

        Main employee = new Main(name, hoursPerWeek, HoursAbsent, ratePerHour);
        System.out.println("-----------------------------------------------------------");
        System.out.println(employee.name + "'s " + "salary is: " + employee.salary);

    }
}
