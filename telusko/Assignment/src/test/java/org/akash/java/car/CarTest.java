package car;

import static org.junit.jupiter.api.Assertions.*;

import org.akash.java.car.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Toyota", "Camry", 2020);
    }

    @Test
    public void testGetMake() {
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void testSetMake() {
        car.setMake("Honda");
        assertEquals("Honda", car.getMake());
    }

    @Test
    public void testGetModel() {
        assertEquals("Camry", car.getModel());
    }

    @Test
    public void testSetModel() {
        car.setModel("Accord");
        assertEquals("Accord", car.getModel());
    }

    @Test
    public void testGetYear() {
        assertEquals(2020, car.getYear());
    }

    @Test
    public void testSetYear() {
        car.setYear(2021);
        assertEquals(2021, car.getYear());
    }

    @Test
    public void testCarConstructor() {
        Car newCar = new Car("Ford", "Mustang", 2021);
        assertEquals("Ford", newCar.getMake());
        assertEquals("Mustang", newCar.getModel());
        assertEquals(2021, newCar.getYear());
    }
}
