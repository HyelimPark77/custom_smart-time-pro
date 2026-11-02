package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DragCallbackHelper;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.sma.smartv3.p610ui.status.EditCardActivity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEditCardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCardActivity.kt\ncom/sma/smartv3/ui/status/EditCardActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2,2:171\n*S KotlinDebug\n*F\n+ 1 EditCardActivity.kt\ncom/sma/smartv3/ui/status/EditCardActivity\n*L\n54#1:171,2\n*E\n"})
public final class EditCardActivity extends BaseDSLRecyclerActivity {
    private String[] cardArray;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1O1iXiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EditCardActivity.rootView_delegate$lambda$0(this.f4296IO);
        }
    });

    private final void addArray(int i, String str) {
        String[] strArr = null;
        if (i == 0) {
            String[] strArr2 = this.cardArray;
            if (strArr2 == null) {
                Intrinsics.XXO("cardArray");
                strArr2 = null;
            }
            int length = strArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                String[] strArr3 = this.cardArray;
                if (strArr3 == null) {
                    Intrinsics.XXO("cardArray");
                    strArr3 = null;
                }
                strArr3[i2] = "";
            }
        }
        String[] strArr4 = this.cardArray;
        if (strArr4 == null) {
            Intrinsics.XXO("cardArray");
        } else {
            strArr = strArr4;
        }
        strArr[i] = str;
    }

    private final LinearLayout getRootView() {
        return (LinearLayout) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0$0(DragCallbackHelper dragCallbackHelper, EditCardActivity editCardActivity, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.X0O(recyclerView, "<unused var>");
        Intrinsics.X0O(viewHolder, "<unused var>");
        if (dragCallbackHelper.get_dragHappened()) {
            DslAdapter.updateAllItem$default(editCardActivity.getDslAdapter(), null, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1(final EditCardActivity editCardActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        editCardActivity.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0iI11X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0(this.f7475IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0(final EditCardActivity editCardActivity) {
        editCardActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1Xi1XX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0(this.f2813IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0(final EditCardActivity editCardActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        String[] strArr = editCardActivity.cardArray;
        if (strArr == null) {
            Intrinsics.XXO("cardArray");
            strArr = null;
        }
        for (String str : strArr) {
            switch (str.hashCode()) {
                case -2030863703:
                    if (str.equals(q62.Oi0X)) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIiXiIO1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$8(this.f4632IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case -1276242363:
                    if (str.equals(q62.IIII0II)) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOXX11I
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$7(this.f3344IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case -791592328:
                    if (str.equals("weight")) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.Oi1OO1110
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$6(this.f3673IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case -240915579:
                    if (str.equals(q62.IiOIO1OX)) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.ii0iXI
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$3(this.f8537IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case 103596:
                    if (str.equals(q62.XOX1)) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.i00O1I01i
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$1(this.f7276IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case 109522647:
                    if (str.equals("sleep")) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX100X1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$4(this.f8259IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case 321701236:
                    if (str.equals("temperature")) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0I10
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$5(this.f1112IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case 560044778:
                    if (str.equals(q62.OXOXXiI)) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.iOXIOOI
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$2(this.f8147IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
                case 1930449209:
                    if (str.equals("heart_rate")) {
                        DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_edit_card_content, new Function1() { // from class: com.android.mltcode.paycertificationapi.OO1X
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$0(this.f3188IO, (DslAdapterItem) obj);
                            }
                        });
                    }
                    break;
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$0(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.OX10Xi1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$0$0(this.f3426IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$0$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.heart_rate);
        }
        editCardActivity.addArray(i, "heart_rate");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$1(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.IiI1O11i
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$1$0(this.f2226IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$1$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.hrv);
        }
        editCardActivity.addArray(i, q62.XOX1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$2(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iiXIO1Ii
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$2$0(this.f8637IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$2$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.blood_pressure);
        }
        editCardActivity.addArray(i, q62.OXOXXiI);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$3(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.XiX1IiXI
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$3$0(this.f5331IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$3$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.blood_oxygen);
        }
        editCardActivity.addArray(i, q62.IiOIO1OX);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$4(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iIO0iO
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$4$0(this.f7865IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$4$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.sleep);
        }
        editCardActivity.addArray(i, "sleep");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$5(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.I111O11i
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$5$0(this.f1347IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$5$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.temperature);
        }
        editCardActivity.addArray(i, "temperature");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$6(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iOOIOI
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$6$0(this.f8115IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$6$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.weight);
        }
        editCardActivity.addArray(i, "weight");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$7(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.O01Ii1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$7$0(this.f2408IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$7$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.pressure);
        }
        editCardActivity.addArray(i, q62.IIII0II);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$8(final EditCardActivity editCardActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.Ii1O01
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1$0$0$8$0(this.f2207IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1$0$0$8$0(EditCardActivity editCardActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvCard);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(R.string.blood_glucose);
        }
        editCardActivity.addArray(i, q62.Oi0X);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout rootView_delegate$lambda$0(EditCardActivity editCardActivity) {
        return (LinearLayout) editCardActivity.findViewById(R.id.root_view);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.edit_card);
        String string = a01.OXO1.IiI10X().getString(b01.I1XOi1);
        Intrinsics.XXI(string);
        if (string.length() == 0) {
            string = q62.OXO1.iIIIiIO0();
        }
        String str = string;
        Intrinsics.XXI(str);
        this.cardArray = (String[]) StringsKt__StringsKt.i1I(str, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null).toArray(new String[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_edit_card;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        LinearLayout rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        onTitleLeftClick(rootView);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        final DragCallbackHelper dragCallbackHelper = new DragCallbackHelper();
        dragCallbackHelper.setItemDragFlag(3);
        dragCallbackHelper.attachToRecyclerView(getRecyclerView());
        dragCallbackHelper.setOnClearView(new Function2() { // from class: com.android.mltcode.paycertificationapi.O011iI
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$0$0(dragCallbackHelper, this, (RecyclerView) obj, (RecyclerView.ViewHolder) obj2);
            }
        });
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.iX0ii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditCardActivity.onInitBaseLayoutAfter$lambda$1(this.f8256IO, (DslAdapter) obj);
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String[] strArr = this.cardArray;
        if (strArr == null) {
            Intrinsics.XXO("cardArray");
            strArr = null;
        }
        sPUtilsIiI10X.put(b01.I1XOi1, TextUtils.join(I000IiI1O.C2156iO.XO0O10, strArr));
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
