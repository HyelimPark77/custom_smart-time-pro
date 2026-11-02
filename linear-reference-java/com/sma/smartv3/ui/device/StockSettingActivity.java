package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cb5;
import com.android.mltcode.paycertificationapi.db5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.eb5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StockSettingActivity extends BaseActivity {

    @aa1
    private final Lazy itemColorType$delegate;

    @tb1
    private dj4 mSetColorTypePopup;

    @aa1
    private final Lazy rootView$delegate;

    public StockSettingActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new db5(this));
        this.itemColorType$delegate = LazyKt__LazyJVMKt.iO(new eb5(this));
    }

    public static /* synthetic */ boolean I0iXXO(StockSettingActivity r0, int r1) {
        return onSetColorType$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View OIX0iXi(StockSettingActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AbhSettingsItem XXI(StockSettingActivity r0) {
        return itemColorType_delegate$lambda$0(r0);
    }

    private final String getColorText(int r3) {
        String r4 = getResources().getStringArray(R.array.colortype)[r3];
        Intrinsics.O10IXXX0X(r4, "get(...)");
        return r4;
    }

    private final AbhSettingsItem getItemColorType() {
        return (AbhSettingsItem) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private static final AbhSettingsItem itemColorType_delegate$lambda$0(StockSettingActivity r1) {
        return (AbhSettingsItem) r1.findViewById(R.id.item_colortype);
    }

    private static final boolean onSetColorType$lambda$0$0(StockSettingActivity r1, int r2) {
        r1.getItemColorType().setMRightText(r1.getColorText(r2));
        a01.OXO1.OXO1().put(b01.XOIX, r2);
        return true;
    }

    private static final View rootView_delegate$lambda$0(StockSettingActivity r1) {
        return r1.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.stock_settings);
        getItemColorType().setMRightText(getColorText(a01.OXO1.OXO1().getInt(b01.XOIX)));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_stock_settings;
    }

    public final void onSetColorType(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mSetColorTypePopup != null) goto L5;
        int r2 = R.array.colortype;
        int r3 = 0;
        StockSettingActivity r1 = this;
        dj4 r0 = new dj4(r1, r2, r3, 4, null);
        r0.iX(R.string.colortype);
        r0.i010I(new cb5(this));
        r1.mSetColorTypePopup = r0;
    L6:
        dj4 r8 = r1.mSetColorTypePopup;
        if (r8 == null) goto L10;
        r8.II1Xi0(a01.OXO1.OXO1().getInt(b01.XOIX));
        View r4 = getRootView();
        Intrinsics.O10IXXX0X(r4, "<get-rootView>(...)");
        r8.I1XOi1(r4);
        return;
    L10:
        return;
    L5:
        r1 = this;
        goto L6
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
