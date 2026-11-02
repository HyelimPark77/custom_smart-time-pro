package com.sma.smartv3.util.audio_play;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2", f = "MediaPlayManager.kt", i = {0}, l = {147}, m = "invokeSuspend", n = {"$i$f$suspendCancellableCoroutine"}, s = {"I$0"}, v = 1)
@SourceDebugExtension({"SMAP\nMediaPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,146:1\n310#2,11:147\n*S KotlinDebug\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n*L\n71#1:147,11\n*E\n"})
public final class MediaPlayManager$playAsync$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaPlayManager this$0;

    public static final class OXO1 implements Function1<Throwable, Unit> {
        public final /* synthetic */ MediaPlayer IO;

        public OXO1(MediaPlayer r1) {
            this.IO = r1;
        }

        public final void OXO1(Throwable r1) {
            this.IO.stop();     // Catch: Exception -> L4
            this.IO.release();     // Catch: Exception -> L4
            return;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable r1) {
            OXO1(r1);
            return Unit.OXO1;
        }
    }

    public static final class XIi00iiXO implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ MediaPlayer IO;

        public XIi00iiXO(MediaPlayer r1) {
            this.IO = r1;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer r1) {
            this.IO.start();
        }
    }

    public static final class XO0O10 implements MediaPlayer.OnErrorListener {
        public final /* synthetic */ IO0i<Unit> IO;

        /* JADX WARN: Multi-variable type inference failed */
        public XO0O10(IO0i<? super Unit> r1) {
            this.IO = r1;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer r1, int r2, int r3) {
            if (isActive() == false) goto L7;
            IO0i<Unit> r4 = this.IO;
            Result.Companion r5 = Result.Companion;
            r4.resumeWith(Result.m6974constructorimpl(Unit.OXO1));
            return true;
        L7:
            return true;
        }
    }

    public static final class iO implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ IO0i<Unit> IO;

        /* JADX WARN: Multi-variable type inference failed */
        public iO(IO0i<? super Unit> r1) {
            this.IO = r1;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer r2) {
            if (isActive() == false) goto L6;
            IO0i<Unit> r3 = this.IO;
            Result.Companion r0 = Result.Companion;
            r3.resumeWith(Result.m6974constructorimpl(Unit.OXO1));
            return;
        }
    }

    public MediaPlayManager$playAsync$2(MediaPlayManager r1, String r2, Continuation<? super MediaPlayManager$playAsync$2> r3) {
        this.this$0 = r1;
        this.$path = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new MediaPlayManager$playAsync$2(this.this$0, this.$path, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((MediaPlayManager$playAsync$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r13) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        String r2 = (String) this.L$1;
        MediaPlayManager r3 = (MediaPlayManager) this.L$0;
        ResultKt.X1ii(r13);
    L16:
        MediaPlayManager.IO(this.this$0, null);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r13);
        MediaPlayManager.IO(this.this$0, this.$path);
        MediaPlayer r14 = MediaPlayManager.XOO0ii0(this.this$0);
        if (r14 == null) goto L11;
        r14.release();
    L11:
        MediaPlayManager.OIX0iXi(this.this$0, null);
        MediaPlayManager r15 = this.this$0;
        String r4 = this.$path;
        this.L$0 = r15;
        this.L$1 = r4;
        this.I$0 = 0;
        this.label = 1;
        kotlinx.coroutines.XIi00iiXO r5 = new kotlinx.coroutines.XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(this), 1);
        r5.XXX11i();
        MediaPlayer r6 = new MediaPlayer();
        r6.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build());
        r6.setDataSource(r4);
        r6.setOnPreparedListener(new XIi00iiXO(r6));
        r6.setOnCompletionListener(new iO(r5));
        r6.setOnErrorListener(new XO0O10(r5));
        r6.prepareAsync();
        MediaPlayManager.OIX0iXi(r15, r6);
        I100X1.O00(MediaPlayManager.I0IIOi(r15), null, null, new MediaPlayManager$playAsync$2$1$1(r5, r15, r4, null), 3, null);
        r5.iX(new OXO1(r6));
        Object r16 = r5.OII();
        if (r16 != pb.I0iXXO()) goto L14;
        DebugProbesKt.iO(this);
    L14:
        if (r16 != r0) goto L16;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
