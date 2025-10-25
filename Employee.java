class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String city;
    private int joiningYear;

    public Employee(int id, String name, String department, double salary,
                    String city, int joiningYear) {
        this.id = id; this.name = name; this.department = department;
        this.salary = salary; this.city = city; this.joiningYear = joiningYear;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getCity() { return city; }
    public int getJoiningYear() { return joiningYear; }

    public String toString() {
        return name + " | " + department + " | " + city + " | " + salary;
    }
}
