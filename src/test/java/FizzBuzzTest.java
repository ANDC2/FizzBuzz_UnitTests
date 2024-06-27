import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class FizzBuzzTest {

    @Test
    public void fizzBuzzOf_0is0(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("0",fizzBuzz.fizzBuzz(0));
    }
    @Test
    public void fizzBuzzOf_1is1(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("1",fizzBuzz.fizzBuzz(1));
    }
    @Test
    public void fizzBuzzOf_3isFizz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("Fizz",fizzBuzz.fizzBuzz(3));
    }
    @Test
    public void fizzBuzzOf_5isBuzz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.fizzBuzz(5));
    }
    @Test
    public void fizzBuzzOf_6isFizz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("Fizz",fizzBuzz.fizzBuzz(6));
    }
    @Test
    public void fizzBuzzOf_10isBuzz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("Buzz",fizzBuzz.fizzBuzz(10));
    }
    @Test
    public void fizzBuzzOf_15isFizzBuzz(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz(15));
    }

}