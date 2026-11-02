package com.sma.smartv3.biz;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.internal.security.CertificateUtil;
import com.iflytek.sparkchain.core.LLM;
import com.iflytek.sparkchain.core.LLMCallbacks;
import com.iflytek.sparkchain.core.LLMConfig;
import com.iflytek.sparkchain.core.LLMError;
import com.iflytek.sparkchain.core.LLMEvent;
import com.iflytek.sparkchain.core.LLMFactory;
import com.iflytek.sparkchain.core.LLMResult;
import com.iflytek.sparkchain.core.Memory;
import com.iflytek.sparkchain.core.SparkChain;
import com.iflytek.sparkchain.core.SparkChainConfig;
import com.iflytek.sparkchain.core.asr.ASR;
import com.iflytek.sparkchain.core.asr.AsrCallbacks;
import com.iflytek.sparkchain.core.asr.AudioAttributes;
import com.iflytek.sparkchain.core.its.ITS;
import com.iflytek.sparkchain.core.its.ITSCallbacks;
import com.iflytek.sparkchain.core.its.TransType;
import com.iflytek.sparkchain.core.rtasr.RTASR;
import com.iflytek.sparkchain.core.rtasr.RTASRCallbacks;
import com.ironsource.Q6;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.RecordingManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AITranslation;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.model.MacConfig;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.Languages;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAISparkChainManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISparkChainManager.kt\ncom/sma/smartv3/biz/AISparkChainManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,979:1\n1#2:980\n*E\n"})
public final class AISparkChainManager {

    @tb1
    public static O1XIiIO<AIAnswer> I0IIOi;

    @aa1
    public static final String I0iXXO = null;
    public static int I1;
    public static final int I1XOi1 = 0;
    public static final int II1Xi0 = 0;
    public static final int IIX1OXO = 0;
    public static boolean IO;

    @aa1
    public static String IXXOO;

    @tb1
    public static LLM IiI10X;

    @tb1
    public static LLM O00;
    public static boolean O10IXXX0X;

    @aa1
    public static String O1O;

    @tb1
    public static O1XIiIO<AITranslation> OII;

    @aa1
    public static final String OIX0iXi = null;

    @tb1
    public static O1XIiIO<Bitmap> OIi0;

    @aa1
    public static StringBuffer OX;

    @aa1
    public static final AISparkChainManager OXO1 = null;

    @tb1
    public static O1XIiIO<AITranslation> OiIIX101O;

    @aa1
    public static LLMCallbacks X01IiOiIi;
    public static boolean X0O;

    @aa1
    public static final String X1ii = null;
    public static int XIi00iiXO;
    public static boolean XO0O10;

    @aa1
    public static String XOO0ii0;

    @tb1
    public static RTASR XX0;

    @aa1
    public static final String XXI = null;
    public static boolean XXIIO1i11;
    public static final int XiOIO = 0;

    @tb1
    public static ASR XiOIii1;
    public static boolean i010I;

    @aa1
    public static final Regex iI = null;
    public static boolean iIiiO;

    @aa1
    public static final String iO = null;

    @aa1
    public static String iOO1ii1;
    public static boolean iOOX010X;
    public static boolean iX;

    public static final class IiI10X implements ITSCallbacks {
        public final /* synthetic */ O1XIiIO<String> OXO1;

        public IiI10X(O1XIiIO<String> r1) {
            this.OXO1 = r1;
        }

        @Override // com.iflytek.sparkchain.core.its.ITSCallbacks
        public void onError(ITS.ITSError r5, Object r6) {
            Intrinsics.X0O(r5, "error");
            Intrinsics.X0O(r6, "usrTag");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + "  translateITS error  code =" + r5.getCode() + ",  errMsg =  " + r5.getErrMsg() + " ");
            O1XIiIO<String> r7 = this.OXO1;
            String r8 = r5.getErrMsg();
            Intrinsics.O10IXXX0X(r8, "getErrMsg(...)");
            r7.handleError(r8);
        }

