package org.example.numberTest;

import org.example.Numbr;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NumTT {
    public void sumTest() {
        Numbr numb = new Numbr();
        int actual = numb.Sum(5);
        int expected = 16;
        Assert.assertEquals(expected, actual);
    }
}
