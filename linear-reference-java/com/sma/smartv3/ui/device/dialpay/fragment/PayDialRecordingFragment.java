package com.sma.smartv3.ui.device.dialpay.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ap1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bp1;
import com.android.mltcode.paycertificationapi.ro1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.so1;
import com.android.mltcode.paycertificationapi.to1;
import com.android.mltcode.paycertificationapi.uo1;
import com.android.mltcode.paycertificationapi.vo1;
import com.android.mltcode.paycertificationapi.wo1;
import com.android.mltcode.paycertificationapi.yo1;
import com.android.mltcode.paycertificationapi.zo1;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.DialRecordingFragment;
import com.sma.smartv3.ui.device.dialpay.DialMoveActivity;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayDialRecordingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n37#2,2:211\n37#2,2:235\n85#3,3:213\n85#3,3:237\n50#3,3:259\n53#3:265\n55#3,2:267\n50#3,3:269\n53#3:275\n55#3,2:277\n99#4,7:216\n106#4,3:224\n79#4,7:227\n109#4:234\n99#4,7:240\n106#4,3:248\n79#4,7:251\n109#4:258\n1#5:223\n1#5:247\n1563#6:262\n1634#6,2:263\n1636#6:266\n1563#6:272\n1634#6,2:273\n1636#6:276\n*S KotlinDebug\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment\n*L\n75#1:211,2\n79#1:235,2\n75#1:213,3\n79#1:237,3\n88#1:259,3\n88#1:265\n88#1:267,2\n128#1:269,3\n128#1:275\n128#1:277,2\n76#1:216,7\n76#1:224,3\n76#1:227,7\n76#1:234\n80#1:240,7\n80#1:248,3\n80#1:251,7\n80#1:258\n76#1:223\n80#1:247\n88#1:262\n88#1:263,2\n88#1:266\n128#1:272\n128#1:273,2\n128#1:276\n*E\n"})
public final class PayDialRecordingFragment extends DialRecordingFragment {

    @aa1
    private final Lazy mHistoryLinearLayout$delegate;

    @aa1
    private final Lazy mHistoryOnlineMore$delegate;

    @aa1
    private final Lazy mHistoryRecyclerView$delegate;

    @aa1
    private final Lazy mVipFreeLinearLayout$delegate;

    @aa1
    private final Lazy mVipFreeOnlineMore$delegate;

    @aa1
    private final Lazy mVipFreeRecyclerView$delegate;

    @aa1
    private List<WatchFaceCategoryV2> mVipFreeWatchFaceAllList;

    @aa1
    private List<WatchFaceCategoryV2> mVipFreeWatchFaceList;

    @aa1
    private List<WatchFaceCategoryV2> mWatchFaceAllList;

    @aa1
    private List<WatchFaceCategoryV2> mWatchFaceList;

