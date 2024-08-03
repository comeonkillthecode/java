package org.junit;

import org.junit.jupiter.api.*;

public class ShapeTest {
    private Shape shape = null;

    @BeforeAll
    static void initAll(){
        System.out.println("BeforeAll");
        Shape shape = new Shape();
    }

    @BeforeEach
    void init(){
        System.out.println("BeforeEach");
         shape = new Shape();
    }

    @Test
    void testComputeSquareArea(){
        double result = shape.computeSquareArea(5);
        Assertions.assertEquals(25, result);
    }
    @Test
    void testComputeCircleArea(){
        double result = shape.computeCircleArea(5);
        Assertions.assertEquals(78.5, result);
    }

    @AfterEach
    void close(){
        System.out.println("AfterEach");
    }

    @AfterAll
    static void closeAll(){
        System.out.println("AfterAll");
    }

}
