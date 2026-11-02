package com.sma.smartv3.util.audio_play;

import android.media.MediaPlayer;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.channels.ChannelIterator;
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

    @aa1
    public final O00<String> iO;

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.MediaPlayManager$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.util.audio_play.MediaPlayManager$1", f = "MediaPlayManager.kt", i = {1}, l = {30, 34}, m = "invokeSuspend", n = {"audioPath"}, s = {"L$1"}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MediaPlayManager this$0;

        public AnonymousClass1(MediaPlayManager r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:27:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:27:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:27:0x009b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L14;
            if (r1 == 1) goto L13;
            if (r1 != 2) goto L12;
            String r2 = (String) this.L$1;
            ChannelIterator<String> r3 = (ChannelIterator) this.L$0;
            ResultKt.X1ii(r9);     // Catch: Exception -> L9
        L27:
            ChannelIterator<String> r10 = r3;
        L15:
            this.L$0 = r10;
            this.L$1 = null;
            this.label = 1;
            Object r4 = r10.XIi00iiXO(this);
            if (r4 == r0) goto L25;
            r3 = r10;
            r9 = r4;
        L20:
            if (((Boolean) r9).booleanValue() == false) goto L29;
            String r11 = r3.next();
            if (MediaPlayManager.IiI10X(this.this$0).get() == false) goto L27;
            MediaPlayManager r5 = this.this$0;     // Catch: Exception -> L9
            this.L$0 = r3;     // Catch: Exception -> L9
            this.L$1 = SpillingKt.OXO1(r11);     // Catch: Exception -> L9
            this.label = 2;     // Catch: Exception -> L9
            if (r5.XIi00iiXO(r11, this) != r0) goto L27;
        L29:
            return Unit.OXO1;
        L25:
            return r0;
        L9:
            e = move-exception;
            i1O0OXO1O.OXO1.XIi00iiXO(MediaPlayManager.OIi0(this.this$0) + " 播放异常: " + e.getMessage());
            goto L27
        L12:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L13:
            r3 = (ChannelIterator) this.L$0;
            ResultKt.X1ii(r9);
            goto L20
        L14:
            ResultKt.X1ii(r9);
            r10 = this.this$0.XO0O10().iterator();
            goto L15
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaPlayManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ i00OIXiO I0IIOi(MediaPlayManager r0) {
        return r0.OXO1;
    }

    public static final /* synthetic */ void I0iXXO(MediaPlayManager r0) {
        r0.I1XOi1();
    }

    public static final /* synthetic */ void IO(MediaPlayManager r0, String r1) {
        r0.O00 = r1;
    }

    public static final /* synthetic */ AtomicBoolean IiI10X(MediaPlayManager r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ void O00(MediaPlayManager r0) {
        r0.XXI();
    }

    public static final /* synthetic */ void OIX0iXi(MediaPlayManager r0, MediaPlayer r1) {
        r0.XO0O10 = r1;
    }

    public static final /* synthetic */ String OIi0(MediaPlayManager r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ MediaPlayer XOO0ii0(MediaPlayManager r0) {
        return r0.XO0O10;
    }

    public final void I1XOi1() {
        MediaPlayer r0 = this.XO0O10;     // Catch: Exception -> L10
        if (r0 == null) goto L5;
        r0.stop();     // Catch: Exception -> L10
    L5:
        MediaPlayer r1 = this.XO0O10;
        if (r1 == null) goto L8;
        r1.release();
    L8:
        this.XO0O10 = null;
    }

    @tb1
    public final Unit O10IXXX0X() {
        MediaPlayer r0 = this.XO0O10;
        if (r0 == null) goto L6;
        r0.setVolume(1.0f, 0.0f);
        return Unit.OXO1;
    L6:
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void OXO1(@aa1 String r8) {
        Intrinsics.X0O(r8, "path");
        I100X1.O00(this.OXO1, null, null, new MediaPlayManager$forcePlay$1(this, r8, null), 3, null);
    }

    @tb1
    public final Unit X0O() {
        MediaPlayer r0 = this.XO0O10;
        if (r0 == null) goto L6;
        r0.setVolume(0.0f, 1.0f);
        return Unit.OXO1;
    L6:
        return null;
    }

    public final void X1ii() {
        this.XIi00iiXO.set(true);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @tb1
    public Object XIi00iiXO(@aa1 String r4, @aa1 Continuation<? super Unit> r5) {
        Object r6 = I100X1.I0IIOi(IXOX0Xiii.O00(), new MediaPlayManager$playAsync$2(this, r4, null), r5);
        if (r6 != pb.I0iXXO()) goto L6;
        return r6;
    L6:
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @aa1
    public O00<String> XO0O10() {
        return this.iO;
    }

    public final void XXI() {
    L3:
        if (XO0O10().isEmpty() == true) goto L5;
        XOO0ii0.I0IIOi(XO0O10().XiOIO());
        goto L3
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void iO(@tb1 String r8) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (r8.length() == 0) goto L9;
        I100X1.O00(this.OXO1, null, null, new MediaPlayManager$enqueue$1(this, r8, null), 3, null);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void stop() {
        this.XIi00iiXO.set(false);
        I1XOi1();
        XXI();
    }

    public MediaPlayManager(@aa1 i00OIXiO r10) {
        Intrinsics.X0O(r10, "scope");
        this.OXO1 = r10;
        this.XIi00iiXO = new AtomicBoolean(true);
        this.iO = IiI10X.XO0O10(Integer.MAX_VALUE, null, null, 6, null);
        this.IiI10X = "MediaPlayManager";
        I100X1.O00(r10, null, null, new AnonymousClass1(this, null), 3, null);
    }

    public /* synthetic */ MediaPlayManager(i00OIXiO r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = I0IIOi.OXO1(IXOX0Xiii.O00());
    L5:
        this(r1);
    }
}
