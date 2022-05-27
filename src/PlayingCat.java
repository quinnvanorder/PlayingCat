public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){
        int min = 25;
        int max = 35;
        if (summer)
            max = 45;
        return temperature >= min && temperature <= max;
    }
}
