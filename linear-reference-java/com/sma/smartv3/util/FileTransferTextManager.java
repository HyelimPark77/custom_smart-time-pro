package com.sma.smartv3.util;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iI1O1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.network.GetAIAudioToText;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.Languages;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FileTransferTextManager {

    @aa1
    public static final FileTransferTextManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = null;

    static {
        OXO1 = new FileTransferTextManager();
        XIi00iiXO = "FileTransferTextManager";
    }

    public FileTransferTextManager() {
    }

    public static final void IiI10X(long r0, long r2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(FileTransferTextManager r0, File r1, String r2, O1XIiIO r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.XO0O10(r1, r2, r3);
    }

    public static /* synthetic */ void OXO1(long r0, long r2) {
        IiI10X(r0, r2);
    }

    public static final /* synthetic */ String XIi00iiXO() {
        return XIi00iiXO;
    }

    public final void XO0O10(@aa1 File r8, @aa1 String r9, @tb1 final O1XIiIO<String> r10) {
        Intrinsics.X0O(r8, "file");
        Intrinsics.X0O(r9, "toLang");
        String r1 = AIManager.OXO1.XiOIii1(1);
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        String r3 = r2.getBaseUrl(GetAIAudioToText.URL_V2);
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " serviceIdentificationAudio -> " + r8 + "  toLang = " + r9 + " , model = " + r1 + " ,url:" + r3);
        AndroidNetworking.upload(r3).addHeaders(r2.getHeadersMap()).addQueryParameter("model", r1).addQueryParameter("toLang", r9).addMultipartFile("audioFile", r8).setTag("serviceIdentificationAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new iI1O1O()).getAsJSONObject(new FileTransferTextManager$serviceIdentificationAudio2Text$2(r10));
    }

    @aa1
    public final List<LanguageTranslationData> iO() {
        ArrayList r0 = new ArrayList();
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), null, Languages.DEFAULT_LANGUAGE, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), null, Languages.DEFAULT_LANGUAGE_ZH, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), null, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), null, "es", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), null, "ru", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), null, "ko", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), null, "fr", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), null, "ja", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), null, "pt", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), null, "tr", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), null, "pl", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), null, DownloadCommon.DOWNLOAD_REPORT_CANCEL, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), null, "nl", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), null, "ar", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), null, "sv", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), null, "it", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), null, "id", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), null, "hi", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), null, "fi", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), null, "vi", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), null, "he", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), null, "uk", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), null, "el", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), null, "ms", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), null, "cs", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), null, "ro", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), null, "da", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), null, "hu", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), null, "ta", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), null, "no", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), null, "th", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), null, "ur", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), null, "hr", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), null, "bg", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), null, "lt", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), null, "ml", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_welsh), null, "cy", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), null, "sk", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), null, "te", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), null, "lv", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), null, ScarConstants.BN_SIGNAL_KEY, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), null, "sr", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), null, "az", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), null, "sl", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_kannada), null, "kn", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_estonian), null, ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_macedonian), null, "mk", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_basque), null, "eu", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), null, "hy", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), null, "ne", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_bosnian), null, CmcdConfiguration.KEY_BUFFER_STARVATION, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_albanian), null, "sq", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), null, "sw", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_galician), null, "gl", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), null, "mr", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_punjabi), null, "pa", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), null, "si", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), null, "km", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_somali), null, "so", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), null, ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), null, "ka", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_tajik), null, "tg", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_gujarati), null, "gu", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), null, "am", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), null, "lo", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), null, "uz", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), null, "ps", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkmen), null, "tk", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_maltese), null, Q6.a1, null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_assamese), null, "as", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hausa), null, "ha", null, false, 0, null, 0, 250, null));
        r0.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_javanese), null, "jw", null, false, 0, null, 0, 250, null));
        return r0;
    }
}
