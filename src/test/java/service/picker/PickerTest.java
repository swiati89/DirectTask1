package service.picker;

import org.junit.Test;
import service.picker.impl.PickerImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PickerTest {

    private Picker picker = new PickerImpl();

    private static Long[] numberArray = {1L,1L,2L,3L,5L,8L,13L,21L,34L};
    private static List<Long> listOfNumbers = Arrays.asList(numberArray);

    @Test
    public void getValueTest(){
        long sumOf2NumbersBeforeDesired = picker.getValue(listOfNumbers,8);
        assertEquals(21, sumOf2NumbersBeforeDesired);
    }

    @Test
    public void getValueTest2(){
        long sumOf2NumbersBeforeDesired = picker.getValue(listOfNumbers,3);
        assertEquals(2, sumOf2NumbersBeforeDesired);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void indexOutOfBoundTestToLowIndex(){
        picker.getValue(listOfNumbers,0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void indexOutOfBoundTestNoExistingIndex(){
        picker.getValue(listOfNumbers,10);
    }

    @Test
    public void generateNumberListTest(){
        List<Long> numberList = picker.generateList(1L, 9);
        assertEquals(listOfNumbers, numberList);
    }
}
