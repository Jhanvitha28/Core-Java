package Strings_Concept;

import java.io.*;
        import java.lang.*;
        import java.util.*;

public class Reverse2 {

        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            if (isRotation(str1, str2)) {
                System.out.println("Output: true");
            } else {
                System.out.println("Output: false");
            }
        }

        private static boolean isRotation(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            // Concatenate str1 with itself
            String concatenated = str1 + str1;

            // Check if str2 is a substring of the concatenated string
            return concatenated.contains(str2);
        }
    }