    public PayDialRecordingFragment() {
        this.mHistoryRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new so1(this));
        this.mHistoryLinearLayout$delegate = LazyKt__LazyJVMKt.iO(new to1(this));
        this.mHistoryOnlineMore$delegate = LazyKt__LazyJVMKt.iO(new uo1(this));
        this.mWatchFaceAllList = new ArrayList();
        this.mWatchFaceList = new ArrayList();
        this.mVipFreeRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new vo1(this));
        this.mVipFreeLinearLayout$delegate = LazyKt__LazyJVMKt.iO(new wo1(this));
        this.mVipFreeOnlineMore$delegate = LazyKt__LazyJVMKt.iO(new yo1(this));
        this.mVipFreeWatchFaceAllList = new ArrayList();
        this.mVipFreeWatchFaceList = new ArrayList();
    }

    public static /* synthetic */ RecyclerView I1(PayDialRecordingFragment r0) {
        return mHistoryRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(PayDialRecordingFragment r0) {
        return mVipFreeOnlineMore_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(PayDialRecordingFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ LinearLayout OX(PayDialRecordingFragment r0) {
        return mHistoryLinearLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(PayDialRecordingFragment r0, boolean r1) {
        return recordingPurchaseHistory$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XX0(PayDialRecordingFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout XiOIO(PayDialRecordingFragment r0) {
        return mVipFreeLinearLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XiOIii1(PayDialRecordingFragment r0) {
        return mVipFreeRecyclerView_delegate$lambda$0(r0);
    }

    private final LinearLayout getMHistoryLinearLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getMHistoryOnlineMore() {
        return (PFMedium) getValue();
    }

    private final RecyclerView getMHistoryRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final LinearLayout getMVipFreeLinearLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getMVipFreeOnlineMore() {
        return (PFMedium) getValue();
    }

    private final RecyclerView getMVipFreeRecyclerView() {
        return (RecyclerView) getValue();
    }

    public static /* synthetic */ PFMedium iIiiO(PayDialRecordingFragment r0) {
        return mHistoryOnlineMore_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOOX010X(PayDialRecordingFragment r0, boolean r1) {
        return recordingVIPFree$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(PayDialRecordingFragment r4, View r5) {
        a01.OXO1.iO().put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(CollectionsKt___CollectionsKt.IOOIXiI1(r4.mWatchFaceAllList).toArray(new WatchFaceCategoryV2[0])), false);
        String r6 = r4.getString(R.string.pay_synchronous_title);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r6);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r7 = new Intent(r4.getActivity(), DialMoveActivity.class);
        r7.putExtras(r0);
        r4.startActivity(r7);
    }

    private static final void initView$lambda$1(PayDialRecordingFragment r4, View r5) {
        a01.OXO1.iO().put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(CollectionsKt___CollectionsKt.IOOIXiI1(r4.mVipFreeWatchFaceAllList).toArray(new WatchFaceCategoryV2[0])), false);
        String r6 = r4.getString(R.string.free_limited_time_history_title);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r6);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r7 = new Intent(r4.getActivity(), DialMoveActivity.class);
        r7.putExtras(r0);
        r4.startActivity(r7);
    }

    private static final LinearLayout mHistoryLinearLayout_delegate$lambda$0(PayDialRecordingFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.purchase_history_ll);
    }

    private static final PFMedium mHistoryOnlineMore_delegate$lambda$0(PayDialRecordingFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.dial_purchase_history_more);
    }

    private static final RecyclerView mHistoryRecyclerView_delegate$lambda$0(PayDialRecordingFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.purchase_history_rl);
    }

    private static final LinearLayout mVipFreeLinearLayout_delegate$lambda$0(PayDialRecordingFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.free_limited_time_history_ll);
    }

    private static final PFMedium mVipFreeOnlineMore_delegate$lambda$0(PayDialRecordingFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.free_limited_time_history_more);
    }

    private static final RecyclerView mVipFreeRecyclerView_delegate$lambda$0(PayDialRecordingFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.free_limited_time_rl);
    }

    private final void recordingPayOnlineRecycler() {
    }

    private final void recordingPurchaseHistory() {
        getMHistoryRecyclerView().setLayoutManager(new GridLayoutManager(requireActivity(), getMRecyclerSpanCount()));
        WatchFaceManager.OXO1.O10IXXX0X(new bp1(this));
    }

    private static final Unit recordingPurchaseHistory$lambda$0(PayDialRecordingFragment r4, boolean r5) {
        if (r5 == true) goto L21;
    L11:
        int r1 = 0;
        if (r4.mWatchFaceAllList.size() <= 3) goto L14;
        r4.mWatchFaceList.add(r4.mWatchFaceAllList.get(0));
        r4.mWatchFaceList.add(r4.mWatchFaceAllList.get(1));
        r4.mWatchFaceList.add(r4.mWatchFaceAllList.get(2));
    L15:
        LinearLayout r6 = r4.getMHistoryLinearLayout();
        if (r4.mWatchFaceList.size() > 0) goto L19;
        r1 = 8;
    L19:
        r6.setVisibility(r1);
        PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1 r2 = new PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1(r4, r4.getContext(), r4.mWatchFaceList);
        r4.getMHistoryRecyclerView().setAdapter(r2);
        r2.notifyDataSetChanged();
        return Unit.OXO1;
    L14:
        r4.mWatchFaceList.addAll(r4.mWatchFaceAllList);
        goto L15
    L21:
        JsonArray r7 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.X0iO)).getAsJsonArray();     // Catch: Exception -> L9
        Intrinsics.XXI(r7);     // Catch: Exception -> L9
        Collection r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r7, 10));     // Catch: Exception -> L9
        Iterator<JsonElement> r8 = r7.iterator();     // Catch: Exception -> L9
    L6:
        if (r8.hasNext() == false) goto L10;
        JsonElement r3 = r8.next();     // Catch: Exception -> L9
        r0.add(new Gson().fromJson(r3, WatchFaceCategoryV2.class));     // Catch: Exception -> L9
    L10:
        r4.mWatchFaceAllList = CollectionsKt___CollectionsKt.OO0Oi10(r0);
    L9:
        r0 = CollectionsKt__CollectionsKt.iI();
        goto L10
    }

    private final void recordingVIPFree() {
        getMVipFreeRecyclerView().setLayoutManager(new GridLayoutManager(requireActivity(), getMRecyclerSpanCount()));
        WatchFaceManager.OXO1.IiI10X(new ro1(this));
    }

    private static final Unit recordingVIPFree$lambda$0(PayDialRecordingFragment r4, boolean r5) {
        if (r5 == false) goto L12;
        JsonArray r6 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.X00O0)).getAsJsonArray();     // Catch: Exception -> L9
        Intrinsics.XXI(r6);     // Catch: Exception -> L9
        Collection r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L9
        Iterator<JsonElement> r7 = r6.iterator();     // Catch: Exception -> L9
    L6:
        if (r7.hasNext() == false) goto L10;
        r0.add(new Gson().fromJson(r7.next(), WatchFaceCategoryV2.class));     // Catch: Exception -> L9
    L10:
        r4.mVipFreeWatchFaceAllList = CollectionsKt___CollectionsKt.OO0Oi10(r0);
    L9:
        r0 = CollectionsKt__CollectionsKt.iI();
    L12:
        if (r4.mVipFreeWatchFaceAllList.size() <= 3) goto L14;
        r4.mVipFreeWatchFaceList.add(r4.mVipFreeWatchFaceAllList.get(0));
        r4.mVipFreeWatchFaceList.add(r4.mVipFreeWatchFaceAllList.get(1));
        r4.mVipFreeWatchFaceList.add(r4.mVipFreeWatchFaceAllList.get(2));
    L15:
        LinearLayout r8 = r4.getMVipFreeLinearLayout();
        if (r4.mVipFreeWatchFaceList.size() <= 0) goto L18;
        int r1 = 0;
    L19:
        r8.setVisibility(r1);
        List r9 = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0});
        r9.set(0, Integer.valueOf(a01.OXO1.XIi00iiXO().getInt("syncId", 0)));
        PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1 r2 = new PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1(r4, r9, r4.getContext(), r4.mVipFreeWatchFaceList);
        r4.getMVipFreeRecyclerView().setAdapter(r2);
        r2.notifyDataSetChanged();
        return Unit.OXO1;
    L18:
        r1 = 8;
        goto L19
    L14:
        r4.mVipFreeWatchFaceList.addAll(r4.mVipFreeWatchFaceAllList);
        goto L15
    }

    @Override // com.sma.smartv3.ui.device.dial.DialRecordingFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        recordingVIPFree();
        recordingPurchaseHistory();
        recordingPayOnlineRecycler();
        getMHistoryOnlineMore().setOnClickListener(new zo1(this));
        getMVipFreeOnlineMore().setOnClickListener(new ap1(this));
    }

    @Override // com.sma.smartv3.ui.device.dial.DialRecordingFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_dial_recording_pay;
    }

    @Override // com.sma.smartv3.ui.device.dial.DialRecordingFragment
    public void notifyData() {
        super.notifyData();
        recordingPayOnlineRecycler();
    }

    @sf5(tag = I01XX0.XIIO11I)
    public final void onChangedData(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        recordingPurchaseHistory();
        recordingVIPFree();
    }
}
