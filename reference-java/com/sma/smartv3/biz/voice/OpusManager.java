package com.sma.smartv3.biz.voice;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.blankj.utilcode.util.FileIOUtils;
import com.sma.smartv3.biz.voice.OpusManager;
import com.smart.opus.OpusConstants;
import com.smart.opus.SmartOpus;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleAudioPacket;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nOpusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n289#2,7:183\n277#2,5:190\n298#2:195\n289#2,7:199\n277#2,5:206\n298#2:211\n1878#3,3:196\n1878#3,3:212\n*S KotlinDebug\n*F\n+ 1 OpusManager.kt\ncom/sma/smartv3/biz/voice/OpusManager\n*L\n95#1:183,7\n95#1:190,5\n95#1:195\n110#1:199,7\n110#1:206,5\n110#1:211\n98#1:196,3\n114#1:212,3\n*E\n"})
public final class OpusManager {

    @aa1
    private final String TAG = "OpusManager";

    @tb1
    private OnDecodeStreamCallback mOnDecodeStreamCallback;

    @tb1
    private OnStateCallback mOnStateCallback;

    @tb1
    private SmartOpus mOpus;

    @tb1
    private com.jieli.jl_audio_decode.opus.OpusManager mOpusManager;

    public interface OnDecodeStreamCallback extends OnStateCallback {
        void onDecodeStream(@aa1 byte[] bArr);
    }

    public interface OnStateCallback {
        void onComplete(@aa1 String str);

        void onError(int i, @aa1 String str);

        void onStart();
    }

    public OpusManager() {
        try {
            this.mOpusManager = new com.jieli.jl_audio_decode.opus.OpusManager();
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.OXO1(this.TAG + " OpusManager -> init error！！！");
        }
        try {
            SmartOpus smartOpus = new SmartOpus();
            this.mOpus = smartOpus;
            smartOpus.decoderInit(OpusConstants.SampleRate.Companion._16000(), OpusConstants.Channels.Companion.mono());
        } catch (Exception e2) {
            e2.printStackTrace();
            i1O0OXO1O.OXO1.OXO1(this.TAG + " Opus -> init error！！！");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit decodeFile$lambda$0(String str, OpusManager opusManager) throws IllegalAccessException, InstantiationException {
        byte[] file2BytesByChannel = FileIOUtils.readFile2BytesByChannel(str);
        Intrinsics.XXI(file2BytesByChannel);
        opusManager.decodeStream(file2BytesByChannel);
        return Unit.OXO1;
    }

    private final void decodeStream(byte[] bArr) throws IllegalAccessException, InstantiationException {
        OnDecodeStreamCallback onDecodeStreamCallback;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> decodeStream");
        BleReadable.Companion companion = BleReadable.Companion;
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        int i = length / 40;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                BleReadable.Companion companion2 = BleReadable.Companion;
                int i3 = 40 * i2;
                i2++;
                byte[] bArrI0IIOI = ArraysKt___ArraysJvmKt.I0IIOI(bArr, i3, 40 * i2);
                int length2 = bArrI0IIOI.length;
                Object objNewInstance = BleAudioPacket.class.newInstance();
                BleReadable bleReadable = (BleReadable) objNewInstance;
                bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(bArrI0IIOI, 0, length2));
                bleReadable.decode();
                Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
                arrayList.add(bleReadable);
            }
        }
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            BleAudioPacket bleAudioPacket = (BleAudioPacket) obj;
            i1O0OXO1O.OXO1.OXO1("decodeStream packet " + i4 + ": " + bleAudioPacket + "  " + (this.mOnDecodeStreamCallback != null));
            SmartOpus smartOpus = this.mOpus;
            byte[] bArrDecode$default = smartOpus != null ? SmartOpus.decode$default(smartOpus, bleAudioPacket.getMData(), OpusConstants.FrameSize.Companion._320(), 0, 4, (Object) null) : null;
            if (bArrDecode$default != null && (onDecodeStreamCallback = this.mOnDecodeStreamCallback) != null) {
                onDecodeStreamCallback.onDecodeStream(bArrDecode$default);
            }
            i4 = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeAudioStream$lambda$0(OpusManager opusManager, byte[] bArr) throws IllegalAccessException, InstantiationException {
        opusManager.decodeStream(bArr);
        return Unit.OXO1;
    }

