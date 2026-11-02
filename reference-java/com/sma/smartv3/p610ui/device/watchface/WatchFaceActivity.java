package com.sma.smartv3.p610ui.device.watchface;

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
import com.sma.smartv3.p610ui.device.dial.AIGCFragment;
import com.sma.smartv3.p610ui.device.dial.DialCustomizeFragment;
import com.sma.smartv3.p610ui.device.dial.DialRecordingFragment;
import com.sma.smartv3.p610ui.device.watchface.WatchFaceActivity;
import com.sma.smartv3.p610ui.device.watchface.fragment.OnlineWatchFaceFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceActivity extends BaseFragmentPagerActivity {
    private AIGCFragment aigcFragment;
    private DialCustomizeFragment customizeFragment;
    private DialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private final boolean isShowCustom;
    private OnlineWatchFaceFragment onlineFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tm6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceActivity.table_delegate$lambda$0(this.f11288IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.um6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceActivity.abhTitleCenter_delegate$lambda$0(this.f11525IO);
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
            if (!Intrinsics.XOO0ii0(tab != null ? tab.getText() : null, WatchFaceActivity.this.getString(R.string.aigc)) || WatchFaceActivity.this.isShowAiKeyPop) {
                return;
            }
            q62 q62Var = q62.OXO1;
            if (q62Var.OIXOOi() || q62Var.m2880O0() || !TextUtils.isEmpty(q62Var.iIiiO())) {
                return;
            }
            UtilsKt.XXiO0i(WatchFaceActivity.this.getMContext());
            WatchFaceActivity.this.isShowAiKeyPop = true;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public WatchFaceActivity() {
        this.isShowCustom = q62.OXO1.IXiOXO() && getMArg1() == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceActivity watchFaceActivity) {
        return (PFMedium) watchFaceActivity.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(WatchFaceActivity watchFaceActivity) {
        return (TabLayout) watchFaceActivity.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.onlineFragment = new OnlineWatchFaceFragment();
        this.customizeFragment = new DialCustomizeFragment();
        this.aigcFragment = new AIGCFragment();
        this.dialRecordingFragment = new DialRecordingFragment();
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.m11128d("initFragments type = " + getMArg1());
        Object obj = null;
        if (!this.isShowCustom) {
            OnlineWatchFaceFragment onlineWatchFaceFragment = this.onlineFragment;
            if (onlineWatchFaceFragment == null) {
                Intrinsics.XXO("onlineFragment");
            } else {
                obj = onlineWatchFaceFragment;
            }
            return X0iO1XX.I0iXXO(obj);
        }
        ArrayList arrayList = new ArrayList();
        OnlineWatchFaceFragment onlineWatchFaceFragment2 = this.onlineFragment;
        if (onlineWatchFaceFragment2 == null) {
            Intrinsics.XXO("onlineFragment");
            onlineWatchFaceFragment2 = null;
        }
        arrayList.add(onlineWatchFaceFragment2);
        if (q62.OXO1.i1iOO1XIi()) {
            AIGCFragment aIGCFragment = this.aigcFragment;
            if (aIGCFragment == null) {
                Intrinsics.XXO("aigcFragment");
                aIGCFragment = null;
            }
            arrayList.add(aIGCFragment);
        }
        DialCustomizeFragment dialCustomizeFragment = this.customizeFragment;
        if (dialCustomizeFragment == null) {
            Intrinsics.XXO("customizeFragment");
            dialCustomizeFragment = null;
        }
        arrayList.add(dialCustomizeFragment);
        DialRecordingFragment dialRecordingFragment = this.dialRecordingFragment;
        if (dialRecordingFragment == null) {
            Intrinsics.XXO("dialRecordingFragment");
        } else {
            obj = dialRecordingFragment;
        }
        arrayList.add(obj);
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        BleInitializer bleInitializer = BleInitializer.f51208IO;
        bleInitializer.i1iII1i1(true);
        bleInitializer.I1Ii(false);
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(q62.OXO1.i1iOO1XIi() ? new String[]{getString(R.string.dial_online), getString(R.string.aigc), getString(R.string.dial_customize), getString(R.string.history_record)} : new String[]{getString(R.string.dial_online), getString(R.string.dial_customize), getString(R.string.history_record)});
        getAbhTitleCenter().setText(getString(OnlineWatchFaceKt.getWatchFaceCategoryName(this, getMArg1())));
        getTable().setupWithViewPager(getMViewPager());
        getTable().setVisibility(this.isShowCustom ? 0 : 8);
        getTable().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new OXO1());
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
        OnlineWatchFaceFragment onlineWatchFaceFragment = this.onlineFragment;
        if (onlineWatchFaceFragment == null) {
            Intrinsics.XXO("onlineFragment");
            onlineWatchFaceFragment = null;
        }
        if (onlineWatchFaceFragment.isSync() || BleInitializer.f51208IO.i0X1iIO()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            super.onHandleBackPressed();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        OnlineWatchFaceFragment onlineWatchFaceFragment = this.onlineFragment;
        if (onlineWatchFaceFragment == null) {
            Intrinsics.XXO("onlineFragment");
            onlineWatchFaceFragment = null;
        }
        if (onlineWatchFaceFragment.isSync() || BleInitializer.f51208IO.i0X1iIO()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            finish();
        }
    }
}
