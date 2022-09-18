package com.gl.java.foundation;
public class JavaMain {

	    private int data = 5;

	    public int getValue()

	    {

	        return this.data;

	    }

	    public int getValue(int value)

	    {

	        return (data+1);

	    }

	    public int getValue(int... value)

	    {

	        return  (data+2);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMain temp = new JavaMain();

	        System.out.println(temp.getValue(7, 8, 12));
		System.out.println("Hello World");
	}

}
