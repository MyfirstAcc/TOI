/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

import java.io.UnsupportedEncodingException;
import javaapplication1.NewJFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author North_PC
 */
public class NewEmptyJUnitTest {

    static NewJFrame frame;

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        frame = new NewJFrame();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIsDate_succes() throws Exception {
        Assert.assertTrue(frame.isDate("12032020", "ddMMyyyy"));
    }

    @Test
    public void testIsDeleted_fail() throws UnsupportedEncodingException {
        frame.buf = new char[128];
        frame.writeBuffer("'[Удале]'", 0);
        String s = new String(frame.buf);
        frame.buff = s.getBytes();
        Assert.assertTrue(frame.isDeleted());
    }

    @Test
    public void test_Search_succes() {
      
    }
}
