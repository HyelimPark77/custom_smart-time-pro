package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I0I10;
import com.android.mltcode.paycertificationapi.I111O11i;
import com.android.mltcode.paycertificationapi.Ii1O01;
import com.android.mltcode.paycertificationapi.IiI1O11i;
import com.android.mltcode.paycertificationapi.O011iI;
import com.android.mltcode.paycertificationapi.O01Ii1;
import com.android.mltcode.paycertificationapi.O1Xi1XX;
import com.android.mltcode.paycertificationapi.OO1X;
import com.android.mltcode.paycertificationapi.OOXX11I;
import com.android.mltcode.paycertificationapi.OX10Xi1;
import com.android.mltcode.paycertificationapi.Oi1OO1110;
import com.android.mltcode.paycertificationapi.X1O1iXiX;
import com.android.mltcode.paycertificationapi.XIiXiIO1;
import com.android.mltcode.paycertificationapi.XiX1IiXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00O1I01i;
import com.android.mltcode.paycertificationapi.i0iI11X;
import com.android.mltcode.paycertificationapi.iIO0iO;
import com.android.mltcode.paycertificationapi.iOOIOI;
import com.android.mltcode.paycertificationapi.iOXIOOI;
import com.android.mltcode.paycertificationapi.iX0ii1;
import com.android.mltcode.paycertificationapi.iX100X1;
import com.android.mltcode.paycertificationapi.ii0iXI;
import com.android.mltcode.paycertificationapi.iiXIO1Ii;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DragCallbackHelper;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEditCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCardActivity.kt\ncom/sma/smartv3/ui/status/EditCardActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2,2:171\n*S KotlinDebug\n*F\n+ 1 EditCardActivity.kt\ncom/sma/smartv3/ui/status/EditCardActivity\n*L\n54#1:171,2\n*E\n"})
public final class EditCardActivity extends BaseDSLRecyclerActivity {
    private String[] cardArray;

    @aa1
    private final Lazy rootView$delegate;

