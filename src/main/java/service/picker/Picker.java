package service.picker;

import java.util.List;


public interface Picker {
    List<Long> generateList(Long startNumber, Integer length);
    Long getValue(List<Long> listOfNumbers, int valuePositionToPick);
}
