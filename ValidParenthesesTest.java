package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void testMixedBracket() {
        ValidParentheses test = new ValidParentheses();
        String s = "[][[]]{{})";
        assertEquals(false, test.isValid(s));
    }

    @Test
    public void testEmptyString() {
        ValidParentheses test = new ValidParentheses();
        String s = "";
        assertEquals(false, test.isValid(s));
    }

    @Test
    public void trueCase() {
        ValidParentheses test = new ValidParentheses();
        String s = "[{()}]";
        assertEquals(true, test.isValid(s));
    }

}