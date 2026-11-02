package com.sma.smartv3.biz.voice.p245v2;

import android.app.Application;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.p245v2.AITranslationManager;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.Languages;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAITranslationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITranslationManager.kt\ncom/sma/smartv3/biz/voice/v2/AITranslationManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class AITranslationManager {

    @aa1
    private static final String TAG = "AIManager AITranslationManager";
    private static Application mApp;

    @tb1
    private static LanguageTranslationData mLanguageTranslationData;

    @tb1
    private static LanguageTranslationData mToLanguageTranslationData;

    @aa1
    public static final AITranslationManager INSTANCE = new AITranslationManager();
    private static int mLanguage = -1;
    private static int mToLanguage = -1;

    private AITranslationManager() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:1: B:31:0x0095->B:43:?, LOOP_END, SYNTHETIC] */
    private final void getTranslationLanguageType(BleRecordPacket bleRecordPacket) {
        String aISparkTargetLang;
        String aISparkTargetLang2;
        Iterator<T> it;
        Object next;
        mLanguage = bleRecordPacket.getMLanguage();
        mToLanguage = bleRecordPacket.getMToLanguage();
        Application application = mApp;
        Object obj = null;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        String str = UtilsKt.IXI(application) ? Languages.DEFAULT_LANGUAGE_ZH : Languages.DEFAULT_LANGUAGE;
        Application application2 = mApp;
        if (application2 == null) {
            Intrinsics.XXO("mApp");
            application2 = null;
        }
        String str2 = UtilsKt.IXI(application2) ? Languages.DEFAULT_LANGUAGE : Languages.DEFAULT_LANGUAGE_ZH;
        q62 q62Var = q62.OXO1;
        if (!q62Var.X11I()) {
            if (q62Var.OIXOOi()) {
                Languages languages = Languages.INSTANCE;
                aISparkTargetLang = languages.formatAISparkTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
                aISparkTargetLang2 = languages.formatAISparkTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
            }
            it = LanguageTranslationKt.getTranslationLanguageList().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), str));
            mLanguageTranslationData = (LanguageTranslationData) next;
            for (Object obj2 : LanguageTranslationKt.getTranslationLanguageList()) {
                if (Intrinsics.XOO0ii0(((LanguageTranslationData) obj2).getRtasrLanguage(), str2)) {
                    obj = obj2;
                    break;
                }
            }
            mToLanguageTranslationData = (LanguageTranslationData) obj;
        }
        Languages languages2 = Languages.INSTANCE;
        aISparkTargetLang = languages2.formatMicrosoftTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        aISparkTargetLang2 = languages2.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
        String str3 = aISparkTargetLang;
        str2 = aISparkTargetLang2;
        str = str3;
        it = LanguageTranslationKt.getTranslationLanguageList().iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), str));
        mLanguageTranslationData = (LanguageTranslationData) next;
        while (r8.hasNext()) {
            if (Intrinsics.XOO0ii0(((LanguageTranslationData) obj2).getRtasrLanguage(), str2)) {
                obj = obj2;
                break;
            }
        }
        mToLanguageTranslationData = (LanguageTranslationData) obj;
    }

    public static /* synthetic */ void textTranslation$default(AITranslationManager aITranslationManager, String str, AIModelManagerV2.OnAIModelCallback onAIModelCallback, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        aITranslationManager.textTranslation(str, onAIModelCallback, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit textTranslation$lambda$0(AIModelManagerV2.OnAIModelCallback onAIModelCallback, String it) {
        Intrinsics.X0O(it, "it");
        DcsTtsPlayer.INSTANCE.stop();
        VoiceManagerV2.INSTANCE.sendTranslationResultOutput(it);
        onAIModelCallback.onComplete(it);
        MicrosoftSDKManage.O1O.OXO1().XXIIO1i11(it, INSTANCE.getToLanguageTranslationData().getTtsViuceName());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void translateITS(String str, String str2, final String str3, final AIModelManagerV2.OnAIModelCallback onAIModelCallback) {
        i1O0OXO1O.OXO1.OXO1("AIManager AITranslationManager  translateITS leftLang = " + str2 + " , rightLang = " + str3);
        AISparkChainManager.OXO1.IX1XiI(str, str2, str3, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.v2.AITranslationManager.translateITS.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                onAIModelCallback.onAIModelError(UtilsKt.XXO(R.string.voice_assistant_common_error));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str4) {
                if (str4 == null || str4.length() <= 0) {
                    onAIModelCallback.onAIModelError(UtilsKt.XXO(R.string.voice_assistant_common_error));
                    return;
                }
                onAIModelCallback.onComplete(str4);
                VoiceManagerV2.sendTranslationResult$default(VoiceManagerV2.INSTANCE, null, str4, 1, null);
                DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                dcsTtsPlayer.initSegmentation();
                DcsTtsPlayer.play$default(dcsTtsPlayer, str4, true, false, null, LanguageTranslationKt.getTranslationLanguageTtsName(str3), "translateITS", 12, null);
            }
        });
    }

    public static /* synthetic */ void translateITS$default(AITranslationManager aITranslationManager, String str, String str2, String str3, AIModelManagerV2.OnAIModelCallback onAIModelCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "cn";
        }
        if ((i & 4) != 0) {
            str3 = Languages.DEFAULT_LANGUAGE;
        }
        aITranslationManager.translateITS(str, str2, str3, onAIModelCallback);
    }

    @aa1
    public final LanguageTranslationData getLanguageTranslationData() {
        Object next;
        List<LanguageTranslationData> translationLanguageList;
        int i;
        LanguageTranslationData languageTranslationData = mLanguageTranslationData;
        if (languageTranslationData != null) {
            Intrinsics.XXI(languageTranslationData);
            return languageTranslationData;
        }
        Application application = mApp;
        Application application2 = null;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        String language = application.getResources().getConfiguration().locale.getLanguage();
        if (q62.OXO1.X11I()) {
            if (Intrinsics.XOO0ii0(language, Languages.DEFAULT_LANGUAGE_ZH) || Intrinsics.XOO0ii0(language, "cn")) {
                language = "zh-Hans";
            }
        } else if (Intrinsics.XOO0ii0(language, Languages.DEFAULT_LANGUAGE_ZH)) {
            language = "cn";
        }
        Iterator<T> it = LanguageTranslationKt.getTranslationLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), language));
        LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) next;
        if (languageTranslationData2 != null) {
            return languageTranslationData2;
        }
        Application application3 = mApp;
        if (application3 == null) {
            Intrinsics.XXO("mApp");
        } else {
            application2 = application3;
        }
        if (UtilsKt.IXI(application2)) {
            translationLanguageList = LanguageTranslationKt.getTranslationLanguageList();
            i = 1;
        } else {
            translationLanguageList = LanguageTranslationKt.getTranslationLanguageList();
            i = 0;
        }
        return translationLanguageList.get(i);
    }

    public final int getMLanguage() {
        return mLanguage;
    }

    @tb1
    public final LanguageTranslationData getMLanguageTranslationData() {
        return mLanguageTranslationData;
    }

    public final int getMToLanguage() {
        return mToLanguage;
    }

    @tb1
    public final LanguageTranslationData getMToLanguageTranslationData() {
        return mToLanguageTranslationData;
    }

    @aa1
    public final LanguageTranslationData getToLanguageTranslationData() {
        Object next;
        List<LanguageTranslationData> translationLanguageList;
        int i;
        LanguageTranslationData languageTranslationData = mToLanguageTranslationData;
        if (languageTranslationData != null) {
            Intrinsics.XXI(languageTranslationData);
            return languageTranslationData;
        }
        Application application = mApp;
        Application application2 = null;
        if (application == null) {
            Intrinsics.XXO("mApp");
            application = null;
        }
        String language = application.getResources().getConfiguration().locale.getLanguage();
        Iterator<T> it = LanguageTranslationKt.getTranslationLanguageList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((LanguageTranslationData) next).getRtasrLanguage(), language));
        LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) next;
        if (languageTranslationData2 != null) {
            return languageTranslationData2;
        }
        Application application3 = mApp;
        if (application3 == null) {
            Intrinsics.XXO("mApp");
        } else {
            application2 = application3;
        }
        if (UtilsKt.IXI(application2)) {
            translationLanguageList = LanguageTranslationKt.getTranslationLanguageList();
            i = 1;
        } else {
            translationLanguageList = LanguageTranslationKt.getTranslationLanguageList();
            i = 0;
        }
        return translationLanguageList.get(i);
    }

    public final void init(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        mApp = app;
    }

    public final void setMLanguage(int i) {
        mLanguage = i;
    }

    public final void setMLanguageTranslationData(@tb1 LanguageTranslationData languageTranslationData) {
        mLanguageTranslationData = languageTranslationData;
    }

    public final void setMToLanguage(int i) {
        mToLanguage = i;
    }

    public final void setMToLanguageTranslationData(@tb1 LanguageTranslationData languageTranslationData) {
        mToLanguageTranslationData = languageTranslationData;
    }

    public final void setTranslationLanguage(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        mLanguageTranslationData = null;
        mToLanguageTranslationData = null;
        getTranslationLanguageType(recordPacket);
    }

    public final void setTranslationLanguageData(@aa1 LanguageTranslationData leftTranslation, @aa1 LanguageTranslationData rightTranslation) {
        Intrinsics.X0O(leftTranslation, "leftTranslation");
        Intrinsics.X0O(rightTranslation, "rightTranslation");
        mLanguageTranslationData = leftTranslation;
        mToLanguageTranslationData = rightTranslation;
    }

    public final void textTranslation(@aa1 String text, @aa1 final AIModelManagerV2.OnAIModelCallback mAICallback, int i) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(mAICallback, "mAICallback");
        VoiceManagerV2.sendTranslationResult$default(VoiceManagerV2.INSTANCE, text, null, 2, null);
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            String microsoftTargetLang = Languages.INSTANCE.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
            MicrosoftSDKManage.XIi00iiXO xIi00iiXO = MicrosoftSDKManage.O1O;
            xIi00iiXO.OXO1().IXI();
            xIi00iiXO.OXO1().m38826OI(text, microsoftTargetLang, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIXX0i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AITranslationManager.textTranslation$lambda$0(mAICallback, (String) obj);
                }
            });
            return;
        }
        if (q62Var.OIXOOi() || i == 2) {
            Languages languages = Languages.INSTANCE;
            String aISparkTargetLang = languages.formatAISparkTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
            final String aISparkTargetLang2 = languages.formatAISparkTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
            if (Intrinsics.XOO0ii0(aISparkTargetLang, "cn") || Intrinsics.XOO0ii0(aISparkTargetLang2, "cn")) {
                translateITS(text, aISparkTargetLang, aISparkTargetLang2, mAICallback);
            } else {
                AISparkChainManager.OXO1.IX1XiI(text, aISparkTargetLang, "cn", new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.voice.v2.AITranslationManager.textTranslation.2
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        mAICallback.onAIModelError(UtilsKt.XXO(R.string.failed_in_translation));
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleResponse(String str) {
                        if (str == null || str.length() <= 0) {
                            mAICallback.onAIModelError(UtilsKt.XXO(R.string.failed_in_translation));
                        } else {
                            AITranslationManager.INSTANCE.translateITS(str, "cn", aISparkTargetLang2, mAICallback);
                        }
                    }
                });
            }
        }
    }
}
