package com.sma.smartv3.util.audio_play;

import android.media.AudioTrack;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.td;
import java.io.File;
import java.io.FileInputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XX0;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.IiI10X;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAudioTrackPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioTrackPlayManager.kt\ncom/sma/smartv3/util/audio_play/AudioTrackPlayManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
public final class AudioTrackPlayManager implements X1XXX0I0 {

    @aa1
    public AudioTrack IiI10X;

    @tb1
    public String O00;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final String XIi00iiXO;

    @tb1
    public XiOIO XO0O10;
    public long XOO0ii0;

    @aa1
    public final O00<String> iO;

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1", f = "AudioTrackPlayManager.kt", i = {0, 1, 1}, l = {44, 45}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "audioPath"}, s = {"L$0", "L$0", "L$2"}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AudioTrackPlayManager this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1$1", f = "AudioTrackPlayManager.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05791 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $audioPath;
            int label;
            final /* synthetic */ AudioTrackPlayManager this$0;

            public C05791(AudioTrackPlayManager r1, String r2, Continuation<? super C05791> r3) {
                this.this$0 = r1;
                this.$audioPath = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                return new C05791(this.this$0, this.$audioPath, r4);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05791) create(r1, r2)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object r4) {
                Object r0 = pb.I0iXXO();
                int r1 = this.label;
                if (r1 == 0) goto L8;
                if (r1 != 1) goto L7;
                ResultKt.X1ii(r4);
            L12:
                return Unit.OXO1;
            L7:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L8:
                ResultKt.X1ii(r4);
                this.this$0.IO(this.$audioPath);
                AudioTrackPlayManager r5 = this.this$0;
                String r2 = this.$audioPath;
                this.label = 1;
                if (r5.XIi00iiXO(r2, this) != r0) goto L12;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
                return invoke2(r1, r2);
            }
        }

        public AnonymousClass1(AudioTrackPlayManager r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:22:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:22:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r12) {
            i00OIXiO r1 = (i00OIXiO) this.L$0;
            Object r0 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L10;
            if (r2 == 1) goto L9;
            if (r2 != 2) goto L8;
            String r3 = (String) this.L$2;
            ChannelIterator<String> r4 = (ChannelIterator) this.L$1;
            ResultKt.X1ii(r12);
        L22:
            ChannelIterator<String> r13 = r4;
            AudioTrackPlayManager.O00(this.this$0).pause();
            AudioTrackPlayManager.O00(this.this$0).flush();
            String r5 = r3;
            AudioTrackPlayManager.I0IIOi(this.this$0, I100X1.O00(r1, IXOX0Xiii.iO(), null, new C05791(this.this$0, r5, null), 2, null));
        L11:
            this.L$0 = r1;
            this.L$1 = r13;
            this.L$2 = null;
            this.label = 1;
            Object r6 = r13.XIi00iiXO(this);
            if (r6 == r0) goto L21;
            r4 = r13;
            r12 = r6;
        L16:
            if (((Boolean) r12).booleanValue() == false) goto L24;
            r3 = r4.next();
            XiOIO r14 = AudioTrackPlayManager.IiI10X(this.this$0);
            if (r14 == null) goto L22;
            this.L$0 = r1;
            this.L$1 = r4;
            this.L$2 = r3;
            this.label = 2;
            if (td.I0iXXO(r14, this) != r0) goto L22;
        L24:
            return Unit.OXO1;
        L21:
            return r0;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            ChannelIterator<String> r7 = (ChannelIterator) this.L$1;
            ResultKt.X1ii(r12);
            r4 = r7;
            goto L16
        L10:
            ResultKt.X1ii(r12);
            r13 = this.this$0.XO0O10().iterator();
            goto L11
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.AudioTrackPlayManager$stop$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$stop$1", f = "AudioTrackPlayManager.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C35001 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AudioTrackPlayManager this$0;

        public C35001(AudioTrackPlayManager r1, Continuation<? super C35001> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C35001(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C35001) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L13:
            AudioTrackPlayManager.O00(this.this$0).stop();
            AudioTrackPlayManager.OIi0(this.this$0, null);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            XiOIO r5 = AudioTrackPlayManager.IiI10X(this.this$0);
            if (r5 == null) goto L13;
            this.label = 1;
            if (td.I0iXXO(r5, this) != r0) goto L13;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioTrackPlayManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ void I0IIOi(AudioTrackPlayManager r0, XiOIO r1) {
        r0.XO0O10 = r1;
    }

    public static final /* synthetic */ XiOIO IiI10X(AudioTrackPlayManager r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ AudioTrack O00(AudioTrackPlayManager r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ void OIi0(AudioTrackPlayManager r0, String r1) {
        r0.O00 = r1;
    }

    public static final /* synthetic */ String XOO0ii0(AudioTrackPlayManager r0) {
        return r0.XIi00iiXO;
    }

    public final void I0iXXO(float r2) {
        this.IiI10X.setVolume(r2);
    }

    public final void IO(@aa1 String r6) {
        Intrinsics.X0O(r6, "path");
        if (this.IiI10X.getChannelConfiguration() != 12) goto L5;
        int r0 = 4;
    L6:
        this.XOO0ii0 = new File(r6).length() / ((long) r0);
        return;
    L5:
        r0 = 2;
        goto L6
    }

    public final void OIX0iXi() {
        this.IiI10X.release();
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void OXO1(@aa1 String r8) {
        Intrinsics.X0O(r8, "path");
        I100X1.O00(this.OXO1, null, null, new AudioTrackPlayManager$forcePlay$1(this, r8, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @tb1
    public Object XIi00iiXO(@aa1 String r5, @aa1 Continuation<? super Unit> r6) {
        File r7 = new File(r5);
        if (r7.exists() == false) goto L5;
        this.O00 = r5;
        I0iXXO(1.0f);     // Catch: Throwable -> L20 Exception -> L22
        this.IiI10X.play();     // Catch: Throwable -> L20 Exception -> L22
        FileInputStream r8 = new FileInputStream(r7);     // Catch: Throwable -> L20 Exception -> L22
        byte[] r9 = new byte[2048];     // Catch: Throwable -> L15
    L10:
        int r1 = r8.read(r9);     // Catch: Throwable -> L15
        if (r1 == (-1)) goto L17;
        if (XX0.IO.isActive() == false) goto L17;
        this.IiI10X.write(r9, 0, r1);     // Catch: Throwable -> L15
    L17:
        Unit r10 = Unit.OXO1;     // Catch: Throwable -> L15
        CloseableKt.OXO1(r8, null);     // Catch: Throwable -> L20 Exception -> L22
        this.IiI10X.stop();     // Catch: Throwable -> L20 Exception -> L22
    L19:
        this.O00 = null;
        return Unit.OXO1;
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        CloseableKt.OXO1(r8, th);     // Catch: Throwable -> L20 Exception -> L22
        throw th;     // Catch: Throwable -> L20 Exception -> L22
    L22:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        this.O00 = null;
        throw th;
    L5:
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @aa1
    public O00<String> XO0O10() {
        return this.iO;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void iO(@tb1 String r8) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (r8.length() == 0) goto L9;
        I100X1.O00(this.OXO1, null, null, new AudioTrackPlayManager$enqueue$1(this, r8, null), 3, null);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void stop() {
        I100X1.O00(this.OXO1, null, null, new C35001(this, null), 3, null);
    }

    public AudioTrackPlayManager(@aa1 i00OIXiO r11) {
        Intrinsics.X0O(r11, "scope");
        this.OXO1 = r11;
        this.XIi00iiXO = "AudioTrackPlayManager";
        this.iO = IiI10X.XO0O10(Integer.MAX_VALUE, null, null, 6, null);
        this.IiI10X = new AudioTrack(3, 16000, 4, 2, AudioTrack.getMinBufferSize(16000, 4, 2), 1);
        I100X1.O00(r11, null, null, new AnonymousClass1(this, null), 3, null);
    }

    public /* synthetic */ AudioTrackPlayManager(i00OIXiO r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = I0IIOi.OXO1(IXOX0Xiii.O00());
    L5:
        this(r1);
    }
}
