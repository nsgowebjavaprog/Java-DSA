import java.util.*;

public class Song_Animation_Time_Match {
    public static int[] maxRepeatsPerAnimation(String[] songs, String[] animations) {
        int[] result = new int[animations.length];

        for (int i = 0; i < animations.length; i++) {
            int animTime = Integer.parseInt(animations[i].split(":")[1]);

            // Splits the animation string on ":" (e.g., "ez:300" → ["ez", "300"])
            // Takes the second part [1], which is the time
            
            int maxRepeat = 0;

            for (String song : songs) {
                int songTime = Integer.parseInt(song.split(":")[1]);
                if (songTime <= animTime) {
                    maxRepeat = Math.max(maxRepeat, animTime / songTime);
                }
            }

            result[i] = maxRepeat;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] songs = { "serial:120", "lofi:60", "bigbeat:400" };
        String[] animations = { "ez:300", "loop:60", "mini:100" };

        System.out.println(Arrays.toString(maxRepeatsPerAnimation(songs, animations))); // [5, 1, 1]
    }
}