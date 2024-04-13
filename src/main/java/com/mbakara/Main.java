package com.mbakara;

import java.lang.reflect.Array;
import java.util.*;

import static com.mbakara.AddingArrays.addX;
//import static com.sun.tools.classfile.Module_attribute.ProvidesEntry.length;

public class Main {

    public static void main(String[] args) {

        //String ballGame = NewClass.well(new String[] { "good", "bad", "bad"});


        NewClass newClass = new NewClass();

//        newClass.
//        var nonStaticContent = new NewClass();
//
//        nonStaticContent.gainGameApp("Glory");
//
//        var instance2 = new NewClass();
//        instance2.gainGameApp("Joshua");
        //String  = "counter";
        //int numbers = 10;

        // understanding basic loop. algorithm step by step
        //Loops, conditional statement, 00p concept in general. basic concept of java.

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(1);
//        }
//
//        //for counter = 0; counter < 5; += 1;
//        for (int counter = 0; counter <= 10; counter++) {
//            System.out.println("counter");
//        }
//
//        for (int x = 1; x <= 11; x++) {
//            System.out.println("printing: " + x);
//        }
//
//        for (int x = 11; x >= 1; x--) {
//            System.out.println("printing: " + x);
//        }
//
//        int[] randomNumbers = {2, 5, 4, 7};
//        for (int i = 0; i < randomNumbers.length; i++) {
//            System.out.println(randomNumbers[i]);
//        }
//
//
//        int[] randomNumber = {2, 5, 4, 7};
//        for (int j = randomNumber.length-1; j > 0; j--) {
//            System.out.println(randomNumber[j]);
//        }

//        String Hey = "Hello World";
//
//        for (int i = 1; i <= 20; ++i) {
//            System.out.println(i);
//
//

        //cheerGameApp("ciinderella");

//        String data1 = repeatChat("Dinner");
//        System.out.println(data1);
//
//
//        String data = repeatChar("Dinner ");
//        System.out.println(data);
        //exceptFirstLast("sleepovers");
        //reverseChar("animal");
        //lastFiveReverse("booking");

//        String data2 = myVowels("peace");
//        System.out.println(data2);
//
//        String data3 = myConsonants("Grace");
//        System.out.println(data3);
//
//        System.out.println(myLetters("i am a lady"));
//
//        String data4 = myLowercase("I am Trying To STAmp my feet");
//        System.out.println(data4);
//
//        String data5 = reverseWord("reVersing thIs statEment");
//        System.out.println(data5);
//
//        String glo = vowelsLetters("nonchalant");
//        System.out.println(glo);
//
//        System.out.println(selectVowels("favorite"));
//        System.out.println(consonantLetters("concatenation"));
//
//        goingToTheMarket(false);
//
//        System.out.println(addTwoNumbers(4, 9));

        //System.out.println(subtractNumbers(34, 16));
//        int sub = subtractNumbers(34, 16);
//        System.out.println(sub);
//
//        int div = dividNumber(30, 3);
//        System.out.println(div);
//
//        int multi = mutipleNumbers(7, 5);
//        System.out.println(multi);
//
//        int opa = oprations(3, 2, 12, 3);
//        System.out.println(opa);
//
//
//        int operate = calculatingNumbers(6, 8, '+');
//        System.out.println(operate);
//
//        System.out.println(indexReturn("form"));
//
//        int condition = returnNumbers("Greater", "favours");
//        System.out.println(condition);
//
//        System.out.println(callStrings("grace", 'a'));

        dnaTorna();

//        String fruits = ("fruits");
//        System.out.println(fruits);                    //                            HELP


//
//        System.out.println(addX(8, new int[]{4, 6}, 8)); // HELP
//
//        int comp = hayStackcoding("prosperity", 'i');
//        System.out.println(comp);
//
//        printing();
//
//
//        String paint = methodReturn("goodness");
//        System.out.println(paint);
//
//        fizzBuzz(100);
//        var num1 = 6;
//        var num2 = 3;
//        System.out.println(num1 + " modulus " + num2 + " = " + num1 % num2);
//
//
//        String result = "Glory";
//        System.out.println(result);
//        System.out.println("result");




        //NewClass.gainGameApp("my bf refused to asist me this night");
    }


//
//        static void cheerGameApp (String name){
//
//            System.out.println("Let me cheer");
//
//            for(int i = 0; i < name.length(); i++){
//                System.out.println(name.charAt(i));
//
//            }
//    }
//
//        static void repeatChar(String word){
//        for(int i = 0; i < word.length(); i++){
//            System.out.println(word.charAt(i) + " " + word.charAt(i));
//
//        }
//
//        }
//
//        static void exceptFirstLast(String str){
//        for(int i = 1; i < str.length()-1; i++){
//            System.out.println(str.charAt(i));
//
//        }
//
//        }
//
//        static void reverseChar(String name){
//          for(int i = name.length()-1; i >= 0; i--){
//              System.out.println(name.charAt(i));
//          }
//        }
//
//        static void lastFiveReverse(String str){
//         for(int i = str.length()-1; i >= str.length() -5; i--){
//             System.out.println(str.charAt(i));
//         }
//        }


