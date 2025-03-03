
public class Main {
    public static void main(String[] args) {
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = totalHours / hoursPerEmployee;

        System.out.println(totalHours);
        System.out.println("Всего работников в компании — " + totalEmployees + " человек.");

        var increasedEmployees = totalEmployees + 94;
        var newTotalHours = increasedEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + increasedEmployees + " человек, то всего "
                + newTotalHours + " часов работы может быть поделено между сотрудниками.");

    }
}
