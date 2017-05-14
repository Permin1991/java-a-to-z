package ru.job4j.controlQuestion;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TwoMassiveMergeTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 13.05.2017
 */
public class TwoMassiveMergeTest {
/**
*  Тест слияния двух массивов.
*/
@Test
    public void massiveMergeSortOne() {
     TwoMassiveMerge twoMassive = new TwoMassiveMerge();
		int[] masA = {1, 2, 3, 4, 5, 5, 7};
		int[] masB = {1, 8};
		int[] resultMas = TwoMassiveMerge.sortMerge(masA, masB);
		int[] expectMas = {1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(resultMas, is(expectMas));
    }
/**
*  Тест слияния двух массивов, если один массив нулевой.
*/
    public void massiveMergeSortTwo() {
     TwoMassiveMerge twoMassive = new TwoMassiveMerge();
		int[] masA = {1, 2, 3, 4, 5, 5, 7};
		int[] masB = {};
		int[] resultMas = TwoMassiveMerge.sortMerge(masA, masB);
		int[] expectMas = {1, 2, 3, 4, 5, 5, 7};
		assertThat(resultMas, is(expectMas));
    }
/**
*  Тест слияния двух равных массивов.
*/
    public void massiveMergeSortTrith() {
     TwoMassiveMerge twoMassive = new TwoMassiveMerge();
		int[] masA = {1, 3, 5};
		int[] masB = {2, 4, 5};
		int[] resultMas = TwoMassiveMerge.sortMerge(masA, masB);
		int[] expectMas = {1, 2, 3, 4, 5, 5};
		assertThat(resultMas, is(expectMas));
    }

}