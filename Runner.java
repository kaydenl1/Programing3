public class Runner{

  public static void main (String[] args){
    
    SplashScreen splash = new SplashScreen();
    
    splash.splashScreenStart();
    splash.splashScreenEnd();
    
    Person Kayden = new Person("Kayden" , 17, "male" , "Student", false);
    //Kayden.getName() = "Kayden";
    //Kayden.getAge() = 17;
    //Kayden.getGender() = "male";
    //Kayden.getOccupation() = "Student";
    
    System.out.println("Kayden is: " + Kayden);
    
    
  }
  
}