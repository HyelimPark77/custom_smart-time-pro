package com.sma.smartv3.util.audio_play;

import android.media.AudioTrack;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.File;
import java.io.FileInputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p617io.CloseableKt;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XX0;
import kotlinx.coroutines.XiOIO;
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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final O00<String> f54923iO;

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1", m39466f = "AudioTrackPlayManager.kt", m39467i = {0, 1, 1}, m39468l = {44, 45}, m39469m = "invokeSuspend", m39470n = {"$this$launch", "$this$launch", "audioPath"}, m39472s = {"L$0", "L$0", "L$2"}, m39473v = 1)
    public static final class C190571 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1$1 */
        @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1$1", m39466f = "AudioTrackPlayManager.kt", m39467i = {}, m39468l = {50}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $audioPath;
            int label;
            final /* synthetic */ AudioTrackPlayManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AudioTrackPlayManager audioTrackPlayManager, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = audioTrackPlayManager;
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
                    this.this$0.m38850IO(this.$audioPath);
                    AudioTrackPlayManager audioTrackPlayManager = this.this$0;
                    String str = this.$audioPath;
                    this.label = 1;
                    if (audioTrackPlayManager.XIi00iiXO(str, this) == objI0iXXO) {
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

        public C190571(Continuation<? super C190571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190571 c190571 = AudioTrackPlayManager.this.new C190571(continuation);
            c190571.L$0 = obj;
            return c190571;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190571) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004d  */
        /* JADX WARN: Code duplicated, block: B:17:0x0057  */
        /* JADX WARN: Code duplicated, block: B:19:0x0066  */
        /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:22:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:22:0x0075). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.L$0
                r1 = r0
                com.android.mltcode.paycertificationapi.i00OIXiO r1 = (com.android.mltcode.paycertificationapi.i00OIXiO) r1
                java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
                int r2 = r11.label
                r7 = 0
                r8 = 2
                r9 = 1
                if (r2 == 0) goto L31
                if (r2 == r9) goto L28
                if (r2 != r8) goto L20
                java.lang.Object r2 = r11.L$2
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
                kotlin.ResultKt.X1ii(r12)
                goto L75
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                java.lang.Object r2 = r11.L$1
                kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
                kotlin.ResultKt.X1ii(r12)
                r3 = r2
                goto L4f
            L31:
                kotlin.ResultKt.X1ii(r12)
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager r12 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.this
                kotlinx.coroutines.channels.O00 r12 = r12.XO0O10()
                kotlinx.coroutines.channels.ChannelIterator r12 = r12.iterator()
            L3e:
                r11.L$0 = r1
                r11.L$1 = r12
                r11.L$2 = r7
                r11.label = r9
                java.lang.Object r2 = r12.XIi00iiXO(r11)
                if (r2 != r0) goto L4d
                goto L74
            L4d:
                r3 = r12
                r12 = r2
            L4f:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto La1
                java.lang.Object r12 = r3.next()
                r2 = r12
                java.lang.String r2 = (java.lang.String) r2
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager r12 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.this
                kotlinx.coroutines.XiOIO r12 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.IiI10X(r12)
                if (r12 == 0) goto L75
                r11.L$0 = r1
                r11.L$1 = r3
                r11.L$2 = r2
                r11.label = r8
                java.lang.Object r12 = com.android.mltcode.paycertificationapi.C2954td.I0iXXO(r12, r11)
                if (r12 != r0) goto L75
            L74:
                return r0
            L75:
                r12 = r3
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager r3 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.this
                android.media.AudioTrack r3 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.O00(r3)
                r3.pause()
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager r3 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.this
                android.media.AudioTrack r3 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.O00(r3)
                r3.flush()
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager r10 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.this
                r3 = r2
                kotlinx.coroutines.CoroutineDispatcher r2 = com.android.mltcode.paycertificationapi.IXOX0Xiii.m712iO()
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1$1 r4 = new com.sma.smartv3.util.audio_play.AudioTrackPlayManager$1$1
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager r5 = com.sma.smartv3.util.audio_play.AudioTrackPlayManager.this
                r4.<init>(r5, r3, r7)
                r5 = 2
                r6 = 0
                r3 = 0
                kotlinx.coroutines.XiOIO r2 = com.android.mltcode.paycertificationapi.I100X1.O00(r1, r2, r3, r4, r5, r6)
                com.sma.smartv3.util.audio_play.AudioTrackPlayManager.I0IIOi(r10, r2)
                goto L3e
            La1:
                kotlin.Unit r12 = kotlin.Unit.OXO1
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.util.audio_play.AudioTrackPlayManager.C190571.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.audio_play.AudioTrackPlayManager$stop$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.audio_play.AudioTrackPlayManager$stop$1", m39466f = "AudioTrackPlayManager.kt", m39467i = {}, m39468l = {84}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290331 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290331(Continuation<? super C290331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioTrackPlayManager.this.new C290331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290331) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                XiOIO xiOIO = AudioTrackPlayManager.this.XO0O10;
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
            AudioTrackPlayManager.this.IiI10X.stop();
            AudioTrackPlayManager.this.O00 = null;
            return Unit.OXO1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioTrackPlayManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void I0iXXO(float f) {
        this.IiI10X.setVolume(f);
    }

    /* JADX INFO: renamed from: IO */
    public final void m38850IO(@aa1 String path) {
        Intrinsics.X0O(path, "path");
        this.XOO0ii0 = new File(path).length() / ((long) (this.IiI10X.getChannelConfiguration() == 12 ? 4 : 2));
    }

    public final void OIX0iXi() {
        this.IiI10X.release();
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void OXO1(@aa1 String path) {
        Intrinsics.X0O(path, "path");
        XX01Oi.IiI10X(this.OXO1, null, null, new AudioTrackPlayManager$forcePlay$1(this, path, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @tb1
    public Object XIi00iiXO(@aa1 String str, @aa1 Continuation<? super Unit> continuation) {
        File file = new File(str);
        if (!file.exists()) {
            return Unit.OXO1;
        }
        this.O00 = str;
        try {
            try {
                I0iXXO(1.0f);
                this.IiI10X.play();
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1 || !XX0.f56464IO.isActive()) {
                            break;
                        }
                        this.IiI10X.write(bArr, 0, i);
                    }
                    Unit unit = Unit.OXO1;
                    CloseableKt.OXO1(fileInputStream, null);
                    this.IiI10X.stop();
                    this.O00 = null;
                    return Unit.OXO1;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.OXO1(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            this.O00 = null;
            throw th3;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    @aa1
    public O00<String> XO0O10() {
        return this.f54923iO;
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    /* JADX INFO: renamed from: iO */
    public void mo1187iO(@tb1 String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        XX01Oi.IiI10X(this.OXO1, null, null, new AudioTrackPlayManager$enqueue$1(this, str, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.X1XXX0I0
    public void stop() {
        XX01Oi.IiI10X(this.OXO1, null, null, new C290331(null), 3, null);
    }

    public AudioTrackPlayManager(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        this.OXO1 = scope;
        this.XIi00iiXO = "AudioTrackPlayManager";
        this.f54923iO = IiI10X.XO0O10(Integer.MAX_VALUE, null, null, 6, null);
        this.IiI10X = new AudioTrack(3, 16000, 4, 2, AudioTrack.getMinBufferSize(16000, 4, 2), 1);
        XX01Oi.IiI10X(scope, null, null, new C190571(null), 3, null);
    }

    public /* synthetic */ AudioTrackPlayManager(i00OIXiO i00oixio, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? I0IIOi.OXO1(IXOX0Xiii.O00()) : i00oixio);
    }
}