    public EditCardActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new X1O1iXiX(this));
    }

    public static /* synthetic */ Unit I0iXXO(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$2$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit I1(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$3$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit II1Xi0(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$7(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$3(r0, r1);
    }

    public static /* synthetic */ Unit IXXOO(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$5(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$1$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit O1O(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$2(r0, r1);
    }

    public static /* synthetic */ Unit OII(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$1(r0, r1);
    }

    public static /* synthetic */ Unit OX(EditCardActivity r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$6$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit X01IiOiIi(DragCallbackHelper r0, EditCardActivity r1, RecyclerView r2, RecyclerView.ViewHolder r3) {
        return onInitBaseLayoutAfter$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit X0O(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit X1ii(EditCardActivity r0) {
        return onInitBaseLayoutAfter$lambda$1$0(r0);
    }

    public static /* synthetic */ Unit XX0(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$8$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XXI(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$7$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ LinearLayout XiOIO(EditCardActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIii1(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$8(r0, r1);
    }

    private final void addArray(int r7, String r8) {
        String[] r0 = null;
        if (r7 != 0) goto L13;
        String[] r2 = this.cardArray;
        if (r2 != null) goto L7;
        Intrinsics.XXO("cardArray");
        r2 = null;
    L7:
        int r3 = r2.length;
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L13;
        String[] r5 = this.cardArray;
        if (r5 != null) goto L12;
        Intrinsics.XXO("cardArray");
        r5 = null;
    L12:
        r5[r4] = "";
        r4 = r4 + 1;
    L13:
        String[] r6 = this.cardArray;
        if (r6 != null) goto L16;
        Intrinsics.XXO("cardArray");
    L17:
        r0[r7] = r8;
        return;
    L16:
        r0 = r6;
        goto L17
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) getValue();
    }

    public static /* synthetic */ Unit i010I(EditCardActivity r0, DslAdapter r1) {
        return onInitBaseLayoutAfter$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit iIiiO(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$5$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit iOO1ii1(EditCardActivity r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return onInitBaseLayoutAfter$lambda$1$0$0$4$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit iOOX010X(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$4(r0, r1);
    }

    public static /* synthetic */ Unit iX(EditCardActivity r0, DslAdapterItem r1) {
        return onInitBaseLayoutAfter$lambda$1$0$0$6(r0, r1);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0$0(DragCallbackHelper r1, EditCardActivity r2, RecyclerView r3, RecyclerView.ViewHolder r4) {
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        if (r1.get_dragHappened() == false) goto L6;
        DslAdapter.updateAllItem$default(r2.getDslAdapter(), null, 1, null);
    L6:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1(final EditCardActivity r1, DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        r1.getDslViewHolder().post(new i0iI11X(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0(final EditCardActivity r1) {
        r1.renderAdapter(new O1Xi1XX(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0(final EditCardActivity r6, DslAdapter r7) {
        Intrinsics.X0O(r7, "$this$renderAdapter");
        String[] r0 = r6.cardArray;
        if (r0 != null) goto L5;
        Intrinsics.XXO("cardArray");
        r0 = null;
    L5:
        int r1 = r0.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L48;
        String r3 = r0[r2];
        switch(r3.hashCode()) {
            case -2030863703: goto L43;
            case -1276242363: goto L39;
            case -791592328: goto L35;
            case -240915579: goto L31;
            case 103596: goto L27;
            case 109522647: goto L23;
            case 321701236: goto L19;
            case 560044778: goto L15;
            case 1930449209: goto L11;
            default: goto L46;
        };
    L11:
        if (r3.equals("heart_rate") == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new OO1X(r6));
        goto L46
    L15:
        if (r3.equals(q62.OXOXXiI) == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new iOXIOOI(r6));
        goto L46
    L19:
        if (r3.equals("temperature") == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new I0I10(r6));
        goto L46
    L23:
        if (r3.equals("sleep") == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new iX100X1(r6));
        goto L46
    L27:
        if (r3.equals(q62.XOX1) == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new i00O1I01i(r6));
        goto L46
    L31:
        if (r3.equals(q62.IiOIO1OX) == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new ii0iXI(r6));
        goto L46
    L35:
        if (r3.equals("weight") == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new Oi1OO1110(r6));
        goto L46
    L39:
        if (r3.equals(q62.IIII0II) == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new OOXX11I(r6));
        goto L46
    L43:
        if (r3.equals(q62.Oi0X) == false) goto L46;
        DslAdapterExKt.O10IXXX0X(r7, R.layout.item_edit_card_content, new XIiXiIO1(r6));
    L46:
        r2 = r2 + 1;
        goto L6
    L48:
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$0(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new OX10Xi1(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$0$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.heart_rate);
    L5:
        r1.addArray(r3, "heart_rate");
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$1(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new IiI1O11i(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$1$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.hrv);
    L5:
        r1.addArray(r3, q62.XOX1);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$2(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new iiXIO1Ii(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$2$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.blood_pressure);
    L5:
        r1.addArray(r3, q62.OXOXXiI);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$3(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new XiX1IiXI(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$3$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.blood_oxygen);
    L5:
        r1.addArray(r3, q62.IiOIO1OX);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$4(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new iIO0iO(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$4$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.sleep);
    L5:
        r1.addArray(r3, "sleep");
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$5(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new I111O11i(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$5$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.temperature);
    L5:
        r1.addArray(r3, "temperature");
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$6(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new iOOIOI(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$6$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.weight);
    L5:
        r1.addArray(r3, "weight");
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$7(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new O01Ii1(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$7$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.pressure);
    L5:
        r1.addArray(r3, q62.IIII0II);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$8(final EditCardActivity r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new Ii1O01(r1));
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1$0$0$8$0(EditCardActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "<unused var>");
        Intrinsics.X0O(r5, "<unused var>");
        TextView r6 = r2.tv(R.id.tvCard);
        if (r6 == null) goto L5;
        r6.setText(R.string.blood_glucose);
    L5:
        r1.addArray(r3, q62.Oi0X);
        return Unit.OXO1;
    }

    private static final LinearLayout rootView_delegate$lambda$0(EditCardActivity r1) {
        return (LinearLayout) r1.findViewById(R.id.root_view);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_card);
        String r0 = a01.OXO1.IiI10X().getString(b01.I1XOi1);
        Intrinsics.XXI(r0);
        if (r0.length() != 0) goto L5;
        r0 = q62.OXO1.iIIIiIO0();
    L5:
        String r1 = r0;
        Intrinsics.XXI(r1);
        this.cardArray = (String[]) StringsKt__StringsKt.i1I(r1, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null).toArray(new String[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_edit_card;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        LinearLayout r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        onTitleLeftClick(r0);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        final DragCallbackHelper r0 = new DragCallbackHelper();
        r0.setItemDragFlag(3);
        r0.attachToRecyclerView(getRecyclerView());
        r0.setOnClearView(new O011iI(r0, this));
        renderAdapter(new iX0ii1(this));
    }

    public final void onTitleLeftClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        SPUtils r4 = a01.OXO1.IiI10X();
        String[] r0 = this.cardArray;
        if (r0 != null) goto L5;
        Intrinsics.XXO("cardArray");
        r0 = null;
    L5:
        r4.put(b01.I1XOi1, TextUtils.join(I000IiI1O.iO.XO0O10, r0));
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
