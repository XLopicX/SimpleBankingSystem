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
    public void testWithdraw() {
        try {
            // Correcte
            account.withdrawAmount(500.0);
            assertEquals(500.0, account.getBalance(), 0.001);
            
            // Error: numeros negatius
            try {
                account.withdrawAmount(-100.0);
                fail("S'esperava una excepció per quantitat negativa");
            } catch (Exception e) {
                assertEquals("No es pot retirar una quantitat negativa.", e.getMessage());
            }
            
            // Error: Falta de saldo
            try {
                account.withdrawAmount(1000.0);
                fail("S'esperava una excepció per saldo insufficient");
            } catch (Exception e) {
                assertEquals("No hi ha suficient saldo", e.getMessage());
            }
        } catch (Exception e) {
            fail("No s'esperava cap excepció: " + e.getMessage());
        }
    }
}
