import com.github.kangmoo.reflection.utils.ReflectionUtil;
import org.junit.Test;

/**
 * How to use sample
 * @author kangmoo Heo
 */
public class ReflectionTest {
    private static int num = 3;
    private static final ReflectionTest INSTANCE = new ReflectionTest();

    public static ReflectionTest getInstance() {
        return INSTANCE;
    }

    @Test
    public void reflectionTest() throws Exception {
        System.out.println("My Name = " + ReflectionUtil.exec("new java.lang.String(\"KangMoo\")"));
        System.out.println(ReflectionUtil.exec("ReflectionTest.sum(\"Class Name is \", \"ReflectionTest\")"));
        System.out.println("ReflectionTest.num = " + ReflectionUtil.exec("ReflectionTest.num"));
        System.out.println("INT SUM = " + ReflectionUtil.exec("ReflectionTest.getInstance().sum(1, 2)"));
        System.out.println("INT SUM = " + ReflectionUtil.exec("ReflectionTest.getInstance().sum((int)3.14, (int)3.14)"));
        System.out.println("FLOAT SUM = " + ReflectionUtil.exec("ReflectionTest.getInstance().sum((float)3.14, (float)3.14)"));
        System.out.println("DOUBLE SUM = " + ReflectionUtil.exec("ReflectionTest.sum(3.14, 3.14)"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String a, String b){
        return a + b;
    }
}
