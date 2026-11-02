package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
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
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p610ui.translate.AudioRepository;
import com.sma.smartv3.p610ui.translate.TranslateEntityRepository;
import com.sma.smartv3.p610ui.translate.websocket.WebsocketTranslateUseCase;
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

    /* JADX INFO: renamed from: IO */
    @aa1
    public final k85<Boolean> f54876IO;

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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final AudioRepository f54877iO;

    public static final class OXO1 implements iXOIii {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] bArr, Continuation<? super Unit> continuation) {
            WebsocketTranslateUseCase.this.XIi00iiXO.XOO0ii0().send(bArr);
            return Unit.OXO1;
        }
    }

    public WebsocketTranslateUseCase(@aa1 i00OIXiO scope, @aa1 TranslateWebSocketRepository wsRepo, @aa1 AudioRepository audioRepo, @tb1 TranslateEntityRepository translateEntityRepository) {
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(wsRepo, "wsRepo");
        Intrinsics.X0O(audioRepo, "audioRepo");
        this.OXO1 = scope;
        this.XIi00iiXO = wsRepo;
        this.f54877iO = audioRepo;
        this.XO0O10 = translateEntityRepository;
        this.O00 = "MyTranslateUseCase";
        ry0<Pair<iOIXXXII0, Boolean>> ry0VarXIi00iiXO = m94.XIi00iiXO(1, 0, null, 6, null);
        this.IiI10X = ry0VarXIi00iiXO;
        this.XOO0ii0 = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        this.I0IIOi = iOX1XO.OXO1.XIi00iiXO(iOX1XO.XXI, null, null, false, 7, null);
        k85<ConnectionState> k85VarI0IIOi = wsRepo.I0IIOi();
        this.OIi0 = k85VarI0IIOi;
        k85<Boolean> k85VarMo628iO = audioRepo.mo628iO();
        this.f54876IO = k85VarMo628iO;
        ry0<String> ry0VarXIi00iiXO2 = m94.XIi00iiXO(0, 0, null, 7, null);
        this.I0iXXO = ry0VarXIi00iiXO2;
        this.XXI = iX0XiO.XOX0O0(iX0XiO.XO0X10iO(iX0XiO.I0iXXO(ry0VarXIi00iiXO2)), new Function1() { // from class: com.android.mltcode.paycertificationapi.wx6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(WebsocketTranslateUseCase.OIX0iXi((String) obj));
            }
        });
        ii0iIIX0 ii0iiix0XO0X10iO = iX0XiO.XO0X10iO(iX0XiO.IXXOO(k85VarI0IIOi, k85VarMo628iO, new WebsocketTranslateUseCase$connectedAndSpeakingFlow$1(null)));
        kotlinx.coroutines.flow.OXO1.C22077OXO1 c22077oxo1 = kotlinx.coroutines.flow.OXO1.OXO1;
        kotlinx.coroutines.flow.OXO1 oxo1M39915iO = c22077oxo1.m39915iO();
        Boolean bool = Boolean.FALSE;
        this.X1ii = iX0XiO.OXI0Xi(ii0iiix0XO0X10iO, scope, oxo1M39915iO, bool);
        this.O10IXXX0X = iX0XiO.OXI0Xi(iX0XiO.IXXOO(k85VarI0IIOi, k85VarMo628iO, new WebsocketTranslateUseCase$speakingOrConnectedFlow$1(this, null)), scope, c22077oxo1.m39915iO(), bool);
        this.X0O = new ArrayList();
    }

    public static /* synthetic */ XiOIO II1Xi0(WebsocketTranslateUseCase websocketTranslateUseCase, TranslateUseCaseMODE translateUseCaseMODE, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return websocketTranslateUseCase.X01IiOiIi(translateUseCaseMODE, z, z2);
    }

    public static final long OIX0iXi(String it) {
        Intrinsics.X0O(it, "it");
        return 1000L;
    }

    public static /* synthetic */ void X0O() {
    }

    @aa1
    public final XiOIO I0iXXO() {
        return XX01Oi.IiI10X(this.OXO1, null, null, new WebsocketTranslateUseCase$clear$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r8 == r0) goto L24;
     */
    @tb1
    /* JADX INFO: renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38791I1(@aa1 Continuation<? super String> continuation) {
        WebsocketTranslateUseCase$saveToRoom$1 websocketTranslateUseCase$saveToRoom$1;
        if (continuation instanceof WebsocketTranslateUseCase$saveToRoom$1) {
            websocketTranslateUseCase$saveToRoom$1 = (WebsocketTranslateUseCase$saveToRoom$1) continuation;
            int i = websocketTranslateUseCase$saveToRoom$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                websocketTranslateUseCase$saveToRoom$1.label = i - Integer.MIN_VALUE;
            } else {
                websocketTranslateUseCase$saveToRoom$1 = new WebsocketTranslateUseCase$saveToRoom$1(this, continuation);
            }
        } else {
            websocketTranslateUseCase$saveToRoom$1 = new WebsocketTranslateUseCase$saveToRoom$1(this, continuation);
        }
        WebsocketTranslateUseCase$saveToRoom$1 websocketTranslateUseCase$saveToRoom$2 = websocketTranslateUseCase$saveToRoom$1;
        Object objO00 = websocketTranslateUseCase$saveToRoom$2.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = websocketTranslateUseCase$saveToRoom$2.label;
        if (i2 == 0) {
            ResultKt.X1ii(objO00);
            AudioRepository audioRepository = this.f54877iO;
            websocketTranslateUseCase$saveToRoom$2.label = 1;
            objO00 = audioRepository.O00(websocketTranslateUseCase$saveToRoom$2);
            if (objO00 != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i2 == 1) {
            ResultKt.X1ii(objO00);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(objO00);
        }
        return (String) objO00;
        String str = (String) objO00;
        i1O0OXO1O.OXO1.OXO1(this.O00 + " LocalAudioPath:" + str);
        TranslateEntityRepository translateEntityRepository = this.XO0O10;
        if (translateEntityRepository == null) {
            return null;
        }
        websocketTranslateUseCase$saveToRoom$2.L$0 = SpillingKt.OXO1(str);
        websocketTranslateUseCase$saveToRoom$2.label = 2;
        objO00 = TranslateEntityRepository.OIi0(translateEntityRepository, str, 0, websocketTranslateUseCase$saveToRoom$2, 2, null);
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
        return this.f54877iO.X1ii();
    }

    @aa1
    public final ii0iIIX0<String> O10IXXX0X() {
        return this.XXI;
    }

    public final void O1O(@aa1 Function1<? super iOX1XO, Unit> update) {
        Intrinsics.X0O(update, "update");
        update.invoke2(this.I0IIOi);
    }

    public final void OII() {
        i1O0OXO1O.OXO1.OXO1("MyTranslateUseCase AudioMessage:" + this.I0IIOi);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX INFO: renamed from: OX */
    public final Pair<iOIXXXII0, Boolean> m38792OX(STTMessage sTTMessage) {
        boolean z;
        String text = sTTMessage.getText();
        String translation = sTTMessage.getTranslation();
        if (translation == null) {
            translation = "";
        }
        String str = translation;
        String to_lang = sTTMessage.getTo_lang();
        String type = sTTMessage.getType();
        float duration = sTTMessage.getDuration();
        iOIXXXII0 ioixxxii0 = new iOIXXXII0(null, Integer.valueOf(this.I0IIOi.X0O()), type, Float.valueOf(duration), str, text, null, to_lang, sTTMessage.getSessionId(), null, sTTMessage.getTts_end(), false, 2625, null);
        if (this.X0O.isEmpty()) {
            z = false;
        } else {
            Integer numOII = ((iOIXXXII0) CollectionsKt___CollectionsKt.Xi1XO00(this.X0O)).OII();
            z = true;
            if (numOII != null && numOII.intValue() == 1) {
                z = false;
            }
        }
        if (z) {
            List<iOIXXXII0> list = this.X0O;
            list.set(CollectionsKt__CollectionsKt.X11iII1O1(list), ioixxxii0);
        } else {
            this.X0O.add(ioixxxii0);
        }
        return TuplesKt.OXO1(ioixxxii0, Boolean.valueOf(z));
    }

    @aa1
    public final k85<Boolean> OiIIX101O() {
        return this.f54876IO;
    }

    @aa1
    public final XiOIO X01IiOiIi(@aa1 TranslateUseCaseMODE mode, boolean z, boolean z2) {
        Intrinsics.X0O(mode, "mode");
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new WebsocketTranslateUseCase$startConversation$1(mode, this, z2, z, null), 2, null);
    }

    @aa1
    public final l94<Pair<iOIXXXII0, Boolean>> X1ii() {
        return this.XOO0ii0;
    }

    public final Object XX0(STTMessage sTTMessage, Continuation<? super Unit> continuation) {
        TranslateEntityRepository translateEntityRepository = this.XO0O10;
        if (translateEntityRepository != null) {
            translateEntityRepository.OIX0iXi(sTTMessage);
        }
        Object objEmit = this.IiI10X.emit(m38792OX(sTTMessage), continuation);
        return objEmit == C2798pb.I0iXXO() ? objEmit : Unit.OXO1;
    }

    public final void XXI() {
        XiOIO xiOIO = this.OIX0iXi;
        if (xiOIO == null || !xiOIO.isActive()) {
            this.OIX0iXi = XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new WebsocketTranslateUseCase$collectData$1(this, null), 2, null);
        }
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
        this.f54877iO.XOO0ii0();
    }

    public final void i010I() {
        this.f54877iO.I0IIOi(new OXO1());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r8.m38765IO(r7, r4, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object iIiiO(AudioEndMessage audioEndMessage, Continuation<? super Unit> continuation) {
        WebsocketTranslateUseCase$handleAudioEnd$1 websocketTranslateUseCase$handleAudioEnd$1;
        String str;
        AudioEndMessage audioEndMessage2;
        String str2;
        if (continuation instanceof WebsocketTranslateUseCase$handleAudioEnd$1) {
            websocketTranslateUseCase$handleAudioEnd$1 = (WebsocketTranslateUseCase$handleAudioEnd$1) continuation;
            int i = websocketTranslateUseCase$handleAudioEnd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                websocketTranslateUseCase$handleAudioEnd$1.label = i - Integer.MIN_VALUE;
            } else {
                websocketTranslateUseCase$handleAudioEnd$1 = new WebsocketTranslateUseCase$handleAudioEnd$1(this, continuation);
            }
        } else {
            websocketTranslateUseCase$handleAudioEnd$1 = new WebsocketTranslateUseCase$handleAudioEnd$1(this, continuation);
        }
        Object objXO0O10 = websocketTranslateUseCase$handleAudioEnd$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = websocketTranslateUseCase$handleAudioEnd$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(objXO0O10);
            if (audioEndMessage.getAudio_end() && this.XO0O10 != null) {
                AudioRepository audioRepository = this.f54877iO;
                websocketTranslateUseCase$handleAudioEnd$1.L$0 = SpillingKt.OXO1(audioEndMessage);
                websocketTranslateUseCase$handleAudioEnd$1.label = 1;
                objXO0O10 = audioRepository.XO0O10(websocketTranslateUseCase$handleAudioEnd$1);
                if (objXO0O10 != objI0iXXO) {
                }
                return objI0iXXO;
            }
            return Unit.OXO1;
        }
        if (i2 == 1) {
            audioEndMessage = (AudioEndMessage) websocketTranslateUseCase$handleAudioEnd$1.L$0;
            ResultKt.X1ii(objXO0O10);
        } else if (i2 == 2) {
            str2 = (String) websocketTranslateUseCase$handleAudioEnd$1.L$1;
            audioEndMessage2 = (AudioEndMessage) websocketTranslateUseCase$handleAudioEnd$1.L$0;
            ResultKt.X1ii(objXO0O10);
            TranslateEntityRepository translateEntityRepository = this.XO0O10;
            iOX1XO iox1xo = this.I0IIOi;
            websocketTranslateUseCase$handleAudioEnd$1.L$0 = SpillingKt.OXO1(audioEndMessage2);
            websocketTranslateUseCase$handleAudioEnd$1.L$1 = str2;
            websocketTranslateUseCase$handleAudioEnd$1.label = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) websocketTranslateUseCase$handleAudioEnd$1.L$1;
            ResultKt.X1ii(objXO0O10);
        }
        str = str2;
        i1O0OXO1O.OXO1.OXO1("CurrentPath:" + str);
        return Unit.OXO1;
        str = (String) objXO0O10;
        if (str != null) {
            ry0<String> ry0Var = this.I0iXXO;
            websocketTranslateUseCase$handleAudioEnd$1.L$0 = SpillingKt.OXO1(audioEndMessage);
            websocketTranslateUseCase$handleAudioEnd$1.L$1 = str;
            websocketTranslateUseCase$handleAudioEnd$1.label = 2;
            if (ry0Var.emit(str, websocketTranslateUseCase$handleAudioEnd$1) != objI0iXXO) {
                audioEndMessage2 = audioEndMessage;
                str2 = str;
                TranslateEntityRepository translateEntityRepository2 = this.XO0O10;
                iOX1XO iox1xo2 = this.I0IIOi;
                websocketTranslateUseCase$handleAudioEnd$1.L$0 = SpillingKt.OXO1(audioEndMessage2);
                websocketTranslateUseCase$handleAudioEnd$1.L$1 = str2;
                websocketTranslateUseCase$handleAudioEnd$1.label = 3;
            }
            return objI0iXXO;
        }
        i1O0OXO1O.OXO1.OXO1("CurrentPath:" + str);
        return Unit.OXO1;
    }

    @tb1
    public final Object iOO1ii1(@aa1 Continuation<? super Unit> continuation) {
        Object objI1XOi1 = this.f54877iO.I1XOi1(continuation);
        return objI1XOi1 == C2798pb.I0iXXO() ? objI1XOi1 : Unit.OXO1;
    }

    public final void iOOX010X() {
        this.f54877iO.IiI10X();
    }

    @aa1
    /* JADX INFO: renamed from: iX */
    public final XiOIO m38793iX(@aa1 TranslateUseCaseMODE mode) {
        Intrinsics.X0O(mode, "mode");
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new WebsocketTranslateUseCase$stopConversation$1(mode, this, null), 2, null);
    }

    public /* synthetic */ WebsocketTranslateUseCase(i00OIXiO i00oixio, TranslateWebSocketRepository translateWebSocketRepository, AudioRepository audioRepository, TranslateEntityRepository translateEntityRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i00oixio, translateWebSocketRepository, audioRepository, (i & 8) != 0 ? null : translateEntityRepository);
    }
}
