package com.sma.smartv3.util.audio_play;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.td;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XIi00iiXO;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.IiI10X;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nExoPlayerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoPlayerManager.kt\ncom/sma/smartv3/util/audio_play/ExoPlayerManager\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,123:1\n310#2,11:124\n*S KotlinDebug\n*F\n+ 1 ExoPlayerManager.kt\ncom/sma/smartv3/util/audio_play/ExoPlayerManager\n*L\n45#1:124,11\n*E\n"})
public final class ExoPlayerManager implements X1XXX0I0 {
    public boolean IiI10X;

    @tb1
    public String O00;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final ExoPlayer XIi00iiXO;

    @tb1
    public XiOIO XO0O10;

    @aa1
    public final O00<String> iO;

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.ExoPlayerManager$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$1", f = "ExoPlayerManager.kt", i = {0, 1, 1, 2, 2}, l = {37, 38, 40}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "audioPath", "$this$launch", "audioPath"}, s = {"L$0", "L$0", "L$2", "L$0", "L$2"}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ExoPlayerManager this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.ExoPlayerManager$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$1$1", f = "ExoPlayerManager.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05801 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $audioPath;
            int label;
            final /* synthetic */ ExoPlayerManager this$0;

            public C05801(ExoPlayerManager r1, String r2, Continuation<? super C05801> r3) {
                this.this$0 = r1;
                this.$audioPath = r2;
                super(2, r3);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
                return new C05801(this.this$0, this.$audioPath, r4);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05801) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
                ExoPlayerManager r5 = this.this$0;
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

