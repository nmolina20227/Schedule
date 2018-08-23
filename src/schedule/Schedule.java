/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 20227
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String firstName = "Nicholas";
        String lastName = "Molina";
        int year = 2020;
        
        
        
        System.out.println("Hello there, I am " + firstName + " " + lastName +" and I graduate with the Class of " + year + ".");
         System.out.println("");
        System.out.println("Down below is my course schedule.");
        System.out.println("");
        
        String periodOne = "Marketing and Business Principles";
        String teacherOne = "Kevin Corazon";
        
        String periodTwo = "Honors English";
        String teacherTwo = "Cody Morrissey";
        
        String periodThree = "AP Computer Science: A";
        String teacherThree = "Matthew Larrubia";
        
        String periodFour = "Honors American History";
        String teacherFour = "Javier Hermida";
        
        String periodFive = "Honors Global Studies";
        String teacherFive = "James Dugard";
        
        String periodSix = "Honors Algebra II and Triginometry";
        String teacherSix = "Lissette Leonard";
        
        String periodSeven = "Honors Physics";  
        String teacherSeven = "Armando Rodriguez";
        
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("   | Period 1 |       " + periodOne + " |               " + teacherOne + " |");
        System.out.println("   | Period 2 |                          " + periodTwo + " |              " + teacherTwo + " |");
        System.out.println("   | Period 3 |                  " + periodThree + " |            " + teacherThree + " |");
        System.out.println("   | Period 4 |                 " + periodFour + " |              " + teacherFour + " |");
        System.out.println("   | Period 5 |                   " + periodFive + " |                " + teacherFive + " |");
        System.out.println("   | Period 6 |      " + periodSix + " |            " + teacherSix + " |");
        System.out.println("   | Period 7 |                          " + periodSeven + " |           " + teacherSeven + " |");
        System.out.println("+----------------------------------------------------------------------------------------+");
    }   
    
}
