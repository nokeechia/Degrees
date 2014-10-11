package Sentiments;

import java.util.HashMap;

/**
 * Created by Keech on 11/10/2014.
 */
public class TweetWithSentiment {

    private String line;
    private int emotionscale;

    public TweetWithSentiment() {
    }

    public TweetWithSentiment(String line, int emotionscale) {
        super();
        this.line = line;
        this.emotionscale = emotionscale;
    }

    public String getLine() {
        return line;
    }

    public int getCssClass() {
        return emotionscale;
    }

    @Override
    public String toString() {
        return "Sentiments.TweetWithSentiment [line=" + line + ", cssClass=" + emotionscale + "]";
    }


}


