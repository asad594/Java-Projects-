
package com.mycompany.student_grade_manager_tracker;
import java.util.ArrayList;
public class Student {
    private String name;
    private int rollno;
    ArrayList<Double> scores;
    
    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
        this.scores=new ArrayList<>();
    }
    
    public String getname()
    {
        return name;
    }
    public int getrollno()
    {
        return rollno;
    }
    public void addscore(double score)
    {
        scores.add(score);
        
    }
    //Average
    public double average()
    {
        if(scores.isEmpty())
        {
            return 0;
        }
        else
        {
            double sum=0;
            for (double s:scores)
            {
                sum+=s;
            }
             return sum/scores.size();
        } 
    }
    //Highest
    public double highest()
    {
        if(scores.isEmpty())
        {
            return 0;
        }
        else
        {
            double max=scores.get(0);
            for(double s:scores)
            {
                if(s>max)
                {
                    max=s;
                }
            }
            return max;
        }
    }
    //Lowest
    public double lowest()
    {
        if(scores.isEmpty())
        {
            return 0;
        }
        else
        {
            double min=scores.get(0);
            for(double s:scores)
            {
                if(s<min)
                {
                    min=s;
                }
            }
            return min;
        }
    }
    //Assign Grades
    public String grades()
    {
        double avg=average();
        if(avg>=85)
        {
            return "A+";
        }
        else if(avg>=80)
        {
            return "A";
        }
        else if(avg>=70)
        {
            return "B+";
        }
        else if(avg>=60)
        {
            return "B";
        }
        else if(avg>=50)
        {
            return "C";
        }
        else
        {
            return "F";
        }
    }
    public ArrayList<Double> getscores()
    {
        return scores;
    }
}
