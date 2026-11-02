package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.X01O0O1;
import com.android.mltcode.paycertificationapi.h77;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector$mBleMessenger$2$1$1;
import com.szabh.smable3.component.BleHandleCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseBleConnector$mBleMessenger$2$1$1 implements BleMessengerCallback {
    final /* synthetic */ BaseBleConnector this$0;

    public BaseBleConnector$mBleMessenger$2$1$1(BaseBleConnector baseBleConnector) {
        this.this$0 = baseBleConnector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTimeout$lambda$0(BleKey bleKey, BleKeyFlag bleKeyFlag, BleHandleCallback it) {
        Intrinsics.X0O(it, "it");
        it.onCommandSendTimeout(bleKey, bleKeyFlag);
        return Unit.OXO1;
    }

    @Override // com.szabh.smable3.component.BleMessengerCallback
    public void onRetry() {
        this.this$0.getMBleParser().reset();
    }

    @Override // com.szabh.smable3.component.BleMessengerCallback
    public void onTimeout(X01O0O1 message) {
        Intrinsics.X0O(message, "message");
        if (this.this$0.mBleStream != null) {
            this.this$0.getMBleMessenger().reset();
            this.this$0.setMBleStream(null);
        }
        if (message instanceof h77) {
            h77 h77Var = (h77) message;
            final BleKey bleKeyOXO1 = BleKey.Companion.OXO1(ByteArrayExtKt.getInt$default(h77Var.XIi00iiXO(), 6, 2, null, 4, null));
            final BleKeyFlag bleKeyFlagOXO1 = BleKeyFlag.Companion.OXO1(h77Var.XIi00iiXO()[8]);
            i1O0OXO1O.OXO1.OXO1(this.this$0.getTAG() + " onCommandSendTimeout -> key=" + bleKeyOXO1 + ", keyFlag=" + bleKeyFlagOXO1);
            this.this$0.notifyHandlers(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXX1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BaseBleConnector$mBleMessenger$2$1$1.onTimeout$lambda$0(bleKeyOXO1, bleKeyFlagOXO1, (BleHandleCallback) obj);
                }
            });
        }
    }
}
