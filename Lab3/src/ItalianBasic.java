import java.util.Arrays;

public class ItalianBasic {
    static String[] BasicPL = {"cześć", "dziękuję", "tak", "nie"};
    static String[] BasicIT = {"ciao", "grazie", "si", "no"};

    static String plTOit(String word_) {
        for(int i = 0; i<BasicPL.length; i++ ) {
            if(BasicPL[i] == word_) {
                return BasicIT[i];
        }
        return "There is no such word in the dictionary";
    }

    static String itTOpl(String word_) {
        for(int i=0; i<BasicIT.length; i++ ) {
            if(BasicIT[i] == word_)
                return BasicPL[i];
        }
        return "There is no such word in the dictionary";
    }
}