    static String repeatChar(String word) {

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            // result += word.charAt(i);
            result += word.charAt(i);
        }
        return result;

    }

    static String repeatChat(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);


        }
        return result;
    }

    /*
    Write a functiion myVowels that returns only the vowel letters of a giving parameter str. The vowels should be
     returned in the order of str.
     Example if str = "I am a boy" output = "Iaao"

     Let the input be name
     let the vowel letters be Vowels(written in both capital and small letters)
     loop through name
     if the element of name is vowel, add to result.
     Return result

    */

    static String myVowels(String name) {
        String result = "";
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < name.length(); i++) {
            if (vowels.contains(String.valueOf(name.charAt(i))))
                result += name.charAt(i);

        }

        return result;
    }


    /*
     Write a functiion myConsonant that returns only the consonant letters of a giving parameter str.
     The consonants should be returned in the order of str.
     Example if str = "I am a boy" output = "mby"

      Let the input be name
      let the consonant be consonant(writen in both capital and small letter)
      let through the name
      if the element of  name is consonant add to the result
      return the result
     */
    static String myConsonants(String name) {
        String solution = "";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

        for (int i = 0; i < name.length(); i++) {
            if (consonants.contains(String.valueOf(name.charAt(i)))) {
                solution += name.charAt(i);

            }

        }

        return solution;
    }

    /*
    Write a function that covert a given text to small letters.
     */

    static String myLetters(String name) {

        return name.toUpperCase();

    }


    /*
    Write a function that converts letters to lowecase.
     */

    static String myLowercase(String name) {
        return name.toLowerCase();
    }

    /*
    Given a string, return the reverse in lowercases
     */

    static String reverseWord(String name) {
        //String word = "A nonchalant";
        String sentence = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            sentence += name.charAt(i);


        }
        return sentence.toLowerCase();
    }

     /*
    Write a functiion myVowels that returns only the vowel letters of a giving parameter str. The vowels should be
     returned in the order of str.
     Example if str = "I am a boy" output = "Iaao"
    */

    static String vowelsLetters(String name) {
        String sound = "";
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < name.length(); i++) {
            if (vowels.contains(String.valueOf(name.charAt(i)))) {
                sound += name.charAt(i);
            }
        }


        return sound;
    }

    static String selectVowels(String word) {
        String sentence = "";
        String vowel = "AEIOUaeiou";

        for (int i = 0; i < word.length(); i++) {
            if (vowel.contains(String.valueOf(word.charAt(i)))) {

                sentence += word.charAt(i);
            }
        }
        return sentence;
    }

        /*
     Write a functiion myConsonant that returns only the consonant letters of a giving parameter str.
     The consonants should be returned in the order of str.
     Example if str = "I am a boy" output = "mby"
     */

    static String consonantLetters(String name) {
        String consonants = "";
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < name.length(); i++) {
            if (consonant.contains(String.valueOf(name.charAt(i)))) {
                consonants += name.charAt(i);
            }
        }
        return consonants;
    }

    /*
                PSUED-CODE
        if you do not have cash, get cash from POS,
        Take a bike from home.
        Alight in the market,
        Check for a tomatoe seller,
        Price tomatoes,
        Make payment for the quantity you want
        Boared bike home.

        For adding (2)Two numbers together,
        let the first number be A
        let the second number be B
        add A and B
        return the sum
     */

    static void goingToTheMarket(boolean isCash) {
        if (isCash == false) {
            System.out.println("get cash from POS");
        }
        System.out.println("Take a bike from home");
        System.out.println("Alight in the Market");
        System.out.println("Check for a tomato seller");
        System.out.println("Price tomatoes");
        System.out.println("Make payment for the quatity you want");
        System.out.println("Board bike home");
    }

    static int addTwoNumbers(int A, int B) {
        //int C = A + B;
        return A + B;
    }

    /*
    Write a method that will subtract
    let the first number be B
    let the second number be A
    Subtract B from A
    Return the sum.
     */

    static int subtractNumbers(int B, int A) {
        int C = B - A;
        return C;
    }

    /*
    Divission:
    let first number be A
    let second number be B
    Divide A by B
    return the result
     */


    static int dividNumber(int A, int B) {
        int C = A / B;
        return C;
    }

    /*
    Multiplication:
    let first number be A
    let second number be B
    multiply both A and B
    Then Return the result
     */


    static int mutipleNumbers(int A, int B) {
        int C = A * B;
        return C;

    }

    /*
     * Write a method that perform an operation on A, B, C, D.
     * the operation is --(A + B) * (C / D). Show the Pseudo code first
     *
     * let the input be int
     * let the parameters be represented by (A,B,C,D)
     * Add A and B
     * Divide C by D
     * Multiply the both results
     */

    static int oprations(int A, int B, int C, int D) {

        int a = A + B;
        int b = C / D;

        int c = a * b;

        return c;
    }

    /*
    Create a function call calculator that does the four basic arithmetic operations.
    it takes (2)two integers and a char: '+' for addition, '-' for substraction, '*' for multiplication, '/'  for
    division.
     */

    static int calculatingNumbers(int A, int B, char operator) {

        int result = 0;

        if (operator == '+') {
            result = A + B;
        } else if (operator == '-') {
            result = A - B;
        } else if (operator == '*') {
            result = A * B;
        } else if (operator == '/') {
            result = A / B;
        }

        return result;
    }

    /*
    Return the fourth index of a given String.
    if the String length is less than the fourth index
    return "-1". Prin.

     let the string be name
     if the length of name is less than 5, return "-1"
     if the length of name is 5 or more, return the fourth index of name i.e name[4]
     */

    static String indexReturn(String name) {
        if (name.length() < 5) {
            return "-1";
        } else {
            return String.valueOf(name.charAt(4));
        }

    }

    /*
    Given (2)two string param1 and param2, return the length of the longest.
    return -1 if they are both same.

    let the first string be param1
    let the second string be param2
    return the longest length or
    -1 if the both length are same.
     */

    static int returnNumbers(String param1, String param2) {


        if (param1.length() < param2.length()) {
            return param2.length();
        } else if (param2.length() < param1.length()) {
            return param1.length();

        }

        return -1;
    }

    /*
   Given a string called HayStack and a char needle, return the index position of needle in haystack
   Return -1 if needle is not in haystack. example input = haystack = "Hello World", needle = 'l'.

   loop to check where and element in haystack is equal to needle... from the example above, index 2 has 'l' which i
   needle, return 2.

   example 2, input = haystack = "Brain", and needle = 'p'... from the second example, needle is not found in haystack,
   therefore we'll return -1

     */


    static int callStrings(String hayStack, char needle) {
        for (int i = 0; i < hayStack.length(); i++) {
            if (hayStack.charAt(i) == needle) {
                return i;
            }
        }

        return -1;
    }

      /*
    Given (2)two string param1 and param2, return the length of the longest.
    return -1 if they are both same.

    let the first string be param1
    let the second string be param2
    return the longest length or
    -1 if the both length are same.
     */


      /*
   Given a string called HayStack and a char needle, return the index position of needle in haystack
   Return -1 if needle is not in haystack. example input = haystack = "Hello World", needle = 'l'.

   loop to check where an element in haystack is equal to needle... from the example above, index 2 has 'l' which i
   needle, return 2.

   example 2, input = haystack = "Brain", and needle = 'p'... from the second example, needle is not found in haystack,
   therefore we'll return -1

     */


    static int hayStackcoding(String haystack, char boy) {

        int i;
        for (i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == boy) {
                return i;
            }
        }

        return -1;
    }

    static void printing() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");

        }


    }


    static String methodReturn(String priting) {

        for (int i = 0; i < 10; i++) {

        }

        return priting;
    }

    /*
                MODULUS
        is the reminder of a division operation of a number e.g 7 % 2 = 1
      1. 8 % 4 = 0
      2. 100 % 3 = 1
      3. 6 % 4 =
      4. 11 % 2 =
      5. 100 % 51 =

      Fizzbuzz challenge
      Given a value of n as an integer, print out the value of n from 1-n (if n is 10, print: 1,2,3...10).
      If the value of n is divisible by 3, print "fizz", if n is divisble by 5, print "buzz", if n is divisble by both
      3 and 5, print "fizzbuzz". example: if n = 15, output = 1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,13,14,fizzbuzz.
*/
    static void fizzBuzz(int n) {
        //n = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }

        }

    }


    /*
    Calculate the grade score of a class, returing: A,B,C,D,E,and F. Where A ranges from 70 and above, B from 60-69
    C from 50-59, D from 45-49, E from 40-44, F from 0-39.
    Return N for students that where not available for the test. Their score is represented by -1.
    Example if score = 70, return A
    Score = -1, return N.

    Group of students
    Taking Exams
    Recording their scores
    calculating their grades
    Ranging from A-F
    100-70 repGrade A
    69-60  rep Grade B
    59-50  rep Grade C
    44-40  rep Grade D
    0-39   rep Grade F
    -1     rep Absentees
    Return N as the result.
    */

    static char scoreGrade(int score) {

        if (score >= 70) {
            return 'A';
        } else if (score >= 60) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else if (score >= 45) {
            return 'D';
        } else if (score >= 40) {
            return 'E';
        } else if (score == -1) {
            return 'N';
        } else {
            return 'F';
        }

    }

    // If statement
    static void ifStatement(String args) {
        // defining an 'age' varaible.
        int age = 20;
        // checking the age
        if (age > 18) {
            System.out.println("Age is greater than 18");
        }

      /*
       DESCRIPTION:

     * Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of
     * four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
               *
     * Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical
               * structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
               *
     * Create a function which translates a given DNA string into RNA.
               *
     * For example:
     *
     * "GCAT"  =>  "GCAU"
               * The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be
     * valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.

       */

    }
    public static void dnaTorna(){
        // Psueodcode
        /*
        Create an empty string
        loop through the string
        check if there is letter 'T'
        Replace every letter 'T' with letter 'C'
        return output.
         */

//        String output = "";
//        for(int i = 0; i < dna.length(); i++){
//            if(dna.length(i) == 0 )
//        }

        /**
         * Adding an element to Array.
         * The drivers code for printing.
         */

        int n = 10;
       // int i;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Initial array of size 10.
        System.out.println("Initial Array:\n" + Arrays.toString(arr));

        int x = 50; // elements to be add.
        arr = addX(n, arr, x); // calling the method to add x in arr.
        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));

                        /**
                         * SortingArrays
                         */

        String[] fruits = {"banana", "pawpaw", "orange", "lemon", "apple"};
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit + "");
        }

        int[] array = {4,6,8, 10, 5, 2, 7};
        Arrays.sort(array);
        for(int i : array){  /// this is for each loop(enhance loop)
            System.out.println(i + "");
        }

        /**
         * Arrays.fill
         */

        int[] filter = new int[5];
        Arrays.fill(filter, 1);
        for(int i : filter){ // this is for each loop
            System.out.println(filter + "");
        }


        /**
         * Useing enhance loop in diff data structure that implements Iterable Interface.
         */

        //Arrays: Iterating over Elements in array

        int[] numbers = new int[]{1, 3, 5, 7};
        for(int i : numbers){  // enhance loop
            System.out.println(numbers);
        }

        /**
         * Collections: iterating over elements in a collection such as ArrayList, linkedlist, etc.
         */

        List<String> names = new ArrayList<>();
        names.add("glory");
        names.add("sarah");
        names.add("grace");
        for(String name : names){
            System.out.println(name);
        }


        /**
         * Iterable: iterating over element in any data structure that implements the iterable interface
         */

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        for(int number : nums){

        }

                /**
                Converting Arrays to Strings using to.String
                 */
        int[] array1 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(array1));

        /**
         *    Copying Arrays with Arrays.copyOf();
         * This method allows you to create a new array that is copied of an existing array. Its usedul when manipulat
            ing array without affecting the original data.
         */

        int[] original = {1, 2, 3};
        int[] copied = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copied));


        /**  WHAT IS AN ARRAY?
         * An Array is a static data type that holds a fix number of values of a single type.
         * The length of an Array is established when the Array is created, after creation, its length is fixed.
         * How to declare, instantiate, and initialised an Array in Java.
         */
        int[] array2 = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(Arrays.toString(array));

        /**
         * How to create and use a list using ArrayList Class.
         *
         * Create a new ArrayList Object, add a String to it.
         * Print the first element of the list.
         */

        List<String> list = new ArrayList<>();
        list.add("Hello Glory");
        System.out.println(list.get(0));


        /**
         *        JAVA LIST
         * first import ArrayList class, then, created an arrayList obj named cars, that stores strings.
         * Then added four(4) cars
         *
         */

        ArrayList<String> cars = new ArrayList<String>(); // create an ArrayList object.

        cars.add("volvo"); // Adding items to the arraylist.
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");

        System.out.println(cars.get(1));// access item in the ArrayList.

        /**
                        SORTING LIST
         Soring a list of cars alphabetically using a for each-loop.
         */
        ArrayList<String> car = new ArrayList<String>(); // Creating an ArrayList Obj
        car.add("motor");   // adding items to the ArrayList
        car.add("vehicle");
        car.add("bicycle");
        car.add("bus");

        Collections.sort(cars); // Sorting arrayList.

        for(String car1 : cars)
            System.out.println(car);

        /**
         * Searching List
         * Using indexOf the list
         */
        int index = cars.indexOf("ford");
        System.out.println(index);


        /**
         *    MODIFING ELEMENTS.
         * Modifing using a the set() method.
          */

        car.set(0, "opel");
        System.out.println(cars.get(0)); // In this code, we are replacing the first element with 'opel'.

        /**
                   LIST IN JAVA
          A list in Java is an ordered collection(known as sequence) by maining it via it's insertion.
          List allows duplicate elements.
          Maintaining a collection of items in a specific sequence.
         */

        List<String> list1 = new ArrayList<String>();

        list.add("Apples");
        list.add("Oranges");
        list.add("Mangos");
        list.add("Pawpaw");
        System.out.println(list1);

        /**
         *     SET IN JAVA
         *  A set i Java is a collection of that cannot contain duplicate elements
         */

        Set<String> set = new HashSet<String>();

        set.add("Apples");
        set.add("Oranges");
        set.add("Mangos");
        set.add("Pawpaw");

        System.out.println(set);





    }

    }

















