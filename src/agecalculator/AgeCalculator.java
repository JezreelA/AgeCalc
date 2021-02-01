
package agecalculator;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import java.util.Date;

public class AgeCalculator {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Date date = new Date();
        
        System.out.println(date);
        
        System.out.println("Type the year you were born('yyyy')");
        int DOBYear = input.nextInt();
        System.out.println("Type the month you were born('mm')");
        int DOBMonth = input.nextInt();
        System.out.println("Type the day you were born('dd')");
        int DOBDay = input.nextInt();
        
        //life expectancy = 81 years
        
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy");
        
        
        int ageYears = Integer.parseInt(ft.format(date))-DOBYear;
        
        SimpleDateFormat ft2 = new SimpleDateFormat ("MM");
        
        
        int ageMonths = Integer.parseInt(ft2.format(date))-DOBMonth;
        
        SimpleDateFormat ft3 = new SimpleDateFormat ("dd");
        
        
        int ageDays = Integer.parseInt(ft3.format(date))-DOBDay;
        
        SimpleDateFormat ft4 = new SimpleDateFormat ("HH:mm:ss");
        
                
        if (ageMonths<0){
            ageYears=ageYears-1;
            ageMonths=12+ageMonths;
        }
        
        if (ageDays<0){
            ageMonths=ageMonths-1;
            switch(DOBMonth){
                case 2:
                    ageDays=ageDays+28;
                    break;
                case 1:
                    ageDays=ageDays+31;
                    break;
                case 3:
                    ageDays=ageDays+31;
                    break;
                case 5:
                    ageDays=ageDays+31;
                    break;
                case 7:
                    ageDays=ageDays+31;
                    break;
                case 8:
                    ageDays=ageDays+31;
                    break;
                case 10:
                    ageDays=ageDays+31;
                    break;
                case 12:
                    ageDays=ageDays+31;
                    break;
                case 4:
                    ageDays=ageDays+30;
                    break;
                case 6:
                    ageDays=ageDays+30;
                    break;
                case 9:
                    ageDays=ageDays+30;
                    break;
                case 11:
                    ageDays=ageDays+30;
                    break;
                    
            }
                
            
        }
        
        
        
        System.out.println("you are "+ageYears+" years, ");
        System.out.println("you are "+ageMonths+" months, ");
        System.out.println("you are "+ageDays+" days, ");
        System.out.println("and "+(ft4.format(date)+" hours, minutes and seconds"));

        
        System.out.println("you have "+(81-ageYears)+" years left");
        int lifeLeft = 81-ageYears;
        
        System.out.println("do you smoke? - Y or N");
        char smoker = input.next().charAt(0);
        
        if (smoker == 'Y'){
            lifeLeft = lifeLeft-10;
        }else if (smoker == 'N'){
            
        }else{
            System.out.println("bad input");
        }
        System.out.println("are you biologically male(M) or female(F)");
        char gender = input.next().charAt(0);
        
        if (gender == 'M'){
            lifeLeft = lifeLeft-2;
        }else if (gender == 'F'){
            lifeLeft = lifeLeft+2;
        }else{
            System.out.println("bad input");
        }
        
        
        
        System.out.println(lifeLeft+" years left to live");
        
    }
    
}
