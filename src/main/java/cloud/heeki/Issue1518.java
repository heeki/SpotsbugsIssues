package cloud.heeki;

import java.util.Random;

public class Issue1518 {
    private final Random RANDOM = new Random();

    /** warns on coercing fp number */
    public void warnsOnIssue() {
        int testFloat = (int)RANDOM.nextFloat();
        System.out.println(testFloat);
        int testDouble = (int)RANDOM.nextDouble();
        System.out.println(testDouble);
    }

    /** no warning on coercing fp number */
    public void doesNotWarnOnIssue() {
        float testFloat = RANDOM.nextFloat();
        int testIntForFloat = (int)testFloat;
        System.out.printf("%f -> %d%n", testFloat, testIntForFloat);
        double testDouble = RANDOM.nextDouble();
        int testIntForDouble = (int)testDouble;
        System.out.printf("%f -> %d%n", testDouble, testIntForDouble);
    }
}