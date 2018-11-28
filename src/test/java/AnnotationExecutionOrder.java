import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Kostya on 28.11.2018.
 */
public class AnnotationExecutionOrder {

    @BeforeClass
    public void firstMethod(){
        System.out.println("Im before class");
    }

    @BeforeMethod
    public void secondMethod(){
        System.out.println("Before method");
    }

}
