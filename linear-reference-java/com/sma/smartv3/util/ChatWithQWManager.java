package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.Iii1I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.ty0;
import com.google.gson.Gson;
import com.sma.smartv3.model.AiChatAnswerData;
import com.sma.smartv3.model.AiChatQuestionData;
import com.sma.smartv3.network.GetAIChat;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.audio_play.MediaPlayManager;
import com.sma.smartv3.util.tts.ServerTTSStrategy;
import com.sma.smartv3.util.tts.TTSData;
import com.sma.smartv3.util.tts.TTSManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nChatWithQWManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n17#2:139\n19#2:143\n46#3:140\n51#3:142\n105#4:141\n*S KotlinDebug\n*F\n+ 1 ChatWithQWManager.kt\ncom/sma/smartv3/util/ChatWithQWManager\n*L\n37#1:139\n37#1:143\n37#1:140\n37#1:142\n37#1:141\n*E\n"})
public final class ChatWithQWManager {
    public long I0IIOi;

    @aa1
    public final MediaPlayManager I0iXXO;

    @aa1
    public final TTSManager IO;
    public int IiI10X;

    @aa1
    public final ii0iIIX0<AiChatAnswerData> O00;

    @aa1
    public final ServerTTSStrategy OIX0iXi;
    public final long OIi0;

    @aa1
    public final String OXO1;

    @aa1
    public final ty0<Iii1I> XIi00iiXO;

    @aa1
    public final ry0<AiChatAnswerData> XO0O10;
    public final int XOO0ii0;

    @aa1
    public final k85<Iii1I> iO;

    public ChatWithQWManager() {
        this.OXO1 = "ChatWithQWManager";
        ty0<Iii1I> r0 = l85.OXO1(Iii1I.XIi00iiXO.OXO1);
        this.XIi00iiXO = r0;
        this.iO = iX0XiO.XXI(r0);
        ry0<AiChatAnswerData> r1 = m94.XIi00iiXO(0, 64, null, 5, null);
        this.XO0O10 = r1;
        final l94 r2 = iX0XiO.I0iXXO(r1);
        this.O00 = new ChatWithQWManager$special$$inlined$filter$1(r2, this);
        this.XOO0ii0 = 5;
        this.OIi0 = 60;
        this.IO = new TTSManager();
        this.OIX0iXi = new ServerTTSStrategy();
        this.I0iXXO = new MediaPlayManager(null, 1, null);
    }

    public static final /* synthetic */ boolean OXO1(ChatWithQWManager r0, AiChatAnswerData r1) {
        return r0.IiI10X(r1);
    }

    public static final /* synthetic */ String XIi00iiXO(ChatWithQWManager r0) {
        return r0.OXO1;
    }

    public static final /* synthetic */ ty0 XO0O10(ChatWithQWManager r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ ry0 iO(ChatWithQWManager r0) {
        return r0.XO0O10;
    }

    @aa1
    public final k85<Iii1I> I0IIOi() {
        return this.iO;
    }

    public final void IO() {
        this.IO.iO();
    }

    public final boolean IiI10X(AiChatAnswerData r5) {
        boolean r1 = true;
        if ((System.currentTimeMillis() - this.I0IIOi) <= this.OIi0) goto L5;
    L10:
        if (r1 == false) goto L12;
        this.I0IIOi = System.currentTimeMillis();
        this.IiI10X = r5.getText().length();
    L12:
        return r1;
    L5:
        if (r5.getEnded() == 1) goto L10;
        if ((r5.getText().length() - this.IiI10X) > this.XOO0ii0) goto L10;
        r1 = false;
        goto L10
    }

    @aa1
    public final AiChatQuestionData O00(@aa1 String r8) {
        Intrinsics.X0O(r8, "data");
        return new AiChatQuestionData(r8, false, null, 6, null);
    }

    public final void OIX0iXi(@aa1 AiChatQuestionData r4) {
        Intrinsics.X0O(r4, "chatQuestion");
        TTSData r0 = new TTSData(r4.getText(), r4.getModel(), TTSData.TTSType.Server);
        this.IO.IiI10X(this.OIX0iXi).O00(this.I0iXXO).XO0O10(r0);
    }

    public final void OIi0(@aa1 String r10) {
        Intrinsics.X0O(r10, "data");
        final AiChatQuestionData r11 = O00(r10);
        final StringBuilder r0 = new StringBuilder();
        final Gson r1 = new Gson();
        String r5 = r1.toJson(r11);
        setValue(Iii1I.iO.OXO1);
        NetWorkUtils r2 = NetWorkUtils.INSTANCE;
        Intrinsics.XXI(r5);
        NetWorkUtils.postStreamRequest$default(r2, GetAIChat.URL, null, r5, new ChatWithQWManager$sendText$1(r1, this, r0, r11), 2, null);
    }

    @aa1
    public final ii0iIIX0<AiChatAnswerData> XOO0ii0() {
        return this.O00;
    }
}
