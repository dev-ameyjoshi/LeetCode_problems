package com.company;

import java.util.*;

public class paranthesis_Check {

    static boolean areBalancedBraceketsBalanced(String expr)
    {
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i = 0;i<expr.length();i++){
            char x = expr.charAt(i); //puts the character at the 0th index.
            if(x == '('|| x == '[' || x == '{'){
                stack.push(x);
                continue;
            }
            //The charAt() method returns the
            // character at the specified index in a string.
            //The index of the first character is 0, the second character is 1, and so on.

           if(stack.isEmpty())
               return false;
           char check;
           switch (x){
               case ')':
                   check = stack.pop();
                   if(check == '{' || check == '[')
                       return false;
                   break;

               case '}':
                   check = stack.pop();
                   if(check == '(' || check == '[')
                       return false;
                   break;
               case ']':
                   check = stack.pop();
                   if(check == '(' || check == '{')
                       return false;
                   break;
           }




        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
       String expr = "([{}]) ";

       if(areBalancedBraceketsBalanced(expr))
           System.out.println("Balanced");
       else
           System.out.println("Not Balanced");
    }
}
