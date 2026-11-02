package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iXX;
import com.android.mltcode.paycertificationapi.IOOX00;
import com.android.mltcode.paycertificationapi.O11OOO0i;
import com.android.mltcode.paycertificationapi.Oi1OX;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    public DeviceFragment deviceFragment;

    @aa1
    private final Lazy table$delegate;

    public DeviceActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new O11OOO0i(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new IOOX00(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new I0iXX(this));
    }

    public static /* synthetic */ TabLayout I0iXXO(DeviceActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(DeviceActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(DeviceActivity r0) {
        onUnbind$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(DeviceActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(DeviceActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(DeviceActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ void onUnbind$default(DeviceActivity r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.onUnbind(r1);
    }

    private static final void onUnbind$lambda$0(DeviceActivity r0) {
        r0.finish();
    }

    private static final TabLayout table_delegate$lambda$0(DeviceActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final DeviceFragment getDeviceFragment() {
        DeviceFragment r0 = this.deviceFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("deviceFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        a01.OXO1.XO0O10().put(b01.iXiX011, true);
        setDeviceFragment(new DeviceFragment());
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        return X0iO1XX.I0iXXO(getDeviceFragment());
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTable().setVisibility(8);
        getAbhTitleCenter().setText(R.string.bottom_device);
        getAbhTitleRight().setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_status_info;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @sf5(tag = I01XX0.X100O)
    public final void onUnbind(boolean r4) {
        LogUtils.d(new Object[]{"onUnbind"});
        if (i72.OXO1.XIIIO() == false) goto L6;
        new Handler(Looper.getMainLooper()).postDelayed(new Oi1OX(this), 100);
        return;
    }

    public final void setDeviceFragment(@aa1 DeviceFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.deviceFragment = r2;
    }
}
