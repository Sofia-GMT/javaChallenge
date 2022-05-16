class Main {
  public static void main(String[] args) {
    Integer[] numList = {2, 4, 6, 9};
    double solucion = average(numList);
    System.out.println(solucion);
  }
  public static double average(Integer[] numList) { 
    Integer suma=0;
    for(Integer i : numList){
      suma+=i;
    }
    double average = suma / numList.length;
    return average;
  }
}