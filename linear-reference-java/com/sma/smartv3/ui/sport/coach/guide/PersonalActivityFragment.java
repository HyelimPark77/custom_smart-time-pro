package com.sma.smartv3.ui.sport.coach.guide;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.hs1;
import com.android.mltcode.paycertificationapi.is1;
import com.android.mltcode.paycertificationapi.js1;
import com.android.mltcode.paycertificationapi.ks1;
import com.android.mltcode.paycertificationapi.ls1;
import com.android.mltcode.paycertificationapi.ms1;
import com.android.mltcode.paycertificationapi.ns1;
import com.android.mltcode.paycertificationapi.os1;
import com.android.mltcode.paycertificationapi.ps1;
import com.android.mltcode.paycertificationapi.qs1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseFragment;
import com.github.appintro.SlideSelectionListener;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import com.sma.smartv3.util.UtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPersonalActivityFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n99#2,7:125\n106#2,3:133\n79#2,7:136\n109#2:143\n1#3:132\n*S KotlinDebug\n*F\n+ 1 PersonalActivityFragment.kt\ncom/sma/smartv3/ui/sport/coach/guide/PersonalActivityFragment\n*L\n54#1:125,7\n54#1:133,3\n54#1:136,7\n54#1:143\n54#1:132\n*E\n"})
public final class PersonalActivityFragment extends BaseFragment implements SlideSelectionListener {
    private boolean isSpan;

    @aa1
    private final Lazy mAthleticView$delegate;

    @aa1
    private final Lazy mBeginnerView$delegate;

    @aa1
    private final Lazy mChallengerView$delegate;

    @aa1
    private final Lazy mElementaryView$delegate;

    @aa1
    private final Lazy mGoalView$delegate;

    @aa1
    private final Lazy mIntermediateView$delegate;

    @aa1
    private final Lazy mLayoutView$delegate;

    @aa1
    private final Lazy mTipImgView$delegate;

    @aa1
    private final Lazy mTipTitle$delegate;

    public PersonalActivityFragment() {
        this.mBeginnerView$delegate = LazyKt__LazyJVMKt.iO(new hs1(this));
        this.mElementaryView$delegate = LazyKt__LazyJVMKt.iO(new is1(this));
        this.mIntermediateView$delegate = LazyKt__LazyJVMKt.iO(new js1(this));
        this.mChallengerView$delegate = LazyKt__LazyJVMKt.iO(new ks1(this));
        this.mAthleticView$delegate = LazyKt__LazyJVMKt.iO(new ls1(this));
        this.mGoalView$delegate = LazyKt__LazyJVMKt.iO(new ms1(this));
        this.mTipTitle$delegate = LazyKt__LazyJVMKt.iO(new ns1(this));
        this.mLayoutView$delegate = LazyKt__LazyJVMKt.iO(new os1(this));
        this.mTipImgView$delegate = LazyKt__LazyJVMKt.iO(new ps1(this));
    }

