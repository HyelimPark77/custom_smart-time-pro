package com.sma.smartv3.ui.status.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a45;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b45;
import com.android.mltcode.paycertificationapi.c45;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.d45;
import com.android.mltcode.paycertificationapi.e45;
import com.android.mltcode.paycertificationapi.f45;
import com.android.mltcode.paycertificationapi.g45;
import com.android.mltcode.paycertificationapi.h45;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.i45;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.j45;
import com.android.mltcode.paycertificationapi.k45;
import com.android.mltcode.paycertificationapi.l45;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w35;
import com.android.mltcode.paycertificationapi.x35;
import com.android.mltcode.paycertificationapi.y35;
import com.android.mltcode.paycertificationapi.z35;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.codec.language.bm.Languages;
import com.google.gson.Gson;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailActivity;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.ui.status.SportRecordsDetailActivity;
import com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n19#2:309\n15#2:310\n1669#3,8:311\n257#4,2:319\n257#4,2:321\n99#5,7:323\n106#5,3:331\n79#5,7:334\n109#5:341\n99#5,7:342\n106#5,3:350\n79#5,7:353\n109#5:360\n99#5,7:361\n106#5,3:369\n79#5,7:372\n109#5:379\n1#6:330\n1#6:349\n1#6:368\n*S KotlinDebug\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n*L\n53#1:309\n53#1:310\n121#1:311,8\n303#1:319,2\n148#1:321,2\n253#1:323,7\n253#1:331,3\n253#1:334,7\n253#1:341\n256#1:342,7\n256#1:350,3\n256#1:353,7\n256#1:360\n258#1:361,7\n258#1:369,3\n258#1:372,7\n258#1:379\n253#1:330\n256#1:349\n258#1:368\n*E\n"})
public class SportRecordsV2Fragment extends BaseRecyclerRecordsFragment<SportRecordData> {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private static final String TAG = "SportRecordsV2Fragment";
    private boolean competitionSelectionTime;

    @aa1
    private TimePeriod mTimePeriod;

    @aa1
    private final Lazy mTotalCalorie$delegate;

    @aa1
    private final Lazy mTotalCalorieUnit$delegate;

    @aa1
    private final Lazy mTotalDuration$delegate;

    @aa1
    private final Lazy mTotalDurationUnit$delegate;

    @aa1
    private final Lazy mTotalLayout$delegate;

    @aa1
    private final Lazy mTotalSize$delegate;

    @aa1
    private final Lazy mTotalSizeUnit$delegate;

    @aa1
    private final Lazy mTotalTitle$delegate;
    private int page;
    private final int pageNumber;

    @aa1
    private ArrayList<SportRecordData> sportRecordList;

    @aa1
    private final AppUser userProfile;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SportRecordsV2Fragment() {
        this.mTimePeriod = TimePeriod.DAY;
        this.pageNumber = 200;
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.mTotalTitle$delegate = LazyKt__LazyJVMKt.iO(new f45(this));
        this.mTotalDuration$delegate = LazyKt__LazyJVMKt.iO(new g45(this));
        this.mTotalDurationUnit$delegate = LazyKt__LazyJVMKt.iO(new h45(this));
        this.mTotalLayout$delegate = LazyKt__LazyJVMKt.iO(new i45(this));
        this.mTotalSize$delegate = LazyKt__LazyJVMKt.iO(new j45(this));
        this.mTotalSizeUnit$delegate = LazyKt__LazyJVMKt.iO(new k45(this));
        this.mTotalCalorie$delegate = LazyKt__LazyJVMKt.iO(new l45(this));
        this.mTotalCalorieUnit$delegate = LazyKt__LazyJVMKt.iO(new x35(this));
        this.sportRecordList = new ArrayList();
        setInitUpdate(false);
    }

