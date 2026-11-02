package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.k35;
import com.android.mltcode.paycertificationapi.l35;
import com.android.mltcode.paycertificationapi.m35;
import com.android.mltcode.paycertificationapi.n35;
import com.android.mltcode.paycertificationapi.o35;
import com.android.mltcode.paycertificationapi.p35;
import com.android.mltcode.paycertificationapi.q35;
import com.android.mltcode.paycertificationapi.r35;
import com.android.mltcode.paycertificationapi.s35;
import com.android.mltcode.paycertificationapi.t35;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u35;
import com.android.mltcode.paycertificationapi.v35;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.model.SportRecordItemAdapter;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.model.SportRecordItemData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailActivity;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.ui.status.SportRecordsDetailActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n19#2:166\n15#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n99#3,7:187\n106#3,3:195\n79#3,7:198\n109#3:205\n99#3,7:206\n106#3,3:214\n79#3,7:217\n109#3:224\n99#3,7:225\n106#3,3:233\n79#3,7:236\n109#3:243\n99#3,7:244\n106#3,3:252\n79#3,7:255\n109#3:262\n99#3,7:263\n106#3,3:271\n79#3,7:274\n109#3:281\n1#4:175\n1#4:194\n1#4:213\n1#4:232\n1#4:251\n1#4:270\n*S KotlinDebug\n*F\n+ 1 SportRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/SportRecordsFragment\n*L\n24#1:166\n24#1:167\n137#1:168,7\n137#1:176,3\n137#1:179,7\n137#1:186\n139#1:187,7\n139#1:195,3\n139#1:198,7\n139#1:205\n143#1:206,7\n143#1:214,3\n143#1:217,7\n143#1:224\n146#1:225,7\n146#1:233,3\n146#1:236,7\n146#1:243\n148#1:244,7\n148#1:252,3\n148#1:255,7\n148#1:262\n153#1:263,7\n153#1:271,3\n153#1:274,7\n153#1:281\n137#1:175\n139#1:194\n143#1:213\n146#1:232\n148#1:251\n153#1:270\n*E\n"})
public final class SportRecordsFragment extends BaseDSLRecyclerFragment {
    private int page;
    private final int pageNumber;

    @aa1
    private final AppUser userProfile;

    public SportRecordsFragment() {
        this.pageNumber = 30;
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
    }

