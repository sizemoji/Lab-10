public class Cookie 
{
  private int cookieNumber;
  private int bakeTemp;
  private int bakeTime;
  private boolean cookiesAreBaked;

public Cookie()
{
cookieNumber = 0;
bakeTemp = 0;
bakeTime = 0;
cookiesAreBaked = false;

}

public Cookie(int number, int temp, int time, boolean baked) // First constructor
{
  cookieNumber = number;
  bakeTemp = temp;
  bakeTime = time;
  cookiesAreBaked = baked; // Second constructor
}
boolean isReady(){
  return true;
} // accessor method

public int getcookieNumber(){
  return 20; // mutator method
}
void baked (int bakeTemp, int bakeTime){
  System.out.println(number + "Cookies are baked at " + bakeTemp + " degrees F for " + bakeTime + "minutes");
  cookiesAreBaked = true;
}

}