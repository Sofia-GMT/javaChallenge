class Main {
  public static void main(String[] args) {
    Integer [] numList = {5,2,15,9};
    Integer maximum = maximum(numList);
    System.out.println(maximum);
    } 
  
  public static int maximum(Integer[] numList) {
    Integer max = 0;
    for(Integer i = 0; i < numList.length; i++){
      Integer actualNumber = numList[i];
      if(actualNumber > max){
      max=actualNumber;
      }
    }
    return max;
  }
}