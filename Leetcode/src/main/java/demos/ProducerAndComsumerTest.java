package demos;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jackpaul <jiekepao@gmail.com>
 * Created on 2019-03-31 14:30
 * @Description:
 */
public class ProducerAndComsumerTest {
    static class producerAndConsumer {

        LinkedBlockingQueue<Integer> buffer = new LinkedBlockingQueue<>(1000);
        Lock lock = new ReentrantLock();
        Condition producerCon = lock.newCondition();
        Condition consumerCon = lock.newCondition();
        public void producer() {
            lock.lock();
            if (buffer.size() == 1000) {
                System.out.println("full");
                try {
                    producerCon.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("producing");
            buffer.offer(0);
            consumerCon.signal();
            lock.unlock();
        }

        public void consumer() {
            lock.lock();
            if (buffer.isEmpty()) {
                System.out.println("empty");
                try {
                    consumerCon.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("comsuming");
            buffer.poll();
            producerCon.signal();
            lock.unlock();
        }
    }

    public static void main(String[] args) throws Exception {
        producerAndConsumer pac = new producerAndConsumer();
        new Thread(() -> {
            for (int i = 0; i < 300; i++)
                pac.producer();
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 300; i++)
                pac.consumer();
        }).start();
    }

}
