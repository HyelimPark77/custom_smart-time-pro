package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.device.DeviceActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceActivity extends BaseFragmentPagerActivity {
    public DeviceFragment deviceFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O11OOO0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceActivity.table_delegate$lambda$0(this.f2678IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOOX00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceActivity.abhTitleCenter_delegate$lambda$0(this.f1845IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0iXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeviceActivity.abhTitleRight_delegate$lambda$0(this.f1281IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(DeviceActivity deviceActivity) {
        return (PFMedium) deviceActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(DeviceActivity deviceActivity) {
        return (ImageView) deviceActivity.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ void onUnbind$default(DeviceActivity deviceActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        deviceActivity.onUnbind(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(DeviceActivity deviceActivity) {
        return (TabLayout) deviceActivity.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @aa1
    public final DeviceFragment getDeviceFragment() {
        DeviceFragment deviceFragment = this.deviceFragment;
        if (deviceFragment != null) {
            return deviceFragment;
        }
        Intrinsics.XXO("deviceFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        a01.OXO1.XO0O10().put(b01.iXiX011, true);
        setDeviceFragment(new DeviceFragment());
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        return X0iO1XX.I0iXXO(getDeviceFragment());
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTable().setVisibility(8);
        getAbhTitleCenter().setText(R.string.bottom_device);
        getAbhTitleRight().setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_status_info;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @sf5(tag = I01XX0.X100O)
    public final void onUnbind(boolean z) {
        LogUtils.m11128d("onUnbind");
        if (i72.OXO1.XIIIO()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi1OX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3679IO.finish();
                }
            }, 100L);
        }
    }

    public final void setDeviceFragment(@aa1 DeviceFragment deviceFragment) {
        Intrinsics.X0O(deviceFragment, "<set-?>");
        this.deviceFragment = deviceFragment;
    }
}
