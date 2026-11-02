package com.sma.smartv3.ui.device.dialpay;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.X10XiOi;
import com.android.mltcode.paycertificationapi.XOX0iIX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.OnlineWatchFaceKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveFragment;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class DialMoveActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private boolean isShowAiKeyPop;
    private final boolean isShowCustom;
    protected PayOnlineMoveFragment onlineFragment;

    @aa1
    private final Lazy table$delegate;

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ DialMoveActivity OXO1;

        public OXO1(DialMoveActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab r1) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab r3) {
            if (r3 == null) goto L4;
            CharSequence r4 = r3.getText();
        L6:
            if (Intrinsics.XOO0ii0(r4, this.OXO1.getString(R.string.aigc)) == true) goto L8;
            return;
        L8:
            if (DialMoveActivity.access$isShowAiKeyPop$p(this.OXO1) == true) goto L18;
            q62 r5 = q62.OXO1;
            if (r5.OIXOOi() == false) goto L12;
            return;
        L12:
            if (r5.O0() == false) goto L14;
            return;
        L14:
            if (TextUtils.isEmpty(r5.iIiiO()) == false) goto L21;
            UtilsKt.XXiO0i(DialMoveActivity.access$getMContext(this.OXO1));
            DialMoveActivity.access$setShowAiKeyPop$p(this.OXO1, true);
            return;
        L21:
            return;
        L18:
            return;
        L4:
            r4 = null;
            goto L6
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab r1) {
        }
    }

    public DialMoveActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new XOX0iIX(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new X10XiOi(this));
        if (q62.OXO1.IXiOXO() == true) goto L5;
    L7:
        boolean r0 = false;
    L8:
        this.isShowCustom = r0;
        return;
    L5:
        if (getMArg1() != (-1)) goto L7;
        r0 = true;
        goto L8
    }

    public static /* synthetic */ TabLayout I0iXXO(DialMoveActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(DialMoveActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(DialMoveActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ Activity access$getMContext(DialMoveActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ boolean access$isShowAiKeyPop$p(DialMoveActivity r0) {
        return r0.isShowAiKeyPop;
    }

    public static final /* synthetic */ void access$setShowAiKeyPop$p(DialMoveActivity r0, boolean r1) {
        r0.isShowAiKeyPop = r1;
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(DialMoveActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @aa1
    public final PayOnlineMoveFragment getOnlineFragment() {
        PayOnlineMoveFragment r0 = this.onlineFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("onlineFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        setOnlineFragment(new PayOnlineMoveFragment());
        PayOnlineMoveFragment r5 = getOnlineFragment();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", getMArg0());
        r5.setArguments(r0);
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.d(new Object[]{"initFragments type = " + getMArg1()});
        if (this.isShowCustom == false) goto L7;
        ArrayList r0 = new ArrayList();
        r0.add(getOnlineFragment());
        return r0;
    L7:
        return X0iO1XX.I0iXXO(getOnlineFragment());
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BleInitializer r0 = BleInitializer.IO;
        r0.i1iII1i1(true);
        r0.I1Ii(false);
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.dial_online)});
        if (getMArg0() == null) goto L10;
        String r1 = getMArg0();
        if (r1 != null) goto L7;
    L9:
        getAbhTitleCenter().setText(getMArg0());
    L11:
        getTable().setupWithViewPager(getMViewPager());
        getTable().addOnTabSelectedListener(new OXO1(this));
        return;
    L7:
        if (r1.length() != 0) goto L9;
    L10:
        getAbhTitleCenter().setText(getString(OnlineWatchFaceKt.getWatchFaceCategoryName(this, getMArg1())));
        goto L11
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_status_info_v2;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleInitializer r0 = BleInitializer.IO;
        r0.i1iII1i1(false);
        r0.I1Ii(false);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getOnlineFragment().isSync() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getOnlineFragment().isSync() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }

    public final void setOnlineFragment(@aa1 PayOnlineMoveFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.onlineFragment = r2;
    }
}
