package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.IXX1iII1i;
import com.android.mltcode.paycertificationapi.IXiIO01;
import com.android.mltcode.paycertificationapi.O01O0OX;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.Oi01O1;
import com.android.mltcode.paycertificationapi.Oi1IXI01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iIIIO11iO;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.fragment.EcgV2DayFragment;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nElectrocardiogramV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n69#2,3:107\n72#2,5:111\n1#3:110\n*S KotlinDebug\n*F\n+ 1 ElectrocardiogramV2Activity.kt\ncom/sma/smartv3/ui/status/ElectrocardiogramV2Activity\n*L\n87#1:107,3\n87#1:111,5\n87#1:110\n*E\n"})
public final class ElectrocardiogramV2Activity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    public EcgV2DayFragment mEcgV2DayFragment;

    @tb1
    private PopupWindow mPopupWindow;

    public ElectrocardiogramV2Activity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new Oi1IXI01(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iIIIO11iO(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new IXiIO01(this));
    }

    public static /* synthetic */ ImageView I0iXXO(ElectrocardiogramV2Activity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(ElectrocardiogramV2Activity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(ElectrocardiogramV2Activity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(ElectrocardiogramV2Activity r0, View r1) {
        onTitleRightClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ void X1ii(ElectrocardiogramV2Activity r0, View r1) {
        onTitleRightClick$lambda$2(r0, r1);
    }

    public static /* synthetic */ void XXI(ElectrocardiogramV2Activity r0, View r1) {
        onTitleRightClick$lambda$1(r0, r1);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(ElectrocardiogramV2Activity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(ElectrocardiogramV2Activity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(ElectrocardiogramV2Activity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private static final void onTitleRightClick$lambda$0(ElectrocardiogramV2Activity r1, View r2) {
        r1.startActivity(new Intent(r1, EleRecordListActivity.class));
        PopupWindow r3 = r1.mPopupWindow;
        if (r3 == null) goto L6;
        r3.dismiss();
        return;
    }

    private static final void onTitleRightClick$lambda$1(ElectrocardiogramV2Activity r1, View r2) {
        ToastUtils.showLong(r1.getString(R.string.operating_guide), new Object[0]);
        PopupWindow r3 = r1.mPopupWindow;
        if (r3 == null) goto L6;
        r3.dismiss();
        return;
    }

    private static final void onTitleRightClick$lambda$2(ElectrocardiogramV2Activity r1, View r2) {
        ToastUtils.showLong(r1.getString(R.string.describe), new Object[0]);
        PopupWindow r3 = r1.mPopupWindow;
        if (r3 == null) goto L6;
        r3.dismiss();
        return;
    }

    @aa1
    public final EcgV2DayFragment getMEcgV2DayFragment() {
        EcgV2DayFragment r0 = this.mEcgV2DayFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mEcgV2DayFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setMEcgV2DayFragment(new EcgV2DayFragment());
        getAbhTitleCenter().setText(getString(R.string.electrocardiogram));
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_frame, getMEcgV2DayFragment()).commit();
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_calendar_normal);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ele_more_icon);
        getAbhTitleRight().setImageTintList(ContextCompat.getColorStateList(getMContext(), R.color.abh_text_color));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_electrocardiogram_v3;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        Object r0 = getSystemService("layout_inflater");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.LayoutInflater");
        View r1 = ((LayoutInflater) r0).inflate(R.layout.popup_ele_right_title_layout, null);
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
        r1.findViewById(R.id.ele_synchronous_recording).setOnClickListener(new IXX1iII1i(this));
        r1.findViewById(R.id.ele_operating_guide).setOnClickListener(new O01O0OX(this));
        r1.findViewById(R.id.ele_describe).setOnClickListener(new Oi01O1(this));
        return;
    L5:
        if (r2 == null) goto L7;
        r2.dismiss();
        goto L7
    }

    public final void onTitleRightOtherClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getMEcgV2DayFragment().getUserVisibleHint() == false) goto L6;
        getMEcgV2DayFragment().showCalendarPopop();
        return;
    }

    public final void setMEcgV2DayFragment(@aa1 EcgV2DayFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mEcgV2DayFragment = r2;
    }
}
