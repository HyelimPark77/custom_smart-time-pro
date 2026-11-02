package com.sma.smartv3.ui.status.base;

import android.view.View;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDetailsFragment<T> extends BaseStatusFragment implements View.OnClickListener {
    private boolean initUpdate;

    public BaseDetailsFragment() {
        this.initUpdate = true;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    public void changeTime() {
        super.changeTime();
        setMOffset(0);
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        changeTimeDisplay();
    }

    public final void changeTimeDisplay() {
        String r0 = O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod());
        if (TimePeriod.DAY == getMTimePeriod()) goto L5;
        getTvCurrent().setText(r0);
        return;
    L5:
        if (Intrinsics.XOO0ii0(O0X11OiO.X0i1O(null, 1, null).format(new Date()), r0) == false) goto L8;
        getTvCurrent().setText(R.string.today);
        return;
    L8:
        getTvCurrent().setText(r0);
    }

    public final boolean getInitUpdate() {
        return this.initUpdate;
    }

    @CallSuper
    public void initView() {
        getBtnPre().setOnClickListener(this);
        getBtnNext().setOnClickListener(this);
        if (this.initUpdate == false) goto L6;
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        return;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        int r5 = r4.getId();
        if (r5 != R.id.beforeTime) goto L5;
        Calendar r6 = getMCalendar();
        setMOffset(getMOffset() - 1);
        update(r6, getMOffset(), getMTimePeriod());
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod()));
        return;
    L5:
        if (r5 == R.id.nextTime) goto L8;
        return;
    L8:
        if (O0X11OiO.XOXiX0(getMCalendar(), getMOffset() + 1, getMTimePeriod()) == false) goto L13;
        Calendar r7 = getMCalendar();
        setMOffset(getMOffset() + 1);
        update(r7, getMOffset(), getMTimePeriod());
        changeTimeDisplay();
        return;
    }

    public abstract void onDataChange(@aa1 List<? extends T> r1);

    @aa1
    public abstract List<T> onTimePeriodChange(@aa1 Calendar r1, int r2, @aa1 TimePeriod r3);

    public final void setInitUpdate(boolean r1) {
        this.initUpdate = r1;
    }

    public void update(@aa1 Calendar r2, int r3, @aa1 TimePeriod r4) {
        Intrinsics.X0O(r2, "calendar");
        Intrinsics.X0O(r4, "timePeriod");
        switchLoading(true);
        onDataChange(onTimePeriodChange(r2, r3, r4));
        switchLoading(false);
    }
}
