

package com.mycompany.student_grade_manager_tracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Grade_Manager_Tracker {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("===========Student Grade Tracker=================");
        System.out.println("Enter the number of students in a class : ");
        int num=input.nextInt();
        input.nextLine();
        
        Student[] students=new Student[num];
        
        for (int i = 0; i <num; i++) 
        {
            System.out.println("Enter the name of student "+(i+1)+" : ");
            String name=input.nextLine();
            System.out.println("Enter the roll number of student "+(i+1)+" : ");
            int rollno=input.nextInt();
            
            students[i]=new Student(name,rollno);
            System.out.println("Enter scores for "+name+" (Type any negative number to stop adding the score)");
            int subjectCount=1;
            while(true)
            {
                double score=input.nextDouble();
                if(score==-1)
                {
                    
                    break;
                }
                System.out.println("Subject " + subjectCount + ": " + score);
                students[i].addscore(score);
                subjectCount++;
                
            }
            input.nextLine();
        }
        System.out.println("");
        System.out.println("======Student Scores Report=======");
        for (Student s:students)
        {
            System.out.println("");
            System.out.println("Student Name : "+s.getname());
            System.out.println("Student Scores : "+s.getscores());
            System.out.println("Student Average Score : "+s.average());
            System.out.println("Student Highest Score : "+s.highest());
            System.out.println("Student Lowest Score : "+s.lowest());
            System.out.println("Student Grade On The Basis Of Average Score : "+s.grades());
            
        }
    }
}
