package com.sma.smartv3.ui.device.watchface;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tm6;
import com.android.mltcode.paycertificationapi.um6;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.OnlineWatchFaceKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.AIGCFragment;
import com.sma.smartv3.ui.device.dial.DialCustomizeFragment;
import com.sma.smartv3.ui.device.dial.DialRecordingFragment;
import com.sma.smartv3.ui.device.watchface.fragment.OnlineWatchFaceFragment;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchFaceActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private AIGCFragment aigcFragment;
    private DialCustomizeFragment customizeFragment;
    private DialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private final boolean isShowCustom;
    private OnlineWatchFaceFragment onlineFragment;

    @aa1
    private final Lazy table$delegate;

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ WatchFaceActivity OXO1;

        public OXO1(WatchFaceActivity r1) {
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
            if (WatchFaceActivity.access$isShowAiKeyPop$p(this.OXO1) == true) goto L18;
            q62 r5 = q62.OXO1;
            if (r5.OIXOOi() == false) goto L12;
            return;
        L12:
            if (r5.O0() == false) goto L14;
            return;
        L14:
            if (TextUtils.isEmpty(r5.iIiiO()) == false) goto L21;
            UtilsKt.XXiO0i(WatchFaceActivity.access$getMContext(this.OXO1));
            WatchFaceActivity.access$setShowAiKeyPop$p(this.OXO1, true);
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

    public WatchFaceActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new tm6(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new um6(this));
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

    public static /* synthetic */ TabLayout I0iXXO(WatchFaceActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(WatchFaceActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ Activity access$getMContext(WatchFaceActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ boolean access$isShowAiKeyPop$p(WatchFaceActivity r0) {
        return r0.isShowAiKeyPop;
    }

    public static final /* synthetic */ void access$setShowAiKeyPop$p(WatchFaceActivity r0, boolean r1) {
        r0.isShowAiKeyPop = r1;
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(WatchFaceActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        this.onlineFragment = new OnlineWatchFaceFragment();
        this.customizeFragment = new DialCustomizeFragment();
        this.aigcFragment = new AIGCFragment();
        this.dialRecordingFragment = new DialRecordingFragment();
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.d(new Object[]{"initFragments type = " + getMArg1()});
        Object r2 = null;
        if (this.isShowCustom == false) goto L22;
        ArrayList r0 = new ArrayList();
        OnlineWatchFaceFragment r3 = this.onlineFragment;
        if (r3 != null) goto L7;
        Intrinsics.XXO("onlineFragment");
        r3 = null;
    L7:
        r0.add(r3);
        if (q62.OXO1.i1iOO1XIi() == false) goto L13;
        AIGCFragment r1 = this.aigcFragment;
        if (r1 != null) goto L12;
        Intrinsics.XXO("aigcFragment");
        r1 = null;
    L12:
        r0.add(r1);
    L13:
        DialCustomizeFragment r4 = this.customizeFragment;
        if (r4 != null) goto L16;
        Intrinsics.XXO("customizeFragment");
        r4 = null;
    L16:
        r0.add(r4);
        DialRecordingFragment r5 = this.dialRecordingFragment;
        if (r5 != null) goto L19;
        Intrinsics.XXO("dialRecordingFragment");
    L20:
        r0.add(r2);
        return r0;
    L19:
        r2 = r5;
        goto L20
    L22:
        OnlineWatchFaceFragment r6 = this.onlineFragment;
        if (r6 != null) goto L25;
        Intrinsics.XXO("onlineFragment");
    L27:
        return X0iO1XX.I0iXXO(r2);
    L25:
        r2 = r6;
        goto L27
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        BleInitializer r0 = BleInitializer.IO;
        r0.i1iII1i1(true);
        int r2 = 0;
        r0.I1Ii(false);
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        BaseFragmentPagerAdapter r1 = getMFragmentPagerAdapter();
        if (q62.OXO1.i1iOO1XIi() == false) goto L5;
        String[] r3 = {getString(R.string.dial_online), getString(R.string.aigc), getString(R.string.dial_customize), getString(R.string.history_record)};
    L6:
        r1.setTitles(r3);
        getAbhTitleCenter().setText(getString(OnlineWatchFaceKt.getWatchFaceCategoryName(this, getMArg1())));
        getTable().setupWithViewPager(getMViewPager());
        TabLayout r4 = getTable();
        if (this.isShowCustom == true) goto L10;
        r2 = 8;
    L10:
        r4.setVisibility(r2);
        getTable().addOnTabSelectedListener(new OXO1(this));
        return;
    L5:
        r3 = new String[]{getString(R.string.dial_online), getString(R.string.dial_customize), getString(R.string.history_record)};
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_status_info;
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
        OnlineWatchFaceFragment r0 = this.onlineFragment;
        if (r0 != null) goto L6;
        Intrinsics.XXO("onlineFragment");
        r0 = null;
    L6:
        if (r0.isSync() == false) goto L8;
    L12:
        ToastUtils.showLong(R.string.syncing);
        return;
    L8:
        if (BleInitializer.IO.i0X1iIO() == true) goto L12;
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        OnlineWatchFaceFragment r3 = this.onlineFragment;
        if (r3 != null) goto L6;
        Intrinsics.XXO("onlineFragment");
        r3 = null;
    L6:
        if (r3.isSync() == false) goto L8;
    L12:
        ToastUtils.showLong(R.string.syncing);
        return;
    L8:
        if (BleInitializer.IO.i0X1iIO() == true) goto L12;
        finish();
    }
}
