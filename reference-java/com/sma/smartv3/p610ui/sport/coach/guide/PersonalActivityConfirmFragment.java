package com.sma.smartv3.p610ui.sport.coach.guide;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.guide.PersonalActivityConfirmFragment;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class PersonalActivityConfirmFragment extends BaseFragment implements SlideSelectionListener {

    @aa1
    private final Lazy mLevelTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.es1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityConfirmFragment.mLevelTv_delegate$lambda$0(this.f6473IO);
        }
    });

    @aa1
    private final Lazy mDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fs1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityConfirmFragment.mDuration_delegate$lambda$0(this.f6717IO);
        }
    });

    @aa1
    private final Lazy mTipTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gs1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityConfirmFragment.mTipTitle_delegate$lambda$0(this.f6947IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mDuration_delegate$lambda$0(PersonalActivityConfirmFragment personalActivityConfirmFragment) {
        return (TextView) personalActivityConfirmFragment.getMView().findViewById(R.id.assessment_duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mLevelTv_delegate$lambda$0(PersonalActivityConfirmFragment personalActivityConfirmFragment) {
        return (TextView) personalActivityConfirmFragment.getMView().findViewById(R.id.assessment_you_level);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTipTitle_delegate$lambda$0(PersonalActivityConfirmFragment personalActivityConfirmFragment) {
        return (TextView) personalActivityConfirmFragment.getMView().findViewById(R.id.start_title_tv);
    }

    public final TextView getMDuration() {
        return (TextView) this.mDuration$delegate.getValue();
    }

    public final TextView getMLevelTv() {
        return (TextView) this.mLevelTv$delegate.getValue();
    }

    public final TextView getMTipTitle() {
        return (TextView) this.mTipTitle$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        CharSequence text = getMTipTitle().getText();
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(gk4.m1859iO(getMTipTitle().getContext(), R.color.text_color));
        Intrinsics.XXI(text);
        String string = getString(R.string.next);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        int iOO1101010 = StringsKt__StringsKt.OO1101010(text, string, 0, false, 6, null) - 1;
        spannableString.setSpan(foregroundColorSpan, iOO1101010, getString(R.string.next).length() + iOO1101010 + 1, 33);
        getMTipTitle().setText(spannableString);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.ai_coach_personal_assessment_cofirm;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        String string;
        TextView mLevelTv = getMLevelTv();
        AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
        int level = oxo1.OXO1().X0O().getLevel();
        if (level == 2) {
            string = getString(R.string.coach_rank_elementary);
        } else if (level == 3) {
            string = getString(R.string.coach_rank_intermediate);
        } else if (level != 4) {
            string = level != 5 ? getString(R.string.coach_rank_beginner) : getString(R.string.coach_rank_athletic);
        } else {
            string = getString(R.string.coach_rank_challenger);
        }
        mLevelTv.setText(string);
        getMDuration().setText(oxo1.OXO1().X0O().getWeeklyTargetNumber() + " " + getString(R.string.week));
    }
}
