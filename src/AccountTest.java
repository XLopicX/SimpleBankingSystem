import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    
    private Account account;
    
    @Before
    public void setUp() {
        account = new Account("Flor Martinez", "1000-1234-56-123456789", 1000);
    }
    
    @Test
    public void testDeposit() {
        try {
            // Correcte
            account.depositAmount(500);
            assertEquals(1500, account.getBalance(), 0.001);
            
            // Error: Numeros negatius
            try {
                account.depositAmount(-100.0);
                fail("S'esperava una excepció per quantitat negativa");
            } catch (Exception e) {
                assertEquals("No es pot ingressar una quantitat negativa.", e.getMessage());
            }
        } catch (Exception e) {
            fail("No s'esperava cap excepció: " + e.getMessage());
        }
    }
}
