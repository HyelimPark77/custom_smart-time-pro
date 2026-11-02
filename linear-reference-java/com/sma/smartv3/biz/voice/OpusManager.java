package com.sma.smartv3.biz.voice;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.mi1;
import com.android.mltcode.paycertificationapi.pi1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.blankj.utilcode.util.FileIOUtils;
import com.smart.opus.OpusConstants;
import com.smart.opus.SmartOpus;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleAudioPacket;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOpusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n289#2,7:183\n277#2,5:190\n298#2:195\n289#2,7:199\n277#2,5:206\n298#2:211\n1878#3,3:196\n1878#3,3:212\n*S KotlinDebug\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n*L\n95#1:183,7\n95#1:190,5\n95#1:195\n110#1:199,7\n110#1:206,5\n110#1:211\n98#1:196,3\n114#1:212,3\n*E\n"})
public final class OpusManager {

    @aa1
    private final String TAG;

    @tb1
    private OnDecodeStreamCallback mOnDecodeStreamCallback;

    @tb1
    private OnStateCallback mOnStateCallback;

    @tb1
    private SmartOpus mOpus;

    @tb1
    private com.jieli.jl_audio_decode.opus.OpusManager mOpusManager;

    public interface OnDecodeStreamCallback extends OnStateCallback {
        void onDecodeStream(@aa1 byte[] r1);
    }

    public interface OnStateCallback {
        void onComplete(@aa1 String r1);

        void onError(int r1, @aa1 String r2);

        void onStart();
    }

