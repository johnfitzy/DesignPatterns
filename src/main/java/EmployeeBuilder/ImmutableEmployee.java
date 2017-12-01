package EmployeeBuilder;

import org.apache.commons.lang3.builder.ToStringBuilder;

public final class ImmutableEmployee{

    private String name;
    private int age;
    private Department department;


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Department getDepartment() {
        return this.department;
    }

    public ImmutableEmployee(final String name, final int age, final Department department) {
        this.name = name;
        this.age = age;
        this.department = department;

    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append(this.name)
                .append(this.age)
                .append(this.department)
                .build();
    }
}
