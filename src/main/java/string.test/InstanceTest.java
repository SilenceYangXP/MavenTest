package string.test;

public class InstanceTest {
    private static InstanceTest instanceTest=null;

    public  static InstanceTest getInstanceTest() {

        if (instanceTest==null)
        {
            synchronized (InstanceTest.class) {
                if (instanceTest==null)
                instanceTest = new InstanceTest();
            }
        }
        return instanceTest;
    }

    private InstanceTest() {
    }
}
