import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.*;

public class Tests {
    Calculator sut;
    @BeforeAll
    public static void start (){
        System.out.println("Tests started");
    }
    @BeforeEach
    public void init (){
        System.out.println("Test started");
        sut = new Calculator();
    }
    @AfterAll
    public static void finishAll (){
        System.out.println("Tests are complete");
    }
    @AfterEach
    public void finish (){
        sut = null;
        System.out.println("Test complete");
    }

    @Test
    public void testPlus (){
        //arrange
        int a = -2, b = -3, expected = -5;
        //act
        int result = sut.plus.apply(a, b);
        //assert
        assertThat(expected, is(result));
    }
    @Test
    public void testMinus (){
        //arrange
        int a = 10, b = -5, expected = 15;
        //act
        int result = sut.minus.apply(a, b);
        //assert
        assertThat(expected, is(result));
    }
    @Test
    public void testMultiply (){
        //arrange
        int a = -3, b = -5, expected = 15;
        //act
        int result = sut.multiply.apply(a, b);
        //assert
        assertThat(expected, is(result));
    }
    @Test
    public void testDevide (){
        //arrange
        int a = -9, b = 3, expected = -3;
        //act
        int result = sut.devide.apply(a, b);
        //assert
        assertThat(expected, is(result));
    }
    @Test
    public void testPow (){
        //arrange
        int a = 5, expected = 25;
        //act
        int result = sut.pow.apply(a);
        //assert
        assertThat(expected, is(result));
    }
    @Test
    public void testAbs(){
        //arrange
        int a = -108, expected = 108;
        //act
        int result = sut.abs.apply(a);
        //assert
        assertThat(expected, is(result));
    }
}
