package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DragCallbackHelper;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.p610ui.device.SMSQuickReplyActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleSMSQuickReplyContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSMSQuickReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1563#2:151\n1634#2,3:152\n*S KotlinDebug\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n*L\n62#1:151\n62#1:152,3\n*E\n"})
public final class SMSQuickReplyActivity extends BaseDSLRecyclerActivity {

    @tb1
    private iii1ii mEditPop;
    private List<BleSMSQuickReplyContent> mList;

    @aa1
    private final Lazy tvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nr3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SMSQuickReplyActivity.tvTip_delegate$lambda$0(this.f10002IO);
        }
    });

    @aa1
    private final Lazy btnBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.or3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SMSQuickReplyActivity.btnBottom_delegate$lambda$0(this.f10201IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnBottom_delegate$lambda$0(SMSQuickReplyActivity sMSQuickReplyActivity) {
        return sMSQuickReplyActivity.findViewById(R.id.btn_bottom);
    }

    private final void checkCount(List<BleSMSQuickReplyContent> list) {
        getTvTip().setVisibility(list.isEmpty() ? 8 : 0);
        int iX00O0 = q62.OXO1.X00O0();
        getTvTip().setText(getString(R.string.sms_quick_reply_tip, Integer.valueOf(iX00O0)));
        getBtnBottom().setEnabled(list.size() < iX00O0);
    }

    private final View getBtnBottom() {
        return (View) this.btnBottom$delegate.getValue();
    }

    private final TextView getTvTip() {
        return (TextView) this.tvTip$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBottomClick$lambda$0$0(SMSQuickReplyActivity sMSQuickReplyActivity, String text) {
        Intrinsics.X0O(text, "text");
        if (text.length() <= 0) {
            return false;
        }
        List<BleSMSQuickReplyContent> list = sMSQuickReplyActivity.mList;
        List<BleSMSQuickReplyContent> list2 = null;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        list.add(new BleSMSQuickReplyContent(text));
        List<BleSMSQuickReplyContent> list3 = sMSQuickReplyActivity.mList;
        if (list3 == null) {
            Intrinsics.XXO("mList");
        } else {
            list2 = list3;
        }
        sMSQuickReplyActivity.showList(list2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(DragCallbackHelper dragCallbackHelper, SMSQuickReplyActivity sMSQuickReplyActivity, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.X0O(recyclerView, "<unused var>");
        Intrinsics.X0O(viewHolder, "<unused var>");
        if (dragCallbackHelper.get_dragHappened()) {
            List<BleSMSQuickReplyContent> list = sMSQuickReplyActivity.mList;
            if (list == null) {
                Intrinsics.XXO("mList");
                list = null;
            }
            sMSQuickReplyActivity.showList(list);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$1(SMSQuickReplyActivity sMSQuickReplyActivity, List fromList, List toList, int i, int i2) {
        Intrinsics.X0O(fromList, "fromList");
        Intrinsics.X0O(toList, "toList");
        List<BleSMSQuickReplyContent> list = sMSQuickReplyActivity.mList;
        List<BleSMSQuickReplyContent> list2 = null;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        Collections.swap(list, i, i2);
        List<BleSMSQuickReplyContent> list3 = sMSQuickReplyActivity.mList;
        if (list3 == null) {
            Intrinsics.XXO("mList");
        } else {
            list2 = list3;
        }
        List<BleSMSQuickReplyContent> list4 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(((BleSMSQuickReplyContent) it.next()).getMContent());
        }
        LogUtils.m11128d(String.valueOf(arrayList));
        return Unit.OXO1;
    }

    private final void showList(final List<BleSMSQuickReplyContent> list) {
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.lr3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SMSQuickReplyActivity.showList$lambda$0(list, this, (DslAdapter) obj);
            }
        });
        syncList(list);
        checkCount(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(List list, final SMSQuickReplyActivity sMSQuickReplyActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        if (list.isEmpty()) {
            DslAdapter.setAdapterStatus$default(sMSQuickReplyActivity.getDslAdapter(), 1, null, 2, null);
        } else {
            DslAdapter.setAdapterStatus$default(sMSQuickReplyActivity.getDslAdapter(), 0, null, 2, null);
            sMSQuickReplyActivity.getRecyclerView().setVisibility(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final BleSMSQuickReplyContent bleSMSQuickReplyContent = (BleSMSQuickReplyContent) it.next();
                DslAdapterExKt.O10IXXX0X(sMSQuickReplyActivity.getDslAdapter(), R.layout.item_sms_quick_reply, new Function1() { // from class: com.android.mltcode.paycertificationapi.hr3
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SMSQuickReplyActivity.showList$lambda$0$0(bleSMSQuickReplyContent, sMSQuickReplyActivity, (DslAdapterItem) obj);
                    }
                });
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final BleSMSQuickReplyContent bleSMSQuickReplyContent, final SMSQuickReplyActivity sMSQuickReplyActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.jr3
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SMSQuickReplyActivity.showList$lambda$0$0$0(bleSMSQuickReplyContent, sMSQuickReplyActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(BleSMSQuickReplyContent bleSMSQuickReplyContent, final SMSQuickReplyActivity sMSQuickReplyActivity, DslViewHolder itemHolder, final int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(bleSMSQuickReplyContent.getMContent());
        }
        ImageView imageViewImg = itemHolder.img(R.id.btn_delete);
        if (imageViewImg != null) {
            imageViewImg.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.mr3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SMSQuickReplyActivity.showList$lambda$0$0$0$0(this.f9771IO, i, view);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$0(final SMSQuickReplyActivity sMSQuickReplyActivity, final int i, View view) {
        go0 go0Var = new go0(sMSQuickReplyActivity.getMContext(), 0, 2, null);
        go0Var.O1O(R.string.delete_record_remind);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.pr3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(SMSQuickReplyActivity.showList$lambda$0$0$0$0$0$0());
            }
        });
        go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.qr3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(SMSQuickReplyActivity.showList$lambda$0$0$0$0$0$1(this.f10663IO, i));
            }
        });
        go0Var.X0O(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showList$lambda$0$0$0$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showList$lambda$0$0$0$0$0$1(SMSQuickReplyActivity sMSQuickReplyActivity, int i) {
        List<BleSMSQuickReplyContent> list = sMSQuickReplyActivity.mList;
        List<BleSMSQuickReplyContent> list2 = null;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        list.remove(i);
        List<BleSMSQuickReplyContent> list3 = sMSQuickReplyActivity.mList;
        if (list3 == null) {
            Intrinsics.XXO("mList");
        } else {
            list2 = list3;
        }
        sMSQuickReplyActivity.showList(list2);
        return true;
    }

    private final void syncList(List<BleSMSQuickReplyContent> list) {
        BaseBleConnector.sendList$default(BleConnector.INSTANCE, BleKey.SMS_QUICK_REPLY_CONTENT, BleKeyFlag.RESET, list, false, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTip_delegate$lambda$0(SMSQuickReplyActivity sMSQuickReplyActivity) {
        return (TextView) sMSQuickReplyActivity.findViewById(R.id.tv_tip);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.sms_quick_reply);
        getDslAdapter().getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sms_empty));
        List<BleSMSQuickReplyContent> list$default = BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SMS_QUICK_REPLY_CONTENT, BleSMSQuickReplyContent.class, null, 4, null);
        this.mList = list$default;
        if (list$default == null) {
            Intrinsics.XXO("mList");
            list$default = null;
        }
        showList(list$default);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sms_quick_reply;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mEditPop == null) {
            iii1ii iii1iiVar = new iii1ii(getMContext(), 0, 2, null);
            iii1iiVar.XXX11i(R.string.sms_quick_reply);
            iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.kr3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(SMSQuickReplyActivity.onBottomClick$lambda$0$0(this.f9262IO, (String) obj));
                }
            });
            this.mEditPop = iii1iiVar;
        }
        iii1ii iii1iiVar2 = this.mEditPop;
        if (iii1iiVar2 != null) {
            iii1iiVar2.X01IiOiIi().setTextColor(gk4.m1859iO(getMContext(), R.color.line_color));
            iii1iiVar2.X0O(R.id.root_view);
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        final DragCallbackHelper dragCallbackHelper = new DragCallbackHelper();
        dragCallbackHelper.setItemDragFlag(3);
        dragCallbackHelper.attachToRecyclerView(getRecyclerView());
        dragCallbackHelper.setOnClearView(new Function2() { // from class: com.android.mltcode.paycertificationapi.rr3
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return SMSQuickReplyActivity.onInitBaseLayoutAfter$lambda$0$0(dragCallbackHelper, this, (RecyclerView) obj, (RecyclerView.ViewHolder) obj2);
            }
        });
        dragCallbackHelper.setOnItemMoveChanged(new Function4() { // from class: com.android.mltcode.paycertificationapi.ir3
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SMSQuickReplyActivity.onInitBaseLayoutAfter$lambda$0$1(this.f8743IO, (List) obj, (List) obj2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
