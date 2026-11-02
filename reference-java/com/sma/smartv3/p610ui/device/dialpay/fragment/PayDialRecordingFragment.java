package com.sma.smartv3.p610ui.device.dialpay.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sf5;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.p610ui.device.dial.DialRecordingFragment;
import com.sma.smartv3.p610ui.device.dialpay.DialMoveActivity;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayDialRecordingFragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayDialRecordingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n37#2,2:211\n37#2,2:235\n85#3,3:213\n85#3,3:237\n50#3,3:259\n53#3:265\n55#3,2:267\n50#3,3:269\n53#3:275\n55#3,2:277\n99#4,7:216\n106#4,3:224\n79#4,7:227\n109#4:234\n99#4,7:240\n106#4,3:248\n79#4,7:251\n109#4:258\n1#5:223\n1#5:247\n1563#6:262\n1634#6,2:263\n1636#6:266\n1563#6:272\n1634#6,2:273\n1636#6:276\n*S KotlinDebug\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment\n*L\n75#1:211,2\n79#1:235,2\n75#1:213,3\n79#1:237,3\n88#1:259,3\n88#1:265\n88#1:267,2\n128#1:269,3\n128#1:275\n128#1:277,2\n76#1:216,7\n76#1:224,3\n76#1:227,7\n76#1:234\n80#1:240,7\n80#1:248,3\n80#1:251,7\n80#1:258\n76#1:223\n80#1:247\n88#1:262\n88#1:263,2\n88#1:266\n128#1:272\n128#1:273,2\n128#1:276\n*E\n"})
public final class PayDialRecordingFragment extends DialRecordingFragment {