    public OpusManager() {
        this.TAG = "OpusManager";
        this.mOpusManager = new com.jieli.jl_audio_decode.opus.OpusManager();     // Catch: Exception -> L5
    L14:
        SmartOpus r0 = new SmartOpus();     // Catch: Exception -> L9
        this.mOpus = r0;     // Catch: Exception -> L9
        r0.decoderInit(OpusConstants.SampleRate.Companion._16000(), OpusConstants.Channels.Companion.mono());     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " Opus -> init error！！！");
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " OpusManager -> init error！！！");
        goto L14
    }

    public static /* synthetic */ Unit OXO1(String r0, OpusManager r1) {
        return decodeFile$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XIi00iiXO(OpusManager r0, byte[] r1) {
        return writeAudioStream$lambda$0(r0, r1);
    }

    public static final /* synthetic */ OnDecodeStreamCallback access$getMOnDecodeStreamCallback$p(OpusManager r0) {
        return r0.mOnDecodeStreamCallback;
    }

    public static final /* synthetic */ OnStateCallback access$getMOnStateCallback$p(OpusManager r0) {
        return r0.mOnStateCallback;
    }

    private static final Unit decodeFile$lambda$0(String r0, OpusManager r1) {
        byte[] r2 = FileIOUtils.readFile2BytesByChannel(r0);
        Intrinsics.XXI(r2);
        r1.decodeStream(r2);
        return Unit.OXO1;
    }

    private final void decodeStream(byte[] r12) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> decodeStream");
        BleReadable.Companion r0 = BleReadable.Companion;
        int r1 = r12.length;
        ArrayList r2 = new ArrayList();
        int r3 = r1 / 40;
        if (r3 <= 0) goto L7;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L7;
        BleReadable.Companion r5 = BleReadable.Companion;
        int r6 = 40 * r4;
        r4 = r4 + 1;
        byte[] r7 = ArraysKt___ArraysJvmKt.I0IIOI(r12, r6, 40 * r4);
        int r8 = r7.length;
        Object r9 = BleAudioPacket.class.newInstance();
        BleReadable r10 = (BleReadable) r9;
        r10.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r7, 0, r8));
        r10.decode();
        Intrinsics.O10IXXX0X(r9, "also(...)");
        r2.add(r10);
    L7:
        Iterator r13 = r2.iterator();
        int r11 = 0;
    L9:
        if (r13.hasNext() == false) goto L26;
        Object r14 = r13.next();
        int r15 = r11 + 1;
        if (r11 >= 0) goto L13;
        CollectionsKt__CollectionsKt.XOX0O0();
    L13:
        BleAudioPacket r16 = (BleAudioPacket) r14;
        i1O0OXO1O r17 = i1O0OXO1O.OXO1;
        if (this.mOnDecodeStreamCallback == null) goto L16;
        boolean r18 = true;
    L17:
        r17.OXO1("decodeStream packet " + r11 + ": " + r16 + "  " + r18);
        SmartOpus r19 = this.mOpus;
        if (r19 == null) goto L20;
        byte[] r20 = SmartOpus.decode$default(r19, r16.getMData(), OpusConstants.FrameSize.Companion._320(), 0, 4, null);
    L21:
        if (r20 == null) goto L25;
        OnDecodeStreamCallback r21 = this.mOnDecodeStreamCallback;
        if (r21 == null) goto L25;
        r21.onDecodeStream(r20);
    L25:
        r11 = r15;
        goto L9
    L20:
        r20 = null;
        goto L21
    L16:
        r18 = false;
        goto L17
    }

    private static final Unit writeAudioStream$lambda$0(OpusManager r0, byte[] r1) {
        r0.decodeStream(r1);
        return Unit.OXO1;
    }

    public final void decodeFile(@aa1 final String r9, @aa1 String r10, @aa1 OnStateCallback r11) {
        Intrinsics.X0O(r9, "inFilePath");
        Intrinsics.X0O(r10, "outFilePath");
        Intrinsics.X0O(r11, "callback");
        this.mOnStateCallback = r11;
        BleCache r12 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L13:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> jl decodeFile");
        com.jieli.jl_audio_decode.opus.OpusManager r13 = this.mOpusManager;
        if (r13 == null) goto L18;
        r13.decodeFile(r9, r10, new AnonymousClass1(this));
        return;
    L18:
        return;
    L5:
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L13;
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L13;
        if (Intrinsics.XOO0ii0(r12.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == false) goto L17;
        ThreadsKt.iO(false, false, null, null, 0, new mi1(r9, this), 31, null);
        return;
    }

    public final void release() {
        com.jieli.jl_audio_decode.opus.OpusManager r0 = this.mOpusManager;
        if (r0 == null) goto L5;
        r0.release();
    L5:
        SmartOpus r1 = this.mOpus;
        if (r1 == null) goto L9;
        r1.decoderRelease();
        return;
    }

    public final void startDecodeStream(@aa1 OnDecodeStreamCallback r3) {
        Intrinsics.X0O(r3, "callback");
        this.mOnDecodeStreamCallback = r3;
        BleCache r4 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r4.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L8:
        stopDecodeStream();
        com.jieli.jl_audio_decode.opus.OpusManager r5 = this.mOpusManager;
        if (r5 == null) goto L13;
        r5.startDecodeStream(new C33961(this));
        return;
    L13:
        return;
    L5:
        if (Intrinsics.XOO0ii0(r4.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L8;
        if (Intrinsics.XOO0ii0(r4.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L8;
    }

    public final void stopDecodeStream() {
        BleCache r0 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L8:
        com.jieli.jl_audio_decode.opus.OpusManager r1 = this.mOpusManager;
        if (r1 == null) goto L13;
        r1.stopEncodeStream();
        return;
    L13:
        return;
    L5:
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L8;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L8;
    }

    public final void writeAudioStream(@aa1 final byte[] r10) {
        Intrinsics.X0O(r10, "data");
        BleCache r0 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L13:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> jl decodeStream");
        com.jieli.jl_audio_decode.opus.OpusManager r1 = this.mOpusManager;
        if (r1 == null) goto L18;
        r1.writeAudioStream(r10);
        return;
    L18:
        return;
    L5:
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L13;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L13;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI) == false) goto L17;
        ThreadsKt.iO(false, false, null, null, 0, new pi1(this, r10), 31, null);
        return;
    }

    public final void decodeStream(@aa1 String r12, @aa1 String r13, @aa1 Function1<? super Boolean, Unit> r14) {
        Intrinsics.X0O(r12, "opus");
        Intrinsics.X0O(r13, "pcmPath");
        Intrinsics.X0O(r14, "callback");
        BleReadable.Companion r0 = BleReadable.Companion;
        byte[] r15 = FileIOUtils.readFile2BytesByStream(r12);
        Intrinsics.O10IXXX0X(r15, "readFile2BytesByStream(...)");
        int r1 = r15.length;
        ArrayList r2 = new ArrayList();
        int r3 = r1 / 40;
        if (r3 <= 0) goto L7;
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L7;
        BleReadable.Companion r5 = BleReadable.Companion;
        int r6 = 40 * r4;
        r4 = r4 + 1;
        byte[] r7 = ArraysKt___ArraysJvmKt.I0IIOI(r15, r6, 40 * r4);
        int r8 = r7.length;
        Object r9 = BleAudioPacket.class.newInstance();
        BleReadable r10 = (BleReadable) r9;
        r10.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(r7, 0, r8));
        r10.decode();
        Intrinsics.O10IXXX0X(r9, "also(...)");
        r2.add(r10);
    L7:
        Iterator r16 = r2.iterator();
        boolean r11 = false;
        int r17 = 0;
    L9:
        if (r16.hasNext() == false) goto L25;
        Object r18 = r16.next();
        int r19 = r17 + 1;
        if (r17 >= 0) goto L13;
        CollectionsKt__CollectionsKt.XOX0O0();
    L13:
        BleAudioPacket r20 = (BleAudioPacket) r18;
        SmartOpus r21 = this.mOpus;
        if (r21 == null) goto L16;
        byte[] r22 = SmartOpus.decode$default(r21, r20.getMData(), OpusConstants.FrameSize.Companion._320(), 0, 4, null);
    L18:
        if (r22 == null) goto L21;
        FileIOUtils.writeFileFromBytesByStream(r13, r22, true);
    L21:
        if ((r2.size() - 1) != r17) goto L23;
        r11 = true;
    L24:
        r17 = r19;
        goto L9
    L23:
        r11 = false;
        goto L24
    L16:
        r22 = null;
        goto L18
    L25:
        r14.invoke(Boolean.valueOf(r11));
    }
}
