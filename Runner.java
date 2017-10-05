public class Runner{

  public static void main (String[] args){
    
    SplashScreen splash = new SplashScreen();
    
    splash.splashScreenStart();
    splash.splashScreenEnd();
    
    Person Kayden = new Person();
    Kayden.name = "Kayden";
    Kayden.age = 17;
    Kayden.gender = "male";
    Kayden.occupation = "Student";
    
    System.out.println(Kayden.name);
    
    
  }
  
}