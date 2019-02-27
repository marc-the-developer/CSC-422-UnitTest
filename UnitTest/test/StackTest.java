import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author marchill
 */
public class StackTest {
    
    private Stack stack;
    
    public StackTest() {
    }
    
    @Before
    public void setUp() throws Exception {
        stack = new Stack();
    }
    
    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        assertTrue("size() failed.", stack.size() == 0);
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        stack.push(0);
        assertTrue("push() failed.", stack.size() == 1);
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        stack.push(0);
        assertEquals(0, stack.pop());
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        stack.push(0);
        assertEquals(0, stack.peek());
        assertEquals(0, stack.pop());
    }
    
}
