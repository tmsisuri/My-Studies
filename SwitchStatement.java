class SwitchStatement {
    public static void main(String arg[]){
        int n = 2;
        switch(n){
            case 1 :
               System.out.println("Monday"); 
            break;
            case 2 :
               System.out.println("Tuesday");  
            break;
            case 3 :
               System.out.println("wednesday");
            break;
            case 4 :
               System.out.println("Thursday");
            break;  
            case 5 :
               System.out.println("Friday");
            break;
            case 6 :
               System.out.println("saturday");
            break;
            default :
               System.out.println("Sunday");
        }
        //new version of switch statement
        //break => yield 
        String day = "sunday";
        String result = "";
        result = switch(day){
            case "saturday" , "sunday" : yield "6am";
            case "monday" : yield "7am";
            default : yield "8am";
        };
        System.out.println(result);
        //arrow for switch statement
         //switch as an expression
        switch(day){
            case "saturday" , "sunday" -> result = "6am";
            case "monday" -> result = "7am";
            default -> result = "8am";
        }
        //switch to return a value
        System.out.println(result);
        result = switch(day){
            case "saturday" , "sunday" -> "6am";
            case "monday" -> "7am";
            default -> "8am";
        };
        System.out.println(result);
    }
    
}
