package com.sma.smartv3.model;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.IOiOOI0;
import com.android.mltcode.paycertificationapi.OOOi0;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.m54;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.Utils;
import com.ironsource.C12101Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.Languages;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLanguageTranslation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageTranslation.kt\ncom/sma/smartv3/model/LanguageTranslationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
public final class LanguageTranslationKt {

    @aa1
    private static final ArrayList<LanguageTranslationData> languageList = new ArrayList<>();

    public static final void clearTranslationLanguageList() {
        languageList.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @aa1
    public static final String detectLanguage(@aa1 String str) {
        Object obj;
        String text = str;
        Intrinsics.X0O(text, "text");
        if (text.length() == 0) {
            return "unknown";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set setXX0 = m54.XX0(224, 226, 231, 232, 233, 234, 235, 238, 239, 244, 249, 251, 252, 255, 339, 230, 192, 194, 199, 200, 201, 202, 203, 206, 207, 212, 217, 219, 220, 376, 338, 198);
        Set setXX1 = m54.XX0(228, 246, 252, 223, 196, 214, 220);
        Set setXX2 = m54.XX0(225, 233, 237, 243, 250, 252, 241, 191, 161, 193, 201, 205, 211, 218, 220, 209);
        Set setXX3 = m54.XX0(227, 245, 225, 233, 237, 243, 250, 234, 244, 231, 195, 213, 193, 201, 205, 211, 218, 202, 212, 199);
        Set setXX4 = m54.XX0(287, 286, 305, 304, 351, 350, 231, 199);
        Set setXX5 = m54.XX0(224, 232, 233, 236, 242, 249, 192, 200, 201, 204, 210, 217);
        Set setXX6 = m54.XX0(261, 263, 281, 322, 324, 243, 347, 378, 380, 260, 262, 280, 321, 323, 211, 346, 377, 379);
        Set setXX7 = m54.XX0(235, 239, 203, 207);
        int length = text.length();
        int i = 0;
        while (i < length) {
            char cCharAt = text.charAt(i);
            if (19968 <= cCharAt && cCharAt < 40960) {
                inc(linkedHashMap, Languages.DEFAULT_LANGUAGE_ZH);
            } else if (12352 <= cCharAt && cCharAt < 12448) {
                inc(linkedHashMap, "ja");
            } else if (12448 <= cCharAt && cCharAt < 12544) {
                inc(linkedHashMap, "ja");
            } else if (44032 <= cCharAt && cCharAt < 55216) {
                inc(linkedHashMap, "ko");
            } else if (1024 <= cCharAt && cCharAt < 1280) {
                inc(linkedHashMap, "ru");
            } else if (880 <= cCharAt && cCharAt < 1024) {
                inc(linkedHashMap, "el");
            } else if (1536 <= cCharAt && cCharAt < 1792) {
                inc(linkedHashMap, "ar");
            } else if (1424 <= cCharAt && cCharAt < 1536) {
                inc(linkedHashMap, "he");
            } else if (3584 <= cCharAt && cCharAt < 3712) {
                inc(linkedHashMap, "th");
            } else if (3712 <= cCharAt && cCharAt < 3840) {
                inc(linkedHashMap, "lo");
            } else if (4096 <= cCharAt && cCharAt < 4256) {
                inc(linkedHashMap, "my");
            } else if (4256 <= cCharAt && cCharAt < 4352) {
                inc(linkedHashMap, "ka");
            } else if (1328 <= cCharAt && cCharAt < 1424) {
                inc(linkedHashMap, "hy");
            } else if (6016 <= cCharAt && cCharAt < 6144) {
                inc(linkedHashMap, "km");
            } else if (2304 <= cCharAt && cCharAt < 2432) {
                inc(linkedHashMap, "hi");
            } else if (2432 <= cCharAt && cCharAt < 2560) {
                inc(linkedHashMap, ScarConstants.BN_SIGNAL_KEY);
            } else if (2560 <= cCharAt && cCharAt < 2688) {
                inc(linkedHashMap, "pa");
            } else if (2688 <= cCharAt && cCharAt < 2816) {
                inc(linkedHashMap, "gu");
            } else if (2816 <= cCharAt && cCharAt < 2944) {
                inc(linkedHashMap, "or");
            } else if (2944 <= cCharAt && cCharAt < 3072) {
                inc(linkedHashMap, "ta");
            } else if (3072 <= cCharAt && cCharAt < 3200) {
                inc(linkedHashMap, "te");
            } else if (3200 <= cCharAt && cCharAt < 3328) {
                inc(linkedHashMap, "kn");
            } else if (3328 <= cCharAt && cCharAt < 3456) {
                inc(linkedHashMap, "ml");
            } else if (3456 <= cCharAt && cCharAt < 3584) {
                inc(linkedHashMap, "si");
            } else if (setXX1.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR);
            } else if (setXX0.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "fr");
            } else if (setXX2.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "es");
            } else if (setXX3.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "pt");
            } else if (setXX4.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "tr");
            } else if (setXX5.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "it");
            } else if (setXX6.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "pl");
            } else if (setXX7.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, "nl");
            } else if (cCharAt >= 0 && cCharAt < 128) {
                inc(linkedHashMap, Languages.DEFAULT_LANGUAGE);
            } else if (128 > cCharAt || cCharAt >= 256) {
                if ((7680 <= cCharAt && cCharAt < 7936) || cCharAt == 416 || cCharAt == 417 || cCharAt == 431 || cCharAt == 432 || cCharAt == 208 || cCharAt == 272) {
                    inc(linkedHashMap, "vi");
                }
            } else if (!setXX0.contains(Character.valueOf(cCharAt)) && !setXX1.contains(Character.valueOf(cCharAt)) && !setXX2.contains(Character.valueOf(cCharAt)) && !setXX3.contains(Character.valueOf(cCharAt)) && !setXX4.contains(Character.valueOf(cCharAt)) && !setXX5.contains(Character.valueOf(cCharAt)) && !setXX6.contains(Character.valueOf(cCharAt)) && !setXX7.contains(Character.valueOf(cCharAt))) {
                inc(linkedHashMap, Languages.DEFAULT_LANGUAGE);
            }
            i++;
            text = str;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry = (Map.Entry) obj;
        String str2 = entry != null ? (String) entry.getKey() : null;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case OOOi0.I0O1O /* 3121 */:
                    if (str2.equals("ar")) {
                        return "ar-SA";
                    }
                    break;
                case 3148:
                    if (str2.equals(ScarConstants.BN_SIGNAL_KEY)) {
                        return "bn-BD";
                    }
                    break;
                case 3201:
                    if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                        return "de-DE";
                    }
                    break;
                case 3239:
                    if (str2.equals("el")) {
                        return "el-GR";
                    }
                    break;
                case 3241:
                    if (str2.equals(Languages.DEFAULT_LANGUAGE)) {
                        return "en-US";
                    }
                    break;
                case OOOi0.IX0 /* 3246 */:
                    if (str2.equals("es")) {
                        return "es-ES";
                    }
                    break;
                case 3276:
                    if (str2.equals("fr")) {
                        return "fr-FR";
                    }
                    break;
                case 3310:
                    if (str2.equals("gu")) {
                        return "gu-IN";
                    }
                    break;
                case 3325:
                    if (str2.equals("he")) {
                        return "he-IL";
                    }
                    break;
                case 3329:
                    if (str2.equals("hi")) {
                        return "hi-IN";
                    }
                    break;
                case 3345:
                    if (str2.equals("hy")) {
                        return "hy-AM";
                    }
                    break;
                case 3371:
                    if (str2.equals("it")) {
                        return "it-IT";
                    }
                    break;
                case 3383:
                    if (str2.equals("ja")) {
                        return "ja-JP";
                    }
                    break;
                case 3414:
                    if (str2.equals("ka")) {
                        return "ka-GE";
                    }
                    break;
                case 3426:
                    if (str2.equals("km")) {
                        return "km-KH";
                    }
                    break;
                case 3427:
                    if (str2.equals("kn")) {
                        return "kn-IN";
                    }
                    break;
                case 3428:
                    if (str2.equals("ko")) {
                        return "ko-KR";
                    }
                    break;
                case 3459:
                    if (str2.equals("lo")) {
                        return "lo-LA";
                    }
                    break;
                case 3487:
                    if (str2.equals("ml")) {
                        return "ml-IN";
                    }
                    break;
                case OOOi0.Xi0 /* 3500 */:
                    if (str2.equals("my")) {
                        return "my-MM";
                    }
                    break;
                case 3518:
                    if (str2.equals("nl")) {
                        return "nl-NL";
                    }
                    break;
                case 3555:
                    if (str2.equals("or")) {
                        return "or-IN";
                    }
                    break;
                case 3569:
                    if (str2.equals("pa")) {
                        return "pa-IN";
                    }
                    break;
                case 3580:
                    if (str2.equals("pl")) {
                        return "pl-PL";
                    }
                    break;
                case 3588:
                    if (str2.equals("pt")) {
                        return "pt-PT";
                    }
                    break;
                case 3651:
                    if (str2.equals("ru")) {
                        return "ru-RU";
                    }
                    break;
                case 3670:
                    if (str2.equals("si")) {
                        return "si-LK";
                    }
                    break;
                case 3693:
                    if (str2.equals("ta")) {
                        return "ta-IN";
                    }
                    break;
                case 3697:
                    if (str2.equals("te")) {
                        return "te-IN";
                    }
                    break;
                case 3700:
                    if (str2.equals("th")) {
                        return "th-TH";
                    }
                    break;
                case 3710:
                    if (str2.equals("tr")) {
                        return "tr-TR";
                    }
                    break;
                case 3763:
                    if (str2.equals("vi")) {
                        return "vi-VN";
                    }
                    break;
                case 3886:
                    if (str2.equals(Languages.DEFAULT_LANGUAGE_ZH)) {
                        return "zh-CN";
                    }
                    break;
            }
        }
        return "unknown";
    }

    @aa1
    public static final LanguageTranslationData getAILanguage(@aa1 String language) {
        Object next;
        Intrinsics.X0O(language, "language");
        if (Intrinsics.XOO0ii0(language, Languages.DEFAULT_LANGUAGE_ZH)) {
            return new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-CN", "zh-Hans", "zh-CN-XiaoxiaoNeural", false, 0, null, 0, 240, null);
        }
        Iterator<T> it = getTranslationLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), language));
        LanguageTranslationData languageTranslationData = (LanguageTranslationData) next;
        return languageTranslationData != null ? languageTranslationData : new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en-US", Languages.DEFAULT_LANGUAGE, "en-US-AvaMultilingualNeural", false, 0, null, 0, 240, null);
    }

    public static /* synthetic */ LanguageTranslationData getAILanguage$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLocalLanguage();
        }
        return getAILanguage(str);
    }

    @aa1
    public static final List<LanguageTranslationData> getCallTranslationLanguageList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-CN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en-US", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese_hk), "zh-HK", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese_tw), "zh-TW", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english_in), "en-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar-SA", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic_eg), "ar-EG", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic_jo), "ar-JO", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic_ae), "ar-AE", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl-NL", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil-PH", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr-FR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de-DE", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_gujarati), "gu-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he-IL", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it-IT", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja-JP", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kannada), "kn-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko-KR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms-MY", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa-IR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt-PT", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-RU", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es-ES", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th-TH", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr-TR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi-VN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesia_id), "id-ID", null, null, false, 0, null, 0, IOiOOI0.X0O, null)));
        return arrayList;
    }

    @aa1
    public static final String getLocalLanguage() {
        String language = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.O10IXXX0X(language, "getLanguage(...)");
        return language;
    }

    @aa1
    public static final String getTranslationLanguageASRLanguage(@aa1 String rtasrLanguage) {
        Object next;
        String asrLanguage;
        Intrinsics.X0O(rtasrLanguage, "rtasrLanguage");
        Iterator<T> it = getTranslationLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), rtasrLanguage));
        LanguageTranslationData languageTranslationData = (LanguageTranslationData) next;
        return (languageTranslationData == null || (asrLanguage = languageTranslationData.getAsrLanguage()) == null) ? "zh-cn" : asrLanguage;
    }

    @aa1
    public static final List<LanguageTranslationData> getTranslationLanguageList() {
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            ArrayList<LanguageTranslationData> arrayList = languageList;
            if (arrayList.isEmpty() || arrayList.size() == 0 || !Intrinsics.XOO0ii0(arrayList.get(0).getTtsViuceName(), "zh-CN-XiaoxiaoNeural")) {
                microsoftLanguage();
            }
        } else if (q62Var.OIXOOi()) {
            ArrayList<LanguageTranslationData> arrayList2 = languageList;
            if (arrayList2.isEmpty() || arrayList2.size() == 0 || !Intrinsics.XOO0ii0(arrayList2.get(0).getTtsViuceName(), "x4_lingxiaolu_en")) {
                sparkChainLanguage();
            }
        } else {
            ArrayList<LanguageTranslationData> arrayList3 = languageList;
            if (arrayList3.isEmpty() || arrayList3.size() == 0 || !Intrinsics.XOO0ii0(arrayList3.get(0).getTtsViuceName(), "zh-CN-XiaoxiaoNeural")) {
                microsoftLanguage();
            }
        }
        return languageList;
    }

    @aa1
    public static final String getTranslationLanguageTtsName(@aa1 String rtasrLanguage) {
        Object next;
        String ttsViuceName;
        Intrinsics.X0O(rtasrLanguage, "rtasrLanguage");
        Iterator<T> it = getTranslationLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), rtasrLanguage));
        LanguageTranslationData languageTranslationData = (LanguageTranslationData) next;
        return (languageTranslationData == null || (ttsViuceName = languageTranslationData.getTtsViuceName()) == null) ? "x4_enus_catherine_profnews" : ttsViuceName;
    }

    public static final void inc(@aa1 Map<String, Integer> map, @aa1 String key) {
        Intrinsics.X0O(map, "<this>");
        Intrinsics.X0O(key, "key");
        Integer num = map.get(key);
        map.put(key, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    private static final void microsoftLanguage() {
        languageList.addAll(CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-CN", "zh-Hans", "zh-CN-XiaoxiaoNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en-US", Languages.DEFAULT_LANGUAGE, "en-US-AvaMultilingualNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-RU", "ru", "ru-RU-SvetlanaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko-KR", "ko", "ko-KR-SunHiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de-DE", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "de-DE-KatjaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja-JP", "ja", "ja-JP-NanamiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi-VN", "vi", "vi-VN-HoaiMyNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar-SA", "ar", "ar-SA-ZariyahNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), "ne-NP", "ne", "ne-NP-HemkalaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), "ro-RO", "ro", "ro-RO-AlinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi-IN", "hi", "hi-IN-AaravNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kazakh_language), "kk-KZ", "kk", "kk-KZ-AigulNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_jkazakh_neh), "kk-KZ", "kk", "kk-KZ-AigulNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), "sv-SE", "sv", "sv-SE-SofieNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), "pl-PL", "pl", "pl-PL-AgnieszkaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), "sl-SI", "sl", "sl-SI-PetraNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_zulu), "zu-ZA", "zu", "zu-ZA-ThandoNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), "lo-LA", "lo", "lo-LA-KeomanyNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), "nb-NO", "nb", "nb-NO-PernilleNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr-FR", "fr", "fr-FR-DeniseNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt-PT", "pt", "pt-PT-RaquelNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_brazilian_portuguese), "pt-BR", "pt", "pt-BR-FranciscaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es-ES", "es", "es-ES-ElviraNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), "ur-IN", "ur", "ur-IN-GulNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_mongol), "mn-MN", X10i1i.O1O, "mn-MN-YesuiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), "mr-IN", "mr", "mr-IN-AarohiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), "ps-AF", "ps", "ps-AF-LatifaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa-IR", "fa", "fa-IR-DilaraNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), "da-DK", "da", "da-DK-ChristelNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), "id-ID", "id", "x2_IdId_Fira", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), "hu-HU", "hu", "hu-HU-NoemiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te-IN", "te", "te-IN-ShrutiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he-IL", "he", "he-IL-HilaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_island), "is-IS", "is", "is-IS-GudrunNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), "sk-SK", "sk", "sk-SK-ViktoriaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), "sr-RS", "sr-Latn", "sr-Latn-RS-NicholasNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), "ka-GE", "ka", "ka-GE-EkaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), "hr-HR", "hr", "hr-HR-GabrijelaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), "uz-UZ", "uz", "uz-UZ-MadinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms-MY", "ms", "ms-MY-YasminNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), "bg-BG", "bg", "bg-BG-KalinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil-PH", "fil", "fil-PH-BlessicaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta-IN", "ta", "ta-IN-PallaviNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr-TR", "tr", "tr-TR-EmelNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), "sw-KE", "sw", "sw-KE-ZuriNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl-NL", "nl", "nl-NL-FennaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), "fi-FI", "fi", "fi-FI-SelmaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), "ca-ES", DownloadCommon.DOWNLOAD_REPORT_CANCEL, "ca-ES-JoanaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), "az-AZ", "az", "az-AZ-BanuNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), "af-ZA", ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), "am-ET", "am", "am-ET-MekdesNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), "cs-CZ", "cs", "cs-CZ-VlastaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it-IT", "it", "it-IT-ElsaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th-TH", "th", "th-TH-PremwadeeNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), "hy-AM", "hy", "hy-AM-AnahitNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), "si-LK", "si", "si-LK-ThiliniNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn-IN", ScarConstants.BN_SIGNAL_KEY, "bn-IN-TanishaaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_burmese), "my-MM", "my", "my-MM-NilarNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), "uk-UA", "uk", "uk-UA-PolinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), "ml-IN", "ml", "ml-IN-SobhanaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), "lv-LV", "lv", "lv-LV-EveritaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), "lt-LT", "lt", "lt-LT-OnaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), "km-KH", "km", "km-KH-SreymomNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), "el-GR", "el", "el-GR-AthinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_assamese), "as-IN", "as", "as-IN-YashicaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bosnian), "bs-BA", CmcdConfiguration.KEY_BUFFER_STARVATION, "bs-BA-VesnaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_welsh), "cy-GB", "cy", "cy-GB-NiaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_estonian), "et-EE", ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, "et-EE-AnuNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_basque), "eu-ES", "eu", "eu-ES-AinhoaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_irish), "ga-IE", "ga", "ga-IE-OrlaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_galician), "gl-ES", "gl", "gl-ES-SabelaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_gujarati), "gu-IN", "gu", "gu-IN-DhwaniNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_javanese), "jv-ID", "jv", "jv-ID-SitiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kannada), "kn-IN", "kn", "kn-IN-SapnaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_macedonian), "mk-MK", "mk", "mk-MK-MarijaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_maltese), "mt-MT", C12101Q6.f29914a1, "mt-MT-JosephNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_iriya), "or-IN", "or", "or-IN-SukantNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_punjabi), "pa-IN", "pa", "pa-IN-OjasNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_somali), "so-SO", "so", "so-SO-UbaxNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_albanian), "sq-AL", "sq", "sq-AL-AnilaNeural", false, 0, null, 0, 240, null)));
    }

    private static final void sparkChainLanguage() {
        languageList.addAll(CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-cn", "cn", "x4_lingxiaolu_en", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en_us", Languages.DEFAULT_LANGUAGE, "x4_enus_catherine_profnews", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-ru", "ru", "x2_ruru_keshu", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko_kr", "ko", "x2_kokr_miya", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de_DE", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "x2_dede_christiane", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja_jp", "ja", "x2_jajp_zhongcun", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi_VN", "vi", "x2_vivn_thuhien", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar_il", "ar", "x2_aren_rania", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), "ne_np", "ne", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), "ro_ro", "ro", "x2_roro_miruna", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi_in", "hi", "x2_hiin_mohita", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kazakh_language), "kk_KZ", "kk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_jkazakh_neh), "kk_cn", "kk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), "sv_SE", "sv", "x2_svse_michaela", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), "pl_pl", "pl", "x2_natali", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), "sl_si", "sl", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_zulu), "zu_za", "zu", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), "lo_LA", "lo", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), "nb_NO", "nb", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr_fr", "fr", "x2_mariane", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt_PT", "pt", "maria", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_brazilian_portuguese), "pt_BR", "pt", "sonia", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es_es", "es", "x2_spes_aurora", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), "ur_IN", "ur", "baili", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_mongol), "mn_MN", X10i1i.O1O, null, true, 0, null, 0, 232, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), "mr_in", "mr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), "ps_ar", "ps", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hausa), "ha_NG", "ha", "x2_hang_zainab", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa_IR", "fa", "x2_fair_saheli", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), "da_DK", "da", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), "id_ID", "id", "x2_IdId_Fira", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), "hu_hu", "hu", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te_in", "te", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he_il", "he", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_island), "is_IS", "is", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), "sk_sk", "sk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), "sr_RS", "sr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), "ka_ge", "ka", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), "hr_hr", "hr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), "uz_UZ", "uz", "x2_uzuz_nigina", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms_MY", "ms", "x2_msmy_hashim", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), "bg_bg", "bg", "x2_bgbg_zlati", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil_PH", "tl", "x2_tlph_grace", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta_in", "ta", "x2_tain_udaya", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr_TR", "tr", "x2_trtr_ersoy", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), "sw_KE", "sw", "x2_swtz_hamdan", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl_NL", "nl", "x2_nlnl_robin", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), "fi_fi", "fi", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), "ca_es", DownloadCommon.DOWNLOAD_REPORT_CANCEL, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), "az_AZ", "az", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), "af_za", ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), "am_et", "am", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), "cs_CZ", "cs", "x2_cscz_petra", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it_IT", "it", "x2_itit_anna", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th_TH", "th", "yingying", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tajik), "tg_tg", "tg", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), "hy_AM", "hy", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), "si_lk", "si", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn_BD", ScarConstants.BN_SIGNAL_KEY, "x2_bnbd_elmy", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_burmese), "my_mm", "my", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), "uk_UA", "uk", "x2_ukua_halyna", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), "ml_in", "ml", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), "lv_lv", "lv", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), "lt_LT", "lt", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkmen), "tm_tk", "tm", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), "km_KH", "km", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), "el_GR", "el", "x2_elgr_dimitra", false, 0, null, 0, 240, null)));
    }

    public static final void main() {
        System.out.println((Object) "--- Basic Tests ---");
        System.out.println((Object) ("'你好世界' is detected as: " + detectLanguage("你好世界")));
        System.out.println((Object) ("'Hello World' is detected as: " + detectLanguage("Hello World")));
        System.out.println((Object) ("'こんにちは、世界' is detected as: " + detectLanguage("こんにちは、世界")));
        System.out.println((Object) ("'안녕하세요 세계' is detected as: " + detectLanguage("안녕하세요 세계")));
        System.out.println((Object) ("'Привет, мир!' is detected as: " + detectLanguage("Привет, мир!")));
        System.out.println((Object) ("'สวัสดีชาวโลก' is detected as: " + detectLanguage("สวัสดีชาวโลก")));
        System.out.println((Object) ("'Bonjour le monde' is detected as: " + detectLanguage("Bonjour le monde")));
        System.out.println((Object) ("'café au lait' is detected as: " + detectLanguage("café au lait")));
        System.out.println((Object) ("'Hallo Welt' is detected as: " + detectLanguage("Hallo Welt")));
        System.out.println((Object) ("'Straße des Glücks' is detected as: " + detectLanguage("Straße des Glücks")));
        System.out.println((Object) ("'Hola Mundo' is detected as: " + detectLanguage("Hola Mundo")));
        System.out.println((Object) ("'¿Qué tal?' is detected as: " + detectLanguage("¿Qué tal?")));
        System.out.println((Object) ("'Olá Mundo' is detected as: " + detectLanguage("Olá Mundo")));
        System.out.println((Object) ("'Xin chào thế giới' is detected as: " + detectLanguage("Xin chào thế giới")));
        System.out.println((Object) "\n--- Other Script Tests ---");
        System.out.println((Object) ("'Γειά σου Κόσμε' is detected as: " + detectLanguage("Γειά σου Κόσμε")));
        System.out.println((Object) ("'مرحبا بالعالم' is detected as: " + detectLanguage("مرحبا بالعالم")));
        System.out.println((Object) ("'שלום עולם' is detected as: " + detectLanguage("שלום עולם")));
        System.out.println((Object) ("'नमस्ते दुनिया' is detected as: " + detectLanguage("नमस्ते दुनिया")));
        System.out.println((Object) ("'হ্যালো ওয়ার্ল্ড' is detected as: " + detectLanguage("হ্যালো ওয়ার্ল্ড")));
        System.out.println((Object) ("'வணக்கம் உலகம்' is detected as: " + detectLanguage("வணக்கம் உலகம்")));
        System.out.println((Object) ("'ሰላም ልዑል' is detected as: " + detectLanguage("ሰላም ልዑል")));
        System.out.println((Object) ("'你好 Hello こんにちは' is detected as: " + detectLanguage("你好 Hello こんにちは")));
        System.out.println((Object) ("'Merhaba Dünya' is detected as: " + detectLanguage("Merhaba Dünya")));
        System.out.println((Object) ("'Ciao mondo è bello' is detected as: " + detectLanguage("Ciao mondo è bello")));
        System.out.println((Object) ("'Witaj świecie' is detected as: " + detectLanguage("Witaj świecie")));
        System.out.println((Object) ("'Hallo wereld met ëen' is detected as: " + detectLanguage("Hallo wereld met ëen")));
        System.out.println((Object) "\n--- Edge Cases ---");
        System.out.println((Object) ("'' (Empty string) is detected as: " + detectLanguage("")));
        System.out.println((Object) ("'12345 @#$%^' is detected as: " + detectLanguage("12345 @#$%^")));
        System.out.println((Object) ("'你好123' is detected as: " + detectLanguage("你好123")));
    }
}
