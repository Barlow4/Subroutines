/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subroutines;

import java.util.Scanner;

/**
 *
 * @author thbar7035
 */
public class Subroutines {
    
    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double choice;
        
        
        System.out.println("YA YEET, MY LAD, IT'S TIME TO DO SUB ROOTINES, PUT IN A NUMBER");
        System.out.println("");
        System.out.println("IF YOU WANT THE PERIMITER OF A SQUARE, PRESS 1");
        System.out.println("IF YOU WANT THE AREA OF A SQUARE, PRESS 2");
        System.out.println("IF YOU WANT THE VOLUME OF A CUBE, PRESS 3");
        System.out.println("IF YOU WANT THE AVERAGE OF 10 NUMBERS, PRESS 4");
        System.out.println("IF YOU WANT THE DIAMETER OF A CIRCLE, PRESS 5");
        System.out.println("AND IF YOU OR A LOved one has been diagnosed with Mesothelioma you may to be entitled to financial compensation. ");
        
        choice = keyedInput.nextDouble();
        
        if (choice ==1){
            perimiterSub();
        }
        else if (choice ==2){
            areaSub();
        }
        else if (choice ==3){
            volumeSub();
        }
        else if (choice ==4){
            averageSub();
        }
        else if (choice ==5){
            diameterSub();
        }
        else {
            System.out.println("That wasn't an option");
        }
    }
    
    public static void perimiterSub (){
        Scanner keyedInput = new Scanner(System.in);
        
        double length;
        double width;
        double perimiter;
        
        System.out.println("What's the length");
        length = keyedInput.nextDouble();
        System.out.println("What's the width");
        width = keyedInput.nextDouble();
        
        perimiter = length + length + width + width;
        System.out.println("The perimiter is "+perimiter);
    }
    
    public static void areaSub (){
        Scanner keyedInput = new Scanner(System.in);
        
        double length;
        double width;
        double area;
        
        System.out.println("What's the length");
        length = keyedInput.nextDouble();
        System.out.println("What's the width");
        width = keyedInput.nextDouble();
        
        area = length*width;
        System.out.println("The area is "+area);
    }
    
    public static void volumeSub (){
        Scanner keyedInput = new Scanner(System.in);
        
        double length;
        double width;
        double height;
        double area1;
        double area2;
        double area3;
        double volume;
        
        System.out.println("What's the length");
        length = keyedInput.nextDouble();
        System.out.println("What's the width");
        width = keyedInput.nextDouble();
        System.out.println("What's the height");
        height = keyedInput.nextDouble();
        
        
        area1 = length*width;
        area2 = length*height;
        area3 = width*height;
        volume = area1+area1+area2+area2+area3+area3;
        System.out.println("The volume is "+volume);
    }
    
    public static void averageSub (){
        Scanner keyedInput = new Scanner (System.in);
        
        //Declaring doubles and array
        double [ ] marks = new double [10];
        double total = 0;
        double average;
        
        //Output to user that indicates for them to interact with code
        System.out.println("Hows it going fella, you want your mark calculated? well I'm gonna need to know those marks then!");
        System.out.println("Put in 10 marks, we'll find the average");
        
        //loop that allows repetitive input from user
        for (int i = 0; i <= 9; i = i + 1)
        {
            marks[i] = keyedInput.nextDouble();
        }
        
        
        //loop that does the math to get the total of the numerals inputed
        for (int i = 0; i<=9; i= i + 1)
        {
            total = total + marks[i];
        }
        
        //math to calculate average of the numbers
        average = total/10;
        average = average * 100;
        average = Math.round(average);
        average = average/100;
        
        System.out.println("Your average was " + average + "%");
    }
    
    public static void diameterSub (){
        Scanner keyedInput = new Scanner(System.in);
        
        double radius;
        double diameter;
        
        
        System.out.println("What's the radius");
        radius = keyedInput.nextDouble();
        
        
        diameter = radius*2;
        System.out.println("The diameter is "+diameter);
    }
    
}
