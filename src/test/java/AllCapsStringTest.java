import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//junit: open source unit testing framework
//unit under test: the unit (method, class, interface) that we are testing
//test class: normal java class, it contains tests (methods with the @Test annotation)
//convention: slap "test" on the end of the name of the class under test
public class AllCapsStringTest {

    AllCapsString allCapsString;
    //use the @After and @Before annotations
    //to set up a "test fixture"
    //test fixture: a fixed state of unit under test
    //used for each test method
    //@Before setup() --> sets up the state of unit under test
    //@After tearDown() --> cleans up the state of unit under test
    @Before
    public void setup(){
        System.out.println("Hello from setup");
        allCapsString = new AllCapsString("hello");
    }
    @After
    public void tearDown(){
        System.out.println("Hello from tearDown");
        //release resources (close files, close sockets, etc.)
        allCapsString = null;
    }

    //test method: normal java method with @Test annotation to denote that it is a test
    //convention: "test<unit name> or "should<do something>
    //how do we execute tests?
    //-IDE or a build tool/system (like Gradle or Maven)
    //execute tests directly (no main())
    //-main() and run a "test suite"
    @Test
    public void testConstructor(){
        assertEquals(allCapsString.getCapsStr(), "HELLO");
        //actual value, expected value
    }

    @Test
    public void testSetter(){
        allCapsString.setCapsStr("goodbye");
        assertEquals(allCapsString.getCapsStr(), "GOODBY");
    }
}
