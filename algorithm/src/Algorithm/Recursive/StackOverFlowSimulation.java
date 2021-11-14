package Algorithm.Recursive;

public class StackOverFlowSimulation {
    private int depth = 0;

    public void test() {
        this.depth++;
        test();
    }

    //JVM -Xss256k
    public static void main(String[] args) {
        StackOverFlowSimulation testStack = new StackOverFlowSimulation();
        try {
            testStack.test();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("调用栈的深度（次数）：" + testStack.depth);
        }
    }

}
