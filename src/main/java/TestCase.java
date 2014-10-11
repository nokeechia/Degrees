import com.sun.xml.internal.stream.buffer.sax.Properties;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import edu.stanford.nlp.util.PropertiesUtils;

import java.util.List;

/**
 * Created by Keech on 11/10/2014.
 */
public class TestCase {


    String text = "I am feeling very upset";
    Properties props = new Properties();
    //props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
    //PropertiesUtils.Property.
    //properties.load("degrees.prop");
    //properties.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
    //properties.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
    //StanfordCoreNLP pipeline = new StanfordCoreNLP(properties);

    //Annotation annotation = pipeline.process(text);
    //List<CoreMap> sentences = annotation.get(CoreAnnotations.SentencesAnnotation.class);
/**    for (CoreMap sentence : sentences) {
        String sentiment = sentence.get(SentimentCoreAnnotations.ClassName.class);
        System.out.println(sentiment + "\t" + sentence);
    } **/
}
