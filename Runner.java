//here we are inporting libraries for our use
import java.util.ArrayList;
import java.util.Scanner;

/*
  This is class Runner. This is where the whole game is run from.
  Date last modified: 11/9/2017
*/

public class Runner{

  public static void main (String[] args){    
   ArrayList<Armor1A> armorList = new ArrayList<>();

   armorList.add(new Armor1A());
    //list.add("1");
    // list.add("A2");

   System.out.println(armorList.get(0));

   SplashScreen splash = new SplashScreen();

   splash.splashScreenStart();
   splash.splashScreenEnd();
    
    //declare the menu object
    Menu menu = new Menu();

    //seting up scanner
   Scanner scanner = new Scanner(System.in);
    
    int option; //will hold user input for menu option
    
    //loop thorugh meny untill user enters 5 (for quiting)
    
    do{
      //draw menu
      menu.drawMenu();
      //get user input
     option =  scanner.nextInt();
      menu.selection(option);
    }while(option != 2);

   System.out.println("Enter your charachters name: ");
    
   Player player  = new Player();

   String name = scanner.next();
  player.setName(name);
   System.out.println("you have named your person: " + player.getName());
    
    System.out.println("Would you like to enter in additional information on your charachter");

   ArrayList<Person> list = new ArrayList<>();

    String aditionalInfo = scanner.next();

    if (aditionalInfo.contains("y") ){
      System.out.println("Enter your charachters age: ");
        int ageOfPerson = scanner.nextInt();
        player.setAge(ageOfPerson);
      System.out.println("Enter the gender of your charachter: ");
        String genderOfPerson = scanner.next();
        player.setGender(genderOfPerson);
      System.out.println("Enter the occupation of your charachter: ");
        String occupationOfPerson = scanner.next();
        player.setOccupation(occupationOfPerson);
      System.out.println("are you a gopnik?");
        String isPersonGopnik = scanner.next();
     if (isPersonGopnik.contains("true") || isPersonGopnik.contains("yes"))
        {
        player.setIsGopnik(true);
        }
     else
        {
        player.setIsGopnik(false);
        }

       System.out.println("Enter the number of charachters you want to go with you: ");

       int numberOfPeople = scanner.nextInt();

      for (int i = 0; i < numberOfPeople; i++){
        list.add(new Person());
       }

       System.out.println("Enter the name of the first conpanion: ");

      for (int i = 0; i < list.size(); i++){
        System.out.println("Enter the name of the person: ");
          String nameOfPerson = scanner.next();
          list.get(i).setName(nameOfPerson);
        System.out.println("Enter the age of the person: ");
          ageOfPerson = scanner.nextInt();
          list.get(i).setAge(ageOfPerson);
        System.out.println("Enter the gender of the person: ");
          genderOfPerson = scanner.next();
          list.get(i).setGender(genderOfPerson);
        System.out.println("Enter the occupation of the person: ");
          occupationOfPerson = scanner.next();
          list.get(i).setOccupation(occupationOfPerson);
        System.out.println("Is this person a gopnik: ");
          isPersonGopnik = scanner.next();
        
        if (isPersonGopnik.contains("true") || isPersonGopnik.contains("yes"))
        {
        list.get(i).setIsGopnik(true);
        }
        else
        {
        list.get(i).setIsGopnik(false);
        }
        System.out.println("Next Person: ");
  }
    }
    
      else{
      System.out.println("Enter the number of charachters you want to go with you: ");

      int numberOfPeople = scanner.nextInt();

      for (int i = 0; i < numberOfPeople; i++){
        list.add(new Person());
      }

      System.out.println("Enter the name of the first conpanion: ");

      for (int i = 0; i < list.size(); i++){
      System.out.println("Enter the name of the person: ");
          String nameOfPerson = scanner.next();
          list.get(i).setName(nameOfPerson);
      System.out.println("Enter the age of the person: ");
          int ageOfPerson = scanner.nextInt();
          list.get(i).setAge(ageOfPerson);
      System.out.println("Enter the gender of the person: ");
          String genderOfPerson = scanner.next();
          list.get(i).setGender(genderOfPerson);
      System.out.println("Enter the occupation of the person: ");
          String occupationOfPerson = scanner.next();
          list.get(i).setOccupation(occupationOfPerson);
      System.out.println("Is this person a gopnik: ");
          String isPersonGopnik = scanner.next();
        
       if (isPersonGopnik.contains("true") || isPersonGopnik.contains("yes"))
       {
       list.get(i).setIsGopnik(true);
       }
       else
       {
         list.get(i).setIsGopnik(false);
       }

        System.out.println("Next Person: ");
      }
   }

    //  Person Kayden = new Person("Kayden" , 17, "male" , "Student", false);

   //   System.out.println("Kayden is: " + Kayden);
















      //Does work:

      //Armor A1 = new Armor("1A" , 1 , "large" , 10);
      //Kayden.getName() = "Kayden";
      //Kayden.getAge() = 17;
      //Kayden.getGender() = "male";
      //Kayden.getOccupation() = "Student";

      //System.out.println("You found: " + A1);



     //Does not work: 

      /*

      Armor[] armor = new Armor[1];

      armor [0] = Armor1A;
      armor [1] = Armor1A;

      System.out.println(armor[0]);
      System.out.println(armor[1]);
      System.out.println(armor[2]);

      */

      // (B2.wear >= 1){

      //

    
  }
  
}