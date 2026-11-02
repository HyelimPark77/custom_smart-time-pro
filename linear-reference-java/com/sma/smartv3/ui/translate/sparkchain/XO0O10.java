package com.sma.smartv3.ui.translate.sparkchain;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.Languages;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSparkChainConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainConfig.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n774#2:102\n865#2,2:103\n*S KotlinDebug\n*F\n+ 1 SparkChainConfig.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainConfig\n*L\n95#1:102\n95#1:103,2\n*E\n"})
public final class XO0O10 {

    @aa1
    public static final List<LanguageTranslationData> I0iXXO = null;

    @aa1
    public static final OXO1 IO = null;

    @aa1
    public static final List<LanguageTranslationData> OIX0iXi = null;
    public final int I0IIOi;
    public final boolean IiI10X;

    @aa1
    public final String O00;
    public boolean OIi0;

    @aa1
    public String OXO1;

    @aa1
    public String XIi00iiXO;
    public final int XO0O10;

    @aa1
    public String XOO0ii0;

    @aa1
    public String iO;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final XO0O10 OXO1() {
            String r1 = "cn";
            String r2 = Languages.DEFAULT_LANGUAGE;
            String r3 = null;
            int r4 = 0;
            String r5 = null;
            boolean r6 = false;
            String r7 = null;
            int r8 = 0;
            boolean r9 = false;
            return new XO0O10(r1, r2, r3, r4, r5, r6, r7, r8, r9, 508, null);
        }

        @aa1
        public final List<LanguageTranslationData> XIi00iiXO() {
            return XO0O10.OXO1();
        }

        @aa1
        public final List<LanguageTranslationData> iO() {
            return XO0O10.XIi00iiXO();
        }

