package com.sma.smartv3.model;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.IOiOOI0;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.m54;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.Utils;
import com.ironsource.Q6;
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
    private static final ArrayList<LanguageTranslationData> languageList = null;

    static {
        languageList = new ArrayList();
    }

    public static final void clearTranslationLanguageList() {
        languageList.clear();
    }

    @aa1
    public static final String detectLanguage(@aa1 String r71) {
        String r0 = r71;
        Intrinsics.X0O(r0, "text");
        if (r0.length() != 0) goto L5;
        return "unknown";
    L5:
        LinkedHashMap r1 = new LinkedHashMap();
        Set r4 = m54.XX0(new Character[]{224, 226, 231, 232, 233, 234, 235, 238, 239, 244, 249, 251, 252, 255, 339, 230, 192, 194, 199, 200, 201, 202, 203, 206, 207, 212, 217, 219, 220, 376, 338, 198});
        Set r5 = m54.XX0(new Character[]{228, 246, 252, 223, 196, 214, 220});
        Set r7 = m54.XX0(new Character[]{225, 233, 237, 243, 250, 252, 241, 191, 161, 193, 201, 205, 211, 218, 220, 209});
        Set r8 = m54.XX0(new Character[]{227, 245, 225, 233, 237, 243, 250, 234, 244, 231, 195, 213, 193, 201, 205, 211, 218, 202, 212, 199});
        Set r9 = m54.XX0(new Character[]{287, 286, 305, 304, 351, 350, 231, 199});
        Set r3 = m54.XX0(new Character[]{224, 232, 233, 236, 242, 249, 192, 200, 201, 204, 210, 217});
        Set r6 = m54.XX0(new Character[]{261, 263, 281, 322, 324, 243, 347, 378, 380, 260, 262, 280, 321, 323, 211, 346, 377, 379});
        Set r10 = m54.XX0(new Character[]{235, 239, 203, 207});
        int r11 = r0.length();
        int r12 = 0;
    L7:
        if (r12 >= r11) goto L196;
        char r15 = r0.charAt(r12);
        if (19968 > r15) goto L14;
        if (r15 >= 40960) goto L14;
        inc(r1, Languages.DEFAULT_LANGUAGE_ZH);
    L195:
        r12 = r12 + 1;
        r0 = r71;
    L14:
        if (12352 > r15) goto L19;
        if (r15 >= 12448) goto L19;
        inc(r1, "ja");
    L19:
        if (12448 > r15) goto L24;
        if (r15 >= 12544) goto L24;
        inc(r1, "ja");
    L24:
        if (44032 > r15) goto L29;
        if (r15 >= 55216) goto L29;
        inc(r1, "ko");
    L29:
        if (1024 > r15) goto L34;
        if (r15 >= 1280) goto L34;
        inc(r1, "ru");
    L34:
        if (880 > r15) goto L39;
        if (r15 >= 1024) goto L39;
        inc(r1, "el");
    L39:
        if (1536 > r15) goto L44;
        if (r15 >= 1792) goto L44;
        inc(r1, "ar");
    L44:
        if (1424 > r15) goto L49;
        if (r15 >= 1536) goto L49;
        inc(r1, "he");
    L49:
        if (3584 > r15) goto L54;
        if (r15 >= 3712) goto L54;
        inc(r1, "th");
    L54:
        if (3712 > r15) goto L59;
        if (r15 >= 3840) goto L59;
        inc(r1, "lo");
    L59:
        if (4096 > r15) goto L64;
        if (r15 >= 4256) goto L64;
        inc(r1, "my");
    L64:
        if (4256 > r15) goto L69;
        if (r15 >= 4352) goto L69;
        inc(r1, "ka");
    L69:
        if (1328 > r15) goto L74;
        if (r15 >= 1424) goto L74;
        inc(r1, "hy");
    L74:
        if (6016 > r15) goto L79;
        if (r15 >= 6144) goto L79;
        inc(r1, "km");
    L79:
        if (2304 > r15) goto L84;
        if (r15 >= 2432) goto L84;
        inc(r1, "hi");
    L84:
        if (2432 > r15) goto L89;
        if (r15 >= 2560) goto L89;
        inc(r1, ScarConstants.BN_SIGNAL_KEY);
    L89:
        if (2560 > r15) goto L94;
        if (r15 >= 2688) goto L94;
        inc(r1, "pa");
    L94:
        if (2688 > r15) goto L99;
        if (r15 >= 2816) goto L99;
        inc(r1, "gu");
    L99:
        if (2816 > r15) goto L104;
        if (r15 >= 2944) goto L104;
        inc(r1, "or");
    L104:
        if (2944 > r15) goto L109;
        if (r15 >= 3072) goto L109;
        inc(r1, "ta");
    L109:
        if (3072 > r15) goto L114;
        if (r15 >= 3200) goto L114;
        inc(r1, "te");
    L114:
        if (3200 > r15) goto L119;
        if (r15 >= 3328) goto L119;
        inc(r1, "kn");
    L119:
        if (3328 > r15) goto L124;
        if (r15 >= 3456) goto L124;
        inc(r1, "ml");
    L124:
        if (3456 > r15) goto L129;
        if (r15 >= 3584) goto L129;
        inc(r1, "si");
    L129:
        if (r5.contains(Character.valueOf(r15)) == false) goto L132;
        inc(r1, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR);
        goto L195
    L132:
        if (r4.contains(Character.valueOf(r15)) == false) goto L135;
        inc(r1, "fr");
        goto L195
    L135:
        if (r7.contains(Character.valueOf(r15)) == false) goto L138;
        inc(r1, "es");
        goto L195
    L138:
        if (r8.contains(Character.valueOf(r15)) == false) goto L141;
        inc(r1, "pt");
        goto L195
    L141:
        if (r9.contains(Character.valueOf(r15)) == false) goto L144;
        inc(r1, "tr");
        goto L195
    L144:
        if (r3.contains(Character.valueOf(r15)) == false) goto L147;
        inc(r1, "it");
        goto L195
    L147:
        if (r6.contains(Character.valueOf(r15)) == false) goto L150;
        inc(r1, "pl");
        goto L195
    L150:
        if (r10.contains(Character.valueOf(r15)) == false) goto L152;
        inc(r1, "nl");
        goto L195
    L152:
        if (r15 < 0) goto L157;
        if (r15 >= 128) goto L157;
        inc(r1, Languages.DEFAULT_LANGUAGE);
    L157:
        if (128 > r15) goto L178;
        if (r15 >= 256) goto L178;
        if (r4.contains(Character.valueOf(r15)) == true) goto L195;
        if (r5.contains(Character.valueOf(r15)) == true) goto L195;
        if (r7.contains(Character.valueOf(r15)) == true) goto L195;
        if (r8.contains(Character.valueOf(r15)) == true) goto L195;
        if (r9.contains(Character.valueOf(r15)) == true) goto L195;
        if (r3.contains(Character.valueOf(r15)) == true) goto L195;
        if (r6.contains(Character.valueOf(r15)) == true) goto L195;
        if (r10.contains(Character.valueOf(r15)) == true) goto L195;
        inc(r1, Languages.DEFAULT_LANGUAGE);
    L178:
        if (7680 > r15) goto L183;
        if (r15 >= 7936) goto L183;
    L194:
        inc(r1, "vi");
    L183:
        if (r15 == 416) goto L194;
        if (r15 == 417) goto L194;
        if (r15 == 431) goto L194;
        if (r15 == 432) goto L194;
        if (r15 == 208) goto L194;
        if (r15 != 272) goto L195;
    L196:
        Iterator r2 = r1.entrySet().iterator();
        if (r2.hasNext() == true) goto L199;
        Object r13 = null;
    L209:
        Map.Entry r14 = (Map.Entry) r13;
        if (r14 == null) goto L212;
        String r16 = (String) r14.getKey();
    L213:
        if (r16 != null) goto L215;
    L382:
        return "unknown";
    L215:
        switch(r16.hashCode()) {
            case 3121: goto L378;
            case 3148: goto L373;
            case 3201: goto L368;
            case 3239: goto L363;
            case 3241: goto L358;
            case 3246: goto L353;
            case 3276: goto L348;
            case 3310: goto L343;
            case 3325: goto L338;
            case 3329: goto L333;
            case 3345: goto L328;
            case 3371: goto L323;
            case 3383: goto L318;
            case 3414: goto L313;
            case 3426: goto L308;
            case 3427: goto L303;
            case 3428: goto L298;
            case 3459: goto L293;
            case 3487: goto L288;
            case 3500: goto L283;
            case 3518: goto L278;
            case 3555: goto L273;
            case 3569: goto L268;
            case 3580: goto L263;
            case 3588: goto L258;
            case 3651: goto L253;
            case 3670: goto L248;
            case 3693: goto L243;
            case 3697: goto L238;
            case 3700: goto L233;
            case 3710: goto L228;
            case 3763: goto L223;
            case 3886: goto L218;
            default: goto L382;
        };
    L218:
        if (r16.equals(Languages.DEFAULT_LANGUAGE_ZH) == false) goto L382;
        return "zh-CN";
    L223:
        if (r16.equals("vi") == false) goto L382;
        return "vi-VN";
    L228:
        if (r16.equals("tr") == false) goto L382;
        return "tr-TR";
    L233:
        if (r16.equals("th") == false) goto L382;
        return "th-TH";
    L238:
        if (r16.equals("te") == false) goto L382;
        return "te-IN";
    L243:
        if (r16.equals("ta") == false) goto L382;
        return "ta-IN";
    L248:
        if (r16.equals("si") == false) goto L382;
        return "si-LK";
    L253:
        if (r16.equals("ru") == false) goto L382;
        return "ru-RU";
    L258:
        if (r16.equals("pt") == false) goto L382;
        return "pt-PT";
    L263:
        if (r16.equals("pl") == false) goto L382;
        return "pl-PL";
    L268:
        if (r16.equals("pa") == false) goto L382;
        return "pa-IN";
    L273:
        if (r16.equals("or") == false) goto L382;
        return "or-IN";
    L278:
        if (r16.equals("nl") == false) goto L382;
        return "nl-NL";
    L283:
        if (r16.equals("my") == false) goto L382;
        return "my-MM";
    L288:
        if (r16.equals("ml") == false) goto L382;
        return "ml-IN";
    L293:
        if (r16.equals("lo") == false) goto L382;
        return "lo-LA";
    L298:
        if (r16.equals("ko") == false) goto L382;
        return "ko-KR";
    L303:
        if (r16.equals("kn") == false) goto L382;
        return "kn-IN";
    L308:
        if (r16.equals("km") == false) goto L382;
        return "km-KH";
    L313:
        if (r16.equals("ka") == false) goto L382;
        return "ka-GE";
    L318:
        if (r16.equals("ja") == false) goto L382;
        return "ja-JP";
    L323:
        if (r16.equals("it") == false) goto L382;
        return "it-IT";
    L328:
        if (r16.equals("hy") == false) goto L382;
        return "hy-AM";
    L333:
        if (r16.equals("hi") == false) goto L382;
        return "hi-IN";
    L338:
        if (r16.equals("he") == false) goto L382;
        return "he-IL";
    L343:
        if (r16.equals("gu") == false) goto L382;
        return "gu-IN";
    L348:
        if (r16.equals("fr") == false) goto L382;
        return "fr-FR";
    L353:
        if (r16.equals("es") == false) goto L382;
        return "es-ES";
    L358:
        if (r16.equals(Languages.DEFAULT_LANGUAGE) == false) goto L382;
        return "en-US";
    L363:
        if (r16.equals("el") == false) goto L382;
        return "el-GR";
    L368:
        if (r16.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR) == false) goto L382;
        return "de-DE";
    L373:
        if (r16.equals(ScarConstants.BN_SIGNAL_KEY) == false) goto L382;
        return "bn-BD";
    L378:
        if (r16.equals("ar") == false) goto L382;
        return "ar-SA";
    L212:
        r16 = null;
        goto L213
    L199:
        Object r17 = r2.next();
        if (r2.hasNext() == true) goto L202;
    L201:
        r13 = r17;
        goto L209
    L202:
        int r18 = ((Number) ((Map.Entry) r17).getValue()).intValue();
    L203:
        Object r19 = r2.next();
        int r20 = ((Number) ((Map.Entry) r19).getValue()).intValue();
        if (r18 >= r20) goto L207;
        r17 = r19;
        r18 = r20;
    L207:
        if (r2.hasNext() == true) goto L203;
        goto L201
    }

    @aa1
    public static final LanguageTranslationData getAILanguage(@aa1 String r13) {
        Intrinsics.X0O(r13, "language");
        if (Intrinsics.XOO0ii0(r13, Languages.DEFAULT_LANGUAGE_ZH) == true) goto L5;
        Iterator<T> r0 = getTranslationLanguageList().iterator();
    L8:
        if (r0.hasNext() == false) goto L12;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r1).getRtasrLanguage(), r13) == false) goto L8;
    L13:
        LanguageTranslationData r2 = (LanguageTranslationData) r1;
        if (r2 == null) goto L17;
        return r2;
    L17:
        return new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en-US", Languages.DEFAULT_LANGUAGE, "en-US-AvaMultilingualNeural", false, 0, null, 0, 240, null);
    L12:
        r1 = null;
        goto L13
    L5:
        return new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-CN", "zh-Hans", "zh-CN-XiaoxiaoNeural", false, 0, null, 0, 240, null);
    }

    public static /* synthetic */ LanguageTranslationData getAILanguage$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = getLocalLanguage();
    L6:
        return getAILanguage(r0);
    }

    @aa1
    public static final List<LanguageTranslationData> getCallTranslationLanguageList() {
        ArrayList r0 = new ArrayList();
        r0.addAll(CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData[]{new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-CN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en-US", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese_hk), "zh-HK", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese_tw), "zh-TW", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english_in), "en-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar-SA", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic_eg), "ar-EG", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic_jo), "ar-JO", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic_ae), "ar-AE", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl-NL", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil-PH", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr-FR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de-DE", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_gujarati), "gu-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he-IL", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it-IT", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja-JP", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kannada), "kn-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko-KR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms-MY", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa-IR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt-PT", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-RU", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es-ES", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te-IN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th-TH", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr-TR", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi-VN", null, null, false, 0, null, 0, IOiOOI0.X0O, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesia_id), "id-ID", null, null, false, 0, null, 0, IOiOOI0.X0O, null)}));
        return r0;
    }

    @aa1
    public static final String getLocalLanguage() {
        String r0 = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        Intrinsics.O10IXXX0X(r0, "getLanguage(...)");
        return r0;
    }

    @aa1
    public static final String getTranslationLanguageASRLanguage(@aa1 String r3) {
        Intrinsics.X0O(r3, "rtasrLanguage");
        Iterator<T> r0 = getTranslationLanguageList().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r1).getRtasrLanguage(), r3) == false) goto L4;
    L9:
        LanguageTranslationData r2 = (LanguageTranslationData) r1;
        if (r2 == null) goto L15;
        String r4 = r2.getAsrLanguage();
        if (r4 == null) goto L20;
        return r4;
    L20:
        return "zh-cn";
    L15:
        return "zh-cn";
    L8:
        r1 = null;
        goto L9
    }

    @aa1
    public static final List<LanguageTranslationData> getTranslationLanguageList() {
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L14;
        ArrayList<LanguageTranslationData> r1 = languageList;
        if (r1.isEmpty() == false) goto L7;
    L12:
        microsoftLanguage();
    L34:
        return languageList;
    L7:
        if (r1.size() == 0) goto L12;
        if (Intrinsics.XOO0ii0(r1.get(0).getTtsViuceName(), "zh-CN-XiaoxiaoNeural") == true) goto L34;
        microsoftLanguage();
        goto L34
    L14:
        if (r0.OIXOOi() == false) goto L24;
        ArrayList<LanguageTranslationData> r2 = languageList;
        if (r2.isEmpty() == false) goto L18;
    L23:
        sparkChainLanguage();
        goto L34
    L18:
        if (r2.size() == 0) goto L23;
        if (Intrinsics.XOO0ii0(r2.get(0).getTtsViuceName(), "x4_lingxiaolu_en") == true) goto L34;
        sparkChainLanguage();
        goto L34
    L24:
        ArrayList<LanguageTranslationData> r3 = languageList;
        if (r3.isEmpty() == false) goto L27;
    L32:
        microsoftLanguage();
        goto L34
    L27:
        if (r3.size() == 0) goto L32;
        if (Intrinsics.XOO0ii0(r3.get(0).getTtsViuceName(), "zh-CN-XiaoxiaoNeural") == true) goto L34;
        microsoftLanguage();
        goto L34
    }

    @aa1
    public static final String getTranslationLanguageTtsName(@aa1 String r3) {
        Intrinsics.X0O(r3, "rtasrLanguage");
        Iterator<T> r0 = getTranslationLanguageList().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r1).getRtasrLanguage(), r3) == false) goto L4;
    L9:
        LanguageTranslationData r2 = (LanguageTranslationData) r1;
        if (r2 == null) goto L15;
        String r4 = r2.getTtsViuceName();
        if (r4 == null) goto L20;
        return r4;
    L20:
        return "x4_enus_catherine_profnews";
    L15:
        return "x4_enus_catherine_profnews";
    L8:
        r1 = null;
        goto L9
    }

    public static final void inc(@aa1 Map<String, Integer> r1, @aa1 String r2) {
        Intrinsics.X0O(r1, "<this>");
        Intrinsics.X0O(r2, "key");
        Integer r0 = r1.get(r2);
        if (r0 == null) goto L5;
        int r3 = r0.intValue();
    L6:
        r1.put(r2, Integer.valueOf(r3 + 1));
        return;
    L5:
        r3 = 0;
        goto L6
    }

    public static /* synthetic */ void main(String[] r0) {
        main();
    }

    private static final void microsoftLanguage() {
        languageList.addAll(CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData[]{new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-CN", "zh-Hans", "zh-CN-XiaoxiaoNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en-US", Languages.DEFAULT_LANGUAGE, "en-US-AvaMultilingualNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-RU", "ru", "ru-RU-SvetlanaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko-KR", "ko", "ko-KR-SunHiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de-DE", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "de-DE-KatjaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja-JP", "ja", "ja-JP-NanamiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi-VN", "vi", "vi-VN-HoaiMyNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar-SA", "ar", "ar-SA-ZariyahNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), "ne-NP", "ne", "ne-NP-HemkalaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), "ro-RO", "ro", "ro-RO-AlinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi-IN", "hi", "hi-IN-AaravNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kazakh_language), "kk-KZ", "kk", "kk-KZ-AigulNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_jkazakh_neh), "kk-KZ", "kk", "kk-KZ-AigulNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), "sv-SE", "sv", "sv-SE-SofieNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), "pl-PL", "pl", "pl-PL-AgnieszkaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), "sl-SI", "sl", "sl-SI-PetraNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_zulu), "zu-ZA", "zu", "zu-ZA-ThandoNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), "lo-LA", "lo", "lo-LA-KeomanyNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), "nb-NO", "nb", "nb-NO-PernilleNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr-FR", "fr", "fr-FR-DeniseNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt-PT", "pt", "pt-PT-RaquelNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_brazilian_portuguese), "pt-BR", "pt", "pt-BR-FranciscaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es-ES", "es", "es-ES-ElviraNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), "ur-IN", "ur", "ur-IN-GulNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_mongol), "mn-MN", X10i1i.O1O, "mn-MN-YesuiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), "mr-IN", "mr", "mr-IN-AarohiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), "ps-AF", "ps", "ps-AF-LatifaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa-IR", "fa", "fa-IR-DilaraNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), "da-DK", "da", "da-DK-ChristelNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), "id-ID", "id", "x2_IdId_Fira", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), "hu-HU", "hu", "hu-HU-NoemiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te-IN", "te", "te-IN-ShrutiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he-IL", "he", "he-IL-HilaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_island), "is-IS", "is", "is-IS-GudrunNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), "sk-SK", "sk", "sk-SK-ViktoriaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), "sr-RS", "sr-Latn", "sr-Latn-RS-NicholasNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), "ka-GE", "ka", "ka-GE-EkaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), "hr-HR", "hr", "hr-HR-GabrijelaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), "uz-UZ", "uz", "uz-UZ-MadinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms-MY", "ms", "ms-MY-YasminNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), "bg-BG", "bg", "bg-BG-KalinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil-PH", "fil", "fil-PH-BlessicaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta-IN", "ta", "ta-IN-PallaviNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr-TR", "tr", "tr-TR-EmelNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), "sw-KE", "sw", "sw-KE-ZuriNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl-NL", "nl", "nl-NL-FennaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), "fi-FI", "fi", "fi-FI-SelmaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), "ca-ES", DownloadCommon.DOWNLOAD_REPORT_CANCEL, "ca-ES-JoanaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), "az-AZ", "az", "az-AZ-BanuNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), "af-ZA", ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), "am-ET", "am", "am-ET-MekdesNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), "cs-CZ", "cs", "cs-CZ-VlastaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it-IT", "it", "it-IT-ElsaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th-TH", "th", "th-TH-PremwadeeNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), "hy-AM", "hy", "hy-AM-AnahitNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), "si-LK", "si", "si-LK-ThiliniNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn-IN", ScarConstants.BN_SIGNAL_KEY, "bn-IN-TanishaaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_burmese), "my-MM", "my", "my-MM-NilarNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), "uk-UA", "uk", "uk-UA-PolinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), "ml-IN", "ml", "ml-IN-SobhanaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), "lv-LV", "lv", "lv-LV-EveritaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), "lt-LT", "lt", "lt-LT-OnaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), "km-KH", "km", "km-KH-SreymomNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), "el-GR", "el", "el-GR-AthinaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_assamese), "as-IN", "as", "as-IN-YashicaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bosnian), "bs-BA", CmcdConfiguration.KEY_BUFFER_STARVATION, "bs-BA-VesnaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_welsh), "cy-GB", "cy", "cy-GB-NiaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_estonian), "et-EE", ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, "et-EE-AnuNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_basque), "eu-ES", "eu", "eu-ES-AinhoaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_irish), "ga-IE", "ga", "ga-IE-OrlaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_galician), "gl-ES", "gl", "gl-ES-SabelaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_gujarati), "gu-IN", "gu", "gu-IN-DhwaniNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_javanese), "jv-ID", "jv", "jv-ID-SitiNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kannada), "kn-IN", "kn", "kn-IN-SapnaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_macedonian), "mk-MK", "mk", "mk-MK-MarijaNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_maltese), "mt-MT", Q6.a1, "mt-MT-JosephNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_iriya), "or-IN", "or", "or-IN-SukantNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_punjabi), "pa-IN", "pa", "pa-IN-OjasNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_somali), "so-SO", "so", "so-SO-UbaxNeural", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_albanian), "sq-AL", "sq", "sq-AL-AnilaNeural", false, 0, null, 0, 240, null)}));
    }

    private static final void sparkChainLanguage() {
        languageList.addAll(CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData[]{new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-cn", "cn", "x4_lingxiaolu_en", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en_us", Languages.DEFAULT_LANGUAGE, "x4_enus_catherine_profnews", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-ru", "ru", "x2_ruru_keshu", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko_kr", "ko", "x2_kokr_miya", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de_DE", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "x2_dede_christiane", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja_jp", "ja", "x2_jajp_zhongcun", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi_VN", "vi", "x2_vivn_thuhien", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar_il", "ar", "x2_aren_rania", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), "ne_np", "ne", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), "ro_ro", "ro", "x2_roro_miruna", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi_in", "hi", "x2_hiin_mohita", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kazakh_language), "kk_KZ", "kk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_jkazakh_neh), "kk_cn", "kk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), "sv_SE", "sv", "x2_svse_michaela", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), "pl_pl", "pl", "x2_natali", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), "sl_si", "sl", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_zulu), "zu_za", "zu", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), "lo_LA", "lo", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), "nb_NO", "nb", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr_fr", "fr", "x2_mariane", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt_PT", "pt", "maria", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_brazilian_portuguese), "pt_BR", "pt", "sonia", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es_es", "es", "x2_spes_aurora", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), "ur_IN", "ur", "baili", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_mongol), "mn_MN", X10i1i.O1O, null, true, 0, null, 0, 232, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), "mr_in", "mr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), "ps_ar", "ps", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hausa), "ha_NG", "ha", "x2_hang_zainab", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa_IR", "fa", "x2_fair_saheli", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), "da_DK", "da", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), "id_ID", "id", "x2_IdId_Fira", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), "hu_hu", "hu", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te_in", "te", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he_il", "he", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_island), "is_IS", "is", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), "sk_sk", "sk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), "sr_RS", "sr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), "ka_ge", "ka", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), "hr_hr", "hr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), "uz_UZ", "uz", "x2_uzuz_nigina", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms_MY", "ms", "x2_msmy_hashim", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), "bg_bg", "bg", "x2_bgbg_zlati", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil_PH", "tl", "x2_tlph_grace", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta_in", "ta", "x2_tain_udaya", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr_TR", "tr", "x2_trtr_ersoy", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), "sw_KE", "sw", "x2_swtz_hamdan", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl_NL", "nl", "x2_nlnl_robin", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), "fi_fi", "fi", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), "ca_es", DownloadCommon.DOWNLOAD_REPORT_CANCEL, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), "az_AZ", "az", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), "af_za", ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), "am_et", "am", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), "cs_CZ", "cs", "x2_cscz_petra", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it_IT", "it", "x2_itit_anna", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th_TH", "th", "yingying", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tajik), "tg_tg", "tg", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), "hy_AM", "hy", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), "si_lk", "si", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn_BD", ScarConstants.BN_SIGNAL_KEY, "x2_bnbd_elmy", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_burmese), "my_mm", "my", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), "uk_UA", "uk", "x2_ukua_halyna", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), "ml_in", "ml", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), "lv_lv", "lv", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), "lt_LT", "lt", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkmen), "tm_tk", "tm", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), "km_KH", "km", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), "el_GR", "el", "x2_elgr_dimitra", false, 0, null, 0, 240, null)}));
    }

    public static final void main() {
        System.out.println("--- Basic Tests ---");
        System.out.println("'你好世界' is detected as: " + detectLanguage("你好世界"));
        System.out.println("'Hello World' is detected as: " + detectLanguage("Hello World"));
        System.out.println("'こんにちは、世界' is detected as: " + detectLanguage("こんにちは、世界"));
        System.out.println("'안녕하세요 세계' is detected as: " + detectLanguage("안녕하세요 세계"));
        System.out.println("'Привет, мир!' is detected as: " + detectLanguage("Привет, мир!"));
        System.out.println("'สวัสดีชาวโลก' is detected as: " + detectLanguage("สวัสดีชาวโลก"));
        System.out.println("'Bonjour le monde' is detected as: " + detectLanguage("Bonjour le monde"));
        System.out.println("'café au lait' is detected as: " + detectLanguage("café au lait"));
        System.out.println("'Hallo Welt' is detected as: " + detectLanguage("Hallo Welt"));
        System.out.println("'Straße des Glücks' is detected as: " + detectLanguage("Straße des Glücks"));
        System.out.println("'Hola Mundo' is detected as: " + detectLanguage("Hola Mundo"));
        System.out.println("'¿Qué tal?' is detected as: " + detectLanguage("¿Qué tal?"));
        System.out.println("'Olá Mundo' is detected as: " + detectLanguage("Olá Mundo"));
        System.out.println("'Xin chào thế giới' is detected as: " + detectLanguage("Xin chào thế giới"));
        System.out.println("\n--- Other Script Tests ---");
        System.out.println("'Γειά σου Κόσμε' is detected as: " + detectLanguage("Γειά σου Κόσμε"));
        System.out.println("'مرحبا بالعالم' is detected as: " + detectLanguage("مرحبا بالعالم"));
        System.out.println("'שלום עולם' is detected as: " + detectLanguage("שלום עולם"));
        System.out.println("'नमस्ते दुनिया' is detected as: " + detectLanguage("नमस्ते दुनिया"));
        System.out.println("'হ্যালো ওয়ার্ল্ড' is detected as: " + detectLanguage("হ্যালো ওয়ার্ল্ড"));
        System.out.println("'வணக்கம் உலகம்' is detected as: " + detectLanguage("வணக்கம் உலகம்"));
        System.out.println("'ሰላም ልዑል' is detected as: " + detectLanguage("ሰላም ልዑል"));
        System.out.println("'你好 Hello こんにちは' is detected as: " + detectLanguage("你好 Hello こんにちは"));
        System.out.println("'Merhaba Dünya' is detected as: " + detectLanguage("Merhaba Dünya"));
        System.out.println("'Ciao mondo è bello' is detected as: " + detectLanguage("Ciao mondo è bello"));
        System.out.println("'Witaj świecie' is detected as: " + detectLanguage("Witaj świecie"));
        System.out.println("'Hallo wereld met ëen' is detected as: " + detectLanguage("Hallo wereld met ëen"));
        System.out.println("\n--- Edge Cases ---");
        System.out.println("'' (Empty string) is detected as: " + detectLanguage(""));
        System.out.println("'12345 @#$%^' is detected as: " + detectLanguage("12345 @#$%^"));
        System.out.println("'你好123' is detected as: " + detectLanguage("你好123"));
    }
}
