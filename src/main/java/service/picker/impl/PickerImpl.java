package service.picker.impl;

import service.picker.Picker;

import java.util.ArrayList;
import java.util.List;

public class PickerImpl implements Picker {

    public Long getValue(List<Long> listOfNumbers, int valuePositionToPick) throws ArrayIndexOutOfBoundsException {

        int index = valuePositionToPick - 1;
        long pickedNumber = listOfNumbers.get(index);
        long oneBefore = listOfNumbers.get(index - 1);
        long twoBefore = listOfNumbers.get(index - 2);

        return oneBefore + twoBefore;
    }

    public List<Long> generateList(Long startNumber, Integer length) {
        List<Long> list = new ArrayList<Long>();
        for(int i = 0; i<length; i++){
            if(i == 0 || i == 1){
                list.add(startNumber);
            } else {
                long numberToPut = list.get(i-2) + list.get(i-1);
                list.add(numberToPut);
            }
        }
        return list;
    }
}
