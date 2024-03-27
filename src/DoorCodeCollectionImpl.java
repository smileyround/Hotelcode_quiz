import java.util.HashMap;
import java.util.Map;

public class DoorCodeCollectionImpl implements DoorCodeCollection {

  private Map<String, Integer> doorCodes; // String is the Key, Interger is the value
  public DoorCodeCollectionImpl() {
    doorCodes = new HashMap<>();
  }
  @Override public void addCode(String hotelName, int roomNumber, int doorCode) {
    String key = hotelName + " " + roomNumber;
    doorCodes.put(key, doorCode);
  }

  @Override public int getCode(String hotelName, int roomNumber) {
    return doorCodes.get(hotelName + " " + roomNumber);
  }



}
