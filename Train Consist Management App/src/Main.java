import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("==============================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ----
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile Patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate
        boolean isTrainIdValid = trainMatcher.matches();
        boolean isCargoCodeValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }
}