    public final void decodeFile(@aa1 final String inFilePath, @aa1 String outFilePath, @aa1 OnStateCallback callback) {
        Intrinsics.X0O(inFilePath, "inFilePath");
        Intrinsics.X0O(outFilePath, "outFilePath");
        Intrinsics.X0O(callback, "callback");
        this.mOnStateCallback = callback;
        BleCache bleCache = BleCache.INSTANCE;
        if (!Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) && !Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) && !Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI)) {
                ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.mi1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return OpusManager.decodeFile$lambda$0(inFilePath, this);
                    }
                }, 31, null);
                return;
            }
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> jl decodeFile");
        com.jieli.jl_audio_decode.opus.OpusManager opusManager = this.mOpusManager;
        if (opusManager != null) {
            opusManager.decodeFile(inFilePath, outFilePath, new com.jieli.jl_audio_decode.callback.OnStateCallback() { // from class: com.sma.smartv3.biz.voice.OpusManager.decodeFile.1
                @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
                public void onComplete(String outFilePath2) {
                    Intrinsics.X0O(outFilePath2, "outFilePath");
                    OnStateCallback onStateCallback = OpusManager.this.mOnStateCallback;
                    if (onStateCallback != null) {
                        onStateCallback.onComplete(outFilePath2);
                    }
                }

                @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
                public void onError(int i, String message) {
                    Intrinsics.X0O(message, "message");
                    OnStateCallback onStateCallback = OpusManager.this.mOnStateCallback;
                    if (onStateCallback != null) {
                        onStateCallback.onError(i, message);
                    }
                }

                @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
                public void onStart() {
                    OnStateCallback onStateCallback = OpusManager.this.mOnStateCallback;
                    if (onStateCallback != null) {
                        onStateCallback.onStart();
                    }
                }
            });
        }
    }

    public final void release() {
        com.jieli.jl_audio_decode.opus.OpusManager opusManager = this.mOpusManager;
        if (opusManager != null) {
            opusManager.release();
        }
        SmartOpus smartOpus = this.mOpus;
        if (smartOpus != null) {
            smartOpus.decoderRelease();
        }
    }

    public final void startDecodeStream(@aa1 OnDecodeStreamCallback callback) {
        Intrinsics.X0O(callback, "callback");
        this.mOnDecodeStreamCallback = callback;
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            stopDecodeStream();
            com.jieli.jl_audio_decode.opus.OpusManager opusManager = this.mOpusManager;
            if (opusManager != null) {
                opusManager.startDecodeStream(new com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback() { // from class: com.sma.smartv3.biz.voice.OpusManager.startDecodeStream.1
                    @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
                    public void onComplete(String p0) {
                        Intrinsics.X0O(p0, "p0");
                        OnDecodeStreamCallback onDecodeStreamCallback = OpusManager.this.mOnDecodeStreamCallback;
                        if (onDecodeStreamCallback != null) {
                            onDecodeStreamCallback.onComplete(p0);
                        }
                    }

                    @Override // com.jieli.jl_audio_decode.callback.OnDecodeStreamCallback
                    public void onDecodeStream(byte[] p0) {
                        Intrinsics.X0O(p0, "p0");
                        OnDecodeStreamCallback onDecodeStreamCallback = OpusManager.this.mOnDecodeStreamCallback;
                        if (onDecodeStreamCallback != null) {
                            onDecodeStreamCallback.onDecodeStream(p0);
                        }
                    }

                    @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
                    public void onError(int i, String p1) {
                        Intrinsics.X0O(p1, "p1");
                        OnDecodeStreamCallback onDecodeStreamCallback = OpusManager.this.mOnDecodeStreamCallback;
                        if (onDecodeStreamCallback != null) {
                            onDecodeStreamCallback.onError(i, p1);
                        }
                    }

                    @Override // com.jieli.jl_audio_decode.callback.OnStateCallback
                    public void onStart() {
                        OnDecodeStreamCallback onDecodeStreamCallback = OpusManager.this.mOnDecodeStreamCallback;
                        if (onDecodeStreamCallback != null) {
                            onDecodeStreamCallback.onStart();
                        }
                    }
                });
            }
        }
    }

    public final void stopDecodeStream() {
        com.jieli.jl_audio_decode.opus.OpusManager opusManager;
        BleCache bleCache = BleCache.INSTANCE;
        if ((Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) && (opusManager = this.mOpusManager) != null) {
            opusManager.stopEncodeStream();
        }
    }

    public final void writeAudioStream(@aa1 final byte[] data) {
        Intrinsics.X0O(data, "data");
        BleCache bleCache = BleCache.INSTANCE;
        if (!Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) && !Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) && !Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_SIFLI)) {
                ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.pi1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return OpusManager.writeAudioStream$lambda$0(this.f10370IO, data);
                    }
                }, 31, null);
                return;
            }
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> jl decodeStream");
        com.jieli.jl_audio_decode.opus.OpusManager opusManager = this.mOpusManager;
        if (opusManager != null) {
            opusManager.writeAudioStream(data);
        }
    }

    public final void decodeStream(@aa1 String opus, @aa1 String pcmPath, @aa1 Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(opus, "opus");
        Intrinsics.X0O(pcmPath, "pcmPath");
        Intrinsics.X0O(callback, "callback");
        BleReadable.Companion companion = BleReadable.Companion;
        byte[] file2BytesByStream = FileIOUtils.readFile2BytesByStream(opus);
        Intrinsics.O10IXXX0X(file2BytesByStream, "readFile2BytesByStream(...)");
        int length = file2BytesByStream.length;
        ArrayList arrayList = new ArrayList();
        int i = length / 40;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                BleReadable.Companion companion2 = BleReadable.Companion;
                int i3 = 40 * i2;
                i2++;
                byte[] bArrI0IIOI = ArraysKt___ArraysJvmKt.I0IIOI(file2BytesByStream, i3, 40 * i2);
                int length2 = bArrI0IIOI.length;
                Object objNewInstance = BleAudioPacket.class.newInstance();
                BleReadable bleReadable = (BleReadable) objNewInstance;
                bleReadable.setMBytes(ArraysKt___ArraysJvmKt.I0IIOI(bArrI0IIOI, 0, length2));
                bleReadable.decode();
                Intrinsics.O10IXXX0X(objNewInstance, "also(...)");
                arrayList.add(bleReadable);
            }
        }
        boolean z = false;
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            BleAudioPacket bleAudioPacket = (BleAudioPacket) obj;
            SmartOpus smartOpus = this.mOpus;
            byte[] bArrDecode$default = smartOpus != null ? SmartOpus.decode$default(smartOpus, bleAudioPacket.getMData(), OpusConstants.FrameSize.Companion._320(), 0, 4, (Object) null) : null;
            if (bArrDecode$default != null) {
                FileIOUtils.writeFileFromBytesByStream(pcmPath, bArrDecode$default, true);
            }
            z = arrayList.size() - 1 == i4;
            i4 = i5;
        }
        callback.invoke2(Boolean.valueOf(z));
    }
}
