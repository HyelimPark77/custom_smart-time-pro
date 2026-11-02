package com.sma.smartv3.ui.sport.v2fragment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.XOOIXX01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.BaseNoGpsSportV2Fragment;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AppNoGpsStartSportFragment extends BaseNoGpsSportV2Fragment {

    @aa1
    private static final String ARG_SPORT_MODE = "SPORT_MODE";

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private final Lazy mCurModeIcon$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final AppNoGpsStartSportFragment OXO1(int r4) {
            AppNoGpsStartSportFragment r0 = new AppNoGpsStartSportFragment();
            Bundle r1 = new Bundle();
            r1.putInt(AppNoGpsStartSportFragment.ARG_SPORT_MODE, r4);
            r0.setArguments(r1);
            return r0;
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public AppNoGpsStartSportFragment() {
        this.mCurModeIcon$delegate = LazyKt__LazyJVMKt.iO(new XOOIXX01(this));
    }

    public static /* synthetic */ ImageView OX(AppNoGpsStartSportFragment r0) {
        return mCurModeIcon_delegate$lambda$0(r0);
    }

    private static final ImageView mCurModeIcon_delegate$lambda$0(AppNoGpsStartSportFragment r1) {
        return (ImageView) r1.getMView().findViewById(R.id.cur_mode_icon);
    }

    public final ImageView getMCurModeIcon() {
        return (ImageView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        Bundle r0 = getArguments();
        if (r0 == null) goto L5;
        int r1 = r0.getInt(ARG_SPORT_MODE);
    L6:
        setMSportMode(r1);
        if (r3 == null) goto L10;
        setMSportMode(r3.getInt(ARG_SPORT_MODE, getMSportMode()));
        return;
    L10:
        return;
    L5:
        r1 = 0;
        goto L6
    }

    @Override // com.sma.smartv3.ui.sport.course.BaseNoGpsSportV2Fragment, com.sma.smartv3.ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        RelativeLayout r0 = getRoot_view();
        Intrinsics.O10IXXX0X(r0, "<get-root_view>(...)");
        UtilsKt.IX1XiI(r0, 40.0f);
        getIvBg().setImageResource(R.drawable.pic_indoor);
        getMCurModeIcon().setVisibility(0);
        ImageView r1 = getMCurModeIcon();
        Activity r2 = getMActivity();
        SportRecordData r3 = new SportRecordData();
        r3.setMMode(getMSportMode());
        Unit r4 = Unit.OXO1;
        r1.setImageResource(SportRecordDataKt.getWorkoutImage(r2, r3));
    }

    @Override // com.sma.smartv3.ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_gps_sport_v3;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@aa1 Bundle r3) {
        Intrinsics.X0O(r3, "outState");
        super.onSaveInstanceState(r3);
        r3.putInt(ARG_SPORT_MODE, getMSportMode());
    }

    @Override // com.sma.smartv3.ui.sport.course.BaseSportV2Fragment
    public void startSport() {
        if (BleConnector.INSTANCE.isAvailable() == false) goto L6;
        super.startSport();
        return;
    L6:
        ToastUtils.showLong(getString(R.string.app_start_sport_tip_v2), new Object[0]);
    }
}
