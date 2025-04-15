package src;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        var test1 = new Test("Andr");
        var test2 = new Test("Andr");

        System.out.println(test1.equals(test2));
    }
}

class Test {
    private final String filed;

    Test(String filed) {
        this.filed = filed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(filed, test.filed);
    }
}
