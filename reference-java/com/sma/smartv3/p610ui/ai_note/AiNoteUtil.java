package com.sma.smartv3.p610ui.ai_note;

import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.p610ui.ai_note.AiNoteUtil;
import com.sma.smartv3.p610ui.translate.sparkchain.C19038iO;
import com.sma.smartv3.p610ui.translate.sparkchain.SparkLicenseManager;
import com.sma.smartv3.util.audio_recorder.AudioFileOutputManager;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.BleVoice;
import com.szabh.smable3.entity.Languages;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteUtil {

    @aa1
    public static String I0IIOi;
    public static int I0iXXO;

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final cr4 f54426IO;

    @aa1
    public static final OpusManager IiI10X;

    @aa1
    public static final Lazy O00;

    @aa1
    public static final ty0<mq4> O10IXXX0X;
    public static boolean OIX0iXi;

    @aa1
    public static String OIi0;

    @aa1
    public static final AiNoteUtil OXO1;

    @tb1
    public static String X1ii;

    @aa1
    public static final String XIi00iiXO;

    @aa1
    public static final Lazy XO0O10;

    @aa1
    public static final AudioFileOutputManager XOO0ii0;

    @aa1
    public static final AiNoteUtil$callback$1 XXI;

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final Lazy f54427iO;

    /* JADX WARN: Type inference failed for: r1v12, types: [com.sma.smartv3.ui.ai_note.AiNoteUtil$callback$1] */
    static {
        AiNoteUtil aiNoteUtil = new AiNoteUtil();
        OXO1 = aiNoteUtil;
        XIi00iiXO = "AiNoteUtil";
        f54427iO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OIXIX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AiNoteUtil.O1O();
            }
        });
        XO0O10 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiXiXO00
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AiNoteUtil.X0i1O();
            }
        });
        O00 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iX110X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AiNoteUtil.X11iII1O1();
            }
        });
        IiI10X = new OpusManager();
        XOO0ii0 = new AudioFileOutputManager(null, 1, null);
        I0IIOi = Languages.DEFAULT_LANGUAGE_ZH;
        OIi0 = Languages.DEFAULT_LANGUAGE;
        f54426IO = new cr4();
        XXI = new OpusManager.OnDecodeStreamCallback() { // from class: com.sma.smartv3.ui.ai_note.AiNoteUtil$callback$1
            @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
            public void onComplete(String path) {
                Intrinsics.X0O(path, "path");
                i1O0OXO1O.OXO1.OXO1(AiNoteUtil.XIi00iiXO + " onComplete");
            }

            @Override // com.sma.smartv3.biz.voice.OpusManager.OnDecodeStreamCallback
            public void onDecodeStream(byte[] bArr) {
                Intrinsics.X0O(bArr, "byte");
                AiNoteUtil aiNoteUtil2 = AiNoteUtil.OXO1;
                XX01Oi.IiI10X(aiNoteUtil2.i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$callback$1$onDecodeStream$1(bArr, null), 2, null);
                XX01Oi.IiI10X(aiNoteUtil2.i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$callback$1$onDecodeStream$2(bArr, null), 2, null);
            }

            @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
            public void onError(int i, String msg) {
                Intrinsics.X0O(msg, "msg");
                i1O0OXO1O.OXO1.OXO1(AiNoteUtil.XIi00iiXO + " onError:" + i + " " + msg);
            }

            @Override // com.sma.smartv3.biz.voice.OpusManager.OnStateCallback
            public void onStart() {
                i1O0OXO1O.OXO1.OXO1(AiNoteUtil.XIi00iiXO + " onStart");
            }
        };
        aiNoteUtil.m38318I1();
        aiNoteUtil.X01IiOiIi();
        aiNoteUtil.iOOX010X();
        X1ii = "";
        O10IXXX0X = l85.OXO1(new mq4(null, null, "-10086", null, null, null, 59, null));
    }

    public static final i00OIXiO O1O() {
        return I0IIOi.OXO1(IXOX0Xiii.m712iO().plus(ng5.m2716iO(null, 1, null)));
    }

    public static final C19038iO X0i1O() {
        return new C19038iO();
    }

    public static final SparkLicenseManager X11iII1O1() {
        return new SparkLicenseManager(OXO1.i010I());
    }

    public static /* synthetic */ void iX1O1(AiNoteUtil aiNoteUtil, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        aiNoteUtil.m38320iI(str, i);
    }

    /* JADX INFO: renamed from: I1 */
    public final void m38318I1() {
        XX01Oi.IiI10X(i010I(), null, null, new AiNoteUtil$collectBleAsrResult$1(null), 3, null);
    }

    @aa1
    public final OpusManager II1Xi0() {
        return IiI10X;
    }

    public final C19038iO IXXOO() {
        return (C19038iO) XO0O10.getValue();
    }

    /* JADX INFO: renamed from: OX */
    public final void m38319OX() {
        String strOIi0 = O10IXXX0X.getValue().OIi0();
        X1ii = strOIi0;
        if (strOIi0 == null || strOIi0.length() == 0) {
            return;
        }
        XX01Oi.IiI10X(i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$addAiNote$1(OIX0iXi ? f54426IO.O00() : f54426IO.m1628IO(), null), 2, null);
    }

    public final XiOIO X01IiOiIi() {
        return XX01Oi.IiI10X(i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$collectState$1(null), 2, null);
    }

    public final void X1IX() {
        IiI10X.stopDecodeStream();
        IXXOO().I0IIOi();
    }

    public final void XXIIO1i11(@aa1 BleVoice voice) {
        Intrinsics.X0O(voice, "voice");
        if (q62.OXO1.I0OX()) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " bleVoice:" + voice);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, voice, false, false, 24, null);
    }

    public final void XXX11i() {
        X1ii = "";
        O10IXXX0X.setValue(new mq4(null, null, "-10086", null, null, null, 59, null));
        m38321iX().XO0O10();
    }

    public final i00OIXiO i010I() {
        return (i00OIXiO) f54427iO.getValue();
    }

    /* JADX INFO: renamed from: iI */
    public final void m38320iI(String str, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        XX01Oi.IiI10X(i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$sendMsgToDevice$1(str, i, null), 2, null);
    }

    @aa1
    public final XiOIO iOO1ii1(@aa1 BleRecordPacket recordPacket) {
        Intrinsics.X0O(recordPacket, "recordPacket");
        return XX01Oi.IiI10X(i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$saveAiNote$1(recordPacket, null), 2, null);
    }

    public final XiOIO iOOX010X() {
        return XX01Oi.IiI10X(i010I(), IXOX0Xiii.m712iO(), null, new AiNoteUtil$collectPlayer$1(null), 2, null);
    }

    /* JADX INFO: renamed from: iX */
    public final SparkLicenseManager m38321iX() {
        return (SparkLicenseManager) O00.getValue();
    }
}
