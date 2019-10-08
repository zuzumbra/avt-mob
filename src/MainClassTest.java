import org.junit.Test;

public class MainClassTest {

    //Тест1
    @Test
    public void testGetLocalNumber() {
        MainClass number = new MainClass();
        int get_num = number.getLocalNumber();
        if (get_num == 14) {
            System.out.println(get_num);
        } else {
            System.out.println("The number " + get_num + " is not equal to 14");
        }
    }

    //Тест2
    @Test
    public void testGetClassNumber() {
        if (MainClass.getClassNumber() > 45) {
            System.out.println("Test passed");
        } else {
            System.out.println("The number less then 45");
        }
    }

    //Тест3
    @Test
    public void testGetClassString() {
        String check = MainClass.getClassString();
        if (check.contains("Hello")) {
            System.out.println("Test passed");
        } else if (check.contains("hello")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

    }

}


