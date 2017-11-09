/*
this is class story it creates the story
Date last modified: 11/9/2017
*/

public class Story{

  private String roomName;
  private String roomDiscription;
  private boolean isLocked;

  public Story(){
  boolean isLocked = false;
  }
  
  public Story(String roomName, String roomDiscription, boolean isLocked){
   this.roomName = roomName;
   this.roomDiscription = roomDiscription;
   this.isLocked = isLocked;
  }
  
public String getRoomName(){
  return this.roomName;
}
public void setRoomName(String roomName){
  this.roomName = roomName;
}
public String roomDiscription(){
  return this.roomDiscription;
}
public void setRoomDiscription(String roomDiscription){
  this.roomDiscription = roomDiscription;
}
  
  /*
public int GetSize(){
  return this.size;
}
public void setSize(int size){
  this.size = size;
}
public int getWeight(){
  return this.weight;
}
public void setWeight(int weight){
  this.weight = weight;
}
  public double getWear(){
  return this.wear;
}
public void setWear(double wear){
  this.wear = wear;
}
  public boolean getIsUsable(){
    return this.isUsable;
  }
public void setIsUsable(boolean isUseable){
  this.isUsable = isUsable;
}

*/

}