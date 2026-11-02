package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
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
import com.android.mltcode.paycertificationapi.sb4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tb4;
import com.android.mltcode.paycertificationapi.ub4;
import com.android.mltcode.paycertificationapi.vb4;
import com.android.mltcode.paycertificationapi.wb4;
import com.android.mltcode.paycertificationapi.xb4;
import com.android.mltcode.paycertificationapi.yb4;
import com.android.mltcode.paycertificationapi.zb4;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.db.entity.SportData;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.NewSportButtonProgress;
import com.sma.smartv3.view.bubbleview.ArrowDirection;
import com.sma.smartv3.view.bubbleview.BubbleLayout;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ShowProgressSportActivity extends BaseSportOnGoingActivity {

    @aa1
    private final Lazy mSportButtonProgress$delegate;

    @aa1
    private final Lazy sportGoalLayout$delegate;

    @aa1
    private final Lazy sportGoalProgress$delegate;

    @aa1
    private final Lazy sportGoalValue$delegate;

    @aa1
    private final Lazy sportThreeLayout$delegate;

    @aa1
    private final Lazy sportTopBgIcon$delegate;

    @aa1
    private final Lazy sportTopBgLL$delegate;

    public static final class OXO1 implements NewSportButtonProgress.XIi00iiXO {
        public final /* synthetic */ ShowProgressSportActivity OXO1;

        public OXO1(ShowProgressSportActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.NewSportButtonProgress.XIi00iiXO
        public void start() {
            if (3 == XO0O10.OXO1.O001I()) goto L5;
            this.OXO1.sportPause();
        L6:
            ShowProgressSportActivity.access$setSportEndProgressImage(this.OXO1);
            return;
        L5:
            this.OXO1.sportResume();
            goto L6
        }
    }

    public static final class XIi00iiXO implements NewSportButtonProgress.iO {
        public final /* synthetic */ ShowProgressSportActivity OXO1;

        public XIi00iiXO(ShowProgressSportActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.NewSportButtonProgress.iO
        public void start(boolean r1) {
            if (r1 == false) goto L5;
            this.OXO1.showLongPressTip();
            return;
        }
    }

    public static final class iO implements NewSportButtonProgress.OXO1 {
        public final /* synthetic */ ShowProgressSportActivity OXO1;

        public iO(ShowProgressSportActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.NewSportButtonProgress.OXO1
        public void end() {
            this.OXO1.stopSport(true);
        }
    }

    public ShowProgressSportActivity() {
        this.mSportButtonProgress$delegate = LazyKt__LazyJVMKt.iO(new tb4(this));
        this.sportGoalLayout$delegate = LazyKt__LazyJVMKt.iO(new ub4(this));
        this.sportGoalProgress$delegate = LazyKt__LazyJVMKt.iO(new vb4(this));
        this.sportGoalValue$delegate = LazyKt__LazyJVMKt.iO(new wb4(this));
        this.sportTopBgLL$delegate = LazyKt__LazyJVMKt.iO(new xb4(this));
        this.sportTopBgIcon$delegate = LazyKt__LazyJVMKt.iO(new yb4(this));
        this.sportThreeLayout$delegate = LazyKt__LazyJVMKt.iO(new zb4(this));
    }

    public static /* synthetic */ ImageView OO(ShowProgressSportActivity r0) {
        return sportTopBgLL_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OX110i(ShowProgressSportActivity r0) {
        return sportThreeLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X00XIX1(ShowProgressSportActivity r0) {
        return sportTopBgIcon_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X100O(ShowProgressSportActivity r0) {
        showLongPressTip$lambda$0(r0);
    }

    public static /* synthetic */ ProgressBar XOX0O0(ShowProgressSportActivity r0) {
        return sportGoalProgress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NewSportButtonProgress XX1Oi(ShowProgressSportActivity r0) {
        return mSportButtonProgress_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$setSportEndProgressImage(ShowProgressSportActivity r0) {
        r0.setSportEndProgressImage();
    }

    public static /* synthetic */ TextView i0X000X0O(ShowProgressSportActivity r0) {
        return sportGoalValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout iOiXi11II(ShowProgressSportActivity r0) {
        return sportGoalLayout_delegate$lambda$0(r0);
    }

    private static final NewSportButtonProgress mSportButtonProgress_delegate$lambda$0(ShowProgressSportActivity r1) {
        return (NewSportButtonProgress) r1.findViewById(R.id.sportEndProgressV2);
    }

    private final void setButtonProgress() {
        getMSportButtonProgress().IiI10X(new OXO1(this));
        getMSportButtonProgress().XXI(new XIi00iiXO(this));
        getMSportButtonProgress().XO0O10(new iO(this));
    }

    private final void setSportEndProgressImage() {
        NewSportButtonProgress r0 = getMSportButtonProgress();
        if (3 == XO0O10.OXO1.O001I()) goto L5;
        int r1 = R.drawable.icon_run_pause;
    L6:
        r0.setCenterBitmap(r1);
        return;
    L5:
        r1 = R.drawable.icon_run_start;
        goto L6
    }

    private static final void showLongPressTip$lambda$0(ShowProgressSportActivity r0) {
        PopupWindow r1 = r0.getMLongPressPopup();
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private static final RelativeLayout sportGoalLayout_delegate$lambda$0(ShowProgressSportActivity r1) {
        return (RelativeLayout) r1.findViewById(R.id.sport_goal_layout);
    }

    private static final ProgressBar sportGoalProgress_delegate$lambda$0(ShowProgressSportActivity r1) {
        return (ProgressBar) r1.findViewById(R.id.sport_goal_pb_progress);
    }

    private static final TextView sportGoalValue_delegate$lambda$0(ShowProgressSportActivity r1) {
        return (TextView) r1.findViewById(R.id.sport_goal_tv);
    }

    private static final View sportThreeLayout_delegate$lambda$0(ShowProgressSportActivity r1) {
        return r1.findViewById(R.id.sportThreeShowValueLayout);
    }

    private static final ImageView sportTopBgIcon_delegate$lambda$0(ShowProgressSportActivity r1) {
        return (ImageView) r1.findViewById(R.id.top_bg_icon);
    }

    private static final ImageView sportTopBgLL_delegate$lambda$0(ShowProgressSportActivity r1) {
        return (ImageView) r1.findViewById(R.id.top_bg);
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity
    public void changeDeviceConnectStatus(boolean r1) {
        super.changeDeviceConnectStatus(r1);
        if (r1 == false) goto L5;
        return;
    L5:
        if (q62.OXO1.XI1OX0IO() == false) goto L9;
        stopSport(false);
        return;
    }

    public final NewSportButtonProgress getMSportButtonProgress() {
        return (NewSportButtonProgress) getValue();
    }

    public final RelativeLayout getSportGoalLayout() {
        return (RelativeLayout) getValue();
    }

    public final ProgressBar getSportGoalProgress() {
        return (ProgressBar) getValue();
    }

    public final TextView getSportGoalValue() {
        return (TextView) getValue();
    }

    public final View getSportThreeLayout() {
        return (View) getValue();
    }

    public final ImageView getSportTopBgIcon() {
        return (ImageView) getValue();
    }

    public final ImageView getSportTopBgLL() {
        return (ImageView) getValue();
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity
    public void handleSportState(int r3) {
        NewSportButtonProgress r4 = getMSportButtonProgress();
        if (3 == XO0O10.OXO1.O001I()) goto L5;
        int r0 = R.drawable.icon_run_pause;
    L6:
        r4.setCenterBitmap(r0);
        return;
    L5:
        r0 = R.drawable.icon_run_start;
        goto L6
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity
    public void hideViewFeature(boolean r2) {
        super.hideViewFeature(r2);
        if (r2 == false) goto L6;
        getSportThreeLayout().setVisibility(8);
        getSportThreeLayout().setVisibility(8);
        return;
    L6:
        getSportThreeLayout().setVisibility(0);
        getSportThreeLayout().setVisibility(0);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        transparentStatusBar();
        int r1 = 8;
        getSportPause().setVisibility(8);
        ImageView r0 = getSportTopBgLL();
        if (a15.iO(getMArg1()) == false) goto L5;
        getSportTopBgIcon().setVisibility(8);
    L6:
        r0.setVisibility(r1);
        ImageView r2 = getSportTopBgIcon();
        SportRecordData r3 = new SportRecordData();
        r3.setMMode(getMArg1());
        Unit r4 = Unit.OXO1;
        r2.setImageResource(SportRecordDataKt.getWorkoutImage(this, r3));
        getSportTopBgLL().setImageResource(R.drawable.pic_indoor);
        setButtonProgress();
        return;
    L5:
        getSportTopBgIcon().setVisibility(0);
        r1 = 0;
        goto L6
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sport_on_going_v2;
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity
    public void setSportOneShowValue(float r1) {
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity
    public void showGoalProgress(@aa1 SportDataType r6, @aa1 SportData r7) {
        Intrinsics.X0O(r6, "key");
        Intrinsics.X0O(r7, "sportData");
        if (getGoals()[0] == 0) goto L5;
    L11:
        getSportGoalLayout().setVisibility(0);
        if (getGoals()[0] == 0) goto L18;
        if (r6 != SportDataType.DISTANCE) goto L18;
        getSportGoalProgress().setMax(getGoals()[0]);
        getSportGoalProgress().setProgress(r7.getMDistance());
        float r8 = cp5.O10IXXX0X(r7.getMDistance(), getUserProfile().getUnit());
        float r9 = cp5.O10IXXX0X(getGoals()[0], getUserProfile().getUnit());
        getSportGoalValue().setText(r8 + "/" + r9 + getString(cp5.XX0(getUserProfile().getUnit())));
        return;
    L18:
        if (getGoals()[1] == 0) goto L22;
        getSportGoalProgress().setMax(getGoals()[1]);
        getSportGoalProgress().setProgress(r7.getMDuration());
        getSportGoalValue().setText(O0X11OiO.iXiX011(r7.getMDuration() * 1000) + "/" + O0X11OiO.iXiX011(getGoals()[1] * 1000) + getString(R.string.time));
        return;
    L22:
        if (getGoals()[2] == 0) goto L25;
        getSportGoalProgress().setMax(getGoals()[2] * 1000);
        getSportGoalProgress().setProgress(r7.getMCalorie() * 1000);
        getSportGoalValue().setText(r7.getMCalorie() + "/" + getGoals()[2] + getString(R.string.calories));
        return;
    L25:
        return;
    L5:
        if (getGoals()[1] != 0) goto L11;
        if (getGoals()[2] != 0) goto L11;
        getSportGoalLayout().setVisibility(8);
    }

    @Override // com.sma.smartv3.ui.sport.BaseSportOnGoingActivity
    public void showLongPressTip() {
        PopupWindow r0 = getMLongPressPopup();
        if (r0 != null) goto L5;
    L7:
        View r1 = LayoutInflater.from(this).inflate(R.layout.layout_bubble, null);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type com.sma.smartv3.view.bubbleview.BubbleLayout");
        BubbleLayout r2 = (BubbleLayout) r1;
        r2.measure(0, 0);
        ((TextView) r2.findViewById(R.id.tv)).setText(R.string.long_press_end);
        r2.requestLayout();
        setMLongPressPopup(XXiOOOX.OXO1(getMContext(), r2));
        r2.O00(ArrowDirection.BOTTOM);
        PopupWindow r3 = getMLongPressPopup();
        if (r3 == null) goto L10;
        r3.setOutsideTouchable(false);
    L10:
        int r4 = (getMSportButtonProgress().getMeasuredWidth() - r2.getMeasuredWidth()) / 2;
        int r5 = -((getMSportButtonProgress().getMeasuredHeight() + r2.getMeasuredHeight()) + SizeUtils.dp2px(4.0f));
        r2.XOO0ii0((r2.getMeasuredWidth() - r2.getArrowWidth()) / 2.0f);
        PopupWindow r6 = getMLongPressPopup();
        if (r6 == null) goto L13;
        r6.showAsDropDown(getMSportButtonProgress(), r4, r5);
    L13:
        new Handler().postDelayed(new sb4(this), 3000);
        return;
    L5:
        if (r0.isShowing() != true) goto L7;
    }
}
