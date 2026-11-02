package com.sma.smartv3.p610ui.device.dialpay;

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
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.model.OnlineWatchFaceKt;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.p610ui.device.dial.DialCustomizeFragment;
import com.sma.smartv3.p610ui.device.dialpay.WatchFaceDialPayActivity;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayAIGCFragment;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayDialRecordingFragment;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayOnlineWatchFaceFragment;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWatchFaceDialPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n93#2,2:180\n90#2:182\n87#3,7:183\n94#3,3:191\n70#3,7:194\n97#3:201\n1#4:190\n*S KotlinDebug\n*F\n+ 1 WatchFaceDialPayActivity.kt\ncom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayActivity\n*L\n121#1:180,2\n121#1:182\n133#1:183,7\n133#1:191,3\n133#1:194,7\n133#1:201\n133#1:190\n*E\n"})
public final class WatchFaceDialPayActivity extends BaseFragmentPagerActivity {
    private PayAIGCFragment aigcFragment;
    private DialCustomizeFragment customizeFragment;
    private PayDialRecordingFragment dialRecordingFragment;
    private boolean isShowAiKeyPop;
    private final boolean isShowCustom;
    private PayOnlineWatchFaceFragment onlineFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayActivity.table_delegate$lambda$0(this.f11773IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wn6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WatchFaceDialPayActivity.abhTitleCenter_delegate$lambda$0(this.f12001IO);
        }
    });

    public WatchFaceDialPayActivity() {
        this.isShowCustom = q62.OXO1.IXiOXO() && getMArg1() == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WatchFaceDialPayActivity watchFaceDialPayActivity) {
        return (PFMedium) watchFaceDialPayActivity.findViewById(R.id.abh_title_center);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAILackingTip$lambda$0$0(WatchFaceDialPayActivity watchFaceDialPayActivity) {
        OrderManager orderManager = OrderManager.OXO1;
        String strX11iII1O1 = OrderManager.X11iII1O1(orderManager, null, orderManager.iOO1ii1(), 1, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strX11iII1O1);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(watchFaceDialPayActivity, (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        watchFaceDialPayActivity.startActivity(intent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(WatchFaceDialPayActivity watchFaceDialPayActivity) {
        return (TabLayout) watchFaceDialPayActivity.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.onlineFragment = new PayOnlineWatchFaceFragment();
        this.customizeFragment = new DialCustomizeFragment();
        this.aigcFragment = new PayAIGCFragment();
        this.dialRecordingFragment = new PayDialRecordingFragment();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        LogUtils.m11128d("initFragments type = " + getMArg1());
        Object obj = null;
        if (!this.isShowCustom) {
            PayOnlineWatchFaceFragment payOnlineWatchFaceFragment = this.onlineFragment;
            if (payOnlineWatchFaceFragment == null) {
                Intrinsics.XXO("onlineFragment");
            } else {
                obj = payOnlineWatchFaceFragment;
            }
            return X0iO1XX.I0iXXO(obj);
        }
        ArrayList arrayList = new ArrayList();
        PayOnlineWatchFaceFragment payOnlineWatchFaceFragment2 = this.onlineFragment;
        if (payOnlineWatchFaceFragment2 == null) {
            Intrinsics.XXO("onlineFragment");
            payOnlineWatchFaceFragment2 = null;
        }
        arrayList.add(payOnlineWatchFaceFragment2);
        if (q62.OXO1.i1iOO1XIi()) {
            PayAIGCFragment payAIGCFragment = this.aigcFragment;
            if (payAIGCFragment == null) {
                Intrinsics.XXO("aigcFragment");
                payAIGCFragment = null;
            }
            arrayList.add(payAIGCFragment);
        }
        DialCustomizeFragment dialCustomizeFragment = this.customizeFragment;
        if (dialCustomizeFragment == null) {
            Intrinsics.XXO("customizeFragment");
            dialCustomizeFragment = null;
        }
        arrayList.add(dialCustomizeFragment);
        PayDialRecordingFragment payDialRecordingFragment = this.dialRecordingFragment;
        if (payDialRecordingFragment == null) {
            Intrinsics.XXO("dialRecordingFragment");
        } else {
            obj = payDialRecordingFragment;
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
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.un6
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InstantiationException {
                this.f11535IO.showAILackingTip();
            }
        }, 1800L);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_status_info;
    }

    @sf5(tag = I01XX0.O1iXiI)
    public final void onChangedIndex(int i) {
        if (getMViewPager().getChildCount() <= i || getMViewPager().getCurrentItem() == i) {
            return;
        }
        getMViewPager().setCurrentItem(i);
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
        if (BleInitializer.f51208IO.i0X1iIO()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            super.onHandleBackPressed();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (BleInitializer.f51208IO.i0X1iIO()) {
            ToastUtils.showLong(R.string.syncing);
        } else {
            finish();
        }
    }

    public final void showAILackingTip() throws IllegalAccessException, InstantiationException {
        i72 i72Var = i72.OXO1;
        if (i72Var.IIII0iI() && i72Var.IOX1() && i72Var.IOI0i0I() && i72Var.OXi001()) {
            a01 a01Var = a01.OXO1;
            long j = a01Var.IiI10X().getLong(b01.IOIi00, 0L);
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
            if (objFromJson == null) {
                objFromJson = UserMember.class.newInstance();
            }
            UserMember userMember = (UserMember) objFromJson;
            i1O0OXO1O.OXO1.OXO1("WatchFaceDialPayActivity showAILackingTip  mIsShowTime = " + j + " mUserMember = " + userMember);
            if (userMember.getLatestDateTime() > 0) {
                OrderManager orderManager = OrderManager.OXO1;
                if (OrderManager.O00(orderManager, userMember.getLatestDateTime(), 0, 2, null) && orderManager.IiI10X(j, 1)) {
                    a01Var.IiI10X().put(b01.IOIi00, System.currentTimeMillis());
                    go0 go0Var = new go0(this, 0, 2, null);
                    go0Var.O1O(R.string.tip);
                    go0Var.m1865iX(Integer.valueOf(R.string.ai_benefits_about_expire));
                    go0Var.IXXOO(1);
                    go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
                    go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.xn6
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2() {
                            return Boolean.valueOf(WatchFaceDialPayActivity.showAILackingTip$lambda$0$0(this.f12204IO));
                        }
                    });
                    go0Var.IIX1OXO();
                }
            }
        }
    }
}