        public AnonymousClass1(ExoPlayerManager r1, Continuation<? super AnonymousClass1> r2) {
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

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:13:0x004e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:13:0x004e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r14) {
            i00OIXiO r1 = (i00OIXiO) this.L$0;
            Object r0 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L12;
            if (r2 == 1) goto L11;
            if (r2 == 2) goto L10;
            if (r2 != 3) goto L9;
            String r3 = (String) this.L$2;
            ChannelIterator<String> r4 = (ChannelIterator) this.L$1;
            ResultKt.X1ii(r14);
            ChannelIterator<String> r15 = r4;
        L13:
            this.L$0 = r1;
            this.L$1 = r15;
            this.L$2 = null;
            this.label = 1;
            Object r5 = r15.XIi00iiXO(this);
            if (r5 == r0) goto L28;
            ChannelIterator<String> r6 = r15;
            r14 = r5;
        L18:
            if (((Boolean) r14).booleanValue() == false) goto L30;
            String r7 = r6.next();
            XiOIO r16 = ExoPlayerManager.O00(this.this$0);
            if (r16 == null) goto L24;
            this.L$0 = r1;
            this.L$1 = r6;
            this.L$2 = r7;
            this.label = 2;
            if (td.I0iXXO(r16, this) == r0) goto L28;
        L24:
            String r11 = r7;
            r15 = r6;
            ExoPlayerManager r12 = this.this$0;
            ExoPlayerManager.XOO0ii0(r12, I100X1.O00(r1, null, null, new C05801(r12, r11, null), 3, null));
            XiOIO r8 = ExoPlayerManager.O00(this.this$0);
            if (r8 == null) goto L13;
            this.L$0 = r1;
            this.L$1 = r15;
            this.L$2 = SpillingKt.OXO1(r11);
            this.label = 3;
            if (r8.XXIIO1i11(this) != r0) goto L13;
        L30:
            return Unit.OXO1;
        L28:
            return r0;
        L9:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L10:
            r7 = (String) this.L$2;
            r6 = (ChannelIterator) this.L$1;
            ResultKt.X1ii(r14);
            goto L24
        L11:
            ChannelIterator<String> r9 = (ChannelIterator) this.L$1;
            ResultKt.X1ii(r14);
            r6 = r9;
            goto L18
        L12:
            ResultKt.X1ii(r14);
            r15 = this.this$0.XO0O10().iterator();
            goto L13
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public static final class OXO1 implements Function1<Throwable, Unit> {
        public final /* synthetic */ ExoPlayerManager$playAsync$2$listener$1 I1;
        public final /* synthetic */ ExoPlayerManager IO;

        public OXO1(ExoPlayerManager r1, ExoPlayerManager$playAsync$2$listener$1 r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        public final void OXO1(Throwable r2) {
            this.IO.OIi0().removeListener(this.I1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable r1) {
            OXO1(r1);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.ExoPlayerManager$stop$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$stop$1", f = "ExoPlayerManager.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C35011 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ExoPlayerManager this$0;

        public C35011(ExoPlayerManager r1, Continuation<? super C35011> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C35011(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C35011) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L14:
            if (ExoPlayerManager.IiI10X(this.this$0) == true) goto L17;
            this.this$0.OIi0().stop();
            ExoPlayerManager.I0IIOi(this.this$0, null);
        L17:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            XiOIO r5 = ExoPlayerManager.O00(this.this$0);
            if (r5 == null) goto L14;
            this.label = 1;
            if (td.I0iXXO(r5, this) != r0) goto L14;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public ExoPlayerManager(@aa1 Context r9, @aa1 i00OIXiO r10) {
        Intrinsics.X0O(r9, "context");
        Intrinsics.X0O(r10, "scope");
        this.OXO1 = r10;
        ExoPlayer r11 = new ExoPlayer.Builder(r9).build();
        Intrinsics.O10IXXX0X(r11, "build(...)");
        this.XIi00iiXO = r11;
        this.iO = IiI10X.XO0O10(Integer.MAX_VALUE, null, null, 6, null);
        I100X1.O00(r10, null, null, new AnonymousClass1(this, null), 3, null);
    }

    public static final /* synthetic */ void I0IIOi(ExoPlayerManager r0, String r1) {
        r0.O00 = r1;
    }

    public static final /* synthetic */ boolean IiI10X(ExoPlayerManager r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ XiOIO O00(ExoPlayerManager r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ void XOO0ii0(ExoPlayerManager r0, XiOIO r1) {
        r0.XO0O10 = r1;
    }

    public final void I0iXXO() {
    }

    public final void IO() {
        if (this.IiI10X == true) goto L6;
        this.IiI10X = true;
        release();
        return;
    }

    public final void OIX0iXi() {
    }

    @aa1
    public final ExoPlayer OIi0() {
        return this.XIi00iiXO;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void OXO1(@aa1 String r8) {
        Intrinsics.X0O(r8, "path");
        I100X1.O00(this.OXO1, null, null, new ExoPlayerManager$forcePlay$1(this, r8, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.media3.common.Player$Listener, com.sma.smartv3.util.audio_play.ExoPlayerManager$playAsync$2$listener$1] */
    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @tb1
    public Object XIi00iiXO(@aa1 String r8, @aa1 Continuation<? super Unit> r9) {
        final XIi00iiXO r0 = new XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(r9), 1);
        r0.XXX11i();
        File r1 = new File(r8);
        if (r1.exists() == true) goto L5;
        Result.Companion r10 = Result.Companion;
        r0.resumeWith(Result.m6974constructorimpl(Unit.OXO1));
    L6:
        Object r11 = r0.OII();
        if (r11 != pb.I0iXXO()) goto L10;
        DebugProbesKt.iO(r9);
    L10:
        if (r11 != pb.I0iXXO()) goto L13;
        return r11;
    L13:
        return Unit.OXO1;
    L5:
        i1O0OXO1O.OXO1.OXO1("PlayAsync:fileLength:" + r1.length() + " path:" + r8);
        I0IIOi(this, r8);
        OIi0().stop();
        MediaItem r12 = MediaItem.fromUri(Uri.fromFile(r1));
        Intrinsics.O10IXXX0X(r12, "fromUri(...)");
        OIi0().setMediaItem(r12);
        OIi0().prepare();
        OIi0().play();
        ?? r13 = new ExoPlayerManager$playAsync$2$listener$1(this, r0);
        OIi0().addListener(r13);
        r0.iX(new OXO1(this, r13));
        goto L6
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
        I100X1.O00(this.OXO1, null, null, new ExoPlayerManager$enqueue$1(this, r8, null), 3, null);
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void stop() {
        I100X1.O00(this.OXO1, null, null, new C35011(this, null), 3, null);
    }

    public /* synthetic */ ExoPlayerManager(Context r1, i00OIXiO r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = I0IIOi.OXO1(IXOX0Xiii.O00());
    L5:
        this(r1, r2);
    }
}
