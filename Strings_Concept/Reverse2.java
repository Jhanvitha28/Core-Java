package Strings_Concept;

import java.io.*;
        import java.lang.*;
        import java.util.*;

public class Reverse2 {

        public static boolean isRotation(String str1, String str2) {
            // Check if both strings are not null and have the same length
            if (str1 == null || str2 == null || str1.length() != str2.length()) {
                return false;
            }

            // Concatenate str1 with itself
            String concatenatedStr = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenatedStr.contains(str2);
        }

        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            boolean result = isRotation(str1, str2);

            System.out.println(result); // Output: true
        }
    }