    public static /* synthetic */ Unit I1(SportRecordsV2Fragment r0) {
        return setAdapter$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(SportRecordsV2Fragment r0) {
        return mTotalDurationUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(SportRecordsV2Fragment r0) {
        return mTotalCalorie_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(SportRecordsV2Fragment r0) {
        return mTotalTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(SportRecordsV2Fragment r0, SportRecordItemCommonData r1, SportRecordData r2, DslAdapter r3, DslAdapterItem r4) {
        return findData$lambda$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OII(SportRecordsV2Fragment r0, SportRecordItemCommonData r1, SportRecordData r2, DslAdapterItem r3, DslAdapter r4, DslViewHolder r5, int r6, DslAdapterItem r7, List r8) {
        return findData$lambda$0$0(r0, r1, r2, r3, r4, r5, r6, r7, r8);
    }

    public static /* synthetic */ boolean OX(DslViewHolder r0, View r1, MotionEvent r2) {
        return findData$lambda$0$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ View OiIIX101O(SportRecordsV2Fragment r0) {
        return mTotalLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(SportRecordsV2Fragment r0) {
        return mTotalDuration_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(SportRecordData r0, DslAdapterItem r1, DslViewHolder r2, SportRecordsV2Fragment r3, DslAdapter r4, View r5) {
        findData$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ TextView X1ii(SportRecordsV2Fragment r0) {
        return mTotalCalorieUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(SportRecordsV2Fragment r0, SportRecordData r1, DslAdapterItem r2, View r3) {
        return findData$lambda$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XiOIO(SportRecordsV2Fragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ TextView XiOIii1(SportRecordsV2Fragment r0) {
        return mTotalSizeUnit_delegate$lambda$0(r0);
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    private final void findData(final DslAdapter r9, ArrayList<SportRecordData> r10) {
        getMTotalSize().setText(String.valueOf(r10.size()));
        Iterator<SportRecordData> r0 = r10.iterator();
        Intrinsics.O10IXXX0X(r0, "iterator(...)");
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r0.hasNext() == false) goto L8;
        SportRecordData r4 = r0.next();
        Intrinsics.O10IXXX0X(r4, "next(...)");
        final SportRecordData r5 = r4;
        final SportRecordItemCommonData r6 = SportRecordDataKt.parseSportRecordItemCommonData(getMActivity(), this.userProfile, r5);
        r2 = r2 + r6.getMDuration();
        r3 = r3 + r6.getMCalorie();
        LogUtils.i(new Object[]{"SportRecordsV2Fragment itemData==" + r6 + " "});
        DslAdapterExKt.O10IXXX0X(r9, getItemLayout(), new z35(this, r6, r5, r9));
        getMTotalDuration().setText(O0X11OiO.XOX0O0(r2 * 1000));
        getMTotalCalorie().setText(String.valueOf(r3 / 1000));
        if (r10.size() == 0) goto L4;
        getMTotalLayout().setVisibility(0);
        goto L4
    }

    private static final Unit findData$lambda$0(final SportRecordsV2Fragment r7, final SportRecordItemCommonData r8, final SportRecordData r9, final DslAdapter r10, final DslAdapterItem r11) {
        Intrinsics.X0O(r11, "$this$dslItem");
        r11.setItemSwipeMenuFlag(4);
        r11.setItemBindOverride(new b45(r7, r8, r9, r11, r10));
        r11.setItemClick(new c45(r7, r9, r11));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0(final SportRecordsV2Fragment r0, SportRecordItemCommonData r1, final SportRecordData r2, final DslAdapterItem r3, final DslAdapter r4, final DslViewHolder r5, int r6, DslAdapterItem r7, List r8) {
        Intrinsics.X0O(r5, "itemHolder");
        Intrinsics.X0O(r7, "<unused var>");
        Intrinsics.X0O(r8, "<unused var>");
        r0.setItemView(r5, r1, r2);
        r5.click(R.id.bt_delete_sport_record, new d45(r2, r3, r5, r0, r4));
        View r9 = r5.view(R.id.ll_item_panel);
        if (r9 == null) goto L6;
        r9.setOnTouchListener(new e45(r5));
    L6:
        return Unit.OXO1;
    }

    private static final void findData$lambda$0$0$0(SportRecordData r1, DslAdapterItem r2, DslViewHolder r3, SportRecordsV2Fragment r4, DslAdapter r5, View r6) {
        SportRecordDataKt.deleteSportRecord(r1);
        SwipeMenuHelper r7 = r2.get_itemSwipeMenuHelper();
        if (r7 == null) goto L5;
        r7.closeSwipeMenu(r3);
    L5:
        DslAdapter r8 = r2.getItemDslAdapter();
        if (r8 == null) goto L8;
        DslAdapter.removeItem$default(r8, r2, false, 2, null);
    L8:
        TextView r9 = r4.getMTotalSize();
        DslAdapter r10 = r2.getItemDslAdapter();
        if (r10 == null) goto L13;
        List<DslAdapterItem> r11 = r10.getDataItems();
        if (r11 == null) goto L13;
        Integer r12 = Integer.valueOf(r11.size());
    L14:
        r9.setText(String.valueOf(r12));
        DslAdapter r13 = r2.getItemDslAdapter();
        if (r13 == null) goto L21;
        List<DslAdapterItem> r14 = r13.getDataItems();
        if (r14 == null) goto L21;
        if (r14.size() != 0) goto L21;
        DslAdapter.setAdapterStatus$default(r5, 1, null, 2, null);
    L21:
        DslAdapter r15 = r2.getItemDslAdapter();
        if (r15 == null) goto L25;
        DslAdapter.updateItemDepend$default(r15, null, 1, null);
        return;
    L25:
        return;
    L13:
        r12 = null;
        goto L14
    }

    private static final boolean findData$lambda$0$0$1$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final Unit findData$lambda$0$1(SportRecordsV2Fragment r6, SportRecordData r7, DslAdapterItem r8, View r9) {
        Intrinsics.X0O(r9, "it");
        i72 r10 = i72.OXO1;
        if (r10.iIXX0i() == false) goto L6;
        int r11 = r7.getMWorkoutId();
        Bundle r12 = new Bundle();
        r12.putString("mArg0", null);
        r12.putInt("mArg1", r11);
        r12.putParcelable("mArg2", null);
        r12.putSerializable("mArg3", null);
        Intent r13 = new Intent(r6.getActivity(), SportDetailV2Activity.class);
        r13.putExtras(r12);
        r6.startActivity(r13);
    L9:
        SwipeMenuHelper r14 = r8.get_itemSwipeMenuHelper();
        if (r14 == null) goto L13;
        SwipeMenuHelper.closeSwipeMenu$default(r14, null, 1, null);
    L13:
        return Unit.OXO1;
    L6:
        if (r10.XII01OO1I() == false) goto L8;
        int r15 = r7.getMWorkoutId();
        Bundle r16 = new Bundle();
        r16.putString("mArg0", null);
        r16.putInt("mArg1", r15);
        r16.putParcelable("mArg2", null);
        r16.putSerializable("mArg3", null);
        Intent r17 = new Intent(r6.getActivity(), SportDetailActivity.class);
        r17.putExtras(r16);
        r6.startActivity(r17);
        goto L9
    L8:
        Bundle r18 = new Bundle();
        r18.putString("mArg0", null);
        r18.putParcelable("mArg2", r7);
        r18.putSerializable("mArg3", null);
        Intent r19 = new Intent(r6.getActivity(), SportRecordsDetailActivity.class);
        r19.putExtras(r18);
        r6.startActivity(r19);
        goto L9
    }

    private final TextView getMTotalCalorie() {
        return (TextView) getValue();
    }

    private final TextView getMTotalCalorieUnit() {
        return (TextView) getValue();
    }

    private final TextView getMTotalDuration() {
        return (TextView) getValue();
    }

    private final TextView getMTotalDurationUnit() {
        return (TextView) getValue();
    }

    private final View getMTotalLayout() {
        return (View) getValue();
    }

    private final TextView getMTotalSize() {
        return (TextView) getValue();
    }

    private final TextView getMTotalSizeUnit() {
        return (TextView) getValue();
    }

    private final TextView getMTotalTitle() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iIiiO(SportRecordsV2Fragment r0) {
        return mTotalSize_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOOX010X(SportRecordsV2Fragment r0, DslAdapter r1) {
        return setAdapter$lambda$0(r0, r1);
    }

    private static final TextView mTotalCalorieUnit_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_calorie_unit);
    }

    private static final TextView mTotalCalorie_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_calorie);
    }

    private static final TextView mTotalDurationUnit_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_duration_unit);
    }

    private static final TextView mTotalDuration_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_duration);
    }

    private static final View mTotalLayout_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return r1.getMView().findViewById(R.id.sport_record_total_layout);
    }

    private static final TextView mTotalSizeUnit_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_size_unit);
    }

    private static final TextView mTotalSize_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_size);
    }

    private static final TextView mTotalTitle_delegate$lambda$0(SportRecordsV2Fragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.sport_record_total_title);
    }

