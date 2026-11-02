package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hr3;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.ir3;
import com.android.mltcode.paycertificationapi.jr3;
import com.android.mltcode.paycertificationapi.kr3;
import com.android.mltcode.paycertificationapi.lr3;
import com.android.mltcode.paycertificationapi.mr3;
import com.android.mltcode.paycertificationapi.nr3;
import com.android.mltcode.paycertificationapi.or3;
import com.android.mltcode.paycertificationapi.pr3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qr3;
import com.android.mltcode.paycertificationapi.rr3;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nSMSQuickReplyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1563#2:151\n1634#2,3:152\n*S KotlinDebug\n*F\n+ 1 SMSQuickReplyActivity.kt\ncom/sma/smartv3/ui/device/SMSQuickReplyActivity\n*L\n62#1:151\n62#1:152,3\n*E\n"})
public final class SMSQuickReplyActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy btnBottom$delegate;

    @tb1
    private iii1ii mEditPop;
    private List<BleSMSQuickReplyContent> mList;

    @aa1
    private final Lazy tvTip$delegate;

    public SMSQuickReplyActivity() {
        this.tvTip$delegate = LazyKt__LazyJVMKt.iO(new nr3(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new or3(this));
    }

    public static /* synthetic */ View I0iXXO(SMSQuickReplyActivity r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(SMSQuickReplyActivity r0, int r1) {
        return showList$lambda$0$0$0$0$0$1(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(BleSMSQuickReplyContent r0, SMSQuickReplyActivity r1, DslAdapterItem r2) {
        return showList$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView O10IXXX0X(SMSQuickReplyActivity r0) {
        return tvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OiIIX101O(SMSQuickReplyActivity r0, String r1) {
        return onBottomClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(List r0, SMSQuickReplyActivity r1, DslAdapter r2) {
        return showList$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean X1ii() {
        return showList$lambda$0$0$0$0$0$0();
    }

    public static /* synthetic */ Unit XX0(DragCallbackHelper r0, SMSQuickReplyActivity r1, RecyclerView r2, RecyclerView.ViewHolder r3) {
        return onInitBaseLayoutAfter$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XXI(SMSQuickReplyActivity r0, List r1, List r2, int r3, int r4) {
        return onInitBaseLayoutAfter$lambda$0$1(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XiOIO(BleSMSQuickReplyContent r0, SMSQuickReplyActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showList$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    private static final View btnBottom_delegate$lambda$0(SMSQuickReplyActivity r1) {
        return r1.findViewById(R.id.btn_bottom);
    }

    private final void checkCount(List<BleSMSQuickReplyContent> r6) {
        TextView r0 = getTvTip();
        boolean r2 = false;
        if (r6.isEmpty() == false) goto L5;
        int r1 = 8;
    L6:
        r0.setVisibility(r1);
        int r3 = q62.OXO1.X00O0();
        getTvTip().setText(getString(R.string.sms_quick_reply_tip, new Object[]{Integer.valueOf(r3)}));
        View r4 = getBtnBottom();
        if (r6.size() >= r3) goto L9;
        r2 = true;
    L9:
        r4.setEnabled(r2);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    private final View getBtnBottom() {
        return (View) getValue();
    }

    private final TextView getTvTip() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void iIiiO(SMSQuickReplyActivity r0, int r1, View r2) {
        showList$lambda$0$0$0$0(r0, r1, r2);
    }

    private static final boolean onBottomClick$lambda$0$0(SMSQuickReplyActivity r4, String r5) {
        Intrinsics.X0O(r5, "text");
        if (r5.length() <= 0) goto L13;
        List<BleSMSQuickReplyContent> r0 = r4.mList;
        List<BleSMSQuickReplyContent> r1 = null;
        if (r0 != null) goto L7;
        Intrinsics.XXO("mList");
        r0 = null;
    L7:
        r0.add(new BleSMSQuickReplyContent(r5));
        List<BleSMSQuickReplyContent> r6 = r4.mList;
        if (r6 != null) goto L10;
        Intrinsics.XXO("mList");
    L11:
        r4.showList(r1);
        return true;
    L10:
        r1 = r6;
        goto L11
    L13:
        return false;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(DragCallbackHelper r1, SMSQuickReplyActivity r2, RecyclerView r3, RecyclerView.ViewHolder r4) {
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        if (r1.get_dragHappened() == false) goto L9;
        List<BleSMSQuickReplyContent> r5 = r2.mList;
        if (r5 != null) goto L7;
        Intrinsics.XXO("mList");
        r5 = null;
    L7:
        r2.showList(r5);
    L9:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$1(SMSQuickReplyActivity r1, List r2, List r3, int r4, int r5) {
        Intrinsics.X0O(r2, "fromList");
        Intrinsics.X0O(r3, "toList");
        List<BleSMSQuickReplyContent> r6 = r1.mList;
        List<BleSMSQuickReplyContent> r7 = null;
        if (r6 != null) goto L5;
        Intrinsics.XXO("mList");
        r6 = null;
    L5:
        Collections.swap(r6, r4, r5);
        List<BleSMSQuickReplyContent> r8 = r1.mList;
        if (r8 != null) goto L8;
        Intrinsics.XXO("mList");
    L9:
        List<BleSMSQuickReplyContent> r9 = r7;
        ArrayList r10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r9, 10));
        Iterator<T> r11 = r9.iterator();
    L11:
        if (r11.hasNext() == false) goto L13;
        r10.add(((BleSMSQuickReplyContent) r11.next()).getMContent());
        goto L11
    L13:
        LogUtils.d(new Object[]{String.valueOf(r10)});
        return Unit.OXO1;
    L8:
        r7 = r8;
        goto L9
    }

    private final void showList(final List<BleSMSQuickReplyContent> r3) {
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new lr3(r3, this));
        syncList(r3);
        checkCount(r3);
    }

    private static final Unit showList$lambda$0(List r3, final SMSQuickReplyActivity r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        if (r3.isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 1, null, 2, null);
    L10:
        return Unit.OXO1;
    L5:
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 0, null, 2, null);
        r4.getRecyclerView().setVisibility(0);
        Iterator r6 = r3.iterator();
    L7:
        if (r6.hasNext() == false) goto L10;
        final BleSMSQuickReplyContent r7 = (BleSMSQuickReplyContent) r6.next();
        DslAdapterExKt.O10IXXX0X(r4.getDslAdapter(), R.layout.item_sms_quick_reply, new hr3(r7, r4));
        goto L7
    }

    private static final Unit showList$lambda$0$0(final BleSMSQuickReplyContent r1, final SMSQuickReplyActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new jr3(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(BleSMSQuickReplyContent r1, final SMSQuickReplyActivity r2, DslViewHolder r3, final int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "adapterItem");
        Intrinsics.X0O(r6, "<unused var>");
        TextView r7 = r3.tv(R.id.tv);
        if (r7 == null) goto L5;
        r7.setText(r1.getMContent());
    L5:
        ImageView r8 = r3.img(R.id.btn_delete);
        if (r8 == null) goto L9;
        r8.setOnClickListener(new mr3(r2, r4));
    L9:
        return Unit.OXO1;
    }

    private static final void showList$lambda$0$0$0$0(final SMSQuickReplyActivity r4, final int r5, View r6) {
        int r3 = 0;
        go0 r7 = new go0(r4.getMContext(), r3, 2, null);
        r7.O1O(R.string.delete_record_remind);
        r7.iX1O1(Integer.valueOf(R.string.cancel), new pr3());
        r7.X1IX(R.string.delete, new qr3(r4, r5));
        r7.X0O(R.id.root_view);
    }

    private static final boolean showList$lambda$0$0$0$0$0$0() {
        return true;
    }

    private static final boolean showList$lambda$0$0$0$0$0$1(SMSQuickReplyActivity r3, int r4) {
        List<BleSMSQuickReplyContent> r0 = r3.mList;
        List<BleSMSQuickReplyContent> r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mList");
        r0 = null;
    L5:
        r0.remove(r4);
        List<BleSMSQuickReplyContent> r5 = r3.mList;
        if (r5 != null) goto L8;
        Intrinsics.XXO("mList");
    L9:
        r3.showList(r1);
        return true;
    L8:
        r1 = r5;
        goto L9
    }

    private final void syncList(List<BleSMSQuickReplyContent> r9) {
        BaseBleConnector.sendList$default(BleConnector.INSTANCE, BleKey.SMS_QUICK_REPLY_CONTENT, BleKeyFlag.RESET, r9, false, false, 24, null);
    }

    private static final TextView tvTip_delegate$lambda$0(SMSQuickReplyActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_tip);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.sms_quick_reply);
        getDslAdapter().getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sms_empty));
        List<BleSMSQuickReplyContent> r0 = BaseBleCache.getList$default(BleCache.INSTANCE, BleKey.SMS_QUICK_REPLY_CONTENT, BleSMSQuickReplyContent.class, null, 4, null);
        this.mList = r0;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mList");
        r0 = null;
    L5:
        showList(r0);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sms_quick_reply;
    }

    public final void onBottomClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        if (this.mEditPop != null) goto L5;
        int r3 = 0;
        iii1ii r6 = new iii1ii(getMContext(), r3, 2, null);
        r6.XXX11i(R.string.sms_quick_reply);
        r6.X11iII1O1(new kr3(this));
        this.mEditPop = r6;
    L5:
        iii1ii r7 = this.mEditPop;
        if (r7 == null) goto L9;
        r7.X01IiOiIi().setTextColor(gk4.iO(getMContext(), R.color.line_color));
        r7.X0O(R.id.root_view);
        return;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        final DragCallbackHelper r0 = new DragCallbackHelper();
        r0.setItemDragFlag(3);
        r0.attachToRecyclerView(getRecyclerView());
        r0.setOnClearView(new rr3(r0, this));
        r0.setOnItemMoveChanged(new ir3(this));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
