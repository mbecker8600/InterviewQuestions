package com.becker;

import com.becker.strings.StringQuestions;

public class Main {

    public static void main(String[] args) {
        StringQuestions sq = new StringQuestions();

        //String interview questions
        printQuestionHeader("Rotate array");
        int[] array = {1,2, 3, 4, 5, 6, 7};
        sq.rotateArray(array, 3);
        printQuestionFooter();

    }

    private static void printQuestionHeader(String header){
        System.out.println();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println(header);
        System.out.println();
    }

    private static void printQuestionFooter(){
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
    }
}
