package com.sma.smartv3.p610ui.sport.v2fragment;

import android.os.Bundle;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.sport.course.BaseGpsSportV2Fragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AppGpsStartSportFragment extends BaseGpsSportV2Fragment {

    @aa1
    private static final String ARG_SPORT_MODE = "SPORT_MODE";

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final AppGpsStartSportFragment OXO1(int i) {
            AppGpsStartSportFragment appGpsStartSportFragment = new AppGpsStartSportFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(AppGpsStartSportFragment.ARG_SPORT_MODE, i);
            appGpsStartSportFragment.setArguments(bundle);
            return appGpsStartSportFragment;
        }

        public OXO1() {
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Bundle arguments = getArguments();
        setMSportMode(arguments != null ? arguments.getInt(ARG_SPORT_MODE) : 0);
        if (bundle != null) {
            setMSportMode(bundle.getInt(ARG_SPORT_MODE, getMSportMode()));
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.course.BaseGpsSportV2Fragment, com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        RelativeLayout root_view = getRoot_view();
        Intrinsics.O10IXXX0X(root_view, "<get-root_view>(...)");
        UtilsKt.IX1XiI(root_view, 40.0f);
    }

    @Override // com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_gps_sport_v3;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@aa1 Bundle outState) {
        Intrinsics.X0O(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(ARG_SPORT_MODE, getMSportMode());
    }

    @Override // com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment
    public void startSport() {
        if (BleConnector.INSTANCE.isAvailable()) {
            super.startSport();
        } else {
            ToastUtils.showLong(getString(R.string.app_start_sport_tip_v2), new Object[0]);
        }
    }
}
