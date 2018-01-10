
/**
 * A quick program to play with GitHub classroom with primarily.
 *
 * @author Tyson Kendon
 * @version January 10, 2018
 */
public class TestOne
{

    private int x;
    private int y;

    /**
     * Constructor for objects of class TestOne
     */
    public TestOne(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Adds x to y and returns it;
     *
     * @return    the sum of x and y
     */
    public int sum()
    {
        return x + y;
    }
    
    public static void main(String[] args) {
        
        TestOne one = new TestOne(5, 7);
        TestOne two = new TestOne(1, 0);
        
        System.out.println(one.sum());
        System.out.println(two.sum());
        
    }
    
    
    
}
