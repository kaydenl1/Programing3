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
publuic void setname(String name){
  this.name = name;
}