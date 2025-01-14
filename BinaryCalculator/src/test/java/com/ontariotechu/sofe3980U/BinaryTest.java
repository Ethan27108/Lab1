package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void OR1()
    {
		Binary binary1=new Binary("0010");
		Binary binary2=new Binary("1100");
		Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1110"));
    }
    @Test
    public void OR2()
    {
		Binary binary1=new Binary("0000");
		Binary binary2=new Binary("1100");
		Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1100"));
    }
    @Test
    public void OR3()
    {
		Binary binary1=new Binary("0111");
		Binary binary2=new Binary("1100");
		Binary binary3=Binary.OR(binary1,binary2);
        assertTrue( binary3.getValue().equals("1111"));
    }
    @Test
    public void AND1()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("1000"));
    }
    public void AND2()
    {
		Binary binary1=new Binary("1111");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("1111"));
    }
    public void AND3()
    {
		Binary binary1=new Binary("0000");
		Binary binary2=new Binary("1110");
		Binary binary3=Binary.AND(binary1,binary2);
        assertTrue( binary3.getValue().equals("0000"));
    }
    @Test
    public void Multiply1()
    {
		Binary binary1=new Binary("0101");
		Binary binary2=new Binary("0010");
		Binary binary3=Binary.Multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
    @Test
    public void Multiply2()
    {
		Binary binary1=new Binary("0010");
		Binary binary2=new Binary("0010");
		Binary binary3=Binary.Multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("100"));
    }
    @Test
    public void Multiply3()
    {
		Binary binary1=new Binary("0101");
		Binary binary2=new Binary("0110");
		Binary binary3=Binary.Multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("11110"));
    }
	
}