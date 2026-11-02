package com.sma.smartv3.p610ui.status.base;

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
    private boolean initUpdate = true;

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    public void changeTime() {
        super.changeTime();
        setMOffset(0);
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        changeTimeDisplay();
    }

    public final void changeTimeDisplay() {
        String strOII = O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod());
        if (TimePeriod.DAY != getMTimePeriod()) {
            getTvCurrent().setText(strOII);
        } else if (Intrinsics.XOO0ii0(O0X11OiO.X0i1O(null, 1, null).format(new Date()), strOII)) {
            getTvCurrent().setText(R.string.today);
        } else {
            getTvCurrent().setText(strOII);
        }
    }

    public final boolean getInitUpdate() {
        return this.initUpdate;
    }

    @CallSuper
    public void initView() {
        getBtnPre().setOnClickListener(this);
        getBtnNext().setOnClickListener(this);
        if (this.initUpdate) {
            update(getMCalendar(), getMOffset(), getMTimePeriod());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int id = view.getId();
        if (id == R.id.beforeTime) {
            Calendar mCalendar = getMCalendar();
            setMOffset(getMOffset() - 1);
            update(mCalendar, getMOffset(), getMTimePeriod());
            getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod()));
            return;
        }
        if (id == R.id.nextTime && O0X11OiO.XOXiX0(getMCalendar(), getMOffset() + 1, getMTimePeriod())) {
            Calendar mCalendar2 = getMCalendar();
            setMOffset(getMOffset() + 1);
            update(mCalendar2, getMOffset(), getMTimePeriod());
            changeTimeDisplay();
        }
    }

    public abstract void onDataChange(@aa1 List<? extends T> list);

    @aa1
    public abstract List<T> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod);

    public final void setInitUpdate(boolean z) {
        this.initUpdate = z;
    }

    public void update(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        switchLoading(true);
        onDataChange(onTimePeriodChange(calendar, i, timePeriod));
        switchLoading(false);
    }
}
