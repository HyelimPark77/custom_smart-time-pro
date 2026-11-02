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
import kotlin.TuplesKt;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Languages {
    public static final int DEFAULT_CODE = 1;
    public static final int INVALID_CODE = 31;

    @aa1
    public static final Languages INSTANCE = new Languages();

    @aa1
    public static final String DEFAULT_LANGUAGE_ZH = "zh";

    @aa1
    public static final String DEFAULT_LANGUAGE = "en";

    @aa1
    private static final Map<String, Integer> LANGUAGES = OXO1.X11I(TuplesKt.OXO1(DEFAULT_LANGUAGE_ZH, 0), TuplesKt.OXO1(DEFAULT_LANGUAGE, 1), TuplesKt.OXO1("tr", 2), TuplesKt.OXO1("ru", 4), TuplesKt.OXO1("es", 5), TuplesKt.OXO1("it", 6), TuplesKt.OXO1("ko", 7), TuplesKt.OXO1("pt", 8), TuplesKt.OXO1(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, 9), TuplesKt.OXO1("fr", 10), TuplesKt.OXO1("nl", 11), TuplesKt.OXO1("pl", 12), TuplesKt.OXO1("cs", 13), TuplesKt.OXO1("hu", 14), TuplesKt.OXO1("sk", 15), TuplesKt.OXO1("ja", 16), TuplesKt.OXO1("da", 17), TuplesKt.OXO1("fi", 18), TuplesKt.OXO1("no", 19), TuplesKt.OXO1("sv", 20), TuplesKt.OXO1("sr", 21), TuplesKt.OXO1("th", 22), TuplesKt.OXO1("hi", 23), TuplesKt.OXO1("el", 24), TuplesKt.OXO1("Hant", 25), TuplesKt.OXO1("lt", 26), TuplesKt.OXO1("vi", 27), TuplesKt.OXO1("ar", 28), TuplesKt.OXO1("in", 29), TuplesKt.OXO1("uk", 30), TuplesKt.OXO1("iw", 32), TuplesKt.OXO1(ScarConstants.BN_SIGNAL_KEY, 33), TuplesKt.OXO1(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, 34), TuplesKt.OXO1("sl", 35), TuplesKt.OXO1("fa", 36), TuplesKt.OXO1("ro", 37), TuplesKt.OXO1("bg", 38), TuplesKt.OXO1("hr", 39), TuplesKt.OXO1("ur", 40), TuplesKt.OXO1("ms", 41), TuplesKt.OXO1("jv", 48), TuplesKt.OXO1("mr", 49), TuplesKt.OXO1("lv", 50), TuplesKt.OXO1("la", 51), TuplesKt.OXO1(UserDataStore.PHONE, 52), TuplesKt.OXO1(DateFormatUtils.MIN, 53), TuplesKt.OXO1("ta", 54), TuplesKt.OXO1("te", 55), TuplesKt.OXO1("kn", 56), TuplesKt.OXO1("ne", 57), TuplesKt.OXO1("lo", 64), TuplesKt.OXO1("km", 65), TuplesKt.OXO1(CmcdConfiguration.KEY_BUFFER_STARVATION, 66), TuplesKt.OXO1("uz", 67), TuplesKt.OXO1("az", 68), TuplesKt.OXO1("ku", 69), TuplesKt.OXO1("kk", 70), TuplesKt.OXO1("sw", 71), TuplesKt.OXO1("ka", 72), TuplesKt.OXO1("zu", 73), TuplesKt.OXO1("pt_BR", 80), TuplesKt.OXO1(X10i1i.O1O, 81), TuplesKt.OXO1("ps", 82), TuplesKt.OXO1("ha", 83), TuplesKt.OXO1("is", 84), TuplesKt.OXO1("kk_cn", 85), TuplesKt.OXO1(DownloadCommon.DOWNLOAD_REPORT_CANCEL, 86), TuplesKt.OXO1(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, 87), TuplesKt.OXO1("am", 88), TuplesKt.OXO1("tg", 89), TuplesKt.OXO1("hy", 96), TuplesKt.OXO1("si", 97), TuplesKt.OXO1("mi", 98), TuplesKt.OXO1("tm", 99));

    private Languages() {
    }

    public static /* synthetic */ Locale codeToLanguage$default(Languages languages, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = DEFAULT_LANGUAGE;
        }
        return languages.codeToLanguage(i, str);
    }

    public static /* synthetic */ String formatAISparkTargetLang$default(Languages languages, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = DEFAULT_LANGUAGE;
        }
        return languages.formatAISparkTargetLang(i, str);
    }

    public static /* synthetic */ String formatMicrosoftTargetLang$default(Languages languages, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = DEFAULT_LANGUAGE;
        }
        return languages.formatMicrosoftTargetLang(i, str);
    }

    public static /* synthetic */ int languageToCode$default(Languages languages, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = Locale.getDefault().getLanguage();
            Intrinsics.O10IXXX0X(str, "getLanguage(...)");
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return languages.languageToCode(str, i);
    }

    @tb1
    public final Locale codeToLanguage(int i, @aa1 String str) {
        String key;
        Map.Entry<String, Integer> next;
        Intrinsics.X0O(str, "default");
        Iterator<Map.Entry<String, Integer>> it = LANGUAGES.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                key = null;
                break;
            }
            next = it.next();
            key = next.getKey();
        } while (next.getValue().intValue() != i);
        if (key != null) {
            str = key;
        }
        if (Intrinsics.XOO0ii0(str, "Hant")) {
            return new Locale.Builder().setLanguage(DEFAULT_LANGUAGE_ZH).setScript("Hant").build();
        }
        return Intrinsics.XOO0ii0(str, DEFAULT_LANGUAGE_ZH) ? new Locale.Builder().setLanguage(DEFAULT_LANGUAGE_ZH).setScript("Hans").build() : new Locale(str);
    }

    @aa1
    public final String formatAISparkTargetLang(int i, @aa1 String str) {
        String key;
        Map.Entry<String, Integer> next;
        Intrinsics.X0O(str, "default");
        Iterator<Map.Entry<String, Integer>> it = LANGUAGES.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                key = null;
                break;
            }
            next = it.next();
            key = next.getKey();
        } while (next.getValue().intValue() != i);
        if (key != null) {
            str = key;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 3365) {
            if (iHashCode != 3374) {
                if (iHashCode != 3484) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3521) {
                            if (iHashCode != 3576) {
                                if (iHashCode != 3886) {
                                    if (iHashCode != 93667967) {
                                        if (iHashCode != 102098858) {
                                            if (iHashCode == 106983531 && str.equals("pt_BR")) {
                                                return "pt";
                                            }
                                        } else if (str.equals("kk_cn")) {
                                            return "kk";
                                        }
                                    } else if (str.equals("bg_bg")) {
                                        return "bg";
                                    }
                                } else if (str.equals(DEFAULT_LANGUAGE_ZH)) {
                                    return "cn";
                                }
                            } else if (str.equals(UserDataStore.PHONE)) {
                                return "tl";
                            }
                        } else if (str.equals("no")) {
                            return "nb";
                        }
                    } else if (str.equals(DateFormatUtils.MIN)) {
                        return "my";
                    }
                } else if (str.equals("mi")) {
                    return "ml";
                }
            } else if (str.equals("iw")) {
                return "he";
            }
        } else if (str.equals("in")) {
            return "id";
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x00be A[RETURN] */
    @aa1
    public final String formatMicrosoftTargetLang(int i, @aa1 String str) {
        String key;
        Map.Entry<String, Integer> next;
        Intrinsics.X0O(str, "default");
        Iterator<Map.Entry<String, Integer>> it = LANGUAGES.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                key = null;
                break;
            }
            next = it.next();
            key = next.getKey();
        } while (next.getValue().intValue() != i);
        if (key != null) {
            str = key;
        }
        switch (str) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "mi":
                return "ml";
            case "mm":
                return "my";
            case "no":
                return "nb";
            case "ph":
                return "fil";
            case "sr":
                return "sr-Latn";
            case "zh":
                return "zh-Hans";
            case "bg_bg":
                return "bg";
            case "kk_cn":
                return "kk";
            case "pt_BR":
                return "pt";
            default:
                return str;
        }
    }

    public final int languageBriefToCode(@aa1 String language, int i) {
        Intrinsics.X0O(language, "language");
        for (Map.Entry<String, Integer> entry : LANGUAGES.entrySet()) {
            String key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            if (Intrinsics.XOO0ii0(key, language)) {
                return iIntValue;
            }
        }
        return i;
    }

    public final int languageToCode(@aa1 String language, int i) {
        Intrinsics.X0O(language, "language");
        if (Intrinsics.XOO0ii0(DEFAULT_LANGUAGE_ZH, language)) {
            if (Intrinsics.XOO0ii0("Hant", Locale.getDefault().getScript())) {
                language = "Hant";
            } else {
                String country = Locale.getDefault().getCountry();
                if (country != null) {
                    if ((r2 = country.hashCode()) != 2339) {
                    }
                }
            }
        } else if (Intrinsics.XOO0ii0("id", language)) {
            language = "in";
        }
        Integer num = LANGUAGES.get(language);
        if (num != null) {
            i = num.intValue();
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        StringBuilder sb = new StringBuilder();
        sb.append("Languages languageToCode -> language=");
        sb.append(language);
        sb.append(", code=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        i1o0oxo1o.IiI10X(sb.toString());
        return i;
    }
}
