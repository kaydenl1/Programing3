public class Person{

private String name;
private int age;
private String gender;
private String occupation;
private boolean isGopnik;

public Person(){
this.age = 1;
this.isGopnik = false;
}
  

public Person(String name, int age, String gender, String occupation, boolean isGopnik){
this.name = name;
this.age = age;
this.gender = gender;
this.occupation = occupation;
this.isGopnik = isGopnik;
}

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

  
  public String toString(){
    
    
    if (isGopnik == true){
      return this.age + " " + this.gender + " and a " + this.occupation + "this person is a Gopnik";
    }
    else
    {
      return this.age + " " + this.gender + " and a " + this.occupation;
    }
    
  }
  

}
