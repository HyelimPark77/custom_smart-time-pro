package com.sma.smartv3.p610ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p610ui.status.WeightMeasureReportActivity;
import com.sma.smartv3.p610ui.status.fragment.WeightHistoryFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n1491#3:206\n1516#3,3:207\n1519#3,3:217\n382#4,7:210\n99#5,7:220\n106#5,3:228\n79#5,7:231\n109#5:238\n1#6:227\n*S KotlinDebug\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n*L\n27#1:204\n27#1:205\n107#1:206\n107#1:207,3\n107#1:217,3\n107#1:210,7\n162#1:220,7\n162#1:228,3\n162#1:231,7\n162#1:238\n162#1:227\n*E\n"})
public final class WeightHistoryFragment extends BaseDSLRecyclerFragment {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private WeightDao mWeightDao;

    @aa1
    private final Lazy scrollView$delegate;
    private int pageSize = 30;
    private int pageNum = 1;

    public WeightHistoryFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.scrollView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cz6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightHistoryFragment.scrollView_delegate$lambda$0(this.f6092IO);
            }
        });
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
    }

    @SuppressLint({"SetTextI18n"})
    private final void doItem(List<Weight> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = O0X11OiO.iiIOiX().format(Long.valueOf(((Weight) obj).getMTime()));
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (final Map.Entry entry : linkedHashMap.entrySet()) {
            if (this.pageNum == 1 || DslAdapterExKt.Ii1iii0(getDslAdapter(), (String) entry.getKey(), false, 2, null) == null) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.weight_measure_history_group_item, new Function1() { // from class: com.android.mltcode.paycertificationapi.zy6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return WeightHistoryFragment.doItem$lambda$1(entry, (DslAdapterItem) obj2);
                    }
                });
            }
            for (final Weight weight : (List) entry.getValue()) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.weight_measure_history_item, new Function1() { // from class: com.android.mltcode.paycertificationapi.az6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return WeightHistoryFragment.doItem$lambda$2(entry, weight, this, (DslAdapterItem) obj2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit doItem$lambda$1(final Map.Entry entry, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuEnable(false);
        dslItem.setItemIsGroupHead(false);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(entry.getKey()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ty6
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return WeightHistoryFragment.doItem$lambda$1$0(entry, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag((String) entry.getKey());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doItem$lambda$1$0(Map.Entry entry, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_date);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText((CharSequence) entry.getKey());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit doItem$lambda$2(Map.Entry entry, final Weight weight, final WeightHistoryFragment weightHistoryFragment, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(entry.getKey()));
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.uy6
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return WeightHistoryFragment.doItem$lambda$2$0(weight, weightHistoryFragment, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.vy6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightHistoryFragment.doItem$lambda$2$1(weight, weightHistoryFragment, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doItem$lambda$2$0(final Weight weight, final WeightHistoryFragment weightHistoryFragment, final DslAdapterItem dslAdapterItem, final DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_weightValue);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(cp5.OIX0iXi(cp5.IXXOO(weight.getMWeight(), weightHistoryFragment.mAppUser.getUnit())) + weightHistoryFragment.getString(cp5.m1626iX(weightHistoryFragment.mAppUser.getUnit())));
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_bmiValue);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(weight.getMBmi() == 0.0d ? cp5.I0IIOi(weight.getMWeight(), weightHistoryFragment.mAppUser.getHeight()) : WeightMeasureDataKt.keepOneDecimal(weight.getMBmi()));
        }
        if (weight.getMIsMeasure() == 1) {
            ImageView imageViewImg = itemHolder.img(R.id.iv_measure_type);
            if (imageViewImg != null) {
                imageViewImg.setImageResource(R.drawable.icon_measure_scale);
            }
            ImageView imageViewImg2 = itemHolder.img(R.id.iv_measure_item_right);
            if (imageViewImg2 != null) {
                imageViewImg2.setVisibility(0);
            }
            TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.tv_bfrValue);
            if (textViewM3482tv3 != null) {
                textViewM3482tv3.setText(weight.getMRatioOfFat() + "%");
            }
        } else {
            ImageView imageViewImg3 = itemHolder.img(R.id.iv_measure_type);
            if (imageViewImg3 != null) {
                imageViewImg3.setImageResource(R.drawable.icon_measure_input);
            }
            ImageView imageViewImg4 = itemHolder.img(R.id.iv_measure_item_right);
            if (imageViewImg4 != null) {
                imageViewImg4.setVisibility(4);
            }
            TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.tv_bfrValue);
            if (textViewM3482tv4 != null) {
                textViewM3482tv4.setText(R.string.data_none);
            }
        }
        itemHolder.click(R.id.bt_delete_weight_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightHistoryFragment.doItem$lambda$2$0$0(weight, weightHistoryFragment, dslAdapterItem, itemHolder, view);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doItem$lambda$2$0$0(Weight weight, WeightHistoryFragment weightHistoryFragment, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, View view) {
        weight.setMIsSync(0);
        weight.setMIsDelete(1);
        weightHistoryFragment.mWeightDao.update(CollectionsKt__CollectionsKt.Ii1iii0(weight));
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            swipeMenuHelper.closeSwipeMenu(dslViewHolder);
        }
        DslAdapter itemDslAdapter = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter != null) {
            DslAdapter.removeItem$default(itemDslAdapter, dslAdapterItem, false, 2, null);
        }
        DslAdapter itemDslAdapter2 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter2 != null) {
            DslAdapter.updateItemDepend$default(itemDslAdapter2, null, 1, null);
        }
        weightHistoryFragment.removeGroup(dslAdapterItem.getItemGroups());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doItem$lambda$2$1(Weight weight, WeightHistoryFragment weightHistoryFragment, View it) {
        Intrinsics.X0O(it, "it");
        if (weight.getMIsMeasure() == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putInt("mArg1", 1);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", weight);
            Intent intent = new Intent(weightHistoryFragment.getActivity(), (Class<?>) WeightMeasureReportActivity.class);
            intent.putExtras(bundle);
            weightHistoryFragment.startActivity(intent);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0(final WeightHistoryFragment weightHistoryFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_weight_history_empty));
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        weightHistoryFragment.getDslViewHolder().postDelay(1000L, new Function0() { // from class: com.android.mltcode.paycertificationapi.fz6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightHistoryFragment.onInitBaseLayoutAfter$lambda$0$0(this.f6778IO);
            }
        });
        renderAdapter.getDslLoadMoreItem().setOnLoadMore(new Function1() { // from class: com.android.mltcode.paycertificationapi.sy6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightHistoryFragment.onInitBaseLayoutAfter$lambda$0$1(this.f11158IO, (DslViewHolder) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(final WeightHistoryFragment weightHistoryFragment) {
        weightHistoryFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.yy6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightHistoryFragment.onInitBaseLayoutAfter$lambda$0$0$0(this.f12483IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0$0(WeightHistoryFragment weightHistoryFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        renderAdapter.setLoadMoreEnable(true);
        weightHistoryFragment.pageNum = 1;
        weightHistoryFragment.loadData(1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1(final WeightHistoryFragment weightHistoryFragment, DslViewHolder it) {
        Intrinsics.X0O(it, "it");
        it.postDelay(1000L, new Function0() { // from class: com.android.mltcode.paycertificationapi.bz6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightHistoryFragment.onInitBaseLayoutAfter$lambda$0$1$0(this.f5859IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1$0(final WeightHistoryFragment weightHistoryFragment) {
        weightHistoryFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.ry6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightHistoryFragment.onInitBaseLayoutAfter$lambda$0$1$0$0(this.f10929IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1$0$0(WeightHistoryFragment weightHistoryFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        int i = weightHistoryFragment.pageNum + 1;
        weightHistoryFragment.pageNum = i;
        weightHistoryFragment.loadData(i);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMeasureWeightChanged$lambda$0(final WeightHistoryFragment weightHistoryFragment) {
        weightHistoryFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.ez6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightHistoryFragment.onMeasureWeightChanged$lambda$0$0(this.f6534IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMeasureWeightChanged$lambda$0$0(WeightHistoryFragment weightHistoryFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        weightHistoryFragment.onRefresh();
        return Unit.OXO1;
    }

    private final void removeGroup(List<String> list) {
        if (DslAdapterExKt.iIXi1iiXI(getDslAdapter(), list, false, 2, null).size() == 1) {
            getDslAdapter().removeItem(DslAdapterExKt.iIXi1iiXI(getDslAdapter(), list, false, 2, null));
            DslAdapter.updateItemDepend$default(getDslAdapter(), null, 1, null);
        }
        if (getDslAdapter().getDataItems().isEmpty()) {
            DslAdapter.setAdapterStatus$default(getDslAdapter(), 1, null, 2, null);
            DslAdapter.updateItemDepend$default(getDslAdapter(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView scrollView_delegate$lambda$0(WeightHistoryFragment weightHistoryFragment) {
        return (NestedScrollView) weightHistoryFragment.getMView().findViewById(R.id.scrollView);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final NestedScrollView getScrollView() {
        return (NestedScrollView) this.scrollView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_weight_history;
    }

    public final void loadData(int i) {
        WeightDao weightDao = this.mWeightDao;
        int i2 = this.pageSize;
        List<Weight> weightsDESC = weightDao.getWeightsDESC((i - 1) * i2, i2);
        getRefreshLayout().setRefreshing(false);
        if (!weightsDESC.isEmpty()) {
            DslAdapter.setAdapterStatus$default(getDslAdapter(), 0, null, 2, null);
            doItem(weightsDESC);
            DslAdapter.setLoadMore$default(getDslAdapter(), 0, null, false, 6, null);
        } else if (i == 1) {
            DslAdapter.setAdapterStatus$default(getDslAdapter(), 1, null, 2, null);
        } else {
            DslAdapter.setLoadMore$default(getDslAdapter(), 2, null, false, 6, null);
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.wy6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightHistoryFragment.onInitBaseLayoutAfter$lambda$0(this.f12070IO, (DslAdapter) obj);
            }
        });
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    @sf5(tag = I01XX0.I0iXXO)
    public final void onMeasureWeightChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onMeasureWeightChanged");
        getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.dz6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightHistoryFragment.onMeasureWeightChanged$lambda$0(this.f6308IO);
            }
        });
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onRefresh() {
        super.onRefresh();
        getDslAdapter().resetItem(new ArrayList());
        this.pageNum = 1;
        loadData(1);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void share() {
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        NestedScrollView scrollView = getScrollView();
        Intrinsics.O10IXXX0X(scrollView, "<get-scrollView>(...)");
        xIi1i01O.XO0O10(getMActivity(), xIi1i01O.m1250iO(scrollView));
    }
}
