package com.sma.smartv3.p610ui.sport.coach;

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
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.sma.smartv3.otherdevice.p609jl.view.CommonDecoration;
import com.sma.smartv3.p610ui.sport.coach.PlanConfirmActivity;
import com.sma.smartv3.p610ui.sport.coach.item.PlanContentItem;
import com.sma.smartv3.p610ui.sport.coach.item.VitalityPlanItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPlanConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1869#2,2:318\n87#3,7:320\n94#3,3:328\n70#3,7:331\n97#3:338\n87#3,7:339\n94#3,3:347\n70#3,7:350\n97#3:357\n1#4:327\n1#4:346\n*S KotlinDebug\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n*L\n124#1:318,2\n120#1:320,7\n120#1:328,3\n120#1:331,7\n120#1:338\n128#1:339,7\n128#1:347,3\n128#1:350,7\n128#1:357\n120#1:327\n128#1:346\n*E\n"})
public final class PlanConfirmActivity extends BaseDSLRecyclerActivity {
    private int curPosition;
    private int mCurrentItem;

    @aa1
    private final String ITEM_GROUPS_TAG = "plan_groups";

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanConfirmActivity.abhTitleCenter_delegate$lambda$0(this.f12705IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanConfirmActivity.abhTitleRight_delegate$lambda$0(this.f9295IO);
        }
    });

    @aa1
    private final Lazy confirmPlanIv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanConfirmActivity.confirmPlanIv_delegate$lambda$0(this.f9534IO);
        }
    });

    @aa1
    private final Lazy modifyPlan$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanConfirmActivity.modifyPlan_delegate$lambda$0(this.f9798IO);
        }
    });

    @aa1
    private final Lazy confirmPlan$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nw1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PlanConfirmActivity.confirmPlan_delegate$lambda$0(this.f10023IO);
        }
    });

    @aa1
    private String curTimeDay = "";
    private int curDataPosition = -1;

    @aa1
    private final List<CommonAdapter<AICoachManage.PlanGroupTitle>> mListAdapter = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(PlanConfirmActivity planConfirmActivity) {
        return (PFMedium) planConfirmActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(PlanConfirmActivity planConfirmActivity) {
        return (ImageView) planConfirmActivity.findViewById(R.id.abh_title_right);
    }

    private final void addGroupHead() {
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.ai_plan_item_group_head, new Function1() { // from class: com.android.mltcode.paycertificationapi.rw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PlanConfirmActivity.addGroupHead$lambda$0(this.f10914IO, (DslAdapterItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addGroupHead$lambda$0(final PlanConfirmActivity planConfirmActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(planConfirmActivity.ITEM_GROUPS_TAG));
        dslItem.setItemIsHover(false);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ww1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PlanConfirmActivity.addGroupHead$lambda$0$0(this.f12049IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addGroupHead$lambda$0$0(final PlanConfirmActivity planConfirmActivity, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        View viewM3483v = itemHolder.m3483v(R.id.plan_week_tv);
        Intrinsics.XXI(viewM3483v);
        final TextView textView = (TextView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.view_pager);
        Intrinsics.XXI(viewM3483v2);
        final ViewPager2 viewPager2 = (ViewPager2) viewM3483v2;
        List<AICoachManage.PlanGroupTitle> listXXI = AICoachManage.IiI10X.OXO1().XXI();
        final List listX10i = listXXI != null ? CollectionsKt___CollectionsKt.X10i(listXXI, 7) : null;
        viewPager2.setOffscreenPageLimit(-1);
        String string = planConfirmActivity.getString(R.string.week);
        int currentItem = viewPager2.getCurrentItem() + 1;
        Intrinsics.XXI(listX10i);
        textView.setText(string + " (" + currentItem + "/" + listX10i.size() + I000IiI1O.C2156iO.f1007iO);
        viewPager2.setAdapter(new CommonAdapter<List<? extends AICoachManage.PlanGroupTitle>>(listX10i) { // from class: com.sma.smartv3.ui.sport.coach.PlanConfirmActivity$addGroupHead$1$1$1
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, List<? extends AICoachManage.PlanGroupTitle> list2, int i2) {
                convert2(viewHolder, (List<AICoachManage.PlanGroupTitle>) list2, i2);
            }

            /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
            public void convert2(ViewHolder itemHolder2, List<AICoachManage.PlanGroupTitle> time, int i2) {
                Intrinsics.X0O(itemHolder2, "itemHolder");
                Intrinsics.X0O(time, "time");
                this.this$0.addRecyclerView(itemHolder2, time, viewPager2);
            }
        });
        viewPager2.setCurrentItem(planConfirmActivity.mCurrentItem);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.sma.smartv3.ui.sport.coach.PlanConfirmActivity$addGroupHead$1$1$2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i2) {
                textView.setText(planConfirmActivity.getString(R.string.week) + " (" + (viewPager2.getCurrentItem() + 1) + "/" + listX10i.size() + I000IiI1O.C2156iO.f1007iO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addRecyclerView(ViewHolder viewHolder, List<AICoachManage.PlanGroupTitle> list, ViewPager2 viewPager2) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = list;
        View view = viewHolder.getView(R.id.ai_plan_item_group_head_recycle);
        Intrinsics.XXI(view);
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new CommonDecoration(this, 0, getResources().getColor(R.color.transparent), 16));
        }
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 7));
        PlanConfirmActivity$addRecyclerView$adapter$1 planConfirmActivity$addRecyclerView$adapter$1 = new PlanConfirmActivity$addRecyclerView$adapter$1(this, objectRef);
        recyclerView.setAdapter(planConfirmActivity$addRecyclerView$adapter$1);
        this.mListAdapter.add(planConfirmActivity$addRecyclerView$adapter$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView confirmPlanIv_delegate$lambda$0(PlanConfirmActivity planConfirmActivity) {
        return (ImageView) planConfirmActivity.findViewById(R.id.confirm_plan_ll_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button confirmPlan_delegate$lambda$0(PlanConfirmActivity planConfirmActivity) {
        return (Button) planConfirmActivity.findViewById(R.id.coach_confirm_plan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PlanConfirmActivity planConfirmActivity, View view) {
        planConfirmActivity.setResult(9000, new Intent());
        planConfirmActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(PlanConfirmActivity planConfirmActivity, View view) {
        planConfirmActivity.getConfirmPlan().setEnabled(false);
        planConfirmActivity.setResult(-1, new Intent());
        planConfirmActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(PlanConfirmActivity planConfirmActivity) {
        LibExKt.XX1Oi(planConfirmActivity.findViewById(R.id.create_plan_loading_layout), true);
        planConfirmActivity.getConfirmPlanIv().clearAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button modifyPlan_delegate$lambda$0(PlanConfirmActivity planConfirmActivity) {
        return (Button) planConfirmActivity.findViewById(R.id.coach_modify_plan);
    }

    private final void setCurSelected() {
        AICoachManage.PlanGroupTitle planGroupTitle;
        Object next;
        List<AICoachManage.PlanGroupTitle> listXXI = AICoachManage.IiI10X.OXO1().XXI();
        if (listXXI != null) {
            Iterator<T> it = listXXI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                AICoachManage.PlanGroupTitle planGroupTitle2 = (AICoachManage.PlanGroupTitle) next;
                if (planGroupTitle2.getMLessonIndex() != -1 && !planGroupTitle2.isCompleted() && AICoachManage.IiI10X.OXO1().X0O().getDailySchedule().get(planGroupTitle2.getMLessonIndex() % 7).intValue() == 1) {
                    break;
                }
            }
            planGroupTitle = (AICoachManage.PlanGroupTitle) next;
        } else {
            planGroupTitle = null;
        }
        if (planGroupTitle != null) {
            AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
            List<AICoachManage.PlanGroupTitle> listXXI2 = oxo1.OXO1().XXI();
            Intrinsics.XXI(listXXI2);
            int iIndexOf = listXXI2.indexOf(planGroupTitle);
            if (iIndexOf <= 7) {
                this.curPosition = iIndexOf % 7;
                this.curTimeDay = planGroupTitle.getTimeDay();
                this.curDataPosition = planGroupTitle.getMLessonIndex();
                this.mCurrentItem = iIndexOf / 7;
                return;
            }
            List<AICoachManage.PlanGroupTitle> listXXI3 = oxo1.OXO1().XXI();
            AICoachManage.PlanGroupTitle planGroupTitle3 = listXXI3 != null ? (AICoachManage.PlanGroupTitle) CollectionsKt___CollectionsKt.IIII0iI(listXXI3) : null;
            if (planGroupTitle3 != null) {
                this.curTimeDay = planGroupTitle3.getTimeDay();
                this.mCurrentItem = 0;
                this.curPosition = 0;
                this.curDataPosition = -1;
            }
        }
    }

    private final void showData() {
        AICoachManage.IiI10X.OXO1().X1ii();
        setCurSelected();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.uw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PlanConfirmActivity.showData$lambda$0(this.f11584IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final PlanConfirmActivity planConfirmActivity, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        planConfirmActivity.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.xw1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return PlanConfirmActivity.showData$lambda$0$0(renderAdapter, planConfirmActivity);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(DslAdapter dslAdapter, PlanConfirmActivity planConfirmActivity) {
        DslAdapterExKt.IIX1OXO(dslAdapter, new VitalityPlanItem(), null, 2, null);
        planConfirmActivity.addGroupHead();
        planConfirmActivity.showPlanFunction();
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.jw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PlanConfirmActivity.showData$lambda$0$0$0((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPlanFunction() {
        AICoachManage.VitalityLesson vitalityLesson;
        List<AICoachManage.VitalityDayLesson> dayLesson;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 2;
        boolean z = false;
        if (this.curDataPosition == -1) {
            final AICoachManage.VitalityDayLesson vitalityDayLesson = new AICoachManage.VitalityDayLesson(0, null, null, 0, 0, 0.0f, null, 127, null);
            DslAdapterExKt.X0O(getDslAdapter(), new PlanContentItem(vitalityDayLesson, z, i, defaultConstructorMarker), new Function1() { // from class: com.android.mltcode.paycertificationapi.sw1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PlanConfirmActivity.showPlanFunction$lambda$0(this.f11144IO, vitalityDayLesson, (PlanContentItem) obj);
                }
            });
            return;
        }
        List<AICoachManage.VitalityLesson> mVitalityDayLesson = AICoachManage.IiI10X.OXO1().X0O().getMVitalityDayLesson();
        if (mVitalityDayLesson == null || (vitalityLesson = mVitalityDayLesson.get(this.curDataPosition % 7)) == null || (dayLesson = vitalityLesson.getDayLesson()) == null) {
            return;
        }
        for (final AICoachManage.VitalityDayLesson vitalityDayLesson2 : dayLesson) {
            DslAdapterExKt.X0O(getDslAdapter(), new PlanContentItem(vitalityDayLesson2, z, i, defaultConstructorMarker), new Function1() { // from class: com.android.mltcode.paycertificationapi.tw1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PlanConfirmActivity.showPlanFunction$lambda$1$0(this.f11372IO, vitalityDayLesson2, (PlanContentItem) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPlanFunction$lambda$0(final PlanConfirmActivity planConfirmActivity, final AICoachManage.VitalityDayLesson vitalityDayLesson, PlanContentItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(planConfirmActivity.ITEM_GROUPS_TAG));
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.yw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PlanConfirmActivity.showPlanFunction$lambda$0$0(this.f12467IO, vitalityDayLesson, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPlanFunction$lambda$0$0(PlanConfirmActivity planConfirmActivity, AICoachManage.VitalityDayLesson vitalityDayLesson, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", vitalityDayLesson);
        Intent intent = new Intent(planConfirmActivity, (Class<?>) CoachPlanDetailActivity.class);
        intent.putExtras(bundle);
        planConfirmActivity.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPlanFunction$lambda$1$0(final PlanConfirmActivity planConfirmActivity, final AICoachManage.VitalityDayLesson vitalityDayLesson, PlanContentItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(planConfirmActivity.ITEM_GROUPS_TAG));
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.vw1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PlanConfirmActivity.showPlanFunction$lambda$1$0$0(this.f11824IO, vitalityDayLesson, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPlanFunction$lambda$1$0$0(PlanConfirmActivity planConfirmActivity, AICoachManage.VitalityDayLesson vitalityDayLesson, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", vitalityDayLesson);
        Intent intent = new Intent(planConfirmActivity, (Class<?>) CoachPlanDetailActivity.class);
        intent.putExtras(bundle);
        planConfirmActivity.startActivity(intent);
        return Unit.OXO1;
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    public final Button getConfirmPlan() {
        return (Button) this.confirmPlan$delegate.getValue();
    }

    public final ImageView getConfirmPlanIv() {
        return (ImageView) this.confirmPlanIv$delegate.getValue();
    }

    public final int getMCurrentItem() {
        return this.mCurrentItem;
    }

    public final Button getModifyPlan() {
        return (Button) this.modifyPlan$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_vcp_title));
        getConfirmPlan().setEnabled(true);
        getModifyPlan().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ow1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlanConfirmActivity.initView$lambda$0(this.f10237IO, view);
            }
        });
        getConfirmPlan().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.pw1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlanConfirmActivity.initView$lambda$1(this.f10449IO, view);
            }
        });
        ImageView confirmPlanIv = getConfirmPlanIv();
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1800L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        confirmPlanIv.startAnimation(rotateAnimation);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qw1
            @Override // java.lang.Runnable
            public final void run() {
                PlanConfirmActivity.initView$lambda$3(this.f10692IO);
            }
        }, 1000L);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMCurrentItem(int i) {
        this.mCurrentItem = i;
    }
}
