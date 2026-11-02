package com.sma.smartv3.biz;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.android.mltcode.paycertificationapi.IiXIIX1O1;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X1i;
import com.android.mltcode.paycertificationapi.XOXOIX0Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1O11001;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIIIiIO0;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.smartv3.biz.ai.AIBase;
import com.sma.smartv3.biz.ai.AIError;
import com.sma.smartv3.biz.ai.SSE;
import com.sma.smartv3.biz.ai.completion.chat.ChatCompletionResult;
import com.sma.smartv3.biz.dcs.DcsToken;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.biz.voice.VoicePlayer;
import com.sma.smartv3.biz.voice.ai.WebSocketManager;
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
import java.io.Reader;
import java.lang.reflect.Type;
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

    @aa1
    public static final String IO = "CkWnW1dv5poz8AGkU78hjsDuu7M38XnH";

    @aa1
    public static final Handler IiI10X = null;
    public static int O00 = 0;

    @aa1
    public static final String OIX0iXi = "https://duer-kids.baidu.com/botwatch/api/operation/aigc/stream/dcschat";

    @aa1
    public static final String OIi0 = "openAiChatCompletion";

    @aa1
    public static final AIManager OXO1 = null;

    @aa1
    public static final String XIi00iiXO = "AIManager";
    public static boolean XO0O10 = false;

    @tb1
    public static EventSource XOO0ii0 = null;

    @aa1
    public static final String XXI = "https://api.openai.com/v1/chat/completions";

    @tb1
    public static O1XIiIO<AIAnswer> iO;

    @SourceDebugExtension({"SMAP\nAIManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,801:1\n106#2:802\n78#2,22:803\n*S KotlinDebug\n*F\n+ 1 AIManager.kt\ncom/sma/smartv3/biz/AIManager$openAiChatCompletion$1\n*L\n654#1:802\n654#1:803,22\n*E\n"})
    public static final class OXO1 extends ThreadUtils.SimpleTask<Void> {
        public final /* synthetic */ int I1;
        public final /* synthetic */ String IO;
        public final /* synthetic */ AIFunctionType iX1O1;

        public OXO1(String r1, int r2, AIFunctionType r3) {
            this.IO = r1;
            this.I1 = r2;
            this.iX1O1 = r3;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        public void onSuccess(Void r1) {
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Void doInBackground() {
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            r0.OXO1("AIManager openAiChatCompletion -> " + this.IO);
            ANRequest.PostRequestBuilder r2 = AndroidNetworking.post(AIManager.XXI).setContentType(G5.L).addHeaders("Authorization", "Bearer " + q62.OXO1.iIiiO());
            AIManager r5 = AIManager.OXO1;
            byte[] r3 = AIManager.OiIIX101O(r5, this.IO, false, this.I1, 2, null).getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(r3, "getBytes(...)");
            ANResponse r4 = r2.addByteBody(r3).setPriority(Priority.LOW).setTag(AIManager.OIi0).build().executeForOkHttpResponse();
            AIFunctionType r7 = this.iX1O1;
            Response r6 = r4.getOkHttpResponse();     // Catch: Exception -> L6
            if (r6 == null) goto L8;
            Integer r8 = Integer.valueOf(r6.code());     // Catch: Exception -> L6
        L9:
            Response r9 = r4.getOkHttpResponse();     // Catch: Exception -> L6
            if (r9 == null) goto L12;
            ResponseBody r10 = r9.body();     // Catch: Exception -> L6
        L13:
            if (r8 != null) goto L16;
        L59:
            if (r10 == null) goto L61;
            String r11 = r10.string();     // Catch: Exception -> L6
        L63:
            if (TextUtils.isEmpty(r11) == true) goto L72;
            Intrinsics.XXI(r11);     // Catch: Exception -> L6
            AIBase r12 = (AIBase) UtilsKt.iOOX010X(r11, AIBase.class);     // Catch: Exception -> L6
            if (r12 == null) goto L68;
            AIError r13 = r12.getError();     // Catch: Exception -> L6
            if (r13 == null) goto L68;
        L69:
            r5.O1O(r13);     // Catch: Exception -> L6
            O1XIiIO<AIAnswer> r14 = r5.iIiiO();     // Catch: Exception -> L6
            if (r14 == null) goto L72;
            r14.handleError(r13.getMessage());     // Catch: Exception -> L6
        L68:
            r13 = new AIError(String.valueOf(r8), null, null, null, 14, null);     // Catch: Exception -> L6
        L72:
            r0.OXO1("AIManager openAiChatCompletion -> code:" + r8 + ", error:" + r11);     // Catch: Exception -> L6
        L80:
            return null;
        L61:
            r11 = null;
            goto L63
        L16:
            if (r8.intValue() != 200) goto L59;
            if (r10 == null) goto L20;
            Reader r15 = r10.charStream();     // Catch: Exception -> L6
        L21:
            BufferedReader r1 = new BufferedReader(r15);     // Catch: Exception -> L6
            String r16 = r1.readLine();     // Catch: Exception -> L6
            StringBuilder r17 = new StringBuilder();     // Catch: Exception -> L6
            SSE r18 = null;
        L22:
            if (r16 == null) goto L80;
            i1O0OXO1O.OXO1.OXO1("AIManager openAiChatCompletion -> " + r16);     // Catch: Exception -> L6
            if (oe5.O0(r16, "data:", false, 2, null) == false) goto L43;
            String r19 = r16.substring(5);     // Catch: Exception -> L6
            Intrinsics.O10IXXX0X(r19, "substring(...)");     // Catch: Exception -> L6
            int r20 = r19.length() - 1;     // Catch: Exception -> L6
            int r21 = 0;
            boolean r110 = false;
        L26:
            if (r21 > r20) goto L41;
            if (r110 == true) goto L29;
            int r111 = r21;
        L31:
            if (Intrinsics.iIiiO(r19.charAt(r111), 32) > 0) goto L33;
            boolean r112 = true;
        L34:
            if (r110 == false) goto L35;
            if (r112 == false) goto L41;
            r20 = r20 - 1;     // Catch: Exception -> L6
            goto L26
        L35:
            if (r112 == false) goto L36;
            r21 = r21 + 1;     // Catch: Exception -> L6
            goto L26
        L36:
            r110 = true;
            goto L26
        L33:
            r112 = false;
            goto L34
        L29:
            r111 = r20;
        L41:
            r18 = new SSE(r19.subSequence(r21, r20 + 1).toString());     // Catch: Exception -> L6
        L58:
            r16 = r1.readLine();     // Catch: Exception -> L6
            goto L22
        L43:
            if (Intrinsics.XOO0ii0(r16, "") == false) goto L58;
            if (r18 == null) goto L58;
            if (r18.isDone() == true) goto L48;
            r17.append(((ChatCompletionResult) new Gson().fromJson(r18.getData(), ChatCompletionResult.class)).getChoices().get(0).getDelta().getContent());     // Catch: Exception -> L6
            String r22 = r17.toString();     // Catch: Exception -> L6
            Intrinsics.O10IXXX0X(r22, "toString(...)");     // Catch: Exception -> L6
            AIAnswer r23 = new AIAnswer(r7, r22, 0, null, null, 24, null);     // Catch: Exception -> L6
            O1XIiIO<AIAnswer> r24 = AIManager.OXO1.iIiiO();     // Catch: Exception -> L6
            if (r24 == null) goto L57;
            r24.handleResponse(r23);     // Catch: Exception -> L6
        L57:
            r18 = null;
            goto L58
        L48:
            String r25 = r17.toString();     // Catch: Exception -> L6
            Intrinsics.O10IXXX0X(r25, "toString(...)");     // Catch: Exception -> L6
            AIAnswer r26 = new AIAnswer(r7, r25, 1, null, null, 24, null);     // Catch: Exception -> L6
            AIManager r27 = AIManager.OXO1;     // Catch: Exception -> L6
            O1XIiIO<AIAnswer> r28 = r27.iIiiO();     // Catch: Exception -> L6
            if (r28 == null) goto L52;
            r28.handleResponse(r26);     // Catch: Exception -> L6
        L52:
            if (r27.iX1O1() == false) goto L80;
            DcsTtsPlayer r113 = DcsTtsPlayer.INSTANCE;     // Catch: Exception -> L6
            String r29 = r17.toString();     // Catch: Exception -> L6
            Intrinsics.O10IXXX0X(r29, "toString(...)");     // Catch: Exception -> L6
            DcsTtsPlayer.play$default(r113, r29, false, false, null, null, AIManager.OIi0, 30, null);     // Catch: Exception -> L6
            goto L80
        L20:
            r15 = null;
            goto L21
        L12:
            r10 = null;
            goto L13
        L8:
            r8 = null;
        L6:
            e = move-exception;
            e.printStackTrace();
            if ((e instanceof InterruptedIOException) == true) goto L79;
            ToastUtils.showLong(UtilsKt.XXO(R.string.request_error), new Object[0]);
            O1XIiIO<AIAnswer> r30 = AIManager.OXO1.iIiiO();
            if (r30 == null) goto L79;
            r30.handleError(String.valueOf(e.getMessage()));
        L79:
            i1O0OXO1O.OXO1.OXO1("AIManager openAiChatCompletion -> error:" + e.getMessage());
            goto L80
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            onSuccess((Void) r1);
        }
    }

    public static final class XIi00iiXO implements WebSocketManager.OnCallback {
        public final /* synthetic */ StringBuilder OXO1;
        public final /* synthetic */ AIAnswer XIi00iiXO;

        public XIi00iiXO(StringBuilder r1, AIAnswer r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onEmotion(String r4) {
            Intrinsics.X0O(r4, "emotion");
            if (q62.OXO1.Xi1XO00() == false) goto L8;
            O1XIiIO<AIAnswer> r0 = AIManager.OXO1.iIiiO();
            if (r0 == null) goto L9;
            AIAnswer r1 = this.XIi00iiXO;
            r1.setType(AIFunctionType.DEVICE_EMOTION);
            r1.setText(r4);
            r0.handleResponse(r1);
            return;
        L9:
            return;
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onSttText(String r3, boolean r4) {
            Intrinsics.X0O(r3, "text");
            LogUtils.d(new Object[]{"AIManager onSttText  text = " + r3 + " , isFinal = " + r4 + "  "});
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsStart() {
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsStop() {
        }

        @Override // com.sma.smartv3.biz.voice.ai.WebSocketManager.OnCallback
        public void onTtsText(String r3, boolean r4) {
            Intrinsics.X0O(r3, "text");
            LogUtils.d(new Object[]{"AIManager onTtsText  text = " + r3 + " , isFinal = " + r4 + "  "});
            this.OXO1.append(r3);
            this.XIi00iiXO.setEnded(OiOX0i.iO(r4));
            AIAnswer r5 = this.XIi00iiXO;
            if (r4 == false) goto L5;
            String r6 = this.OXO1.toString();
            Intrinsics.XXI(r6);
        L6:
            r5.setText(r6);
            O1XIiIO<AIAnswer> r7 = AIManager.OXO1.iIiiO();
            if (r7 == null) goto L10;
            r7.handleResponse(this.XIi00iiXO);
            return;
        L10:
            return;
        L5:
            r6 = this.OXO1 + APSSharedUtil.TRUNCATE_SEPARATOR;
            goto L6
        }
    }

    static {
        OXO1 = new AIManager();
        XO0O10 = true;
        O00 = 80;
        IiI10X = new Handler(Looper.getMainLooper());
    }

    public AIManager() {
    }

    public static /* synthetic */ String I1(AIManager r0, String r1, int r2, boolean r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 8) == 0) goto L12;
        r4 = 500;
    L12:
        return r0.OX(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I1XOi1(AIManager r0, String r1, String r2, String r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        r0.X0O(r1, r2, r3, r4);
    }

    public static /* synthetic */ String II1Xi0(AIManager r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = q62.OXO1.XX00XX();
    L6:
        return r0.X01IiOiIi(r1, r2);
    }

    public static /* synthetic */ void IiI10X(AIManager r0, AIQuestion r1, int r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = q62.OXO1.XX00XX();
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = -1;
    L9:
        if ((r5 & 8) == 0) goto L11;
        r4 = GetAIChat.URL;
    L11:
        r0.O00(r1, r2, r3, r4);
    }

    public static final Unit O001I(AIQuestion r7, int r8, boolean r9) {
        if (r9 == false) goto L5;
        OIi0(OXO1, r7.getText(), r7.getType(), 0, r8, 4, null);
    L5:
        return Unit.OXO1;
    }

    public static /* synthetic */ String O10IXXX0X(AIManager r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = XXI(r0, false, 1, null);
    L6:
        return r0.X1ii(r1);
    }

    public static /* synthetic */ String OII(AIManager r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = -1;
    L6:
        return r0.XiOIii1(r1);
    }

    public static /* synthetic */ String OIX0iXi(AIManager r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = XXI(r0, false, 1, null);
    L6:
        return r0.IO(r1);
    }

    public static /* synthetic */ void OIi0(AIManager r0, String r1, AIFunctionType r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = 2;
    L6:
        if ((r5 & 8) == 0) goto L8;
        r4 = q62.OXO1.XX00XX();
    L8:
        r0.I0IIOi(r1, r2, r3, r4);
    }

    public static /* synthetic */ void OO(AIManager r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = Utils.getApp().getString(R.string.request_error);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
    L5:
        r0.OX110i(r1);
    }

    public static /* synthetic */ void OXO1(AIQuestion r0, X1i.OXO1 r1) {
        iiiO(r0, r1);
    }

    public static /* synthetic */ String OiIIX101O(AIManager r0, String r1, boolean r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = q62.OXO1.XX00XX();
    L9:
        return r0.XX0(r1, r2, r3);
    }

    public static /* synthetic */ void X0i1O(AIManager r0, String r1, AIFunctionType r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = q62.OXO1.XX00XX();
    L5:
        r0.X1IX(r1, r2, r3);
    }

    public static final void X100O(AIQuestion r8, X1i.OXO1 r9) {
        AIAnswer r0 = new AIAnswer(r8.getType(), r9.OIi0(), 1, null, null, 24, null);
        O1XIiIO<AIAnswer> r10 = iO;
        if (r10 == null) goto L6;
        r10.handleResponse(r0);
        return;
    }

    public static final void X11I(AIQuestion r8, X1i.OXO1 r9) {
        AIFunctionType r1 = r8.getType();
        String r2 = r9.OIi0().substring(0, r9.OIi0().length() / 2);
        Intrinsics.O10IXXX0X(r2, "substring(...)");
        AIAnswer r0 = new AIAnswer(r1, r2, 0, null, null, 24, null);
        O1XIiIO<AIAnswer> r10 = iO;
        if (r10 == null) goto L6;
        r10.handleResponse(r0);
        return;
    }

    public static /* synthetic */ void XIi00iiXO(AIQuestion r0, X1i.OXO1 r1) {
        X11I(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(AIQuestion r0, int r1, boolean r2) {
        return O001I(r0, r1, r2);
    }

    public static final /* synthetic */ void XOO0ii0(AIManager r0, String r1) {
        r0.OX110i(r1);
    }

    public static /* synthetic */ int XXI(AIManager r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        return r0.I0iXXO(r1);
    }

    public static /* synthetic */ void XXX11i(AIManager r0, AIQuestion r1, int r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = q62.OXO1.XX00XX();
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = -1;
    L9:
        if ((r5 & 8) == 0) goto L11;
        r4 = GetAIChat.URL;
    L11:
        r0.X11iII1O1(r1, r2, r3, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XiOIO(AIManager r0, String r1, String r2, String r3, Function1 r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        r0.IIX1OXO(r1, r2, r3, r4);
    }

    public static /* synthetic */ void iO(AIQuestion r0, X1i.OXO1 r1) {
        X100O(r0, r1);
    }

    public static /* synthetic */ String iX(AIManager r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = q62.OXO1.XX00XX();
    L6:
        return r0.i010I(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iXiX011(AIManager r7, AIQuestion r8, O1XIiIO r9, boolean r10, boolean r11, int r12, int r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        r9 = null;
    L5:
        O1XIiIO r2 = r9;
        if ((r14 & 4) == 0) goto L8;
        boolean r3 = true;
    L10:
        if ((r14 & 8) == 0) goto L12;
        boolean r4 = true;
    L14:
        if ((r14 & 16) == 0) goto L16;
        r12 = q62.OXO1.XX00XX();
    L16:
        int r5 = r12;
        if ((r14 & 32) == 0) goto L19;
        r13 = -1;
    L19:
        r7.iIXi1iiXI(r8, r2, r3, r4, r5, r13);
        return;
    L12:
        r4 = r11;
        goto L14
    L8:
        r3 = r10;
        goto L10
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void iXiiiO(AIManager r0, AIQuestion r1, O1XIiIO r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = true;
    L8:
        r0.XXO(r1, r2, r3);
    }

    public static final void iiiO(AIQuestion r9, X1i.OXO1 r10) {
        AIFunctionType r1 = r9.getType();
        String r2 = r10.OIi0().substring(0, r10.OIi0().length() / 4);
        Intrinsics.O10IXXX0X(r2, "substring(...)");
        AIAnswer r0 = new AIAnswer(r1, r2, 0, null, null, 24, null);
        O1XIiIO<AIAnswer> r11 = iO;
        if (r11 == null) goto L6;
        r11.handleResponse(r0);
    L6:
        if (XO0O10 == true) goto L8;
        return;
    L8:
        if (r10.X1ii() == false) goto L12;
        DcsTtsPlayer.play$default(DcsTtsPlayer.INSTANCE, r10.OIi0(), false, q62.OXO1.OiX(), null, null, "rapidRecoveryAI", 26, null);
        return;
    }

    public final void I0IIOi(@aa1 String r10, @aa1 AIFunctionType r11, int r12, int r13) {
        Intrinsics.X0O(r10, "query");
        Intrinsics.X0O(r11, "messageType");
        i1O0OXO1O.OXO1.OXO1("AIManager duserStreamChat -> q:" + r10);
        O00 = 80;
        DcsTtsPlayer.INSTANCE.clearSegmentation();
        StatManager.iO(StatManager.OXO1, 3, null, 2, null);
        I0IIOi = NetWorkUtils.INSTANCE.postStreamRequest(OIX0iXi, iOOX010X(), I1(this, X01IiOiIi(r10, r13), r12, false, r13, 4, null), new AIManager$duserStreamChat$1(r11));
    }

    public final int I0iXXO(boolean r5) {
        if (q62.OXO1.I0O() == false) goto L5;
        SPUtils r0 = a01.OXO1.IiI10X();
        Application r2 = Utils.getApp();
        Intrinsics.O10IXXX0X(r2, "getApp(...)");
        int r1 = r0.getInt(b01.iXi, UtilsKt.IXI(r2) ? 1 : 0);
    L6:
        OrderManager.OXO1.iIXi1iiXI(r5);
        i1O0OXO1O r6 = i1O0OXO1O.OXO1;
        Application r3 = Utils.getApp();
        Intrinsics.O10IXXX0X(r3, "getApp(...)");
        r6.OXO1("AIManager getAIModel -> " + r1 + "  isZh(Utils.getApp()) = " + UtilsKt.IXI(r3));
        return r1;
    L5:
        r1 = 1;
        goto L6
    }

    public final void IIX1OXO(@aa1 String r45, @aa1 String r46, @aa1 String r47, @tb1 final Function1<? super AITranslationUrl, Unit> r48) {
        Intrinsics.X0O(r45, "language");
        Intrinsics.X0O(r46, GetCallTranslationUrl.TARGET_LANGUAGE);
        Intrinsics.X0O(r47, "type");
        String r3 = i72.OXO1.O001I();
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        r4.OXO1("AIManager getCallTranslationUrl -> " + r3 + " , language = " + r45 + " , targetLanguage =" + r46);
        if (r3.length() != 0) goto L5;
        return;
    L5:
        BleCache r6 = BleCache.INSTANCE;
        String r5 = r6.getMBleName();
        String r12 = r6.getMFirmwareFlag();
        String r7 = BaseBleCache.getString$default(r6, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        String r13 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r13, "getAppVersionName(...)");
        SPUtils r8 = a01.OXO1.IiI10X();
        Object r14 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r9 = new Gson().fromJson(r8.getString(AppUser.class.getName()), AppUser.class);
        if (r9 == null) goto L9;
        r14 = r9;
    L9:
        String r10 = new Gson().toJson(new BleInfo(((AppUser) r14).getIdentity(), r5, r12, RequestBodyKt.PROJECT_ID, r7, r13, oe5.IXO0OOi(r6.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), 0));
        NetWorkUtils r11 = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(r10);
        HashMap<String, String> r0 = RequestBodyKt.getCallTranslationUrlBodyWithBleInfo(r3, r45, r46, r47, r10);
        final O1XIiIO<AITranslationUrl> r1 = new AIManager$getCallTranslationUrlWithBleInfo$1(r48);
        final Activity r2 = null;
        final uq r15 = r11.loadPopup(null, null);
        Api r16 = Api.INSTANCE;
        r4.OXO1("JSON Api.BASE_URL -> " + r16.getBASE_URL() + " , url = " + GetCallTranslationUrl.URL);
        String r17 = r11.convertBaseUrl(r16.getBASE_URL(), GetCallTranslationUrl.URL);
        NetWork r18 = NetWork.OXO1;
        String r19 = r17 + GetCallTranslationUrl.URL;
        final O1XIiIO<com.sma.androidnetworklib.model.Response<AITranslationUrl>> r20 = new AIManager$getCallTranslationUrlWithBleInfo$$inlined$postJson$default$1(r2, r1, r15);
        AndroidNetworking.post(r19).addApplicationJsonBody(r0).setTag(r19).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, new Type[]{AITranslationUrl.class}), new AIManager$getCallTranslationUrlWithBleInfo$$inlined$postJson$default$2(r20));
    }

    @aa1
    public final String IO(int r4) {
        q62 r0 = q62.OXO1;
        String r1 = r0.XXO();
        if (r1.length() != 0) goto L21;
        r1 = r0.X11iII1O1();
        if (r1.length() != 0) goto L21;
        if (r4 != 0) goto L8;
        return "openAIService";
    L8:
        if (r4 == 1) goto L15;
        if (r4 == 2) goto L12;
        return "baiduAIService";
    L12:
        return "deepseekAIService";
    L15:
        if (r0.i0101i() == false) goto L18;
        return "sparkAIService";
    L18:
        return "baiduAIService";
    L21:
        return r1;
    }

    public final int IXXOO() {
        return O00;
    }

    public final void Ii0X0X() {
        XO0X10iO();
    }

    public final void Ii1iii0(final AIQuestion r5, final X1i.OXO1 r6) {
        Handler r0 = IiI10X;
        r0.postDelayed(new XOXOIX0Oi(r5, r6), 400);
        r0.postDelayed(new IiXIIX1O1(r5, r6), 700);
        r0.postDelayed(new iIIIiIO0(r5, r6), 1000);
    }

    public final void O00(@aa1 AIQuestion r2, int r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "question");
        Intrinsics.X0O(r5, "url");
        if (q62.OXO1.iX0iiiXi() == false) goto L6;
        XXiIiX10(r2);
        return;
    L6:
        X11iII1O1(r2, r3, r4, r5);
    }

    public final void O1O(@aa1 AIError r3) {
        Intrinsics.X0O(r3, "error");
        String r4 = r3.getCode();
        int r0 = r4.hashCode();
        if (r0 == (-656062448)) goto L20;
        if (r0 == 221600882) goto L15;
        if (r0 == 1715548988) goto L10;
    L21:
        ToastUtils.showLong(UtilsKt.XXO(R.string.request_error), new Object[0]);
        return;
    L10:
        if (r4.equals("insufficient_quota") == false) goto L21;
        ToastUtils.showLong(R.string.insufficient_quota);
        return;
    L15:
        if (r4.equals("invalid_api_key") == false) goto L21;
        ToastUtils.showLong(R.string.invalid_api_key);
        return;
    L20:
        if (r4.equals("invalid_request_error") == false) goto L21;
        ToastUtils.showLong(R.string.invalid_api_key_tip);
    }

    @aa1
    public final String OX(@aa1 String r7, int r8, boolean r9, int r10) {
        Intrinsics.X0O(r7, "query");
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        if (UtilsKt.IiiXiI0I(r0) == false) goto L6;
        i1O0OXO1O.OXO1.OXO1("AIManager getDuserStreamChatBody -> p:108, " + r7 + ", mode:" + r8 + ", maxTokens:" + r10);
        return "{\"pid\":\"108\",\"mode\": " + r8 + ",\"qid\":\"abc\",\"data\":{\"prompt\":\"" + r7 + "\",\"stream\":" + r9 + ",\"max_tokens\":" + r10 + "},\"dcs_data\":{\"cuid\":\"lyxabc1234\",\"didp\":\"11\",\"sn\":\"lyxabc1234\",\"events\":\"{\\\"clientContext\\\":[{\\\"header\\\":{\\\"name\\\":\\\"AlertsState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.alerts\\\"},\\\"payload\\\":{\\\"activeAlerts\\\":[],\\\"allAlerts\\\":[]}},{\\\"header\\\":{\\\"name\\\":\\\"VolumeState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.speaker_controller\\\"},\\\"payload\\\":{\\\"muted\\\":false,\\\"volume\\\":80}},{\\\"header\\\":{\\\"name\\\":\\\"PlaybackState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.video_player\\\"},\\\"payload\\\":{\\\"offsetInMilliseconds\\\":0,\\\"playerActivity\\\":\\\"FINISHED\\\",\\\"token\\\":\\\"\\\"}},{\\\"header\\\":{\\\"name\\\":\\\"SpeechState\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.voice_output\\\"},\\\"payload\\\":{\\\"offsetInMilliseconds\\\":0,\\\"playerActivity\\\":\\\"FINISHED\\\",\\\"token\\\":\\\"\\\"}}],\\\"event\\\":{\\\"header\\\":{\\\"name\\\":\\\"ListenStarted\\\",\\\"namespace\\\":\\\"ai.dueros.device_interface.voice_input\\\",\\\"messageId\\\":\\\"123\\\",\\\"dialogRequestId\\\":\\\"123\\\"},\\\"payload\\\":{\\\"format\\\":\\\"AUDIO_L16_RATE_16000_CHANNELS_1\\\",\\\"profile\\\":\\\"\\\"}}}\"}}";
    L6:
        i1O0OXO1O.OXO1.OXO1("AIManager getDuserStreamChatBody -> p:106, " + r7 + ", mode:" + r8 + ", maxTokens:" + r10);
        return "{\"pid\": \"106\",\"mode\": 2,\"qid\": \"abc\",\"data\": {\"prompt\": \"" + r7 + "\",\"stream\": " + r9 + ",\"max_tokens\": " + r10 + "}}";
    }

    public final void OX110i(String r1) {
        XOX0O0(r1);
    }

    public final void X00XIX1(@tb1 O1XIiIO<AIAnswer> r1) {
        iO = r1;
    }

    @aa1
    public final String X01IiOiIi(@aa1 String r3, int r4) {
        Intrinsics.X0O(r3, "query");
        if (q62.OXO1.XOX() == false) goto L6;
        return r3;
    L6:
        return r3 + " . " + Utils.getApp().getString(R.string.ai_max_tokens_question, new Object[]{Integer.valueOf(r4)});
    }

    public final void X0O(@aa1 String r7, @aa1 String r8, @aa1 String r9, @tb1 final Function1<? super AITranslationUrl, Unit> r10) {
        Intrinsics.X0O(r7, "language");
        Intrinsics.X0O(r8, GetCallTranslationUrl.TARGET_LANGUAGE);
        Intrinsics.X0O(r9, "type");
        String r0 = i72.OXO1.O001I();
        i1O0OXO1O r1 = i1O0OXO1O.OXO1;
        r1.OXO1("AIManager getCallTranslationUrl -> " + r0 + " , language = " + r7 + " , targetLanguage =" + r8);
        if (r0.length() != 0) goto L5;
        return;
    L5:
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r11 = RequestBodyKt.getCallTranslationUrlBody(r0, r7, r8, r9);
        final O1XIiIO<AITranslationUrl> r12 = new AIManager$getCallTranslationUrl$1(r10);
        final Activity r13 = null;
        final uq r14 = r2.loadPopup(null, null);
        Api r3 = Api.INSTANCE;
        r1.OXO1("JSON Api.BASE_URL -> " + r3.getBASE_URL() + " , url = " + GetCallTranslationUrl.URL);
        String r4 = r2.convertBaseUrl(r3.getBASE_URL(), GetCallTranslationUrl.URL);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + GetCallTranslationUrl.URL;
        final O1XIiIO<com.sma.androidnetworklib.model.Response<AITranslationUrl>> r15 = new AIManager$getCallTranslationUrl$$inlined$postJson$default$1(r13, r12, r14);
        AndroidNetworking.post(r6).addApplicationJsonBody(r11).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, new Type[]{AITranslationUrl.class}), new AIManager$getCallTranslationUrl$$inlined$postJson$default$2(r15));
    }

    public final void X11iII1O1(final AIQuestion r8, int r9, int r10, String r11) {
        r8.setStream(true);
        if (Intrinsics.XOO0ii0(r11, GetAIChat.URL) == false) goto L5;
        String r12 = XiOIii1(r10);
    L6:
        r8.setModel(r12);
        i1O0OXO1O.OXO1.OXO1("AIManager oldAIChat -> model = " + r8.getModel() + " , question = " + r8);
        r8.setText(X01IiOiIi(r8.getText(), r9));
        final StringBuilder r13 = new StringBuilder();
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r3 = new Gson().toJson(r8);
        Intrinsics.O10IXXX0X(r3, "toJson(...)");
        XOO0ii0 = NetWorkUtils.postStreamRequest$default(r0, r11, null, r3, new AIManager$oldAIChat$1(r13, r8), 2, null);
        return;
    L5:
        r12 = "openAIService";
        goto L6
    }

    public final void X1IX(@aa1 String r2, @aa1 AIFunctionType r3, int r4) {
        Intrinsics.X0O(r2, "query");
        Intrinsics.X0O(r3, "messageType");
        OXO1 r0 = new OXO1(r2, r4, r3);
        I0iXXO = r0;
        ThreadUtils.executeByIo(r0);
    }

    @aa1
    public final String X1ii(int r4) {
        q62 r0 = q62.OXO1;
        String r1 = r0.X11iII1O1();
        if (r1.length() != 0) goto L19;
        if (r4 != 0) goto L6;
        return "openAIService";
    L6:
        if (r4 == 1) goto L13;
        if (r4 == 2) goto L10;
        return "baiduAIService";
    L10:
        return "deepseekAIService";
    L13:
        if (r0.i0101i() == false) goto L16;
        return "sparkAIService";
    L16:
        return "baiduAIService";
    L19:
        return r1;
    }

    public final void XO0X10iO() {
        i1O0OXO1O.OXO1.OXO1("AIManager -> AndroidNetworking.cancelAll stop ");
        AndroidNetworking.cancelAll();
        DcsTtsPlayer.INSTANCE.stop();
        VoicePlayer.INSTANCE.stop();
        ThreadUtils.SimpleTask<Void> r0 = I0iXXO;
        if (r0 == null) goto L5;
        ThreadUtils.cancel(r0);
    L5:
        EventSource r1 = I0IIOi;
        if (r1 == null) goto L9;
        if (r1 == null) goto L9;
        r1.cancel();
    L9:
        EventSource r2 = XOO0ii0;
        if (r2 == null) goto L14;
        if (r2 == null) goto L15;
        r2.cancel();
        return;
    L15:
        return;
    }

    public final void XOX0O0(String r11) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        BleVoice.BleDeviceEmotion r4 = null;
        BleVoice r0 = new BleVoice(r1, r2, r3, r4, System.currentTimeMillis(), r11, 14, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r0, false, false, 24, null);
    }

    @aa1
    public final String XX0(@aa1 String r2, boolean r3, int r4) {
        Intrinsics.X0O(r2, "text");
        return "{    \"model\": \"gpt-3.5-turbo\",    \"messages\": [        {            \"role\": \"system\",            \"content\": \"You are a helpful assistant.\"        },        {            \"role\": \"user\",            \"content\": \"" + X01IiOiIi(r2, r4) + "\"        }    ],    \"stream\": " + r3 + ",    \"max_tokens\": 250}";
    }

    public final void XX1Oi(@aa1 final Function1<? super Boolean, Unit> r8) {
        Intrinsics.X0O(r8, "callback");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        String r1 = GetDcsToken.INSTANCE.getURL();
        HashMap<String, String> r2 = RequestBodyKt.getDcsTokenBody();
        final O1XIiIO<DcsToken> r3 = new AIManager$refreshToken$1(r8);
        final Activity r9 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), r1);
        r0.printParam(r5 + r1, r2);
        NetWork r6 = NetWork.OXO1;
        String r7 = r5 + r1;
        final O1XIiIO<com.sma.androidnetworklib.model.Response<DcsToken>> r10 = new AIManager$refreshToken$$inlined$post$default$1(r9, r3, r4);
        AndroidNetworking.post(r7).addBodyParameter(r2).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(com.sma.androidnetworklib.model.Response.class, new Type[]{DcsToken.class}), new AIManager$refreshToken$$inlined$post$default$2(r10));
    }

    public final boolean XXIIO1i11() {
        Object r0 = new Gson().fromJson(a01.OXO1.IiI10X().getString(DcsToken.class.getName()), DcsToken.class);
        if (r0 != null) goto L5;
        r0 = DcsToken.class.newInstance();
    L5:
        DcsToken r1 = (DcsToken) r0;
        if ((System.currentTimeMillis() - r1.getTimestamp()) <= r1.getExpires_in()) goto L9;
        return true;
    L9:
        return false;
    }

    public final void XXO(@aa1 AIQuestion r9, @tb1 O1XIiIO<AIAnswer> r10, boolean r11) {
        Intrinsics.X0O(r9, "question");
        iO = r10;
        XO0O10 = r11;
        IiI10X(this, r9, 0, 0, GetAIChatV2.URL, 6, null);
    }

    public final void XXiIiX10(AIQuestion r11) {
        WebSocketManager r0 = WebSocketManager.INSTANCE;
        r0.sendTextMessage(r11.getText());
        AIAnswer r2 = new AIAnswer(r11.getType(), null, 0, null, null, 26, null);
        r0.setMOnCallback(new XIi00iiXO(new StringBuilder(), r2));
    }

    @aa1
    public final String XiOIii1(int r3) {
        if (r3 != 0) goto L4;
        return "baiduAIService";
    L4:
        if (r3 != 1) goto L6;
        return "openAIService";
    L6:
        if (r3 != 2) goto L8;
        return "sparkAIService";
    L8:
        if (r3 != 3) goto L10;
        return "deepseekAIService";
    L10:
        return OIX0iXi(this, 0, 1, null);
    }

    @aa1
    public final String i010I(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "query");
        if (q62.OXO1.XOX() == false) goto L6;
        return r2;
    L6:
        return String.valueOf(Utils.getApp().getString(R.string.ai_max_tokens_question2, new Object[]{r2, UtilsKt.XXO(R.string.app_name)}));
    }

    public final void i0X000X0O(boolean r1) {
        XO0O10 = r1;
    }

    public final void i11I(int r1) {
        O00 = r1;
    }

    public final boolean iI() {
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L5;
    L15:
        return true;
    L5:
        if (r0.XOX() == true) goto L15;
        Application r1 = Utils.getApp();
        Intrinsics.O10IXXX0X(r1, "getApp(...)");
        if (UtilsKt.IXI(r1) == false) goto L12;
        if (Intrinsics.XOO0ii0(OIX0iXi(this, 0, 1, null), "baiduAIService") == false) goto L12;
    L13:
        return true;
    L12:
        if (Intrinsics.XOO0ii0(OIX0iXi(this, 0, 1, null), "sparkAIService") == true) goto L13;
        return false;
    }

    public final void iIXi1iiXI(@aa1 final AIQuestion r8, @tb1 O1XIiIO<AIAnswer> r9, boolean r10, boolean r11, final int r12, int r13) {
        Intrinsics.X0O(r8, "question");
        iO = r9;
        XO0O10 = r10;
        if (r11 == false) goto L5;
        XO0X10iO();
    L5:
        X1i.OXO1 r14 = X1i.OXO1.iO(r8.getText());
        if (r14 == null) goto L9;
        Ii1iii0(r8, r14);
        return;
    L9:
        DcsTtsPlayer.INSTANCE.deleteReplayMusic();
        i1O0OXO1O r15 = i1O0OXO1O.OXO1;
        q62 r16 = q62.OXO1;
        r15.OXO1("AIManager query  isUseAIService = " + r16.XOX() + " , isSupportDirectAI = " + r16.i01XIiIiI());
        if (i72.OXO1.I0IIOI() == false) goto L23;
        if (r13 < 0) goto L23;
        if (r13 > 3) goto L23;
        if (r13 == 2) goto L17;
    L20:
        IiI10X(this, r8, r12, r13, null, 8, null);
        return;
    L17:
        if (r16.OIXOOi() == false) goto L20;
        AISparkChainManager.OXO1.iXiiiO(r8.getText(), iO, r12, r10);
        return;
    L23:
        if (r16.OIXOOi() == false) goto L27;
        AISparkChainManager.OXO1.iXiiiO(r8.getText(), iO, r12, r10);
        return;
    L27:
        if (r16.XOX() == false) goto L31;
        IiI10X(this, r8, r12, 0, null, 12, null);
        return;
    L31:
        if (r16.IiX1ii() == false) goto L39;
        if (XXIIO1i11() == false) goto L36;
        XX1Oi(new i1O11001(r8, r12));
        return;
    L36:
        OIi0(this, r8.getText(), r8.getType(), 0, r12, 4, null);
        return;
    L39:
        if (TextUtils.isEmpty(r16.iIiiO()) == false) goto L44;
        ToastUtils.showLong(R.string.no_ai_key);
        O1XIiIO<AIAnswer> r17 = iO;
        if (r17 == null) goto L46;
        r17.handleError(UtilsKt.XXO(R.string.no_ai_key));
        return;
    L46:
        return;
    L44:
        X1IX(r8.getText(), r8.getType(), r12);
    }

    @tb1
    public final O1XIiIO<AIAnswer> iIiiO() {
        return iO;
    }

    @aa1
    public final String iOO1ii1(@aa1 String r3) {
        Intrinsics.X0O(r3, "query");
        return r3 + " , " + Utils.getApp().getString(R.string.ai_translate_question_tip);
    }

    @aa1
    public final Map<String, String> iOOX010X() {
        a01 r0 = a01.OXO1;
        Object r1 = new Gson().fromJson(r0.IiI10X().getString(DcsToken.class.getName()), DcsToken.class);
        if (r1 != null) goto L5;
        r1 = DcsToken.class.newInstance();
    L5:
        DcsToken r2 = (DcsToken) r1;
        String r3 = r2.getClient_id();
        if (r3.length() != 0) goto L8;
        r3 = IO;
    L8:
        i1O0OXO1O.OXO1.OXO1("AIManager dcsToken -> " + r2 + "  clientId = " + r3);
        Pair r4 = TuplesKt.OXO1("Client-Id", r3);
        Object r5 = new Gson().fromJson(r0.IiI10X().getString(DcsToken.class.getName()), DcsToken.class);
        if (r5 != null) goto L12;
        r5 = DcsToken.class.newInstance();
    L12:
        return kotlin.collections.OXO1.X11I(new Pair[]{r4, TuplesKt.OXO1("Authorization", "Bearer " + ((DcsToken) r5).getAccess_token()), TuplesKt.OXO1("Device-Id", oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null))});
    }

    @aa1
    public final String iOiXi11II(@aa1 String r2) {
        Intrinsics.X0O(r2, "titleStr");
        switch(r2.hashCode()) {
            case -1671190941: goto L21;
            case -361646967: goto L16;
            case -345876046: goto L11;
            case 1088442160: goto L6;
            default: goto L23;
        };
    L6:
        if (r2.equals("sparkAIService") == false) goto L23;
        return UtilsKt.XXO(R.string.ai_model_spark_desk);
    L11:
        if (r2.equals("baiduAIService") == false) goto L23;
        return UtilsKt.XXO(R.string.wenxinyiyan);
    L16:
        if (r2.equals("deepseekAIService") == false) goto L23;
        return UtilsKt.XXO(R.string.pay_dail_aigc_deep_seek);
    L21:
        if (r2.equals("openAIService") == false) goto L23;
        return UtilsKt.XXO(R.string.chatgpt);
    L23:
        if (r2.length() == 0) goto L25;
        return r2;
    L25:
        return UtilsKt.XXO(R.string.pay_dail_aigc_modle);
    }

    public final boolean iX1O1() {
        return XO0O10;
    }
}
