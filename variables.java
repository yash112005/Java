class cse{
  public static void main(String[] args) {
    // variables non primitive data type
    String name = "rahul";
    System.out.println(name.length());
  }
}

class CSE1{
  public static void main(String[] args) {
    // variables
    // primitive data type
    byte age = 30; //[-128,127] range
    int phone = 123456789;
    long phone2 = 1234567891011L;
    float pi = 3.1415F;
    char letter = '@';
    boolean isadult = false;

  }
}

class CSE2{
  public static void main(String[] args) {
    // variables non primitive data type
    // concatenate
    String name1 = "hello";
    String name2 = "how are you!";
    String name3 = name1 + name2;
    System.out.println(name3);

    // char at
    System.out.println(name1.charAt(0));

    //replace
    System.out.println(name1.replace('h','b'));

    // substring
    System.out.println(name1.substring(0,4));
  }
}
