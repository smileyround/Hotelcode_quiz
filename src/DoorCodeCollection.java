public interface DoorCodeCollection {
  public void addCode(String hotelName, int roomNumber, int doorCode);
  public int getCode(String hotelName, int roomNumber);
}
