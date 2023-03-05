package ru.netology;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void lessThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lessTwoThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equalsThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}