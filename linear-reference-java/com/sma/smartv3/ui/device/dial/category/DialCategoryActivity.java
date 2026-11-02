package com.sma.smartv3.ui.device.dial.category;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I1XI0011;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iiiXI0OO;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
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
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DialCategoryActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private AIGCFragment aigcFragment;
    private DialCustomizeFragment customizeFragment;
    private DialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private DialCategoryFragment onlineFragment;

    @aa1
    private final Lazy table$delegate;

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ DialCategoryActivity OXO1;

        public OXO1(DialCategoryActivity r1) {
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
            if (DialCategoryActivity.access$isShowAiKeyPop$p(this.OXO1) == true) goto L18;
            q62 r5 = q62.OXO1;
            if (r5.OIXOOi() == false) goto L12;
            return;
        L12:
            if (r5.O0() == false) goto L14;
            return;
        L14:
            if (TextUtils.isEmpty(r5.iIiiO()) == false) goto L21;
            UtilsKt.XXiO0i(DialCategoryActivity.access$getMContext(this.OXO1));
            DialCategoryActivity.access$setShowAiKeyPop$p(this.OXO1, true);
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

    public DialCategoryActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new iiiXI0OO(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new I1XI0011(this));
    }

    public static /* synthetic */ PFMedium I0iXXO(DialCategoryActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TabLayout OIX0iXi(DialCategoryActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(DialCategoryActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ Activity access$getMContext(DialCategoryActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ boolean access$isShowAiKeyPop$p(DialCategoryActivity r0) {
        return r0.isShowAiKeyPop;
    }

    public static final /* synthetic */ void access$setShowAiKeyPop$p(DialCategoryActivity r0, boolean r1) {
        r0.isShowAiKeyPop = r1;
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(DialCategoryActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        this.onlineFragment = new DialCategoryFragment();
        this.customizeFragment = new DialCustomizeFragment();
        this.aigcFragment = new AIGCFragment();
        this.dialRecordingFragment = new DialRecordingFragment();
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.d(new Object[]{"initFragments " + BleCache.INSTANCE.getMWatchFaceType()});
        q62 r0 = q62.OXO1;
        Object r3 = null;
        if (r0.IXiOXO() == false) goto L22;
        ArrayList r1 = new ArrayList();
        DialCategoryFragment r4 = this.onlineFragment;
        if (r4 != null) goto L7;
        Intrinsics.XXO("onlineFragment");
        r4 = null;
    L7:
        r1.add(r4);
        if (r0.i1iOO1XIi() == false) goto L13;
        AIGCFragment r2 = this.aigcFragment;
        if (r2 != null) goto L12;
        Intrinsics.XXO("aigcFragment");
        r2 = null;
    L12:
        r1.add(r2);
    L13:
        DialCustomizeFragment r5 = this.customizeFragment;
        if (r5 != null) goto L16;
        Intrinsics.XXO("customizeFragment");
        r5 = null;
    L16:
        r1.add(r5);
        DialRecordingFragment r6 = this.dialRecordingFragment;
        if (r6 != null) goto L19;
        Intrinsics.XXO("dialRecordingFragment");
    L20:
        r1.add(r3);
        return r1;
    L19:
        r3 = r6;
        goto L20
    L22:
        DialCategoryFragment r7 = this.onlineFragment;
        if (r7 != null) goto L25;
        Intrinsics.XXO("onlineFragment");
    L27:
        return X0iO1XX.I0iXXO(r3);
    L25:
        r3 = r7;
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
        q62 r3 = q62.OXO1;
        if (r3.i1iOO1XIi() == false) goto L5;
        String[] r4 = {getString(R.string.dial_online), getString(R.string.aigc), getString(R.string.dial_customize), getString(R.string.history_record)};
    L6:
        r1.setTitles(r4);
        getAbhTitleCenter().setText(OnlineWatchFaceKt.getWatchFaceCategoryName(getMContext(), 0));
        getTable().setupWithViewPager(getMViewPager());
        TabLayout r5 = getTable();
        if (r3.IXiOXO() == true) goto L10;
        r2 = 8;
    L10:
        r5.setVisibility(r2);
        getTable().addOnTabSelectedListener(new OXO1(this));
        return;
    L5:
        r4 = new String[]{getString(R.string.dial_online), getString(R.string.dial_customize), getString(R.string.history_record)};
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
        DialCategoryFragment r0 = this.onlineFragment;
        if (r0 != null) goto L6;
        Intrinsics.XXO("onlineFragment");
        r0 = null;
    L6:
        if (r0.isSync() == false) goto L9;
        ToastUtils.showLong(R.string.syncing);
        return;
    L9:
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        DialCategoryFragment r3 = this.onlineFragment;
        if (r3 != null) goto L6;
        Intrinsics.XXO("onlineFragment");
        r3 = null;
    L6:
        if (r3.isSync() == false) goto L9;
        ToastUtils.showLong(R.string.syncing);
        return;
    L9:
        finish();
    }
}
