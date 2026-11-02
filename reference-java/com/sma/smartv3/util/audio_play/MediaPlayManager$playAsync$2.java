package com.sma.smartv3.util.audio_play;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import java.io.IOException;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2", m39466f = "MediaPlayManager.kt", m39467i = {0}, m39468l = {147}, m39469m = "invokeSuspend", m39470n = {"$i$f$suspendCancellableCoroutine"}, m39472s = {"I$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nMediaPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,146:1\n310#2,11:147\n*S KotlinDebug\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n*L\n71#1:147,11\n*E\n"})
public final class MediaPlayManager$playAsync$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MediaPlayManager this$0;

    public static final class OXO1 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ MediaPlayer f54928IO;

        public OXO1(MediaPlayer mediaPlayer) {
            this.f54928IO = mediaPlayer;
        }

        public final void OXO1(Throwable th) {
            try {
                this.f54928IO.stop();
                this.f54928IO.release();
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
            OXO1(th);
            return Unit.OXO1;
        }
    }

    public static final class XIi00iiXO implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ MediaPlayer f54929IO;

        public XIi00iiXO(MediaPlayer mediaPlayer) {
            this.f54929IO = mediaPlayer;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f54929IO.start();
        }
    }

    public static final class XO0O10 implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ IO0i<Unit> f54930IO;

        /* JADX WARN: Multi-variable type inference failed */
        public XO0O10(IO0i<? super Unit> iO0i) {
            this.f54930IO = iO0i;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (!this.f54930IO.isActive()) {
                return true;
            }
            IO0i<Unit> iO0i = this.f54930IO;
            Result.Companion companion = Result.Companion;
            iO0i.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2$iO */
    public static final class C19061iO implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ IO0i<Unit> f54931IO;

        /* JADX WARN: Multi-variable type inference failed */
        public C19061iO(IO0i<? super Unit> iO0i) {
            this.f54931IO = iO0i;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (this.f54931IO.isActive()) {
                IO0i<Unit> iO0i = this.f54931IO;
                Result.Companion companion = Result.Companion;
                iO0i.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayManager$playAsync$2(MediaPlayManager mediaPlayManager, String str, Continuation<? super MediaPlayManager$playAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaPlayManager;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPlayManager$playAsync$2(this.this$0, this.$path, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((MediaPlayManager$playAsync$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.this$0.O00 = this.$path;
            MediaPlayer mediaPlayer = this.this$0.XO0O10;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.this$0.XO0O10 = null;
            MediaPlayManager mediaPlayManager = this.this$0;
            String str = this.$path;
            this.L$0 = mediaPlayManager;
            this.L$1 = str;
            this.I$0 = 0;
            this.label = 1;
            kotlinx.coroutines.XIi00iiXO xIi00iiXO = new kotlinx.coroutines.XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(this), 1);
            xIi00iiXO.XXX11i();
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build());
            mediaPlayer2.setDataSource(str);
            mediaPlayer2.setOnPreparedListener(new XIi00iiXO(mediaPlayer2));
            mediaPlayer2.setOnCompletionListener(new C19061iO(xIi00iiXO));
            mediaPlayer2.setOnErrorListener(new XO0O10(xIi00iiXO));
            mediaPlayer2.prepareAsync();
            mediaPlayManager.XO0O10 = mediaPlayer2;
            XX01Oi.IiI10X(mediaPlayManager.OXO1, null, null, new MediaPlayManager$playAsync$2$1$1(xIi00iiXO, mediaPlayManager, str, null), 3, null);
            xIi00iiXO.mo634iX(new OXO1(mediaPlayer2));
            Object objOII = xIi00iiXO.OII();
            if (objOII == C2798pb.I0iXXO()) {
                DebugProbesKt.m39475iO(this);
            }
            if (objOII == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.this$0.O00 = null;
        return Unit.OXO1;
    }
}
