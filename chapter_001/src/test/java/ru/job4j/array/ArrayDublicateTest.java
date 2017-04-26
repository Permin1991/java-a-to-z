package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * RotateArrayTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 09.04.2017
 */
public class ArrayDublicateTest {
/**
*  Тест удаления дубликатов в массиве.
*/
@Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
     ArrayDublicate massiveString = new ArrayDublicate();
		String[] mas = {"Privet", "Mir", "Privet", "Super", "Mir"};
		String[] resultArray = massiveString.remove(mas);
		String[] expectArray = {"Privet", "Mir", "Super"};
		assertThat(resultArray, is(expectArray));
    }
}