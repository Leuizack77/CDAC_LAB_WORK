package com.stacklistGeneric;

public class TestBalancedParenthesis 
{

    public static boolean checkParenthesis(String str1)
    {
        MyStackListGeneric<Character> st = new MyStackListGeneric<>();

        for (int i = 0; i < str1.length(); i++) 
        {
            Character ch = str1.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') 
            {
                st.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') 
            {
                if (st.isEmpty()) 
                {
                    return false;
                }
                Character ch2 = st.pop();
                if (!isMatchingPair(ch2, ch)) 
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) 
    {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) 
    {
        String[] testCases = 
        	{
            "{{[](){[]}}}",
            "{{}[{]}}",
            "({[][]({{}})}"
        };

        for (String test : testCases) 
        {
            boolean status = checkParenthesis(test);
            System.out.println("Input: " + test);
            System.out.println(status ? "Balanced Parenthesis\n" : "Unbalanced Parenthesis\n");
        }
    }
}
