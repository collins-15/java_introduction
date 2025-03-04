public class Hello
{
    // class variables
    static String randomString = "Hello World";
 public static void main(String[] args) {

    // You must declare variables before using them:
    int integerOne = 22;
    int integerTwo = 33;
    int sum = integerOne + integerTwo;
    System.out.println("Sum: " + sum);
    // Primitive types
    byte bigByte = 127;
    short bigShort = 32767;
    System.out.println("bigShort" + bigShort);
    int bigInt = 2100000000;
    long bigLong = 2100000000000000000L;
    float bigFloat = 3.14F;
    double bigDouble = 3.2657897373839336456733;
    System.out.println(Float.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    // Boolean
    boolean trueOrFalse = true;
    char randomChar = 65; //character codes
    System.out.println(randomChar);
    char anotherChar = 'A';
    System.out.println(anotherChar);
    char escapeChars = '\t';
    System.out.println(escapeChars);
    
    String newString = "I'm a new string";
    String anotheString = "plus me";
    String combString = newString + ' ' + anotheString;

    System.out.println(combString);

    // converting to strings
    String byteString = Byte.toString(bigByte);
    System.out.println("byteString " + byteString);
    String shortString = Short.toString(bigByte);
    System.out.println("shortString" + shortString);
    String intString = Integer.toString(bigInt);
    System.out.println("shortString" + shortString);
    String longString = Long.toString(bigLong);
    System.out.println("longString" + longString);
    String floatString = Float.toString(bigFloat);
    System.out.println("floatString" + floatString);
    String doubleString = Double.toString(bigDouble);
    System.out.println("doubleString" + doubleString);
    String booleanString = Boolean.toString(trueOrFalse);
    System.out.println("booleanString" + booleanString);
    // casting
    double aDoubleValue = 300000000.343322;
    int douubleToInt = (int) aDoubleValue;
    System.out.println("douubleToInt" + douubleToInt);

    int stringToInt = Integer.parseInt(intString);
    System.out.println("stringToInt" + stringToInt);
    
    
 }
}