        @Override // com.iflytek.sparkchain.core.its.ITSCallbacks
        public void onResult(ITS.ITSResult r5, Object r6) {
            Intrinsics.X0O(r5, "result");
            Intrinsics.X0O(r6, "usrTag");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + "  translateITS   result.status = " + r5.getStatus() + "   result.transResult.dst= " + r5.getTransResult().getDst());
            if (r5.getStatus() != 3) goto L6;
            handleResponse(r5.getTransResult().getDst());
            return;
        }
    }

    public static final class O00 implements RTASRCallbacks {
        public final /* synthetic */ AITranslation OXO1;

        public O00(AITranslation r1) {
            this.OXO1 = r1;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError r5, Object r6) {
            Intrinsics.X0O(r5, "error");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + "  sendRTASRDataIdentify error=" + r5.getCode() + "  msg = " + r5.getErrMsg() + " ");
            AISparkChainManager r7 = AISparkChainManager.OXO1;
            r7.Ii0i(false);
            O1XIiIO<AITranslation> r8 = r7.XX0();
            if (r8 == null) goto L6;
            String r9 = r5.getErrMsg();
            Intrinsics.O10IXXX0X(r9, "getErrMsg(...)");
            r8.handleError(r9);
            return;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult r5, Object r6) {
            Intrinsics.X0O(r5, "result");
            i1O0OXO1O r7 = i1O0OXO1O.OXO1;
            r7.OXO1(AISparkChainManager.OXO1() + "  sendRTASRDataIdentify  result.result=" + r5.getStatus() + "   result.transResult.status = " + r5.getTransResult().getStatus() + "  ");
            AISparkChainManager r0 = AISparkChainManager.OXO1;
            if (r0.IiI10X() == true) goto L5;
            r0.OX110i(true);
        L5:
            r7.OXO1(AISparkChainManager.OXO1() + "  sendRTASRDataIdentify result=" + r5.getStatus() + " ");
            if (r5.getStatus() == 2) goto L8;
            return;
        L8:
            if (r0.OII() == false) goto L14;
            r0.Ii0i(false);
            AITranslation r8 = this.OXO1;
            String r9 = r5.getData();
            Intrinsics.O10IXXX0X(r9, "getData(...)");
            r8.setText(r9);
            O1XIiIO<AITranslation> r10 = r0.XX0();
            if (r10 == null) goto L15;
            r10.handleResponse(this.OXO1);
            return;
        L15:
            return;
        }
    }

    public static final class OXO1 implements LLMCallbacks {
        public OXO1() {
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMError(LLMError r3, Object r4) {
            Intrinsics.X0O(r3, "error");
            i1O0OXO1O.OXO1.XIi00iiXO(AISparkChainManager.OXO1() + "  onLLMError  error = " + r3);
            O1XIiIO<AIAnswer> r5 = AISparkChainManager.OXO1.XOO0ii0();
            if (r5 == null) goto L5;
            r5.handleError(String.valueOf(r3.getErrCode()));
        L5:
            AISparkChainManager.iO(false);
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMEvent(LLMEvent r3, Object r4) {
            Intrinsics.X0O(r3, NotificationCompat.CATEGORY_EVENT);
            i1O0OXO1O.OXO1.XIi00iiXO(AISparkChainManager.OXO1() + "  onLLMEvent  ");
            O1XIiIO<AIAnswer> r5 = AISparkChainManager.OXO1.XOO0ii0();
            if (r5 == null) goto L5;
            String r6 = r3.getEventMsg();
            Intrinsics.O10IXXX0X(r6, "getEventMsg(...)");
            r5.handleError(r6);
        L5:
            AISparkChainManager.iO(false);
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMResult(LLMResult r2, Object r3) {
            Intrinsics.X0O(r2, "result");
            byte[] r4 = r2.getImage();
            if (r4 == null) goto L9;
            Bitmap r5 = BitmapFactory.decodeByteArray(r4, 0, r4.length);
            O1XIiIO<Bitmap> r6 = AISparkChainManager.OXO1.I0IIOi();
            if (r6 == null) goto L7;
            r6.handleResponse(r5);
        L7:
            AISparkChainManager.iO(false);
            return;
        }
    }

    @SourceDebugExtension({"SMAP\nAISparkChainManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISparkChainManager.kt\ncom/sma/smartv3/biz/AISparkChainManager$llmCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,979:1\n1#2:980\n*E\n"})
    public static final class XIi00iiXO implements LLMCallbacks {
        public XIi00iiXO() {
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMError(LLMError r5, Object r6) {
            Intrinsics.X0O(r5, "error");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + " onLLMError event = " + r5.getErrCode() + "  msg = " + r5.getErrMsg());
            O1XIiIO<AIAnswer> r7 = AISparkChainManager.OXO1.XOO0ii0();
            if (r7 == null) goto L5;
            r7.handleError(String.valueOf(r5.getErrCode()));
        L5:
            AISparkChainManager.iO(true);
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMEvent(LLMEvent r5, Object r6) {
            Intrinsics.X0O(r5, NotificationCompat.CATEGORY_EVENT);
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + " onLLMEvent event = " + r5.getEventID() + " msg = " + r5.getEventMsg());
            O1XIiIO<AIAnswer> r7 = AISparkChainManager.OXO1.XOO0ii0();
            if (r7 == null) goto L5;
            String r8 = r5.getEventMsg();
            Intrinsics.O10IXXX0X(r8, "getEventMsg(...)");
            r7.handleError(r8);
        L5:
            AISparkChainManager.iO(true);
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMResult(LLMResult r14, Object r15) {
            Intrinsics.X0O(r14, "llmResult");
            String r0 = AISparkChainManager.OXO1();
            Intrinsics.X1ii(r15, "null cannot be cast to non-null type kotlin.Int");
            LogUtils.d(new Object[]{r0 + " onLLMResult usrContext = " + ((Integer) r15) + "  token = " + AISparkChainManager.XIi00iiXO() + "   content = " + r14.getContent() + ", status = " + r14.getStatus()});
            int r1 = AISparkChainManager.XIi00iiXO();
            if ((r15 instanceof Integer) == true) goto L6;
            return;
        L6:
            if (r1 != ((Number) r15).intValue()) goto L72;
            int r16 = r14.getStatus();
            String r2 = r14.getContent();
            Intrinsics.XXI(r2);
            if (r2.length() > 0) goto L11;
            if (r16 == 2) goto L11;
        L18:
            i1O0OXO1O r3 = i1O0OXO1O.OXO1;
            r3.OXO1(AISparkChainManager.OXO1() + " onLLMResult  status = " + r16 + "  content = " + r14.getContent());
            String r4 = Locale.getDefault().getLanguage();
            StringBuilder r5 = new StringBuilder();
            r5.append("AISparkChainPlay  pronounist  ");
            r5.append(r4);
            r3.OXO1(r5.toString());
            if (q62.OXO1.X11I() == false) goto L40;
            if (r4 == null) goto L45;
            int r6 = r4.hashCode();
            if (r6 == 3179) goto L36;
            if (r6 == 3365) goto L32;
            if (r6 != 3886) goto L45;
            if (r4.equals(Languages.DEFAULT_LANGUAGE_ZH) == false) goto L45;
        L38:
            r4 = "zh-Hans";
            goto L45
        L32:
            if (r4.equals("in") == false) goto L45;
        L34:
            r4 = "id";
            goto L45
        L36:
            if (r4.equals("cn") == true) goto L38;
        L45:
            Iterator<T> r7 = LanguageTranslationKt.getTranslationLanguageList().iterator();
        L47:
            if (r7.hasNext() == false) goto L51;
            Object r8 = r7.next();
            if (Intrinsics.XOO0ii0(((LanguageTranslationData) r8).getRtasrLanguage(), r4) == false) goto L47;
        L52:
            LanguageTranslationData r9 = (LanguageTranslationData) r8;
            if (r9 == null) goto L58;
            String r10 = r9.getTtsViuceName();
            if (r10 == null) goto L58;
        L57:
            String r11 = r10;
            AISparkChainManager r12 = AISparkChainManager.OXO1;
            if (r12.XXIIO1i11() == true) goto L62;
        L66:
            if (r16 != 2) goto L73;
            int r17 = r14.getCompletionTokens();
            int r13 = r14.getPromptTokens();
            int r18 = r14.getTotalTokens();
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + " completionTokens: " + r17 + " promptTokens: " + r13 + " totalTokens: " + r18);
            AISparkChainManager.iO(true);
            return;
        L73:
            return;
        L62:
            if (q62.OXO1.X11I() == false) goto L65;
            if (r16 != 2) goto L66;
            DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r12.iOOX010X(), false, false, null, r11, "onLLMResult", 14, null);
            goto L66
        L65:
            r12.iI(r16, r11);
        L58:
            r10 = "x4_enus_catherine_profnews";
            goto L57
        L51:
            r8 = null;
            goto L52
        L40:
            if (Intrinsics.XOO0ii0(r4, "in") == true) goto L34;
            if (Intrinsics.XOO0ii0(r4, Languages.DEFAULT_LANGUAGE_ZH) == false) goto L45;
            r4 = "cn";
        L11:
            AISparkChainManager r19 = AISparkChainManager.OXO1;
            r19.IiiXiI0I(r19.iOOX010X() + r2);
            r19.IIX1OXO().append(r2);
            O1XIiIO<AIAnswer> r20 = r19.XOO0ii0();
            if (r20 == null) goto L18;
            AIFunctionType r21 = AIFunctionType.AI;
            String r22 = r19.iOOX010X();
            if (r16 != 2) goto L16;
            int r23 = 1;
        L17:
            r20.handleResponse(new AIAnswer(r21, r22, r23, null, null, 24, null));
            goto L18
        L16:
            r23 = 0;
            goto L17
        }
    }

    public static final class XO0O10 implements RTASRCallbacks {
        public final /* synthetic */ AITranslation OXO1;

        public XO0O10(AITranslation r1) {
            this.OXO1 = r1;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError r5, Object r6) {
            Intrinsics.X0O(r5, "error");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + "  RTASRCallbacks error code =" + r5.getCode() + " , msg = " + r5.getErrMsg() + "  ");
            AISparkChainManager r7 = AISparkChainManager.OXO1;
            r7.Ii0i(false);
            O1XIiIO<AITranslation> r8 = r7.XX0();
            if (r8 == null) goto L6;
            String r9 = r5.getErrMsg();
            Intrinsics.O10IXXX0X(r9, "getErrMsg(...)");
            r8.handleError(r9);
            return;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult r6, Object r7) {
            Intrinsics.X0O(r6, "result");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.OXO1() + "  RTASRCallbacks result.result=" + r6.getStatus() + "  result.data = " + r6.getData() + "   result.transResult.status = " + r6.getTransResult().getStatus() + "  ");
            AISparkChainManager r8 = AISparkChainManager.OXO1;
            if (r8.IiI10X() == true) goto L6;
            r8.OX110i(true);
        L6:
            if (r6.getTransResult().getStatus() == 2) goto L8;
            return;
        L8:
            if (r8.OII() == false) goto L14;
            r8.Ii0i(false);
            AITranslation r0 = this.OXO1;
            String r1 = r6.getTransResult().getSrc();
            Intrinsics.O10IXXX0X(r1, "getSrc(...)");
            r0.setText(r1);
            AITranslation r2 = this.OXO1;
            String r9 = r6.getTransResult().getDst();
            Intrinsics.O10IXXX0X(r9, "getDst(...)");
            r2.setDst(r9);
            O1XIiIO<AITranslation> r10 = r8.XX0();
            if (r10 == null) goto L15;
            r10.handleResponse(this.OXO1);
            return;
        L15:
            return;
        }
    }

    public static final class iO implements AsrCallbacks {
        public final /* synthetic */ AITranslation OXO1;

        public iO(AITranslation r1) {
            this.OXO1 = r1;
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onError(ASR.ASRError r4, Object r5) {
            Intrinsics.X0O(r4, "error");
            LogUtils.d(new Object[]{AISparkChainManager.OXO1() + " realTimeSendASRInit TTS.TTSError code =" + r4.getCode() + ",  errMsg =  " + r4.getErrMsg() + "  "});
            RecordingManager.Companion.getInstance().closeBluetooth();
            O1XIiIO<AITranslation> r6 = AISparkChainManager.OXO1.X0O();
            if (r6 == null) goto L6;
            String r7 = r4.getErrMsg();
            Intrinsics.O10IXXX0X(r7, "getErrMsg(...)");
            r6.handleError(r7);
            return;
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onResult(ASR.ASRResult r4, Object r5) {
            Intrinsics.X0O(r4, "result");
            LogUtils.d(new Object[]{AISparkChainManager.OXO1() + " realTimeSendASRInit result.st = " + r4.getStatus() + " bestMatchText = " + r4.getBestMatchText()});
            AITranslation r6 = this.OXO1;
            String r0 = r4.getBestMatchText();
            Intrinsics.O10IXXX0X(r0, "getBestMatchText(...)");
            r6.setText(r0);
            this.OXO1.setStatus(r4.getStatus());
            LogUtils.d(new Object[]{AISparkChainManager.OXO1() + " realTimeSendASRInit  bestMatchText = " + r4.getBestMatchText()});
            O1XIiIO<AITranslation> r7 = AISparkChainManager.OXO1.X0O();
            if (r7 == null) goto L6;
            r7.handleResponse(this.OXO1);
        L6:
            if (r4.getStatus() != 2) goto L9;
            RecordingManager.Companion r8 = RecordingManager.Companion;
            r8.getInstance().setRecording(false);
            r8.getInstance().closeBluetooth();
            return;
        }
    }

    static {
        OXO1 = new AISparkChainManager();
        iO = "AISparkChainManager";
        XO0O10 = true;
        XOO0ii0 = "";
        OIX0iXi = "0c997b55309fdb251dcb1b8cc6c87959";
        I0iXXO = "0b99355f";
        XXI = "9221c3ac55d4516cff992a06d82c21d6";
        X1ii = "ZTRhY2U2NzZhN2UyNWNmNGRlM2NmNjI3";
        IIX1OXO = -101;
        XiOIO = -102;
        OX = new StringBuffer();
        iOOX010X = true;
        X01IiOiIi = new XIi00iiXO();
        II1Xi0 = 3;
        iX = true;
        IXXOO = "";
        iOO1ii1 = "";
        O1O = "";
        iI = new Regex("[,.?，。！？]");
    }

    public AISparkChainManager() {
    }

    public static /* synthetic */ void Ii1iii0(AISparkChainManager r0, String r1, O1XIiIO r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = q62.OXO1.XX00XX();
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = iOOX010X;
    L8:
        r0.iXiiiO(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(AISparkChainManager r0, String r1, O1XIiIO r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.XO0O10(r1, r2);
    }

    public static final /* synthetic */ String OXO1() {
        return iO;
    }

    public static /* synthetic */ void X11I(AISparkChainManager r0, String r1, String r2, String r3, O1XIiIO r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = "cn";
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = Languages.DEFAULT_LANGUAGE;
    L8:
        r0.iiiO(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X11iII1O1(AISparkChainManager r1, byte[] r2, boolean r3, int r4, O1XIiIO r5, boolean r6, int r7, String r8, String r9, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r10 & 8) == 0) goto L9;
        r5 = null;
    L9:
        if ((r10 & 16) == 0) goto L12;
        r6 = false;
    L12:
        if ((r10 & 32) == 0) goto L15;
        r7 = 900;
    L15:
        if ((r10 & 64) == 0) goto L18;
        r8 = "zh_cn";
    L18:
        if ((r10 & 128) == 0) goto L20;
        r9 = "mandarin";
    L20:
        r1.iX1O1(r2, r3, r4, r5, r6, r7, r8, r9);
    }

    public static /* synthetic */ void X1IX(AISparkChainManager r0, O1XIiIO r1, int r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = 900;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = "zh_cn";
    L9:
        if ((r5 & 8) == 0) goto L11;
        r4 = "mandarin";
    L11:
        r0.XXX11i(r1, r2, r3, r4);
    }

    public static final /* synthetic */ int XIi00iiXO() {
        return XIi00iiXO;
    }

    public static /* synthetic */ void XXO(AISparkChainManager r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 900;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = true;
    L8:
        r0.O001I(r1, r2);
    }

    public static /* synthetic */ void XXiO0i(AISparkChainManager r0, String r1, String r2, String r3, O1XIiIO r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = "cn";
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = Languages.DEFAULT_LANGUAGE;
    L8:
        r0.IX1XiI(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iIXi1iiXI(AISparkChainManager r7, byte[] r8, String r9, String r10, boolean r11, int r12, O1XIiIO r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        r11 = false;
    L5:
        boolean r4 = r11;
        if ((r14 & 32) == 0) goto L8;
        r13 = null;
    L8:
        r7.X0i1O(r8, r9, r10, r4, r12, r13);
    }

    public static final /* synthetic */ void iO(boolean r0) {
        XO0O10 = r0;
    }

    public static /* synthetic */ void iX(AISparkChainManager r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = q62.OXO1.XX00XX();
    L5:
        r0.i010I(r1);
    }

    @tb1
    public final O1XIiIO<Bitmap> I0IIOi() {
        return OIi0;
    }

    public final boolean I0iXXO() {
        return X0O;
    }

    public final int I1() {
        return II1Xi0;
    }

    @tb1
    public final ASR I1XOi1() {
        return XiOIii1;
    }

    public final void II1Xi0() {
        LLMConfig r0 = LLMConfig.builder();
        r0.domain("tti");
        r0.url("tti:https://spark-api.cn-huabei-1.xf-yun.com/v2.1/tti");
        IiI10X = LLMFactory.imageGeneration(r0);
    }

    @aa1
    public final StringBuffer IIX1OXO() {
        return OX;
    }

    public final int IO() {
        return IIX1OXO;
    }

    public final void IO0II0i(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        iOO1ii1 = r2;
    }

    public final int IO0iXO0O() {
        if (O10IXXX0X == true) goto L5;
        BleCache r0 = BleCache.INSTANCE;
        if (r0.getMBleAddress().length() != 0) goto L11;
        ToastUtils.showLong(R.string.not_connected);
        return IIX1OXO;
    L11:
        if (X0O == false) goto L26;
        q62 r1 = q62.OXO1;
        if (r1.ii00OXXO() == false) goto L20;
        DeviceConfigInfo r2 = r1.O1i0();
        if (r2 == null) goto L19;
        MacConfig r3 = r2.getMacConfig();
        if (r3 == null) goto L19;
        String r4 = r3.getMac();
    L21:
        SparkChainConfig r5 = SparkChainConfig.builder();
        boolean r6 = false;
        r5.appID(I0iXXO).apiKey(XXI).apiSecret(X1ii).uid(r4).logLevel(0).logPath(uz0.iO(sz0.OXO1, "AI_SPARK_CHAIN_" + O0X11OiO.O00().format(new Date()) + ".txt").getAbsolutePath());
        int r7 = SparkChain.getInst().init(Utils.getApp(), r5);
        if (r7 != 0) goto L24;
        r6 = true;
    L24:
        O10IXXX0X = r6;
        i1O0OXO1O.OXO1.OXO1(iO + " sparkChainInit ret = " + r7 + "  uid = " + r4 + " , isForceSparkChainAI = " + r1.ii00OXXO() + " ,  isConfigurationSparkChainAI = " + r1.i0101i() + " ");
        return r7;
    L19:
        r4 = null;
        goto L21
    L20:
        r4 = oe5.IXO0OOi(r0.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
        goto L21
    L26:
        i1O0OXO1O.OXO1.OXO1(iO + "   sparkChainInit  isSupportInitializeSDK = " + X0O);
        ToastUtils.showLong(R.string.spark_exist_fail);
        return XiOIO;
    L5:
        return I1XOi1;
    }

    public final void IX0IXOi() {
        SparkChain.getInst().unInit();
    }

    public final void IX1XiI(@aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 O1XIiIO<String> r8) {
        Intrinsics.X0O(r5, "text");
        Intrinsics.X0O(r6, Q6.q);
        Intrinsics.X0O(r7, "targetLang");
        Intrinsics.X0O(r8, "callback");
        if (IO0iXO0O() == 0) goto L6;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRDataIdentify  sparkChainInit return ");
        return;
    L6:
        ITS r0 = new ITS(r6, r7, TransType.ITRANS);
        i1O0OXO1O.OXO1.OXO1(iO + "  translateITS  text = " + r5 + "  lang = " + r6 + "  targetLang = " + r7);
        r0.registerCallbacks(new IiI10X(r8));
        r0.arun(r5, "xdx");
        iOOX010X = true;
    }

    public final void IXI(boolean r1) {
        iX = r1;
    }

    public final void IXOIIIO(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        IXXOO = r2;
    }

    public final boolean IXXOO() {
        return XXIIO1i11;
    }

    public final void Ii0X0X(@aa1 StringBuffer r2) {
        Intrinsics.X0O(r2, "<set-?>");
        OX = r2;
    }

    public final void Ii0i(boolean r1) {
        IO = r1;
    }

    public final boolean IiI10X() {
        return iIiiO;
    }

    public final void IiiXiI0I(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        XOO0ii0 = r2;
    }

    public final void O001I(int r5, boolean r6) {
        ASR r0 = XiOIii1;
        if (r0 == null) goto L17;
        if (r0 == null) goto L6;
        r0.stop(r6);
    L6:
        AudioAttributes r7 = new AudioAttributes();
        if (XXIIO1i11 == true) goto L11;
        ASR r1 = XiOIii1;
        if (r1 == null) goto L11;
        r1.vadEos(r5);
    L11:
        ASR r2 = XiOIii1;
        if (r2 == null) goto L14;
        Integer r8 = Integer.valueOf(r2.start(r7, "tag"));
    L15:
        Oi(r8);
        i1O0OXO1O.OXO1.OXO1(iO + "  isASRSteam = " + XXIIO1i11 + " , vadEos = " + r5 + " , realTimeStart_ASR asr  ret = " + r8);
        return;
    L14:
        r8 = null;
        goto L15
    }

    public final void O0O0X0iOi() {
        ASR r0 = XiOIii1;
        if (r0 == null) goto L5;
        r0.stop(false);
    L5:
        LLM r1 = O00;
        if (r1 == null) goto L8;
        r1.stop();
    L8:
        iOOX010X = false;
    }

    @aa1
    public final LLMCallbacks O10IXXX0X() {
        return X01IiOiIi;
    }

    public final boolean O1O() {
        return i010I;
    }

    public final boolean OII() {
        return IO;
    }

    public final int OIX0iXi() {
        return I1XOi1;
    }

    public final int OIi0() {
        return XiOIO;
    }

    public final void OO(@tb1 O1XIiIO<AIAnswer> r1) {
        I0IIOi = r1;
    }

    public final boolean OX() {
        return iX;
    }

    public final void OX110i(boolean r1) {
        iIiiO = r1;
    }

    public final void Oi(@tb1 Integer r9) {
        if (r9 != null) goto L5;
        return;
    L5:
        if (r9.intValue() != 18020) goto L8;
        a01.OXO1.XIi00iiXO().put(b01.i0X1iIO + oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), "");
        ToastUtils.showLong(UtilsKt.XXO(R.string.spark_exist_fail) + "  " + r9, new Object[0]);
        return;
    }

    @aa1
    public final String OiIIX101O() {
        return IXXOO;
    }

    public final void X00XIX1(boolean r4) {
        i1O0OXO1O.OXO1.OXO1(iO + "  setIsSupportInitializeSDK  b = " + r4);
        X0O = r4;
    }

    public final void X00Xi1X(@tb1 RTASR r1) {
        XX0 = r1;
    }

    @aa1
    public final String X01IiOiIi() {
        return O1O;
    }

    @tb1
    public final O1XIiIO<AITranslation> X0O() {
        return OII;
    }

    public final void X0i1O(@aa1 byte[] r2, @aa1 String r3, @aa1 String r4, boolean r5, int r6, @tb1 O1XIiIO<AITranslation> r7) {
        Intrinsics.X0O(r2, "byte");
        Intrinsics.X0O(r3, Q6.q);
        Intrinsics.X0O(r4, "targetLang");
        if (IO0iXO0O() != 0) goto L36;
        if (r5 == false) goto L11;
        RTASR r8 = XX0;
        if (r8 == null) goto L9;
        r8.stop();
    L9:
        XX0 = null;
        return;
    L11:
        OiIIX101O = r7;
        if (XX0 != null) goto L27;
        iXiX011(r3, r4);
    L27:
        ByteArrayInputStream r9 = new ByteArrayInputStream(r2);     // Catch: Exception -> L21
        byte[] r10 = new byte[r6];     // Catch: Exception -> L21
    L15:
        int r11 = r9.read(r10);     // Catch: Exception -> L21
        Unit r12 = Unit.OXO1;     // Catch: Exception -> L21
        if ((-1) == r11) goto L23;
        if (r11 <= 0) goto L15;
        RTASR r13 = XX0;     // Catch: Exception -> L21
        if (r13 == null) goto L15;
        r13.write((byte[]) r10.clone());     // Catch: Exception -> L21
        goto L15
    L23:
        r9.close();     // Catch: Exception -> L21
        return;
    L21:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    public final void X1(@tb1 O1XIiIO<AITranslation> r1) {
        OiIIX101O = r1;
    }

    public final void X100O(@aa1 String r8, @aa1 O1XIiIO<AITranslation> r9) {
        Intrinsics.X0O(r8, "pcmFilePath");
        Intrinsics.X0O(r9, "callback");
        if (IO0iXO0O() == 0) goto L7;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRDataIdentify  sparkChainInit return ");
        return;
    L7:
        if (IO == false) goto L10;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRDataIdentify  mRTASRIsRun = return");
        return;
    L10:
        OiIIX101O = r9;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRDataIdentify  pcmFilePath = " + r8);
        iIiiO = false;
        IO = true;
        XX0 = new RTASR(OIX0iXi);
        AITranslation r1 = new AITranslation(null, null, 0, 7, null);
        DcsTtsPlayer.INSTANCE.initSegmentation();
        RTASR r10 = XX0;
        if (r10 == null) goto L13;
        r10.registerCallbacks(new O00(r1));
    L13:
        RTASR r11 = XX0;
        if (r11 == null) goto L16;
        r11.transType("normal");
    L16:
        RTASR r12 = XX0;
        if (r12 == null) goto L23;
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        if (UtilsKt.IXI(r0) == false) goto L21;
        String r2 = "cn";
    L22:
        r12.lang(r2);
        goto L23
    L21:
        r2 = Languages.DEFAULT_LANGUAGE;
    L23:
        RTASR r13 = XX0;
        Intrinsics.XXI(r13);
        int r14 = r13.start("xdx");
        Oi(Integer.valueOf(r14));
        if (r14 != 0) goto L52;
        FileInputStream r15 = new FileInputStream(r8);     // Catch: Exception -> L32
        byte[] r16 = new byte[1280];     // Catch: Exception -> L32
    L26:
        int r3 = r15.read(r16);     // Catch: Exception -> L32
        Unit r4 = Unit.OXO1;     // Catch: Exception -> L32
        if ((-1) == r3) goto L34;
        if (r3 <= 0) goto L26;
        RTASR r5 = XX0;     // Catch: Exception -> L32
        if (r5 == null) goto L26;
        r5.write((byte[]) r16.clone());     // Catch: Exception -> L32
        goto L26
    L34:
        r15.close();     // Catch: Exception -> L32
        RTASR r17 = XX0;     // Catch: Exception -> L32
        if (r17 == null) goto L53;
        r17.stop();     // Catch: Exception -> L32
        return;
    L53:
        return;
    L32:
        e = move-exception;
        RTASR r18 = XX0;
        if (r18 == null) goto L41;
        r18.stop();
    L41:
        e.printStackTrace();
        return;
    }

    public final int X1ii(@aa1 String r4) {
        Intrinsics.X0O(r4, "input");
        int r0 = r4.length();
    L3:
        r0 = r0 - 1;
        if ((-1) >= r0) goto L9;
        if (iI.matches(String.valueOf(r4.charAt(r0))) == false) goto L3;
        return r0;
    L9:
        return -1;
    }

    public final void XO0O10(@aa1 String r3, @tb1 O1XIiIO<Bitmap> r4) {
        Intrinsics.X0O(r3, "inputText");
        if (IO0iXO0O() != 0) goto L13;
        II1Xi0();
        OIi0 = r4;
        LLM r5 = IiI10X;
        if (r5 == null) goto L8;
        r5.arun(r3);
    L8:
        i1O0OXO1O.OXO1.OXO1(iO + " generateAIGC inputText = " + r3);
        LLM r6 = IiI10X;
        if (r6 == null) goto L12;
        r6.registerLLMCallbacks(new OXO1());
        return;
    L12:
        return;
    }

    public final void XO0X10iO(@tb1 ASR r1) {
        XiOIii1 = r1;
    }

    public final void XOIX(boolean r1) {
        i010I = r1;
    }

    public final void XOO0XOOii(boolean r1) {
        iX = r1;
        if (r1 == false) goto L6;
        IXXOO = "";
        iOO1ii1 = "";
        return;
    }

    @tb1
    public final O1XIiIO<AIAnswer> XOO0ii0() {
        return I0IIOi;
    }

    public final void XOX0O0(@tb1 O1XIiIO<Bitmap> r1) {
        OIi0 = r1;
    }

    public final void XOXiX0(boolean r1) {
        iOOX010X = r1;
    }

    @tb1
    public final O1XIiIO<AITranslation> XX0() {
        return OiIIX101O;
    }

    public final List<String> XX00i10X(String r3) {
        return iI.split(r3, 0);
    }

    public final void XX1Oi(boolean r1) {
        XXIIO1i11 = r1;
    }

    public final String XXI() {
        Locale r0 = Utils.getApp().getResources().getConfiguration().getLocales().get(0);
        if (r0 == null) goto L6;
        String r1 = "请用" + r0.getDisplayLanguage(Locale.CHINA) + "回答问题!";
        if (r1 == null) goto L6;
    L7:
        i1O0OXO1O.OXO1.OXO1(iO + " getLanguagePrompt() prompt = " + r1);
        return r1;
    L6:
        r1 = "请用语言缩写为" + Locale.getDefault().getLanguage() + "的语言类型回答.";
        goto L7
    }

    public final boolean XXIIO1i11() {
        return iOOX010X;
    }

    public final void XXX11i(@tb1 O1XIiIO<AITranslation> r8, int r9, @aa1 String r10, @aa1 String r11) {
        Intrinsics.X0O(r10, "language");
        Intrinsics.X0O(r11, "accent");
        if (r8 == null) goto L5;
        OII = r8;
    L5:
        XiOIii1 = new ASR(r10, AuthenticationTokenClaims.JSON_KEY_IAT, r11);
        AITranslation r1 = new AITranslation(null, null, 0, 7, null);
        ASR r12 = XiOIii1;
        if (r12 == null) goto L8;
        r12.registerCallbacks(new iO(r1));
    L8:
        XXO(this, r9, false, 2, null);
    }

    public final void XXiIiX10(int r1) {
        I1 = r1;
    }

    public final int XiOIO() {
        return I1;
    }

    @aa1
    public final String XiOIii1() {
        return iOO1ii1;
    }

    public final void i010I(int r3) {
        LLMConfig r4 = LLMConfig.builder();
        r4.domain("generalv3.5");
        r4.url("ws(s)://spark-api.xf-yun.com/v3.5/chat");
        LLM r0 = new LLM(r4, Memory.windowMemory(5));
        O00 = r0;
        r0.registerLLMCallbacks(X01IiOiIi);
    }

    public final void i0X000X0O(@aa1 LLMCallbacks r2) {
        Intrinsics.X0O(r2, "<set-?>");
        X01IiOiIi = r2;
    }

    public final void i11I(@tb1 O1XIiIO<AITranslation> r1) {
        OII = r1;
    }

    public final void iI(int r13, @aa1 String r14) {
        Intrinsics.X0O(r14, "rtasrLanguage");
        if (iOOX010X == false) goto L23;
        if (OX.length() <= 0) goto L23;
        if (r13 != 1) goto L23;
        String r0 = OX.toString();
        Intrinsics.O10IXXX0X(r0, "toString(...)");
        List<String> r1 = XX00i10X(r0);
        int r3 = r1.size();
        int r4 = II1Xi0;
        int r5 = I1;
        if (r3 < (r4 + r5)) goto L29;
        if (r5 != 0) goto L12;
        DcsTtsPlayer.INSTANCE.initSegmentation();
    L12:
        int r6 = OX.indexOf(r1.get((I1 + r4) - 1));
        if (((r1.get((I1 + r4) - 1).length() + r6) + 1) >= OX.length()) goto L16;
        String r2 = OX.substring(0, (r6 + r1.get((r4 + I1) - 1).length()) + 1);
    L15:
        String r7 = r2;
        if (r7.length() < 3) goto L31;
        I1++;
        DcsTtsPlayer r8 = DcsTtsPlayer.INSTANCE;
        Intrinsics.XXI(r7);
        DcsTtsPlayer.play$default(r8, r7, true, true, null, r14, "newSegmentationPlay", 8, null);
        OX.delete(0, r7.length());
        return;
    L31:
        return;
    L16:
        StringBuffer r9 = OX;
        String r10 = r9.toString();
        Intrinsics.O10IXXX0X(r10, "toString(...)");
        r2 = r9.substring(0, X1ii(r10));
        goto L15
    L29:
        return;
    L23:
        if (r13 == 2) goto L25;
        return;
    L25:
        if (I1 != 0) goto L27;
        DcsTtsPlayer.INSTANCE.initSegmentation();
    L27:
        DcsTtsPlayer r11 = DcsTtsPlayer.INSTANCE;
        String r12 = OX.toString();
        Intrinsics.O10IXXX0X(r12, "toString(...)");
        DcsTtsPlayer.play$default(r11, r12, true, true, null, r14, "newSegmentationPlay1", 8, null);
    }

    @tb1
    public final RTASR iIiiO() {
        return XX0;
    }

    public final void iOI() {
        RTASR r0 = XX0;
        if (r0 == null) goto L5;
        r0.stop();
    L5:
        LLM r1 = O00;
        if (r1 == null) goto L8;
        r1.stop();
    L8:
        iOOX010X = false;
    }

    public final boolean iOO1ii1() {
        return O10IXXX0X;
    }

    @aa1
    public final String iOOX010X() {
        return XOO0ii0;
    }

    public final void iOiXi11II(boolean r1) {
        O10IXXX0X = r1;
    }

    public final void iX1O1(@aa1 byte[] r2, boolean r3, int r4, @tb1 O1XIiIO<AITranslation> r5, boolean r6, int r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r2, "byte");
        Intrinsics.X0O(r8, "language");
        Intrinsics.X0O(r9, "accent");
        if (IO0iXO0O() != 0) goto L36;
        if (r3 == false) goto L11;
        ASR r10 = XiOIii1;
        if (r10 == null) goto L9;
        r10.stop(false);
    L9:
        XiOIii1 = null;
        return;
    L11:
        XXIIO1i11 = r6;
        if (XiOIii1 != null) goto L27;
        XXX11i(r5, r7, r8, r9);
    L27:
        ByteArrayInputStream r11 = new ByteArrayInputStream(r2);     // Catch: Exception -> L21
        byte[] r12 = new byte[r4];     // Catch: Exception -> L21
    L15:
        int r13 = r11.read(r12);     // Catch: Exception -> L21
        Unit r14 = Unit.OXO1;     // Catch: Exception -> L21
        if ((-1) == r13) goto L23;
        if (r13 <= 0) goto L15;
        ASR r15 = XiOIii1;     // Catch: Exception -> L21
        if (r15 == null) goto L15;
        r15.write((byte[]) r12.clone());     // Catch: Exception -> L21
        goto L15
    L23:
        r11.close();     // Catch: Exception -> L21
        return;
    L21:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    public final void iXiX011(@aa1 String r11, @aa1 final String r12) {
        Intrinsics.X0O(r11, Q6.q);
        Intrinsics.X0O(r12, "targetLang");
        boolean r0 = false;
        iIiiO = false;
        IO = true;
        XX0 = new RTASR(OIX0iXi);
        if (Intrinsics.XOO0ii0(r11, "cn") == false) goto L5;
    L7:
        boolean r3 = false;
    L8:
        i010I = r3;
        final AITranslation r4 = new AITranslation(null, null, 0, 7, null);
        DcsTtsPlayer.INSTANCE.initSegmentation();
        RTASR r5 = XX0;
        if (r5 == null) goto L11;
        r5.registerCallbacks(new AISparkChainManager$realTimeSendRTASRInit$1(r4, r12));
    L11:
        RTASR r6 = XX0;
        if (r6 == null) goto L14;
        r6.transType("normal");
    L14:
        RTASR r7 = XX0;
        if (r7 == null) goto L18;
        r7.lang(r11);
    L18:
        if (i010I == false) goto L22;
        RTASR r13 = XX0;
        if (r13 == null) goto L25;
        r13.targetLang("cn");
    L25:
        RTASR r14 = XX0;
        Intrinsics.XXI(r14);
        int r15 = r14.start("xdx");
        Oi(Integer.valueOf(r15));
        if (r15 != 0) goto L28;
        r0 = true;
    L28:
        iX = r0;
        return;
    L22:
        RTASR r16 = XX0;
        if (r16 == null) goto L25;
        r16.targetLang(r12);
        goto L25
    L5:
        if (Intrinsics.XOO0ii0(r12, "cn") == true) goto L7;
        r3 = true;
        goto L8
    }

    public final void iXiiiO(@aa1 String r6, @tb1 O1XIiIO<AIAnswer> r7, int r8, boolean r9) {
        Intrinsics.X0O(r6, "inputText");
        if (IO0iXO0O() == 0) goto L5;
        return;
    L5:
        I1 = 0;
        OX.setLength(0);
        i010I(r8);
        LLM r10 = O00;
        Intrinsics.XXI(r10);
        r10.stop();
        AIManager.OXO1.i11I(0);
        XOO0ii0 = "";
        XIi00iiXO++;
        q62 r11 = q62.OXO1;
        if (r11.IIIO1i() == false) goto L10;
        LLM r12 = O00;
        if (r12 == null) goto L13;
        r12.addSystemPrompt("你是由百度研发的智能大模型,名字和模型名都叫" + UtilsKt.XXO(R.string.wenxinyiyan) + ",回答用户的问题时保持简洁明了,避免冗长的解释,严格按照用户使用的语言回答问题，确保沟通顺畅.如果用户询问“你是什么模型”、“你是谁”此类问题，统一回答“你好呀！我是" + UtilsKt.XXO(R.string.wenxinyiyan) + "，有什么可以帮您吗？”");
    L13:
        i1O0OXO1O r13 = i1O0OXO1O.OXO1;
        String r1 = iO;
        r13.OXO1(r1 + " sendMsg inputText = " + r6 + "  limitQuery = " + r6);
        LLM r2 = O00;
        Intrinsics.XXI(r2);
        int r14 = r2.arun(r6, Integer.valueOf(XIi00iiXO));
        if (r14 == 0) goto L17;
        r13.OXO1(r1 + " SparkChain sendMsg failed:" + r14 + "  token = " + XIi00iiXO);
        return;
    L17:
        iOOX010X = r9;
        OIi0 = null;
        I0IIOi = r7;
        XO0O10 = false;
        return;
    L10:
        String r15 = r11.iiiO();
        LLM r3 = O00;
        if (r3 == null) goto L13;
        r3.addSystemPrompt("回答用户的问题时保持简洁明了，避免冗长的解释，确保沟通顺畅. " + XXI() + " " + r15);
        goto L13
    }

    public final void iiIOiX(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        O1O = r2;
    }

    public final void iiiO(@aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 O1XIiIO<AITranslation> r11) {
        Intrinsics.X0O(r8, "pcmFilePath");
        Intrinsics.X0O(r9, Q6.q);
        Intrinsics.X0O(r10, "targetLang");
        Intrinsics.X0O(r11, "callback");
        if (IO0iXO0O() == 0) goto L7;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRData  sparkChainInit return ");
        return;
    L7:
        if (IO == false) goto L10;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRData  mRTASRIsRun = return ");
        return;
    L10:
        OiIIX101O = r11;
        i1O0OXO1O.OXO1.OXO1(iO + " sendRTASRData  pcmFilePath = " + r8 + "  lang = " + r9 + "  targetLang = " + r10);
        IO = true;
        iIiiO = false;
        XX0 = new RTASR(OIX0iXi);
        AITranslation r1 = new AITranslation(null, null, 0, 7, null);
        DcsTtsPlayer.INSTANCE.initSegmentation();
        RTASR r12 = XX0;
        if (r12 == null) goto L13;
        r12.registerCallbacks(new XO0O10(r1));
    L13:
        RTASR r13 = XX0;
        if (r13 == null) goto L16;
        r13.transType("normal");
    L16:
        RTASR r14 = XX0;
        if (r14 == null) goto L19;
        r14.lang(r9);
    L19:
        RTASR r15 = XX0;
        if (r15 == null) goto L22;
        r15.targetLang(r10);
    L22:
        RTASR r16 = XX0;
        Intrinsics.XXI(r16);
        int r17 = r16.start("xdx");
        Oi(Integer.valueOf(r17));
        if (r17 != 0) goto L51;
        FileInputStream r18 = new FileInputStream(r8);     // Catch: Exception -> L31
        byte[] r19 = new byte[1280];     // Catch: Exception -> L31
    L25:
        int r110 = r18.read(r19);     // Catch: Exception -> L31
        Unit r111 = Unit.OXO1;     // Catch: Exception -> L31
        if ((-1) == r110) goto L33;
        if (r110 <= 0) goto L25;
        RTASR r112 = XX0;     // Catch: Exception -> L31
        if (r112 == null) goto L25;
        r112.write((byte[]) r19.clone());     // Catch: Exception -> L31
        goto L25
    L33:
        r18.close();     // Catch: Exception -> L31
        RTASR r20 = XX0;     // Catch: Exception -> L31
        if (r20 == null) goto L52;
        r20.stop();     // Catch: Exception -> L31
        return;
    L52:
        return;
    L31:
        e = move-exception;
        RTASR r21 = XX0;
        if (r21 == null) goto L40;
        r21.stop();
    L40:
        e.printStackTrace();
        return;
    }
}
