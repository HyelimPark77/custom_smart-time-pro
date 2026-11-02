package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.I1ii1OI;
import com.android.mltcode.paycertificationapi.OO0X1X0iX;
import com.android.mltcode.paycertificationapi.X0OIi0;
import com.android.mltcode.paycertificationapi.Xi01OX0O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.course.item.FitnessRecommendItem;
import com.sma.smartv3.ui.sport.course.item.FitnessRecordItem;
import com.sma.smartv3.ui.sport.course.item.FitnessSpecialItem;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final class CourseFragment extends BaseDSLRecyclerFragment {

    @aa1
    public static final OXO1 Companion = null;
    public static final int ONE_DAY_TIME = 86400000;

    @aa1
    private List<CourseList> mCourseList;
    public FitnessSpecialItem mFitnessSpecialItem;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.CourseFragment$initView$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.sport.course.CourseFragment$initView$1", f = "CourseFragment.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n50#2,3:128\n53#2:134\n55#2,2:136\n1563#3:131\n1634#3,2:132\n1636#3:135\n*S KotlinDebug\n*F\n+ 1 CourseFragment.kt\ncom/sma/smartv3/ui/sport/course/CourseFragment$initView$1\n*L\n55#1:128,3\n55#1:134\n55#1:136,2\n55#1:131\n55#1:132,2\n55#1:135\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CourseFragment this$0;

        public AnonymousClass1(CourseFragment r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r5);
        L27:
            JsonArray r6 = JsonParser.parseString(a01.OXO1.O00().getString(b01.iOX)).getAsJsonArray();     // Catch: Exception -> L17
            Intrinsics.XXI(r6);     // Catch: Exception -> L17
            List r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L17
            Iterator<JsonElement> r7 = r6.iterator();     // Catch: Exception -> L17
        L14:
            if (r7.hasNext() == false) goto L19;
            JsonElement r3 = r7.next();     // Catch: Exception -> L17
            r2.add(new Gson().fromJson(r3, CourseList.class));     // Catch: Exception -> L17
        L19:
            if (r2.isEmpty() == false) goto L21;
            CourseFragment.access$onRefPost(this.this$0);
        L26:
            return Unit.OXO1;
        L21:
            if (CourseFragment.access$getTime(this.this$0, r2) == false) goto L23;
            CourseFragment.access$onRefPost(this.this$0);
            goto L26
        L23:
            CourseFragment.access$onLoadData(this.this$0, r2);
        L17:
            r2 = CollectionsKt__CollectionsKt.iI();
            goto L19
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r5);
            this.label = 1;
            if (DelayKt.XIi00iiXO(300, this) != r0) goto L27;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public CourseFragment() {
        this.mCourseList = new ArrayList();
    }

    public static /* synthetic */ Unit IiI10X(CourseFragment r0, DslAdapter r1) {
        return showData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit O00(DslAdapter r0, CourseFragment r1) {
        return showData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(CourseFragment r0, CourseList[] r1) {
        return onRefPost$lambda$0(r0, r1);
    }

    public static final /* synthetic */ boolean access$getTime(CourseFragment r0, List r1) {
        return r0.getTime(r1);
    }

    public static final /* synthetic */ void access$onLoadData(CourseFragment r0, List r1) {
        r0.onLoadData(r1);
    }

    public static final /* synthetic */ void access$onRefPost(CourseFragment r0) {
        r0.onRefPost();
    }

    private final boolean getTime(List<CourseList> r6) {
        long r1 = r6.get(0).getOnSaveTime();
        if ((System.currentTimeMillis() - r1) <= 86400000) goto L6;
        return true;
    L6:
        return false;
    }

    public static /* synthetic */ Unit iO(DslAdapter r0) {
        return showData$lambda$0$0$0(r0);
    }

    private final void onLoadData(List<CourseList> r3) {
        if (r3 == null) goto L4;
        this.mCourseList.addAll(r3);
        getMFitnessSpecialItem().setData(this.mCourseList);
        I01XX0.XIi00iiXO("test_refresh_page", null, 2, null);
    L4:
        getDslAdapter().notifyItemChanged(getDslAdapter().getItemCount() - 1);
    }

    private final void onRefPost() {
        CourseManager.I0IIOi(CourseManager.OXO1, null, new Xi01OX0O(this), 1, null);
    }

    private static final Unit onRefPost$lambda$0(CourseFragment r0, CourseList[] r1) {
        if (r1 == null) goto L4;
        List<CourseList> r2 = ArraysKt___ArraysKt.OXI0X0(r1);
    L5:
        r0.onLoadData(r2);
        return Unit.OXO1;
    L4:
        r2 = null;
        goto L5
    }

    private final void showData() {
        renderAdapter(new OO0X1X0iX(this));
    }

    private static final Unit showData$lambda$0(final CourseFragment r2, final DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r3.clearAllItems();
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(100, new I1ii1OI(r3, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(DslAdapter r9, CourseFragment r10) {
        DslAdapterExKt.IIX1OXO(r9, new FitnessRecordItem(), null, 2, null);
        DslAdapterExKt.IIX1OXO(r9, new FitnessRecommendItem(), null, 2, null);
        DslAdapterExKt.IIX1OXO(r9, r10.getMFitnessSpecialItem(), null, 2, null);
        DslAdapter.render$default(r9, false, null, new X0OIi0(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    @aa1
    public final FitnessSpecialItem getMFitnessSpecialItem() {
        FitnessSpecialItem r0 = this.mFitnessSpecialItem;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mFitnessSpecialItem");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        setMFitnessSpecialItem(new FitnessSpecialItem(this.mCourseList));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
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
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMFitnessSpecialItem(@aa1 FitnessSpecialItem r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFitnessSpecialItem = r2;
    }
}
