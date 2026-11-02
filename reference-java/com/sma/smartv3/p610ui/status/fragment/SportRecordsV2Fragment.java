package com.sma.smartv3.p610ui.status.fragment;

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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.p610ui.sport.SportDetailActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.status.SportRecordsDetailActivity;
import com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment;
import com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n19#2:309\n15#2:310\n1669#3,8:311\n257#4,2:319\n257#4,2:321\n99#5,7:323\n106#5,3:331\n79#5,7:334\n109#5:341\n99#5,7:342\n106#5,3:350\n79#5,7:353\n109#5:360\n99#5,7:361\n106#5,3:369\n79#5,7:372\n109#5:379\n1#6:330\n1#6:349\n1#6:368\n*S KotlinDebug\n*F\n+ 1 SportRecordsV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment\n*L\n53#1:309\n53#1:310\n121#1:311,8\n303#1:319,2\n148#1:321,2\n253#1:323,7\n253#1:331,3\n253#1:334,7\n253#1:341\n256#1:342,7\n256#1:350,3\n256#1:353,7\n256#1:360\n258#1:361,7\n258#1:369,3\n258#1:372,7\n258#1:379\n253#1:330\n256#1:349\n258#1:368\n*E\n"})
public class SportRecordsV2Fragment extends BaseRecyclerRecordsFragment<SportRecordData> {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private static final String TAG = "SportRecordsV2Fragment";
    private boolean competitionSelectionTime;

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

    @aa1
    private ArrayList<SportRecordData> sportRecordList;

    @aa1
    private final AppUser userProfile;

