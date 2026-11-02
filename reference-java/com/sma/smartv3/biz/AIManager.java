package com.sma.smartv3.biz;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X1i;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.dcs.DcsToken;
import com.sma.smartv3.biz.p605ai.AIBase;
import com.sma.smartv3.biz.p605ai.AIError;
import com.sma.smartv3.biz.p605ai.SSE;
import com.sma.smartv3.biz.p605ai.completion.chat.ChatCompletionResult;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.biz.voice.p244ai.WebSocketManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AITranslationUrl;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleInfo;
import com.sma.smartv3.network.GetAIChat;
import com.sma.smartv3.network.GetAIChatV2;
import com.sma.smartv3.network.GetCallTranslationUrl;
import com.sma.smartv3.network.GetDcsToken;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleVoice;
import java.io.BufferedReader;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.sse.EventSource;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,801:1\n18#2,2:802\n15#2:804\n18#2,2:806\n15#2:808\n18#2,2:809\n15#2:811\n19#2:861\n15#2:862\n1#3:805\n176#4,11:812\n196#4:831\n258#4,11:832\n279#4:860\n258#4,11:863\n279#4:891\n252#5,7:823\n270#5:830\n359#5,17:843\n359#5,17:874\n*S KotlinDebug\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager\n*L\n431#1:802,2\n431#1:804\n436#1:806,2\n436#1:808\n567#1:809,2\n567#1:811\n781#1:861\n781#1:862\n575#1:812,11\n575#1:831\n754#1:832,11\n754#1:860\n786#1:863,11\n786#1:891\n575#1:823,7\n575#1:830\n754#1:843,17\n786#1:874,17\n*E\n"})
public final class AIManager {

    @tb1
    public static EventSource I0IIOi = null;

    @tb1
    public static ThreadUtils.SimpleTask<Void> I0iXXO = null;

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final String f50827IO = "CkWnW1dv5poz8AGkU78hjsDuu7M38XnH";

    @aa1
    public static final String OIX0iXi = "https://duer-kids.baidu.com/botwatch/api/operation/aigc/stream/dcschat";

    @aa1
    public static final String OIi0 = "openAiChatCompletion";

    @aa1
    public static final String XIi00iiXO = "AIManager";

    @tb1
    public static EventSource XOO0ii0 = null;

    @aa1
    public static final String XXI = "https://api.openai.com/v1/chat/completions";

    /* JADX INFO: renamed from: iO */
    @tb1
    public static O1XIiIO<AIAnswer> f50828iO;

    @aa1
    public static final AIManager OXO1 = new AIManager();
    public static boolean XO0O10 = true;
    public static int O00 = 80;

    @aa1
    public static final Handler IiI10X = new Handler(Looper.getMainLooper());

    @SourceDebugExtension({"SMAP\nAIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,801:1\n106#2:802\n78#2,22:803\n*S KotlinDebug\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n*L\n654#1:802\n654#1:803,22\n*E\n"})
    public static final class OXO1 extends ThreadUtils.SimpleTask<Void> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ int f50829I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ String f50830IO;
        public final /* synthetic */ AIFunctionType iX1O1;

