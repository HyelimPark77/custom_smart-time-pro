package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseActivity;
import com.sma.smartv3.ui.status.fragment.SportRecordsFragment;
import com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportRecordsActivity extends StatusBaseActivity {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    public static final String TAG = "SportRecordsActivity";

    @tb1
    private SportRecordsFragment mSportRecordsFragment;

    @tb1
    private SportRecordsV2Fragment mSportRecordsV2Fragment;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SportRecordsActivity() {
    }

    @tb1
    public final SportRecordsFragment getMSportRecordsFragment() {
        return this.mSportRecordsFragment;
    }

    @tb1
    public final SportRecordsV2Fragment getMSportRecordsV2Fragment() {
        return this.mSportRecordsV2Fragment;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void initFragment() {
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity, com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        i72 r0 = i72.OXO1;
        LogUtils.i(new Object[]{"SportRecordsActivity" + r0.iIXX0i()});
        if (r0.iIXX0i() == false) goto L8;
        this.mSportRecordsV2Fragment = new SportRecordsV2Fragment();
        if (getMArg1() <= (-1)) goto L7;
        Bundle r1 = new Bundle();
        r1.putInt("mArg1", getMArg1());
        SportRecordsV2Fragment r2 = this.mSportRecordsV2Fragment;
        Intrinsics.XXI(r2);
        r2.setArguments(r1);
    L7:
        SportRecordsV2Fragment r3 = this.mSportRecordsV2Fragment;
        Intrinsics.XXI(r3);
        Object r4 = r3;
    L10:
        return X0iO1XX.I0iXXO(r4);
    L8:
        SportRecordsFragment r5 = new SportRecordsFragment();
        this.mSportRecordsFragment = r5;
        Intrinsics.XXI(r5);
        r4 = r5;
        goto L10
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity, com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        int r1 = 8;
        findViewById(R.id.top_line).setVisibility(8);
        getTable().setVisibility(8);
        ImageView r0 = getAbhTitleRight();
        i72 r2 = i72.OXO1;
        if (r2.iIXX0i() == false) goto L5;
        getAbhTitleRight().setImageResource(R.drawable.icon_calendar_records_normal);
        r1 = 0;
    L5:
        r0.setVisibility(r1);
        View r3 = findViewById(R.id.abh_title);
        if (r3 != null) goto L8;
        return;
    L8:
        if (r2.IiiXiI0I() == false) goto L12;
        r3.setBackgroundResource(R.color.white_FEFEFE);
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (i72.OXO1.iIXX0i() == false) goto L8;
        SportRecordsV2Fragment r3 = this.mSportRecordsV2Fragment;
        if (r3 == null) goto L9;
        r3.showCalendarPopop();
        return;
    L9:
        return;
    }

    public final void setMSportRecordsFragment(@tb1 SportRecordsFragment r1) {
        this.mSportRecordsFragment = r1;
    }

    public final void setMSportRecordsV2Fragment(@tb1 SportRecordsV2Fragment r1) {
        this.mSportRecordsV2Fragment = r1;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        if (getMArg1() <= (-1)) goto L6;
        String r0 = getString(R.string.game_record);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        return r0;
    L6:
        String r1 = getString(R.string.sports_record);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        return r1;
    }
}
