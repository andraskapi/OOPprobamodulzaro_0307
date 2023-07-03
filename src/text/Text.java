package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<String> testText = new ArrayList<>(Arrays.asList(
                "Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."));

        textModifier(testText);
        for(String text : testText){
            System.out.println(text);
        }



    }

    public static void textModifier(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String text  = list.get(i);
            if (text.length() > 25){
                list.set(i,text.substring(0,20) + ".".repeat(3));
            }

        }

    }

}
