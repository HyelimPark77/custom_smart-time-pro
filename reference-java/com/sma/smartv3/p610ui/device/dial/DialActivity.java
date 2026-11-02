package com.sma.smartv3.p610ui.device.dial;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.X0iO1XX;
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
import com.sma.smartv3.p610ui.device.dial.DialActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class DialActivity extends BaseFragmentPagerActivity {
    protected AIGCFragment aigcFragment;
    protected DialCustomizeFragment customizeFragment;
    protected DialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private boolean isShowCustom;
    protected DialOnlineFragment onlineFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0O1XXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialActivity.table_delegate$lambda$0(this.f1154IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOX1X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DialActivity.abhTitleCenter_delegate$lambda$0(this.f4853IO);
        }
    });

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public OXO1() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (!Intrinsics.XOO0ii0(tab != null ? tab.getText() : null, DialActivity.this.getString(R.string.aigc)) || DialActivity.this.isShowAiKeyPop()) {
                return;
            }
            q62 q62Var = q62.OXO1;
            if (q62Var.OIXOOi() || q62Var.m2880O0() || !TextUtils.isEmpty(q62Var.iIiiO())) {
                return;
            }
            UtilsKt.XXiO0i(DialActivity.this.getMContext());
            DialActivity.this.setShowAiKeyPop(true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(DialActivity dialActivity) {
        return (PFMedium) dialActivity.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(DialActivity dialActivity) {
        return (TabLayout) dialActivity.findViewById(R.id.table);
    }

    @aa1
    public final AIGCFragment getAigcFragment() {
        AIGCFragment aIGCFragment = this.aigcFragment;
        if (aIGCFragment != null) {
            return aIGCFragment;
        }
        Intrinsics.XXO("aigcFragment");
        return null;
    }

    @aa1
    public final DialCustomizeFragment getCustomizeFragment() {
        DialCustomizeFragment dialCustomizeFragment = this.customizeFragment;
        if (dialCustomizeFragment != null) {
            return dialCustomizeFragment;
        }
        Intrinsics.XXO("customizeFragment");
        return null;
    }

    @aa1
    public final DialRecordingFragment getDialRecordingFragment() {
        DialRecordingFragment dialRecordingFragment = this.dialRecordingFragment;
        if (dialRecordingFragment != null) {
            return dialRecordingFragment;
        }
        Intrinsics.XXO("dialRecordingFragment");
        return null;
    }

    @aa1
    public final DialOnlineFragment getOnlineFragment() {
        DialOnlineFragment dialOnlineFragment = this.onlineFragment;
        if (dialOnlineFragment != null) {
            return dialOnlineFragment;
        }
        Intrinsics.XXO("onlineFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setOnlineFragment(new DialOnlineFragment());
        setCustomizeFragment(new DialCustomizeFragment());
        setAigcFragment(new AIGCFragment());
        setDialRecordingFragment(new DialRecordingFragment());
        this.isShowCustom = q62.OXO1.IXiOXO() && getMArg1() == -1;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.m11128d("initFragments type = " + getMArg1());
        if (!this.isShowCustom) {
            return X0iO1XX.I0iXXO(getOnlineFragment());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getOnlineFragment());
        if (q62.OXO1.i1iOO1XIi()) {
            arrayList.add(getAigcFragment());
        }
        arrayList.add(getCustomizeFragment());
        arrayList.add(getDialRecordingFragment());
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String mArg0;
        super.initView();
        BleInitializer bleInitializer = BleInitializer.f51208IO;
        bleInitializer.i1iII1i1(true);
        bleInitializer.I1Ii(false);
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(q62.OXO1.i1iOO1XIi() ? new String[]{getString(R.string.dial_online), getString(R.string.aigc), getString(R.string.dial_customize), getString(R.string.history_record)} : new String[]{getString(R.string.dial_online), getString(R.string.dial_customize), getString(R.string.history_record)});
        getTable().setVisibility(this.isShowCustom ? 0 : 8);
        if (getMArg0() == null || ((mArg0 = getMArg0()) != null && mArg0.length() == 0)) {
            getAbhTitleCenter().setText(getString(OnlineWatchFaceKt.getWatchFaceCategoryName(this, getMArg1())));
        } else {
            getAbhTitleCenter().setText(getMArg0());
        }
        getTable().setupWithViewPager(getMViewPager());
        getTable().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new OXO1());
    }

    public final boolean isShowAiKeyPop() {
        return this.isShowAiKeyPop;
    }

    public final boolean isShowCustom() {
        return this.isShowCustom;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_status_info;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BleInitializer bleInitializer = BleInitializer.f51208IO;
        bleInitializer.i1iII1i1(false);
        bleInitializer.I1Ii(false);
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getOnlineFragment().isSync()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            super.onHandleBackPressed();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getOnlineFragment().isSync()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            finish();
        }
    }

    public final void setAigcFragment(@aa1 AIGCFragment aIGCFragment) {
        Intrinsics.X0O(aIGCFragment, "<set-?>");
        this.aigcFragment = aIGCFragment;
    }

    public final void setCustomizeFragment(@aa1 DialCustomizeFragment dialCustomizeFragment) {
        Intrinsics.X0O(dialCustomizeFragment, "<set-?>");
        this.customizeFragment = dialCustomizeFragment;
    }

    public final void setDialRecordingFragment(@aa1 DialRecordingFragment dialRecordingFragment) {
        Intrinsics.X0O(dialRecordingFragment, "<set-?>");
        this.dialRecordingFragment = dialRecordingFragment;
    }

    public final void setOnlineFragment(@aa1 DialOnlineFragment dialOnlineFragment) {
        Intrinsics.X0O(dialOnlineFragment, "<set-?>");
        this.onlineFragment = dialOnlineFragment;
    }

    public final void setShowAiKeyPop(boolean z) {
        this.isShowAiKeyPop = z;
    }

    public final void setShowCustom(boolean z) {
        this.isShowCustom = z;
    }
}
