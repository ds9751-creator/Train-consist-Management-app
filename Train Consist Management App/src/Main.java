public class Main {

    // ---- CUSTOM EXCEPTION ----
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie model with validation
    static class PassengerBogie {
        String type;
        int capacity;

        // Constructor declaring 'throws' to handle validation
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Created Bogie: " + type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==============================================\n");

        // Scenario 1: Valid Capacity
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Scenario 2: Invalid Capacity (Zero)
        try {
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println(b2);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}