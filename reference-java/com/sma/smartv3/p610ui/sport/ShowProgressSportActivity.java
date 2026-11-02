package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXiOOOX;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p608db.entity.SportData;
import com.sma.smartv3.p610ui.sport.ShowProgressSportActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.NewSportButtonProgress;
import com.sma.smartv3.view.bubbleview.ArrowDirection;
import com.sma.smartv3.view.bubbleview.BubbleLayout;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ShowProgressSportActivity extends BaseSportOnGoingActivity {

    @aa1
    private final Lazy mSportButtonProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tb4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.mSportButtonProgress_delegate$lambda$0(this.f11228IO);
        }
    });

    @aa1
    private final Lazy sportGoalLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ub4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.sportGoalLayout_delegate$lambda$0(this.f11456IO);
        }
    });

    @aa1
    private final Lazy sportGoalProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vb4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.sportGoalProgress_delegate$lambda$0(this.f11689IO);
        }
    });

    @aa1
    private final Lazy sportGoalValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wb4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.sportGoalValue_delegate$lambda$0(this.f11920IO);
        }
    });

    @aa1
    private final Lazy sportTopBgLL$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xb4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.sportTopBgLL_delegate$lambda$0(this.f12143IO);
        }
    });

    @aa1
    private final Lazy sportTopBgIcon$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yb4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.sportTopBgIcon_delegate$lambda$0(this.f12346IO);
        }
    });

    @aa1
    private final Lazy sportThreeLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zb4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ShowProgressSportActivity.sportThreeLayout_delegate$lambda$0(this.f12581IO);
        }
    });

    public static final class OXO1 implements NewSportButtonProgress.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.view.NewSportButtonProgress.XIi00iiXO
        public void start() {
            if (3 != XO0O10.OXO1.O001I()) {
                ShowProgressSportActivity.this.sportPause();
            } else {
                ShowProgressSportActivity.this.sportResume();
            }
            ShowProgressSportActivity.this.setSportEndProgressImage();
        }
    }

    public static final class XIi00iiXO implements NewSportButtonProgress.InterfaceC19066iO {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.view.NewSportButtonProgress.InterfaceC19066iO
        public void start(boolean z) {
            if (z) {
                ShowProgressSportActivity.this.showLongPressTip();
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.ShowProgressSportActivity$iO */
    public static final class C18961iO implements NewSportButtonProgress.OXO1 {
        public C18961iO() {
        }

        @Override // com.sma.smartv3.view.NewSportButtonProgress.OXO1
        public void end() {
            ShowProgressSportActivity.this.stopSport(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewSportButtonProgress mSportButtonProgress_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return (NewSportButtonProgress) showProgressSportActivity.findViewById(R.id.sportEndProgressV2);
    }

    private final void setButtonProgress() {
        getMSportButtonProgress().IiI10X(new OXO1());
        getMSportButtonProgress().XXI(new XIi00iiXO());
        getMSportButtonProgress().XO0O10(new C18961iO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSportEndProgressImage() {
        getMSportButtonProgress().setCenterBitmap(3 != XO0O10.OXO1.O001I() ? R.drawable.icon_run_pause : R.drawable.icon_run_start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLongPressTip$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        PopupWindow mLongPressPopup = showProgressSportActivity.getMLongPressPopup();
        if (mLongPressPopup != null) {
            mLongPressPopup.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout sportGoalLayout_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return (RelativeLayout) showProgressSportActivity.findViewById(R.id.sport_goal_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressBar sportGoalProgress_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return (ProgressBar) showProgressSportActivity.findViewById(R.id.sport_goal_pb_progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sportGoalValue_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return (TextView) showProgressSportActivity.findViewById(R.id.sport_goal_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View sportThreeLayout_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return showProgressSportActivity.findViewById(R.id.sportThreeShowValueLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView sportTopBgIcon_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return (ImageView) showProgressSportActivity.findViewById(R.id.top_bg_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView sportTopBgLL_delegate$lambda$0(ShowProgressSportActivity showProgressSportActivity) {
        return (ImageView) showProgressSportActivity.findViewById(R.id.top_bg);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity
    public void changeDeviceConnectStatus(boolean z) {
        super.changeDeviceConnectStatus(z);
        if (z || !q62.OXO1.XI1OX0IO()) {
            return;
        }
        stopSport(false);
    }

    public final NewSportButtonProgress getMSportButtonProgress() {
        return (NewSportButtonProgress) this.mSportButtonProgress$delegate.getValue();
    }

    public final RelativeLayout getSportGoalLayout() {
        return (RelativeLayout) this.sportGoalLayout$delegate.getValue();
    }

    public final ProgressBar getSportGoalProgress() {
        return (ProgressBar) this.sportGoalProgress$delegate.getValue();
    }

    public final TextView getSportGoalValue() {
        return (TextView) this.sportGoalValue$delegate.getValue();
    }

    public final View getSportThreeLayout() {
        return (View) this.sportThreeLayout$delegate.getValue();
    }

    public final ImageView getSportTopBgIcon() {
        return (ImageView) this.sportTopBgIcon$delegate.getValue();
    }

    public final ImageView getSportTopBgLL() {
        return (ImageView) this.sportTopBgLL$delegate.getValue();
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity
    public void handleSportState(int i) {
        getMSportButtonProgress().setCenterBitmap(3 != XO0O10.OXO1.O001I() ? R.drawable.icon_run_pause : R.drawable.icon_run_start);
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity
    public void hideViewFeature(boolean z) {
        super.hideViewFeature(z);
        if (z) {
            getSportThreeLayout().setVisibility(8);
            getSportThreeLayout().setVisibility(8);
        } else {
            getSportThreeLayout().setVisibility(0);
            getSportThreeLayout().setVisibility(0);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        transparentStatusBar();
        int i = 8;
        getSportPause().setVisibility(8);
        ImageView sportTopBgLL = getSportTopBgLL();
        if (a15.m1445iO(getMArg1())) {
            getSportTopBgIcon().setVisibility(8);
        } else {
            getSportTopBgIcon().setVisibility(0);
            i = 0;
        }
        sportTopBgLL.setVisibility(i);
        ImageView sportTopBgIcon = getSportTopBgIcon();
        SportRecordData sportRecordData = new SportRecordData();
        sportRecordData.setMMode(getMArg1());
        Unit unit = Unit.OXO1;
        sportTopBgIcon.setImageResource(SportRecordDataKt.getWorkoutImage(this, sportRecordData));
        getSportTopBgLL().setImageResource(R.drawable.pic_indoor);
        setButtonProgress();
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sport_on_going_v2;
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity
    public void setSportOneShowValue(float f) {
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity
    public void showGoalProgress(@aa1 SportDataType key, @aa1 SportData sportData) {
        Intrinsics.X0O(key, "key");
        Intrinsics.X0O(sportData, "sportData");
        if (getGoals()[0] == 0 && getGoals()[1] == 0 && getGoals()[2] == 0) {
            getSportGoalLayout().setVisibility(8);
            return;
        }
        getSportGoalLayout().setVisibility(0);
        if (getGoals()[0] != 0 && key == SportDataType.DISTANCE) {
            getSportGoalProgress().setMax(getGoals()[0]);
            getSportGoalProgress().setProgress(sportData.getMDistance());
            float fO10IXXX0X = cp5.O10IXXX0X(sportData.getMDistance(), getUserProfile().getUnit());
            float fO10IXXX0X2 = cp5.O10IXXX0X(getGoals()[0], getUserProfile().getUnit());
            getSportGoalValue().setText(fO10IXXX0X + "/" + fO10IXXX0X2 + getString(cp5.XX0(getUserProfile().getUnit())));
            return;
        }
        if (getGoals()[1] != 0) {
            getSportGoalProgress().setMax(getGoals()[1]);
            getSportGoalProgress().setProgress(sportData.getMDuration());
            getSportGoalValue().setText(O0X11OiO.iXiX011(sportData.getMDuration() * 1000) + "/" + O0X11OiO.iXiX011(getGoals()[1] * 1000) + getString(R.string.time));
            return;
        }
        if (getGoals()[2] != 0) {
            getSportGoalProgress().setMax(getGoals()[2] * 1000);
            getSportGoalProgress().setProgress(sportData.getMCalorie() * 1000);
            getSportGoalValue().setText(sportData.getMCalorie() + "/" + getGoals()[2] + getString(R.string.calories));
        }
    }

    @Override // com.sma.smartv3.p610ui.sport.BaseSportOnGoingActivity
    public void showLongPressTip() {
        PopupWindow mLongPressPopup = getMLongPressPopup();
        if (mLongPressPopup == null || !mLongPressPopup.isShowing()) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.layout_bubble, (ViewGroup) null);
            Intrinsics.X1ii(viewInflate, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout");
            BubbleLayout bubbleLayout = (BubbleLayout) viewInflate;
            bubbleLayout.measure(0, 0);
            ((TextView) bubbleLayout.findViewById(R.id.f51423tv)).setText(R.string.long_press_end);
            bubbleLayout.requestLayout();
            setMLongPressPopup(XXiOOOX.OXO1(getMContext(), bubbleLayout));
            bubbleLayout.O00(ArrowDirection.BOTTOM);
            PopupWindow mLongPressPopup2 = getMLongPressPopup();
            if (mLongPressPopup2 != null) {
                mLongPressPopup2.setOutsideTouchable(false);
            }
            int measuredWidth = (getMSportButtonProgress().getMeasuredWidth() - bubbleLayout.getMeasuredWidth()) / 2;
            int i = -(getMSportButtonProgress().getMeasuredHeight() + bubbleLayout.getMeasuredHeight() + SizeUtils.dp2px(4.0f));
            bubbleLayout.XOO0ii0((bubbleLayout.getMeasuredWidth() - bubbleLayout.getArrowWidth()) / 2.0f);
            PopupWindow mLongPressPopup3 = getMLongPressPopup();
            if (mLongPressPopup3 != null) {
                mLongPressPopup3.showAsDropDown(getMSportButtonProgress(), measuredWidth, i);
            }
            new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.sb4
                @Override // java.lang.Runnable
                public final void run() {
                    ShowProgressSportActivity.showLongPressTip$lambda$0(this.f10997IO);
                }
            }, 3000L);
        }
    }
}
