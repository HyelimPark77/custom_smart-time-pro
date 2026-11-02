package com.szabh.smable3.entity;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.appevents.UserDataStore;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Languages {
    public static final int DEFAULT_CODE = 1;

    @aa1
    public static final String DEFAULT_LANGUAGE = "en";

    @aa1
    public static final String DEFAULT_LANGUAGE_ZH = "zh";

    @aa1
    public static final Languages INSTANCE = null;
    public static final int INVALID_CODE = 31;

    @aa1
    private static final Map<String, Integer> LANGUAGES = null;

    static {
        INSTANCE = new Languages();
        LANGUAGES = OXO1.X11I(new Pair[]{TuplesKt.OXO1(DEFAULT_LANGUAGE_ZH, 0), TuplesKt.OXO1(DEFAULT_LANGUAGE, 1), TuplesKt.OXO1("tr", 2), TuplesKt.OXO1("ru", 4), TuplesKt.OXO1("es", 5), TuplesKt.OXO1("it", 6), TuplesKt.OXO1("ko", 7), TuplesKt.OXO1("pt", 8), TuplesKt.OXO1(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, 9), TuplesKt.OXO1("fr", 10), TuplesKt.OXO1("nl", 11), TuplesKt.OXO1("pl", 12), TuplesKt.OXO1("cs", 13), TuplesKt.OXO1("hu", 14), TuplesKt.OXO1("sk", 15), TuplesKt.OXO1("ja", 16), TuplesKt.OXO1("da", 17), TuplesKt.OXO1("fi", 18), TuplesKt.OXO1("no", 19), TuplesKt.OXO1("sv", 20), TuplesKt.OXO1("sr", 21), TuplesKt.OXO1("th", 22), TuplesKt.OXO1("hi", 23), TuplesKt.OXO1("el", 24), TuplesKt.OXO1("Hant", 25), TuplesKt.OXO1("lt", 26), TuplesKt.OXO1("vi", 27), TuplesKt.OXO1("ar", 28), TuplesKt.OXO1("in", 29), TuplesKt.OXO1("uk", 30), TuplesKt.OXO1("iw", 32), TuplesKt.OXO1(ScarConstants.BN_SIGNAL_KEY, 33), TuplesKt.OXO1(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, 34), TuplesKt.OXO1("sl", 35), TuplesKt.OXO1("fa", 36), TuplesKt.OXO1("ro", 37), TuplesKt.OXO1("bg", 38), TuplesKt.OXO1("hr", 39), TuplesKt.OXO1("ur", 40), TuplesKt.OXO1("ms", 41), TuplesKt.OXO1("jv", 48), TuplesKt.OXO1("mr", 49), TuplesKt.OXO1("lv", 50), TuplesKt.OXO1("la", 51), TuplesKt.OXO1(UserDataStore.PHONE, 52), TuplesKt.OXO1(DateFormatUtils.MIN, 53), TuplesKt.OXO1("ta", 54), TuplesKt.OXO1("te", 55), TuplesKt.OXO1("kn", 56), TuplesKt.OXO1("ne", 57), TuplesKt.OXO1("lo", 64), TuplesKt.OXO1("km", 65), TuplesKt.OXO1(CmcdConfiguration.KEY_BUFFER_STARVATION, 66), TuplesKt.OXO1("uz", 67), TuplesKt.OXO1("az", 68), TuplesKt.OXO1("ku", 69), TuplesKt.OXO1("kk", 70), TuplesKt.OXO1("sw", 71), TuplesKt.OXO1("ka", 72), TuplesKt.OXO1("zu", 73), TuplesKt.OXO1("pt_BR", 80), TuplesKt.OXO1(X10i1i.O1O, 81), TuplesKt.OXO1("ps", 82), TuplesKt.OXO1("ha", 83), TuplesKt.OXO1("is", 84), TuplesKt.OXO1("kk_cn", 85), TuplesKt.OXO1(DownloadCommon.DOWNLOAD_REPORT_CANCEL, 86), TuplesKt.OXO1(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, 87), TuplesKt.OXO1("am", 88), TuplesKt.OXO1("tg", 89), TuplesKt.OXO1("hy", 96), TuplesKt.OXO1("si", 97), TuplesKt.OXO1("mi", 98), TuplesKt.OXO1("tm", 99)});
    }

    private Languages() {
    }

    public static /* synthetic */ Locale codeToLanguage$default(Languages r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = DEFAULT_LANGUAGE;
    L6:
        return r0.codeToLanguage(r1, r2);
    }

    public static /* synthetic */ String formatAISparkTargetLang$default(Languages r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = DEFAULT_LANGUAGE;
    L6:
        return r0.formatAISparkTargetLang(r1, r2);
    }

    public static /* synthetic */ String formatMicrosoftTargetLang$default(Languages r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = DEFAULT_LANGUAGE;
    L6:
        return r0.formatMicrosoftTargetLang(r1, r2);
    }

    public static /* synthetic */ int languageToCode$default(Languages r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Locale.getDefault().getLanguage();
        Intrinsics.O10IXXX0X(r1, "getLanguage(...)");
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = 1;
    L9:
        return r0.languageToCode(r1, r2);
    }

    @tb1
    public final Locale codeToLanguage(int r4, @aa1 String r5) {
        Intrinsics.X0O(r5, "default");
        Iterator<Map.Entry<String, Integer>> r0 = LANGUAGES.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Map.Entry<String, Integer> r1 = r0.next();
        String r2 = r1.getKey();
        if (r1.getValue().intValue() != r4) goto L4;
    L9:
        if (r2 == null) goto L13;
        r5 = r2;
    L13:
        if (Intrinsics.XOO0ii0(r5, "Hant") == false) goto L17;
        return new Locale.Builder().setLanguage(DEFAULT_LANGUAGE_ZH).setScript("Hant").build();
    L17:
        if (Intrinsics.XOO0ii0(r5, DEFAULT_LANGUAGE_ZH) == false) goto L21;
        return new Locale.Builder().setLanguage(DEFAULT_LANGUAGE_ZH).setScript("Hans").build();
    L21:
        return new Locale(r5);
    L8:
        r2 = null;
        goto L9
    }

    @aa1
    public final String formatAISparkTargetLang(int r4, @aa1 String r5) {
        Intrinsics.X0O(r5, "default");
        Iterator<Map.Entry<String, Integer>> r0 = LANGUAGES.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Map.Entry<String, Integer> r1 = r0.next();
        String r2 = r1.getKey();
        if (r1.getValue().intValue() != r4) goto L4;
    L9:
        if (r2 == null) goto L12;
        r5 = r2;
    L12:
        int r6 = r5.hashCode();
        if (r6 == 3365) goto L79;
        if (r6 == 3374) goto L74;
        if (r6 == 3484) goto L69;
        if (r6 == 3488) goto L64;
        if (r6 == 3521) goto L59;
        if (r6 == 3576) goto L54;
        if (r6 == 3886) goto L49;
        if (r6 == 93667967) goto L44;
        if (r6 == 102098858) goto L39;
        if (r6 == 106983531) goto L34;
    L80:
        return r5;
    L34:
        if (r5.equals("pt_BR") == false) goto L80;
        return "pt";
    L39:
        if (r5.equals("kk_cn") == false) goto L80;
        return "kk";
    L44:
        if (r5.equals("bg_bg") == false) goto L80;
        return "bg";
    L49:
        if (r5.equals(DEFAULT_LANGUAGE_ZH) == false) goto L80;
        return "cn";
    L54:
        if (r5.equals(UserDataStore.PHONE) == false) goto L80;
        return "tl";
    L59:
        if (r5.equals("no") == false) goto L80;
        return "nb";
    L64:
        if (r5.equals(DateFormatUtils.MIN) == false) goto L80;
        return "my";
    L69:
        if (r5.equals("mi") == false) goto L80;
        return "ml";
    L74:
        if (r5.equals("iw") == false) goto L80;
        return "he";
    L79:
        if (r5.equals("in") == false) goto L80;
        return "id";
    L8:
        r2 = null;
        goto L9
    }

    @aa1
    public final String formatMicrosoftTargetLang(int r4, @aa1 String r5) {
        Intrinsics.X0O(r5, "default");
        Iterator<Map.Entry<String, Integer>> r0 = LANGUAGES.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Map.Entry<String, Integer> r1 = r0.next();
        String r2 = r1.getKey();
        if (r1.getValue().intValue() != r4) goto L4;
    L9:
        if (r2 == null) goto L13;
        r5 = r2;
    L13:
        switch(r5.hashCode()) {
            case 3365: goto L66;
            case 3374: goto L61;
            case 3484: goto L56;
            case 3488: goto L51;
            case 3521: goto L46;
            case 3576: goto L41;
            case 3679: goto L36;
            case 3886: goto L31;
            case 93667967: goto L26;
            case 102098858: goto L21;
            case 106983531: goto L16;
            default: goto L67;
        };
    L67:
        return r5;
    L16:
        if (r5.equals("pt_BR") == false) goto L67;
        return "pt";
    L21:
        if (r5.equals("kk_cn") == false) goto L67;
        return "kk";
    L26:
        if (r5.equals("bg_bg") == false) goto L67;
        return "bg";
    L31:
        if (r5.equals(DEFAULT_LANGUAGE_ZH) == false) goto L67;
        return "zh-Hans";
    L36:
        if (r5.equals("sr") == false) goto L67;
        return "sr-Latn";
    L41:
        if (r5.equals(UserDataStore.PHONE) == false) goto L67;
        return "fil";
    L46:
        if (r5.equals("no") == false) goto L67;
        return "nb";
    L51:
        if (r5.equals(DateFormatUtils.MIN) == false) goto L67;
        return "my";
    L56:
        if (r5.equals("mi") == false) goto L67;
        return "ml";
    L61:
        if (r5.equals("iw") == false) goto L67;
        return "he";
    L66:
        if (r5.equals("in") == false) goto L67;
        return "id";
    L8:
        r2 = null;
        goto L9
    }

    public final int languageBriefToCode(@aa1 String r4, int r5) {
        Intrinsics.X0O(r4, "language");
        Iterator<Map.Entry<String, Integer>> r0 = LANGUAGES.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Map.Entry<String, Integer> r1 = r0.next();
        String r2 = r1.getKey();
        int r3 = r1.getValue().intValue();
        if (Intrinsics.XOO0ii0(r2, r4) == false) goto L4;
        return r3;
    L8:
        return r5;
    }

    public final int languageToCode(@aa1 String r5, int r6) {
        Intrinsics.X0O(r5, "language");
        if (Intrinsics.XOO0ii0(DEFAULT_LANGUAGE_ZH, r5) == false) goto L26;
        if (Intrinsics.XOO0ii0("Hant", Locale.getDefault().getScript()) == false) goto L7;
    L6:
        r5 = "Hant";
    L28:
        Integer r0 = LANGUAGES.get(r5);
        if (r0 == null) goto L31;
        r6 = r0.intValue();
    L31:
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        StringBuilder r2 = new StringBuilder();
        r2.append("Languages languageToCode -> language=");
        r2.append(r5);
        r2.append(", code=");
        StringCompanionObject r7 = StringCompanionObject.OXO1;
        String r8 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(r6)}, 1));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        r2.append(r8);
        r1.IiI10X(r2.toString());
        return r6;
    L7:
        String r3 = Locale.getDefault().getCountry();
        if (r3 == null) goto L28;
        int r4 = r3.hashCode();
        if (r4 == 2339) goto L23;
        if (r4 == 2466) goto L20;
        if (r4 != 2691) goto L28;
        if (r3.equals("TW") == true) goto L6;
    L20:
        if (r3.equals("MO") == true) goto L6;
    L23:
        if (r3.equals("Hk") == false) goto L28;
    L26:
        if (Intrinsics.XOO0ii0("id", r5) == false) goto L28;
        r5 = "in";
        goto L28
    }
}
