package LeetCode.DailyStreak;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    public StackUsingQueues() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int x) {
        // Move elements from the mainQueue to tempQueue
        while (!mainQueue.isEmpty()) {
            tempQueue.offer(mainQueue.poll());
        }

        // Add the new element to the mainQueue
        mainQueue.offer(x);

        // Move elements back from tempQueue to mainQueue
        while (!tempQueue.isEmpty()) {
            mainQueue.offer(tempQueue.poll());
        }
    }

    public int pop() {
        if (!mainQueue.isEmpty()) {
            return mainQueue.poll();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int top() {
        if (!mainQueue.isEmpty()) {
            return mainQueue.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public boolean empty() {
        return mainQueue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues myStack = new StackUsingQueues();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // Output: 2
        System.out.println(myStack.pop()); // Output: 2
        System.out.println(myStack.empty()); // Output: false
    }
}




