package EmployeeBuilder;

public class EmployeeBuilder implements Builder<ImmutableEmployee> {

    private String builderName;
    private int builderAge;
    private Department builderDept;

    public EmployeeBuilder(){}

    public EmployeeBuilder(final String builderName, final int builderAge, final Department builderDept) {
        this.builderName = builderName;
        this.builderAge = builderAge;
        this.builderDept = builderDept;
    }

    public EmployeeBuilder(final ImmutableEmployee employee) {
        this(employee.getName(), employee.getAge(), employee.getDepartment());
    }

    public EmployeeBuilder employeeWithName(final String name) {
        builderName = name;
        return this;
    }

    public EmployeeBuilder employeeWithAge(final int age) {
        this.builderAge = age;
        return this;
    }

    public EmployeeBuilder employeeWithDepartment(Department department) {
        this.builderDept = department;
        return this;
    }

    public ImmutableEmployee buildRandomEmployee() {
        return new RandomEmployeeBuilder().build();
    }

    @Override
    public ImmutableEmployee build() {
        return new ImmutableEmployee(this.builderName, this.builderAge, this.builderDept);
    }
}