        public OXO1(String str, int i, AIFunctionType aIFunctionType) {
            this.f50830IO = str;
            this.f50829I1 = i;
            this.iX1O1 = aIFunctionType;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            AIError aIError;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1("AIManager openAiChatCompletion -> " + this.f50830IO);
            ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post(AIManager.XXI).setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + q62.OXO1.iIiiO());
            AIManager aIManager = AIManager.OXO1;
            byte[] bytes = AIManager.OiIIX101O(aIManager, this.f50830IO, false, this.f50829I1, 2, null).getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            ANResponse aNResponseExecuteForOkHttpResponse = postRequestBuilderAddHeaders.addByteBody(bytes).setPriority(Priority.LOW).setTag((Object) AIManager.OIi0).build().executeForOkHttpResponse();
            AIFunctionType aIFunctionType = this.iX1O1;
            try {
                Response okHttpResponse = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                Integer numValueOf = okHttpResponse != null ? Integer.valueOf(okHttpResponse.code()) : null;
                Response okHttpResponse2 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                ResponseBody responseBodyBody = okHttpResponse2 != null ? okHttpResponse2.body() : null;
                if (numValueOf != null && numValueOf.intValue() == 200) {
                    BufferedReader bufferedReader = new BufferedReader(responseBodyBody != null ? responseBodyBody.charStream() : null);
                    StringBuilder sb = new StringBuilder();
                    SSE sse = null;
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        i1O0OXO1O.OXO1.OXO1("AIManager openAiChatCompletion -> " + line);
                        if (oe5.m2764O0(line, "data:", false, 2, null)) {
                            String strSubstring = line.substring(5);
                            Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                            int length = strSubstring.length() - 1;
                            int i = 0;
                            boolean z = false;
                            while (i <= length) {
                                boolean z2 = Intrinsics.iIiiO(strSubstring.charAt(!z ? i : length), 32) <= 0;
                                if (z) {
                                    if (!z2) {
                                        break;
                                    }
                                    length--;
                                } else if (z2) {
                                    i++;
                                } else {
                                    z = true;
                                }
                            }
                            sse = new SSE(strSubstring.subSequence(i, length + 1).toString());
                        } else if (Intrinsics.XOO0ii0(line, "") && sse != null) {
                            if (sse.isDone()) {
                                String string = sb.toString();
                                Intrinsics.O10IXXX0X(string, "toString(...)");
                                AIAnswer aIAnswer = new AIAnswer(aIFunctionType, string, 1, null, null, 24, null);
                                AIManager aIManager2 = AIManager.OXO1;
                                O1XIiIO<AIAnswer> o1XIiIOIIiiO = aIManager2.iIiiO();
                                if (o1XIiIOIIiiO != null) {
                                    o1XIiIOIIiiO.handleResponse(aIAnswer);
                                }
                                if (!aIManager2.iX1O1()) {
                                    break;
                                }
                                DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                                String string2 = sb.toString();
                                Intrinsics.O10IXXX0X(string2, "toString(...)");
                                DcsTtsPlayer.play$default(dcsTtsPlayer, string2, false, false, null, null, AIManager.OIi0, 30, null);
                                break;
                            }
                            sb.append(((ChatCompletionResult) new Gson().fromJson(sse.getData(), ChatCompletionResult.class)).getChoices().get(0).getDelta().getContent());
                            String string3 = sb.toString();
                            Intrinsics.O10IXXX0X(string3, "toString(...)");
                            AIAnswer aIAnswer2 = new AIAnswer(aIFunctionType, string3, 0, null, null, 24, null);
                            O1XIiIO<AIAnswer> o1XIiIOIIiiO2 = AIManager.OXO1.iIiiO();
                            if (o1XIiIOIIiiO2 != null) {
                                o1XIiIOIIiiO2.handleResponse(aIAnswer2);
                            }
                            sse = null;
                        }
                    }
                } else {
                    String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                    if (!TextUtils.isEmpty(strString)) {
                        Intrinsics.XXI(strString);
                        AIBase aIBase = (AIBase) UtilsKt.iOOX010X(strString, AIBase.class);
                        if (aIBase == null || (aIError = aIBase.getError()) == null) {
                            aIError = new AIError(String.valueOf(numValueOf), null, null, null, 14, null);
                        }
                        aIManager.O1O(aIError);
                        O1XIiIO<AIAnswer> o1XIiIOIIiiO3 = aIManager.iIiiO();
                        if (o1XIiIOIIiiO3 != null) {
                            o1XIiIOIIiiO3.handleError(aIError.getMessage());
                        }
                    }
                    i1o0oxo1o.OXO1("AIManager openAiChatCompletion -> code:" + numValueOf + ", error:" + strString);
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (!(e instanceof InterruptedIOException)) {
                    ToastUtils.showLong(UtilsKt.XXO(R.string.request_error), new Object[0]);
                    O1XIiIO<AIAnswer> o1XIiIOIIiiO4 = AIManager.OXO1.iIiiO();
                    if (o1XIiIOIIiiO4 != null) {
                        o1XIiIOIIiiO4.handleError(String.valueOf(e.getMessage()));
                    }
                }
                i1O0OXO1O.OXO1.OXO1("AIManager openAiChatCompletion -> error:" + e.getMessage());
            }
            return null;
        }
    }

    public static final class XIi00iiXO implements WebSocketManager.OnCallback {
        public final /* synthetic */ StringBuilder OXO1;
        public final /* synthetic */ AIAnswer XIi00iiXO;

        public XIi00iiXO(StringBuilder sb, AIAnswer aIAnswer) {
            this.OXO1 = sb;
            this.XIi00iiXO = aIAnswer;
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onEmotion(String emotion) {
            O1XIiIO<AIAnswer> o1XIiIOIIiiO;
            Intrinsics.X0O(emotion, "emotion");
            if (!q62.OXO1.Xi1XO00() || (o1XIiIOIIiiO = AIManager.OXO1.iIiiO()) == null) {
                return;
            }
            AIAnswer aIAnswer = this.XIi00iiXO;
            aIAnswer.setType(AIFunctionType.DEVICE_EMOTION);
            aIAnswer.setText(emotion);
            o1XIiIOIIiiO.handleResponse(aIAnswer);
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onSttText(String text, boolean z) {
            Intrinsics.X0O(text, "text");
            LogUtils.m11128d("AIManager onSttText  text = " + text + " , isFinal = " + z + "  ");
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsStart() {
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsStop() {
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsText(String text, boolean z) {
            String string;
            Intrinsics.X0O(text, "text");
            LogUtils.m11128d("AIManager onTtsText  text = " + text + " , isFinal = " + z + "  ");
            this.OXO1.append(text);
            this.XIi00iiXO.setEnded(OiOX0i.m1037iO(z));
            AIAnswer aIAnswer = this.XIi00iiXO;
            if (z) {
                string = this.OXO1.toString();
                Intrinsics.XXI(string);
            } else {
                string = ((Object) this.OXO1) + APSSharedUtil.TRUNCATE_SEPARATOR;
            }
            aIAnswer.setText(string);
            O1XIiIO<AIAnswer> o1XIiIOIIiiO = AIManager.OXO1.iIiiO();
            if (o1XIiIOIIiiO != null) {
                o1XIiIOIIiiO.handleResponse(this.XIi00iiXO);
            }
        }
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ String m38065I1(AIManager aIManager, String str, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            i2 = 500;
        }
        return aIManager.m38070OX(str, i, z, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I1XOi1(AIManager aIManager, String str, String str2, String str3, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        aIManager.X0O(str, str2, str3, function1);
    }

    public static /* synthetic */ String II1Xi0(AIManager aIManager, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = q62.OXO1.XX00XX();
        }
        return aIManager.X01IiOiIi(str, i);
    }

    public static /* synthetic */ void IiI10X(AIManager aIManager, AIQuestion aIQuestion, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = q62.OXO1.XX00XX();
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            str = GetAIChat.URL;
        }
        aIManager.O00(aIQuestion, i, i2, str);
    }

    public static final Unit O001I(AIQuestion aIQuestion, int i, boolean z) {
        if (z) {
            OIi0(OXO1, aIQuestion.getText(), aIQuestion.getType(), 0, i, 4, null);
        }
        return Unit.OXO1;
    }

    public static /* synthetic */ String O10IXXX0X(AIManager aIManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = XXI(aIManager, false, 1, null);
        }
        return aIManager.X1ii(i);
    }

    public static /* synthetic */ String OII(AIManager aIManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return aIManager.XiOIii1(i);
    }

    public static /* synthetic */ String OIX0iXi(AIManager aIManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = XXI(aIManager, false, 1, null);
        }
        return aIManager.m38069IO(i);
    }

    public static /* synthetic */ void OIi0(AIManager aIManager, String str, AIFunctionType aIFunctionType, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 2;
        }
        if ((i3 & 8) != 0) {
            i2 = q62.OXO1.XX00XX();
        }
        aIManager.I0IIOi(str, aIFunctionType, i, i2);
    }

    /* JADX INFO: renamed from: OO */
    public static /* synthetic */ void m38066OO(AIManager aIManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Utils.getApp().getString(R.string.request_error);
            Intrinsics.O10IXXX0X(str, "getString(...)");
        }
        aIManager.OX110i(str);
    }

    public static /* synthetic */ String OiIIX101O(AIManager aIManager, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = q62.OXO1.XX00XX();
        }
        return aIManager.XX0(str, z, i);
    }

    public static /* synthetic */ void X0i1O(AIManager aIManager, String str, AIFunctionType aIFunctionType, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = q62.OXO1.XX00XX();
        }
        aIManager.X1IX(str, aIFunctionType, i);
    }

    public static final void X100O(AIQuestion aIQuestion, X1i.OXO1 oxo1) {
        AIAnswer aIAnswer = new AIAnswer(aIQuestion.getType(), oxo1.OIi0(), 1, null, null, 24, null);
        O1XIiIO<AIAnswer> o1XIiIO = f50828iO;
        if (o1XIiIO != null) {
            o1XIiIO.handleResponse(aIAnswer);
        }
    }

    public static final void X11I(AIQuestion aIQuestion, X1i.OXO1 oxo1) {
        AIFunctionType type = aIQuestion.getType();
        String strSubstring = oxo1.OIi0().substring(0, oxo1.OIi0().length() / 2);
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        AIAnswer aIAnswer = new AIAnswer(type, strSubstring, 0, null, null, 24, null);
        O1XIiIO<AIAnswer> o1XIiIO = f50828iO;
        if (o1XIiIO != null) {
            o1XIiIO.handleResponse(aIAnswer);
        }
    }

    public static /* synthetic */ int XXI(AIManager aIManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aIManager.I0iXXO(z);
    }

    public static /* synthetic */ void XXX11i(AIManager aIManager, AIQuestion aIQuestion, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = q62.OXO1.XX00XX();
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            str = GetAIChat.URL;
        }
        aIManager.X11iII1O1(aIQuestion, i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XiOIO(AIManager aIManager, String str, String str2, String str3, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        aIManager.IIX1OXO(str, str2, str3, function1);
    }

    /* JADX INFO: renamed from: iX */
    public static /* synthetic */ String m38068iX(AIManager aIManager, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = q62.OXO1.XX00XX();
        }
        return aIManager.i010I(str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iXiX011(AIManager aIManager, AIQuestion aIQuestion, O1XIiIO o1XIiIO, boolean z, boolean z2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            o1XIiIO = null;
        }
        O1XIiIO o1XIiIO2 = o1XIiIO;
        boolean z3 = (i3 & 4) != 0 ? true : z;
        boolean z4 = (i3 & 8) != 0 ? true : z2;
        if ((i3 & 16) != 0) {
            i = q62.OXO1.XX00XX();
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = -1;
        }
        aIManager.iIXi1iiXI(aIQuestion, o1XIiIO2, z3, z4, i4, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iXiiiO(AIManager aIManager, AIQuestion aIQuestion, O1XIiIO o1XIiIO, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aIManager.XXO(aIQuestion, o1XIiIO, z);
    }

    public static final void iiiO(AIQuestion aIQuestion, X1i.OXO1 oxo1) {
        AIFunctionType type = aIQuestion.getType();
        String strSubstring = oxo1.OIi0().substring(0, oxo1.OIi0().length() / 4);
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        AIAnswer aIAnswer = new AIAnswer(type, strSubstring, 0, null, null, 24, null);
        O1XIiIO<AIAnswer> o1XIiIO = f50828iO;
        if (o1XIiIO != null) {
            o1XIiIO.handleResponse(aIAnswer);
        }
        if (XO0O10 && oxo1.X1ii()) {
            DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, oxo1.OIi0(), false, q62.OXO1.OiX(), null, null, "rapidRecoveryAI", 26, null);
        }
    }

    public final void I0IIOi(@aa1 String query, @aa1 AIFunctionType messageType, int i, int i2) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(messageType, "messageType");
        i1O0OXO1O.OXO1.OXO1("AIManager duserStreamChat -> q:" + query);
        O00 = 80;
        DcsTtsPlayer.INSTANCE.clearSegmentation();
        StatManager.m38112iO(StatManager.OXO1, 3, null, 2, null);
        I0IIOi = NetWorkUtils.INSTANCE.postStreamRequest(OIX0iXi, iOOX010X(), m38065I1(this, X01IiOiIi(query, i2), i, false, i2, 4, null), new AIManager$duserStreamChat$1(messageType));
    }

    public final int I0iXXO(boolean z) {
        int i;
        if (q62.OXO1.I0O()) {
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            i = sPUtilsIiI10X.getInt(b01.iXi, UtilsKt.IXI(app) ? 1 : 0);
        } else {
            i = 1;
        }
        OrderManager.OXO1.iIXi1iiXI(z);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        Application app2 = Utils.getApp();
        Intrinsics.O10IXXX0X(app2, "getApp(...)");
        i1o0oxo1o.OXO1("AIManager getAIModel -> " + i + "  isZh(Utils.getApp()) = " + UtilsKt.IXI(app2));
        return i;
    }

    public final void IIX1OXO(@aa1 String language, @aa1 String targetLanguage, @aa1 String type, @tb1 final Function1<? super AITranslationUrl, Unit> function1) {
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(targetLanguage, "targetLanguage");
        Intrinsics.X0O(type, "type");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("AIManager getCallTranslationUrl -> " + strO001I + " , language = " + language + " , targetLanguage =" + targetLanguage);
        if (strO001I.length() == 0) {
            return;
        }
        BleCache bleCache = BleCache.INSTANCE;
        String mBleName = bleCache.getMBleName();
        String mFirmwareFlag = bleCache.getMFirmwareFlag();
        String string$default = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        String json = new Gson().toJson(new BleInfo(((AppUser) appUser).getIdentity(), mBleName, mFirmwareFlag, RequestBodyKt.PROJECT_ID, string$default, appVersionName, oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), 0));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(json);
        HashMap<String, String> callTranslationUrlBodyWithBleInfo = RequestBodyKt.getCallTranslationUrlBodyWithBleInfo(strO001I, language, targetLanguage, type, json);
        final O1XIiIO<AITranslationUrl> o1XIiIO = new O1XIiIO<AITranslationUrl>() { // from class: com.sma.smartv3.biz.AIManager$getCallTranslationUrlWithBleInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AITranslationUrl aITranslationUrl) {
                Function1<AITranslationUrl, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(aITranslationUrl);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                Function1<AITranslationUrl, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        Api api = Api.INSTANCE;
        i1o0oxo1o.OXO1("JSON Api.BASE_URL -> " + api.getBASE_URL() + " , url = " + GetCallTranslationUrl.URL);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(api.getBASE_URL(), GetCallTranslationUrl.URL);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetCallTranslationUrl.URL;
        final O1XIiIO<com.sma.androidnetworklib.model.Response<AITranslationUrl>> o1XIiIO2 = new O1XIiIO<com.sma.androidnetworklib.model.Response<AITranslationUrl>>() { // from class: com.sma.smartv3.biz.AIManager$getCallTranslationUrlWithBleInfo$$inlined$postJson$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(com.sma.androidnetworklib.model.Response<AITranslationUrl> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new com.sma.androidnetworklib.model.Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addApplicationJsonBody(callTranslationUrlBodyWithBleInfo).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, AITranslationUrl.class), new ParsedRequestListener<com.sma.androidnetworklib.model.Response<AITranslationUrl>>() { // from class: com.sma.smartv3.biz.AIManager$getCallTranslationUrlWithBleInfo$$inlined$postJson$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(com.sma.androidnetworklib.model.Response<AITranslationUrl> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    @aa1
    /* JADX INFO: renamed from: IO */
    public final String m38069IO(int i) {
        q62 q62Var = q62.OXO1;
        String strXXO = q62Var.XXO();
        if (strXXO.length() == 0) {
            strXXO = q62Var.X11iII1O1();
            if (strXXO.length() == 0) {
                if (i == 0) {
                    return "openAIService";
                }
                if (i != 1) {
                    return i != 2 ? "baiduAIService" : "deepseekAIService";
                }
                return q62Var.i0101i() ? "sparkAIService" : "baiduAIService";
            }
        }
        return strXXO;
    }

    public final int IXXOO() {
        return O00;
    }

    public final void Ii0X0X() {
        XO0X10iO();
    }

    public final void Ii1iii0(final AIQuestion aIQuestion, final X1i.OXO1 oxo1) {
        Handler handler = IiI10X;
        handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XOXOIX0Oi
            @Override // java.lang.Runnable
            public final void run() {
                AIManager.iiiO(aIQuestion, oxo1);
            }
        }, 400L);
        handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IiXIIX1O1
            @Override // java.lang.Runnable
            public final void run() {
                AIManager.X11I(aIQuestion, oxo1);
            }
        }, 700L);
        handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iIIIiIO0
            @Override // java.lang.Runnable
            public final void run() {
                AIManager.X100O(aIQuestion, oxo1);
            }
        }, 1000L);
    }

    public final void O00(@aa1 AIQuestion question, int i, int i2, @aa1 String url) {
        Intrinsics.X0O(question, "question");
        Intrinsics.X0O(url, "url");
        if (q62.OXO1.iX0iiiXi()) {
            XXiIiX10(question);
        } else {
            X11iII1O1(question, i, i2, url);
        }
    }

    public final void O1O(@aa1 AIError error) {
        Intrinsics.X0O(error, "error");
        String code = error.getCode();
        int iHashCode = code.hashCode();
        if (iHashCode != -656062448) {
            if (iHashCode != 221600882) {
                if (iHashCode == 1715548988 && code.equals("insufficient_quota")) {
                    ToastUtils.showLong(R.string.insufficient_quota);
                    return;
                }
            } else if (code.equals("invalid_api_key")) {
                ToastUtils.showLong(R.string.invalid_api_key);
                return;
            }
        } else if (code.equals("invalid_request_error")) {
            ToastUtils.showLong(R.string.invalid_api_key_tip);
            return;
        }
        ToastUtils.showLong(UtilsKt.XXO(R.string.request_error), new Object[0]);
    }

    @aa1
    /* JADX INFO: renamed from: OX */
    public final String m38070OX(@aa1 String query, int i, boolean z, int i2) {
        Intrinsics.X0O(query, "query");
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        if (!UtilsKt.IiiXiI0I(app)) {
            i1O0OXO1O.OXO1.OXO1("AIManager getDuserStreamChatBody -> p:106, " + query + ", mode:" + i + ", maxTokens:" + i2);
            return "{\"pid\": \"106\",\"mode\": 2,\"qid\": \"abc\",\"data\": {\"prompt\": \"" + query + "\",\"stream\": " + z + ",\"max_tokens\": " + i2 + "}}";
        }
        i1O0OXO1O.OXO1.OXO1("AIManager getDuserStreamChatBody -> p:108, " + query + ", mode:" + i + ", maxTokens:" + i2);
        return "{\"pid\":\"108\",\"mode\": " + i + ",\"qid\":\"abc\",\"data\":{\"prompt\":\"" + query + "\",\"stream\":" + z + ",\"max_tokens\":" + i2 + "},\"dcs_data\":{\"cuid\":\"lyxabc1234\",\"didp\":\"11\",\"sn\":\"lyxabc1234\",\"events\":\"{\\\"clientContext\\\":[{\\\"header\\\":{\\\"name\\\":\\\"AlertsState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.alerts\\\"},\\\"payload\\\":{\\\"activeAlerts\\\":[],\\\"allAlerts\\\":[]}},{\\\"header\\\":{\\\"name\\\":\\\"VolumeState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.speaker_controller\\\"},\\\"payload\\\":{\\\"muted\\\":false,\\\"volume\\\":80}},{\\\"header\\\":{\\\"name\\\":\\\"PlaybackState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.video_player\\\"},\\\"payload\\\":{\\\"offsetInMilliseconds\\\":0,\\\"playerActivity\\\":\\\"FINISHED\\\",\\\"token\\\":\\\"\\\"}},{\\\"header\\\":{\\\"name\\\":\\\"SpeechState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.voice_output\\\"},\\\"payload\\\":{\\\"offsetInMilliseconds\\\":0,\\\"playerActivity\\\":\\\"FINISHED\\\",\\\"token\\\":\\\"\\\"}}],\\\"event\\\":{\\\"header\\\":{\\\"name\\\":\\\"ListenStarted\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.voice_input\\\",\\\"messageId\\\":\\\"123\\\",\\\"dialogRequestId\\\":\\\"123\\\"},\\\"payload\\\":{\\\"format\\\":\\\"AUDIO_L16_RATE_16000_CHANNELS_1\\\",\\\"profile\\\":\\\"\\\"}}}\"}}";
    }

    public final void OX110i(String str) {
        XOX0O0(str);
    }

    public final void X00XIX1(@tb1 O1XIiIO<AIAnswer> o1XIiIO) {
        f50828iO = o1XIiIO;
    }

    @aa1
    public final String X01IiOiIi(@aa1 String query, int i) {
        Intrinsics.X0O(query, "query");
        if (q62.OXO1.XOX()) {
            return query;
        }
        return query + " . " + Utils.getApp().getString(R.string.ai_max_tokens_question, Integer.valueOf(i));
    }

    public final void X0O(@aa1 String language, @aa1 String targetLanguage, @aa1 String type, @tb1 final Function1<? super AITranslationUrl, Unit> function1) {
        Intrinsics.X0O(language, "language");
        Intrinsics.X0O(targetLanguage, "targetLanguage");
        Intrinsics.X0O(type, "type");
        String strO001I = i72.OXO1.O001I();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("AIManager getCallTranslationUrl -> " + strO001I + " , language = " + language + " , targetLanguage =" + targetLanguage);
        if (strO001I.length() == 0) {
            return;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> callTranslationUrlBody = RequestBodyKt.getCallTranslationUrlBody(strO001I, language, targetLanguage, type);
        final O1XIiIO<AITranslationUrl> o1XIiIO = new O1XIiIO<AITranslationUrl>() { // from class: com.sma.smartv3.biz.AIManager$getCallTranslationUrl$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AITranslationUrl aITranslationUrl) {
                Function1<AITranslationUrl, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(aITranslationUrl);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                Function1<AITranslationUrl, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        Api api = Api.INSTANCE;
        i1o0oxo1o.OXO1("JSON Api.BASE_URL -> " + api.getBASE_URL() + " , url = " + GetCallTranslationUrl.URL);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(api.getBASE_URL(), GetCallTranslationUrl.URL);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetCallTranslationUrl.URL;
        final O1XIiIO<com.sma.androidnetworklib.model.Response<AITranslationUrl>> o1XIiIO2 = new O1XIiIO<com.sma.androidnetworklib.model.Response<AITranslationUrl>>() { // from class: com.sma.smartv3.biz.AIManager$getCallTranslationUrl$$inlined$postJson$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(com.sma.androidnetworklib.model.Response<AITranslationUrl> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new com.sma.androidnetworklib.model.Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addApplicationJsonBody(callTranslationUrlBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, AITranslationUrl.class), new ParsedRequestListener<com.sma.androidnetworklib.model.Response<AITranslationUrl>>() { // from class: com.sma.smartv3.biz.AIManager$getCallTranslationUrl$$inlined$postJson$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(com.sma.androidnetworklib.model.Response<AITranslationUrl> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    public final void X11iII1O1(final AIQuestion aIQuestion, int i, int i2, String str) {
        aIQuestion.setStream(true);
        aIQuestion.setModel(Intrinsics.XOO0ii0(str, GetAIChat.URL) ? XiOIii1(i2) : "openAIService");
        i1O0OXO1O.OXO1.OXO1("AIManager oldAIChat -> model = " + aIQuestion.getModel() + " , question = " + aIQuestion);
        aIQuestion.setText(X01IiOiIi(aIQuestion.getText(), i));
        final StringBuilder sb = new StringBuilder();
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String json = new Gson().toJson(aIQuestion);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        XOO0ii0 = NetWorkUtils.postStreamRequest$default(netWorkUtils, str, null, json, new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.AIManager$oldAIChat$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str2) {
                i1O0OXO1O.OXO1.OXO1("AIManager oldAIChat line -> " + str2);
                try {
                    Object objFromJson = new Gson().fromJson(str2, TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, AIAnswer.class));
                    Intrinsics.X1ii(objFromJson, "null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<com.sma.smartv3.model.AIAnswer>");
                    com.sma.androidnetworklib.model.Response response = (com.sma.androidnetworklib.model.Response) objFromJson;
                    if (response.getData() == null) {
                        int code = response.getCode();
                        if (code != 4006) {
                            if (code == 4009) {
                                ToastUtils.showLong(response.getMesg(), new Object[0]);
                                O1XIiIO<AIAnswer> o1XIiIOIIiiO = AIManager.OXO1.iIiiO();
                                if (o1XIiIOIIiiO != null) {
                                    o1XIiIOIIiiO.handleError(response.getMesg());
                                    return;
                                }
                                return;
                            }
                            switch (code) {
                                case 5001:
                                case 5002:
                                case 5003:
                                    break;
                                default:
                                    O1XIiIO<AIAnswer> o1XIiIOIIiiO2 = AIManager.OXO1.iIiiO();
                                    if (o1XIiIOIIiiO2 != null) {
                                        o1XIiIOIIiiO2.handleError(response.getMesg());
                                    }
                                    break;
                            }
                            return;
                        }
                        O1XIiIO<AIAnswer> o1XIiIOIIiiO3 = AIManager.OXO1.iIiiO();
                        if (o1XIiIOIIiiO3 != null) {
                            o1XIiIOIIiiO3.handleError(String.valueOf(response.getCode()));
                            return;
                        }
                        return;
                    }
                    AIAnswer aIAnswer = (AIAnswer) response.getData();
                    if (aIAnswer != null) {
                        StringBuilder sb2 = sb;
                        AIQuestion aIQuestion2 = aIQuestion;
                        sb2.append(aIAnswer.getText());
                        aIAnswer.setType(aIQuestion2.getType());
                        String string = sb2.toString();
                        Intrinsics.O10IXXX0X(string, "toString(...)");
                        aIAnswer.setText(string);
                        AIManager aIManager = AIManager.OXO1;
                        O1XIiIO<AIAnswer> o1XIiIOIIiiO4 = aIManager.iIiiO();
                        if (o1XIiIOIIiiO4 != null) {
                            o1XIiIOIIiiO4.handleResponse(aIAnswer);
                        }
                        if (aIAnswer.getEnded() == 1 && aIManager.iX1O1()) {
                            DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                            String string2 = sb2.toString();
                            Intrinsics.O10IXXX0X(string2, "toString(...)");
                            DcsTtsPlayer.play$default(dcsTtsPlayer, string2, false, false, null, null, "oldAIChat", 30, null);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (str2 != null) {
                        O1XIiIO<AIAnswer> o1XIiIOIIiiO5 = AIManager.OXO1.iIiiO();
                        if (o1XIiIOIIiiO5 != null) {
                            o1XIiIOIIiiO5.handleError(str2);
                            return;
                        }
                        return;
                    }
                    i1O0OXO1O.OXO1.OXO1("AIManager oldAIChat -> error: empty");
                    O1XIiIO<AIAnswer> o1XIiIOIIiiO6 = AIManager.OXO1.iIiiO();
                    if (o1XIiIOIIiiO6 != null) {
                        o1XIiIOIIiiO6.handleError("null");
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                AIManager aIManager = AIManager.OXO1;
                if (aIManager.iX1O1()) {
                    DcsTtsPlayer.INSTANCE.stop();
                }
                i1O0OXO1O.OXO1.OXO1("AIManager oldAIChat -> error:" + error);
                O1XIiIO<AIAnswer> o1XIiIOIIiiO = aIManager.iIiiO();
                if (o1XIiIOIIiiO != null) {
                    o1XIiIOIIiiO.handleError(error);
                }
            }
        }, 2, null);
    }

    public final void X1IX(@aa1 String query, @aa1 AIFunctionType messageType, int i) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(messageType, "messageType");
        OXO1 oxo1 = new OXO1(query, i, messageType);
        I0iXXO = oxo1;
        ThreadUtils.executeByIo(oxo1);
    }

    @aa1
    public final String X1ii(int i) {
        q62 q62Var = q62.OXO1;
        String strX11iII1O1 = q62Var.X11iII1O1();
        if (strX11iII1O1.length() != 0) {
            return strX11iII1O1;
        }
        if (i == 0) {
            return "openAIService";
        }
        if (i != 1) {
            return i != 2 ? "baiduAIService" : "deepseekAIService";
        }
        return q62Var.i0101i() ? "sparkAIService" : "baiduAIService";
    }

    public final void XO0X10iO() {
        i1O0OXO1O.OXO1.OXO1("AIManager -> AndroidNetworking.cancelAll stop ");
        AndroidNetworking.cancelAll();
        DcsTtsPlayer.INSTANCE.stop();
        VoicePlayer.INSTANCE.stop();
        ThreadUtils.SimpleTask<Void> simpleTask = I0iXXO;
        if (simpleTask != null) {
            ThreadUtils.cancel(simpleTask);
        }
        EventSource eventSource = I0IIOi;
        if (eventSource != null && eventSource != null) {
            eventSource.cancel();
        }
        EventSource eventSource2 = XOO0ii0;
        if (eventSource2 == null || eventSource2 == null) {
            return;
        }
        eventSource2.cancel();
    }

    public final void XOX0O0(String str) {
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, new BleVoice(0, 0, 0, null, System.currentTimeMillis(), str, 14, null), false, false, 24, null);
    }

    @aa1
    public final String XX0(@aa1 String text, boolean z, int i) {
        Intrinsics.X0O(text, "text");
        return "{    \"model\": \"gpt-3.5-turbo\",    \"messages\": [        {            \"role\": \"system\",            \"content\": \"You are a helpful assistant.\"        },        {            \"role\": \"user\",            \"content\": \"" + X01IiOiIi(text, i) + "\"        }    ],    \"stream\": " + z + ",    \"max_tokens\": 250}";
    }

    public final void XX1Oi(@aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(callback, "callback");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String url = GetDcsToken.INSTANCE.getURL();
        HashMap<String, String> dcsTokenBody = RequestBodyKt.getDcsTokenBody();
        final O1XIiIO<DcsToken> o1XIiIO = new O1XIiIO<DcsToken>() { // from class: com.sma.smartv3.biz.AIManager$refreshToken$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(DcsToken dcsToken) {
                i1O0OXO1O.OXO1.OXO1("AIManager refreshToken handleResponse -> " + dcsToken);
                if (dcsToken != null) {
                    dcsToken.setTimestamp(System.currentTimeMillis());
                    a01.OXO1.IiI10X().put(DcsToken.class.getName(), new Gson().toJson(dcsToken));
                    callback.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("AIManager refreshToken onError -> " + error);
                q62 q62Var = q62.OXO1;
                if (q62Var.IOI0i0I()) {
                    AIManager.OXO1.OX110i("请先到App上激活" + q62Var.m2887XI());
                } else if (Intrinsics.XOO0ii0(error, "SSLException: Read timed out")) {
                    ToastUtils.showLong("Read timed out , " + UtilsKt.XXO(R.string.request_error), new Object[0]);
                } else {
                    ToastUtils.showLong(UtilsKt.XXO(R.string.request_error) + " " + error, new Object[0]);
                }
                callback.invoke2(Boolean.FALSE);
                O1XIiIO<AIAnswer> o1XIiIOIIiiO = AIManager.OXO1.iIiiO();
                if (o1XIiIOIIiiO != null) {
                    o1XIiIOIIiiO.handleError(error);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        netWorkUtils.printParam(strConvertBaseUrl + url, dcsTokenBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        final O1XIiIO<com.sma.androidnetworklib.model.Response<DcsToken>> o1XIiIO2 = new O1XIiIO<com.sma.androidnetworklib.model.Response<DcsToken>>() { // from class: com.sma.smartv3.biz.AIManager$refreshToken$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(com.sma.androidnetworklib.model.Response<DcsToken> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new com.sma.androidnetworklib.model.Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) dcsTokenBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, DcsToken.class), new ParsedRequestListener<com.sma.androidnetworklib.model.Response<DcsToken>>() { // from class: com.sma.smartv3.biz.AIManager$refreshToken$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(com.sma.androidnetworklib.model.Response<DcsToken> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                com.sma.androidnetworklib.model.Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (com.sma.androidnetworklib.model.Response) aNError.getErrorAsObject(com.sma.androidnetworklib.model.Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final boolean XXIIO1i11() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(DcsToken.class.getName()), (Class<Object>) DcsToken.class);
        if (objFromJson == null) {
            objFromJson = DcsToken.class.newInstance();
        }
        DcsToken dcsToken = (DcsToken) objFromJson;
        return System.currentTimeMillis() - dcsToken.getTimestamp() > ((long) dcsToken.getExpires_in());
    }

    public final void XXO(@aa1 AIQuestion question, @tb1 O1XIiIO<AIAnswer> o1XIiIO, boolean z) {
        Intrinsics.X0O(question, "question");
        f50828iO = o1XIiIO;
        XO0O10 = z;
        IiI10X(this, question, 0, 0, GetAIChatV2.URL, 6, null);
    }

    public final void XXiIiX10(AIQuestion aIQuestion) {
        WebSocketManager webSocketManager = WebSocketManager.INSTANCE;
        webSocketManager.sendTextMessage(aIQuestion.getText());
        webSocketManager.setMOnCallback(new XIi00iiXO(new StringBuilder(), new AIAnswer(aIQuestion.getType(), null, 0, null, null, 26, null)));
    }

    @aa1
    public final String XiOIii1(int i) {
        if (i == 0) {
            return "baiduAIService";
        }
        if (i == 1) {
            return "openAIService";
        }
        if (i != 2) {
            return i != 3 ? OIX0iXi(this, 0, 1, null) : "deepseekAIService";
        }
        return "sparkAIService";
    }

    @aa1
    public final String i010I(@aa1 String query, int i) {
        Intrinsics.X0O(query, "query");
        return q62.OXO1.XOX() ? query : String.valueOf(Utils.getApp().getString(R.string.ai_max_tokens_question2, query, UtilsKt.XXO(R.string.app_name)));
    }

    public final void i0X000X0O(boolean z) {
        XO0O10 = z;
    }

    public final void i11I(int i) {
        O00 = i;
    }

    /* JADX INFO: renamed from: iI */
    public final boolean m38071iI() {
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I() || q62Var.XOX()) {
            return true;
        }
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        return (UtilsKt.IXI(app) && Intrinsics.XOO0ii0(OIX0iXi(this, 0, 1, null), "baiduAIService")) || Intrinsics.XOO0ii0(OIX0iXi(this, 0, 1, null), "sparkAIService");
    }

    public final void iIXi1iiXI(@aa1 final AIQuestion question, @tb1 O1XIiIO<AIAnswer> o1XIiIO, boolean z, boolean z2, final int i, int i2) {
        Intrinsics.X0O(question, "question");
        f50828iO = o1XIiIO;
        XO0O10 = z;
        if (z2) {
            XO0X10iO();
        }
        X1i.OXO1 oxo1M1192iO = X1i.OXO1.m1192iO(question.getText());
        if (oxo1M1192iO != null) {
            Ii1iii0(question, oxo1M1192iO);
            return;
        }
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        q62 q62Var = q62.OXO1;
        i1o0oxo1o.OXO1("AIManager query  isUseAIService = " + q62Var.XOX() + " , isSupportDirectAI = " + q62Var.i01XIiIiI());
        if (i72.OXO1.I0IIOI() && i2 >= 0 && i2 <= 3) {
            if (i2 == 2 && q62Var.OIXOOi()) {
                AISparkChainManager.OXO1.iXiiiO(question.getText(), f50828iO, i, z);
                return;
            } else {
                IiI10X(this, question, i, i2, null, 8, null);
                return;
            }
        }
        if (q62Var.OIXOOi()) {
            AISparkChainManager.OXO1.iXiiiO(question.getText(), f50828iO, i, z);
            return;
        }
        if (q62Var.XOX()) {
            IiI10X(this, question, i, 0, null, 12, null);
            return;
        }
        if (q62Var.IiX1ii()) {
            if (XXIIO1i11()) {
                XX1Oi(new Function1() { // from class: com.android.mltcode.paycertificationapi.i1O11001
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AIManager.O001I(question, i, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            } else {
                OIi0(this, question.getText(), question.getType(), 0, i, 4, null);
                return;
            }
        }
        if (!TextUtils.isEmpty(q62Var.iIiiO())) {
            X1IX(question.getText(), question.getType(), i);
            return;
        }
        ToastUtils.showLong(R.string.no_ai_key);
        O1XIiIO<AIAnswer> o1XIiIO2 = f50828iO;
        if (o1XIiIO2 != null) {
            o1XIiIO2.handleError(UtilsKt.XXO(R.string.no_ai_key));
        }
    }

    @tb1
    public final O1XIiIO<AIAnswer> iIiiO() {
        return f50828iO;
    }

    @aa1
    public final String iOO1ii1(@aa1 String query) {
        Intrinsics.X0O(query, "query");
        return query + " , " + Utils.getApp().getString(R.string.ai_translate_question_tip);
    }

    @aa1
    public final Map<String, String> iOOX010X() throws IllegalAccessException, InstantiationException {
        a01 a01Var = a01.OXO1;
        Object objFromJson = new Gson().fromJson(a01Var.IiI10X().getString(DcsToken.class.getName()), (Class<Object>) DcsToken.class);
        if (objFromJson == null) {
            objFromJson = DcsToken.class.newInstance();
        }
        DcsToken dcsToken = (DcsToken) objFromJson;
        String client_id = dcsToken.getClient_id();
        if (client_id.length() == 0) {
            client_id = f50827IO;
        }
        i1O0OXO1O.OXO1.OXO1("AIManager dcsToken -> " + dcsToken + "  clientId = " + client_id);
        Pair pairOXO1 = TuplesKt.OXO1("Client-Id", client_id);
        Object objFromJson2 = new Gson().fromJson(a01Var.IiI10X().getString(DcsToken.class.getName()), (Class<Object>) DcsToken.class);
        if (objFromJson2 == null) {
            objFromJson2 = DcsToken.class.newInstance();
        }
        return kotlin.collections.OXO1.X11I(pairOXO1, TuplesKt.OXO1("Authorization", "Bearer " + ((DcsToken) objFromJson2).getAccess_token()), TuplesKt.OXO1("Device-Id", oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @aa1
    public final String iOiXi11II(@aa1 String titleStr) {
        Intrinsics.X0O(titleStr, "titleStr");
        switch (titleStr.hashCode()) {
            case -1671190941:
                if (titleStr.equals("openAIService")) {
                    return UtilsKt.XXO(R.string.chatgpt);
                }
                break;
            case -361646967:
                if (titleStr.equals("deepseekAIService")) {
                    return UtilsKt.XXO(R.string.pay_dail_aigc_deep_seek);
                }
                break;
            case -345876046:
                if (titleStr.equals("baiduAIService")) {
                    return UtilsKt.XXO(R.string.wenxinyiyan);
                }
                break;
            case 1088442160:
                if (titleStr.equals("sparkAIService")) {
                    return UtilsKt.XXO(R.string.ai_model_spark_desk);
                }
                break;
        }
        return titleStr.length() == 0 ? UtilsKt.XXO(R.string.pay_dail_aigc_modle) : titleStr;
    }

    public final boolean iX1O1() {
        return XO0O10;
    }
}
