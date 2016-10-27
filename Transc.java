import java.util.HashMap;

public class Transc{
  String course;
  int grade;
  float creditsEarned;


  public void Transcript(HashMap<String, Integer> transc9){

  }
  public void Transcript2(HashMap<String, Integer> transc10){

  }
  public void Transcript3(HashMap<String, Integer> transc11){

  }
  public void Transcript4(HashMap<String, Integer> transc12){

  }
  public static void main(String[] args) {
    HashMap<String, Integer> transc9 = new HashMap<String, Integer>();


    float creditsEarned = 0.0f;

    transc9.put("English 9", 100);
    transc9.put("Algebra 1", 100);
    transc9.put("Biology w/Lab", 100);
    transc9.put("American History", 100);
    transc9.put("Drawing", 100);
    transc9.put("Martial Arts 1", 100);
    transc9.put("MS Office", 100);

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


    HashMap<String, Integer> transc10 = new HashMap<String, Integer>();

    transc10.put("English 10", 100);
    transc10.put("Algebra 2", 100);
    transc10.put("Chemistry w/Lab", 100);
    transc10.put("World History", 100);
    transc10.put("Latin 1", 100);
    transc10.put("Martial Arts 2", 100);
    transc10.put("Piano", 100);

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

    HashMap<String, Integer> transc11 = new HashMap<String, Integer>();

    transc11.put("English 11", 100);
    transc11.put("Algebra 2", 100);
    transc11.put("Marine Biology w/Lab", 100);
    transc11.put("American Government", 100);
    transc11.put("Economics", 100);
    transc11.put("Latin 2", 100);
    transc11.put("Web Design", 100);

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
    HashMap<String, Integer> transc12 = new HashMap<String, Integer>();

    transc12.put("English 12", 100);
    transc12.put("Calculus", 100);
    transc12.put("Physics w/lab", 100);
    transc12.put("Photography", 100);
    transc12.put("Yearbook", 100);
    transc12.put("Drivers Ed.", 100);
    transc12.put("Studio Art", 100);
    transc12.put("Piano", 100);

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
