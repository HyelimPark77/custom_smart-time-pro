package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.StockSettingActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class StockSettingActivity extends BaseActivity {

    @tb1
    private dj4 mSetColorTypePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.db5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockSettingActivity.rootView_delegate$lambda$0(this.f6160IO);
        }
    });

    @aa1
    private final Lazy itemColorType$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eb5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockSettingActivity.itemColorType_delegate$lambda$0(this.f6376IO);
        }
    });

    private final String getColorText(int i) {
        String str = getResources().getStringArray(R.array.colortype)[i];
        Intrinsics.O10IXXX0X(str, "get(...)");
        return str;
    }

    private final AbhSettingsItem getItemColorType() {
        return (AbhSettingsItem) this.itemColorType$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemColorType_delegate$lambda$0(StockSettingActivity stockSettingActivity) {
        return (AbhSettingsItem) stockSettingActivity.findViewById(R.id.item_colortype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetColorType$lambda$0$0(StockSettingActivity stockSettingActivity, int i) {
        stockSettingActivity.getItemColorType().setMRightText(stockSettingActivity.getColorText(i));
        a01.OXO1.OXO1().put(b01.XOIX, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(StockSettingActivity stockSettingActivity) {
        return stockSettingActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.stock_settings);
        getItemColorType().setMRightText(getColorText(a01.OXO1.OXO1().getInt(b01.XOIX)));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_stock_settings;
    }

    public final void onSetColorType(@aa1 View view) {
        StockSettingActivity stockSettingActivity;
        Intrinsics.X0O(view, "view");
        if (this.mSetColorTypePopup == null) {
            stockSettingActivity = this;
            dj4 dj4Var = new dj4(stockSettingActivity, R.array.colortype, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.colortype);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.cb5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(StockSettingActivity.onSetColorType$lambda$0$0(this.f5942IO, ((Integer) obj).intValue()));
                }
            });
            stockSettingActivity.mSetColorTypePopup = dj4Var;
        } else {
            stockSettingActivity = this;
        }
        dj4 dj4Var2 = stockSettingActivity.mSetColorTypePopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(a01.OXO1.OXO1().getInt(b01.XOIX));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
