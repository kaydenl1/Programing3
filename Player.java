/*
  This is class Player. This is where all the peps are made.
  Date last modified: 11/9/2017
*/
public class Player{

  //these are the variables to set as a player
  private String name;
  private int age;
  private String gender;
  private String occupation;
  private boolean isGopnik;

  //this sets default values for all people
  public Player(){
    this.age = 1;
    this.isGopnik = false;
  }

  //this is where we declare that this.name refers to the private variable name
  public Player (String name, int age, String gender, String occupation, boolean isGopnik){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.occupation = occupation;
    this.isGopnik = isGopnik;
  }
  
  //these are getters and setters for the variables
  public String getName(){
    return this.name;
  }
  
  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  
  public String getGender(){
    return this.gender;
  }
  
  public void setGender(String gender){
    this.gender = gender;
  }
  
  public String getOccupation(){
    return this.occupation;
  }
  
  public void setOccupation(String occupation){
    this.occupation = occupation;
  }
  
  public boolean getIsGopnik(){
    return this.isGopnik;
  }
  
  public void setIsGopnik(boolean isGopnik){
    this.isGopnik = isGopnik;
  }

  //this is the function used to print out the variables
  public String toString(){
    if (isGopnik == true){
      return this.age + " " + this.gender + " and a " + this.occupation + "this person is a Gopnik";
    }
    else{
      return this.age + " " + this.gender + " and a " + this.occupation;
    }
  }
  
}
