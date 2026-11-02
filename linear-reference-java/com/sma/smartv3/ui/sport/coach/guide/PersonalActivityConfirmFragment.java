package com.sma.smartv3.ui.sport.coach.guide;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.es1;
import com.android.mltcode.paycertificationapi.fs1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gs1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class PersonalActivityConfirmFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final Lazy mDuration$delegate;

    @aa1
    private final Lazy mLevelTv$delegate;

    @aa1
    private final Lazy mTipTitle$delegate;

    public PersonalActivityConfirmFragment() {
        this.mLevelTv$delegate = LazyKt__LazyJVMKt.iO(new es1(this));
        this.mDuration$delegate = LazyKt__LazyJVMKt.iO(new fs1(this));
        this.mTipTitle$delegate = LazyKt__LazyJVMKt.iO(new gs1(this));
    }

    public static /* synthetic */ TextView XIi00iiXO(PersonalActivityConfirmFragment r0) {
        return mTipTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XO0O10(PersonalActivityConfirmFragment r0) {
        return mDuration_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iO(PersonalActivityConfirmFragment r0) {
        return mLevelTv_delegate$lambda$0(r0);
    }

    private static final TextView mDuration_delegate$lambda$0(PersonalActivityConfirmFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.assessment_duration);
    }

    private static final TextView mLevelTv_delegate$lambda$0(PersonalActivityConfirmFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.assessment_you_level);
    }

    private static final TextView mTipTitle_delegate$lambda$0(PersonalActivityConfirmFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.start_title_tv);
    }

    public final TextView getMDuration() {
        return (TextView) getValue();
    }

    public final TextView getMLevelTv() {
        return (TextView) getValue();
    }

    public final TextView getMTipTitle() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        CharSequence r1 = getMTipTitle().getText();
        SpannableString r0 = new SpannableString(r1);
        ForegroundColorSpan r7 = new ForegroundColorSpan(gk4.iO(getMTipTitle().getContext(), R.color.text_color));
        Intrinsics.XXI(r1);
        String r2 = getString(R.string.next);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        int r3 = StringsKt__StringsKt.OO1101010(r1, r2, 0, false, 6, null) - 1;
        r0.setSpan(r7, r3, (getString(R.string.next).length() + r3) + 1, 33);
        getMTipTitle().setText(r0);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_personal_assessment_cofirm;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        TextView r0 = getMLevelTv();
        AICoachManage.OXO1 r1 = AICoachManage.IiI10X;
        int r2 = r1.OXO1().X0O().getLevel();
        if (r2 != 2) goto L5;
        String r3 = getString(R.string.coach_rank_elementary);
    L15:
        r0.setText(r3);
        getMDuration().setText(r1.OXO1().X0O().getWeeklyTargetNumber() + " " + getString(R.string.week));
        return;
    L5:
        if (r2 != 3) goto L7;
        r3 = getString(R.string.coach_rank_intermediate);
        goto L15
    L7:
        if (r2 != 4) goto L9;
        r3 = getString(R.string.coach_rank_challenger);
        goto L15
    L9:
        if (r2 == 5) goto L11;
        r3 = getString(R.string.coach_rank_beginner);
        goto L15
    L11:
        r3 = getString(R.string.coach_rank_athletic);
        goto L15
    }
}
