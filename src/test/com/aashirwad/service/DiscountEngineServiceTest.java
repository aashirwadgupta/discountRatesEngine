package test.com.aashirwad.service;

import main.com.aashirwad.service.DiscountEngineService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Aashirwad Gupta
 */
public class DiscountEngineServiceTest {

    private DiscountEngineService discountEngineService;

    @BeforeAll
    public void setUp(){
        discountEngineService = new DiscountEngineService();
    }

    @Test
    public void testCalculateCartValue_Case1() {
        Map<String, Integer> cart = new TreeMap<>();
        cart.put("A", 4);
        cart.put("B", 3);
        cart.put("C", 2);
        cart.put("D", 1);

        int totalValue = discountEngineService.calculateCartValue(cart);
        assertEquals(335, totalValue);
    }

    @Test
    public void testCalculateCartValue_Case2() {
        Map<String, Integer> cart = new TreeMap<>();
        cart.put("A", 3);
        cart.put("B", 5);
        cart.put("D", 1);

        int totalValue = discountEngineService.calculateCartValue(cart);
        assertEquals(310, totalValue);
    }
}
