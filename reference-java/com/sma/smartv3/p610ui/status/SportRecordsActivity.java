package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.p610ui.status.fragment.SportRecordsFragment;
import com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportRecordsActivity extends StatusBaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    public static final String TAG = "SportRecordsActivity";

    @tb1
    private SportRecordsFragment mSportRecordsFragment;

    @tb1
    private SportRecordsV2Fragment mSportRecordsV2Fragment;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @tb1
    public final SportRecordsFragment getMSportRecordsFragment() {
        return this.mSportRecordsFragment;
    }

    @tb1
    public final SportRecordsV2Fragment getMSportRecordsV2Fragment() {
        return this.mSportRecordsV2Fragment;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void initFragment() {
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity, com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        Object obj;
        i72 i72Var = i72.OXO1;
        LogUtils.m11130i("SportRecordsActivity" + i72Var.iIXX0i());
        if (i72Var.iIXX0i()) {
            this.mSportRecordsV2Fragment = new SportRecordsV2Fragment();
            if (getMArg1() > -1) {
                Bundle bundle = new Bundle();
                bundle.putInt("mArg1", getMArg1());
                SportRecordsV2Fragment sportRecordsV2Fragment = this.mSportRecordsV2Fragment;
                Intrinsics.XXI(sportRecordsV2Fragment);
                sportRecordsV2Fragment.setArguments(bundle);
            }
            SportRecordsV2Fragment sportRecordsV2Fragment2 = this.mSportRecordsV2Fragment;
            Intrinsics.XXI(sportRecordsV2Fragment2);
            obj = sportRecordsV2Fragment2;
        } else {
            SportRecordsFragment sportRecordsFragment = new SportRecordsFragment();
            this.mSportRecordsFragment = sportRecordsFragment;
            Intrinsics.XXI(sportRecordsFragment);
            obj = sportRecordsFragment;
        }
        return X0iO1XX.I0iXXO(obj);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity, com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        int i = 8;
        findViewById(R.id.top_line).setVisibility(8);
        getTable().setVisibility(8);
        ImageView abhTitleRight = getAbhTitleRight();
        i72 i72Var = i72.OXO1;
        if (i72Var.iIXX0i()) {
            getAbhTitleRight().setImageResource(R.drawable.icon_calendar_records_normal);
            i = 0;
        }
        abhTitleRight.setVisibility(i);
        View viewFindViewById = findViewById(R.id.abh_title);
        if (viewFindViewById == null || !i72Var.IiiXiI0I()) {
            return;
        }
        viewFindViewById.setBackgroundResource(R.color.white_FEFEFE);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    public void onTitleRightClick(@aa1 View view) {
        SportRecordsV2Fragment sportRecordsV2Fragment;
        Intrinsics.X0O(view, "view");
        if (!i72.OXO1.iIXX0i() || (sportRecordsV2Fragment = this.mSportRecordsV2Fragment) == null) {
            return;
        }
        sportRecordsV2Fragment.showCalendarPopop();
    }

    public final void setMSportRecordsFragment(@tb1 SportRecordsFragment sportRecordsFragment) {
        this.mSportRecordsFragment = sportRecordsFragment;
    }

    public final void setMSportRecordsV2Fragment(@tb1 SportRecordsV2Fragment sportRecordsV2Fragment) {
        this.mSportRecordsV2Fragment = sportRecordsV2Fragment;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseActivity
    @aa1
    public String setTitle() {
        if (getMArg1() > -1) {
            String string = getString(R.string.game_record);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            return string;
        }
        String string2 = getString(R.string.sports_record);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        return string2;
    }
}
