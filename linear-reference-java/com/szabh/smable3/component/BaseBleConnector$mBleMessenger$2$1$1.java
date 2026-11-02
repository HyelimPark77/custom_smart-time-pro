package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.OXX1;
import com.android.mltcode.paycertificationapi.X01O0O1;
import com.android.mltcode.paycertificationapi.h77;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseBleConnector$mBleMessenger$2$1$1 implements BleMessengerCallback {
    final /* synthetic */ BaseBleConnector this$0;

    public BaseBleConnector$mBleMessenger$2$1$1(BaseBleConnector r1) {
        this.this$0 = r1;
    }

    public static /* synthetic */ Unit OXO1(BleKey r0, BleKeyFlag r1, BleHandleCallback r2) {
        return onTimeout$lambda$0(r0, r1, r2);
    }

    private static final Unit onTimeout$lambda$0(BleKey r1, BleKeyFlag r2, BleHandleCallback r3) {
        Intrinsics.X0O(r3, "it");
        r3.onCommandSendTimeout(r1, r2);
        return Unit.OXO1;
    }

    @Override // com.szabh.smable3.component.BleMessengerCallback
    public void onRetry() {
        this.this$0.getMBleParser().reset();
    }

    @Override // com.szabh.smable3.component.BleMessengerCallback
    public void onTimeout(X01O0O1 r8) {
        Intrinsics.X0O(r8, "message");
        if (BaseBleConnector.access$getMBleStream$p(this.this$0) == null) goto L6;
        this.this$0.getMBleMessenger().reset();
        BaseBleConnector.access$setMBleStream(this.this$0, null);
    L6:
        if ((r8 instanceof h77) == false) goto L9;
        h77 r9 = (h77) r8;
        final BleKey r0 = BleKey.Companion.OXO1(ByteArrayExtKt.getInt$default(r9.XIi00iiXO(), 6, 2, null, 4, null));
        final BleKeyFlag r10 = BleKeyFlag.Companion.OXO1(r9.XIi00iiXO()[8]);
        i1O0OXO1O.OXO1.OXO1(this.this$0.getTAG() + " onCommandSendTimeout -> key=" + r0 + ", keyFlag=" + r10);
        BaseBleConnector.access$notifyHandlers(this.this$0, new OXX1(r0, r10));
        return;
    }
}
