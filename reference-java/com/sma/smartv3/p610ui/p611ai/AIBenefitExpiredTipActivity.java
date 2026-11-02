package com.sma.smartv3.p610ui.p611ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIBenefitExpiredTipActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIBenefitExpiredTipActivity.kt\ncom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n87#2,7:32\n94#2,3:40\n70#2,7:43\n97#2:50\n1#3:39\n*S KotlinDebug\n*F\n+ 1 AIBenefitExpiredTipActivity.kt\ncom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity\n*L\n27#1:32,7\n27#1:40,3\n27#1:43,7\n27#1:50\n27#1:39\n*E\n"})
public final class AIBenefitExpiredTipActivity extends BaseActivity {
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        transparentNavBar();
        transparentStatusBar();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_benefit_expired_tip;
    }

    public final void onBenefitExpiredBtn(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strX11iII1O1);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }
}
