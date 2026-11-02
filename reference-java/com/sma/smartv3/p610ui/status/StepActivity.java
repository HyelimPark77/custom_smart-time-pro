package com.sma.smartv3.p610ui.status;

import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.StepDayFragment;
import com.sma.smartv3.p610ui.status.fragment.StepMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.StepWeekFragment;
import com.sma.smartv3.p610ui.status.fragment.p255v2.StepDayV2Fragment;
import com.sma.smartv3.p610ui.status.fragment.p255v2.StepMonthV2Fragment;
import com.sma.smartv3.p610ui.status.fragment.p255v2.StepWeekV2Fragment;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StepActivity extends StatusBaseActivity {
    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
        if (i72.OXO1.i101iO()) {
            setDayFragment(new StepDayV2Fragment());
            setWeeFragment(new StepWeekV2Fragment());
            setMonthFragment(new StepMonthV2Fragment());
        } else {
            setDayFragment(new StepDayFragment());
            setWeeFragment(new StepWeekFragment());
            setMonthFragment(new StepMonthFragment());
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity, com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        if (i72.OXO1.i101iO()) {
            setStatusBarColor(this, gk4.m1859iO(getMContext(), R.color.statusBarColor_v2));
            getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg_v2));
            View viewFindViewById = findViewById(R.id.top_line);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return i72.OXO1.i101iO() ? R.layout.activity_status_info_v3 : R.layout.activity_status_info;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String string = getString(R.string.steps);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
