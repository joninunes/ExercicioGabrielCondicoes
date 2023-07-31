class Main {
  public static void main(String[] args) {

    int a = 2;
    int b = 3;
    int c = 5;
    int d = 9;
    int x = 0;

    if (!(d > 5)) {
      x = (a + b) * d;
    } else {
      x = (a - b) / c;
    }
    System.out.println("A: " + x);
    
    // B
    if ((a > 2) && (b < 7)) {
      x = (a + 2) * (b - 2);
    } else {
      x = (a + b) / d * (c + d);
    }
    System.out.println("B: " + x);

    // C
    if ((a == 2) || (b < 7)) {
      x = (a + 2) * (b - 2);
    } else {
      x = (a + b) / d * (c + d);
    }
    System.out.println("C: " + x);

    // D
    if ((a > 2) || (!(b < 7))) {
      x = a + b - 2;
    } else {
      x = a - b;
    }
    System.out.println("C: " + x);
  }

}