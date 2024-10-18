package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBacketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void properBracketsWithString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void properBracketsWithSplitString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void properBracketsBeforeString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void properBracketsHasString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    @Test
    public void properBracketsHasNestedString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void properBracketsGalore() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }

    //Testing Unbalanced Brackets
    @Test
    public void improperBracketsOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void improperOnlyOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void improperBracketsAndString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void improperSingleBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void improperExtraBracketWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));
    }

    @Test
    public void improperExtraFlippedBracketWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode[]"));
    }

    @Test
    public void improperBracketsGalore() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]"));
    }
}