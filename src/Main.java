// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    DoorCodeCollection myDoorCodesSystem = new DoorCodeCollectionImpl();
    myDoorCodesSystem.addCode("Marriot", 1401, 123987);
    System.out.println(myDoorCodesSystem.getCode("Marriot", 1401));
  }
}