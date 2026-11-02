package com.sma.smartv3.p610ui.sport.v2fragment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p610ui.sport.course.BaseNoGpsSportV2Fragment;
import com.sma.smartv3.p610ui.sport.v2fragment.AppNoGpsStartSportFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AppNoGpsStartSportFragment extends BaseNoGpsSportV2Fragment {

    @aa1
    private static final String ARG_SPORT_MODE = "SPORT_MODE";

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private final Lazy mCurModeIcon$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOOIXX01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AppNoGpsStartSportFragment.mCurModeIcon_delegate$lambda$0(this.f4809IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final AppNoGpsStartSportFragment OXO1(int i) {
            AppNoGpsStartSportFragment appNoGpsStartSportFragment = new AppNoGpsStartSportFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(AppNoGpsStartSportFragment.ARG_SPORT_MODE, i);
            appNoGpsStartSportFragment.setArguments(bundle);
            return appNoGpsStartSportFragment;
        }

        public OXO1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCurModeIcon_delegate$lambda$0(AppNoGpsStartSportFragment appNoGpsStartSportFragment) {
        return (ImageView) appNoGpsStartSportFragment.getMView().findViewById(R.id.cur_mode_icon);
    }

    public final ImageView getMCurModeIcon() {
        return (ImageView) this.mCurModeIcon$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Bundle arguments = getArguments();
        setMSportMode(arguments != null ? arguments.getInt(ARG_SPORT_MODE) : 0);
        if (bundle != null) {
            setMSportMode(bundle.getInt(ARG_SPORT_MODE, getMSportMode()));
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.course.BaseNoGpsSportV2Fragment, com.sma.smartv3.p610ui.sport.course.BaseSportV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        RelativeLayout root_view = getRoot_view();
        Intrinsics.O10IXXX0X(root_view, "<get-root_view>(...)");
        UtilsKt.IX1XiI(root_view, 40.0f);
        getIvBg().setImageResource(R.drawable.pic_indoor);
        getMCurModeIcon().setVisibility(0);
        ImageView mCurModeIcon = getMCurModeIcon();
        Activity mActivity = getMActivity();
        SportRecordData sportRecordData = new SportRecordData();
        sportRecordData.setMMode(getMSportMode());
        Unit unit = Unit.OXO1;
        mCurModeIcon.setImageResource(SportRecordDataKt.getWorkoutImage(mActivity, sportRecordData));
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
