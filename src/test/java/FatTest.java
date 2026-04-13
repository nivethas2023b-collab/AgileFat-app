import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FatTest {

    @Test
    void testMedicine() {
        assertTrue(FatService.isValidMedicine("Paracetamol"));
        assertFalse(FatService.isValidMedicine("Wrong"));
    }

    @Test
    void testDosage() {
        assertTrue(FatService.isValidDosage(500));
        assertFalse(FatService.isValidDosage(2000));
    }
}