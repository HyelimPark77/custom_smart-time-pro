package com.sma.smartv3.ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
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
import com.android.mltcode.paycertificationapi.az6;
import com.android.mltcode.paycertificationapi.bz6;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cz6;
import com.android.mltcode.paycertificationapi.dz6;
import com.android.mltcode.paycertificationapi.ez6;
import com.android.mltcode.paycertificationapi.fz6;
import com.android.mltcode.paycertificationapi.ry6;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sy6;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty6;
import com.android.mltcode.paycertificationapi.uy6;
import com.android.mltcode.paycertificationapi.vy6;
import com.android.mltcode.paycertificationapi.wy6;
import com.android.mltcode.paycertificationapi.xy6;
import com.android.mltcode.paycertificationapi.yy6;
import com.android.mltcode.paycertificationapi.zy6;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.WeightMeasureReportActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n1491#3:206\n1516#3,3:207\n1519#3,3:217\n382#4,7:210\n99#5,7:220\n106#5,3:228\n79#5,7:231\n109#5:238\n1#6:227\n*S KotlinDebug\n*F\n+ 1 WeightHistoryFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightHistoryFragment\n*L\n27#1:204\n27#1:205\n107#1:206\n107#1:207,3\n107#1:217,3\n107#1:210,7\n162#1:220,7\n162#1:228,3\n162#1:231,7\n162#1:238\n162#1:227\n*E\n"})
public final class WeightHistoryFragment extends BaseDSLRecyclerFragment {

    @aa1
    private final AppUser mAppUser;

    @aa1
    private WeightDao mWeightDao;
    private int pageNum;
    private int pageSize;

    @aa1
    private final Lazy scrollView$delegate;

    public WeightHistoryFragment() {
        this.pageSize = 30;
        this.pageNum = 1;
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        this.scrollView$delegate = LazyKt__LazyJVMKt.iO(new cz6(this));
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
    }

