package com.sma.smartv3.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPurchaseTipsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseTipsActivity.kt\ncom/sma/smartv3/ui/main/PurchaseTipsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n69#2,3:45\n72#2,5:49\n1#3:48\n*S KotlinDebug\n*F\n+ 1 PurchaseTipsActivity.kt\ncom/sma/smartv3/ui/main/PurchaseTipsActivity\n*L\n38#1:45,3\n38#1:49,5\n38#1:48\n*E\n"})
public final class PurchaseTipsActivity extends BaseActivity {
    public PurchaseTipsActivity() {
    }

    private final void toMain() {
        startActivity(new Intent(this, MainActivity.class));
        I01XX0.XIi00iiXO(I01XX0.Ii0X0X, null, 2, null);
        finish();
    }

    public final void confirmClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        toMain();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_purchase_tip;
    }

    public final void noRemindClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        a01.OXO1.OXO1().put(b01.O10IXXX0X, false);
        toMain();
    }
}
