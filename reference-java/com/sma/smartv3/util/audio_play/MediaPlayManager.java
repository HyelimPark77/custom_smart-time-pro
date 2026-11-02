package com.sma.smartv3.util.audio_play;

import android.media.MediaPlayer;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.channels.IiI10X;
import kotlinx.coroutines.channels.O00;
import kotlinx.coroutines.channels.XOO0ii0;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaPlayManager implements X1XXX0I0 {

    @aa1
    public final String IiI10X;

    @tb1
    public String O00;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public AtomicBoolean XIi00iiXO;

    @tb1
    public MediaPlayer XO0O10;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final O00<String> f54927iO;

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.MediaPlayManager$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.MediaPlayManager$1", m39466f = "MediaPlayManager.kt", m39467i = {1}, m39468l = {30, 34}, m39469m = "invokeSuspend", m39470n = {"audioPath"}, m39472s = {"L$1"}, m39473v = 1)
    public static final class C190601 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C190601(Continuation<? super C190601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MediaPlayManager.this.new C190601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190601) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0048  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code duplicated, block: B:23:0x0065 A[Catch: Exception -> 0x001b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:7:0x0016, B:23:0x0065), top: B:30:0x0016 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:27:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:27:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:27:0x009b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.L$1
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.X1ii(r9)     // Catch: java.lang.Exception -> L1b
                goto L9b
            L1b:
                r9 = move-exception
                goto L78
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.X1ii(r9)
                goto L4b
            L2d:
                kotlin.ResultKt.X1ii(r9)
                com.sma.smartv3.util.audio_play.MediaPlayManager r9 = com.sma.smartv3.util.audio_play.MediaPlayManager.this
                kotlinx.coroutines.channels.O00 r9 = r9.XO0O10()
                kotlinx.coroutines.channels.ChannelIterator r9 = r9.iterator()
            L3a:
                r8.L$0 = r9
                r1 = 0
                r8.L$1 = r1
                r8.label = r3
                java.lang.Object r1 = r9.XIi00iiXO(r8)
                if (r1 != r0) goto L48
                goto L77
            L48:
                r7 = r1
                r1 = r9
                r9 = r7
            L4b:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9d
                java.lang.Object r9 = r1.next()
                java.lang.String r9 = (java.lang.String) r9
                com.sma.smartv3.util.audio_play.MediaPlayManager r4 = com.sma.smartv3.util.audio_play.MediaPlayManager.this
                java.util.concurrent.atomic.AtomicBoolean r4 = com.sma.smartv3.util.audio_play.MediaPlayManager.IiI10X(r4)
                boolean r4 = r4.get()
                if (r4 == 0) goto L9b
                com.sma.smartv3.util.audio_play.MediaPlayManager r4 = com.sma.smartv3.util.audio_play.MediaPlayManager.this     // Catch: java.lang.Exception -> L1b
                r8.L$0 = r1     // Catch: java.lang.Exception -> L1b
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.OXO1(r9)     // Catch: java.lang.Exception -> L1b
                r8.L$1 = r5     // Catch: java.lang.Exception -> L1b
                r8.label = r2     // Catch: java.lang.Exception -> L1b
                java.lang.Object r9 = r4.XIi00iiXO(r9, r8)     // Catch: java.lang.Exception -> L1b
                if (r9 != r0) goto L9b
            L77:
                return r0
            L78:
                com.android.mltcode.paycertificationapi.i1O0OXO1O r4 = com.android.mltcode.paycertificationapi.i1O0OXO1O.OXO1
                com.sma.smartv3.util.audio_play.MediaPlayManager r5 = com.sma.smartv3.util.audio_play.MediaPlayManager.this
                java.lang.String r5 = com.sma.smartv3.util.audio_play.MediaPlayManager.OIi0(r5)
                java.lang.String r9 = r9.getMessage()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                java.lang.String r5 = " 播放异常: "
                r6.append(r5)
                r6.append(r9)
                java.lang.String r9 = r6.toString()
                r4.XIi00iiXO(r9)
            L9b:
                r9 = r1
                goto L3a
            L9d:
                kotlin.Unit r9 = kotlin.Unit.OXO1
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.util.audio_play.MediaPlayManager.C190601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaPlayManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void I1XOi1() {
        try {
            MediaPlayer mediaPlayer = this.XO0O10;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
        } catch (Exception unused) {
        }
        MediaPlayer mediaPlayer2 = this.XO0O10;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.XO0O10 = null;
    }

    @tb1
    public final Unit O10IXXX0X() {
        MediaPlayer mediaPlayer = this.XO0O10;
        if (mediaPlayer == null) {
            return null;
        }
        mediaPlayer.setVolume(1.0f, 0.0f);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void OXO1(@aa1 String path) {
        Intrinsics.X0O(path, "path");
        XX01Oi.IiI10X(this.OXO1, null, null, new MediaPlayManager$forcePlay$1(this, path, null), 3, null);
    }

    @tb1
    public final Unit X0O() {
        MediaPlayer mediaPlayer = this.XO0O10;
        if (mediaPlayer == null) {
            return null;
        }
        mediaPlayer.setVolume(0.0f, 1.0f);
        return Unit.OXO1;
    }

    public final void X1ii() {
        this.XIi00iiXO.set(true);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @tb1
    public Object XIi00iiXO(@aa1 String str, @aa1 Continuation<? super Unit> continuation) throws Throwable {
        Object objI0IIOi = I100X1.I0IIOi(IXOX0Xiii.O00(), new MediaPlayManager$playAsync$2(this, str, null), continuation);
        return objI0IIOi == C2798pb.I0iXXO() ? objI0IIOi : Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @aa1
    public O00<String> XO0O10() {
        return this.f54927iO;
    }

    public final void XXI() {
        while (!XO0O10().isEmpty()) {
            XOO0ii0.I0IIOi(XO0O10().XiOIO());
        }
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    /* JADX INFO: renamed from: iO */
    public void mo1187iO(@tb1 String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        XX01Oi.IiI10X(this.OXO1, null, null, new MediaPlayManager$enqueue$1(this, str, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void stop() {
        this.XIi00iiXO.set(false);
        I1XOi1();
        XXI();
    }

    public MediaPlayManager(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        this.OXO1 = scope;
        this.XIi00iiXO = new AtomicBoolean(true);
        this.f54927iO = IiI10X.XO0O10(Integer.MAX_VALUE, null, null, 6, null);
        this.IiI10X = "MediaPlayManager";
        XX01Oi.IiI10X(scope, null, null, new C190601(null), 3, null);
    }

    public /* synthetic */ MediaPlayManager(i00OIXiO i00oixio, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? I0IIOi.OXO1(IXOX0Xiii.O00()) : i00oixio);
    }
}
