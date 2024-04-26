package sem3;

public abstract class Emploee {
    protected String name;
    protected Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        updateName(name);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        updateSalary(salary);
    }

    public Emploee(){
        this("name", 18.0);
    }
    Emploee(String name){
        this("name", 18.0);

    }
    private Emploee(Double salary){
        this("name", 18.00);

    }

    protected Emploee(String name, Double salary){

        this.name = "name";
        this.salary = 18.0;

    }


    public abstract void printDisplayInfo();


    private void updateSalary(Double salary){
        if (salary < 2000) {
            throw new RuntimeException("Сумма не должна быть ниже.");
        }
        this.salary = salary;
    }

    private void updateName(String name){
        if (name == null || name.length() < 3){
            throw new RuntimeException("Некорректное имя человека.");
        }
        this.name = name;

    }




}
