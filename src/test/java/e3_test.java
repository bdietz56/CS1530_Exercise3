import static org.junit.Assert.*;
import org.junit.*;
//import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class e3_test{
    e3 x = new e3();

    @Test
    public void zeroLazy(){
        assertEquals(1, x.calculateLazy(0));
    }

    @Test
    public void zeroTriangle(){
        assertEquals(0, x.calculateTriangle(0));
    }

    @Test
    public void fiveLazy(){
        assertEquals(16, x.calculateLazy(5));
    }

    @Test
    public void fiveTriangle(){
        assertEquals(15, x.calculateTriangle(5));
    }

    @Test
    public void tenLazy(){
        assertEquals(56, x.calculateLazy(10));
    }

    @Test
    public void tenTriangle(){
        assertEquals(55, x.calculateTriangle(10));
    }
}
