class Main {
  public static void main(String[] args) {
    int number = 5;
    String solution = printNumberInWord(number);
    System.out.println(solution);
  }
  public static String printNumberInWord(int num) {
    if (num == 1){
      return "ONE";
      } else if (num == 2){
      return "TWO";
      } else if (num == 3) {
      return "THREE";
      } else if (num == 4){
      return "FOUR";
      } else if (num == 5){
      return "FIVE";
      } else if (num == 6){
      return "SIX";
      } else if (num == 7){
      return "SEVEN";
      } else if (num == 8){
      return "EIGHT";
      } else if (num == 9){
      return "NINE";
      } else {
      return "OTHER";
    }
  }
}