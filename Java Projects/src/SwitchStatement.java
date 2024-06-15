public class SwitchStatement {
    public static void main(String a[]) {
        /*
        int n = 8;

        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a number 1-7.");
        }
            This is the old switch statement, now I'm going to learn what's new:

        String day = "Sunday";

        switch(day) {
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }


        String day = "Sunday";
        String result = "";

        result = switch(day) { // we write "result =" here instead of in all cases
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        }; //have to add a semicolon since it's an expression now


        also can do it as such:
        */
        String day = "Sunday";
        String result = "";

        result = switch(day) {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };

        System.out.println(result);
    }
}
