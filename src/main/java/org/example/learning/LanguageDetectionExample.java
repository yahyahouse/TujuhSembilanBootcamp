//package org.example.learning;
//
//import opennlp.tools.langdetect.Language;
//import opennlp.tools.langdetect.LanguageDetectorME;
//import opennlp.tools.langdetect.LanguageDetectorModel;
//import opennlp.tools.langdetect.LanguageSample;
//import opennlp.tools.util.ObjectStream;
//import opennlp.tools.util.ObjectStreamUtils;
//import opennlp.tools.util.PlainTextByLineStream;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class LanguageDetectionExample {
//
//    public static void main(String[] args) throws Exception {
//        // Load the language detection model
//        InputStream modelIn = new FileInputStream("path/to/language-detection-model.bin");
//        LanguageDetectorModel model = new LanguageDetectorModel(modelIn);
//        LanguageDetectorME langDetector = new LanguageDetectorME(model);
//
//        // Text for language detection
//        String text = "This is an example of text for language detection.";
//
//        // Detect the language of the text
//        LanguageSample sample = new LanguageSample(text);
//        String language = langDetector.predictLanguage(sample);
//
//        System.out.println("Detected language: " + language);
//
//        modelIn.close();
//    }
//}