        public OXO1() {
        }
    }

    static {
        IO = new OXO1(null);
        List<LanguageTranslationData> r0 = CollectionsKt__CollectionsKt.iXiX011(new LanguageTranslationData[]{new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), "zh-cn", "cn", "x4_lingxiaolu_en", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), "en_us", Languages.DEFAULT_LANGUAGE, "x4_enus_catherine_profnews", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), "ru-ru", "ru", "x2_ruru_keshu", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), "ko_kr", "ko", "x2_kokr_miya", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), "de_DE", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "x2_dede_christiane", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), "ja_jp", "ja", "x2_jajp_zhongcun", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), "vi_VN", "vi", "x2_vivn_thuhien", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), "ar_il", "ar", "x2_aren_rania", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), "ne_np", "ne", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), "ro_ro", "ro", "x2_roro_miruna", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), "hi_in", "hi", "x2_hiin_mohita", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_kazakh_language), "kk_KZ", "kk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_jkazakh_neh), "kk_cn", "kk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), "sv_SE", "sv", "x2_svse_michaela", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), "pl_pl", "pl", "x2_natali", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), "sl_si", "sl", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_zulu), "zu_za", "zu", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), "lo_LA", "lo", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), "nb_NO", "nb", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), "fr_fr", "fr", "x2_mariane", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), "pt_PT", "pt", "maria", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_brazilian_portuguese), "pt_BR", "pt", "sonia", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), "es_es", "es", "x2_spes_aurora", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), "ur_IN", "ur", "baili", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_mongol), "mn_MN", X10i1i.O1O, null, true, 0, null, 0, 232, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), "mr_in", "mr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), "ps_ar", "ps", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hausa), "ha_NG", "ha", "x2_hang_zainab", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_farsi), "fa_IR", "fa", "x2_fair_saheli", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), "da_DK", "da", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), "id_ID", "id", "x2_IdId_Fira", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), "hu_hu", "hu", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), "te_in", "te", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), "he_il", "he", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_island), "is_IS", "is", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), "sk_sk", "sk", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), "sr_RS", "sr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), "ka_ge", "ka", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), "hr_hr", "hr", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), "uz_UZ", "uz", "x2_uzuz_nigina", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), "ms_MY", "ms", "x2_msmy_hashim", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), "bg_bg", "bg", "x2_bgbg_zlati", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_filipino), "fil_PH", "tl", "x2_tlph_grace", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), "ta_in", "ta", "x2_tain_udaya", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), "tr_TR", "tr", "x2_trtr_ersoy", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), "sw_KE", "sw", "x2_swtz_hamdan", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), "nl_NL", "nl", "x2_nlnl_robin", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), "fi_fi", "fi", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), "ca_es", DownloadCommon.DOWNLOAD_REPORT_CANCEL, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), "az_AZ", "az", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), "af_za", ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), "am_et", "am", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), "cs_CZ", "cs", "x2_cscz_petra", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), "it_IT", "it", "x2_itit_anna", true, 0, null, 0, 224, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), "th_TH", "th", "yingying", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_tajik), "tg_tg", "tg", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), "hy_AM", "hy", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), "si_lk", "si", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), "bn_BD", ScarConstants.BN_SIGNAL_KEY, "x2_bnbd_elmy", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_burmese), "my_mm", "my", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), "uk_UA", "uk", "x2_ukua_halyna", false, 0, null, 0, 240, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), "ml_in", "ml", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), "lv_lv", "lv", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), "lt_LT", "lt", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkmen), "tm_tk", "tm", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), "km_KH", "km", null, false, 0, null, 0, 248, null), new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), "el_GR", "el", "x2_elgr_dimitra", false, 0, null, 0, 240, null)});
        OIX0iXi = r0;
        ArrayList r1 = new ArrayList();
        Iterator<T> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Object r3 = r2.next();
        if (((LanguageTranslationData) r3).isSupportTransfer() == false) goto L4;
        r1.add(r3);
        goto L4
    L8:
        I0iXXO = r1;
    }

    public XO0O10(@aa1 String r2, @aa1 String r3, @aa1 String r4, int r5, @aa1 String r6, boolean r7, @aa1 String r8, int r9, boolean r10) {
        Intrinsics.X0O(r2, Q6.q);
        Intrinsics.X0O(r3, "targetLang");
        Intrinsics.X0O(r4, "asrLang");
        Intrinsics.X0O(r6, "flag");
        Intrinsics.X0O(r8, "speaker");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = r4;
        this.XO0O10 = r5;
        this.O00 = r6;
        this.IiI10X = r7;
        this.XOO0ii0 = r8;
        this.I0IIOi = r9;
        this.OIi0 = r10;
    }

    public static final /* synthetic */ List OXO1() {
        return OIX0iXi;
    }

    public static final /* synthetic */ List XIi00iiXO() {
        return I0iXXO;
    }

    public static /* synthetic */ XO0O10 XXI(XO0O10 r0, String r1, String r2, String r3, int r4, String r5, boolean r6, String r7, int r8, boolean r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.OXO1;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.XIi00iiXO;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.iO;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.XO0O10;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.O00;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.IiI10X;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.XOO0ii0;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.I0IIOi;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.OIi0;
    L29:
        int r12 = r8;
        boolean r13 = r9;
        boolean r14 = r6;
        String r15 = r7;
        int r16 = r4;
        String r17 = r5;
        String r18 = r3;
        String r19 = r1;
        return r0.I0iXXO(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final boolean I0IIOi() {
        return this.IiI10X;
    }

    @aa1
    public final XO0O10 I0iXXO(@aa1 String r12, @aa1 String r13, @aa1 String r14, int r15, @aa1 String r16, boolean r17, @aa1 String r18, int r19, boolean r20) {
        Intrinsics.X0O(r12, Q6.q);
        Intrinsics.X0O(r13, "targetLang");
        Intrinsics.X0O(r14, "asrLang");
        Intrinsics.X0O(r16, "flag");
        Intrinsics.X0O(r18, "speaker");
        return new XO0O10(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public final void I1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XIi00iiXO = r2;
    }

    public final boolean I1XOi1() {
        return this.IiI10X;
    }

    public final int IIX1OXO() {
        return this.I0IIOi;
    }

    public final int IO() {
        return this.I0IIOi;
    }

    public final int IiI10X() {
        return this.XO0O10;
    }

    @aa1
    public final String O00() {
        return this.iO;
    }

    @aa1
    public final String O10IXXX0X() {
        return this.O00;
    }

    public final void OII(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.OXO1 = r2;
    }

    public final boolean OIX0iXi() {
        return this.OIi0;
    }

    @aa1
    public final String OIi0() {
        return this.XOO0ii0;
    }

    public final void OX(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XOO0ii0 = r2;
    }

    public final boolean OiIIX101O() {
        return this.OIi0;
    }

    @aa1
    public final String X0O() {
        return this.OXO1;
    }

    @aa1
    public final String X1ii() {
        return this.iO;
    }

    @aa1
    public final String XO0O10() {
        return this.XIi00iiXO;
    }

    @aa1
    public final String XOO0ii0() {
        return this.O00;
    }

    public final int XX0() {
        return this.XO0O10;
    }

    @aa1
    public final String XiOIO() {
        return this.XOO0ii0;
    }

    public final void XiOIii1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.iO = r2;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof XO0O10) == true) goto L8;
        return false;
    L8:
        XO0O10 r6 = (XO0O10) r5;
        if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.iO, r6.iO) == true) goto L18;
        return false;
    L18:
        if (this.XO0O10 == r6.XO0O10) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.O00, r6.O00) == true) goto L24;
        return false;
    L24:
        if (this.IiI10X == r6.IiI10X) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.XOO0ii0, r6.XOO0ii0) == true) goto L30;
        return false;
    L30:
        if (this.I0IIOi == r6.I0IIOi) goto L33;
        return false;
    L33:
        if (this.OIi0 == r6.OIi0) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + this.iO.hashCode()) * 31) + Integer.hashCode(this.XO0O10)) * 31) + this.O00.hashCode()) * 31) + Boolean.hashCode(this.IiI10X)) * 31) + this.XOO0ii0.hashCode()) * 31) + Integer.hashCode(this.I0IIOi)) * 31) + Boolean.hashCode(this.OIi0);
    }

    @aa1
    public final String iIiiO() {
        return this.XIi00iiXO;
    }

    @aa1
    public final String iO() {
        return this.OXO1;
    }

    public final void iOOX010X(boolean r1) {
        this.OIi0 = r1;
    }

    @aa1
    public String toString() {
        return "SparkChainConfig(lang=" + this.OXO1 + ", targetLang=" + this.XIi00iiXO + ", asrLang=" + this.iO + ", transStrategy=" + this.XO0O10 + ", flag=" + this.O00 + ", needTransfer=" + this.IiI10X + ", speaker=" + this.XOO0ii0 + ", silenceTime=" + this.I0IIOi + ", ttsAndPlay=" + this.OIi0 + I000IiI1O.iO.iO;
    }

    public /* synthetic */ XO0O10(String r11, String r12, String r13, int r14, String r15, boolean r16, String r17, int r18, boolean r19, int r20, DefaultConstructorMarker r21) {
        if ((r20 & 4) == 0) goto L5;
        r13 = "zh-cn";
    L5:
        String r3 = r13;
        if ((r20 & 8) == 0) goto L8;
        int r4 = 2;
    L10:
        if ((r20 & 16) == 0) goto L12;
        String r5 = "xdx";
    L14:
        if ((r20 & 32) != 0) goto L16;
        boolean r6 = r16;
    L24:
        if ((r20 & 64) == 0) goto L26;
        String r7 = "x4_enus_catherine_profnews";
    L28:
        if ((r20 & 128) == 0) goto L30;
        int r8 = 2000;
    L32:
        if ((r20 & 256) == 0) goto L34;
        boolean r9 = true;
    L35:
        this(r11, r12, r3, r4, r5, r6, r7, r8, r9);
        return;
    L34:
        r9 = r19;
        goto L35
    L30:
        r8 = r18;
        goto L32
    L26:
        r7 = r17;
        goto L28
    L16:
        if (Intrinsics.XOO0ii0(r11, "cn") == false) goto L18;
    L20:
        boolean r110 = false;
    L21:
        r6 = r110;
        goto L24
    L18:
        if (Intrinsics.XOO0ii0(r12, "cn") == true) goto L20;
        r110 = true;
        goto L21
    L12:
        r5 = r15;
        goto L14
    L8:
        r4 = r14;
        goto L10
    }
}
