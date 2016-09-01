package progKievUa.javaOOP.classWork.lesson12.multithreading.multithreading._1_creation;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class PlayerSample {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        threadList.add(new Thread(new PlayerTask(new MusicPlayer())));
        threadList.add(new Thread(new PlayerTask(new VideoPlayer())));

        System.out.println("Hello");

        for (Thread thread : threadList) {
            thread.start();
        }

        System.out.println("Main is finished");
    }
}

interface Player {
    void play();
}

class MusicPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Music...");
    }
}

class VideoPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Video...");
    }
}

class PlayerTask implements Runnable {
    public static final int PLAYING_QUANTITY = 10;

    private Player player;

    public PlayerTask(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        for (int i = 0; i < PLAYING_QUANTITY; i++) {
            player.play();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}