/**
 * 
 */
package com.ss.jb.dayfour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Li
 *
 */
//Write a program with one thread (the producer) that produces items (in this case, simple ints). Another thread (the consumer) consumes items. 
//For communication purposes, both threads have access to a bounded buffer which is basically an array.
public class AssignmentsThreeDFour {
	/**
	 * @param args
	 */
	public static final Integer EOF = 99;
	
	public static void main(String[] args) {
        List<Integer> buffer = new ArrayList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.setName("producerThread");

        Thread consumerThread = new Thread(new Consumer(buffer));
        consumerThread.setName("consumerThread");

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private List<Integer> buffer;

    public Producer(List<Integer> buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        Integer numbers[] = {1, 2, 3};
        for (Integer number : numbers) {
            synchronized (buffer) {
                buffer.add(number);
                try {
                    Random random = new Random();
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " added " + number);
        }
        System.out.println(Thread.currentThread().getName() + " added " + AssignmentsThreeDFour.EOF);
        synchronized (buffer) {
            buffer.add(AssignmentsThreeDFour.EOF);
        }
    }
}

class Consumer implements Runnable {
    private List<Integer> buffer;

    public Consumer(List<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (buffer) {
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(AssignmentsThreeDFour.EOF)) {
                    System.out.println(Thread.currentThread().getName() + " exiting.");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " removed " + buffer.remove(0));
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(2000));
                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().getName() + " interrupted.");
                    }
                }
            }
        }
    }
}