    public static /* synthetic */ Unit I0IIOi(SportRecordData r0, SportRecordItemCommonData r1, DslAdapterItem r2, DslAdapter r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        return findData$lambda$0$0(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ Unit I0iXXO(SportRecordsFragment r0, DslViewHolder r1) {
        return onInitBaseLayoutAfter$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ boolean IO(DslViewHolder r0, View r1, MotionEvent r2) {
        return findData$lambda$0$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IiI10X(SportRecordsFragment r0) {
        return onInitBaseLayoutAfter$lambda$0$1$0(r0);
    }

    public static /* synthetic */ void O00(SportRecordData r0, DslAdapterItem r1, DslViewHolder r2, DslAdapter r3, View r4) {
        findData$lambda$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OIX0iXi(SportRecordsFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$1$0$0(r0, r1);
    }

    public static /* synthetic */ boolean OIi0(DslViewHolder r0, View r1, MotionEvent r2) {
        return findData$lambda$0$0$2$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X1ii(SportRecordData r0, SportRecordsFragment r1, DslAdapterItem r2, View r3) {
        return findData$lambda$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XO0O10(SportRecordsFragment r0) {
        return onInitBaseLayoutAfter$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(SportRecordsFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI(SportRecordsFragment r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$0$0$0(r0, r1);
    }

    private final void findData(final DslAdapter r4, ArrayList<SportRecordData> r5) {
        Iterator<SportRecordData> r6 = r5.iterator();
        Intrinsics.O10IXXX0X(r6, "iterator(...)");
    L4:
        if (r6.hasNext() == false) goto L6;
        SportRecordData r0 = r6.next();
        Intrinsics.O10IXXX0X(r0, "next(...)");
        final SportRecordData r1 = r0;
        final SportRecordItemCommonData r2 = SportRecordDataKt.parseSportRecordItemCommonData(getMActivity(), this.userProfile, r1);
        DslAdapterExKt.O10IXXX0X(r4, R.layout.status_item_sport_record_detail, new k35(r1, r2, r4, this));
        goto L4
    }

    private static final Unit findData$lambda$0(final SportRecordData r1, final SportRecordItemCommonData r2, final DslAdapter r3, final SportRecordsFragment r4, final DslAdapterItem r5) {
        Intrinsics.X0O(r5, "$this$dslItem");
        r5.setItemSwipeMenuFlag(4);
        r5.setItemBindOverride(new n35(r1, r2, r5, r3));
        r5.setItemClick(new o35(r1, r4, r5));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0(final SportRecordData r0, SportRecordItemCommonData r1, final DslAdapterItem r2, final DslAdapter r3, final DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "<unused var>");
        Intrinsics.X0O(r7, "<unused var>");
        ImageView r8 = r4.img(R.id.sportSourceIv);
        if (r8 != null) goto L5;
    L9:
        ImageView r9 = r4.img(R.id.sportTypeIv);
        if (r9 == null) goto L12;
        r9.setImageResource(r1.getWorkoutImg());
    L12:
        ImageView r10 = r4.img(R.id.gpsStatusIv);
        if (r10 == null) goto L15;
        r10.setImageResource(r1.getGpsState());
    L15:
        TextView r11 = r4.tv(R.id.sportName);
        if (r11 == null) goto L18;
        r11.setText(r1.getWorkoutModeName());
    L18:
        TextView r12 = r4.tv(R.id.sportStartTime);
        if (r12 == null) goto L21;
        r12.setText(r1.getSportStartTime());
    L21:
        r4.click(R.id.bt_delete_sport_record, new s35(r0, r2, r4, r3));
        RecyclerView r13 = r4.rv(R.id.rv);
        if (r13 == null) goto L24;
        r13.setLayoutManager(new GridLayoutManager(r13.getContext(), r1.getSpanCount()));
        List<SportRecordItemData> r14 = r1.getContentList();
        Context r15 = r13.getContext();
        Intrinsics.O10IXXX0X(r15, "getContext(...)");
        r13.setAdapter(new SportRecordItemAdapter(r14, r15));
        r13.setOnTouchListener(new t35(r4));
    L24:
        View r16 = r4.view(R.id.ll_item_panel);
        if (r16 == null) goto L28;
        r16.setOnTouchListener(new u35(r4));
    L28:
        return Unit.OXO1;
    L5:
        if (r0.getMSource() != 2) goto L7;
        int r17 = R.drawable.icon_phone;
    L8:
        r8.setImageResource(r17);
        goto L9
    L7:
        r17 = R.drawable.icon_watch;
        goto L8
    }

    private static final void findData$lambda$0$0$0(SportRecordData r1, DslAdapterItem r2, DslViewHolder r3, DslAdapter r4, View r5) {
        SportRecordDataKt.deleteSportRecord(r1);
        SwipeMenuHelper r6 = r2.get_itemSwipeMenuHelper();
        if (r6 == null) goto L5;
        r6.closeSwipeMenu(r3);
    L5:
        DslAdapter r7 = r2.getItemDslAdapter();
        if (r7 == null) goto L8;
        DslAdapter.removeItem$default(r7, r2, false, 2, null);
    L8:
        DslAdapter r8 = r2.getItemDslAdapter();
        if (r8 == null) goto L15;
        List<DslAdapterItem> r9 = r8.getDataItems();
        if (r9 == null) goto L15;
        if (r9.size() != 0) goto L15;
        DslAdapter.setAdapterStatus$default(r4, 1, null, 2, null);
    L15:
        DslAdapter r10 = r2.getItemDslAdapter();
        if (r10 == null) goto L19;
        DslAdapter.updateItemDepend$default(r10, null, 1, null);
        return;
    }

    private static final boolean findData$lambda$0$0$1$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final boolean findData$lambda$0$0$2$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final Unit findData$lambda$0$1(SportRecordData r10, SportRecordsFragment r11, DslAdapterItem r12, View r13) {
        Intrinsics.X0O(r13, "it");
        int r14 = r10.getMSource();
        if (r14 != 1) goto L5;
        i72 r15 = i72.OXO1;
        if (r15.iIXX0i() == false) goto L15;
        int r16 = r10.getMWorkoutId();
        Bundle r17 = new Bundle();
        r17.putString("mArg0", null);
        r17.putInt("mArg1", r16);
        r17.putParcelable("mArg2", null);
        r17.putSerializable("mArg3", null);
        Intent r18 = new Intent(r11.getActivity(), SportDetailV2Activity.class);
        r18.putExtras(r17);
        r11.startActivity(r18);
    L18:
        SwipeMenuHelper r19 = r12.get_itemSwipeMenuHelper();
        if (r19 == null) goto L22;
        SwipeMenuHelper.closeSwipeMenu$default(r19, null, 1, null);
    L22:
        return Unit.OXO1;
    L15:
        if (r15.XII01OO1I() == false) goto L17;
        int r110 = r10.getMWorkoutId();
        Bundle r111 = new Bundle();
        r111.putString("mArg0", null);
        r111.putInt("mArg1", r110);
        r111.putParcelable("mArg2", null);
        r111.putSerializable("mArg3", null);
        Intent r112 = new Intent(r11.getActivity(), SportDetailActivity.class);
        r112.putExtras(r111);
        r11.startActivity(r112);
        goto L18
    L17:
        Bundle r113 = new Bundle();
        r113.putString("mArg0", null);
        r113.putParcelable("mArg2", r10);
        r113.putSerializable("mArg3", null);
        Intent r114 = new Intent(r11.getActivity(), SportRecordsDetailActivity.class);
        r114.putExtras(r113);
        r11.startActivity(r114);
        goto L18
    L5:
        if (r14 == 2) goto L8;
        Bundle r115 = new Bundle();
        r115.putString("mArg0", null);
        r115.putParcelable("mArg2", r10);
        r115.putSerializable("mArg3", null);
        Intent r116 = new Intent(r11.getActivity(), SportRecordsDetailActivity.class);
        r116.putExtras(r115);
        r11.startActivity(r116);
        goto L18
    L8:
        if (i72.OXO1.iIXX0i() == false) goto L10;
        int r117 = r10.getMWorkoutId();
        Bundle r118 = new Bundle();
        r118.putString("mArg0", null);
        r118.putInt("mArg1", r117);
        r118.putParcelable("mArg2", null);
        r118.putSerializable("mArg3", null);
        Intent r119 = new Intent(r11.getActivity(), SportDetailV2Activity.class);
        r119.putExtras(r118);
        r11.startActivity(r119);
        goto L18
    L10:
        int r120 = r10.getMWorkoutId();
        Bundle r121 = new Bundle();
        r121.putString("mArg0", null);
        r121.putInt("mArg1", r120);
        r121.putParcelable("mArg2", null);
        r121.putSerializable("mArg3", null);
        Intent r122 = new Intent(r11.getActivity(), SportDetailActivity.class);
        r122.putExtras(r121);
        r11.startActivity(r122);
        goto L18
    }

    public static /* synthetic */ Unit iO(SportRecordData r0, SportRecordItemCommonData r1, DslAdapter r2, SportRecordsFragment r3, DslAdapterItem r4) {
        return findData$lambda$0(r0, r1, r2, r3, r4);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0(final SportRecordsFragment r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r5, 2, null, 2, null);
        r5.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty));
        r4.getDslViewHolder().postDelay(1000, new l35(r4));
        r5.getDslLoadMoreItem().setOnLoadMore(new m35(r4));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(final SportRecordsFragment r1) {
        r1.renderAdapter(new q35(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0$0(SportRecordsFragment r5, DslAdapter r6) {
        Intrinsics.X0O(r6, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r6, 0, null, 2, null);
        ArrayList<SportRecordData> r0 = SportRecordDataKt.getSportRecordList(r5.page, r5.pageNumber);
        if (r0.isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r5.getDslAdapter(), 1, null, 2, null);
    L7:
        return Unit.OXO1;
    L5:
        r5.findData(r6, r0);
        r6.setLoadMoreEnable(true);
        goto L7
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1(final SportRecordsFragment r3, DslViewHolder r4) {
        Intrinsics.X0O(r4, "it");
        r4.postDelay(1000, new r35(r3));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1$0(final SportRecordsFragment r1) {
        r1.renderAdapter(new v35(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1$0$0(SportRecordsFragment r14, DslAdapter r15) {
        Intrinsics.X0O(r15, "$this$renderAdapter");
        int r0 = r14.page + 1;
        r14.page = r0;
        int r1 = r14.pageNumber;
        ArrayList<SportRecordData> r2 = SportRecordDataKt.getSportRecordList((r0 * r1) - 1, r1);
        if (r2.isEmpty() == false) goto L5;
        DslAdapter.setLoadMore$default(r15, 2, null, false, 6, null);
    L7:
        return Unit.OXO1;
    L5:
        r14.findData(r15, r2);
        DslAdapter.setLoadMore$default(r15, 0, null, false, 6, null);
        goto L7
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        renderAdapter(new p35(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }
}
