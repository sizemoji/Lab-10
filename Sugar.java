class Sugar extends Cookie {

  String shape;
  boolean isDecorated;

Sugar(){
  shape = "";
  isDecorated = false;
}
Sugar(String aShape) {
shape = aShape;
isDecorated = false;
}
String getShape() {
return shape;
}
void setShape(String aShape) {
  shape = aShape;
}
void shapeCutOut(String aShape, int number){
  System.out.println( + number + "cookies were cut into " + aShape);
  super.setnumber(number);
}
void decorate(){
  if (super.baked == true) {
  isDecorated = true;
  System.out.println("The cookies were decorated!");
}
else{
  System.out.println("Make sure to bake the cookies first!");
}
}
}