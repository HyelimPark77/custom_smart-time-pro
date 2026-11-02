package com.sma.smartv3.util;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.UploadProgressListener;
import com.ironsource.C12101Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.p605ai.AIBase;
import com.sma.smartv3.biz.p605ai.AIError;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.network.GetAIAudioToText;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.FileTransferTextManager;
import com.szabh.smable3.entity.Languages;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class FileTransferTextManager {

    @aa1
    public static final FileTransferTextManager OXO1 = new FileTransferTextManager();

    @aa1
    public static final String XIi00iiXO = "FileTransferTextManager";

    public static final void IiI10X(long j, long j2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(FileTransferTextManager fileTransferTextManager, File file, String str, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 4) != 0) {
            o1XIiIO = null;
        }
        fileTransferTextManager.XO0O10(file, str, o1XIiIO);
    }

    public final void XO0O10(@aa1 File file, @aa1 String toLang, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(file, "file");
        Intrinsics.X0O(toLang, "toLang");
        String strXiOIii1 = AIManager.OXO1.XiOIii1(1);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String baseUrl = netWorkUtils.getBaseUrl(GetAIAudioToText.URL_V2);
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " serviceIdentificationAudio -> " + file + "  toLang = " + toLang + " , model = " + strXiOIii1 + " ,url:" + baseUrl);
        AndroidNetworking.upload(baseUrl).addHeaders(netWorkUtils.getHeadersMap()).addQueryParameter("model", strXiOIii1).addQueryParameter("toLang", toLang).addMultipartFile("audioFile", file).setTag((Object) "serviceIdentificationAudio").setPriority(Priority.HIGH).build().setUploadProgressListener(new UploadProgressListener() { // from class: com.android.mltcode.paycertificationapi.iI1O1O
            @Override // com.androidnetworking.interfaces.UploadProgressListener
            public final void onProgress(long j, long j2) {
                FileTransferTextManager.IiI10X(j, j2);
            }
        }).getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.util.FileTransferTextManager$serviceIdentificationAudio2Text$2
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError anError) {
                AIError aIError;
                Intrinsics.X0O(anError, "anError");
                AIBase aIBase = (AIBase) anError.getErrorAsObject(AIBase.class);
                if (aIBase == null || (aIError = aIBase.getError()) == null) {
                    aIError = new AIError(String.valueOf(anError.getMessage()), null, null, null, 14, null);
                }
                i1O0OXO1O.OXO1.OXO1(FileTransferTextManager.XIi00iiXO + "  serviceIdentificationAudio onError -> " + anError.getErrorBody() + ", " + aIError);
                O1XIiIO<String> o1XIiIO2 = o1XIiIO;
                if (o1XIiIO2 != null) {
                    o1XIiIO2.handleError(aIError.getMessage());
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                O1XIiIO<String> o1XIiIO2;
                i1O0OXO1O.OXO1.OXO1(FileTransferTextManager.XIi00iiXO + " serviceIdentificationAudio onResponse -> " + jSONObject);
                if (jSONObject != null) {
                    try {
                        String string = jSONObject.getString("data");
                        if (string == null || (o1XIiIO2 = o1XIiIO) == null) {
                            return;
                        }
                        o1XIiIO2.handleResponse(string);
                    } catch (Exception unused) {
                        AIError aIError = new AIError(UtilsKt.XXO(R.string.voice_assistant_common_error), null, null, null, 14, null);
                        O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                        if (o1XIiIO3 != null) {
                            o1XIiIO3.handleError(aIError.getMessage());
                        }
                    }
                }
            }
        });
    }

    @aa1
    /* JADX INFO: renamed from: iO */
    public final List<LanguageTranslationData> m38807iO() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_english), null, Languages.DEFAULT_LANGUAGE, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_chinese), null, Languages.DEFAULT_LANGUAGE_ZH, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_german), null, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_spanish), null, "es", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_russian), null, "ru", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_korean), null, "ko", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_french), null, "fr", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_japanese), null, "ja", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_portuguese), null, "pt", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkish), null, "tr", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_polish), null, "pl", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_catalan), null, DownloadCommon.DOWNLOAD_REPORT_CANCEL, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_dutch), null, "nl", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_arabic), null, "ar", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_swedish_language), null, "sv", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_italian), null, "it", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_indonesian), null, "id", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hindi), null, "hi", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_finnish), null, "fi", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_vietnamese), null, "vi", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hebrew), null, "he", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_ukrainian), null, "uk", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_greek), null, "el", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_malay), null, "ms", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_czech), null, "cs", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_romanian), null, "ro", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_danish), null, "da", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hungarian), null, "hu", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_tamil), null, "ta", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_norwegian_language), null, "no", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_thai), null, "th", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_urdu), null, "ur", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_croatian), null, "hr", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_bulgarian), null, "bg", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_lithuanian), null, "lt", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_malayalam), null, "ml", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_welsh), null, "cy", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovakia), null, "sk", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_telugu), null, "te", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_latvian), null, "lv", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_bengali), null, ScarConstants.BN_SIGNAL_KEY, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_serbian), null, "sr", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_azerbaijani), null, "az", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_slovenian), null, "sl", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_kannada), null, "kn", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_estonian), null, ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_macedonian), null, "mk", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_basque), null, "eu", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_armenian), null, "hy", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_nepali), null, "ne", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_bosnian), null, CmcdConfiguration.KEY_BUFFER_STARVATION, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_albanian), null, "sq", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_swahili), null, "sw", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_galician), null, "gl", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_marathi), null, "mr", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_punjabi), null, "pa", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_sinhala), null, "si", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_khmer), null, "km", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_somali), null, "so", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_afrikaans), null, ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_georgian), null, "ka", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_tajik), null, "tg", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_gujarati), null, "gu", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_amharic), null, "am", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_lao), null, "lo", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_uzbek), null, "uz", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_pashto), null, "ps", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_turkmen), null, "tk", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_maltese), null, C12101Q6.f29914a1, null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_assamese), null, "as", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_hausa), null, "ha", null, false, 0, null, 0, 250, null));
        arrayList.add(new LanguageTranslationData(UtilsKt.XXO(R.string.language_javanese), null, "jw", null, false, 0, null, 0, 250, null));
        return arrayList;
    }
}
