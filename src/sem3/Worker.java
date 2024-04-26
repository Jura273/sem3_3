package sem3;

public class Worker extends Emploee {
    private static double maxSalary;
    private static double minSalary;


    private Worker(String name, double salary, double maxSalary, double minSalary){
        super(name, salary);
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    @Override
    public void printDisplayInfo() {

        System.out.printf("%s; %d\n", name, salary, maxSalary, minSalary);

    }



    public static Emploee create(String name, Double salary, double maxSalary, double minSalary){
        if (salary < minSalary) {
            throw new RuntimeException("Сумма не должна быть ниже.");

        }
        if (salary > maxSalary) {
            throw new RuntimeException("Сумма не должна быть больше.");

        }


        if (name == null || name.length() < 3){
            throw new RuntimeException("Некорректное имя человека.");
        }

        return new Worker(name, salary, maxSalary, minSalary);

    }




}