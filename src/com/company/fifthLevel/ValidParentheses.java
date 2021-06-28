package com.company.fifthLevel;
import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("()"));//true
        System.out.println(validParentheses("())"));//false
        System.out.println(validParentheses("32423(sgsdg)"));//true
        System.out.println(validParentheses("(dsgdsg))2432"));//false
        System.out.println(validParentheses("adasdasfa"));//true
        System.out.println();
        System.out.println();
        System.out.println(validParentheses2("()"));//true
        System.out.println(validParentheses2("())"));//false
        System.out.println(validParentheses2("32423(sgsdg)"));//true
        System.out.println(validParentheses2("(dsgdsg))2432"));//false
        System.out.println(validParentheses2("adasdasfa"));//true
    }

    /**
     * этот способ для сравнивания скобоок взят у Евгения Сулеянова с ютуба
     *
     */
    public static boolean validParentheses(String parens) {
        Map<Character, Character > brackets = new HashMap<>();
        brackets.put(')','(');
        brackets.put(']','[');
        brackets.put('}','{');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parens.length(); i++) {
            char c  = parens.charAt(i);

            if (!brackets.containsKey(c)) {
                stack.push(c);
            }else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top != brackets.get(c)) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
/**
 * Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.
 *
 * Examples
 * "()"              =>  true
 * ")(()))"          =>  false
 * "("               =>  false
 * "(())((()())())"  =>  true
 */

    }
    public static boolean validParentheses2(String parens) {
        Stack<Character> parentheses = new Stack<>();
        char[] letters = parens.toCharArray();
        for (int i = 0; i < letters.length; i++){
            if(letters[i] == '(')
                parentheses.push('(');
            else{
                if(letters[i] == ')'){
                    if(parentheses.empty())
                        return false;
                    else
                        parentheses.pop();
                }
            }
        }
        return parentheses.empty();
    }


}
