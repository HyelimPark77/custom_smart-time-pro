package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i01XXi;
import com.android.mltcode.paycertificationapi.i1Ii0IIi0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.td;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioOutStreamManager implements i1Ii0IIi0 {

    @aa1
    public final bw6 OXO1;

    @aa1
    public final i01XXi XIi00iiXO;

    @tb1
    public XiOIO iO;

    public AudioOutStreamManager(@aa1 bw6 r2, @aa1 i01XXi r3) {
        Intrinsics.X0O(r2, "client");
        Intrinsics.X0O(r3, "player");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
    }

    public static final /* synthetic */ i01XXi O00(AudioOutStreamManager r0) {
        return r0.XIi00iiXO;
    }

    public static final /* synthetic */ bw6 iO(AudioOutStreamManager r0) {
        return r0.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    public void OXO1(@aa1 i00OIXiO r8) {
        Intrinsics.X0O(r8, "scope");
        clear();
        this.iO = I100X1.O00(r8, IXOX0Xiii.iO(), null, new AudioOutStreamManager$start$1(this, null), 2, null);
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    @tb1
    public Object XIi00iiXO(@aa1 Continuation<? super Unit> r5) {
        if ((r5 instanceof AudioOutStreamManager$stop$1) == false) goto L7;
        AudioOutStreamManager$stop$1 r0 = (AudioOutStreamManager$stop$1) r5;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r6 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        ResultKt.X1ii(r6);
    L19:
        this.iO = null;
        XXI();
        return Unit.OXO1;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r6);
        XiOIO r7 = this.iO;
        if (r7 == null) goto L19;
        r0.label = 1;
        if (td.I0iXXO(r7, r0) != r2) goto L19;
        return r2;
    L7:
        r0 = new AudioOutStreamManager$stop$1(this, r5);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.zq
    @tb1
    public Object XO0O10(@aa1 i00OIXiO r1, @aa1 Continuation<? super String> r2) {
        i1O0OXO1O.OXO1.OXO1("流式数据不支持落盘");
        return "";
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    public void clear() {
        I0iXXO();
        XiOIO r0 = this.iO;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        this.iO = null;
    }

    @Override // com.android.mltcode.paycertificationapi.I1OO
    public void play() {
        OIX0iXi();
    }
}
