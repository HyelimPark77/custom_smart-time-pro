package com.sma.smartv3.p610ui.sport.coach.guide;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.guide.PersonalActivityFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPersonalActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n99#2,7:125\n106#2,3:133\n79#2,7:136\n109#2:143\n1#3:132\n*S KotlinDebug\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n*L\n54#1:125,7\n54#1:133,3\n54#1:136,7\n54#1:143\n54#1:132\n*E\n"})
public final class PersonalActivityFragment extends BaseFragment implements SlideSelectionListener {
    private boolean isSpan;

    @aa1
    private final Lazy mBeginnerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hs1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mBeginnerView_delegate$lambda$0(this.f7189IO);
        }
    });

    @aa1
    private final Lazy mElementaryView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.is1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mElementaryView_delegate$lambda$0(this.f8747IO);
        }
    });

    @aa1
    private final Lazy mIntermediateView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.js1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mIntermediateView_delegate$lambda$0(this.f9031IO);
        }
    });

    @aa1
    private final Lazy mChallengerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ks1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mChallengerView_delegate$lambda$0(this.f9268IO);
        }
    });

    @aa1
    private final Lazy mAthleticView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ls1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mAthleticView_delegate$lambda$0(this.f9505IO);
        }
    });

    @aa1
    private final Lazy mGoalView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ms1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mGoalView_delegate$lambda$0(this.f9774IO);
        }
    });

    @aa1
    private final Lazy mTipTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ns1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mTipTitle_delegate$lambda$0(this.f10005IO);
        }
    });

    @aa1
    private final Lazy mLayoutView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.os1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mLayoutView_delegate$lambda$0(this.f10212IO);
        }
    });

    @aa1
    private final Lazy mTipImgView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ps1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PersonalActivityFragment.mTipImgView_delegate$lambda$0(this.f10427IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PersonalActivityFragment personalActivityFragment, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/web/help/ai_coach_about_mets.html");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(personalActivityFragment.getActivity(), (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        personalActivityFragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mAthleticView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.coach_rank_athletic_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mBeginnerView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.coach_rank_beginner_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mChallengerView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.coach_rank_challenger_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mElementaryView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.coach_rank_elementary_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mGoalView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.personal_goal_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mIntermediateView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.coach_rank_intermediate_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mLayoutView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return personalActivityFragment.getMView().findViewById(R.id.btn_layout_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mTipImgView_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return personalActivityFragment.getMView().findViewById(R.id.personal_tip_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTipTitle_delegate$lambda$0(PersonalActivityFragment personalActivityFragment) {
        return (TextView) personalActivityFragment.getMView().findViewById(R.id.start_title_tv);
    }

    private final void setRank(int i) {
        getMBeginnerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView mBeginnerView = getMBeginnerView();
        Intrinsics.O10IXXX0X(mBeginnerView, "<get-mBeginnerView>(...)");
        setTextSpannableString(mBeginnerView, 1.0f);
        getMElementaryView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView mElementaryView = getMElementaryView();
        Intrinsics.O10IXXX0X(mElementaryView, "<get-mElementaryView>(...)");
        setTextSpannableString(mElementaryView, 1.0f);
        getMIntermediateView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView mIntermediateView = getMIntermediateView();
        Intrinsics.O10IXXX0X(mIntermediateView, "<get-mIntermediateView>(...)");
        setTextSpannableString(mIntermediateView, 1.0f);
        getMChallengerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView mChallengerView = getMChallengerView();
        Intrinsics.O10IXXX0X(mChallengerView, "<get-mChallengerView>(...)");
        setTextSpannableString(mChallengerView, 1.0f);
        getMAthleticView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView mAthleticView = getMAthleticView();
        Intrinsics.O10IXXX0X(mAthleticView, "<get-mAthleticView>(...)");
        setTextSpannableString(mAthleticView, 1.0f);
        if (i == 1) {
            TextView mBeginnerView2 = getMBeginnerView();
            Intrinsics.O10IXXX0X(mBeginnerView2, "<get-mBeginnerView>(...)");
            setTextSpannableString$default(this, mBeginnerView2, 0.0f, 2, null);
            getMBeginnerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        } else if (i == 2) {
            TextView mElementaryView2 = getMElementaryView();
            Intrinsics.O10IXXX0X(mElementaryView2, "<get-mElementaryView>(...)");
            setTextSpannableString$default(this, mElementaryView2, 0.0f, 2, null);
            getMElementaryView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        } else if (i == 3) {
            TextView mIntermediateView2 = getMIntermediateView();
            Intrinsics.O10IXXX0X(mIntermediateView2, "<get-mIntermediateView>(...)");
            setTextSpannableString$default(this, mIntermediateView2, 0.0f, 2, null);
            getMIntermediateView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        } else if (i == 4) {
            TextView mChallengerView2 = getMChallengerView();
            Intrinsics.O10IXXX0X(mChallengerView2, "<get-mChallengerView>(...)");
            setTextSpannableString$default(this, mChallengerView2, 0.0f, 2, null);
            getMChallengerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        } else if (i == 5) {
            TextView mAthleticView2 = getMAthleticView();
            Intrinsics.O10IXXX0X(mAthleticView2, "<get-mAthleticView>(...)");
            setTextSpannableString$default(this, mAthleticView2, 0.0f, 2, null);
            getMAthleticView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        }
        this.isSpan = true;
    }

    public static /* synthetic */ void setRank$default(PersonalActivityFragment personalActivityFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        personalActivityFragment.setRank(i);
    }

    private final void setTextSpannableString(TextView textView, float f) {
        if (this.isSpan && f == 1.3f) {
            return;
        }
        CharSequence text = textView.getText();
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new RelativeSizeSpan(f), 0, text.length(), 33);
        textView.setText(spannableString);
    }

    public static /* synthetic */ void setTextSpannableString$default(PersonalActivityFragment personalActivityFragment, TextView textView, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.3f;
        }
        personalActivityFragment.setTextSpannableString(textView, f);
    }

    public final TextView getMAthleticView() {
        return (TextView) this.mAthleticView$delegate.getValue();
    }

    public final TextView getMBeginnerView() {
        return (TextView) this.mBeginnerView$delegate.getValue();
    }

    public final TextView getMChallengerView() {
        return (TextView) this.mChallengerView$delegate.getValue();
    }

    public final TextView getMElementaryView() {
        return (TextView) this.mElementaryView$delegate.getValue();
    }

    public final TextView getMGoalView() {
        return (TextView) this.mGoalView$delegate.getValue();
    }

    public final TextView getMIntermediateView() {
        return (TextView) this.mIntermediateView$delegate.getValue();
    }

    public final View getMLayoutView() {
        return (View) this.mLayoutView$delegate.getValue();
    }

    public final View getMTipImgView() {
        return (View) this.mTipImgView$delegate.getValue();
    }

    public final TextView getMTipTitle() {
        return (TextView) this.mTipTitle$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        View mLayoutView = getMLayoutView();
        Intrinsics.O10IXXX0X(mLayoutView, "<get-mLayoutView>(...)");
        UtilsKt.IX1XiI(mLayoutView, 24.0f);
        CharSequence text = getMTipTitle().getText();
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(gk4.m1859iO(getMTipTitle().getContext(), R.color.line_color));
        Intrinsics.XXI(text);
        String string = getString(R.string.btn_start);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        spannableString.setSpan(foregroundColorSpan, 0, StringsKt__StringsKt.OO1101010(text, string, 0, false, 6, null) - 1, 33);
        getMTipTitle().setText(spannableString);
        getMTipImgView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.qs1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalActivityFragment.initView$lambda$0(this.f10668IO, view);
            }
        });
    }

    public final boolean isSpan() {
        return this.isSpan;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.ai_coach_personal_assessment;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        TextView mGoalView = getMGoalView();
        AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
        mGoalView.setText(String.valueOf((int) oxo1.OXO1().X0O().getPlanTarget()));
        setRank(oxo1.OXO1().X0O().getLevel());
    }

    public final void setSpan(boolean z) {
        this.isSpan = z;
    }
}
