package com.sma.smartv3.ui.status;

import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.StepDayFragment;
import com.sma.smartv3.ui.status.fragment.StepMonthFragment;
import com.sma.smartv3.ui.status.fragment.StepWeekFragment;
import com.sma.smartv3.ui.status.fragment.v2.StepDayV2Fragment;
import com.sma.smartv3.ui.status.fragment.v2.StepMonthV2Fragment;
import com.sma.smartv3.ui.status.fragment.v2.StepWeekV2Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StepActivity extends StatusBaseActivity {
    public StepActivity() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
        if (i72.OXO1.i101iO() == false) goto L6;
        setDayFragment(new StepDayV2Fragment());
        setWeeFragment(new StepWeekV2Fragment());
        setMonthFragment(new StepMonthV2Fragment());
        return;
    L6:
        setDayFragment(new StepDayFragment());
        setWeeFragment(new StepWeekFragment());
        setMonthFragment(new StepMonthFragment());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity, com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        if (i72.OXO1.i101iO() == false) goto L8;
        setStatusBarColor(this, gk4.iO(getMContext(), R.color.statusBarColor_v2));
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg_v2));
        View r0 = findViewById(R.id.top_line);
        if (r0 == null) goto L9;
        r0.setVisibility(8);
        return;
    L9:
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        if (i72.OXO1.i101iO() == false) goto L6;
        return R.layout.activity_status_info_v3;
    L6:
        return R.layout.activity_status_info;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        String r0 = getString(R.string.steps);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    }
}
