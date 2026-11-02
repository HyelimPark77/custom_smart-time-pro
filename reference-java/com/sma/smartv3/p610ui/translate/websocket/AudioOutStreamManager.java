package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i01XXi;
import com.android.mltcode.paycertificationapi.i1Ii0IIi0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
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

    /* JADX INFO: renamed from: iO */
    @tb1
    public XiOIO f54870iO;

    public AudioOutStreamManager(@aa1 bw6 client, @aa1 i01XXi player) {
        Intrinsics.X0O(client, "client");
        Intrinsics.X0O(player, "player");
        this.OXO1 = client;
        this.XIi00iiXO = player;
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    public void OXO1(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        clear();
        this.f54870iO = XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new AudioOutStreamManager$start$1(this, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.iX1iI
    @tb1
    public Object XIi00iiXO(@aa1 Continuation<? super Unit> continuation) {
        AudioOutStreamManager$stop$1 audioOutStreamManager$stop$1;
        if (continuation instanceof AudioOutStreamManager$stop$1) {
            audioOutStreamManager$stop$1 = (AudioOutStreamManager$stop$1) continuation;
            int i = audioOutStreamManager$stop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioOutStreamManager$stop$1.label = i - Integer.MIN_VALUE;
            } else {
                audioOutStreamManager$stop$1 = new AudioOutStreamManager$stop$1(this, continuation);
            }
        } else {
            audioOutStreamManager$stop$1 = new AudioOutStreamManager$stop$1(this, continuation);
        }
        Object obj = audioOutStreamManager$stop$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioOutStreamManager$stop$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            XiOIO xiOIO = this.f54870iO;
            if (xiOIO != null) {
                audioOutStreamManager$stop$1.label = 1;
                if (C2954td.I0iXXO(xiOIO, audioOutStreamManager$stop$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.f54870iO = null;
        this.XIi00iiXO.XXI();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC3188zq
    @tb1
    public Object XO0O10(@aa1 i00OIXiO i00oixio, @aa1 Continuation<? super String> continuation) {
        i1O0OXO1O.OXO1.OXO1("流式数据不支持落盘");
        return "";
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    public void clear() {
        this.XIi00iiXO.I0iXXO();
        XiOIO xiOIO = this.f54870iO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.f54870iO = null;
    }

    @Override // com.android.mltcode.paycertificationapi.I1OO
    public void play() {
        this.XIi00iiXO.OIX0iXi();
    }
}
