package com.adhoc.progpractice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.shutdown();
    }
}
