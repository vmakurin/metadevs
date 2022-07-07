package vmakurin;

public class Person implements Worker {
    private String name;
    private int age;
    private int salary;
    private String companyName;

    {
        salary = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void aboutPerson(){
        System.out.println(getName() + " " + getAge() + " " + getSalary() + " " + getCompanyName());
    }

    public boolean checkDifference(){
        boolean statement = salary >= age;
        System.out.println(statement);
        return statement;
    }

    @Override
    public void coolerTalk() {
        System.out.println("Сплетница галимая");
    }

    @Override
    public void smoking() {
        System.out.println("Курильчик беспонтовка");
    }

    @Override
    public void toGetVacation() {
        System.out.println("Уехал в отпуск");
    }

    @Override
    public void toGetLunch() {
        System.out.println("Баклажаны ест");

    }
}
