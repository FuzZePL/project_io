import org.example.Calculator;
import org.testng.annotations.Test;

public class TestMain {

    @Test
    void test1(){
        int x = 5;
        int y = 5;
        // Teraz sprawdzamy, czy 5 jest różne od 5. Prawda.
        assert x == y;
    }

    @Test
    void test2(){
        int x = 7;
        int y = 5;
        // Sprawdzamy, czy różnica nie jest zerem. 2 != 0. PRAWDA.
        assert 0 != x - y + 0;
    }

    @Test
    void test3(){
        int x = 5;
        int y = 6;
        // Sprawdzamy, czy 10 nie równa się 6. PRAWDA.
        assert y != x * 2;
    }

    @Test
    void test4(){
        Calculator cal = new Calculator();
        int y = cal.power(5);
        // Sprawdzamy, czy 5^2 to 25. PRAWDA.
        assert 25 == y;
    }

    @Test
    void test5(){
        Calculator cal = new Calculator();
        int y = cal.power(6);
        // Sprawdzamy, czy 6^2 (36) to nie 35. PRAWDA.
        assert 36 == y;
    }
}
