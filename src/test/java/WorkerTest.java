import com.FlowerShop_OOP.Entity.Shop;
import com.FlowerShop_OOP.Helpers.Worker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Victor on 12.11.2017.
 */
public class WorkerTest {
    private Shop shop;

    @Before
    public void  init() {
        shop = new Shop();
    }

    @After
    public void tearDown() { shop = null; }

    @Test
    public void addnewBuqetTest(){
        assertTrue(Worker.addNewBuquet(shop));
    }

    @Test
    public  void deleteBoquetTest(){
        assertTrue(Worker.deleteBuquet(shop));
    }

    @Test
    public  void addFlowerTest(){
        assertTrue(Worker.addNewPlant(shop));
    }
    @Test
    public  void deleteFlowerTest(){
        assertTrue(Worker.deleteFlower(shop));
    }








}
