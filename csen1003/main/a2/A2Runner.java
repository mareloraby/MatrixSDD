package csen1003.main.a2;

import csen1003.main.a2.A2Lexer;
import csen1003.main.a2.A2Parser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

import java.util.List;

public class A2Runner {

//    public static int sCheckValue(String input) {
//        A2Lexer lexer = new A2Lexer(CharStreams.fromString(input));
//        A2Parser parser = new A2Parser(new CommonTokenStream(lexer));
//        return parser.s().check;
//    }

    public static String tokenStream(String input) {

        A2Lexer lexer = new A2Lexer(CharStreams.fromString(input));
        Vocabulary vocabulary = lexer.getVocabulary();
        List<? extends Token> tokens = lexer.getAllTokens();
        StringBuilder stringBuilder = new StringBuilder();
        for (Token token : tokens) {
            stringBuilder.append(token.getText()).append(",").append(vocabulary.getSymbolicName(token.getType()))
                    .append(";");
        }
        return stringBuilder.toString();
    }
    public static int sCheckValue(String input) {
        A2Lexer lexer = new A2Lexer(CharStreams.fromString(input));
        A2Parser parser = new A2Parser(new CommonTokenStream(lexer));
        return parser.s().check;
    }


    public static void main(String[] args) {
//        System.out.println(tokenStream("if (x > 10) printf(\"\") else printf(\"No\")"));
        System.out.println(sCheckValue("78#768#137#787"));

    }

}




//
//    public static void main(String[] args) {
////        System.out.println(sCheckValue("aacccccbb"));
//        System.out.println(sCheckValue("aacbb"));
//    }

