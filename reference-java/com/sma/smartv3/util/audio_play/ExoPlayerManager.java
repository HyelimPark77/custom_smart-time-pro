package com.sma.smartv3.util.audio_play;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.IO0i;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.File;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XIi00iiXO;
import kotlinx.coroutines.XiOIO;
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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final O00<String> f54924iO;

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.ExoPlayerManager$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$1", m39466f = "ExoPlayerManager.kt", m39467i = {0, 1, 1, 2, 2}, m39468l = {37, 38, 40}, m39469m = "invokeSuspend", m39470n = {"$this$launch", "$this$launch", "audioPath", "$this$launch", "audioPath"}, m39472s = {"L$0", "L$0", "L$2", "L$0", "L$2"}, m39473v = 1)
    public static final class C190591 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.ExoPlayerManager$1$1 */
        @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$1$1", m39466f = "ExoPlayerManager.kt", m39467i = {}, m39468l = {39}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $audioPath;
            int label;
            final /* synthetic */ ExoPlayerManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExoPlayerManager exoPlayerManager, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = exoPlayerManager;
                this.$audioPath = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$audioPath, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objI0iXXO = C2798pb.I0iXXO();
                int i = this.label;
                if (i == 0) {
                    ResultKt.X1ii(obj);
                    ExoPlayerManager exoPlayerManager = this.this$0;
                    String str = this.$audioPath;
                    this.label = 1;
                    if (exoPlayerManager.XIi00iiXO(str, this) == objI0iXXO) {
                        return objI0iXXO;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                }
                return Unit.OXO1;
            }
        }

        public C190591(Continuation<? super C190591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190591 c190591 = ExoPlayerManager.this.new C190591(continuation);
            c190591.L$0 = obj;
            return c190591;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190591) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004e A[PHI: r14
  0x004e: PHI (r14v13 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>) = 
  (r14v3 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
  (r14v4 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
  (r14v4 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
  (r14v16 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
 binds: [B:12:0x0041, B:25:0x009f, B:27:0x00b1, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x005d  */
        /* JADX WARN: Code duplicated, block: B:19:0x0067  */
        /* JADX WARN: Code duplicated, block: B:21:0x0076  */
        /* JADX WARN: Code duplicated, block: B:24:0x0085 A[PHI: r2 r3
  0x0085: PHI (r2v1 java.lang.String) = (r2v8 java.lang.String), (r2v8 java.lang.String), (r2v13 java.lang.String) binds: [B:20:0x0074, B:22:0x0082, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r3v0 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>) = 
  (r3v3 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
  (r3v3 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
  (r3v7 kotlinx.coroutines.channels.ChannelIterator<java.lang.String>)
 binds: [B:20:0x0074, B:22:0x0082, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:13:0x004e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:13:0x004e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.L$0
                r1 = r0
                com.android.mltcode.paycertificationapi.i00OIXiO r1 = (com.android.mltcode.paycertificationapi.i00OIXiO) r1
                java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
                int r2 = r13.label
                r7 = 0
                r8 = 3
                r9 = 2
                r10 = 1
                if (r2 == 0) goto L41
                if (r2 == r10) goto L38
                if (r2 == r9) goto L2c
                if (r2 != r8) goto L24
                java.lang.Object r2 = r13.L$2
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r13.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                kotlin.ResultKt.X1ii(r14)
                r14 = r2
                goto L4e
            L24:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2c:
                java.lang.Object r2 = r13.L$2
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r13.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                kotlin.ResultKt.X1ii(r14)
                goto L85
            L38:
                java.lang.Object r2 = r13.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                kotlin.ResultKt.X1ii(r14)
                r3 = r2
                goto L5f
            L41:
                kotlin.ResultKt.X1ii(r14)
                com.sma.smartv3.util.audio_play.ExoPlayerManager r14 = com.sma.smartv3.util.audio_play.ExoPlayerManager.this
                kotlinx.coroutines.channels.O00 r14 = r14.XO0O10()
                kotlinx.coroutines.channels.ChannelIterator r14 = r14.iterator()
            L4e:
                r13.L$0 = r1
                r13.L$1 = r14
                r13.L$2 = r7
                r13.label = r10
                java.lang.Object r2 = r14.XIi00iiXO(r13)
                if (r2 != r0) goto L5d
                goto Lb3
            L5d:
                r3 = r14
                r14 = r2
            L5f:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto Lb4
                java.lang.Object r14 = r3.next()
                r2 = r14
                java.lang.String r2 = (java.lang.String) r2
                com.sma.smartv3.util.audio_play.ExoPlayerManager r14 = com.sma.smartv3.util.audio_play.ExoPlayerManager.this
                kotlinx.coroutines.XiOIO r14 = com.sma.smartv3.util.audio_play.ExoPlayerManager.O00(r14)
                if (r14 == 0) goto L85
                r13.L$0 = r1
                r13.L$1 = r3
                r13.L$2 = r2
                r13.label = r9
                java.lang.Object r14 = com.android.mltcode.paycertificationapi.C2954td.I0iXXO(r14, r13)
                if (r14 != r0) goto L85
                goto Lb3
            L85:
                r11 = r2
                r14 = r3
                com.sma.smartv3.util.audio_play.ExoPlayerManager r12 = com.sma.smartv3.util.audio_play.ExoPlayerManager.this
                com.sma.smartv3.util.audio_play.ExoPlayerManager$1$1 r4 = new com.sma.smartv3.util.audio_play.ExoPlayerManager$1$1
                r4.<init>(r12, r11, r7)
                r5 = 3
                r6 = 0
                r2 = 0
                r3 = 0
                kotlinx.coroutines.XiOIO r2 = com.android.mltcode.paycertificationapi.I100X1.O00(r1, r2, r3, r4, r5, r6)
                com.sma.smartv3.util.audio_play.ExoPlayerManager.XOO0ii0(r12, r2)
                com.sma.smartv3.util.audio_play.ExoPlayerManager r2 = com.sma.smartv3.util.audio_play.ExoPlayerManager.this
                kotlinx.coroutines.XiOIO r2 = com.sma.smartv3.util.audio_play.ExoPlayerManager.O00(r2)
                if (r2 == 0) goto L4e
                r13.L$0 = r1
                r13.L$1 = r14
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.OXO1(r11)
                r13.L$2 = r3
                r13.label = r8
                java.lang.Object r2 = r2.XXIIO1i11(r13)
                if (r2 != r0) goto L4e
            Lb3:
                return r0
            Lb4:
                kotlin.Unit r14 = kotlin.Unit.OXO1
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.util.audio_play.ExoPlayerManager.C190591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class OXO1 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ ExoPlayerManager$playAsync$2$listener$1 f54925I1;

        public OXO1(ExoPlayerManager$playAsync$2$listener$1 exoPlayerManager$playAsync$2$listener$1) {
            this.f54925I1 = exoPlayerManager$playAsync$2$listener$1;
        }

        public final void OXO1(Throwable th) {
            ExoPlayerManager.this.OIi0().removeListener(this.f54925I1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
            OXO1(th);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.ExoPlayerManager$stop$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.ExoPlayerManager$stop$1", m39466f = "ExoPlayerManager.kt", m39467i = {}, m39468l = {83}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290341 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290341(Continuation<? super C290341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExoPlayerManager.this.new C290341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290341) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                XiOIO xiOIO = ExoPlayerManager.this.XO0O10;
                if (xiOIO != null) {
                    this.label = 1;
                    if (C2954td.I0iXXO(xiOIO, this) == objI0iXXO) {
                        return objI0iXXO;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            if (!ExoPlayerManager.this.IiI10X) {
                ExoPlayerManager.this.OIi0().stop();
                ExoPlayerManager.this.O00 = null;
            }
            return Unit.OXO1;
        }
    }

    public ExoPlayerManager(@aa1 Context context, @aa1 i00OIXiO scope) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(scope, "scope");
        this.OXO1 = scope;
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        Intrinsics.O10IXXX0X(exoPlayerBuild, "build(...)");
        this.XIi00iiXO = exoPlayerBuild;
        this.f54924iO = IiI10X.XO0O10(Integer.MAX_VALUE, null, null, 6, null);
        XX01Oi.IiI10X(scope, null, null, new C190591(null), 3, null);
    }

    public final void I0iXXO() {
    }

    /* JADX INFO: renamed from: IO */
    public final void m38851IO() {
        if (this.IiI10X) {
            return;
        }
        this.IiI10X = true;
        this.XIi00iiXO.release();
    }

    public final void OIX0iXi() {
    }

    @aa1
    public final ExoPlayer OIi0() {
        return this.XIi00iiXO;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void OXO1(@aa1 String path) {
        Intrinsics.X0O(path, "path");
        XX01Oi.IiI10X(this.OXO1, null, null, new ExoPlayerManager$forcePlay$1(this, path, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.media3.common.Player$Listener, com.sma.smartv3.util.audio_play.ExoPlayerManager$playAsync$2$listener$1] */
    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @tb1
    public Object XIi00iiXO(@aa1 String str, @aa1 Continuation<? super Unit> continuation) {
        final XIi00iiXO xIi00iiXO = new XIi00iiXO(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation), 1);
        xIi00iiXO.XXX11i();
        File file = new File(str);
        if (file.exists()) {
            i1O0OXO1O.OXO1.OXO1("PlayAsync:fileLength:" + file.length() + " path:" + str);
            this.O00 = str;
            OIi0().stop();
            MediaItem mediaItemFromUri = MediaItem.fromUri(Uri.fromFile(file));
            Intrinsics.O10IXXX0X(mediaItemFromUri, "fromUri(...)");
            OIi0().setMediaItem(mediaItemFromUri);
            OIi0().prepare();
            OIi0().play();
            ?? r8 = new Player.Listener() { // from class: com.sma.smartv3.util.audio_play.ExoPlayerManager$playAsync$2$listener$1
                @Override // androidx.media3.common.Player.Listener
                public void onPlaybackStateChanged(int i) {
                    if (i == 1 || i == 4) {
                        this.this$0.OIi0().removeListener(this);
                        this.this$0.O00 = null;
                        IO0i<Unit> iO0i = xIi00iiXO;
                        Result.Companion companion = Result.Companion;
                        iO0i.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
                    }
                }

                @Override // androidx.media3.common.Player.Listener
                public void onPlayerError(PlaybackException error) {
                    Intrinsics.X0O(error, "error");
                    this.this$0.OIi0().removeListener(this);
                    this.this$0.O00 = null;
                    if (xIi00iiXO.isActive()) {
                        IO0i<Unit> iO0i = xIi00iiXO;
                        Result.Companion companion = Result.Companion;
                        iO0i.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
                    }
                }
            };
            OIi0().addListener(r8);
            xIi00iiXO.mo634iX(new OXO1(r8));
        } else {
            Result.Companion companion = Result.Companion;
            xIi00iiXO.resumeWith(Result.m48333constructorimpl(Unit.OXO1));
        }
        Object objOII = xIi00iiXO.OII();
        if (objOII == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objOII == C2798pb.I0iXXO() ? objOII : Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @aa1
    public O00<String> XO0O10() {
        return this.f54924iO;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    /* JADX INFO: renamed from: iO */
    public void mo1187iO(@tb1 String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        XX01Oi.IiI10X(this.OXO1, null, null, new ExoPlayerManager$enqueue$1(this, str, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void stop() {
        XX01Oi.IiI10X(this.OXO1, null, null, new C290341(null), 3, null);
    }

    public /* synthetic */ ExoPlayerManager(Context context, i00OIXiO i00oixio, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? I0IIOi.OXO1(IXOX0Xiii.O00()) : i00oixio);
    }
}