    private final void onVisibility(DslViewHolder r2, int r3) {
        TextView r0 = r2.tv(R.id.sportPace);
        if (r0 == null) goto L5;
        r0.setVisibility(r3);
    L5:
        TextView r4 = r2.tv(R.id.sportPaceUnit);
        if (r4 == null) goto L9;
        r4.setVisibility(r3);
        return;
    }

    public static /* synthetic */ void onVisibility$default(SportRecordsV2Fragment r0, DslViewHolder r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = 0;
    L6:
        r0.onVisibility(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVisibility");
    }

    private static final Unit setAdapter$lambda$0(final SportRecordsV2Fragment r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r3.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        r2.getDslViewHolder().post(new a45(r2));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0(final SportRecordsV2Fragment r1) {
        r1.renderAdapter(new w35(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0$0(SportRecordsV2Fragment r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r5, 0, null, 2, null);
        if (r4.sportRecordList.isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 1, null, 2, null);
        View r6 = r4.getMTotalLayout();
        Intrinsics.O10IXXX0X(r6, "<get-mTotalLayout>(...)");
        r6.setVisibility(8);
    L7:
        return Unit.OXO1;
    L5:
        r4.findData(r5, r4.sportRecordList);
        r5.setLoadMoreEnable(false);
        goto L7
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final boolean getCompetitionSelectionTime() {
        return this.competitionSelectionTime;
    }

    public int getItemLayout() {
        return R.layout.status_item_sport_record_detail_v2;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final ArrayList<SportRecordData> getSportRecordList() {
        return this.sportRecordList;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        super.init(r1);
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMTotalDurationUnit().setText(getResources().getString(R.string.action_details) + " (" + getResources().getString(R.string.minute) + I000IiI1O.iO.iO);
        getMTotalSizeUnit().setText(String.valueOf(getResources().getString(R.string.number_of_times)));
        getMTotalCalorieUnit().setText(getResources().getString(R.string.quantity_of_heat) + " (" + getResources().getString(R.string.kcal) + I000IiI1O.iO.iO);
        mo6764getSportRecordList();
        super.initView();
    }

    public int layoutId() {
        return R.layout.fragment_rv_records_v2;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<SportRecordData> r2) {
        Intrinsics.X0O(r2, "data");
        getDslAdapter().clearAllItems();
        onInitBaseLayoutAfter();
        View r3 = getMTotalLayout();
        Intrinsics.O10IXXX0X(r3, "<get-mTotalLayout>(...)");
        if (this.sportRecordList.isEmpty() == true) goto L5;
        int r0 = 0;
    L6:
        r3.setVisibility(r0);
        return;
    L5:
        r0 = 8;
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment, com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        if (this.dslViewHolder == null) goto L6;
        setAdapter();
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<SportRecordData> onTimePeriodChange(@aa1 Calendar r10, int r11, @aa1 TimePeriod r12) {
        Intrinsics.X0O(r10, "calendar");
        Intrinsics.X0O(r12, "timePeriod");
        this.sportRecordList.clear();
        this.competitionSelectionTime = true;
        long[] r13 = O0X11OiO.I1(r10, r12, r11);
        if (getMArg1() <= (-1)) goto L5;
        this.sportRecordList = SportRecordDataKt.getSportRecordList(r13[0], r13[1], 116);
    L6:
        LogUtils.d(new Object[]{"onTimePeriodChange " + r13[0] + "  " + this.sportRecordList.size()});
        return this.sportRecordList;
    L5:
        this.sportRecordList = SportRecordDataKt.getSportRecordList$default(r13[0], r13[1], 0, 4, null);
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setAdapter() {
        renderAdapter(new y35(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    public final void setCompetitionSelectionTime(boolean r1) {
        this.competitionSelectionTime = r1;
    }

    public void setItemView(@aa1 DslViewHolder r8, @aa1 SportRecordItemCommonData r9, @aa1 SportRecordData r10) {
        Intrinsics.X0O(r8, "itemHolder");
        Intrinsics.X0O(r9, "itemData");
        Intrinsics.X0O(r10, "sportRecordData");
        ImageView r0 = r8.img(R.id.sportTypeIv);
        if (r0 == null) goto L5;
        r0.setImageResource(r9.getWorkoutImg());
    L5:
        TextView r1 = r8.tv(R.id.sportName);
        if (r1 == null) goto L8;
        r1.setText(r9.getWorkoutModeName());
    L8:
        TextView r2 = r8.tv(R.id.sportStartTime);
        if (r2 == null) goto L11;
        r2.setText(r9.getSportStartTime());
    L11:
        boolean r3 = hu4.OXO1.XO0O10(r10.getMMode(), r10.getMPlatform());
        LogUtils.i(new Object[]{"SportRecordsV2Fragment " + r9.getMPlatform() + " " + r3 + " " + r10.getMMode()});
        if (r3 == false) goto L20;
        TextView r4 = r8.tv(R.id.sportDistance);
        if (r4 == null) goto L16;
        r4.setText(String.valueOf(cp5.X1ii(r9.getMDistance(), this.userProfile.getUnit(), false, 4, null)));
    L16:
        TextView r5 = r8.tv(R.id.sportDistance_unit);
        if (r5 == null) goto L19;
        r5.setText(cp5.XX0(this.userProfile.getUnit()));
    L19:
        onVisibility(r8, 8);
    L27:
        TextView r11 = r8.tv(R.id.sportDistanceTimeTv);
        if (r11 == null) goto L31;
        r11.setText(O0X11OiO.iXiX011(r9.getMDuration() * 1000));
        return;
    L31:
        return;
    L20:
        TextView r6 = r8.tv(R.id.sportDistance);
        if (r6 == null) goto L23;
        r6.setText(String.valueOf(r9.getMCalorie() / 1000));
    L23:
        TextView r7 = r8.tv(R.id.sportDistance_unit);
        if (r7 == null) goto L26;
        r7.setText(getString(R.string.kcal));
    L26:
        onVisibility(r8, 8);
        goto L27
    }

    public void setMTimePeriod(@aa1 TimePeriod r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTimePeriod = r2;
    }

    public final void setSportRecordList(@aa1 ArrayList<SportRecordData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportRecordList = r2;
    }

    @sf5(tag = I01XX0.IX1XiI)
    public final void syncDeleteSport(@aa1 Object r2) {
        Intrinsics.X0O(r2, Languages.ANY);
        this.sportRecordList.clear();
        getDslAdapter().clearAllItems();
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSportRecordList, reason: collision with other method in class */
    public void mo6764getSportRecordList() {
        if (getMArg1() <= (-1)) goto L5;
        this.sportRecordList = SportRecordDataKt.getSportRecordListByMode(this.page, this.pageNumber, 116);
        getMTotalTitle().setText(getString(R.string.game_overview_item));
    L6:
        ArrayList<SportRecordData> r0 = this.sportRecordList;
        HashSet r1 = new HashSet();
        ArrayList<SportRecordData> r2 = new ArrayList();
        Iterator<T> r3 = r0.iterator();
    L8:
        if (r3.hasNext() == false) goto L12;
        Object r4 = r3.next();
        if (r1.add(Long.valueOf(((SportRecordData) r4).getMStartTime())) == false) goto L8;
        r2.add(r4);
        goto L8
    L12:
        this.sportRecordList = r2;
        return;
    L5:
        this.sportRecordList = SportRecordDataKt.getSportRecordList(this.page, this.pageNumber);
        getMTotalTitle().setText(getString(R.string.sports_overview));
        goto L6
    }
}
