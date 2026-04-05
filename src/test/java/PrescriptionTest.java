import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrescriptionTest {

    @Test
    void testMedicine() {
        assertTrue(PrescriptionService.isValidMedicine("Paracetamol"));
        assertFalse(PrescriptionService.isValidMedicine("Wrong"));
    }

    @Test
    void testDosage() {
        assertTrue(PrescriptionService.isValidDosage(500));
        assertFalse(PrescriptionService.isValidDosage(2000));
    }
}