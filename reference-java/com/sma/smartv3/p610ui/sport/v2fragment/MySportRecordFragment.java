package com.sma.smartv3.p610ui.sport.v2fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.model.MySportRecordList;
import com.sma.smartv3.model.MySportRecordModel;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.sport.v2fragment.MySportRecordFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DeviceItemDecoration;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMySportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1869#2,2:130\n1#3:132\n*S KotlinDebug\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n*L\n87#1:130,2\n*E\n"})
public final class MySportRecordFragment extends BaseDSLRecyclerFragment {
    private int mSportMode;

    @aa1
    private final Lazy mWorkoutDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MySportRecordFragment.mWorkoutDao_delegate$lambda$0();
        }
    });

    @aa1
    private List<MySportRecordList> dataList = CollectionsKt__CollectionsKt.m39402iI();

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.v2fragment.MySportRecordFragment$onInitBaseLayoutAfter$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.sport.v2fragment.MySportRecordFragment$onInitBaseLayoutAfter$1", m39466f = "MySportRecordFragment.kt", m39467i = {0}, m39468l = {56}, m39469m = "invokeSuspend", m39470n = {"list"}, m39472s = {"L$0"}, m39473v = 1)
    public static final class C189791 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C189791(Continuation<? super C189791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MySportRecordFragment.this.new C189791(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C189791) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MySportRecordFragment mySportRecordFragment;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                List<Workout> listByMode = MySportRecordFragment.this.getMWorkoutDao().getListByMode(MySportRecordFragment.this.getMSportMode());
                MySportRecordFragment mySportRecordFragment2 = MySportRecordFragment.this;
                MySportRecordModel mySportRecordModel = MySportRecordModel.INSTANCE;
                int mSportMode = mySportRecordFragment2.getMSportMode();
                this.L$0 = SpillingKt.OXO1(listByMode);
                this.L$1 = mySportRecordFragment2;
                this.label = 1;
                obj = mySportRecordModel.getMySportRecordList(mSportMode, listByMode, this);
                if (obj == objI0iXXO) {
                    return objI0iXXO;
                }
                mySportRecordFragment = mySportRecordFragment2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mySportRecordFragment = (MySportRecordFragment) this.L$1;
                ResultKt.X1ii(obj);
            }
            mySportRecordFragment.dataList = (List) obj;
            MySportRecordFragment.this.getRecyclerView().setLayoutManager(new LinearLayoutManager(MySportRecordFragment.this.getMActivity()));
            MySportRecordFragment.this.getRecyclerView().addItemDecoration(new DeviceItemDecoration(SizeUtils.dp2px(16.0f), false, false, 0, false, 30, null));
            MySportRecordFragment.this.showData();
            return Unit.OXO1;
        }
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    private final void findData(DslAdapter dslAdapter, List<MySportRecordList> list) {
        for (MySportRecordList mySportRecordList : list) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_sport_my_record, new Function1() { // from class: com.android.mltcode.paycertificationapi.j01
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MySportRecordFragment.findData$lambda$0$0(this.f8852IO, (DslAdapterItem) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final MySportRecordFragment mySportRecordFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.m01
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MySportRecordFragment.findData$lambda$0$0$0(this.f9589IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(MySportRecordFragment mySportRecordFragment, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        mySportRecordFragment.initItemView(itemHolder, i);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorkoutDao getMWorkoutDao() {
        return (WorkoutDao) this.mWorkoutDao$delegate.getValue();
    }

    private final void initItemView(DslViewHolder dslViewHolder, int i) {
        TextView textViewM3482tv;
        final MySportRecordList mySportRecordList = this.dataList.get(i);
        TextView textView = (TextView) dslViewHolder.m3483v(R.id.sport_my_record_icon);
        if (textView != null) {
            textView.setBackgroundResource(mySportRecordList.getIcon());
        }
        TextView textViewM3482tv2 = dslViewHolder.m3482tv(R.id.sport_my_record_title);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(mySportRecordList.getTitle());
        }
        TextView textViewM3482tv3 = dslViewHolder.m3482tv(R.id.sport_my_record_value);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(mySportRecordList.getValueStr());
        }
        if (mySportRecordList.getTime() != 0 && (textViewM3482tv = dslViewHolder.m3482tv(R.id.sport_my_record_time)) != null) {
            textViewM3482tv.setText(O0X11OiO.iiIOiX().format(Long.valueOf(mySportRecordList.getTime())));
        }
        if (mySportRecordList.getIconInt() >= 1000) {
            if (textView != null) {
                textView.setTextSize(14.0f);
            }
        } else if (textView != null) {
            textView.setTextSize(17.0f);
        }
        if (textView != null) {
            textView.setText(mySportRecordList.getIconInt() != 0 ? String.valueOf(mySportRecordList.getIconInt()) : "");
        }
        dslViewHolder.click(R.id.root, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.f01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MySportRecordFragment.initItemView$lambda$0(mySportRecordList, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItemView$lambda$0(MySportRecordList mySportRecordList, MySportRecordFragment mySportRecordFragment, View view) {
        if (mySportRecordList.getWorkoutId() != -1) {
            Intent intent = new Intent(mySportRecordFragment.getContext(), (Class<?>) SportDetailV2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("mArg1", mySportRecordList.getWorkoutId());
            intent.putExtras(bundle);
            mySportRecordFragment.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkoutDao mWorkoutDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRefresh$lambda$0(MySportRecordFragment mySportRecordFragment) {
        mySportRecordFragment.getRefreshLayout().setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showData() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.h01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MySportRecordFragment.showData$lambda$0(this.f7006IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final MySportRecordFragment mySportRecordFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.sport_record_empty_layout));
        mySportRecordFragment.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.l01
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return MySportRecordFragment.showData$lambda$0$0(this.f9321IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(final MySportRecordFragment mySportRecordFragment) {
        mySportRecordFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.e01
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MySportRecordFragment.showData$lambda$0$0$0(this.f6309IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0(MySportRecordFragment mySportRecordFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        if (mySportRecordFragment.dataList.isEmpty()) {
            DslAdapter.setAdapterStatus$default(mySportRecordFragment.getDslAdapter(), 1, null, 2, null);
        } else {
            mySportRecordFragment.findData(renderAdapter, mySportRecordFragment.dataList);
            renderAdapter.setLoadMoreEnable(false);
        }
        return Unit.OXO1;
    }

    public final int getMSportMode() {
        return this.mSportMode;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_my_sport_record;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C189791(null), 3, null);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onRefresh() {
        super.onRefresh();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.k01
            @Override // java.lang.Runnable
            public final void run() {
                MySportRecordFragment.onRefresh$lambda$0(this.f9082IO);
            }
        }, 1000L);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void setMSportMode(int i) {
        this.mSportMode = i;
    }
}
