import java.util.HashMap;

//We're currently not using our Transc class at all.  Try to move some of your code into the class into functions
public class Transc{
  //Maybe add variables for student and school information to print on the transcript?
  //Or take it further and create Student and School classes like with Course
  
  String course;
  int grade;
  float creditsEarned;
  //I would change these to be variables not functions (void)
  HashMap<String, Integer> transc9 = new HashMap<String, Integer>();
  HashMap<String, Integer> transc10 = new HashMap<String, Integer>();
  HashMap<String, Integer> transc11 = new HashMap<String, Integer>();
  HashMap<String, Integer> transc12 = new HashMap<String, Integer>();

  //Create Constructor that lets you access the 4 grade levels
  public Transc(HashMap<String, Integer> transc9,
                HashMap<String, Integer> transc10,
                HashMap<String, Integer> transc11,
                HashMap<String, Integer> transc12)
  {
    this.transc9 = transc9;
    this.transc10 = transc10;
    this.transc11 = transc11;
    this.transc12 = transc12;
  }
  
  //Add Print function here...
  
  public static void main(String[] args) {
    
    //Try to declare as many variables at the top as you can for organization
    HashMap<String, Integer> transc9 = new HashMap<String, Integer>();
    HashMap<String, Integer> transc10 = new HashMap<String, Integer>();
    HashMap<String, Integer> transc11 = new HashMap<String, Integer>();
    HashMap<String, Integer> transc12 = new HashMap<String, Integer>();

    float creditsEarned = 0.0f;

    transc9.put("English 9", 100);
    transc9.put("Algebra 1", 100);
    transc9.put("Biology w/Lab", 100);
    transc9.put("American History", 100);
    transc9.put("Drawing", 100);
    transc9.put("Martial Arts 1", 100);
    transc9.put("MS Office", 100);
  
    transc10.put("English 10", 100);
    transc10.put("Algebra 2", 100);
    transc10.put("Chemistry w/Lab", 100);
    transc10.put("World History", 100);
    transc10.put("Latin 1", 100);
    transc10.put("Martial Arts 2", 100);
    transc10.put("Piano", 100);
    
    transc11.put("English 11", 100);
    transc11.put("Algebra 2", 100);
    transc11.put("Marine Biology w/Lab", 100);
    transc11.put("American Government", 100);
    transc11.put("Economics", 100);
    transc11.put("Latin 2", 100);
    transc11.put("Web Design", 100);

    transc12.put("English 12", 100);
    transc12.put("Calculus", 100);
    transc12.put("Physics w/lab", 100);
    transc12.put("Photography", 100);
    transc12.put("Yearbook", 100);
    transc12.put("Drivers Ed.", 100);
    transc12.put("Studio Art", 100);
    transc12.put("Piano", 100);
    
    //Create you Transcript object here. This will need to be update if you make Student/School Classes
    Transc transcript = new Transc(transc9, transc10, transc11, transc12);
    
    //Everything below here could be in a function in the Transc class, like Transc.printGrades(transc9);
    //Whenever you repeat code a lot, try to "refactor" (condense) into functions. We could do all the below in 4 lines
    //if we make a function
    //Transc.printGrades(transc9);
    //Transc.printGrades(transc10);
    //Transc.printGrades(transc11);
    //Transc.printGrades(transc12);
    

    System.out.println("----------Grade 9----------");
    System.out.println("  Course   | Grade");
  

      for(String course : transc9.keySet()) {
        System.out.print("\n"+ course + " = " + transc9.get(course));

        if(transc9.get(course) > 64){
          creditsEarned = creditsEarned + 1.0f;
          if(course == "Martial Arts 1"){
            creditsEarned = creditsEarned -0.5f;
          }
          else if (course == "MS Office") {
            creditsEarned = creditsEarned -0.5f;
          }
            System.out.print(" Total Credits Earned = " + creditsEarned);
          }
        }


   

    System.out.println("\n----------Grade 10----------");
    System.out.println("  Course  | Grade");

    for(String course : transc10.keySet()) {
      System.out.print("\n"+ course + " = " + transc10.get(course));

      if(transc10.get(course) > 64){
        creditsEarned = creditsEarned + 1.0f;
        if(course == "Martial Arts 2"){
          creditsEarned = creditsEarned -0.5f;
        }
        else if (course == "Piano"){
          creditsEarned = creditsEarned -0.5f;
        }
          System.out.print(" Total Credits Earned = " + creditsEarned);
        }
      }

    
    System.out.println("\n----------Grade 11----------");
    System.out.println("  Course  | Grade");

    for(String course : transc11.keySet()) {
      System.out.print("\n"+ course + " = " + transc11.get(course));

      if(transc11.get(course) > 64){
        creditsEarned = creditsEarned + 1.0f;
        if(course == "American Government"){
          creditsEarned = creditsEarned -0.5f;
        }
        else if (course == "Economics"){
          creditsEarned = creditsEarned -0.5f;
        }
          System.out.print(" Total Credits Earned = " + creditsEarned);
        }
      }
    
    System.out.println("\n----------Grade 12----------");
    System.out.println("  Course  | Grade");

    for(String course : transc11.keySet()) {
      System.out.print("\n"+ course + " = " + transc11.get(course));

      if(transc11.get(course) > 64){
        creditsEarned = creditsEarned + 1.0f;
        if(course == "Photography"){
          creditsEarned = creditsEarned -0.5f;
        }
        else if (course == "Piano"){
          creditsEarned = creditsEarned -0.5f;
        }
        else if (course == "Yearbook"){
          creditsEarned = creditsEarned -0.5f;
        }
        else if (course == "Drivers Ed."){
          creditsEarned = creditsEarned -0.5f;
        }
          System.out.print(" Total Credits Earned = " + creditsEarned);
        }
      }
      boolean diploma = true;
      if(creditsEarned >= 24){
        diploma = true;
      }
      else if(creditsEarned < 24){
        diploma = false;
      }
      if(diploma = true){
        System.out.print("\nDiploma Earned: Yes");
      }
      else if(diploma = false){
        System.out.print("\nDiploma Earned: No");
      }
      System.out.print(" GPA: 4.0");
    }
  }
class Course {
  String name;
  float credits;
  
  public Course(String name, float credits)
  {
    this.name = name;
    this.credits = credits;
  }
}
