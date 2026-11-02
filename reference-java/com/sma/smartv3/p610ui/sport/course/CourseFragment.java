package com.sma.smartv3.p610ui.sport.course;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.CourseManager;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.p610ui.sport.course.CourseFragment;
import com.sma.smartv3.p610ui.sport.course.item.FitnessRecommendItem;
import com.sma.smartv3.p610ui.sport.course.item.FitnessRecordItem;
import com.sma.smartv3.p610ui.sport.course.item.FitnessSpecialItem;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseFragment extends BaseDSLRecyclerFragment {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int ONE_DAY_TIME = 86400000;

    @aa1
    private List<CourseList> mCourseList = new ArrayList();
    public FitnessSpecialItem mFitnessSpecialItem;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.CourseFragment$initView$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.sport.course.CourseFragment$initView$1", m39466f = "CourseFragment.kt", m39467i = {}, m39468l = {54}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n50#2,3:128\n53#2:134\n55#2,2:136\n1563#3:131\n1634#3,2:132\n1636#3:135\n*S KotlinDebug\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n*L\n55#1:128,3\n55#1:134\n55#1:136,2\n55#1:131\n55#1:132,2\n55#1:135\n*E\n"})
    public static final class C189721 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C189721(Continuation<? super C189721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CourseFragment.this.new C189721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C189721) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List listM39402iI;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(300L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.O00().getString(b01.iOX)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                listM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    listM39402iI.add(new Gson().fromJson(it.next(), CourseList.class));
                }
            } catch (Exception unused) {
                listM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            if (listM39402iI.isEmpty() || CourseFragment.this.getTime(listM39402iI)) {
                CourseFragment.this.onRefPost();
            } else {
                CourseFragment.this.onLoadData(listM39402iI);
            }
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getTime(List<CourseList> list) {
        return System.currentTimeMillis() - list.get(0).getOnSaveTime() > 86400000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadData(List<CourseList> list) {
        if (list != null) {
            this.mCourseList.addAll(list);
            getMFitnessSpecialItem().setData(this.mCourseList);
            I01XX0.XIi00iiXO("test_refresh_page", null, 2, null);
        }
        getDslAdapter().notifyItemChanged(getDslAdapter().getItemCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefPost() {
        CourseManager.I0IIOi(CourseManager.OXO1, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi01OX0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseFragment.onRefPost$lambda$0(this.f5186IO, (CourseList[]) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRefPost$lambda$0(CourseFragment courseFragment, CourseList[] courseListArr) {
        courseFragment.onLoadData(courseListArr != null ? ArraysKt___ArraysKt.OXI0X0(courseListArr) : null);
        return Unit.OXO1;
    }

    private final void showData() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OO0X1X0iX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseFragment.showData$lambda$0(this.f3146IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final CourseFragment courseFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        courseFragment.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.I1ii1OI
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CourseFragment.showData$lambda$0$0(renderAdapter, courseFragment);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(DslAdapter dslAdapter, CourseFragment courseFragment) {
        DslAdapterExKt.IIX1OXO(dslAdapter, new FitnessRecordItem(), null, 2, null);
        DslAdapterExKt.IIX1OXO(dslAdapter, new FitnessRecommendItem(), null, 2, null);
        DslAdapterExKt.IIX1OXO(dslAdapter, courseFragment.getMFitnessSpecialItem(), null, 2, null);
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0OIi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseFragment.showData$lambda$0$0$0((DslAdapter) obj);
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

    @aa1
    public final FitnessSpecialItem getMFitnessSpecialItem() {
        FitnessSpecialItem fitnessSpecialItem = this.mFitnessSpecialItem;
        if (fitnessSpecialItem != null) {
            return fitnessSpecialItem;
        }
        Intrinsics.XXO("mFitnessSpecialItem");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setMFitnessSpecialItem(new FitnessSpecialItem(this.mCourseList));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C189721(null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.course_fragment_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        showData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDslAdapter().notifyItemChanged(getDslAdapter().getItemCount() - 2);
        getDslAdapter().notifyItemChanged(getDslAdapter().getItemCount() - 1);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMFitnessSpecialItem(@aa1 FitnessSpecialItem fitnessSpecialItem) {
        Intrinsics.X0O(fitnessSpecialItem, "<set-?>");
        this.mFitnessSpecialItem = fitnessSpecialItem;
    }
}
