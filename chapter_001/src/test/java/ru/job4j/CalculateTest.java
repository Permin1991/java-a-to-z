package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.
*
* @author  Daniil Permin (mailto:danya1991@list.ru)
* @version $Id$
* @since 14.03.17
*/
public class CalculateTest {
/**
* Test add.
*/
@Test
public void whenAddOneToOneThenTwo() {
ByteArrayOutputStream out = new ByteArrayOutputStream();
System.setOut(new PrintStream(out));
Calculate.main(null);
assertThat(
out.toString(),
is(
String.format(
"Hello World%s",
System.getProperty("line.separator")
)
)
);
}
}