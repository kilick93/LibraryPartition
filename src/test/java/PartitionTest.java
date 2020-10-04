import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartitionTest {

    /**
     * If params "taille" is equals to zero, partition should throw an Exception
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void zeroSizeShouldThrowException() throws Exception {
        MyLibrary.partition(new ArrayList<>(Arrays.asList(0, 1)), 0);
    }

    /**
     * If params "taille" is less than zero, partition should throw an Exception
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void zegativeSizeShouldThrowException() throws Exception {
        MyLibrary.partition(new ArrayList<>(Arrays.asList(0, 1)), -1);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void expectedResultWhenTailleLessThanListSize() throws Exception {
        List<List<Integer>> expectedResult= new ArrayList<>();
        expectedResult.add(Arrays.asList(1, 2));
        expectedResult.add(Arrays.asList(3, 4));
        expectedResult.add(Collections.singletonList(5));

        List<Integer> liste = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            liste.add(i);
        }
        assertEquals(expectedResult, MyLibrary.partition(liste, 2));
    }

    @Test
    public void expectedResultWhenTailleGreaterOrEqualsToListSize() throws Exception {
        List<List<Integer>> expectedResult= new ArrayList<>();
        expectedResult.add(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> liste = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            liste.add(i);
        }
        assertEquals(expectedResult, MyLibrary.partition(liste, 10));
    }

    @Test(expected = Exception.class)
    public void nullListShouldThrowException() throws Exception {
        MyLibrary.partition(null, 2);
    }
}
