package com.test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StuTest {
    @Test
    void highestScore(){
        Stu stu = new Stu("Joe", 80, 90);
        Assertions.assertEquals(90,stu.higtest()); ;
    }
    @Test
    void getAverage(){
        Stu stu = new Stu("Joe", 80, 90);
        Assertions.assertEquals((80+90)/2,stu.getAverage());
    }
}
