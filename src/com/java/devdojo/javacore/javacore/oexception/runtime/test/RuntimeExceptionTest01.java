package com.java.devdojo.javacore.javacore.oexception.runtime.test;

// We always say "thrown" (lançado).
public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // CHECKED and UNCHECKED

        // Checked exceptions are those that derive directly from "Exception".
        // If they are not handled, it will throw an error at compile time.
        // IOException (input, output), SQLException, MalformedURLException

        // Unchecked exceptions are those that derive from RuntimeException
        // Uncheck exception doesn't need to be handled.
        // In almost 100% of the time, the programmer is to blame.
        // NullPointerException, NumberFormatException, ClassCastException, IndexOutOfBoundException.

        Object object = null;
        System.out.println(object.toString()); // NullPointerException, which is a runtime exception

        int[] nums = { 1, 2};
        System.out.println(nums[2]); // ArrayIndexOutOfBoundsException
    }
}
