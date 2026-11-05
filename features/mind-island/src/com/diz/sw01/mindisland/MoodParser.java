package com.diz.sw01.mindisland;

import java.util.regex.Pattern;

/** Explicit weather words only. Multiple weather choices remain unselected. */
public final class MoodParser {
    public static final String[] LABELS = {"맑음", "잔잔함", "흐림", "비", "바람"};
    private static final String[] WORDS = {
        "맑음|맑아요|맑습니다|맑네요", "잔잔함|잔잔해요|잔잔합니다",
        "흐림|흐려요|흐립니다|흐리네요", "비|비예요|비입니다", "바람|바람이에요|바람입니다"
    };
    public static int parse(String text) {
        if (text == null) return -1;
        int selected = -1;
        for (int i = 0; i < WORDS.length; i++) {
            if (Pattern.compile("(?:^|[\\s,.!?。])(?:"+WORDS[i]+")(?=$|[\\s,.!?。])").matcher(text).find()) {
                if (selected >= 0) return -1;
                selected = i;
            }
        }
        return selected;
    }
}
