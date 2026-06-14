package com.library.school;

//import junit.framework.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    App app=new App();
    @Test
    void testadd() {
        assertEquals(8, app.add(3, 3));
    }
}
