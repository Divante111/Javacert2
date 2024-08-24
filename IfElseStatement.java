public class IfElseStatement {
    public static void main(String[] args) {
        boolean b = false;

        if(!b){
            System.out.println("false");
        } else{
            System.out.println(("true"));
        }

        int x = 1;
        // if (x) {
            
        // }
        // if(x =1){

        // }
        if (x == 1){

        }
        int testScore = 76;
        char grade;

        if (testScore >= 90){
            grade = 'A';
        } else if (testScore >= 80){
            grade = 'B';
        } else if (testScore >= 70){
            grade = 'C';
        }else if (testScore >= 60){
            grade = 'D';
        } else if (testScore >= 50){
            grade = 'E';
        } else{
            grade = 'F';
        }
        System.out.println("grade = " + grade);

        int hoursOfDay = 10;
        if (hoursOfDay < 11) System.out.println("morning");
        else if (hoursOfDay < 17) System.out.println("evening");
        else    
            System.out.println("day");
            // hoursOfDay++;

        if(hoursOfDay < 17){
            System.out.println("afternoon");
        }else if(hoursOfDay < 11){ // 11 is less than 17 this will never execute
            System.out.println("morning");
        } else {
            System.out.println("evening");
        }

        int x1 = 50, x2 = 75;
        boolean bu = x1 >= x2;
        if (bu = true)System.out.println("success");
        else System.out.println("failure");
    
    }
    }

