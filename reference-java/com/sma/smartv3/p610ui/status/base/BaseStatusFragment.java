package com.sma.smartv3.p610ui.status.base;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.X010i0ii0;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.sma.smartv3.p610ui.status.base.BaseStatusFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseStatusFragment extends BaseFragment {

    @aa1
    private Calendar mCalendar;

    @tb1
    private X010i0ii0 mCalendarPopup;
    private int mOffset;

    @aa1
    private final Lazy btnPre$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0iOX0O1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.btnPre_delegate$lambda$0(this.f4101IO);
        }
    });

    @aa1
    private final Lazy btnNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iX1X1XXXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.btnNext_delegate$lambda$0(this.f8296IO);
        }
    });

    @aa1
    private final Lazy tvCurrent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0XO1XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.tvCurrent_delegate$lambda$0(this.f4040IO);
        }
    });

    @aa1
    private final Lazy nowValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI1i00i1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.nowValue_delegate$lambda$0(this.f4486IO);
        }
    });

    @aa1
    private final Lazy loading$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1O0XIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.loading_delegate$lambda$0(this.f4284IO);
        }
    });

    @aa1
    private final Lazy dataContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XO0O0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.dataContent_delegate$lambda$0(this.f4666IO);
        }
    });

    @aa1
    private final Lazy nowTimeDetails$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXOOX1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.nowTimeDetails_delegate$lambda$0(this.f3516IO);
        }
    });

    @aa1
    private final Lazy image$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.image_delegate$lambda$0(this.f7412IO);
        }
    });

    @aa1
    private final Lazy valueUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXOOOXI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.valueUnit_delegate$lambda$0(this.f3513IO);
        }
    });

    @aa1
    private final Lazy scrollView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX10IXiIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseStatusFragment.scrollView_delegate$lambda$0(this.f3422IO);
        }
    });

    public BaseStatusFragment() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        this.mCalendar = calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnNext_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return baseStatusFragment.getMView().findViewById(R.id.nextTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnPre_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return baseStatusFragment.getMView().findViewById(R.id.beforeTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout dataContent_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (LinearLayout) baseStatusFragment.getMView().findViewById(R.id.dataContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView image_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (ImageView) baseStatusFragment.getMView().findViewById(R.id.image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout loading_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (RelativeLayout) baseStatusFragment.getMView().findViewById(R.id.loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold nowTimeDetails_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (DINCondBold) baseStatusFragment.getMView().findViewById(R.id.nowTimeDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold nowValue_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (DINCondBold) baseStatusFragment.getMView().findViewById(R.id.nowValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView scrollView_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (NestedScrollView) baseStatusFragment.getMView().findViewById(R.id.scrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showCalendarPopop$lambda$0$0(BaseStatusFragment baseStatusFragment, Calendar calendar) {
        Intrinsics.X0O(calendar, "calendar");
        baseStatusFragment.mCalendar = calendar;
        baseStatusFragment.changeTime();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCurrent_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (TextView) baseStatusFragment.getMView().findViewById(R.id.nowTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium valueUnit_delegate$lambda$0(BaseStatusFragment baseStatusFragment) {
        return (PFMedium) baseStatusFragment.getMView().findViewById(R.id.valueUnit);
    }

    public void changeTime() {
    }

    public final View getBtnNext() {
        return (View) this.btnNext$delegate.getValue();
    }

    public final View getBtnPre() {
        return (View) this.btnPre$delegate.getValue();
    }

    public final LinearLayout getDataContent() {
        return (LinearLayout) this.dataContent$delegate.getValue();
    }

    public final ImageView getImage() {
        return (ImageView) this.image$delegate.getValue();
    }

    public final RelativeLayout getLoading() {
        return (RelativeLayout) this.loading$delegate.getValue();
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
        return (DINCondBold) this.nowTimeDetails$delegate.getValue();
    }

    public final DINCondBold getNowValue() {
        return (DINCondBold) this.nowValue$delegate.getValue();
    }

    public final NestedScrollView getScrollView() {
        return (NestedScrollView) this.scrollView$delegate.getValue();
    }

    public final TextView getTvCurrent() {
        return (TextView) this.tvCurrent$delegate.getValue();
    }

    public final PFMedium getValueUnit() {
        return (PFMedium) this.valueUnit$delegate.getValue();
    }

    @CallSuper
    public void init(@tb1 Bundle bundle) {
        Calendar calendar = this.mCalendar;
        OIi1iX.XX0(calendar, 0);
        OIi1iX.m890I1(calendar, 0);
        OIi1iX.OiIIX101O(calendar, 0);
        OIi1iX.iIiiO(calendar, 0);
        calendar.setMinimalDaysInFirstWeek(7);
        if (getMTimePeriod() == TimePeriod.WEEK) {
            Calendar calendar2 = this.mCalendar;
            OIi1iX.XiOIO(calendar2, calendar2.getFirstDayOfWeek());
        } else if (getMTimePeriod() == TimePeriod.MONTH) {
            OIi1iX.IIX1OXO(this.mCalendar, 1);
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        X010i0ii0 x010i0ii0 = this.mCalendarPopup;
        if (x010i0ii0 == null || x010i0ii0 == null) {
            return;
        }
        x010i0ii0.dismiss();
    }

    public final void setMCalendar(@aa1 Calendar calendar) {
        Intrinsics.X0O(calendar, "<set-?>");
        this.mCalendar = calendar;
    }

    public final void setMCalendarPopup(@tb1 X010i0ii0 x010i0ii0) {
        this.mCalendarPopup = x010i0ii0;
    }

    public final void setMOffset(int i) {
        this.mOffset = i;
    }

    public void share() {
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        NestedScrollView scrollView = getScrollView();
        Intrinsics.O10IXXX0X(scrollView, "<get-scrollView>(...)");
        xIi1i01O.XO0O10(getMActivity(), xIi1i01O.m1250iO(scrollView));
    }

    public final void showCalendarPopop() {
        if (getMActivity() == null) {
            return;
        }
        if (this.mCalendarPopup == null) {
            X010i0ii0 x010i0ii0 = new X010i0ii0(getMActivity());
            x010i0ii0.O1O(new Function1() { // from class: com.android.mltcode.paycertificationapi.OO0O10IOX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(BaseStatusFragment.showCalendarPopop$lambda$0$0(this.f3137IO, (Calendar) obj));
                }
            });
            this.mCalendarPopup = x010i0ii0;
        }
        X010i0ii0 x010i0ii1 = this.mCalendarPopup;
        if (x010i0ii1 != null) {
            x010i0ii1.iOO1ii1(this.mCalendar);
            x010i0ii1.IIX1OXO();
        }
    }

    public final void switchLoading(boolean z) {
        if (z) {
            getLoading().setVisibility(0);
            getDataContent().setVisibility(8);
        } else {
            getLoading().setVisibility(8);
            getDataContent().setVisibility(0);
        }
    }
}
