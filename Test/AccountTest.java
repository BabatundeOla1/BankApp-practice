import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testThatAccountCanBeCreated(){
        Account newAccount = new Account("BadAffeeez", 200.00, "1234567890", "savings", "1234");
        assertEquals("BadAffeeez", newAccount.getAccountName());
        assertNotEquals("johnson", newAccount.getAccountName());

        Account johnsonAccount = new Account("johnson", 200.00, "1234567890", "savings", "1234");
        assertEquals("johnson", johnsonAccount.getAccountName());
        assertNotEquals("BadAffeeez", johnsonAccount.getAccountName());

    }

    @Test
    public void testThatPinLengthMustBeFour(){
        Account newAccount = new Account("BadAffeeez", 200.00, "1234567890", "savings", "1234");
        assertEquals(4, newAccount.getPin().length());
    }

}