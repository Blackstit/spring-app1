package ru.petrushkin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = contex.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = contex.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = contex.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());


       // System.out.println(musicPlayer.getName());
       // System.out.println(musicPlayer.getVolume());

        contex.close();
    }
}
