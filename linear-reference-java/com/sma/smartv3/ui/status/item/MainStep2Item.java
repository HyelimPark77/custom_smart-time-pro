package com.sma.smartv3.ui.status.item;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.l30;
import com.android.mltcode.paycertificationapi.m30;
import com.android.mltcode.paycertificationapi.n30;
import com.android.mltcode.paycertificationapi.o30;
import com.android.mltcode.paycertificationapi.o65;
import com.android.mltcode.paycertificationapi.p30;
import com.android.mltcode.paycertificationapi.q30;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r30;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoalSettingActivity;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.status.CaloriesActivity;
import com.sma.smartv3.ui.status.DistanceActivity;
import com.sma.smartv3.ui.status.StepActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.Goal2ProgressBar;
import com.sma.smartv3.view.MarqueeTextView;
import com.sma.smartv3.view.text.MyTypeface;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStep2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n87#2,7:260\n94#2,3:268\n70#2,7:271\n97#2:278\n1#3:267\n*S KotlinDebug\n*F\n+ 1 MainStep2Item.kt\ncom/sma/smartv3/ui/status/item/MainStep2Item\n*L\n180#1:260,7\n180#1:268,3\n180#1:271,7\n180#1:278\n180#1:267\n*E\n"})
public final class MainStep2Item extends MainStepItem {
    private Goal2ProgressBar goalProgressBar;
    private ImageView imgSwitch;
    private boolean isTransverseLayout;

    @tb1
    private ImageView ivRight;

    @aa1
    private final ArrayList<String> mMarqueeList;

    @tb1
    private View rlTipContent;

    @tb1
    private TextView transverseGoal;
    private TextView tvDistance;

    @tb1
    private MarqueeTextView tvMarquee;
    private TextView tvStep;

    public MainStep2Item() {
        this.mMarqueeList = new ArrayList();
    }

    public static /* synthetic */ void I0IIOi(MainStep2Item r0, View r1) {
        bindView$lambda$4(r0, r1);
    }

    public static /* synthetic */ void I0iXXO(MainStep2Item r0, View r1) {
        bindView$lambda$3(r0, r1);
    }

