package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void lessThanThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void lessThanTwoThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1100);

        Assert.assertEquals(actual, expected);
    }

    @Test
    void equalsThousand() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}