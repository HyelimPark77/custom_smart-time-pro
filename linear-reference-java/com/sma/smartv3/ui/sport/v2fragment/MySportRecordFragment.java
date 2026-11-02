package com.sma.smartv3.ui.sport.v2fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e01;
import com.android.mltcode.paycertificationapi.f01;
import com.android.mltcode.paycertificationapi.g01;
import com.android.mltcode.paycertificationapi.h01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.j01;
import com.android.mltcode.paycertificationapi.k01;
import com.android.mltcode.paycertificationapi.l01;
import com.android.mltcode.paycertificationapi.m01;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.MySportRecordList;
import com.sma.smartv3.model.MySportRecordModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.util.DeviceItemDecoration;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMySportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1869#2,2:130\n1#3:132\n*S KotlinDebug\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n*L\n87#1:130,2\n*E\n"})
public final class MySportRecordFragment extends BaseDSLRecyclerFragment {

    @aa1
    private List<MySportRecordList> dataList;
    private int mSportMode;

    @aa1
    private final Lazy mWorkoutDao$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.v2fragment.MySportRecordFragment$onInitBaseLayoutAfter$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.sport.v2fragment.MySportRecordFragment$onInitBaseLayoutAfter$1", f = "MySportRecordFragment.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"list"}, s = {"L$0"}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MySportRecordFragment this$0;

        public AnonymousClass1(MySportRecordFragment r1, Continuation<? super AnonymousClass1> r2) {
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
        public final Object invokeSuspend(Object r9) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            MySportRecordFragment r2 = (MySportRecordFragment) this.L$1;
            List r3 = (List) this.L$0;
            ResultKt.X1ii(r9);
        L12:
            MySportRecordFragment.access$setDataList$p(r2, (List) r9);
            this.this$0.getRecyclerView().setLayoutManager(new LinearLayoutManager(MySportRecordFragment.access$getMActivity(this.this$0)));
            this.this$0.getRecyclerView().addItemDecoration(new DeviceItemDecoration(SizeUtils.dp2px(16.0f), false, false, 0, false, 30, null));
            MySportRecordFragment.access$showData(this.this$0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r9);
            List<Workout> r10 = MySportRecordFragment.access$getMWorkoutDao(this.this$0).getListByMode(this.this$0.getMSportMode());
            MySportRecordFragment r4 = this.this$0;
            MySportRecordModel r5 = MySportRecordModel.INSTANCE;
            int r6 = r4.getMSportMode();
            this.L$0 = SpillingKt.OXO1(r10);
            this.L$1 = r4;
            this.label = 1;
            r9 = r5.getMySportRecordList(r6, r10, this);
            if (r9 != r0) goto L11;
            return r0;
        L11:
            r2 = r4;
            goto L12
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public MySportRecordFragment() {
        this.mWorkoutDao$delegate = LazyKt__LazyJVMKt.iO(new g01());
        this.dataList = CollectionsKt__CollectionsKt.iI();
    }

    public static /* synthetic */ void I0IIOi(MySportRecordList r0, MySportRecordFragment r1, View r2) {
        initItemView$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IO(MySportRecordFragment r0, DslAdapterItem r1) {
        return findData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void IiI10X(MySportRecordFragment r0) {
        onRefresh$lambda$0(r0);
    }

    public static /* synthetic */ WorkoutDao O00() {
        return mWorkoutDao_delegate$lambda$0();
    }

    public static /* synthetic */ Unit OIi0(MySportRecordFragment r0, DslAdapter r1) {
        return showData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(MySportRecordFragment r0) {
        return showData$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(MySportRecordFragment r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4);
    }

    public static final /* synthetic */ Activity access$getMActivity(MySportRecordFragment r0) {
        return r0.getMActivity();
    }

    public static final /* synthetic */ WorkoutDao access$getMWorkoutDao(MySportRecordFragment r0) {
        return r0.getMWorkoutDao();
    }

    public static final /* synthetic */ void access$setDataList$p(MySportRecordFragment r0, List r1) {
        r0.dataList = r1;
    }

    public static final /* synthetic */ void access$showData(MySportRecordFragment r0) {
        r0.showData();
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    private final void findData(DslAdapter r3, List<MySportRecordList> r4) {
        Iterator<T> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        MySportRecordList r0 = (MySportRecordList) r5.next();
        DslAdapterExKt.O10IXXX0X(r3, R.layout.item_sport_my_record, new j01(this));
        goto L4
    }

    private static final Unit findData$lambda$0$0(final MySportRecordFragment r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemSwipeMenuFlag(4);
        r2.setItemBindOverride(new m01(r1));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(MySportRecordFragment r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        r1.initItemView(r2, r3);
        return Unit.OXO1;
    }

    private final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) getValue();
    }

    public static /* synthetic */ Unit iO(MySportRecordFragment r0, DslAdapter r1) {
        return showData$lambda$0$0$0(r0, r1);
    }

    private final void initItemView(DslViewHolder r6, int r7) {
        final MySportRecordList r8 = this.dataList.get(r7);
        TextView r0 = (TextView) r6.v(R.id.sport_my_record_icon);
        if (r0 == null) goto L5;
        r0.setBackgroundResource(r8.getIcon());
    L5:
        TextView r1 = r6.tv(R.id.sport_my_record_title);
        if (r1 == null) goto L8;
        r1.setText(r8.getTitle());
    L8:
        TextView r2 = r6.tv(R.id.sport_my_record_value);
        if (r2 == null) goto L12;
        r2.setText(r8.getValueStr());
    L12:
        if (r8.getTime() == 0) goto L17;
        TextView r3 = r6.tv(R.id.sport_my_record_time);
        if (r3 == null) goto L17;
        r3.setText(O0X11OiO.iiIOiX().format(Long.valueOf(r8.getTime())));
    L17:
        if (r8.getIconInt() < 1000) goto L20;
        if (r0 == null) goto L22;
        r0.setTextSize(14.0f);
    L22:
        if (r0 != null) goto L24;
    L28:
        r6.click(R.id.root, new f01(r8, this));
        return;
    L24:
        if (r8.getIconInt() == 0) goto L26;
        String r4 = String.valueOf(r8.getIconInt());
    L27:
        r0.setText(r4);
        goto L28
    L26:
        r4 = "";
        goto L27
    L20:
        if (r0 == null) goto L22;
        r0.setTextSize(17.0f);
        goto L22
    }

    private static final void initItemView$lambda$0(MySportRecordList r2, MySportRecordFragment r3, View r4) {
        if (r2.getWorkoutId() == (-1)) goto L6;
        Intent r5 = new Intent(r3.getContext(), SportDetailV2Activity.class);
        Bundle r0 = new Bundle();
        r0.putInt("mArg1", r2.getWorkoutId());
        r5.putExtras(r0);
        r3.startActivity(r5);
        return;
    }

    private static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    private static final void onRefresh$lambda$0(MySportRecordFragment r1) {
        r1.getRefreshLayout().setRefreshing(false);
    }

    private final void showData() {
        renderAdapter(new h01(this));
    }

    private static final Unit showData$lambda$0(final MySportRecordFragment r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r3.clearAllItems();
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r3.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.sport_record_empty_layout));
        r2.getDslViewHolder().post(new l01(r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(final MySportRecordFragment r1) {
        r1.renderAdapter(new e01(r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0(MySportRecordFragment r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r5, 0, null, 2, null);
        if (r4.dataList.isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 1, null, 2, null);
    L7:
        return Unit.OXO1;
    L5:
        r4.findData(r5, r4.dataList);
        r5.setLoadMoreEnable(false);
        goto L7
    }

    public final int getMSportMode() {
        return this.mSportMode;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_my_sport_record;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(this, null), 3, null);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onRefresh() {
        super.onRefresh();
        new Handler(Looper.getMainLooper()).postDelayed(new k01(this), 1000);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void setMSportMode(int r1) {
        this.mSportMode = r1;
    }
}
