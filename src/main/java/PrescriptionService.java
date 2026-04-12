public class PrescriptionService {

    public static boolean isValidMedicine(String medicine) {
        if (medicine == null || medicine.trim().isEmpty()) return false;

        String[] meds = {"Paracetamol", "Ibuprofen"};
        for (String m : meds) {
            if (m.equalsIgnoreCase(medicine)) return true;
        }
        return false;
    }

    public static boolean isValidDosage(int dosage) {
        return dosage > 0 && dosage <= 1000;
    }

    public static boolean validatePrescription(String med, int dose) {
        return isValidMedicine(med) && isValidDosage(dose);
    }

    // 🔥 MAIN METHOD (IMPORTANT)
    public static void main(String[] args) {
        System.out.println("Prescription App Running...");

        boolean result = validatePrescription("Paracetamol", 500);
        System.out.println("Validation Result: " + result);

        // Keep container alive
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("App is running...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}