class Main {
  public static void main(String[] args) {
    int number = 6;
    checkOddEven(number);
  }
  public static void checkOddEven(int num) { 
    int result = num%2;
    switch (result){
      case 0: {
        System.out.println("Even number");
        break;
      }
      default: {
        System.out.println("Odd number");
      }
    }
  }
}