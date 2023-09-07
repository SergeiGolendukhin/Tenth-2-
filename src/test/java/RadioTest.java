import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test0() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test7() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext3() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev0() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev3() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrease0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrease1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrease2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(98);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrease3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncrease4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 98;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testReduce7() {
        Radio radio = new Radio();

        radio.setCurrentVolume(102);

        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }



}
