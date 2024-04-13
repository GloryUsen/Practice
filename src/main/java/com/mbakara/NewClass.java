package com.mbakara;

public class NewClass {
    /**
     * Children are playing with this fun game app... they spell their name and the app cheers them. Given a string name.
     * Write a method that prints ont the console, "Let me cheer you", then on a new line the char of their name per line
     * e.g input = "John", output = "Let me cheer you\nJ\nO\nH\nN\n
     *
     * public static void cheerGameApp(String name){
     *     //your code goes here
     * }
     */
    public int  count = 0;

     public void gainGameApp(String name){

         count++;
        String user = "";
        System.out.println("My bf refused to help me this night");

        for(int i = 0; i < 0; i++){
            System.out.println(user.charAt(i));
        }
    }

    public String Greetings(String name){
         return name;
    }

    private int Average;

    public int getAverage(){
        return this.Average;
    }

    public void setAverage(int average) {
        this.Average = average;
    }



    /**
     *
     * If statement is used to specify a block of Java code if the condition is TRUE
     * else statement is used when a block of Java code is FALSE.
     * else if statement is used to specify a new condition, if the first condition is FALSE.
    *
     * DESCRIPTION:
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
     *
     *
     * public class Bio {
     *     public String dnaToRna(String dna) {
     *
     *       // Pseudocode
     *       // create an empty String
     *       // Loop through dna
     *       // check if letter 'T' is amongst
     *       // Replace every Letter 'T' with letter 'U'.
     *       // Return the result.
     *
     *       String result = "";
     *       for(int i = 0; i < dna.length(); i++){
     *         if(dna.charAt(i) == 'T'){
     *           result += 'U';
     *         }else {
     *           result += dna.charAt(i);
     *         }
     *
     *         }
     *       return result;
     *
     *       }
     * }
    *
    *
    *
    *
    *
    *
     */

    public static String well(String[] x) {
        // TODO
        int numberOfGood = 0;
        for(int i = 0; i < x.length; i++){
            if(x[i] == "good"){
                numberOfGood++;
            }

        }
        if(numberOfGood == 1 || numberOfGood == 2){
            return "Publish!";
        }

        if(numberOfGood > 2){
            return "I smell a series!";
        }
        else{
            return "Fail!";
        }
    }


}
