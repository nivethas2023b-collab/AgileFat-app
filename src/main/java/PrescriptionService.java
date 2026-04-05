public class PrescriptionService {

    public static boolean isValidMedicine(String medicine) {
        if (medicine == null || medicine.trim().isEmpty()) {
            return false;
        }

        String[] validMeds = {"Paracetamol", "Ibuprofen"};

        for (String med : validMeds) {
            if (med.equalsIgnoreCase(medicine)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidDosage(int dosage) {
        return dosage > 0 && dosage <= 1000;
    }

    public static boolean validatePrescription(String medicine, int dosage) {
        return isValidMedicine(medicine) && isValidDosage(dosage);
    }
}