    @aa1
    private final Lazy mHistoryRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.so1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayDialRecordingFragment.mHistoryRecyclerView_delegate$lambda$0(this.f11094IO);
        }
    });

    @aa1
    private final Lazy mHistoryLinearLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.to1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayDialRecordingFragment.mHistoryLinearLayout_delegate$lambda$0(this.f11316IO);
        }
    });

    @aa1
    private final Lazy mHistoryOnlineMore$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uo1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayDialRecordingFragment.mHistoryOnlineMore_delegate$lambda$0(this.f11537IO);
        }
    });

    @aa1
    private List<WatchFaceCategoryV2> mWatchFaceAllList = new ArrayList();

    @aa1
    private List<WatchFaceCategoryV2> mWatchFaceList = new ArrayList();

    @aa1
    private final Lazy mVipFreeRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vo1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayDialRecordingFragment.mVipFreeRecyclerView_delegate$lambda$0(this.f11775IO);
        }
    });

    @aa1
    private final Lazy mVipFreeLinearLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wo1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayDialRecordingFragment.mVipFreeLinearLayout_delegate$lambda$0(this.f12003IO);
        }
    });

    @aa1
    private final Lazy mVipFreeOnlineMore$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yo1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayDialRecordingFragment.mVipFreeOnlineMore_delegate$lambda$0(this.f12413IO);
        }
    });

    @aa1
    private List<WatchFaceCategoryV2> mVipFreeWatchFaceAllList = new ArrayList();

    @aa1
    private List<WatchFaceCategoryV2> mVipFreeWatchFaceList = new ArrayList();

    private final LinearLayout getMHistoryLinearLayout() {
        return (LinearLayout) this.mHistoryLinearLayout$delegate.getValue();
    }

    private final PFMedium getMHistoryOnlineMore() {
        return (PFMedium) this.mHistoryOnlineMore$delegate.getValue();
    }

    private final RecyclerView getMHistoryRecyclerView() {
        return (RecyclerView) this.mHistoryRecyclerView$delegate.getValue();
    }

    private final LinearLayout getMVipFreeLinearLayout() {
        return (LinearLayout) this.mVipFreeLinearLayout$delegate.getValue();
    }

    private final PFMedium getMVipFreeOnlineMore() {
        return (PFMedium) this.mVipFreeOnlineMore$delegate.getValue();
    }

    private final RecyclerView getMVipFreeRecyclerView() {
        return (RecyclerView) this.mVipFreeRecyclerView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PayDialRecordingFragment payDialRecordingFragment, View view) {
        a01.OXO1.m1440iO().put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(CollectionsKt___CollectionsKt.IOOIXiI1(payDialRecordingFragment.mWatchFaceAllList).toArray(new WatchFaceCategoryV2[0])), false);
        String string = payDialRecordingFragment.getString(R.string.pay_synchronous_title);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", string);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(payDialRecordingFragment.getActivity(), (Class<?>) DialMoveActivity.class);
        intent.putExtras(bundle);
        payDialRecordingFragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(PayDialRecordingFragment payDialRecordingFragment, View view) {
        a01.OXO1.m1440iO().put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(CollectionsKt___CollectionsKt.IOOIXiI1(payDialRecordingFragment.mVipFreeWatchFaceAllList).toArray(new WatchFaceCategoryV2[0])), false);
        String string = payDialRecordingFragment.getString(R.string.free_limited_time_history_title);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", string);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(payDialRecordingFragment.getActivity(), (Class<?>) DialMoveActivity.class);
        intent.putExtras(bundle);
        payDialRecordingFragment.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mHistoryLinearLayout_delegate$lambda$0(PayDialRecordingFragment payDialRecordingFragment) {
        return (LinearLayout) payDialRecordingFragment.getMView().findViewById(R.id.purchase_history_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mHistoryOnlineMore_delegate$lambda$0(PayDialRecordingFragment payDialRecordingFragment) {
        return (PFMedium) payDialRecordingFragment.getMView().findViewById(R.id.dial_purchase_history_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mHistoryRecyclerView_delegate$lambda$0(PayDialRecordingFragment payDialRecordingFragment) {
        return (RecyclerView) payDialRecordingFragment.getMView().findViewById(R.id.purchase_history_rl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout mVipFreeLinearLayout_delegate$lambda$0(PayDialRecordingFragment payDialRecordingFragment) {
        return (LinearLayout) payDialRecordingFragment.getMView().findViewById(R.id.free_limited_time_history_ll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mVipFreeOnlineMore_delegate$lambda$0(PayDialRecordingFragment payDialRecordingFragment) {
        return (PFMedium) payDialRecordingFragment.getMView().findViewById(R.id.free_limited_time_history_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mVipFreeRecyclerView_delegate$lambda$0(PayDialRecordingFragment payDialRecordingFragment) {
        return (RecyclerView) payDialRecordingFragment.getMView().findViewById(R.id.free_limited_time_rl);
    }

    private final void recordingPayOnlineRecycler() {
    }

    private final void recordingPurchaseHistory() {
        getMHistoryRecyclerView().setLayoutManager(new GridLayoutManager(requireActivity(), getMRecyclerSpanCount()));
        WatchFaceManager.OXO1.O10IXXX0X(new Function1() { // from class: com.android.mltcode.paycertificationapi.bp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayDialRecordingFragment.recordingPurchaseHistory$lambda$0(this.f5779IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordingPurchaseHistory$lambda$0(PayDialRecordingFragment payDialRecordingFragment, boolean z) {
        Collection collectionM39402iI;
        if (z) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.X0iO)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), WatchFaceCategoryV2.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            payDialRecordingFragment.mWatchFaceAllList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        }
        if (payDialRecordingFragment.mWatchFaceAllList.size() > 3) {
            payDialRecordingFragment.mWatchFaceList.add(payDialRecordingFragment.mWatchFaceAllList.get(0));
            payDialRecordingFragment.mWatchFaceList.add(payDialRecordingFragment.mWatchFaceAllList.get(1));
            payDialRecordingFragment.mWatchFaceList.add(payDialRecordingFragment.mWatchFaceAllList.get(2));
        } else {
            payDialRecordingFragment.mWatchFaceList.addAll(payDialRecordingFragment.mWatchFaceAllList);
        }
        payDialRecordingFragment.getMHistoryLinearLayout().setVisibility(payDialRecordingFragment.mWatchFaceList.size() <= 0 ? 8 : 0);
        PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1 payDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1 = new PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1(payDialRecordingFragment, payDialRecordingFragment.getContext(), payDialRecordingFragment.mWatchFaceList);
        payDialRecordingFragment.getMHistoryRecyclerView().setAdapter(payDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1);
        payDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1.notifyDataSetChanged();
        return Unit.OXO1;
    }

    private final void recordingVIPFree() {
        getMVipFreeRecyclerView().setLayoutManager(new GridLayoutManager(requireActivity(), getMRecyclerSpanCount()));
        WatchFaceManager.OXO1.IiI10X(new Function1() { // from class: com.android.mltcode.paycertificationapi.ro1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayDialRecordingFragment.recordingVIPFree$lambda$0(this.f10857IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordingVIPFree$lambda$0(PayDialRecordingFragment payDialRecordingFragment, boolean z) {
        Collection collectionM39402iI;
        if (z) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.X00O0)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), WatchFaceCategoryV2.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            payDialRecordingFragment.mVipFreeWatchFaceAllList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        }
        if (payDialRecordingFragment.mVipFreeWatchFaceAllList.size() > 3) {
            payDialRecordingFragment.mVipFreeWatchFaceList.add(payDialRecordingFragment.mVipFreeWatchFaceAllList.get(0));
            payDialRecordingFragment.mVipFreeWatchFaceList.add(payDialRecordingFragment.mVipFreeWatchFaceAllList.get(1));
            payDialRecordingFragment.mVipFreeWatchFaceList.add(payDialRecordingFragment.mVipFreeWatchFaceAllList.get(2));
        } else {
            payDialRecordingFragment.mVipFreeWatchFaceList.addAll(payDialRecordingFragment.mVipFreeWatchFaceAllList);
        }
        payDialRecordingFragment.getMVipFreeLinearLayout().setVisibility(payDialRecordingFragment.mVipFreeWatchFaceList.size() > 0 ? 0 : 8);
        List listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(0);
        listIi1iii0.set(0, Integer.valueOf(a01.OXO1.XIi00iiXO().getInt("syncId", 0)));
        PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1 payDialRecordingFragment$recordingVIPFree$1$mAdapter$1 = new PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1(payDialRecordingFragment, listIi1iii0, payDialRecordingFragment.getContext(), payDialRecordingFragment.mVipFreeWatchFaceList);
        payDialRecordingFragment.getMVipFreeRecyclerView().setAdapter(payDialRecordingFragment$recordingVIPFree$1$mAdapter$1);
        payDialRecordingFragment$recordingVIPFree$1$mAdapter$1.notifyDataSetChanged();
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.DialRecordingFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        recordingVIPFree();
        recordingPurchaseHistory();
        recordingPayOnlineRecycler();
        getMHistoryOnlineMore().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.zo1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayDialRecordingFragment.initView$lambda$0(this.f12652IO, view);
            }
        });
        getMVipFreeOnlineMore().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ap1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayDialRecordingFragment.initView$lambda$1(this.f5533IO, view);
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.device.dial.DialRecordingFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_dial_recording_pay;
    }

    @Override // com.sma.smartv3.p610ui.device.dial.DialRecordingFragment
    public void notifyData() {
        super.notifyData();
        recordingPayOnlineRecycler();
    }

    @sf5(tag = I01XX0.XIIO11I)
    public final void onChangedData(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        recordingPurchaseHistory();
        recordingVIPFree();
    }
}
