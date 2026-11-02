package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IOiXiXO00;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.OIXIX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0iX110X;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.sma.smartv3.biz.voice.OpusManager;
import com.sma.smartv3.ui.translate.sparkchain.SparkLicenseManager;
import com.sma.smartv3.ui.translate.sparkchain.iO;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteUtil {

    @aa1
    public static String I0IIOi;
    public static int I0iXXO;

    @aa1
    public static final cr4 IO = null;

    @aa1
    public static final OpusManager IiI10X = null;

    @aa1
    public static final Lazy O00 = null;

    @aa1
    public static final ty0<mq4> O10IXXX0X = null;
    public static boolean OIX0iXi;

    @aa1
    public static String OIi0;

    @aa1
    public static final AiNoteUtil OXO1 = null;

    @tb1
    public static String X1ii;

    @aa1
    public static final String XIi00iiXO = null;

    @aa1
    public static final Lazy XO0O10 = null;

    @aa1
    public static final AudioFileOutputManager XOO0ii0 = null;

    @aa1
    public static final AiNoteUtil$callback$1 XXI = null;

    @aa1
    public static final Lazy iO = null;

    /* JADX WARN: Type inference failed for: r1v12, types: [com.sma.smartv3.ui.ai_note.AiNoteUtil$callback$1] */
    static {
        AiNoteUtil r0 = new AiNoteUtil();
        OXO1 = r0;
        XIi00iiXO = "AiNoteUtil";
        iO = LazyKt__LazyJVMKt.iO(new OIXIX());
        XO0O10 = LazyKt__LazyJVMKt.iO(new IOiXiXO00());
        O00 = LazyKt__LazyJVMKt.iO(new i0iX110X());
        IiI10X = new OpusManager();
        XOO0ii0 = new AudioFileOutputManager(null, 1, null);
        I0IIOi = Languages.DEFAULT_LANGUAGE_ZH;
        OIi0 = Languages.DEFAULT_LANGUAGE;
        IO = new cr4();
        XXI = new AiNoteUtil$callback$1();
        r0.I1();
        r0.X01IiOiIi();
        r0.iOOX010X();
        X1ii = "";
        String r3 = null;
        String r4 = "-10086";
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        O10IXXX0X = l85.OXO1(new mq4(null, r3, r4, r5, r6, r7, 59, null));
    }

    public AiNoteUtil() {
    }

    public static final /* synthetic */ int I0IIOi() {
        return I0iXXO;
    }

    public static final /* synthetic */ SparkLicenseManager I0iXXO(AiNoteUtil r0) {
        return r0.iX();
    }

    public static final /* synthetic */ boolean I1XOi1() {
        return OIX0iXi;
    }

    public static final /* synthetic */ void IIX1OXO(AiNoteUtil r0, String r1, int r2) {
        r0.iI(r1, r2);
    }

    public static final /* synthetic */ i00OIXiO IO(AiNoteUtil r0) {
        return r0.i010I();
    }

    public static final /* synthetic */ AiNoteUtil$callback$1 IiI10X() {
        return XXI;
    }

    public static final /* synthetic */ AudioFileOutputManager O00() {
        return XOO0ii0;
    }

    public static final /* synthetic */ iO O10IXXX0X(AiNoteUtil r0) {
        return r0.IXXOO();
    }

    public static final i00OIXiO O1O() {
        return I0IIOi.OXO1(IXOX0Xiii.iO().plus(ng5.iO(null, 1, null)));
    }

    public static final /* synthetic */ void OII(AiNoteUtil r0) {
        r0.X1IX();
    }

    public static final /* synthetic */ String OIX0iXi() {
        return X1ii;
    }

    public static final /* synthetic */ cr4 OIi0() {
        return IO;
    }

    public static /* synthetic */ i00OIXiO OXO1() {
        return O1O();
    }

    public static final /* synthetic */ void OiIIX101O(String r0) {
        OIi0 = r0;
    }

    public static final /* synthetic */ ty0 X0O() {
        return O10IXXX0X;
    }

    public static final iO X0i1O() {
        return new iO();
    }

    public static final SparkLicenseManager X11iII1O1() {
        return new SparkLicenseManager(OXO1.i010I());
    }

    public static final /* synthetic */ String X1ii() {
        return OIi0;
    }

    public static /* synthetic */ iO XIi00iiXO() {
        return X0i1O();
    }

    public static final /* synthetic */ void XO0O10(AiNoteUtil r0) {
        r0.OX();
    }

    public static final /* synthetic */ String XOO0ii0() {
        return I0IIOi;
    }

    public static final /* synthetic */ void XX0(int r0) {
        I0iXXO = r0;
    }

    public static final /* synthetic */ String XXI() {
        return XIi00iiXO;
    }

    public static final /* synthetic */ void XiOIO(boolean r0) {
        OIX0iXi = r0;
    }

    public static final /* synthetic */ void XiOIii1(AiNoteUtil r0) {
        r0.XXX11i();
    }

    public static final /* synthetic */ void iIiiO(String r0) {
        I0IIOi = r0;
    }

    public static /* synthetic */ SparkLicenseManager iO() {
        return X11iII1O1();
    }

    public static /* synthetic */ void iX1O1(AiNoteUtil r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.iI(r1, r2);
    }

    public final void I1() {
        I100X1.O00(i010I(), null, null, new AiNoteUtil$collectBleAsrResult$1(null), 3, null);
    }

    @aa1
    public final OpusManager II1Xi0() {
        return IiI10X;
    }

    public final iO IXXOO() {
        return (iO) XO0O10.getValue();
    }

    public final void OX() {
        String r0 = O10IXXX0X.getValue().OIi0();
        X1ii = r0;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.length() != 0) goto L8;
        return;
    L8:
        if (OIX0iXi == false) goto L10;
        int r1 = IO.O00();
    L11:
        I100X1.O00(i010I(), IXOX0Xiii.iO(), null, new AiNoteUtil$addAiNote$1(r1, null), 2, null);
        return;
    L10:
        r1 = IO.IO();
        goto L11
    }

    public final XiOIO X01IiOiIi() {
        return I100X1.O00(i010I(), IXOX0Xiii.iO(), null, new AiNoteUtil$collectState$1(null), 2, null);
    }

    public final void X1IX() {
        IiI10X.stopDecodeStream();
        IXXOO().I0IIOi();
    }

    public final void XXIIO1i11(@aa1 BleVoice r11) {
        Intrinsics.X0O(r11, "voice");
        if (q62.OXO1.I0OX() == true) goto L6;
        i1O0OXO1O.OXO1.OXO1(XIi00iiXO + " bleVoice:" + r11);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r11, false, false, 24, null);
        return;
    }

    public final void XXX11i() {
        X1ii = "";
        Integer r2 = null;
        String r3 = null;
        String r4 = "-10086";
        String r5 = null;
        String r6 = null;
        Integer r7 = null;
        O10IXXX0X.setValue(new mq4(r2, r3, r4, r5, r6, r7, 59, null));
        iX().XO0O10();
    }

    public final i00OIXiO i010I() {
        return (i00OIXiO) iO.getValue();
    }

    public final void iI(String r8, int r9) {
        if (r8 != null) goto L4;
        return;
    L4:
        if (r8.length() == 0) goto L9;
        I100X1.O00(i010I(), IXOX0Xiii.iO(), null, new AiNoteUtil$sendMsgToDevice$1(r8, r9, null), 2, null);
        return;
    }

    @aa1
    public final XiOIO iOO1ii1(@aa1 BleRecordPacket r8) {
        Intrinsics.X0O(r8, "recordPacket");
        return I100X1.O00(i010I(), IXOX0Xiii.iO(), null, new AiNoteUtil$saveAiNote$1(r8, null), 2, null);
    }

    public final XiOIO iOOX010X() {
        return I100X1.O00(i010I(), IXOX0Xiii.iO(), null, new AiNoteUtil$collectPlayer$1(null), 2, null);
    }

    public final SparkLicenseManager iX() {
        return (SparkLicenseManager) O00.getValue();
    }
}
