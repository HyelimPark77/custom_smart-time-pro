package com.sma.smartv3.ui.device.dial;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I0O1XXI;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.XOX1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
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
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class DialActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    protected AIGCFragment aigcFragment;
    protected DialCustomizeFragment customizeFragment;
    protected DialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private boolean isShowCustom;
    protected DialOnlineFragment onlineFragment;

    @aa1
    private final Lazy table$delegate;

    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ DialActivity OXO1;

        public OXO1(DialActivity r1) {
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
            if (this.OXO1.isShowAiKeyPop() == true) goto L18;
            q62 r5 = q62.OXO1;
            if (r5.OIXOOi() == false) goto L12;
            return;
        L12:
            if (r5.O0() == false) goto L14;
            return;
        L14:
            if (TextUtils.isEmpty(r5.iIiiO()) == false) goto L21;
            UtilsKt.XXiO0i(DialActivity.access$getMContext(this.OXO1));
            this.OXO1.setShowAiKeyPop(true);
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

    public DialActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new I0O1XXI(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new XOX1X(this));
    }

    public static /* synthetic */ TabLayout I0iXXO(DialActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(DialActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(DialActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    public static final /* synthetic */ Activity access$getMContext(DialActivity r0) {
        return r0.getMContext();
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(DialActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @aa1
    public final AIGCFragment getAigcFragment() {
        AIGCFragment r0 = this.aigcFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("aigcFragment");
        return null;
    }

    @aa1
    public final DialCustomizeFragment getCustomizeFragment() {
        DialCustomizeFragment r0 = this.customizeFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("customizeFragment");
        return null;
    }

    @aa1
    public final DialRecordingFragment getDialRecordingFragment() {
        DialRecordingFragment r0 = this.dialRecordingFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("dialRecordingFragment");
        return null;
    }

    @aa1
    public final DialOnlineFragment getOnlineFragment() {
        DialOnlineFragment r0 = this.onlineFragment;
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
    public void init(@tb1 Bundle r2) {
        setOnlineFragment(new DialOnlineFragment());
        setCustomizeFragment(new DialCustomizeFragment());
        setAigcFragment(new AIGCFragment());
        setDialRecordingFragment(new DialRecordingFragment());
        if (q62.OXO1.IXiOXO() == true) goto L5;
    L7:
        boolean r3 = false;
    L8:
        this.isShowCustom = r3;
        return;
    L5:
        if (getMArg1() != (-1)) goto L7;
        r3 = true;
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.d(new Object[]{"initFragments type = " + getMArg1()});
        if (this.isShowCustom == false) goto L10;
        ArrayList r0 = new ArrayList();
        r0.add(getOnlineFragment());
        if (q62.OXO1.i1iOO1XIi() == false) goto L7;
        r0.add(getAigcFragment());
    L7:
        r0.add(getCustomizeFragment());
        r0.add(getDialRecordingFragment());
        return r0;
    L10:
        return X0iO1XX.I0iXXO(getOnlineFragment());
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
        TabLayout r4 = getTable();
        if (this.isShowCustom == true) goto L10;
        r2 = 8;
    L10:
        r4.setVisibility(r2);
        if (getMArg0() == null) goto L18;
        String r5 = getMArg0();
        if (r5 != null) goto L15;
    L17:
        getAbhTitleCenter().setText(getMArg0());
    L19:
        getTable().setupWithViewPager(getMViewPager());
        getTable().addOnTabSelectedListener(new OXO1(this));
        return;
    L15:
        if (r5.length() != 0) goto L17;
    L18:
        getAbhTitleCenter().setText(getString(OnlineWatchFaceKt.getWatchFaceCategoryName(this, getMArg1())));
        goto L19
    L5:
        r3 = new String[]{getString(R.string.dial_online), getString(R.string.dial_customize), getString(R.string.history_record)};
        goto L6
    }

    public final boolean isShowAiKeyPop() {
        return this.isShowAiKeyPop;
    }

    public final boolean isShowCustom() {
        return this.isShowCustom;
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

    public final void setAigcFragment(@aa1 AIGCFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.aigcFragment = r2;
    }

    public final void setCustomizeFragment(@aa1 DialCustomizeFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.customizeFragment = r2;
    }

    public final void setDialRecordingFragment(@aa1 DialRecordingFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dialRecordingFragment = r2;
    }

    public final void setOnlineFragment(@aa1 DialOnlineFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.onlineFragment = r2;
    }

    public final void setShowAiKeyPop(boolean r1) {
        this.isShowAiKeyPop = r1;
    }

    public final void setShowCustom(boolean r1) {
        this.isShowCustom = r1;
    }
}
