package EmployeeBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 */
class RandomEmployeeBuilder extends EmployeeBuilder implements Builder<ImmutableEmployee> {

    private static final List<String> NAMES = Arrays.asList("Fred", "Sara", "Barny", "Barny");
    private static Random random = new Random();

    public RandomEmployeeBuilder() {
        super(getRandomName(), getRandomAge(),getRandomDept());
    }

    private static Department getRandomDept() {
        return Arrays.asList(Department.values()).get(random.nextInt(Department.values().length));
    }

    private static int getRandomAge() {
        return random.nextInt(100);
    }

    private static String getRandomName() {
        return NAMES.get(random.nextInt(NAMES.size()));
    }

    @Override
    public ImmutableEmployee build() {
        return super.build();
    }
}
