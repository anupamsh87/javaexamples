package com.programs;

public class TestThread {

	public static void main(String[] args) {
		ThreadExample threadA = new ThreadExample();
		threadA.start();

		ThreadRunnable x = new ThreadRunnable();
		Thread xy = new Thread(x);
		xy.start();

	}

}
