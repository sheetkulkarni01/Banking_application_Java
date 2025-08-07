import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Banking {
    Create c;

    @Before
    public void setUp() {
        c = new Create();
    }

    @Test
    public void testAddAcc() {
        assertEquals(0, c.addAcc(10, 10));
        assertEquals(20, c.addAcc(20, 200));
        assertEquals(30, c.addAcc(30, 345));
    }

    @Test
    public void testDeposit() {
        assertEquals(6000, c.deposit(1000, 1020, 1020, 5000));
        assertEquals(15000, c.deposit(5000, 1021, 1021, 10000));
        assertEquals(13800, c.deposit(5000, 1022, 1022, 8800));
    }

    @Test
    public void testWithdraw() {
        assertEquals(500, c.withdraw(500, 2099, 2099, 1000));
        assertEquals(900, c.withdraw(100, 2066, 2066, 1000));
        assertEquals(122, c.withdraw(878, 2055, 2055, 1000));
    }

    @Test
    public void testTotBal() {
        assertEquals(5000, c.totbal(5000));
    }

    @Test
    public void testTransfer() {
        assertEquals(9000, c.transfer(1055, 10000, 1000, 1056));
        assertEquals(8990, c.transfer(1057, 10078, 1088, 5687));
        assertEquals(48400, c.transfer(5523, 56000, 7600, 5654));
    }

    @Test
    public void testRichest() {
        assertEquals(50000, c.richest(50000, 5500, 1));
    }
}
