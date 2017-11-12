

import com.FlowerShop_OOP.Main.Main;
import org.junit.Test;


public class MainTest {
    @Test
    public void main() throws Exception {
        Main m = new Main();
        if (Main.scanner == null) throw new Exception();
    }
}