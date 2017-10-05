public class Person{

private String name;
private int age;
private String gender;
private String occupation;

}

public Person(){
this.age = 1;
}
  

public Person(String name, int age, String gender, String occupation){
this.name = name;
this.age = age;
this.gender = gender;
this.occupation = occupation;
  
}

public String getName(){
  return this.name;
}
publuic void setName(String name){
  this.name = name;
}

public int getAge(){
  return this.age;
}
publuic void setAge(String age){
  this.age = age;
}
public String getGender(){
  return this.gender;
}
publuic void setGender(String gender){
  this.gender = gender;
}
public String getOccupation(){
  return this.Occupation;
}
publuic void setOccupation(String occupation){
  this.occupation = occupation;
}