    public static /* synthetic */ View I0IIOi(PersonalActivityFragment r0) {
        return mTipImgView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IO(PersonalActivityFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView IiI10X(PersonalActivityFragment r0) {
        return mBeginnerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O00(PersonalActivityFragment r0) {
        return mTipTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(PersonalActivityFragment r0) {
        return mIntermediateView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIi0(PersonalActivityFragment r0) {
        return mAthleticView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XIi00iiXO(PersonalActivityFragment r0) {
        return mChallengerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XO0O10(PersonalActivityFragment r0) {
        return mGoalView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XOO0ii0(PersonalActivityFragment r0) {
        return mLayoutView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iO(PersonalActivityFragment r0) {
        return mElementaryView_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(PersonalActivityFragment r3, View r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", "https://api.iot-solution.net/web/help/ai_coach_about_mets.html");
        r5.putInt("mArg1", 2);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), WebViewActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
    }

    private static final TextView mAthleticView_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.coach_rank_athletic_tv);
    }

    private static final TextView mBeginnerView_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.coach_rank_beginner_tv);
    }

    private static final TextView mChallengerView_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.coach_rank_challenger_tv);
    }

    private static final TextView mElementaryView_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.coach_rank_elementary_tv);
    }

    private static final TextView mGoalView_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.personal_goal_tv);
    }

    private static final TextView mIntermediateView_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.coach_rank_intermediate_tv);
    }

    private static final View mLayoutView_delegate$lambda$0(PersonalActivityFragment r1) {
        return r1.getMView().findViewById(R.id.btn_layout_view);
    }

    private static final View mTipImgView_delegate$lambda$0(PersonalActivityFragment r1) {
        return r1.getMView().findViewById(R.id.personal_tip_img);
    }

    private static final TextView mTipTitle_delegate$lambda$0(PersonalActivityFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.start_title_tv);
    }

    private final void setRank(int r11) {
        getMBeginnerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView r0 = getMBeginnerView();
        Intrinsics.O10IXXX0X(r0, "<get-mBeginnerView>(...)");
        setTextSpannableString(r0, 1.0f);
        getMElementaryView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView r1 = getMElementaryView();
        Intrinsics.O10IXXX0X(r1, "<get-mElementaryView>(...)");
        setTextSpannableString(r1, 1.0f);
        getMIntermediateView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView r2 = getMIntermediateView();
        Intrinsics.O10IXXX0X(r2, "<get-mIntermediateView>(...)");
        setTextSpannableString(r2, 1.0f);
        getMChallengerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView r3 = getMChallengerView();
        Intrinsics.O10IXXX0X(r3, "<get-mChallengerView>(...)");
        setTextSpannableString(r3, 1.0f);
        getMAthleticView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.line_color));
        TextView r4 = getMAthleticView();
        Intrinsics.O10IXXX0X(r4, "<get-mAthleticView>(...)");
        setTextSpannableString(r4, 1.0f);
        if (r11 == 1) goto L16;
        if (r11 != 2) goto L6;
        TextView r12 = getMElementaryView();
        Intrinsics.O10IXXX0X(r12, "<get-mElementaryView>(...)");
        setTextSpannableString$default(this, r12, 0.0f, 2, null);
        getMElementaryView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
    L17:
        this.isSpan = true;
        return;
    L6:
        if (r11 != 3) goto L8;
        TextView r13 = getMIntermediateView();
        Intrinsics.O10IXXX0X(r13, "<get-mIntermediateView>(...)");
        setTextSpannableString$default(this, r13, 0.0f, 2, null);
        getMIntermediateView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        goto L17
    L8:
        if (r11 != 4) goto L10;
        TextView r14 = getMChallengerView();
        Intrinsics.O10IXXX0X(r14, "<get-mChallengerView>(...)");
        setTextSpannableString$default(this, r14, 0.0f, 2, null);
        getMChallengerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        goto L17
    L10:
        if (r11 != 5) goto L17;
        TextView r15 = getMAthleticView();
        Intrinsics.O10IXXX0X(r15, "<get-mAthleticView>(...)");
        setTextSpannableString$default(this, r15, 0.0f, 2, null);
        getMAthleticView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        goto L17
    L16:
        TextView r16 = getMBeginnerView();
        Intrinsics.O10IXXX0X(r16, "<get-mBeginnerView>(...)");
        setTextSpannableString$default(this, r16, 0.0f, 2, null);
        getMBeginnerView().setTextColor(gk4.O00(getMBeginnerView().getContext(), R.color.text_color));
        goto L17
    }

    public static /* synthetic */ void setRank$default(PersonalActivityFragment r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 1;
    L5:
        r0.setRank(r1);
    }

    private final void setTextSpannableString(TextView r5, float r6) {
        if (this.isSpan == true) goto L5;
    L7:
        CharSequence r0 = r5.getText();
        SpannableString r1 = new SpannableString(r0);
        r1.setSpan(new RelativeSizeSpan(r6), 0, r0.length(), 33);
        r5.setText(r1);
        return;
    L5:
        if (r6 != 1.3f) goto L7;
    }

    public static /* synthetic */ void setTextSpannableString$default(PersonalActivityFragment r0, TextView r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 1.3f;
    L5:
        r0.setTextSpannableString(r1, r2);
    }

    public final TextView getMAthleticView() {
        return (TextView) getValue();
    }

    public final TextView getMBeginnerView() {
        return (TextView) getValue();
    }

    public final TextView getMChallengerView() {
        return (TextView) getValue();
    }

    public final TextView getMElementaryView() {
        return (TextView) getValue();
    }

    public final TextView getMGoalView() {
        return (TextView) getValue();
    }

    public final TextView getMIntermediateView() {
        return (TextView) getValue();
    }

    public final View getMLayoutView() {
        return (View) getValue();
    }

    public final View getMTipImgView() {
        return (View) getValue();
    }

    public final TextView getMTipTitle() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMLayoutView();
        Intrinsics.O10IXXX0X(r0, "<get-mLayoutView>(...)");
        UtilsKt.IX1XiI(r0, 24.0f);
        CharSequence r1 = getMTipTitle().getText();
        SpannableString r2 = new SpannableString(r1);
        ForegroundColorSpan r7 = new ForegroundColorSpan(gk4.iO(getMTipTitle().getContext(), R.color.line_color));
        Intrinsics.XXI(r1);
        String r3 = getString(R.string.btn_start);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        r2.setSpan(r7, 0, StringsKt__StringsKt.OO1101010(r1, r3, 0, false, 6, null) - 1, 33);
        getMTipTitle().setText(r2);
        getMTipImgView().setOnClickListener(new qs1(this));
    }

    public final boolean isSpan() {
        return this.isSpan;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_personal_assessment;
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideDeselected() {
    }

    @Override // com.github.appintro.SlideSelectionListener
    public void onSlideSelected() {
        TextView r0 = getMGoalView();
        AICoachManage.OXO1 r1 = AICoachManage.IiI10X;
        r0.setText(String.valueOf((int) r1.OXO1().X0O().getPlanTarget()));
        setRank(r1.OXO1().X0O().getLevel());
    }

    public final void setSpan(boolean r1) {
        this.isSpan = r1;
    }
}