    public static /* synthetic */ Unit I0IIOi(Weight r0, WeightHistoryFragment r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return doItem$lambda$2$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ Unit I0iXXO(WeightHistoryFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$1$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(WeightHistoryFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IO(Weight r0, WeightHistoryFragment r1, View r2) {
        return doItem$lambda$2$1(r0, r1, r2);
    }

    public static /* synthetic */ void IiI10X(Weight r0, WeightHistoryFragment r1, DslAdapterItem r2, DslViewHolder r3, View r4) {
        doItem$lambda$2$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit O00(Map.Entry r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return doItem$lambda$1$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit O10IXXX0X(WeightHistoryFragment r0) {
        return onInitBaseLayoutAfter$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(Map.Entry r0, DslAdapterItem r1) {
        return doItem$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit OIi0(WeightHistoryFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(WeightHistoryFragment r0, DslViewHolder r1) {
        return onInitBaseLayoutAfter$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(WeightHistoryFragment r0) {
        return onInitBaseLayoutAfter$lambda$0$1$0(r0);
    }

    public static /* synthetic */ Unit XO0O10(WeightHistoryFragment r0, DslAdapter r1) {
        return onMeasureWeightChanged$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOO0ii0(WeightHistoryFragment r0) {
        return onMeasureWeightChanged$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView XXI(WeightHistoryFragment r0) {
        return scrollView_delegate$lambda$0(r0);
    }

    @SuppressLint({"SetTextI18n"})
    private final void doItem(List<Weight> r7) {
        LinkedHashMap r0 = new LinkedHashMap();
        Iterator<T> r8 = r7.iterator();
    L4:
        if (r8.hasNext() == false) goto L9;
        Object r1 = r8.next();
        String r2 = O0X11OiO.iiIOiX().format(Long.valueOf(((Weight) r1).getMTime()));
        Object r3 = r0.get(r2);
        if (r3 != null) goto L8;
        r3 = new ArrayList();
        r0.put(r2, r3);
    L8:
        ((List) r3).add(r1);
        goto L4
    L9:
        Iterator r9 = r0.entrySet().iterator();
    L11:
        if (r9.hasNext() == false) goto L21;
        final Map.Entry r4 = (Map.Entry) r9.next();
        if (this.pageNum != 1) goto L15;
    L16:
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.weight_measure_history_group_item, new zy6(r4));
    L17:
        Iterator r5 = ((List) r4.getValue()).iterator();
    L19:
        if (r5.hasNext() == false) goto L11;
        final Weight r6 = (Weight) r5.next();
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.weight_measure_history_item, new az6(r4, r6, this));
        goto L19
    L15:
        if (DslAdapterExKt.Ii1iii0(getDslAdapter(), (String) r4.getKey(), false, 2, null) != null) goto L17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit doItem$lambda$1(final Map.Entry r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuEnable(false);
        r4.setItemIsGroupHead(false);
        r4.setItemIsHover(false);
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r3.getKey()}));
        r4.setItemBindOverride(new ty6(r3));
        r4.setItemTag((String) r3.getKey());
        return Unit.OXO1;
    }

    private static final Unit doItem$lambda$1$0(Map.Entry r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv_date);
        if (r5 == null) goto L6;
        r5.setText((CharSequence) r0.getKey());
    L6:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit doItem$lambda$2(Map.Entry r2, final Weight r3, final WeightHistoryFragment r4, final DslAdapterItem r5) {
        Intrinsics.X0O(r5, "$this$dslItem");
        r5.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r2.getKey()}));
        r5.setItemSwipeMenuFlag(4);
        r5.setItemBindOverride(new uy6(r3, r4, r5));
        r5.setItemClick(new vy6(r3, r4));
        return Unit.OXO1;
    }

    private static final Unit doItem$lambda$2$0(final Weight r2, final WeightHistoryFragment r3, final DslAdapterItem r4, final DslViewHolder r5, int r6, DslAdapterItem r7, List r8) {
        Intrinsics.X0O(r5, "itemHolder");
        Intrinsics.X0O(r7, "<unused var>");
        Intrinsics.X0O(r8, "<unused var>");
        TextView r9 = r5.tv(R.id.tv_weightValue);
        if (r9 == null) goto L5;
        r9.setText(cp5.OIX0iXi(cp5.IXXOO(r2.getMWeight(), r3.mAppUser.getUnit())) + r3.getString(cp5.iX(r3.mAppUser.getUnit())));
    L5:
        TextView r10 = r5.tv(R.id.tv_bmiValue);
        if (r10 == null) goto L13;
        if (r2.getMBmi() != 0.0d) goto L10;
        String r11 = cp5.I0IIOi(r2.getMWeight(), r3.mAppUser.getHeight());
    L11:
        r10.setText(r11);
        goto L13
    L10:
        r11 = WeightMeasureDataKt.keepOneDecimal(r2.getMBmi());
    L13:
        if (r2.getMIsMeasure() != 1) goto L23;
        ImageView r12 = r5.img(R.id.iv_measure_type);
        if (r12 == null) goto L17;
        r12.setImageResource(R.drawable.icon_measure_scale);
    L17:
        ImageView r13 = r5.img(R.id.iv_measure_item_right);
        if (r13 == null) goto L20;
        r13.setVisibility(0);
    L20:
        TextView r14 = r5.tv(R.id.tv_bfrValue);
        if (r14 == null) goto L32;
        r14.setText(r2.getMRatioOfFat() + "%");
    L32:
        r5.click(R.id.bt_delete_weight_record, new xy6(r2, r3, r4, r5));
        return Unit.OXO1;
    L23:
        ImageView r15 = r5.img(R.id.iv_measure_type);
        if (r15 == null) goto L26;
        r15.setImageResource(R.drawable.icon_measure_input);
    L26:
        ImageView r16 = r5.img(R.id.iv_measure_item_right);
        if (r16 == null) goto L29;
        r16.setVisibility(4);
    L29:
        TextView r17 = r5.tv(R.id.tv_bfrValue);
        if (r17 == null) goto L32;
        r17.setText(R.string.data_none);
        goto L32
    }

    private static final void doItem$lambda$2$0$0(Weight r3, WeightHistoryFragment r4, DslAdapterItem r5, DslViewHolder r6, View r7) {
        r3.setMIsSync(0);
        r3.setMIsDelete(1);
        r4.mWeightDao.update(CollectionsKt__CollectionsKt.Ii1iii0(new Weight[]{r3}));
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        SwipeMenuHelper r8 = r5.get_itemSwipeMenuHelper();
        if (r8 == null) goto L5;
        r8.closeSwipeMenu(r6);
    L5:
        DslAdapter r9 = r5.getItemDslAdapter();
        if (r9 == null) goto L8;
        DslAdapter.removeItem$default(r9, r5, false, 2, null);
    L8:
        DslAdapter r10 = r5.getItemDslAdapter();
        if (r10 == null) goto L11;
        DslAdapter.updateItemDepend$default(r10, null, 1, null);
    L11:
        r4.removeGroup(r5.getItemGroups());
    }

    private static final Unit doItem$lambda$2$1(Weight r3, WeightHistoryFragment r4, View r5) {
        Intrinsics.X0O(r5, "it");
        if (r3.getMIsMeasure() != 1) goto L6;
        Bundle r6 = new Bundle();
        r6.putString("mArg0", null);
        r6.putInt("mArg1", 1);
        r6.putParcelable("mArg2", null);
        r6.putSerializable("mArg3", r3);
        Intent r7 = new Intent(r4.getActivity(), WeightMeasureReportActivity.class);
        r7.putExtras(r6);
        r4.startActivity(r7);
    L6:
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(Map.Entry r0, Weight r1, WeightHistoryFragment r2, DslAdapterItem r3) {
        return doItem$lambda$2(r0, r1, r2, r3);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0(final WeightHistoryFragment r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        r5.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_weight_history_empty));
        DslAdapter.setAdapterStatus$default(r5, 2, null, 2, null);
        r4.getDslViewHolder().postDelay(1000, new fz6(r4));
        r5.getDslLoadMoreItem().setOnLoadMore(new sy6(r4));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(final WeightHistoryFragment r1) {
        r1.renderAdapter(new yy6(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0(WeightHistoryFragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r4, 0, null, 2, null);
        r4.setLoadMoreEnable(true);
        r3.pageNum = 1;
        r3.loadData(1);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1(final WeightHistoryFragment r3, DslViewHolder r4) {
        Intrinsics.X0O(r4, "it");
        r4.postDelay(1000, new bz6(r3));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1$0(final WeightHistoryFragment r1) {
        r1.renderAdapter(new ry6(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1$0$0(WeightHistoryFragment r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        int r3 = r1.pageNum + 1;
        r1.pageNum = r3;
        r1.loadData(r3);
        return Unit.OXO1;
    }

    private static final Unit onMeasureWeightChanged$lambda$0(final WeightHistoryFragment r1) {
        r1.renderAdapter(new ez6(r1));
        return Unit.OXO1;
    }

    private static final Unit onMeasureWeightChanged$lambda$0$0(WeightHistoryFragment r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.onRefresh();
        return Unit.OXO1;
    }

    private final void removeGroup(List<String> r7) {
        if (DslAdapterExKt.iIXi1iiXI(getDslAdapter(), r7, false, 2, null).size() != 1) goto L6;
        getDslAdapter().removeItem(DslAdapterExKt.iIXi1iiXI(getDslAdapter(), r7, false, 2, null));
        DslAdapter.updateItemDepend$default(getDslAdapter(), null, 1, null);
    L6:
        if (getDslAdapter().getDataItems().isEmpty() == false) goto L9;
        DslAdapter.setAdapterStatus$default(getDslAdapter(), 1, null, 2, null);
        DslAdapter.updateItemDepend$default(getDslAdapter(), null, 1, null);
        return;
    }

    private static final NestedScrollView scrollView_delegate$lambda$0(WeightHistoryFragment r1) {
        return (NestedScrollView) r1.getMView().findViewById(R.id.scrollView);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final NestedScrollView getScrollView() {
        return (NestedScrollView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_weight_history;
    }

    public final void loadData(int r12) {
        WeightDao r0 = this.mWeightDao;
        int r2 = this.pageSize;
        List<Weight> r1 = r0.getWeightsDESC((r12 - 1) * r2, r2);
        getRefreshLayout().setRefreshing(false);
        if (r1.isEmpty() == true) goto L5;
        DslAdapter.setAdapterStatus$default(getDslAdapter(), 0, null, 2, null);
        doItem(r1);
        DslAdapter.setLoadMore$default(getDslAdapter(), 0, null, false, 6, null);
        return;
    L5:
        if (r12 != 1) goto L8;
        DslAdapter.setAdapterStatus$default(getDslAdapter(), 1, null, 2, null);
        return;
    L8:
        DslAdapter.setLoadMore$default(getDslAdapter(), 2, null, false, 6, null);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapter(new wy6(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    @sf5(tag = I01XX0.I0iXXO)
    public final void onMeasureWeightChanged(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        LogUtils.v(new Object[]{"onMeasureWeightChanged"});
        getDslViewHolder().postDelay(300, new dz6(this));
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
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void share() {
        XIi1i01O r0 = XIi1i01O.OXO1;
        NestedScrollView r1 = getScrollView();
        Intrinsics.O10IXXX0X(r1, "<get-scrollView>(...)");
        Bitmap r2 = r0.iO(r1);
        r0.XO0O10(getMActivity(), r2);
    }
}
