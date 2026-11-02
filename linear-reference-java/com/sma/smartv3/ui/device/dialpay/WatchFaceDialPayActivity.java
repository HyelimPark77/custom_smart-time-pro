package com.sma.smartv3.ui.device.dialpay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.un6;
import com.android.mltcode.paycertificationapi.vn6;
import com.android.mltcode.paycertificationapi.wn6;
import com.android.mltcode.paycertificationapi.xn6;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerAdapter;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.OnlineWatchFaceKt;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.DialCustomizeFragment;
import com.sma.smartv3.ui.device.dialpay.fragment.PayAIGCFragment;
import com.sma.smartv3.ui.device.dialpay.fragment.PayDialRecordingFragment;
import com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineWatchFaceFragment;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWatchFaceDialPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n93#2,2:180\n90#2:182\n87#3,7:183\n94#3,3:191\n70#3,7:194\n97#3:201\n1#4:190\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n*L\n121#1:180,2\n121#1:182\n133#1:183,7\n133#1:191,3\n133#1:194,7\n133#1:201\n133#1:190\n*E\n"})
public final class WatchFaceDialPayActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private PayAIGCFragment aigcFragment;
    private DialCustomizeFragment customizeFragment;
    private PayDialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private final boolean isShowCustom;
    private PayOnlineWatchFaceFragment onlineFragment;

    @aa1
    private final Lazy table$delegate;

    public WatchFaceDialPayActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new vn6(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new wn6(this));
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

    public static /* synthetic */ TabLayout I0iXXO(WatchFaceDialPayActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(WatchFaceDialPayActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(WatchFaceDialPayActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ boolean XXI(WatchFaceDialPayActivity r0) {
        return showAILackingTip$lambda$0$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceDialPayActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private static final void initView$lambda$0(WatchFaceDialPayActivity r0) {
        r0.showAILackingTip();
    }

    private static final boolean showAILackingTip$lambda$0$0(WatchFaceDialPayActivity r5) {
        OrderManager r0 = OrderManager.OXO1;
        String r1 = OrderManager.X11iII1O1(r0, null, r0.iOO1ii1(), 1, null);
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r1);
        r2.putInt("mArg1", 2);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r3 = new Intent(r5, GoogleWebViewActivity.class);
        r3.putExtras(r2);
        r5.startActivity(r3);
        return true;
    }

    private static final TabLayout table_delegate$lambda$0(WatchFaceDialPayActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        this.onlineFragment = new PayOnlineWatchFaceFragment();
        this.customizeFragment = new DialCustomizeFragment();
        this.aigcFragment = new PayAIGCFragment();
        this.dialRecordingFragment = new PayDialRecordingFragment();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.d(new Object[]{"initFragments type = " + getMArg1()});
        Object r2 = null;
        if (this.isShowCustom == false) goto L22;
        ArrayList r0 = new ArrayList();
        PayOnlineWatchFaceFragment r3 = this.onlineFragment;
        if (r3 != null) goto L7;
        Intrinsics.XXO("onlineFragment");
        r3 = null;
    L7:
        r0.add(r3);
        if (q62.OXO1.i1iOO1XIi() == false) goto L13;
        PayAIGCFragment r1 = this.aigcFragment;
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
        PayDialRecordingFragment r5 = this.dialRecordingFragment;
        if (r5 != null) goto L19;
        Intrinsics.XXO("dialRecordingFragment");
    L20:
        r0.add(r2);
        return r0;
    L19:
        r2 = r5;
        goto L20
    L22:
        PayOnlineWatchFaceFragment r6 = this.onlineFragment;
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
        new Handler(Looper.getMainLooper()).postDelayed(new un6(this), 1800);
        return;
    L5:
        r3 = new String[]{getString(R.string.dial_online), getString(R.string.dial_customize), getString(R.string.history_record)};
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_status_info;
    }

    @sf5(tag = I01XX0.O1iXiI)
    public final void onChangedIndex(int r2) {
        if (getMViewPager().getChildCount() > r2) goto L5;
        return;
    L5:
        if (getMViewPager().getCurrentItem() == r2) goto L9;
        getMViewPager().setCurrentItem(r2);
        return;
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
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        super.onHandleBackPressed();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (BleInitializer.IO.i0X1iIO() == false) goto L6;
        ToastUtils.showLong(R.string.syncing);
        return;
    L6:
        finish();
    }

    public final void showAILackingTip() {
        i72 r0 = i72.OXO1;
        if (r0.IIII0iI() == true) goto L5;
        return;
    L5:
        if (r0.IOX1() == true) goto L7;
        return;
    L7:
        if (r0.IOI0i0I() == true) goto L9;
        return;
    L9:
        if (r0.OXi001() == false) goto L24;
        a01 r1 = a01.OXO1;
        long r5 = r1.IiI10X().getLong(b01.IOIi00, 0);
        SPUtils r2 = r1.IiI10X();
        Object r3 = new Gson().fromJson(r2.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r3 != null) goto L13;
        r3 = UserMember.class.newInstance();
    L13:
        UserMember r4 = (UserMember) r3;
        i1O0OXO1O.OXO1.OXO1("WatchFaceDialPayActivity showAILackingTip  mIsShowTime = " + r5 + " mUserMember = " + r4);
        if (r4.getLatestDateTime() <= 0) goto L25;
        OrderManager r7 = OrderManager.OXO1;
        if (OrderManager.O00(r7, r4.getLatestDateTime(), 0, 2, null) == true) goto L18;
        return;
    L18:
        if (r7.IiI10X(r5, 1) == false) goto L27;
        r1.IiI10X().put(b01.IOIi00, System.currentTimeMillis());
        go0 r6 = new go0(this, 0, 2, null);
        r6.O1O(R.string.tip);
        r6.iX(Integer.valueOf(R.string.ai_benefits_about_expire));
        r6.IXXOO(1);
        go0.X11iII1O1(r6, Integer.valueOf(R.string.cancel), null, 2, null);
        r6.X1IX(R.string.confirm, new xn6(this));
        r6.IIX1OXO();
        return;
    L27:
        return;
    L25:
        return;
    }
}
