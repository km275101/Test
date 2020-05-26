package Java30Days;

import java.io.*;
import java.util.*;

// palindrome check using queue and stack
public class StackAndQueue {
	
	LinkedList q = new LinkedList();
	Stack<Character> st = new Stack<>();

	void enqueueCharacter(char c) {
		q.addLast(c);
	}

	void pushCharacter(char c) {
		st.push((c));
	}

	char dequeueCharacter() {
		return  (char) q.remove(0);
	}

	char popCharacter() {
		return st.pop();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		StackAndQueue p = new StackAndQueue();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}
