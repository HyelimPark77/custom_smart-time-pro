package com.sma.smartv3.ui.status.base;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.OO0O10IOX;
import com.android.mltcode.paycertificationapi.OX10IXiIO;
import com.android.mltcode.paycertificationapi.OXOOOXI;
import com.android.mltcode.paycertificationapi.OXOOX1O1;
import com.android.mltcode.paycertificationapi.X010i0ii0;
import com.android.mltcode.paycertificationapi.X0XO1XO;
import com.android.mltcode.paycertificationapi.X0iOX0O1I;
import com.android.mltcode.paycertificationapi.X1O0XIX;
import com.android.mltcode.paycertificationapi.XI1i00i1;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XO0O0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0X0;
import com.android.mltcode.paycertificationapi.iX1X1XXXO;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseStatusFragment extends BaseFragment {

    @aa1
    private final Lazy btnNext$delegate;

    @aa1
    private final Lazy btnPre$delegate;

    @aa1
    private final Lazy dataContent$delegate;

    @aa1
    private final Lazy image$delegate;

    @aa1
    private final Lazy loading$delegate;

    @aa1
    private Calendar mCalendar;

    @tb1
    private X010i0ii0 mCalendarPopup;
    private int mOffset;

    @aa1
    private final Lazy nowTimeDetails$delegate;

    @aa1
    private final Lazy nowValue$delegate;

    @aa1
    private final Lazy scrollView$delegate;

    @aa1
    private final Lazy tvCurrent$delegate;

    @aa1
    private final Lazy valueUnit$delegate;

    public BaseStatusFragment() {
        this.btnPre$delegate = LazyKt__LazyJVMKt.iO(new X0iOX0O1I(this));
        this.btnNext$delegate = LazyKt__LazyJVMKt.iO(new iX1X1XXXO(this));
        this.tvCurrent$delegate = LazyKt__LazyJVMKt.iO(new X0XO1XO(this));
        this.nowValue$delegate = LazyKt__LazyJVMKt.iO(new XI1i00i1(this));
        this.loading$delegate = LazyKt__LazyJVMKt.iO(new X1O0XIX(this));
        this.dataContent$delegate = LazyKt__LazyJVMKt.iO(new XO0O0(this));
        this.nowTimeDetails$delegate = LazyKt__LazyJVMKt.iO(new OXOOX1O1(this));
        this.image$delegate = LazyKt__LazyJVMKt.iO(new i0X0(this));
        this.valueUnit$delegate = LazyKt__LazyJVMKt.iO(new OXOOOXI(this));
        this.scrollView$delegate = LazyKt__LazyJVMKt.iO(new OX10IXiIO(this));
        Calendar r0 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r0, "getInstance(...)");
        this.mCalendar = r0;
    }

    public static /* synthetic */ RelativeLayout I0IIOi(BaseStatusFragment r0) {
        return loading_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold I0iXXO(BaseStatusFragment r0) {
        return nowValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IO(BaseStatusFragment r0) {
        return tvCurrent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IiI10X(BaseStatusFragment r0) {
        return btnPre_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold O00(BaseStatusFragment r0) {
        return nowTimeDetails_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OIX0iXi(BaseStatusFragment r0) {
        return btnNext_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIi0(BaseStatusFragment r0) {
        return valueUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XIi00iiXO(BaseStatusFragment r0) {
        return dataContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XO0O10(BaseStatusFragment r0) {
        return image_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView XOO0ii0(BaseStatusFragment r0) {
        return scrollView_delegate$lambda$0(r0);
    }

    private static final View btnNext_delegate$lambda$0(BaseStatusFragment r1) {
        return r1.getMView().findViewById(R.id.nextTime);
    }

    private static final View btnPre_delegate$lambda$0(BaseStatusFragment r1) {
        return r1.getMView().findViewById(R.id.beforeTime);
    }

    private static final LinearLayout dataContent_delegate$lambda$0(BaseStatusFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.dataContent);
    }

    public static /* synthetic */ boolean iO(BaseStatusFragment r0, Calendar r1) {
        return showCalendarPopop$lambda$0$0(r0, r1);
    }

    private static final ImageView image_delegate$lambda$0(BaseStatusFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.image);
    }

    private static final RelativeLayout loading_delegate$lambda$0(BaseStatusFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.loading);
    }

    private static final DINCondBold nowTimeDetails_delegate$lambda$0(BaseStatusFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.nowTimeDetails);
    }

    private static final DINCondBold nowValue_delegate$lambda$0(BaseStatusFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.nowValue);
    }

    private static final NestedScrollView scrollView_delegate$lambda$0(BaseStatusFragment r1) {
        return (NestedScrollView) r1.getMView().findViewById(R.id.scrollView);
    }

    private static final boolean showCalendarPopop$lambda$0$0(BaseStatusFragment r1, Calendar r2) {
        Intrinsics.X0O(r2, "calendar");
        r1.mCalendar = r2;
        r1.changeTime();
        return true;
    }

    private static final TextView tvCurrent_delegate$lambda$0(BaseStatusFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.nowTime);
    }

    private static final PFMedium valueUnit_delegate$lambda$0(BaseStatusFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.valueUnit);
    }

    public void changeTime() {
    }

    public final View getBtnNext() {
        return (View) getValue();
    }

    public final View getBtnPre() {
        return (View) getValue();
    }

    public final LinearLayout getDataContent() {
        return (LinearLayout) getValue();
    }

    public final ImageView getImage() {
        return (ImageView) getValue();
    }

    public final RelativeLayout getLoading() {
        return (RelativeLayout) getValue();
    }

    @aa1
    public final Calendar getMCalendar() {
        return this.mCalendar;
    }

    @tb1
    public final X010i0ii0 getMCalendarPopup() {
        return this.mCalendarPopup;
    }

    public final int getMOffset() {
        return this.mOffset;
    }

    @aa1
    public abstract TimePeriod getMTimePeriod();

    public final DINCondBold getNowTimeDetails() {
        return (DINCondBold) getValue();
    }

    public final DINCondBold getNowValue() {
        return (DINCondBold) getValue();
    }

    public final NestedScrollView getScrollView() {
        return (NestedScrollView) getValue();
    }

    public final TextView getTvCurrent() {
        return (TextView) getValue();
    }

    public final PFMedium getValueUnit() {
        return (PFMedium) getValue();
    }

    @CallSuper
    public void init(@tb1 Bundle r2) {
        Calendar r3 = this.mCalendar;
        OIi1iX.XX0(r3, 0);
        OIi1iX.I1(r3, 0);
        OIi1iX.OiIIX101O(r3, 0);
        OIi1iX.iIiiO(r3, 0);
        r3.setMinimalDaysInFirstWeek(7);
        if (getMTimePeriod() != TimePeriod.WEEK) goto L7;
        Calendar r4 = this.mCalendar;
        OIi1iX.XiOIO(r4, r4.getFirstDayOfWeek());
        return;
    L7:
        if (getMTimePeriod() != TimePeriod.MONTH) goto L10;
        OIi1iX.IIX1OXO(this.mCalendar, 1);
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        X010i0ii0 r0 = this.mCalendarPopup;
        if (r0 == null) goto L7;
        if (r0 == null) goto L8;
        r0.dismiss();
        return;
    L8:
        return;
    }

    public final void setMCalendar(@aa1 Calendar r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCalendar = r2;
    }

    public final void setMCalendarPopup(@tb1 X010i0ii0 r1) {
        this.mCalendarPopup = r1;
    }

    public final void setMOffset(int r1) {
        this.mOffset = r1;
    }

    public void share() {
        XIi1i01O r0 = XIi1i01O.OXO1;
        NestedScrollView r1 = getScrollView();
        Intrinsics.O10IXXX0X(r1, "<get-scrollView>(...)");
        Bitmap r2 = r0.iO(r1);
        r0.XO0O10(getMActivity(), r2);
    }

    public final void showCalendarPopop() {
        if (getMActivity() != null) goto L6;
        return;
    L6:
        if (this.mCalendarPopup != null) goto L8;
        X010i0ii0 r0 = new X010i0ii0(getMActivity());
        r0.O1O(new OO0O10IOX(this));
        this.mCalendarPopup = r0;
    L8:
        X010i0ii0 r1 = this.mCalendarPopup;
        if (r1 == null) goto L12;
        r1.iOO1ii1(this.mCalendar);
        r1.IIX1OXO();
        return;
    }

    public final void switchLoading(boolean r3) {
        if (r3 == false) goto L6;
        getLoading().setVisibility(0);
        getDataContent().setVisibility(8);
        return;
    L6:
        getLoading().setVisibility(8);
        getDataContent().setVisibility(0);
    }
}
