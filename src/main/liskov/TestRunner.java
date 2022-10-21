package main.liskov;

interface TestRunner {
    void executeTest();

    boolean generateReport();
}

class Regression implements TestRunner {
    @Override
    public void executeTest() {
        System.out.println("Run regression scope");
    }

    @Override
    public boolean generateReport() {
        return true;
    }
}

class Performance implements TestRunner {
    @Override
    public void executeTest() {
        System.out.println("Run performance tests");
    }

    @Override
    public boolean generateReport() {
        return false;
    }
}

class Runner {
    public static void main(String[] args) {
        TestRunner test = new Regression();
        test.executeTest();
        System.out.println("Generate report " + test.generateReport());
        test = new Performance();
        test.executeTest();
        System.out.println("Generate report " + test.generateReport());
    }
}