    @aa1
    private TimePeriod mTimePeriod = TimePeriod.DAY;
    private final int pageNumber = 200;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public SportRecordsV2Fragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mTotalTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalTitle_delegate$lambda$0(this.f6570IO);
            }
        });
        this.mTotalDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalDuration_delegate$lambda$0(this.f6813IO);
            }
        });
        this.mTotalDurationUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalDurationUnit_delegate$lambda$0(this.f7042IO);
            }
        });
        this.mTotalLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalLayout_delegate$lambda$0(this.f7739IO);
            }
        });
        this.mTotalSize$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalSize_delegate$lambda$0(this.f8876IO);
            }
        });
        this.mTotalSizeUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.k45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalSizeUnit_delegate$lambda$0(this.f9103IO);
            }
        });
        this.mTotalCalorie$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalCalorie_delegate$lambda$0(this.f9355IO);
            }
        });
        this.mTotalCalorieUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x35
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.mTotalCalorieUnit_delegate$lambda$0(this.f12096IO);
            }
        });
        this.sportRecordList = new ArrayList<>();
        setInitUpdate(false);
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    private final void findData(final DslAdapter dslAdapter, ArrayList<SportRecordData> arrayList) {
        getMTotalSize().setText(String.valueOf(arrayList.size()));
        Iterator<SportRecordData> it = arrayList.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        int mDuration = 0;
        int mCalorie = 0;
        while (it.hasNext()) {
            SportRecordData next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            final SportRecordData sportRecordData = next;
            final SportRecordItemCommonData sportRecordItemCommonData = SportRecordDataKt.parseSportRecordItemCommonData(getMActivity(), this.userProfile, sportRecordData);
            mDuration += sportRecordItemCommonData.getMDuration();
            mCalorie += sportRecordItemCommonData.getMCalorie();
            LogUtils.m11130i("SportRecordsV2Fragment itemData==" + sportRecordItemCommonData + " ");
            DslAdapterExKt.O10IXXX0X(dslAdapter, getItemLayout(), new Function1() { // from class: com.android.mltcode.paycertificationapi.z35
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportRecordsV2Fragment.findData$lambda$0(this.f12532IO, sportRecordItemCommonData, sportRecordData, dslAdapter, (DslAdapterItem) obj);
                }
            });
            getMTotalDuration().setText(O0X11OiO.XOX0O0(mDuration * 1000));
            getMTotalCalorie().setText(String.valueOf(mCalorie / 1000));
            if (arrayList.size() != 0) {
                getMTotalLayout().setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0(final SportRecordsV2Fragment sportRecordsV2Fragment, final SportRecordItemCommonData sportRecordItemCommonData, final SportRecordData sportRecordData, final DslAdapter dslAdapter, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.b45
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SportRecordsV2Fragment.findData$lambda$0$0(this.f5664IO, sportRecordItemCommonData, sportRecordData, dslItem, dslAdapter, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.c45
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsV2Fragment.findData$lambda$0$1(this.f5902IO, sportRecordData, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final SportRecordsV2Fragment sportRecordsV2Fragment, SportRecordItemCommonData sportRecordItemCommonData, final SportRecordData sportRecordData, final DslAdapterItem dslAdapterItem, final DslAdapter dslAdapter, final DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        sportRecordsV2Fragment.setItemView(itemHolder, sportRecordItemCommonData, sportRecordData);
        itemHolder.click(R.id.bt_delete_sport_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.d45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportRecordsV2Fragment.findData$lambda$0$0$0(sportRecordData, dslAdapterItem, itemHolder, sportRecordsV2Fragment, dslAdapter, view);
            }
        });
        View view = itemHolder.view(R.id.ll_item_panel);
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.e45
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return SportRecordsV2Fragment.findData$lambda$0$0$1$0(itemHolder, view2, motionEvent);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findData$lambda$0$0$0(SportRecordData sportRecordData, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, SportRecordsV2Fragment sportRecordsV2Fragment, DslAdapter dslAdapter, View view) {
        List<DslAdapterItem> dataItems;
        List<DslAdapterItem> dataItems2;
        SportRecordDataKt.deleteSportRecord(sportRecordData);
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            swipeMenuHelper.closeSwipeMenu(dslViewHolder);
        }
        DslAdapter itemDslAdapter = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter != null) {
            DslAdapter.removeItem$default(itemDslAdapter, dslAdapterItem, false, 2, null);
        }
        TextView mTotalSize = sportRecordsV2Fragment.getMTotalSize();
        DslAdapter itemDslAdapter2 = dslAdapterItem.getItemDslAdapter();
        mTotalSize.setText(String.valueOf((itemDslAdapter2 == null || (dataItems2 = itemDslAdapter2.getDataItems()) == null) ? null : Integer.valueOf(dataItems2.size())));
        DslAdapter itemDslAdapter3 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter3 != null && (dataItems = itemDslAdapter3.getDataItems()) != null && dataItems.size() == 0) {
            DslAdapter.setAdapterStatus$default(dslAdapter, 1, null, 2, null);
        }
        DslAdapter itemDslAdapter4 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter4 != null) {
            DslAdapter.updateItemDepend$default(itemDslAdapter4, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findData$lambda$0$0$1$0(DslViewHolder dslViewHolder, View view, MotionEvent motionEvent) {
        return dslViewHolder.itemView.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$1(SportRecordsV2Fragment sportRecordsV2Fragment, SportRecordData sportRecordData, DslAdapterItem dslAdapterItem, View it) {
        Intrinsics.X0O(it, "it");
        i72 i72Var = i72.OXO1;
        if (i72Var.iIXX0i()) {
            int mWorkoutId = sportRecordData.getMWorkoutId();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putInt("mArg1", mWorkoutId);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(sportRecordsV2Fragment.getActivity(), (Class<?>) SportDetailV2Activity.class);
            intent.putExtras(bundle);
            sportRecordsV2Fragment.startActivity(intent);
        } else if (i72Var.XII01OO1I()) {
            int mWorkoutId2 = sportRecordData.getMWorkoutId();
            Bundle bundle2 = new Bundle();
            bundle2.putString("mArg0", null);
            bundle2.putInt("mArg1", mWorkoutId2);
            bundle2.putParcelable("mArg2", null);
            bundle2.putSerializable("mArg3", null);
            Intent intent2 = new Intent(sportRecordsV2Fragment.getActivity(), (Class<?>) SportDetailActivity.class);
            intent2.putExtras(bundle2);
            sportRecordsV2Fragment.startActivity(intent2);
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putString("mArg0", null);
            bundle3.putParcelable("mArg2", sportRecordData);
            bundle3.putSerializable("mArg3", null);
            Intent intent3 = new Intent(sportRecordsV2Fragment.getActivity(), (Class<?>) SportRecordsDetailActivity.class);
            intent3.putExtras(bundle3);
            sportRecordsV2Fragment.startActivity(intent3);
        }
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            SwipeMenuHelper.closeSwipeMenu$default(swipeMenuHelper, null, 1, null);
        }
        return Unit.OXO1;
    }

    private final TextView getMTotalCalorie() {
        return (TextView) this.mTotalCalorie$delegate.getValue();
    }

    private final TextView getMTotalCalorieUnit() {
        return (TextView) this.mTotalCalorieUnit$delegate.getValue();
    }

    private final TextView getMTotalDuration() {
        return (TextView) this.mTotalDuration$delegate.getValue();
    }

    private final TextView getMTotalDurationUnit() {
        return (TextView) this.mTotalDurationUnit$delegate.getValue();
    }

    private final View getMTotalLayout() {
        return (View) this.mTotalLayout$delegate.getValue();
    }

    private final TextView getMTotalSize() {
        return (TextView) this.mTotalSize$delegate.getValue();
    }

    private final TextView getMTotalSizeUnit() {
        return (TextView) this.mTotalSizeUnit$delegate.getValue();
    }

    private final TextView getMTotalTitle() {
        return (TextView) this.mTotalTitle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalCalorieUnit_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_calorie_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalCalorie_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_calorie);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalDurationUnit_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_duration_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalDuration_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mTotalLayout_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalSizeUnit_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_size_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalSize_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTotalTitle_delegate$lambda$0(SportRecordsV2Fragment sportRecordsV2Fragment) {
        return (TextView) sportRecordsV2Fragment.getMView().findViewById(R.id.sport_record_total_title);
    }

    private final void onVisibility(DslViewHolder dslViewHolder, int i) {
        TextView textViewM3482tv = dslViewHolder.m3482tv(R.id.sportPace);
        if (textViewM3482tv != null) {
            textViewM3482tv.setVisibility(i);
        }
        TextView textViewM3482tv2 = dslViewHolder.m3482tv(R.id.sportPaceUnit);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setVisibility(i);
        }
    }

    public static /* synthetic */ void onVisibility$default(SportRecordsV2Fragment sportRecordsV2Fragment, DslViewHolder dslViewHolder, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVisibility");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        sportRecordsV2Fragment.onVisibility(dslViewHolder, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0(final SportRecordsV2Fragment sportRecordsV2Fragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        sportRecordsV2Fragment.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.a45
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportRecordsV2Fragment.setAdapter$lambda$0$0(this.f5420IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0(final SportRecordsV2Fragment sportRecordsV2Fragment) {
        sportRecordsV2Fragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.w35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsV2Fragment.setAdapter$lambda$0$0$0(this.f11875IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0$0(SportRecordsV2Fragment sportRecordsV2Fragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        if (sportRecordsV2Fragment.sportRecordList.isEmpty()) {
            DslAdapter.setAdapterStatus$default(sportRecordsV2Fragment.getDslAdapter(), 1, null, 2, null);
            View mTotalLayout = sportRecordsV2Fragment.getMTotalLayout();
            Intrinsics.O10IXXX0X(mTotalLayout, "<get-mTotalLayout>(...)");
            mTotalLayout.setVisibility(8);
        } else {
            sportRecordsV2Fragment.findData(renderAdapter, sportRecordsV2Fragment.sportRecordList);
            renderAdapter.setLoadMoreEnable(false);
        }
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
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

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final ArrayList<SportRecordData> getSportRecordList() {
        return this.sportRecordList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        super.init(bundle);
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMTotalDurationUnit().setText(getResources().getString(R.string.action_details) + " (" + getResources().getString(R.string.minute) + I000IiI1O.C2156iO.f1007iO);
        getMTotalSizeUnit().setText(String.valueOf(getResources().getString(R.string.number_of_times)));
        getMTotalCalorieUnit().setText(getResources().getString(R.string.quantity_of_heat) + " (" + getResources().getString(R.string.kcal) + I000IiI1O.C2156iO.f1007iO);
        mo48123getSportRecordList();
        super.initView();
    }

    public int layoutId() {
        return R.layout.fragment_rv_records_v2;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<SportRecordData> data) {
        Intrinsics.X0O(data, "data");
        getDslAdapter().clearAllItems();
        onInitBaseLayoutAfter();
        View mTotalLayout = getMTotalLayout();
        Intrinsics.O10IXXX0X(mTotalLayout, "<get-mTotalLayout>(...)");
        mTotalLayout.setVisibility(!this.sportRecordList.isEmpty() ? 0 : 8);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment, com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        if (this.dslViewHolder != null) {
            setAdapter();
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<SportRecordData> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        this.sportRecordList.clear();
        this.competitionSelectionTime = true;
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        if (getMArg1() > -1) {
            this.sportRecordList = SportRecordDataKt.getSportRecordList(jArrM787I1[0], jArrM787I1[1], 116);
        } else {
            this.sportRecordList = SportRecordDataKt.getSportRecordList$default(jArrM787I1[0], jArrM787I1[1], 0, 4, null);
        }
        LogUtils.m11128d("onTimePeriodChange " + jArrM787I1[0] + "  " + this.sportRecordList.size());
        return this.sportRecordList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setAdapter() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.y35
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportRecordsV2Fragment.setAdapter$lambda$0(this.f12299IO, (DslAdapter) obj);
            }
        });
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    public final void setCompetitionSelectionTime(boolean z) {
        this.competitionSelectionTime = z;
    }

    public void setItemView(@aa1 DslViewHolder itemHolder, @aa1 SportRecordItemCommonData itemData, @aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(itemData, "itemData");
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        ImageView imageViewImg = itemHolder.img(R.id.sportTypeIv);
        if (imageViewImg != null) {
            imageViewImg.setImageResource(itemData.getWorkoutImg());
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.sportName);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(itemData.getWorkoutModeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.sportStartTime);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(itemData.getSportStartTime());
        }
        boolean zXO0O10 = hu4.OXO1.XO0O10(sportRecordData.getMMode(), sportRecordData.getMPlatform());
        LogUtils.m11130i("SportRecordsV2Fragment " + itemData.getMPlatform() + " " + zXO0O10 + " " + sportRecordData.getMMode());
        if (zXO0O10) {
            TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.sportDistance);
            if (textViewM3482tv3 != null) {
                textViewM3482tv3.setText(String.valueOf(cp5.X1ii(itemData.getMDistance(), this.userProfile.getUnit(), false, 4, null)));
            }
            TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.sportDistance_unit);
            if (textViewM3482tv4 != null) {
                textViewM3482tv4.setText(cp5.XX0(this.userProfile.getUnit()));
            }
            onVisibility(itemHolder, 8);
        } else {
            TextView textViewM3482tv5 = itemHolder.m3482tv(R.id.sportDistance);
            if (textViewM3482tv5 != null) {
                textViewM3482tv5.setText(String.valueOf(itemData.getMCalorie() / 1000));
            }
            TextView textViewM3482tv6 = itemHolder.m3482tv(R.id.sportDistance_unit);
            if (textViewM3482tv6 != null) {
                textViewM3482tv6.setText(getString(R.string.kcal));
            }
            onVisibility(itemHolder, 8);
        }
        TextView textViewM3482tv7 = itemHolder.m3482tv(R.id.sportDistanceTimeTv);
        if (textViewM3482tv7 != null) {
            textViewM3482tv7.setText(O0X11OiO.iXiX011(itemData.getMDuration() * 1000));
        }
    }

    public void setMTimePeriod(@aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(timePeriod, "<set-?>");
        this.mTimePeriod = timePeriod;
    }

    public final void setSportRecordList(@aa1 ArrayList<SportRecordData> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.sportRecordList = arrayList;
    }

    @sf5(tag = I01XX0.IX1XiI)
    public final void syncDeleteSport(@aa1 Object any) {
        Intrinsics.X0O(any, "any");
        this.sportRecordList.clear();
        getDslAdapter().clearAllItems();
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSportRecordList */
    public void mo48123getSportRecordList() {
        if (getMArg1() > -1) {
            this.sportRecordList = SportRecordDataKt.getSportRecordListByMode(this.page, this.pageNumber, 116);
            getMTotalTitle().setText(getString(R.string.game_overview_item));
        } else {
            this.sportRecordList = SportRecordDataKt.getSportRecordList(this.page, this.pageNumber);
            getMTotalTitle().setText(getString(R.string.sports_overview));
        }
        ArrayList<SportRecordData> arrayList = this.sportRecordList;
        HashSet hashSet = new HashSet();
        ArrayList<SportRecordData> arrayList2 = new ArrayList<>();
        for (Object obj : arrayList) {
            if (hashSet.add(Long.valueOf(((SportRecordData) obj).getMStartTime()))) {
                arrayList2.add(obj);
            }
        }
        this.sportRecordList = arrayList2;
    }
}
