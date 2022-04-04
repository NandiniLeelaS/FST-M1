    package activities;

    public class Activity8 {
        public static void main(String[] args) {
            try {
                Activity8.exceptionTest("Will print to console");
                Activity8.exceptionTest(null);

            }
            catch (CustomException e){
                System.out.println("In catch block: " +e.getMessage());

            }

        }

        public static void exceptionTest(String will_print_to_console) throws CustomException {

            if (will_print_to_console==null){

                throw new CustomException("String passed is null");

            }
            else
                System.out.println(will_print_to_console);

        }
    }
