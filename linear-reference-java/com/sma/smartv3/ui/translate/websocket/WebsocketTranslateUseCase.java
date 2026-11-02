package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.iOX1XO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.wx6;
import com.ironsource.C2985d4;
import com.sma.smartv3.ui.translate.AudioRepository;
import com.sma.smartv3.ui.translate.TranslateEntityRepository;
import com.sma.smartv3.util.websocket.ConnectionState;
import com.sma.smartv3.util.websocket.data.AudioEndMessage;
import com.sma.smartv3.util.websocket.data.STTMessage;
import com.sma.smartv3.util.websocket.data.WebSocketMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class WebsocketTranslateUseCase {

    @aa1
    public final iOX1XO I0IIOi;

    @aa1
    public final ry0<String> I0iXXO;

    @aa1
    public final k85<Boolean> IO;

    @aa1
    public final ry0<Pair<iOIXXXII0, Boolean>> IiI10X;

    @aa1
    public final String O00;

    @aa1
    public final k85<Boolean> O10IXXX0X;

    @tb1
    public XiOIO OIX0iXi;

    @aa1
    public final k85<ConnectionState> OIi0;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final List<iOIXXXII0> X0O;

    @aa1
    public final k85<Boolean> X1ii;

    @aa1
    public final TranslateWebSocketRepository XIi00iiXO;

    @tb1
    public final TranslateEntityRepository XO0O10;

    @aa1
    public final l94<Pair<iOIXXXII0, Boolean>> XOO0ii0;

    @aa1
    public final ii0iIIX0<String> XXI;

    @aa1
    public final AudioRepository iO;

    public static final class OXO1 implements iXOIii {
        public final /* synthetic */ WebsocketTranslateUseCase OXO1;

        public OXO1(WebsocketTranslateUseCase r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] r1, Continuation<? super Unit> r2) {
            WebsocketTranslateUseCase.XOO0ii0(this.OXO1).XOO0ii0().send(r1);
            return Unit.OXO1;
        }
    }

    public WebsocketTranslateUseCase(@aa1 i00OIXiO r10, @aa1 TranslateWebSocketRepository r11, @aa1 AudioRepository r12, @tb1 TranslateEntityRepository r13) {
        Intrinsics.X0O(r10, "scope");
        Intrinsics.X0O(r11, "wsRepo");
        Intrinsics.X0O(r12, "audioRepo");
        this.OXO1 = r10;
        this.XIi00iiXO = r11;
        this.iO = r12;
        this.XO0O10 = r13;
        this.O00 = "MyTranslateUseCase";
        ry0<Pair<iOIXXXII0, Boolean>> r14 = m94.XIi00iiXO(1, 0, null, 6, null);
        this.IiI10X = r14;
        this.XOO0ii0 = iX0XiO.I0iXXO(r14);
        this.I0IIOi = iOX1XO.OXO1.XIi00iiXO(iOX1XO.XXI, null, null, false, 7, null);
        k85<ConnectionState> r15 = r11.I0IIOi();
        this.OIi0 = r15;
        k85<Boolean> r16 = r12.iO();
        this.IO = r16;
        ry0<String> r17 = m94.XIi00iiXO(0, 0, null, 7, null);
        this.I0iXXO = r17;
        this.XXI = iX0XiO.XOX0O0(iX0XiO.XO0X10iO(iX0XiO.I0iXXO(r17)), new wx6());
        ii0iIIX0 r18 = iX0XiO.XO0X10iO(iX0XiO.IXXOO(r15, r16, new WebsocketTranslateUseCase$connectedAndSpeakingFlow$1(null)));
        kotlinx.coroutines.flow.OXO1.C0655OXO1 r0 = kotlinx.coroutines.flow.OXO1.OXO1;
        kotlinx.coroutines.flow.OXO1 r1 = r0.iO();
        Boolean r3 = Boolean.FALSE;
        this.X1ii = iX0XiO.OXI0Xi(r18, r10, r1, r3);
        this.O10IXXX0X = iX0XiO.OXI0Xi(iX0XiO.IXXOO(r15, r16, new WebsocketTranslateUseCase$speakingOrConnectedFlow$1(this, null)), r10, r0.iO(), r3);
        this.X0O = new ArrayList();
    }

    public static final /* synthetic */ Object I0IIOi(WebsocketTranslateUseCase r0, AudioEndMessage r1, Continuation r2) {
        return r0.iIiiO(r1, r2);
    }

    public static /* synthetic */ XiOIO II1Xi0(WebsocketTranslateUseCase r1, TranslateUseCaseMODE r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = true;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = true;
    L9:
        return r1.X01IiOiIi(r2, r3, r4);
    }

    public static final /* synthetic */ void IO(WebsocketTranslateUseCase r0, XiOIO r1) {
        r0.OIX0iXi = r1;
    }

    public static final /* synthetic */ TranslateEntityRepository IiI10X(WebsocketTranslateUseCase r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ String O00(WebsocketTranslateUseCase r0) {
        return r0.O00;
    }

    public static final long OIX0iXi(String r2) {
        Intrinsics.X0O(r2, "it");
        return 1000;
    }

    public static final /* synthetic */ Object OIi0(WebsocketTranslateUseCase r0, STTMessage r1, Continuation r2) {
        return r0.XX0(r1, r2);
    }

    public static /* synthetic */ long OXO1(String r2) {
        return OIX0iXi(r2);
    }

    public static /* synthetic */ void X0O() {
    }

    public static final /* synthetic */ iOX1XO XIi00iiXO(WebsocketTranslateUseCase r0) {
        return r0.I0IIOi;
    }

    public static final /* synthetic */ XiOIO XO0O10(WebsocketTranslateUseCase r0) {
        return r0.OIX0iXi;
    }

    public static final /* synthetic */ TranslateWebSocketRepository XOO0ii0(WebsocketTranslateUseCase r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ AudioRepository iO(WebsocketTranslateUseCase r0) {
        return r0.iO;
    }

    @aa1
    public final XiOIO I0iXXO() {
        return I100X1.O00(this.OXO1, null, null, new WebsocketTranslateUseCase$clear$1(this, null), 3, null);
    }

    @tb1
    public final Object I1(@aa1 Continuation<? super String> r8) {
        if ((r8 instanceof WebsocketTranslateUseCase$saveToRoom$1) == false) goto L8;
        WebsocketTranslateUseCase$saveToRoom$1 r0 = (WebsocketTranslateUseCase$saveToRoom$1) r8;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L8;
        r0.label = r1 - Integer.MIN_VALUE;
    L7:
        WebsocketTranslateUseCase$saveToRoom$1 r4 = r0;
        Object r9 = r4.result;
        Object r2 = pb.I0iXXO();
        int r3 = r4.label;
        if (r3 == 0) goto L17;
        if (r3 == 1) goto L16;
        if (r3 != 2) goto L15;
        String r5 = (String) r4.L$0;
        ResultKt.X1ii(r9);
    L26:
        return (String) r9;
    L15:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L16:
        ResultKt.X1ii(r9);
    L20:
        String r10 = (String) r9;
        i1O0OXO1O.OXO1.OXO1(this.O00 + " LocalAudioPath:" + r10);
        TranslateEntityRepository r6 = this.XO0O10;
        if (r6 == null) goto L27;
        r4.L$0 = SpillingKt.OXO1(r10);
        r4.label = 2;
        r9 = TranslateEntityRepository.OIi0(r6, r10, 0, r4, 2, null);
        if (r9 != r2) goto L26;
    L24:
        return r2;
    L27:
        return null;
    L17:
        ResultKt.X1ii(r9);
        AudioRepository r11 = this.iO;
        r4.label = 1;
        r9 = r11.O00(r4);
        if (r9 != r2) goto L20;
    L8:
        r0 = new WebsocketTranslateUseCase$saveToRoom$1(this, r8);
        goto L7
    }

    @aa1
    public final k85<Boolean> I1XOi1() {
        return this.X1ii;
    }

    @aa1
    public final k85<Boolean> IIX1OXO() {
        return this.O10IXXX0X;
    }

    @aa1
    public final XiOIO IXXOO() {
        return this.iO.X1ii();
    }

    @aa1
    public final ii0iIIX0<String> O10IXXX0X() {
        return this.XXI;
    }

    public final void O1O(@aa1 Function1<? super iOX1XO, Unit> r2) {
        Intrinsics.X0O(r2, "update");
        r2.invoke(this.I0IIOi);
    }

    public final void OII() {
        i1O0OXO1O.OXO1.OXO1("MyTranslateUseCase AudioMessage:" + this.I0IIOi);
    }

    public final Pair<iOIXXXII0, Boolean> OX(STTMessage r17) {
        String r7 = r17.getText();
        String r1 = r17.getTranslation();
        if (r1 != null) goto L5;
        r1 = "";
    L5:
        String r6 = r1;
        String r9 = r17.getTo_lang();
        String r4 = r17.getType();
        float r2 = r17.getDuration();
        String r10 = r17.getSessionId();
        Integer r12 = r17.getTts_end();
        String r3 = null;
        String r8 = null;
        String r11 = null;
        boolean r13 = false;
        iOIXXXII0 r5 = new iOIXXXII0(r3, Integer.valueOf(X0O()), r4, Float.valueOf(r2), r6, r7, r8, r9, r10, r11, r12, r13, 2625, null);
        if (this.X0O.isEmpty() == true) goto L13;
        Integer r14 = ((iOIXXXII0) CollectionsKt___CollectionsKt.Xi1XO00(this.X0O)).OII();
        boolean r15 = true;
        if (r14 != null) goto L11;
    L14:
        if (r15 == false) goto L16;
        List<iOIXXXII0> r16 = this.X0O;
        r16.set(CollectionsKt__CollectionsKt.X11iII1O1(r16), r5);
    L18:
        return TuplesKt.OXO1(r5, Boolean.valueOf(r15));
    L16:
        this.X0O.add(r5);
        goto L18
    L11:
        if (r14.intValue() != 1) goto L14;
    L13:
        r15 = false;
        goto L14
    }

    @aa1
    public final k85<Boolean> OiIIX101O() {
        return this.IO;
    }

    @aa1
    public final XiOIO X01IiOiIi(@aa1 TranslateUseCaseMODE r10, boolean r11, boolean r12) {
        Intrinsics.X0O(r10, C2985d4.a.t);
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new WebsocketTranslateUseCase$startConversation$1(r10, this, r12, r11, null), 2, null);
    }

    @aa1
    public final l94<Pair<iOIXXXII0, Boolean>> X1ii() {
        return this.XOO0ii0;
    }

    public final Object XX0(STTMessage r2, Continuation<? super Unit> r3) {
        TranslateEntityRepository r0 = this.XO0O10;
        if (r0 == null) goto L5;
        r0.OIX0iXi(r2);
    L5:
        Pair<iOIXXXII0, Boolean> r4 = OX(r2);
        Object r5 = emit(r4, r3);
        if (r5 != pb.I0iXXO()) goto L9;
        return r5;
    L9:
        return Unit.OXO1;
    }

    public final void XXI() {
        XiOIO r0 = this.OIX0iXi;
        if (r0 != null) goto L5;
    L7:
        this.OIX0iXi = I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new WebsocketTranslateUseCase$collectData$1(this, null), 2, null);
        return;
    L5:
        if (r0.isActive() != true) goto L7;
    }

    @aa1
    public final ii0iIIX0<WebSocketMessage> XXIIO1i11() {
        return this.XIi00iiXO.OIi0();
    }

    @aa1
    public final k85<ConnectionState> XiOIO() {
        return this.OIi0;
    }

    public final void XiOIii1() {
        this.iO.XOO0ii0();
    }

    public final void i010I() {
        this.iO.I0IIOi(new OXO1(this));
    }

    public final Object iIiiO(AudioEndMessage r7, Continuation<? super Unit> r8) {
        if ((r8 instanceof WebsocketTranslateUseCase$handleAudioEnd$1) == false) goto L7;
        WebsocketTranslateUseCase$handleAudioEnd$1 r0 = (WebsocketTranslateUseCase$handleAudioEnd$1) r8;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L18;
        if (r3 == 1) goto L17;
        if (r3 == 2) goto L16;
        if (r3 != 3) goto L15;
        String r10 = (String) r0.L$1;
        AudioEndMessage r4 = (AudioEndMessage) r0.L$0;
        ResultKt.X1ii(r9);
    L34:
        String r11 = r10;
    L35:
        i1O0OXO1O.OXO1.OXO1("CurrentPath:" + r11);
    L37:
        return Unit.OXO1;
    L15:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L16:
        r10 = (String) r0.L$1;
        AudioEndMessage r5 = (AudioEndMessage) r0.L$0;
        ResultKt.X1ii(r9);
    L31:
        TranslateEntityRepository r12 = this.XO0O10;
        iOX1XO r6 = this.I0IIOi;
        r0.L$0 = SpillingKt.OXO1(r5);
        r0.L$1 = r10;
        r0.label = 3;
        if (r12.IO(r10, r6, r0) != r2) goto L34;
    L33:
        return r2;
    L17:
        r7 = (AudioEndMessage) r0.L$0;
        ResultKt.X1ii(r9);
    L25:
        r11 = (String) r9;
        if (r11 == null) goto L35;
        ry0<String> r13 = this.I0iXXO;
        r0.L$0 = SpillingKt.OXO1(r7);
        r0.L$1 = r11;
        r0.label = 2;
        if (r13.emit(r11, r0) == r2) goto L33;
        r5 = r7;
        r10 = r11;
        goto L31
    L18:
        ResultKt.X1ii(r9);
        if (r7.getAudio_end() == false) goto L37;
        if (this.XO0O10 == null) goto L37;
        AudioRepository r14 = this.iO;
        r0.L$0 = SpillingKt.OXO1(r7);
        r0.label = 1;
        r9 = r14.XO0O10(r0);
        if (r9 != r2) goto L25;
    L7:
        r0 = new WebsocketTranslateUseCase$handleAudioEnd$1(this, r8);
        goto L8
    }

    @tb1
    public final Object iOO1ii1(@aa1 Continuation<? super Unit> r2) {
        Object r3 = this.iO.I1XOi1(r2);
        if (r3 != pb.I0iXXO()) goto L6;
        return r3;
    L6:
        return Unit.OXO1;
    }

    public final void iOOX010X() {
        this.iO.IiI10X();
    }

    @aa1
    public final XiOIO iX(@aa1 TranslateUseCaseMODE r8) {
        Intrinsics.X0O(r8, C2985d4.a.t);
        return I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new WebsocketTranslateUseCase$stopConversation$1(r8, this, null), 2, null);
    }

    public /* synthetic */ WebsocketTranslateUseCase(i00OIXiO r1, TranslateWebSocketRepository r2, AudioRepository r3, TranslateEntityRepository r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
