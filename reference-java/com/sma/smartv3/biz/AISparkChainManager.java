package com.sma.smartv3.biz;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.amazon.aps.shared.util.APSSharedUtil;
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

    /* JADX INFO: renamed from: I1 */
    public static int f50834I1;
    public static final int I1XOi1 = 0;

    /* JADX INFO: renamed from: IO */
    public static boolean f50835IO;

    @tb1
    public static LLM IiI10X;

    @tb1
    public static LLM O00;
    public static boolean O10IXXX0X;

    @tb1
    public static O1XIiIO<AITranslation> OII;

    @tb1
    public static O1XIiIO<Bitmap> OIi0;

    @tb1
    public static O1XIiIO<AITranslation> OiIIX101O;
    public static boolean X0O;
    public static int XIi00iiXO;

    @tb1
    public static RTASR XX0;
    public static boolean XXIIO1i11;

    @tb1
    public static ASR XiOIii1;
    public static boolean i010I;
    public static boolean iIiiO;

    @aa1
    public static final AISparkChainManager OXO1 = new AISparkChainManager();

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final String f50838iO = "AISparkChainManager";
    public static boolean XO0O10 = true;

    @aa1
    public static String XOO0ii0 = "";

    @aa1
    public static final String OIX0iXi = "0c997b55309fdb251dcb1b8cc6c87959";

    @aa1
    public static final String I0iXXO = "0b99355f";

    @aa1
    public static final String XXI = "9221c3ac55d4516cff992a06d82c21d6";

    @aa1
    public static final String X1ii = "ZTRhY2U2NzZhN2UyNWNmNGRlM2NmNjI3";
    public static final int IIX1OXO = -101;
    public static final int XiOIO = -102;

    /* JADX INFO: renamed from: OX */
    @aa1
    public static StringBuffer f50836OX = new StringBuffer();
    public static boolean iOOX010X = true;

    @aa1
    public static LLMCallbacks X01IiOiIi = new XIi00iiXO();
    public static final int II1Xi0 = 3;

    /* JADX INFO: renamed from: iX */
    public static boolean f50839iX = true;

    @aa1
    public static String IXXOO = "";

    @aa1
    public static String iOO1ii1 = "";

    @aa1
    public static String O1O = "";

    /* JADX INFO: renamed from: iI */
    @aa1
    public static final Regex f50837iI = new Regex("[,.?，。！？]");

    public static final class IiI10X implements ITSCallbacks {
        public final /* synthetic */ O1XIiIO<String> OXO1;

        public IiI10X(O1XIiIO<String> o1XIiIO) {
            this.OXO1 = o1XIiIO;
        }

        @Override // com.iflytek.sparkchain.core.its.ITSCallbacks
        public void onError(ITS.ITSError error, Object usrTag) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(usrTag, "usrTag");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + "  translateITS error  code =" + error.getCode() + ",  errMsg =  " + error.getErrMsg() + " ");
            O1XIiIO<String> o1XIiIO = this.OXO1;
            String errMsg = error.getErrMsg();
            Intrinsics.O10IXXX0X(errMsg, "getErrMsg(...)");
            o1XIiIO.handleError(errMsg);
        }

        @Override // com.iflytek.sparkchain.core.its.ITSCallbacks
        public void onResult(ITS.ITSResult result, Object usrTag) {
            Intrinsics.X0O(result, "result");
            Intrinsics.X0O(usrTag, "usrTag");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + "  translateITS   result.status = " + result.getStatus() + "   result.transResult.dst= " + result.getTransResult().getDst());
            if (result.getStatus() == 3) {
                this.OXO1.handleResponse(result.getTransResult().getDst());
            }
        }
    }

    public static final class O00 implements RTASRCallbacks {
        public final /* synthetic */ AITranslation OXO1;

        public O00(AITranslation aITranslation) {
            this.OXO1 = aITranslation;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError error, Object obj) {
            Intrinsics.X0O(error, "error");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + "  sendRTASRDataIdentify error=" + error.getCode() + "  msg = " + error.getErrMsg() + " ");
            AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
            aISparkChainManager.Ii0i(false);
            O1XIiIO<AITranslation> o1XIiIOXX0 = aISparkChainManager.XX0();
            if (o1XIiIOXX0 != null) {
                String errMsg = error.getErrMsg();
                Intrinsics.O10IXXX0X(errMsg, "getErrMsg(...)");
                o1XIiIOXX0.handleError(errMsg);
            }
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult result, Object obj) {
            Intrinsics.X0O(result, "result");
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(AISparkChainManager.f50838iO + "  sendRTASRDataIdentify  result.result=" + result.getStatus() + "   result.transResult.status = " + result.getTransResult().getStatus() + "  ");
            AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
            if (!aISparkChainManager.IiI10X()) {
                aISparkChainManager.OX110i(true);
            }
            i1o0oxo1o.OXO1(AISparkChainManager.f50838iO + "  sendRTASRDataIdentify result=" + result.getStatus() + " ");
            if (result.getStatus() == 2 && aISparkChainManager.OII()) {
                aISparkChainManager.Ii0i(false);
                AITranslation aITranslation = this.OXO1;
                String data = result.getData();
                Intrinsics.O10IXXX0X(data, "getData(...)");
                aITranslation.setText(data);
                O1XIiIO<AITranslation> o1XIiIOXX0 = aISparkChainManager.XX0();
                if (o1XIiIOXX0 != null) {
                    o1XIiIOXX0.handleResponse(this.OXO1);
                }
            }
        }
    }

    public static final class OXO1 implements LLMCallbacks {
        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMError(LLMError error, Object obj) {
            Intrinsics.X0O(error, "error");
            i1O0OXO1O.OXO1.XIi00iiXO(AISparkChainManager.f50838iO + "  onLLMError  error = " + error);
            O1XIiIO<AIAnswer> o1XIiIOXOO0ii0 = AISparkChainManager.OXO1.XOO0ii0();
            if (o1XIiIOXOO0ii0 != null) {
                o1XIiIOXOO0ii0.handleError(String.valueOf(error.getErrCode()));
            }
            AISparkChainManager.XO0O10 = false;
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMEvent(LLMEvent event, Object obj) {
            Intrinsics.X0O(event, "event");
            i1O0OXO1O.OXO1.XIi00iiXO(AISparkChainManager.f50838iO + "  onLLMEvent  ");
            O1XIiIO<AIAnswer> o1XIiIOXOO0ii0 = AISparkChainManager.OXO1.XOO0ii0();
            if (o1XIiIOXOO0ii0 != null) {
                String eventMsg = event.getEventMsg();
                Intrinsics.O10IXXX0X(eventMsg, "getEventMsg(...)");
                o1XIiIOXOO0ii0.handleError(eventMsg);
            }
            AISparkChainManager.XO0O10 = false;
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMResult(LLMResult result, Object obj) {
            Intrinsics.X0O(result, "result");
            byte[] image = result.getImage();
            if (image != null) {
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(image, 0, image.length);
                O1XIiIO<Bitmap> o1XIiIOI0IIOi = AISparkChainManager.OXO1.I0IIOi();
                if (o1XIiIOI0IIOi != null) {
                    o1XIiIOI0IIOi.handleResponse(bitmapDecodeByteArray);
                }
                AISparkChainManager.XO0O10 = false;
            }
        }
    }

    @SourceDebugExtension({"SMAP\nAISparkChainManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISparkChainManager.kt\ncom/sma/smartv3/biz/AISparkChainManager$llmCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,979:1\n1#2:980\n*E\n"})
    public static final class XIi00iiXO implements LLMCallbacks {
        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMError(LLMError error, Object obj) {
            Intrinsics.X0O(error, "error");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + " onLLMError event = " + error.getErrCode() + "  msg = " + error.getErrMsg());
            O1XIiIO<AIAnswer> o1XIiIOXOO0ii0 = AISparkChainManager.OXO1.XOO0ii0();
            if (o1XIiIOXOO0ii0 != null) {
                o1XIiIOXOO0ii0.handleError(String.valueOf(error.getErrCode()));
            }
            AISparkChainManager.XO0O10 = true;
        }

        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMEvent(LLMEvent event, Object obj) {
            Intrinsics.X0O(event, "event");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + " onLLMEvent event = " + event.getEventID() + " msg = " + event.getEventMsg());
            O1XIiIO<AIAnswer> o1XIiIOXOO0ii0 = AISparkChainManager.OXO1.XOO0ii0();
            if (o1XIiIOXOO0ii0 != null) {
                String eventMsg = event.getEventMsg();
                Intrinsics.O10IXXX0X(eventMsg, "getEventMsg(...)");
                o1XIiIOXOO0ii0.handleError(eventMsg);
            }
            AISparkChainManager.XO0O10 = true;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x012c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0135  */
        @Override // com.iflytek.sparkchain.core.LLMCallbacks
        public void onLLMResult(LLMResult llmResult, Object obj) {
            Object next;
            String ttsViuceName;
            Intrinsics.X0O(llmResult, "llmResult");
            String str = AISparkChainManager.f50838iO;
            Intrinsics.X1ii(obj, "null cannot be cast to non-null type kotlin.Int");
            LogUtils.m11128d(str + " onLLMResult usrContext = " + ((Integer) obj) + "  token = " + AISparkChainManager.XIi00iiXO + "   content = " + llmResult.getContent() + ", status = " + llmResult.getStatus());
            int i = AISparkChainManager.XIi00iiXO;
            if ((obj instanceof Integer) && i == ((Number) obj).intValue()) {
                int status = llmResult.getStatus();
                String content = llmResult.getContent();
                Intrinsics.XXI(content);
                if (content.length() > 0 || status == 2) {
                    AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
                    aISparkChainManager.IiiXiI0I(aISparkChainManager.iOOX010X() + content);
                    aISparkChainManager.IIX1OXO().append(content);
                    O1XIiIO<AIAnswer> o1XIiIOXOO0ii0 = aISparkChainManager.XOO0ii0();
                    if (o1XIiIOXOO0ii0 != null) {
                        o1XIiIOXOO0ii0.handleResponse(new AIAnswer(AIFunctionType.AI, aISparkChainManager.iOOX010X(), status == 2 ? 1 : 0, null, null, 24, null));
                    }
                }
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1(AISparkChainManager.f50838iO + " onLLMResult  status = " + status + "  content = " + llmResult.getContent());
                String language = Locale.getDefault().getLanguage();
                StringBuilder sb = new StringBuilder();
                sb.append("AISparkChainPlay  pronounist  ");
                sb.append(language);
                i1o0oxo1o.OXO1(sb.toString());
                if (q62.OXO1.X11I()) {
                    if (language != null) {
                        int iHashCode = language.hashCode();
                        if (iHashCode != 3179) {
                            if (iHashCode != 3365) {
                                if (iHashCode == 3886 && language.equals(Languages.DEFAULT_LANGUAGE_ZH)) {
                                    language = "zh-Hans";
                                }
                            } else if (language.equals("in")) {
                                language = "id";
                            }
                        } else if (language.equals("cn")) {
                            language = "zh-Hans";
                        }
                    }
                } else if (Intrinsics.XOO0ii0(language, "in")) {
                    language = "id";
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
                LanguageTranslationData languageTranslationData = (LanguageTranslationData) next;
                if (languageTranslationData == null || (ttsViuceName = languageTranslationData.getTtsViuceName()) == null) {
                    ttsViuceName = "x4_enus_catherine_profnews";
                }
                String str2 = ttsViuceName;
                AISparkChainManager aISparkChainManager2 = AISparkChainManager.OXO1;
                if (aISparkChainManager2.XXIIO1i11()) {
                    if (!q62.OXO1.X11I()) {
                        aISparkChainManager2.m38081iI(status, str2);
                    } else if (status == 2) {
                        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, aISparkChainManager2.iOOX010X(), false, false, null, str2, "onLLMResult", 14, null);
                    }
                }
                if (status == 2) {
                    int completionTokens = llmResult.getCompletionTokens();
                    int promptTokens = llmResult.getPromptTokens();
                    int totalTokens = llmResult.getTotalTokens();
                    i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + " completionTokens: " + completionTokens + " promptTokens: " + promptTokens + " totalTokens: " + totalTokens);
                    AISparkChainManager.XO0O10 = true;
                }
            }
        }
    }

    public static final class XO0O10 implements RTASRCallbacks {
        public final /* synthetic */ AITranslation OXO1;

        public XO0O10(AITranslation aITranslation) {
            this.OXO1 = aITranslation;
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onError(RTASR.RtAsrError error, Object obj) {
            Intrinsics.X0O(error, "error");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + "  RTASRCallbacks error code =" + error.getCode() + " , msg = " + error.getErrMsg() + "  ");
            AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
            aISparkChainManager.Ii0i(false);
            O1XIiIO<AITranslation> o1XIiIOXX0 = aISparkChainManager.XX0();
            if (o1XIiIOXX0 != null) {
                String errMsg = error.getErrMsg();
                Intrinsics.O10IXXX0X(errMsg, "getErrMsg(...)");
                o1XIiIOXX0.handleError(errMsg);
            }
        }

        @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
        public void onResult(RTASR.RtAsrResult result, Object obj) {
            Intrinsics.X0O(result, "result");
            i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + "  RTASRCallbacks result.result=" + result.getStatus() + "  result.data = " + result.getData() + "   result.transResult.status = " + result.getTransResult().getStatus() + "  ");
            AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
            if (!aISparkChainManager.IiI10X()) {
                aISparkChainManager.OX110i(true);
            }
            if (result.getTransResult().getStatus() == 2 && aISparkChainManager.OII()) {
                aISparkChainManager.Ii0i(false);
                AITranslation aITranslation = this.OXO1;
                String src = result.getTransResult().getSrc();
                Intrinsics.O10IXXX0X(src, "getSrc(...)");
                aITranslation.setText(src);
                AITranslation aITranslation2 = this.OXO1;
                String dst = result.getTransResult().getDst();
                Intrinsics.O10IXXX0X(dst, "getDst(...)");
                aITranslation2.setDst(dst);
                O1XIiIO<AITranslation> o1XIiIOXX0 = aISparkChainManager.XX0();
                if (o1XIiIOXX0 != null) {
                    o1XIiIOXX0.handleResponse(this.OXO1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.biz.AISparkChainManager$iO */
    public static final class C15432iO implements AsrCallbacks {
        public final /* synthetic */ AITranslation OXO1;

        public C15432iO(AITranslation aITranslation) {
            this.OXO1 = aITranslation;
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onBeginOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onEndOfSpeech() {
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onError(ASR.ASRError error, Object obj) {
            Intrinsics.X0O(error, "error");
            LogUtils.m11128d(AISparkChainManager.f50838iO + " realTimeSendASRInit TTS.TTSError code =" + error.getCode() + ",  errMsg =  " + error.getErrMsg() + "  ");
            RecordingManager.Companion.getInstance().closeBluetooth();
            O1XIiIO<AITranslation> o1XIiIOX0O = AISparkChainManager.OXO1.X0O();
            if (o1XIiIOX0O != null) {
                String errMsg = error.getErrMsg();
                Intrinsics.O10IXXX0X(errMsg, "getErrMsg(...)");
                o1XIiIOX0O.handleError(errMsg);
            }
        }

        @Override // com.iflytek.sparkchain.core.asr.AsrCallbacks
        public void onResult(ASR.ASRResult result, Object obj) {
            Intrinsics.X0O(result, "result");
            LogUtils.m11128d(AISparkChainManager.f50838iO + " realTimeSendASRInit result.st = " + result.getStatus() + " bestMatchText = " + result.getBestMatchText());
            AITranslation aITranslation = this.OXO1;
            String bestMatchText = result.getBestMatchText();
            Intrinsics.O10IXXX0X(bestMatchText, "getBestMatchText(...)");
            aITranslation.setText(bestMatchText);
            this.OXO1.setStatus(result.getStatus());
            LogUtils.m11128d(AISparkChainManager.f50838iO + " realTimeSendASRInit  bestMatchText = " + result.getBestMatchText());
            O1XIiIO<AITranslation> o1XIiIOX0O = AISparkChainManager.OXO1.X0O();
            if (o1XIiIOX0O != null) {
                o1XIiIOX0O.handleResponse(this.OXO1);
            }
            if (result.getStatus() == 2) {
                RecordingManager.Companion companion = RecordingManager.Companion;
                companion.getInstance().setRecording(false);
                companion.getInstance().closeBluetooth();
            }
        }
    }

    public static /* synthetic */ void Ii1iii0(AISparkChainManager aISparkChainManager, String str, O1XIiIO o1XIiIO, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = q62.OXO1.XX00XX();
        }
        if ((i2 & 8) != 0) {
            z = iOOX010X;
        }
        aISparkChainManager.iXiiiO(str, o1XIiIO, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O00(AISparkChainManager aISparkChainManager, String str, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        aISparkChainManager.XO0O10(str, o1XIiIO);
    }

    public static /* synthetic */ void X11I(AISparkChainManager aISparkChainManager, String str, String str2, String str3, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "cn";
        }
        if ((i & 4) != 0) {
            str3 = Languages.DEFAULT_LANGUAGE;
        }
        aISparkChainManager.iiiO(str, str2, str3, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X11iII1O1(AISparkChainManager aISparkChainManager, byte[] bArr, boolean z, int i, O1XIiIO o1XIiIO, boolean z2, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            o1XIiIO = null;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            i2 = 900;
        }
        if ((i3 & 64) != 0) {
            str = "zh_cn";
        }
        if ((i3 & 128) != 0) {
            str2 = "mandarin";
        }
        aISparkChainManager.iX1O1(bArr, z, i, o1XIiIO, z2, i2, str, str2);
    }

    public static /* synthetic */ void X1IX(AISparkChainManager aISparkChainManager, O1XIiIO o1XIiIO, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 900;
        }
        if ((i2 & 4) != 0) {
            str = "zh_cn";
        }
        if ((i2 & 8) != 0) {
            str2 = "mandarin";
        }
        aISparkChainManager.XXX11i(o1XIiIO, i, str, str2);
    }

    public static /* synthetic */ void XXO(AISparkChainManager aISparkChainManager, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 900;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        aISparkChainManager.O001I(i, z);
    }

    public static /* synthetic */ void XXiO0i(AISparkChainManager aISparkChainManager, String str, String str2, String str3, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "cn";
        }
        if ((i & 4) != 0) {
            str3 = Languages.DEFAULT_LANGUAGE;
        }
        aISparkChainManager.IX1XiI(str, str2, str3, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iIXi1iiXI(AISparkChainManager aISparkChainManager, byte[] bArr, String str, String str2, boolean z, int i, O1XIiIO o1XIiIO, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            o1XIiIO = null;
        }
        aISparkChainManager.X0i1O(bArr, str, str2, z2, i, o1XIiIO);
    }

    /* JADX INFO: renamed from: iX */
    public static /* synthetic */ void m38074iX(AISparkChainManager aISparkChainManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = q62.OXO1.XX00XX();
        }
        aISparkChainManager.i010I(i);
    }

    @tb1
    public final O1XIiIO<Bitmap> I0IIOi() {
        return OIi0;
    }

    public final boolean I0iXXO() {
        return X0O;
    }

    /* JADX INFO: renamed from: I1 */
    public final int m38075I1() {
        return II1Xi0;
    }

    @tb1
    public final ASR I1XOi1() {
        return XiOIii1;
    }

    public final void II1Xi0() {
        LLMConfig lLMConfigBuilder = LLMConfig.builder();
        lLMConfigBuilder.domain("tti");
        lLMConfigBuilder.url("tti:https://spark-api.cn-huabei-1.xf-yun.com/v2.1/tti");
        IiI10X = LLMFactory.imageGeneration(lLMConfigBuilder);
    }

    @aa1
    public final StringBuffer IIX1OXO() {
        return f50836OX;
    }

    /* JADX INFO: renamed from: IO */
    public final int m38076IO() {
        return IIX1OXO;
    }

    public final void IO0II0i(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        iOO1ii1 = str;
    }

    public final int IO0iXO0O() {
        String strIXO0OOi;
        MacConfig macConfig;
        if (O10IXXX0X) {
            return I1XOi1;
        }
        BleCache bleCache = BleCache.INSTANCE;
        if (bleCache.getMBleAddress().length() == 0) {
            ToastUtils.showLong(R.string.not_connected);
            return IIX1OXO;
        }
        if (!X0O) {
            i1O0OXO1O.OXO1.OXO1(f50838iO + "   sparkChainInit  isSupportInitializeSDK = " + X0O);
            ToastUtils.showLong(R.string.spark_exist_fail);
            return XiOIO;
        }
        q62 q62Var = q62.OXO1;
        if (q62Var.ii00OXXO()) {
            DeviceConfigInfo deviceConfigInfoO1i0 = q62Var.O1i0();
            strIXO0OOi = (deviceConfigInfoO1i0 == null || (macConfig = deviceConfigInfoO1i0.getMacConfig()) == null) ? null : macConfig.getMac();
        } else {
            strIXO0OOi = oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
        }
        SparkChainConfig sparkChainConfigBuilder = SparkChainConfig.builder();
        sparkChainConfigBuilder.appID(I0iXXO).apiKey(XXI).apiSecret(X1ii).uid(strIXO0OOi).logLevel(0).logPath(uz0.m3192iO(sz0.OXO1, "AI_SPARK_CHAIN_" + O0X11OiO.O00().format(new Date()) + ".txt").getAbsolutePath());
        int iInit = SparkChain.getInst().init(Utils.getApp(), sparkChainConfigBuilder);
        O10IXXX0X = iInit == 0;
        i1O0OXO1O.OXO1.OXO1(f50838iO + " sparkChainInit ret = " + iInit + "  uid = " + strIXO0OOi + " , isForceSparkChainAI = " + q62Var.ii00OXXO() + " ,  isConfigurationSparkChainAI = " + q62Var.i0101i() + " ");
        return iInit;
    }

    public final void IX0IXOi() {
        SparkChain.getInst().unInit();
    }

    public final void IX1XiI(@aa1 String text, @aa1 String lang, @aa1 String targetLang, @aa1 O1XIiIO<String> callback) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(targetLang, "targetLang");
        Intrinsics.X0O(callback, "callback");
        if (IO0iXO0O() != 0) {
            i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRDataIdentify  sparkChainInit return ");
            return;
        }
        ITS its = new ITS(lang, targetLang, TransType.ITRANS);
        i1O0OXO1O.OXO1.OXO1(f50838iO + "  translateITS  text = " + text + "  lang = " + lang + "  targetLang = " + targetLang);
        its.registerCallbacks(new IiI10X(callback));
        its.arun(text, "xdx");
        iOOX010X = true;
    }

    public final void IXI(boolean z) {
        f50839iX = z;
    }

    public final void IXOIIIO(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        IXXOO = str;
    }

    public final boolean IXXOO() {
        return XXIIO1i11;
    }

    public final void Ii0X0X(@aa1 StringBuffer stringBuffer) {
        Intrinsics.X0O(stringBuffer, "<set-?>");
        f50836OX = stringBuffer;
    }

    public final void Ii0i(boolean z) {
        f50835IO = z;
    }

    public final boolean IiI10X() {
        return iIiiO;
    }

    public final void IiiXiI0I(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        XOO0ii0 = str;
    }

    public final void O001I(int i, boolean z) {
        ASR asr;
        ASR asr2 = XiOIii1;
        if (asr2 != null) {
            if (asr2 != null) {
                asr2.stop(z);
            }
            AudioAttributes audioAttributes = new AudioAttributes();
            if (!XXIIO1i11 && (asr = XiOIii1) != null) {
                asr.vadEos(i);
            }
            ASR asr3 = XiOIii1;
            Integer numValueOf = asr3 != null ? Integer.valueOf(asr3.start(audioAttributes, "tag")) : null;
            m38079Oi(numValueOf);
            i1O0OXO1O.OXO1.OXO1(f50838iO + "  isASRSteam = " + XXIIO1i11 + " , vadEos = " + i + " , realTimeStart_ASR asr  ret = " + numValueOf);
        }
    }

    public final void O0O0X0iOi() {
        ASR asr = XiOIii1;
        if (asr != null) {
            asr.stop(false);
        }
        LLM llm = O00;
        if (llm != null) {
            llm.stop();
        }
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
        return f50835IO;
    }

    public final int OIX0iXi() {
        return I1XOi1;
    }

    public final int OIi0() {
        return XiOIO;
    }

    /* JADX INFO: renamed from: OO */
    public final void m38077OO(@tb1 O1XIiIO<AIAnswer> o1XIiIO) {
        I0IIOi = o1XIiIO;
    }

    /* JADX INFO: renamed from: OX */
    public final boolean m38078OX() {
        return f50839iX;
    }

    public final void OX110i(boolean z) {
        iIiiO = z;
    }

    /* JADX INFO: renamed from: Oi */
    public final void m38079Oi(@tb1 Integer num) {
        if (num != null && num.intValue() == 18020) {
            a01.OXO1.XIi00iiXO().put(b01.i0X1iIO + oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), "");
            ToastUtils.showLong(UtilsKt.XXO(R.string.spark_exist_fail) + "  " + num, new Object[0]);
        }
    }

    @aa1
    public final String OiIIX101O() {
        return IXXOO;
    }

    public final void X00XIX1(boolean z) {
        i1O0OXO1O.OXO1.OXO1(f50838iO + "  setIsSupportInitializeSDK  b = " + z);
        X0O = z;
    }

    public final void X00Xi1X(@tb1 RTASR rtasr) {
        XX0 = rtasr;
    }

    @aa1
    public final String X01IiOiIi() {
        return O1O;
    }

    @tb1
    public final O1XIiIO<AITranslation> X0O() {
        return OII;
    }

    public final void X0i1O(@aa1 byte[] bArr, @aa1 String lang, @aa1 String targetLang, boolean z, int i, @tb1 O1XIiIO<AITranslation> o1XIiIO) {
        RTASR rtasr;
        Intrinsics.X0O(bArr, "byte");
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(targetLang, "targetLang");
        if (IO0iXO0O() != 0) {
            return;
        }
        if (z) {
            RTASR rtasr2 = XX0;
            if (rtasr2 != null) {
                rtasr2.stop();
            }
            XX0 = null;
            return;
        }
        OiIIX101O = o1XIiIO;
        if (XX0 == null) {
            iXiX011(lang, targetLang);
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[i];
            while (true) {
                int i2 = byteArrayInputStream.read(bArr2);
                Unit unit = Unit.OXO1;
                if (-1 == i2) {
                    byteArrayInputStream.close();
                    return;
                } else if (i2 > 0 && (rtasr = XX0) != null) {
                    rtasr.write((byte[]) bArr2.clone());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m38080X1(@tb1 O1XIiIO<AITranslation> o1XIiIO) {
        OiIIX101O = o1XIiIO;
    }

    public final void X100O(@aa1 String pcmFilePath, @aa1 O1XIiIO<AITranslation> callback) {
        RTASR rtasr;
        Intrinsics.X0O(pcmFilePath, "pcmFilePath");
        Intrinsics.X0O(callback, "callback");
        if (IO0iXO0O() != 0) {
            i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRDataIdentify  sparkChainInit return ");
            return;
        }
        if (f50835IO) {
            i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRDataIdentify  mRTASRIsRun = return");
            return;
        }
        OiIIX101O = callback;
        i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRDataIdentify  pcmFilePath = " + pcmFilePath);
        iIiiO = false;
        f50835IO = true;
        XX0 = new RTASR(OIX0iXi);
        AITranslation aITranslation = new AITranslation(null, null, 0, 7, null);
        DcsTtsPlayer.INSTANCE.initSegmentation();
        RTASR rtasr2 = XX0;
        if (rtasr2 != null) {
            rtasr2.registerCallbacks(new O00(aITranslation));
        }
        RTASR rtasr3 = XX0;
        if (rtasr3 != null) {
            rtasr3.transType("normal");
        }
        RTASR rtasr4 = XX0;
        if (rtasr4 != null) {
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            rtasr4.lang(UtilsKt.IXI(app) ? "cn" : Languages.DEFAULT_LANGUAGE);
        }
        RTASR rtasr5 = XX0;
        Intrinsics.XXI(rtasr5);
        int iStart = rtasr5.start("xdx");
        m38079Oi(Integer.valueOf(iStart));
        if (iStart == 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(pcmFilePath);
                byte[] bArr = new byte[1280];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    Unit unit = Unit.OXO1;
                    if (-1 == i) {
                        break;
                    } else if (i > 0 && (rtasr = XX0) != null) {
                        rtasr.write((byte[]) bArr.clone());
                    }
                }
                fileInputStream.close();
                RTASR rtasr6 = XX0;
                if (rtasr6 != null) {
                    rtasr6.stop();
                }
            } catch (Exception e) {
                RTASR rtasr7 = XX0;
                if (rtasr7 != null) {
                    rtasr7.stop();
                }
                e.printStackTrace();
            }
        }
    }

    public final int X1ii(@aa1 String input) {
        Intrinsics.X0O(input, "input");
        int length = input.length();
        do {
            length--;
            if (-1 >= length) {
                return -1;
            }
        } while (!f50837iI.matches(String.valueOf(input.charAt(length))));
        return length;
    }

    public final void XO0O10(@aa1 String inputText, @tb1 O1XIiIO<Bitmap> o1XIiIO) {
        Intrinsics.X0O(inputText, "inputText");
        if (IO0iXO0O() != 0) {
            return;
        }
        II1Xi0();
        OIi0 = o1XIiIO;
        LLM llm = IiI10X;
        if (llm != null) {
            llm.arun(inputText);
        }
        i1O0OXO1O.OXO1.OXO1(f50838iO + " generateAIGC inputText = " + inputText);
        LLM llm2 = IiI10X;
        if (llm2 != null) {
            llm2.registerLLMCallbacks(new OXO1());
        }
    }

    public final void XO0X10iO(@tb1 ASR asr) {
        XiOIii1 = asr;
    }

    public final void XOIX(boolean z) {
        i010I = z;
    }

    public final void XOO0XOOii(boolean z) {
        f50839iX = z;
        if (z) {
            IXXOO = "";
            iOO1ii1 = "";
        }
    }

    @tb1
    public final O1XIiIO<AIAnswer> XOO0ii0() {
        return I0IIOi;
    }

    public final void XOX0O0(@tb1 O1XIiIO<Bitmap> o1XIiIO) {
        OIi0 = o1XIiIO;
    }

    public final void XOXiX0(boolean z) {
        iOOX010X = z;
    }

    @tb1
    public final O1XIiIO<AITranslation> XX0() {
        return OiIIX101O;
    }

    public final List<String> XX00i10X(String str) {
        return f50837iI.split(str, 0);
    }

    public final void XX1Oi(boolean z) {
        XXIIO1i11 = z;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    /* JADX WARN: Instruction removed from duplicated block: B:6:0x0035, please report this as an issue */
    public final String XXI() {
        String str;
        Locale locale = Utils.getApp().getResources().getConfiguration().getLocales().get(0);
        if (locale != null) {
            str = "请用" + locale.getDisplayLanguage(Locale.CHINA) + "回答问题!";
            if (str == null) {
                str = "请用语言缩写为" + Locale.getDefault().getLanguage() + "的语言类型回答.";
            }
        } else {
            str = "请用语言缩写为" + Locale.getDefault().getLanguage() + "的语言类型回答.";
        }
        i1O0OXO1O.OXO1.OXO1(f50838iO + " getLanguagePrompt() prompt = " + str);
        return str;
    }

    public final boolean XXIIO1i11() {
        return iOOX010X;
    }

    public final void XXX11i(@tb1 O1XIiIO<AITranslation> o1XIiIO, int i, @aa1 String language, @aa1 String accent) {
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(accent, "accent");
        if (o1XIiIO != null) {
            OII = o1XIiIO;
        }
        XiOIii1 = new ASR(language, AuthenticationTokenClaims.JSON_KEY_IAT, accent);
        AITranslation aITranslation = new AITranslation(null, null, 0, 7, null);
        ASR asr = XiOIii1;
        if (asr != null) {
            asr.registerCallbacks(new C15432iO(aITranslation));
        }
        XXO(this, i, false, 2, null);
    }

    public final void XXiIiX10(int i) {
        f50834I1 = i;
    }

    public final int XiOIO() {
        return f50834I1;
    }

    @aa1
    public final String XiOIii1() {
        return iOO1ii1;
    }

    public final void i010I(int i) {
        LLMConfig lLMConfigBuilder = LLMConfig.builder();
        lLMConfigBuilder.domain("generalv3.5");
        lLMConfigBuilder.url("ws(s)://spark-api.xf-yun.com/v3.5/chat");
        LLM llm = new LLM(lLMConfigBuilder, Memory.windowMemory(5));
        O00 = llm;
        llm.registerLLMCallbacks(X01IiOiIi);
    }

    public final void i0X000X0O(@aa1 LLMCallbacks lLMCallbacks) {
        Intrinsics.X0O(lLMCallbacks, "<set-?>");
        X01IiOiIi = lLMCallbacks;
    }

    public final void i11I(@tb1 O1XIiIO<AITranslation> o1XIiIO) {
        OII = o1XIiIO;
    }

    /* JADX INFO: renamed from: iI */
    public final void m38081iI(int i, @aa1 String rtasrLanguage) {
        String strSubstring;
        Intrinsics.X0O(rtasrLanguage, "rtasrLanguage");
        if (!iOOX010X || f50836OX.length() <= 0 || i != 1) {
            if (i == 2) {
                if (f50834I1 == 0) {
                    DcsTtsPlayer.INSTANCE.initSegmentation();
                }
                DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                String string = f50836OX.toString();
                Intrinsics.O10IXXX0X(string, "toString(...)");
                DcsTtsPlayer.play$default(dcsTtsPlayer, string, true, true, null, rtasrLanguage, "newSegmentationPlay1", 8, null);
                return;
            }
            return;
        }
        String string2 = f50836OX.toString();
        Intrinsics.O10IXXX0X(string2, "toString(...)");
        List<String> listXX00i10X = XX00i10X(string2);
        int size = listXX00i10X.size();
        int i2 = II1Xi0;
        int i3 = f50834I1;
        if (size >= i2 + i3) {
            if (i3 == 0) {
                DcsTtsPlayer.INSTANCE.initSegmentation();
            }
            int iIndexOf = f50836OX.indexOf(listXX00i10X.get((f50834I1 + i2) - 1));
            if (listXX00i10X.get((f50834I1 + i2) - 1).length() + iIndexOf + 1 < f50836OX.length()) {
                strSubstring = f50836OX.substring(0, iIndexOf + listXX00i10X.get((i2 + f50834I1) - 1).length() + 1);
            } else {
                StringBuffer stringBuffer = f50836OX;
                String string3 = stringBuffer.toString();
                Intrinsics.O10IXXX0X(string3, "toString(...)");
                strSubstring = stringBuffer.substring(0, X1ii(string3));
            }
            String str = strSubstring;
            if (str.length() < 3) {
                return;
            }
            f50834I1++;
            DcsTtsPlayer dcsTtsPlayer2 = DcsTtsPlayer.INSTANCE;
            Intrinsics.XXI(str);
            DcsTtsPlayer.play$default(dcsTtsPlayer2, str, true, true, null, rtasrLanguage, "newSegmentationPlay", 8, null);
            f50836OX.delete(0, str.length());
        }
    }

    @tb1
    public final RTASR iIiiO() {
        return XX0;
    }

    public final void iOI() {
        RTASR rtasr = XX0;
        if (rtasr != null) {
            rtasr.stop();
        }
        LLM llm = O00;
        if (llm != null) {
            llm.stop();
        }
        iOOX010X = false;
    }

    public final boolean iOO1ii1() {
        return O10IXXX0X;
    }

    @aa1
    public final String iOOX010X() {
        return XOO0ii0;
    }

    public final void iOiXi11II(boolean z) {
        O10IXXX0X = z;
    }

    public final void iX1O1(@aa1 byte[] bArr, boolean z, int i, @tb1 O1XIiIO<AITranslation> o1XIiIO, boolean z2, int i2, @aa1 String language, @aa1 String accent) {
        ASR asr;
        Intrinsics.X0O(bArr, "byte");
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(accent, "accent");
        if (IO0iXO0O() != 0) {
            return;
        }
        if (z) {
            ASR asr2 = XiOIii1;
            if (asr2 != null) {
                asr2.stop(false);
            }
            XiOIii1 = null;
            return;
        }
        XXIIO1i11 = z2;
        if (XiOIii1 == null) {
            XXX11i(o1XIiIO, i2, language, accent);
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[i];
            while (true) {
                int i3 = byteArrayInputStream.read(bArr2);
                Unit unit = Unit.OXO1;
                if (-1 == i3) {
                    byteArrayInputStream.close();
                    return;
                } else if (i3 > 0 && (asr = XiOIii1) != null) {
                    asr.write((byte[]) bArr2.clone());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void iXiX011(@aa1 String lang, @aa1 final String targetLang) {
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(targetLang, "targetLang");
        iIiiO = false;
        f50835IO = true;
        XX0 = new RTASR(OIX0iXi);
        i010I = (Intrinsics.XOO0ii0(lang, "cn") || Intrinsics.XOO0ii0(targetLang, "cn")) ? false : true;
        final AITranslation aITranslation = new AITranslation(null, null, 0, 7, null);
        DcsTtsPlayer.INSTANCE.initSegmentation();
        RTASR rtasr = XX0;
        if (rtasr != null) {
            rtasr.registerCallbacks(new RTASRCallbacks() { // from class: com.sma.smartv3.biz.AISparkChainManager$realTimeSendRTASRInit$1
                @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
                public void onBeginOfSpeech() {
                }

                @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
                public void onEndOfSpeech() {
                }

                @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
                public void onError(RTASR.RtAsrError error, Object obj) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1(AISparkChainManager.f50838iO + "  sendRTASRDataIdentify error=" + error.getCode() + " , msg = " + error.getErrMsg());
                    AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
                    aISparkChainManager.Ii0i(false);
                    O1XIiIO<AITranslation> o1XIiIOXX0 = aISparkChainManager.XX0();
                    if (o1XIiIOXX0 != null) {
                        String errMsg = error.getErrMsg();
                        Intrinsics.O10IXXX0X(errMsg, "getErrMsg(...)");
                        o1XIiIOXX0.handleError(errMsg);
                    }
                }

                @Override // com.iflytek.sparkchain.core.rtasr.RTASRCallbacks
                public void onResult(RTASR.RtAsrResult result, Object obj) {
                    String dst;
                    Intrinsics.X0O(result, "result");
                    i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                    i1o0oxo1o.OXO1(AISparkChainManager.f50838iO + "  sendRTASRDataIdentify  result.result=" + result.getStatus() + "  , result.transResult.status = " + result.getTransResult().getStatus() + "  ");
                    i1o0oxo1o.OXO1(AISparkChainManager.f50838iO + "  sendRTASRDataIdentify  result.data=" + result.getData() + " ,  result.transResult.src = " + result.getTransResult().getSrc() + " ,  result.transResult.dst = " + result.getTransResult().getDst());
                    AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
                    if (!aISparkChainManager.IiI10X()) {
                        aISparkChainManager.OX110i(true);
                    }
                    if (aISparkChainManager.m38078OX()) {
                        aISparkChainManager.IXI(false);
                        AITranslation aITranslation2 = aITranslation;
                        String data = result.getData();
                        Intrinsics.O10IXXX0X(data, "getData(...)");
                        aITranslation2.setText(data);
                        if (!aISparkChainManager.O1O()) {
                            AITranslation aITranslation3 = aITranslation;
                            if (aISparkChainManager.OII()) {
                                dst = APSSharedUtil.TRUNCATE_SEPARATOR;
                            } else {
                                dst = result.getTransResult().getDst();
                                Intrinsics.O10IXXX0X(dst, "getDst(...)");
                            }
                            aITranslation3.setDst(dst);
                        }
                        aITranslation.setStatus(0);
                        O1XIiIO<AITranslation> o1XIiIOXX0 = aISparkChainManager.XX0();
                        if (o1XIiIOXX0 != null) {
                            o1XIiIOXX0.handleResponse(aITranslation);
                        }
                    }
                    if (result.getStatus() == 1 || result.getTransResult().getStatus() == 1) {
                        aITranslation.setText(aISparkChainManager.OiIIX101O() + result.getData());
                        if (!aISparkChainManager.O1O()) {
                            aITranslation.setDst(aISparkChainManager.XiOIii1() + result.getTransResult().getDst());
                        }
                        aITranslation.setStatus(1);
                        O1XIiIO<AITranslation> o1XIiIOXX1 = aISparkChainManager.XX0();
                        if (o1XIiIOXX1 != null) {
                            o1XIiIOXX1.handleResponse(aITranslation);
                        }
                    }
                    if (result.getStatus() == 2) {
                        aISparkChainManager.IXOIIIO(aISparkChainManager.OiIIX101O() + result.getData());
                    }
                    if (result.getTransResult().getStatus() == 2) {
                        aISparkChainManager.IO0II0i(aISparkChainManager.XiOIii1() + result.getTransResult().getDst());
                    }
                    if (result.getStatus() == 3 && aISparkChainManager.OII()) {
                        aISparkChainManager.Ii0i(false);
                        if (aISparkChainManager.O1O()) {
                            aITranslation.setText(aISparkChainManager.OiIIX101O());
                            String strXiOIii1 = aISparkChainManager.XiOIii1();
                            String str = targetLang;
                            final AITranslation aITranslation4 = aITranslation;
                            aISparkChainManager.IX1XiI(strXiOIii1, "cn", str, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.AISparkChainManager$realTimeSendRTASRInit$1$onResult$1
                                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                                public void handleResponse(String str2) {
                                    AITranslation aITranslation5 = aITranslation4;
                                    Intrinsics.XXI(str2);
                                    aITranslation5.setDst(str2);
                                    aITranslation4.setStatus(3);
                                    O1XIiIO<AITranslation> o1XIiIOXX2 = AISparkChainManager.OXO1.XX0();
                                    if (o1XIiIOXX2 != null) {
                                        o1XIiIOXX2.handleResponse(aITranslation4);
                                    }
                                }

                                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                                public void handleError(String error) {
                                    Intrinsics.X0O(error, "error");
                                    aITranslation4.setDst(error);
                                    aITranslation4.setStatus(3);
                                    O1XIiIO<AITranslation> o1XIiIOXX2 = AISparkChainManager.OXO1.XX0();
                                    if (o1XIiIOXX2 != null) {
                                        o1XIiIOXX2.handleResponse(aITranslation4);
                                    }
                                }
                            });
                            aISparkChainManager.XOIX(false);
                            return;
                        }
                        aITranslation.setText(aISparkChainManager.OiIIX101O());
                        aITranslation.setDst(aISparkChainManager.XiOIii1());
                        aITranslation.setStatus(3);
                        O1XIiIO<AITranslation> o1XIiIOXX2 = aISparkChainManager.XX0();
                        if (o1XIiIOXX2 != null) {
                            o1XIiIOXX2.handleResponse(aITranslation);
                        }
                    }
                }
            });
        }
        RTASR rtasr2 = XX0;
        if (rtasr2 != null) {
            rtasr2.transType("normal");
        }
        RTASR rtasr3 = XX0;
        if (rtasr3 != null) {
            rtasr3.lang(lang);
        }
        if (i010I) {
            RTASR rtasr4 = XX0;
            if (rtasr4 != null) {
                rtasr4.targetLang("cn");
            }
        } else {
            RTASR rtasr5 = XX0;
            if (rtasr5 != null) {
                rtasr5.targetLang(targetLang);
            }
        }
        RTASR rtasr6 = XX0;
        Intrinsics.XXI(rtasr6);
        int iStart = rtasr6.start("xdx");
        m38079Oi(Integer.valueOf(iStart));
        f50839iX = iStart == 0;
    }

    public final void iXiiiO(@aa1 String inputText, @tb1 O1XIiIO<AIAnswer> o1XIiIO, int i, boolean z) {
        Intrinsics.X0O(inputText, "inputText");
        if (IO0iXO0O() != 0) {
            return;
        }
        f50834I1 = 0;
        f50836OX.setLength(0);
        i010I(i);
        LLM llm = O00;
        Intrinsics.XXI(llm);
        llm.stop();
        AIManager.OXO1.i11I(0);
        XOO0ii0 = "";
        XIi00iiXO++;
        q62 q62Var = q62.OXO1;
        if (q62Var.IIIO1i()) {
            LLM llm2 = O00;
            if (llm2 != null) {
                llm2.addSystemPrompt("你是由百度研发的智能大模型,名字和模型名都叫" + UtilsKt.XXO(R.string.wenxinyiyan) + ",回答用户的问题时保持简洁明了,避免冗长的解释,严格按照用户使用的语言回答问题，确保沟通顺畅.如果用户询问“你是什么模型”、“你是谁”此类问题，统一回答“你好呀！我是" + UtilsKt.XXO(R.string.wenxinyiyan) + "，有什么可以帮您吗？”");
            }
        } else {
            String strIiiO = q62Var.iiiO();
            LLM llm3 = O00;
            if (llm3 != null) {
                llm3.addSystemPrompt("回答用户的问题时保持简洁明了，避免冗长的解释，确保沟通顺畅. " + XXI() + " " + strIiiO);
            }
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = f50838iO;
        i1o0oxo1o.OXO1(str + " sendMsg inputText = " + inputText + "  limitQuery = " + inputText);
        LLM llm4 = O00;
        Intrinsics.XXI(llm4);
        int iArun = llm4.arun(inputText, Integer.valueOf(XIi00iiXO));
        if (iArun == 0) {
            iOOX010X = z;
            OIi0 = null;
            I0IIOi = o1XIiIO;
            XO0O10 = false;
            return;
        }
        i1o0oxo1o.OXO1(str + " SparkChain sendMsg failed:" + iArun + "  token = " + XIi00iiXO);
    }

    public final void iiIOiX(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        O1O = str;
    }

    public final void iiiO(@aa1 String pcmFilePath, @aa1 String lang, @aa1 String targetLang, @aa1 O1XIiIO<AITranslation> callback) {
        RTASR rtasr;
        Intrinsics.X0O(pcmFilePath, "pcmFilePath");
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(targetLang, "targetLang");
        Intrinsics.X0O(callback, "callback");
        if (IO0iXO0O() != 0) {
            i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRData  sparkChainInit return ");
            return;
        }
        if (f50835IO) {
            i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRData  mRTASRIsRun = return ");
            return;
        }
        OiIIX101O = callback;
        i1O0OXO1O.OXO1.OXO1(f50838iO + " sendRTASRData  pcmFilePath = " + pcmFilePath + "  lang = " + lang + "  targetLang = " + targetLang);
        f50835IO = true;
        iIiiO = false;
        XX0 = new RTASR(OIX0iXi);
        AITranslation aITranslation = new AITranslation(null, null, 0, 7, null);
        DcsTtsPlayer.INSTANCE.initSegmentation();
        RTASR rtasr2 = XX0;
        if (rtasr2 != null) {
            rtasr2.registerCallbacks(new XO0O10(aITranslation));
        }
        RTASR rtasr3 = XX0;
        if (rtasr3 != null) {
            rtasr3.transType("normal");
        }
        RTASR rtasr4 = XX0;
        if (rtasr4 != null) {
            rtasr4.lang(lang);
        }
        RTASR rtasr5 = XX0;
        if (rtasr5 != null) {
            rtasr5.targetLang(targetLang);
        }
        RTASR rtasr6 = XX0;
        Intrinsics.XXI(rtasr6);
        int iStart = rtasr6.start("xdx");
        m38079Oi(Integer.valueOf(iStart));
        if (iStart == 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(pcmFilePath);
                byte[] bArr = new byte[1280];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    Unit unit = Unit.OXO1;
                    if (-1 == i) {
                        break;
                    } else if (i > 0 && (rtasr = XX0) != null) {
                        rtasr.write((byte[]) bArr.clone());
                    }
                }
                fileInputStream.close();
                RTASR rtasr7 = XX0;
                if (rtasr7 != null) {
                    rtasr7.stop();
                }
            } catch (Exception e) {
                RTASR rtasr8 = XX0;
                if (rtasr8 != null) {
                    rtasr8.stop();
                }
                e.printStackTrace();
            }
        }
    }
}
