package com.sma.smartv3.ui.sport.coach;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.jw1;
import com.android.mltcode.paycertificationapi.kw1;
import com.android.mltcode.paycertificationapi.lw1;
import com.android.mltcode.paycertificationapi.mw1;
import com.android.mltcode.paycertificationapi.nw1;
import com.android.mltcode.paycertificationapi.ow1;
import com.android.mltcode.paycertificationapi.pw1;
import com.android.mltcode.paycertificationapi.qw1;
import com.android.mltcode.paycertificationapi.rw1;
import com.android.mltcode.paycertificationapi.sw1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tw1;
import com.android.mltcode.paycertificationapi.uw1;
import com.android.mltcode.paycertificationapi.vw1;
import com.android.mltcode.paycertificationapi.ww1;
import com.android.mltcode.paycertificationapi.xw1;
import com.android.mltcode.paycertificationapi.yw1;
import com.android.mltcode.paycertificationapi.zw1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.sma.smartv3.otherdevice.jl.view.CommonDecoration;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.item.PlanContentItem;
import com.sma.smartv3.ui.sport.coach.item.VitalityPlanItem;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPlanConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1869#2,2:318\n87#3,7:320\n94#3,3:328\n70#3,7:331\n97#3:338\n87#3,7:339\n94#3,3:347\n70#3,7:350\n97#3:357\n1#4:327\n1#4:346\n*S KotlinDebug\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n*L\n124#1:318,2\n120#1:320,7\n120#1:328,3\n120#1:331,7\n120#1:338\n128#1:339,7\n128#1:347,3\n128#1:350,7\n128#1:357\n120#1:327\n128#1:346\n*E\n"})
public final class PlanConfirmActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String ITEM_GROUPS_TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy confirmPlan$delegate;

    @aa1
    private final Lazy confirmPlanIv$delegate;
    private int curDataPosition;
    private int curPosition;

    @aa1
    private String curTimeDay;
    private int mCurrentItem;

    @aa1
    private final List<CommonAdapter<AICoachManage.PlanGroupTitle>> mListAdapter;

    @aa1
    private final Lazy modifyPlan$delegate;

    public PlanConfirmActivity() {
        this.ITEM_GROUPS_TAG = "plan_groups";
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new zw1(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new kw1(this));
        this.confirmPlanIv$delegate = LazyKt__LazyJVMKt.iO(new lw1(this));
        this.modifyPlan$delegate = LazyKt__LazyJVMKt.iO(new mw1(this));
        this.confirmPlan$delegate = LazyKt__LazyJVMKt.iO(new nw1(this));
        this.curTimeDay = "";
        this.curDataPosition = -1;
        this.mListAdapter = new ArrayList();
    }

    public static /* synthetic */ Unit I0iXXO(PlanConfirmActivity r0, AICoachManage.VitalityDayLesson r1, View r2) {
        return showPlanFunction$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1(PlanConfirmActivity r0, AICoachManage.VitalityDayLesson r1, PlanContentItem r2) {
        return showPlanFunction$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Button I1XOi1(PlanConfirmActivity r0) {
        return modifyPlan_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(PlanConfirmActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(PlanConfirmActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(PlanConfirmActivity r0, DslAdapterItem r1) {
        return addGroupHead$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(DslAdapter r0, PlanConfirmActivity r1) {
        return showData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView OiIIX101O(PlanConfirmActivity r0) {
        return confirmPlanIv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X01IiOiIi(PlanConfirmActivity r0, AICoachManage.VitalityDayLesson r1, PlanContentItem r2) {
        return showPlanFunction$lambda$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(DslAdapter r0) {
        return showData$lambda$0$0$0(r0);
    }

    public static /* synthetic */ Unit X1ii(PlanConfirmActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return addGroupHead$lambda$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ void XX0(PlanConfirmActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI(PlanConfirmActivity r0, AICoachManage.VitalityDayLesson r1, View r2) {
        return showPlanFunction$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XiOIO(PlanConfirmActivity r0, DslAdapter r1) {
        return showData$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView XiOIii1(PlanConfirmActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(PlanConfirmActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(PlanConfirmActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$addRecyclerView(PlanConfirmActivity r0, ViewHolder r1, List r2, ViewPager2 r3) {
        r0.addRecyclerView(r1, r2, r3);
    }

    public static final /* synthetic */ int access$getCurPosition$p(PlanConfirmActivity r0) {
        return r0.curPosition;
    }

    public static final /* synthetic */ String access$getCurTimeDay$p(PlanConfirmActivity r0) {
        return r0.curTimeDay;
    }

    public static final /* synthetic */ String access$getITEM_GROUPS_TAG$p(PlanConfirmActivity r0) {
        return r0.ITEM_GROUPS_TAG;
    }

    public static final /* synthetic */ List access$getMListAdapter$p(PlanConfirmActivity r0) {
        return r0.mListAdapter;
    }

    public static final /* synthetic */ void access$setCurDataPosition$p(PlanConfirmActivity r0, int r1) {
        r0.curDataPosition = r1;
    }

    public static final /* synthetic */ void access$setCurPosition$p(PlanConfirmActivity r0, int r1) {
        r0.curPosition = r1;
    }

    public static final /* synthetic */ void access$setCurTimeDay$p(PlanConfirmActivity r0, String r1) {
        r0.curTimeDay = r1;
    }

    public static final /* synthetic */ void access$showPlanFunction(PlanConfirmActivity r0) {
        r0.showPlanFunction();
    }

    private final void addGroupHead() {
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.ai_plan_item_group_head, new rw1(this));
    }

    private static final Unit addGroupHead$lambda$0(final PlanConfirmActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemIsGroupHead(true);
        r2.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.ITEM_GROUPS_TAG}));
        r2.setItemIsHover(false);
        r2.setItemBindOverride(new ww1(r1));
        return Unit.OXO1;
    }

    private static final Unit addGroupHead$lambda$0$0(final PlanConfirmActivity r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "adapterItem");
        Intrinsics.X0O(r7, "<unused var>");
        View r8 = r4.v(R.id.plan_week_tv);
        Intrinsics.XXI(r8);
        final TextView r9 = (TextView) r8;
        View r10 = r4.v(R.id.view_pager);
        Intrinsics.XXI(r10);
        final ViewPager2 r11 = (ViewPager2) r10;
        List<AICoachManage.PlanGroupTitle> r12 = AICoachManage.IiI10X.OXO1().XXI();
        if (r12 == null) goto L5;
        final List r13 = CollectionsKt___CollectionsKt.X10i(r12, 7);
    L6:
        r11.setOffscreenPageLimit(-1);
        String r14 = r3.getString(R.string.week);
        int r0 = r11.getCurrentItem() + 1;
        Intrinsics.XXI(r13);
        r9.setText(r14 + " (" + r0 + "/" + r13.size() + I000IiI1O.iO.iO);
        r11.setAdapter(new PlanConfirmActivity$addGroupHead$1$1$1(r3, r13, r11));
        r11.setCurrentItem(r3.mCurrentItem);
        r11.registerOnPageChangeCallback(new PlanConfirmActivity$addGroupHead$1$1$2(r9, r3, r11, r13));
        return Unit.OXO1;
    L5:
        r13 = null;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addRecyclerView(ViewHolder r4, List<AICoachManage.PlanGroupTitle> r5, ViewPager2 r6) {
        Ref.ObjectRef r7 = new Ref.ObjectRef();
        r7.element = r5;
        View r8 = r4.getView(R.id.ai_plan_item_group_head_recycle);
        Intrinsics.XXI(r8);
        RecyclerView r9 = (RecyclerView) r8;
        if (r9.getItemDecorationCount() != 0) goto L5;
        r9.addItemDecoration(new CommonDecoration(this, 0, getResources().getColor(R.color.transparent), 16));
    L5:
        r9.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r9.setNestedScrollingEnabled(false);
        r9.setLayoutManager(new LinearLayoutManager(r9.getContext()));
        r9.setLayoutManager(new GridLayoutManager(r9.getContext(), 7));
        PlanConfirmActivity$addRecyclerView$adapter$1 r10 = new PlanConfirmActivity$addRecyclerView$adapter$1(this, r7);
        r9.setAdapter(r10);
        this.mListAdapter.add(r10);
    }

    private static final ImageView confirmPlanIv_delegate$lambda$0(PlanConfirmActivity r1) {
        return (ImageView) r1.findViewById(R.id.confirm_plan_ll_img);
    }

    private static final Button confirmPlan_delegate$lambda$0(PlanConfirmActivity r1) {
        return (Button) r1.findViewById(R.id.coach_confirm_plan);
    }

    public static /* synthetic */ Button iIiiO(PlanConfirmActivity r0) {
        return confirmPlan_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOOX010X(PlanConfirmActivity r0) {
        initView$lambda$3(r0);
    }

    private static final void initView$lambda$0(PlanConfirmActivity r1, View r2) {
        r1.setResult(9000, new Intent());
        r1.finish();
    }

    private static final void initView$lambda$1(PlanConfirmActivity r1, View r2) {
        r1.getConfirmPlan().setEnabled(false);
        r1.setResult(-1, new Intent());
        r1.finish();
    }

    private static final void initView$lambda$3(PlanConfirmActivity r2) {
        LibExKt.XX1Oi(r2.findViewById(R.id.create_plan_loading_layout), true);
        r2.getConfirmPlanIv().clearAnimation();
    }

    private static final Button modifyPlan_delegate$lambda$0(PlanConfirmActivity r1) {
        return (Button) r1.findViewById(R.id.coach_modify_plan);
    }

    private final void setCurSelected() {
        List<AICoachManage.PlanGroupTitle> r0 = AICoachManage.IiI10X.OXO1().XXI();
        AICoachManage.PlanGroupTitle r2 = null;
        if (r0 == null) goto L16;
        Iterator<T> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L14;
        Object r4 = r1.next();
        AICoachManage.PlanGroupTitle r5 = (AICoachManage.PlanGroupTitle) r4;
        if (r5.getMLessonIndex() == (-1)) goto L6;
        if (r5.isCompleted() == true) goto L6;
        if (AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().get(r5.getMLessonIndex() % 7).intValue() != 1) goto L6;
    L15:
        AICoachManage.PlanGroupTitle r6 = (AICoachManage.PlanGroupTitle) r4;
    L17:
        if (r6 == null) goto L36;
        AICoachManage.OXO1 r3 = AICoachManage.IiI10X;
        List<AICoachManage.PlanGroupTitle> r7 = r3.OXO1().XXI();
        Intrinsics.XXI(r7);
        int r8 = r7.indexOf(r6);
        if (r8 > 7) goto L22;
        this.curPosition = r8 % 7;
        this.curTimeDay = r6.getTimeDay();
        this.curDataPosition = r6.getMLessonIndex();
        this.mCurrentItem = r8 / 7;
        return;
    L22:
        List<AICoachManage.PlanGroupTitle> r9 = r3.OXO1().XXI();
        if (r9 == null) goto L25;
        r2 = (AICoachManage.PlanGroupTitle) CollectionsKt___CollectionsKt.IIII0iI(r9);
    L25:
        if (r2 == null) goto L37;
        this.curTimeDay = r2.getTimeDay();
        this.mCurrentItem = 0;
        this.curPosition = 0;
        this.curDataPosition = -1;
        return;
    L37:
        return;
    L36:
        return;
    L14:
        r4 = null;
        goto L15
    L16:
        r6 = null;
        goto L17
    }

    private final void showData() {
        AICoachManage.IiI10X.OXO1().X1ii();
        setCurSelected();
        renderAdapter(new uw1(this));
    }

    private static final Unit showData$lambda$0(final PlanConfirmActivity r2, final DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r3.clearAllItems();
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(100, new xw1(r3, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(DslAdapter r9, PlanConfirmActivity r10) {
        DslAdapterExKt.IIX1OXO(r9, new VitalityPlanItem(), null, 2, null);
        r10.addGroupHead();
        r10.showPlanFunction();
        DslAdapter.render$default(r9, false, null, new jw1(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    private final void showPlanFunction() {
        DefaultConstructorMarker r2 = null;
        int r3 = 2;
        boolean r4 = false;
        if (this.curDataPosition != (-1)) goto L6;
        final AICoachManage.VitalityDayLesson r5 = new AICoachManage.VitalityDayLesson(0, null, null, 0, 0, 0.0f, null, 127, null);
        DslAdapterExKt.X0O(getDslAdapter(), new PlanContentItem(r5, r4, r3, r2), new sw1(this, r5));
        return;
    L6:
        List<AICoachManage.VitalityLesson> r0 = AICoachManage.IiI10X.OXO1().X0O().getMVitalityDayLesson();
        if (r0 == null) goto L16;
        AICoachManage.VitalityLesson r1 = r0.get(this.curDataPosition % 7);
        if (r1 == null) goto L18;
        List<AICoachManage.VitalityDayLesson> r6 = r1.getDayLesson();
        if (r6 == null) goto L19;
        Iterator<T> r7 = r6.iterator();
    L14:
        if (r7.hasNext() == false) goto L20;
        final AICoachManage.VitalityDayLesson r8 = (AICoachManage.VitalityDayLesson) r7.next();
        DslAdapterExKt.X0O(getDslAdapter(), new PlanContentItem(r8, r4, r3, r2), new tw1(this, r8));
        goto L14
    L20:
        return;
    L19:
        return;
    L18:
        return;
    }

    private static final Unit showPlanFunction$lambda$0(final PlanConfirmActivity r1, final AICoachManage.VitalityDayLesson r2, PlanContentItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.ITEM_GROUPS_TAG}));
        r3.setItemClick(new yw1(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showPlanFunction$lambda$0$0(PlanConfirmActivity r2, AICoachManage.VitalityDayLesson r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r3);
        Intent r6 = new Intent(r2, CoachPlanDetailActivity.class);
        r6.putExtras(r5);
        r2.startActivity(r6);
        return Unit.OXO1;
    }

    private static final Unit showPlanFunction$lambda$1$0(final PlanConfirmActivity r1, final AICoachManage.VitalityDayLesson r2, PlanContentItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.ITEM_GROUPS_TAG}));
        r3.setItemClick(new vw1(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showPlanFunction$lambda$1$0$0(PlanConfirmActivity r2, AICoachManage.VitalityDayLesson r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r3);
        Intent r6 = new Intent(r2, CoachPlanDetailActivity.class);
        r6.putExtras(r5);
        r2.startActivity(r6);
        return Unit.OXO1;
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public final Button getConfirmPlan() {
        return (Button) getValue();
    }

    public final ImageView getConfirmPlanIv() {
        return (ImageView) getValue();
    }

    public final int getMCurrentItem() {
        return this.mCurrentItem;
    }

    public final Button getModifyPlan() {
        return (Button) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_vcp_title));
        getConfirmPlan().setEnabled(true);
        getModifyPlan().setOnClickListener(new ow1(this));
        getConfirmPlan().setOnClickListener(new pw1(this));
        ImageView r0 = getConfirmPlanIv();
        RotateAnimation r1 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r1.setRepeatCount(-1);
        r1.setDuration(1800);
        r1.setInterpolator(new LinearInterpolator());
        r0.startAnimation(r1);
        new Handler(Looper.getMainLooper()).postDelayed(new qw1(this), 1000);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.ai_coach_confirm_plan;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        getRecyclerView().addItemDecoration(new CommonDecoration(this, 1, getResources().getColor(R.color.transparent), 16));
        showData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getDslAdapter().notifyDataSetChanged();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMCurrentItem(int r1) {
        this.mCurrentItem = r1;
    }
}
