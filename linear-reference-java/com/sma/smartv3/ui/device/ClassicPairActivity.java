package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.guide.ClassicPairGuide2Fragment;
import com.szabh.smable3.component.BleConnector;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nClassicPairActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicPairActivity.kt\ncom/sma/smartv3/ui/device/ClassicPairActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n1#1,36:1\n98#2,4:37\n*S KotlinDebug\n*F\n+ 1 ClassicPairActivity.kt\ncom/sma/smartv3/ui/device/ClassicPairActivity\n*L\n24#1:37,4\n*E\n"})
public final class ClassicPairActivity extends BaseActivity {
    public ClassicPairActivity() {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        FragmentTransaction r0 = getSupportFragmentManager().beginTransaction();
        BaseFragment.OXO1 r1 = BaseFragment.Companion;
        BaseFragment r2 = (BaseFragment) ClassicPairGuide2Fragment.class.newInstance();
        r2.setArguments(null);
        if (r2 == null) goto L9;
        r0.add(R.id.content, (ClassicPairGuide2Fragment) r2).commit();
        if (BleConnector.INSTANCE.isBoundClassic() == false) goto L10;
        ToastUtils.showLong("3.0 " + getString(R.string.bind_success), new Object[0]);
        return;
    L10:
        return;
    L9:
        throw new NullPointerException("null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.ClassicPairGuide2Fragment");
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_classic_pair;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
