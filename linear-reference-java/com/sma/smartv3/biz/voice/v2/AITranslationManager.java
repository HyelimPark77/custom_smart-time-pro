package com.sma.smartv3.biz.voice.v2;

import android.app.Application;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIXX0i;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.util.MicrosoftSDKManage;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.Languages;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAITranslationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITranslationManager.kt\ncom/sma/smartv3/biz/voice/v2/AITranslationManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class AITranslationManager {

    @aa1
    public static final AITranslationManager INSTANCE = null;

    @aa1
    private static final String TAG = "AIManager AITranslationManager";
    private static Application mApp;
    private static int mLanguage;

    @tb1
    private static LanguageTranslationData mLanguageTranslationData;
    private static int mToLanguage;

    @tb1
    private static LanguageTranslationData mToLanguageTranslationData;

    static {
        INSTANCE = new AITranslationManager();
        mLanguage = -1;
        mToLanguage = -1;
    }

    private AITranslationManager() {
    }

    public static /* synthetic */ Unit OXO1(AIModelManagerV2.OnAIModelCallback r0, String r1) {
        return textTranslation$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$translateITS(AITranslationManager r0, String r1, String r2, String r3, AIModelManagerV2.OnAIModelCallback r4) {
        r0.translateITS(r1, r2, r3, r4);
    }

    private final void getTranslationLanguageType(BleRecordPacket r8) {
        mLanguage = r8.getMLanguage();
        mToLanguage = r8.getMToLanguage();
        Application r9 = mApp;
        Object r1 = null;
        if (r9 != null) goto L6;
        Intrinsics.XXO("mApp");
        r9 = null;
    L6:
        if (UtilsKt.IXI(r9) == false) goto L8;
        String r10 = Languages.DEFAULT_LANGUAGE_ZH;
    L9:
        Application r4 = mApp;
        if (r4 != null) goto L13;
        Intrinsics.XXO("mApp");
        r4 = null;
    L13:
        if (UtilsKt.IXI(r4) == false) goto L15;
        String r0 = Languages.DEFAULT_LANGUAGE;
    L16:
        q62 r5 = q62.OXO1;
        if (r5.X11I() == false) goto L21;
        Languages r11 = Languages.INSTANCE;
        String r2 = r11.formatMicrosoftTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        String r12 = r11.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
    L19:
        String r6 = r2;
        r0 = r12;
        r10 = r6;
    L23:
        Iterator<T> r3 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L25:
        if (r3.hasNext() == false) goto L29;
        Object r7 = r3.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r7).getRtasrLanguage(), r10) == false) goto L25;
    L30:
        mLanguageTranslationData = (LanguageTranslationData) r7;
        Iterator<T> r13 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L32:
        if (r13.hasNext() == false) goto L36;
        Object r14 = r13.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r14).getRtasrLanguage(), r0) == false) goto L32;
        r1 = r14;
    L36:
        mToLanguageTranslationData = (LanguageTranslationData) r1;
        return;
    L29:
        r7 = null;
        goto L30
    L21:
        if (r5.OIXOOi() == false) goto L23;
        Languages r15 = Languages.INSTANCE;
        r2 = r15.formatAISparkTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        r12 = r15.formatAISparkTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
        goto L19
    L15:
        r0 = Languages.DEFAULT_LANGUAGE_ZH;
        goto L16
    L8:
        r10 = Languages.DEFAULT_LANGUAGE;
        goto L9
    }

    public static /* synthetic */ void textTranslation$default(AITranslationManager r0, String r1, AIModelManagerV2.OnAIModelCallback r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = -1;
    L5:
        r0.textTranslation(r1, r2, r3);
    }

    private static final Unit textTranslation$lambda$0(AIModelManagerV2.OnAIModelCallback r1, String r2) {
        Intrinsics.X0O(r2, "it");
        DcsTtsPlayer.INSTANCE.stop();
        VoiceManagerV2.INSTANCE.sendTranslationResultOutput(r2);
        r1.onComplete(r2);
        LanguageTranslationData r3 = INSTANCE.getToLanguageTranslationData();
        MicrosoftSDKManage.O1O.OXO1().XXIIO1i11(r2, r3.getTtsViuceName());
        return Unit.OXO1;
    }

    private final void translateITS(String r4, String r5, final String r6, final AIModelManagerV2.OnAIModelCallback r7) {
        i1O0OXO1O.OXO1.OXO1("AIManager AITranslationManager  translateITS leftLang = " + r5 + " , rightLang = " + r6);
        AISparkChainManager.OXO1.IX1XiI(r4, r5, r6, new AnonymousClass1(r7, r6));
    }

    public static /* synthetic */ void translateITS$default(AITranslationManager r0, String r1, String r2, String r3, AIModelManagerV2.OnAIModelCallback r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = "cn";
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = Languages.DEFAULT_LANGUAGE;
    L8:
        r0.translateITS(r1, r2, r3, r4);
    }

    @aa1
    public final LanguageTranslationData getLanguageTranslationData() {
        LanguageTranslationData r0 = mLanguageTranslationData;
        if (r0 == null) goto L6;
        Intrinsics.XXI(r0);
        return r0;
    L6:
        Application r1 = mApp;
        Application r2 = null;
        if (r1 != null) goto L9;
        Intrinsics.XXO("mApp");
        r1 = null;
    L9:
        String r3 = r1.getResources().getConfiguration().locale.getLanguage();
        if (q62.OXO1.X11I() == false) goto L17;
        if (Intrinsics.XOO0ii0(r3, Languages.DEFAULT_LANGUAGE_ZH) == false) goto L14;
    L15:
        r3 = "zh-Hans";
    L19:
        Iterator<T> r4 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L21:
        if (r4.hasNext() == false) goto L25;
        Object r5 = r4.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r5).getRtasrLanguage(), r3) == false) goto L21;
    L26:
        LanguageTranslationData r6 = (LanguageTranslationData) r5;
        if (r6 != null) goto L38;
        Application r7 = mApp;
        if (r7 != null) goto L31;
        Intrinsics.XXO("mApp");
    L33:
        if (UtilsKt.IXI(r2) == false) goto L37;
        List<LanguageTranslationData> r8 = LanguageTranslationKt.getTranslationLanguageList();
        int r9 = 1;
    L36:
        return r8.get(r9);
    L37:
        r8 = LanguageTranslationKt.getTranslationLanguageList();
        r9 = 0;
        goto L36
    L31:
        r2 = r7;
        goto L33
    L38:
        return r6;
    L25:
        r5 = null;
        goto L26
    L14:
        if (Intrinsics.XOO0ii0(r3, "cn") == false) goto L19;
    L17:
        if (Intrinsics.XOO0ii0(r3, Languages.DEFAULT_LANGUAGE_ZH) == false) goto L19;
        r3 = "cn";
        goto L19
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
        LanguageTranslationData r0 = mToLanguageTranslationData;
        if (r0 == null) goto L6;
        Intrinsics.XXI(r0);
        return r0;
    L6:
        Application r1 = mApp;
        Application r2 = null;
        if (r1 != null) goto L9;
        Intrinsics.XXO("mApp");
        r1 = null;
    L9:
        String r3 = r1.getResources().getConfiguration().locale.getLanguage();
        Iterator<T> r4 = LanguageTranslationKt.getTranslationLanguageList().iterator();
    L11:
        if (r4.hasNext() == false) goto L15;
        Object r5 = r4.next();
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r5).getRtasrLanguage(), r3) == false) goto L11;
    L16:
        LanguageTranslationData r6 = (LanguageTranslationData) r5;
        if (r6 != null) goto L28;
        Application r7 = mApp;
        if (r7 != null) goto L21;
        Intrinsics.XXO("mApp");
    L23:
        if (UtilsKt.IXI(r2) == false) goto L27;
        List<LanguageTranslationData> r8 = LanguageTranslationKt.getTranslationLanguageList();
        int r9 = 1;
    L26:
        return r8.get(r9);
    L27:
        r8 = LanguageTranslationKt.getTranslationLanguageList();
        r9 = 0;
        goto L26
    L21:
        r2 = r7;
        goto L23
    L28:
        return r6;
    L15:
        r5 = null;
        goto L16
    }

    public final void init(@aa1 Application r2) {
        Intrinsics.X0O(r2, "app");
        mApp = r2;
    }

    public final void setMLanguage(int r1) {
        mLanguage = r1;
    }

    public final void setMLanguageTranslationData(@tb1 LanguageTranslationData r1) {
        mLanguageTranslationData = r1;
    }

    public final void setMToLanguage(int r1) {
        mToLanguage = r1;
    }

    public final void setMToLanguageTranslationData(@tb1 LanguageTranslationData r1) {
        mToLanguageTranslationData = r1;
    }

    public final void setTranslationLanguage(@aa1 BleRecordPacket r2) {
        Intrinsics.X0O(r2, "recordPacket");
        mLanguageTranslationData = null;
        mToLanguageTranslationData = null;
        getTranslationLanguageType(r2);
    }

    public final void setTranslationLanguageData(@aa1 LanguageTranslationData r2, @aa1 LanguageTranslationData r3) {
        Intrinsics.X0O(r2, "leftTranslation");
        Intrinsics.X0O(r3, "rightTranslation");
        mLanguageTranslationData = r2;
        mToLanguageTranslationData = r3;
    }

    public final void textTranslation(@aa1 String r5, @aa1 final AIModelManagerV2.OnAIModelCallback r6, int r7) {
        Intrinsics.X0O(r5, "text");
        Intrinsics.X0O(r6, "mAICallback");
        VoiceManagerV2.sendTranslationResult$default(VoiceManagerV2.INSTANCE, r5, null, 2, null);
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L7;
        String r8 = Languages.INSTANCE.formatMicrosoftTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
        MicrosoftSDKManage.XIi00iiXO r1 = MicrosoftSDKManage.O1O;
        r1.OXO1().IXI();
        r1.OXO1().OI(r5, r8, new iIXX0i(r6));
        return;
    L7:
        if (r0.OIXOOi() == true) goto L11;
        if (r7 == 2) goto L11;
        return;
    L11:
        Languages r9 = Languages.INSTANCE;
        String r2 = r9.formatAISparkTargetLang(mLanguage, Languages.DEFAULT_LANGUAGE_ZH);
        final String r10 = r9.formatAISparkTargetLang(mToLanguage, Languages.DEFAULT_LANGUAGE);
        if (Intrinsics.XOO0ii0(r2, "cn") == false) goto L14;
    L17:
        translateITS(r5, r2, r10, r6);
        return;
    L14:
        if (Intrinsics.XOO0ii0(r10, "cn") == true) goto L17;
        AISparkChainManager.OXO1.IX1XiI(r5, r2, "cn", new AnonymousClass2(r10, r6));
    }
}