    public static /* synthetic */ void IO(MainStep2Item r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(MainStep2Item r0, View r1) {
        setMarqueeView$lambda$1$0(r0, r1);
    }

    public static /* synthetic */ void OIi0(MainStep2Item r0, int r1) {
        setMarqueeView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void X1ii(MainStep2Item r0, View r1) {
        bindView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void XXI(MainStep2Item r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    private static final void bindView$lambda$0(MainStep2Item r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), StepActivity.class), new Bundle());
        return;
    }

    private static final void bindView$lambda$1(MainStep2Item r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), DistanceActivity.class), new Bundle());
        return;
    }

    private static final void bindView$lambda$2(MainStep2Item r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), CaloriesActivity.class), new Bundle());
        return;
    }

    private static final void bindView$lambda$3(MainStep2Item r2, View r3) {
        ContextCompat.startActivity(r2.getMContext(), new Intent(r2.getMContext(), GoalSettingActivity.class), new Bundle());
    }

    private static final void bindView$lambda$4(MainStep2Item r2, View r3) {
        a01.OXO1.IiI10X().put(b01.iiII, !r2.isTransverseLayout);
        r2.setItemLayoutId(r2.getTabLayoutID(!r2.isTransverseLayout));
        r2.initView();
    }

    private final int getTabLayoutID(boolean r2) {
        LogUtils.d(new Object[]{Boolean.valueOf(r2)});
        this.isTransverseLayout = r2;
        if (i72.OXO1.OX110i() == false) goto L6;
        return R.layout.v2_status_item_step_transverse;
    L6:
        if (this.isTransverseLayout == false) goto L8;
        return R.layout.v2_status_item_step_transverse;
    L8:
        return R.layout.v2_status_item_step;
    }

    public static /* synthetic */ int getTabLayoutID$default(MainStep2Item r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = a01.OXO1.IiI10X().getBoolean(b01.iiII, false);
    L6:
        return r0.getTabLayoutID(r1);
    }

    private final void setMarqueeView() {
        MarqueeTextView r0 = this.tvMarquee;
        if (r0 == null) goto L5;
        this.mMarqueeList.clear();
        this.mMarqueeList.add(UtilsKt.XXO(R.string.usage_guidelines_text));
        this.mMarqueeList.add(UtilsKt.XXO(R.string.refresh_data));
        this.mMarqueeList.add(UtilsKt.XXO(R.string.view_tutorial));
        r0.setMarqueeListener(new q30(this));
        r0.setTextList(this.mMarqueeList);
    L5:
        View r1 = this.rlTipContent;
        if (r1 == null) goto L9;
        r1.setOnClickListener(new r30(this));
        return;
    }

    private static final void setMarqueeView$lambda$0$0(MainStep2Item r2, int r3) {
        if (r3 != 0) goto L5;
        ImageView r4 = r2.ivRight;
        if (r4 == null) goto L20;
        r4.setVisibility(0);
        return;
    L20:
        return;
    L5:
        if (r3 == 1) goto L10;
        ImageView r5 = r2.ivRight;
        if (r5 == null) goto L18;
        r5.setVisibility(0);
        return;
    L18:
        return;
    L10:
        ImageView r6 = r2.ivRight;
        if (r6 == null) goto L19;
        r6.setVisibility(8);
        return;
    }

    private static final void setMarqueeView$lambda$1$0(MainStep2Item r4, View r5) {
        MarqueeTextView r6 = r4.tvMarquee;
        Intrinsics.XXI(r6);
        int r7 = r6.XXX11i;
        if (r7 != 0) goto L5;
        i72 r8 = i72.OXO1;
        Context r9 = r4.getMContext();
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type android.app.Activity");
        r8.OIXOXXi((Activity) r9);
        return;
    L5:
        if (r7 == 2) goto L7;
        return;
    L7:
        Context r10 = r4.getMContext();
        Intrinsics.X1ii(r10, "null cannot be cast to non-null type android.app.Activity");
        Activity r11 = (Activity) r10;
        String r12 = "https://api.iot-solution.net/web/guideSMARTTIMEPRO/dist/?pid=58&app=" + i72.X1ii(i72.OXO1, null, 1, null);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r12);
        r0.putInt("mArg1", 2);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r13 = new Intent(r11, WebViewActivity.class);
        r13.putExtras(r0);
        r11.startActivity(r13);
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r7) {
        Intrinsics.X0O(r7, "itemHolder");
        super.bindView(r7);
        View r0 = r7.v(R.id.stepPB);
        Intrinsics.XXI(r0);
        this.goalProgressBar = (Goal2ProgressBar) r0;
        View r1 = r7.v(R.id.tvStep);
        Intrinsics.XXI(r1);
        this.tvStep = (TextView) r1;
        View r2 = r7.v(R.id.tvDistance);
        Intrinsics.XXI(r2);
        this.tvDistance = (TextView) r2;
        View r3 = r7.v(R.id.tab_switch_img);
        Intrinsics.XXI(r3);
        this.imgSwitch = (ImageView) r3;
        View r4 = r7.v(R.id.tv_marquee);
        Intrinsics.XXI(r4);
        this.tvMarquee = (MarqueeTextView) r4;
        View r5 = r7.v(R.id.iv_right);
        Intrinsics.XXI(r5);
        this.ivRight = (ImageView) r5;
        this.rlTipContent = r7.v(R.id.rlTipContent);
        if (this.isTransverseLayout == false) goto L5;
    L6:
        View r6 = r7.v(R.id.transverse_goal);
        Intrinsics.XXI(r6);
        this.transverseGoal = (TextView) r6;
    L7:
        i72 r8 = i72.OXO1;
        if (r8.OXii10I() == false) goto L13;
        MarqueeTextView r9 = this.tvMarquee;
        if (r9 == null) goto L12;
        r9.setVisibility(0);
    L12:
        setMarqueeView();
    L16:
        ImageView r10 = null;
        if (r8.OX110i() == false) goto L23;
        ImageView r11 = this.imgSwitch;
        if (r11 != null) goto L21;
        Intrinsics.XXO("imgSwitch");
    L22:
        r10.setVisibility(8);
    L28:
        View r12 = r7.view(R.id.llSteps);
        if (r12 == null) goto L31;
        r12.setOnClickListener(new l30(this));
    L31:
        View r13 = r7.view(R.id.llDistance);
        if (r13 == null) goto L34;
        r13.setOnClickListener(new m30(this));
    L34:
        View r14 = r7.view(R.id.llCalories);
        if (r14 == null) goto L37;
        r14.setOnClickListener(new n30(this));
    L37:
        Typeface r15 = iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, getMContext());
        getTvTemperature().setTypeface(r15);
        View r16 = r7.view(R.id.ll_goal_set);
        if (r16 == null) goto L40;
        r16.setOnClickListener(new o30(this));
    L40:
        View r17 = r7.view(R.id.tab_switch_img);
        if (r17 == null) goto L44;
        r17.setOnClickListener(new p30(this));
        return;
    L44:
        return;
    L21:
        r10 = r11;
        goto L22
    L23:
        ImageView r18 = this.imgSwitch;
        if (r18 != null) goto L26;
        Intrinsics.XXO("imgSwitch");
    L27:
        r10.setVisibility(0);
        goto L28
    L26:
        r10 = r18;
        goto L27
    L13:
        MarqueeTextView r19 = this.tvMarquee;
        if (r19 == null) goto L16;
        r19.setVisibility(8);
        goto L16
    L5:
        if (i72.OXO1.OX110i() == false) goto L7;
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return getTabLayoutID$default(this, false, 1, null);
    }

    @sf5(tag = I01XX0.XOIX)
    public final void onGoalChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChanges(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        LogUtils.d(new Object[]{"onThemeChange now Theme" + a01.OXO1.OXO1().getInt(b01.X0O, 0)});
        MarqueeTextView r5 = this.tvMarquee;
        if (r5 == null) goto L6;
        r5.getCurrentView().setTextColor(gk4.iO(getMContext(), R.color.text_color));
        r5.getNextView().setTextColor(gk4.iO(getMContext(), R.color.text_color));
        return;
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem
    @SuppressLint({"SetTextI18n"})
    public void updateActivity() {
        super.updateActivity();
        BleCache r0 = BleCache.INSTANCE;
        int r6 = BaseBleCache.getInt$default(r0, BleKey.STEP_GOAL, 0, null, 6, null);
        int r1 = BaseBleCache.getInt$default(r0, BleKey.CALORIES_GOAL, 0, null, 6, null);
        q62 r7 = q62.OXO1;
        if (r7.i0XI0() == false) goto L7;
        if (r1 == 0) goto L7;
    L6:
        int r8 = r1;
        int r2 = BaseBleCache.getInt$default(r0, BleKey.DISTANCE_GOAL, 0, null, 6, null);
        if (r7.i0XI0() == false) goto L11;
        if (r2 == 0) goto L11;
    L12:
        i1O0OXO1O.OXO1.OXO1("pb -> " + r6 + " " + r8 + " " + r2);
        Goal2ProgressBar r3 = this.goalProgressBar;
        TextView r4 = null;
        if (r3 != null) goto L15;
        Intrinsics.XXO("goalProgressBar");
        r3 = null;
    L15:
        com.sma.smartv3.db.entity.Activity r5 = getActivity();
        Intrinsics.XXI(r5);
        r3.O00(r5.getMCalorie() / 10000, r8);
        Goal2ProgressBar r9 = this.goalProgressBar;
        if (r9 != null) goto L18;
        Intrinsics.XXO("goalProgressBar");
        r9 = null;
    L18:
        com.sma.smartv3.db.entity.Activity r10 = getActivity();
        Intrinsics.XXI(r10);
        r9.IiI10X(r10.getMStep(), r6);
        Goal2ProgressBar r11 = this.goalProgressBar;
        if (r11 != null) goto L21;
        Intrinsics.XXO("goalProgressBar");
        r11 = null;
    L21:
        com.sma.smartv3.db.entity.Activity r12 = getActivity();
        Intrinsics.XXI(r12);
        r11.XO0O10(r12.getMDistance() / 10000, r2);
        TextView r13 = this.tvStep;
        if (r13 != null) goto L24;
        Intrinsics.XXO("tvStep");
        r13 = null;
    L24:
        com.sma.smartv3.db.entity.Activity r14 = getActivity();
        Intrinsics.XXI(r14);
        r13.setText(String.valueOf(r14.getMStep()));
        TextView r15 = this.tvDistance;
        if (r15 != null) goto L27;
        Intrinsics.XXO("tvDistance");
    L28:
        com.sma.smartv3.db.entity.Activity r16 = getActivity();
        Intrinsics.XXI(r16);
        r4.setText(cp5.I1XOi1(r16.getMDistance() / 10000, getUserProfile().getUnit(), false));
        if (this.isTransverseLayout == false) goto L31;
    L32:
        TextView r17 = this.transverseGoal;
        if (r17 == null) goto L37;
        com.sma.smartv3.db.entity.Activity r18 = getActivity();
        Intrinsics.XXI(r18);
        r17.setText(r18.getMStep() + "/" + r6);
        return;
    L37:
        return;
    L31:
        if (i72.OXO1.OX110i() == true) goto L32;
        return;
    L27:
        r4 = r15;
    L11:
        r2 = o65.OXO1.OIi0(getUserProfile().getHeight(), r6);
    L7:
        r1 = o65.OXO1.I0IIOi(getUserProfile().getGender(), getUserProfile().getWeight(), r6);
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.item.MainStepItem
    public void updateWeather() {
        super.updateWeather();
        getTvWeatherTime().setVisibility(8);
        if (getTvTemperature().getVisibility() != 4) goto L6;
        getTvTemperature().setVisibility(0);
        getTvTemperature().setText(HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        return;
    }
}
