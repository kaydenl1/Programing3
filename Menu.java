/*
this calss was made by Kayden on 11/9/2017
*/

public class Menu{

  public Menu(){
    
  }
  
  //menu selection
  public void selection(int option){
    
    switch(option){
      case 1: 
        System.out.println("Starting the game");
       break;
        
      case 2:
       System.out.println("Quiting the game");
       break;
        
      case 3:
        System.out.println("Go back to the game");
        break;
      default:
        System.out.println("Comand not understood enter a int in the specified range");
        break;
    }
    
  }
  
  public void drawMenu(){
    System.out.println("");
    System.out.println(" - This is the Menu - ");
    System.out.println("");
    System.out.println("");
    System.out.println("Press 1 to start the game");
    System.out.println("Press 2 to quit the game") ; 
    System.out.println("Press 3 to resume");
    System.out.println("Chose a option");
  }

}