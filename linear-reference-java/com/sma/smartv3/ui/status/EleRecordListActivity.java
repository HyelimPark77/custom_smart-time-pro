package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.android.mltcode.paycertificationapi.I0X11;
import com.android.mltcode.paycertificationapi.I1i01i0i;
import com.android.mltcode.paycertificationapi.IOIXXIi0;
import com.android.mltcode.paycertificationapi.OIOi1;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.X0XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO1O1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EleRecordListActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @tb1
    private PopupWindow mPopupWindow;

    public EleRecordListActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new I1i01i0i(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iO1O1(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new I0X11(this));
    }

    public static /* synthetic */ ImageView I0iXXO(EleRecordListActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(EleRecordListActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(EleRecordListActivity r0, View r1) {
        showTitlePopup$lambda$1(r0, r1);
    }

    public static /* synthetic */ void X0O(EleRecordListActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void X1ii(EleRecordListActivity r0, View r1) {
        showTitlePopup$lambda$0(r0, r1);
    }

    public static /* synthetic */ PFMedium XXI(EleRecordListActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(EleRecordListActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(EleRecordListActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(EleRecordListActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private static final void initView$lambda$0(EleRecordListActivity r0, View r1) {
        Intrinsics.XXI(r1);
        r0.showTitlePopup(r1);
    }

    private static final void showTitlePopup$lambda$0(EleRecordListActivity r0, View r1) {
        PopupWindow r2 = r0.mPopupWindow;
        if (r2 == null) goto L6;
        r2.dismiss();
        return;
    }

    private static final void showTitlePopup$lambda$1(EleRecordListActivity r0, View r1) {
        PopupWindow r2 = r0.mPopupWindow;
        if (r2 == null) goto L6;
        r2.dismiss();
        return;
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram_measurement_title));
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_calendar_normal);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_delete);
        getAbhTitleCenter().setOnClickListener(new IOIXXIi0(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_list;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
    }

    public final void showTitlePopup(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        Object r0 = getSystemService("layout_inflater");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.LayoutInflater");
        View r1 = ((LayoutInflater) r0).inflate(R.layout.popup_ele_center_title_layout, null);
        Intrinsics.O10IXXX0X(r1, "inflate(...)");
        PopupWindow r2 = this.mPopupWindow;
        if (r2 != null) goto L5;
        this.mPopupWindow = new PopupWindow(r1, -2, -2);
    L7:
        PopupWindow r3 = this.mPopupWindow;
        if (r3 == null) goto L10;
        r3.setFocusable(true);
    L10:
        int[] r4 = new int[2];
        r7.getLocationOnScreen(r4);
        int r5 = r4[0];
        int r6 = (r5 + (r5 - r7.getWidth())) + OXI1i1.XIi00iiXO(this, 20.0f);
        int r8 = r4[1] + r7.getHeight();
        PopupWindow r9 = this.mPopupWindow;
        if (r9 == null) goto L13;
        r9.showAtLocation(r7, 0, r6, r8);
    L13:
        r1.findViewById(R.id.ele_all_record).setOnClickListener(new OIOi1(this));
        r1.findViewById(R.id.ele_symptom_record).setOnClickListener(new X0XX0(this));
        return;
    L5:
        if (r2 == null) goto L7;
        r2.dismiss();
        goto L7
    }
}
