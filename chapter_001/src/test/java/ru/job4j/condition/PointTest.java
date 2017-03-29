package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ConditionTest.
 *
 * @author Daniil Permin
 * @version 1.0
 * @since 28.03.2017
 */
public class PointTest {
/**
*  Метод проверки нахоэжения точки на функции
*/
	@Test
    public void searchCondition() {
      	Point pointXY = new Point();
		pointXY.point(3, 18);
		assertThat(pointXY.is(5, 3), is(true));
	}
}