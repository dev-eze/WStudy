import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 *
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 *
 * Write a function:
 *
 * class Solution { public int solution(String S); }
 *
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 *
 * For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Lessons7_stacks_and_queues_brackets {

    public int solution(String S) {
        int result = 0;

        if (S.length()%2 != 0) {
            return 0;
        }

        Deque<Integer> deque = new LinkedList<>();

        return result;
    }

    public int solution1(String S) {

        if (S.isEmpty()) {
            return 1;
        }

        if (S.length()%2 != 0) {
            return 0;
        }

        Stack<Character> stack = new Stack<>();

            for (Character each : S.toCharArray()) {
                switch (each) {
                    case '(':
                        stack.push(each);
                    case '{':
                        stack.push(each);
                    case '[':
                        stack.push(each);
                    case ')':
                        if (stack.pop() == '(') {
                            break;
                        } else {
                            return 0;
                        }
                    case '}':
                        if (stack.pop() == '{') {
                            break;
                        } else {
                            return 0;
                        }
                    case ']':
                        if (stack.pop() == '[') {
                            break;
                        } else {
                            return 0;
                        }
                }
            }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int solution2(String S) {
        if (S.isEmpty()) {
            return 1;
        }

        if (S.length()%2 != 0) {
            return 0;
        }

        if (!S.isEmpty()) {
            Stack<Character> stack = new Stack<>();

            for (Character eachCharacter : S.toCharArray()) {
                switch (eachCharacter) {
                    case '(':
                        stack.push(eachCharacter);
                        break;
                    case '{':
                        stack.push(eachCharacter);
                        break;
                    case '[':
                        stack.push(eachCharacter);
                        break;
                    case ')':
                        if (stack.pop() == '(') {
                            break;
                        } else {
                            return 0;
                        }
                    case '}':
                        if (stack.pop() == '{') {
                            break;
                        } else {
                            return 0;
                        }
                    case ']':
                        if (stack.pop() == '[') {
                            break;
                        } else {
                            return 0;
                        }
                }
            }

            if (stack.isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }

        return 0;
    }



}
