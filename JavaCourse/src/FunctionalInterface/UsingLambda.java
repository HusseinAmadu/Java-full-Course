package FunctionalInterface;

public class UsingLambda {
    public static void main(String[] args) {
        // parameter -> expression
        // parameter -> { statement; }
        DoTest manual = (String useCase) -> System.out.println(useCase);
        DoTest auto = (String useCase) -> System.out.println(useCase);
        manual.test("manual");
        auto.test("automation");
    }
}
