package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.otherdevice.charge.InterpretationRecordsActivity;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nInterpretationRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n1#2:191\n87#3,7:184\n94#3,3:192\n70#3,7:195\n97#3:202\n1869#4,2:203\n*S KotlinDebug\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n*L\n104#1:191\n104#1:184,7\n104#1:192,3\n104#1:195,7\n104#1:202\n138#1:203,2\n*E\n"})
public final class InterpretationRecordsActivity extends BaseDSLRecyclerActivity {

    @tb1
    private go0 mAllDeleteTipPopup;
    private List<AIRecords> mList;

    @aa1
    private final String TAG = "InterpretationRecordsActivity";

    @aa1
    private final AIRecordsDao mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ba
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsActivity.abhTitleCenter_delegate$lambda$0(this.f5692IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ca
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsActivity.abhTitleRight_delegate$lambda$0(this.f5933IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(InterpretationRecordsActivity interpretationRecordsActivity) {
        return (TextView) interpretationRecordsActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(InterpretationRecordsActivity interpretationRecordsActivity) {
        return (ImageView) interpretationRecordsActivity.findViewById(R.id.abh_title_right);
    }

    private final void setList() {
        initList();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = this.TAG;
        List<AIRecords> list = this.mList;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        i1o0oxo1o.OXO1(str + " list = " + list.size());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.ka
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InterpretationRecordsActivity.setList$lambda$0(this.f9130IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setList$lambda$0(final InterpretationRecordsActivity interpretationRecordsActivity, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        interpretationRecordsActivity.getDslAdapter().clearAllItems();
        renderAdapter.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        interpretationRecordsActivity.getDslViewHolder().postDelay(500L, new Function0() { // from class: com.android.mltcode.paycertificationapi.ha
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return InterpretationRecordsActivity.setList$lambda$0$0(this.f7070IO, renderAdapter);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setList$lambda$0$0(final InterpretationRecordsActivity interpretationRecordsActivity, DslAdapter dslAdapter) {
        List<AIRecords> list = interpretationRecordsActivity.mList;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        for (final AIRecords aIRecords : list) {
            DslAdapterExKt.O10IXXX0X(interpretationRecordsActivity.getDslAdapter(), R.layout.item_list_interpretation_records, new Function1() { // from class: com.android.mltcode.paycertificationapi.ea
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return InterpretationRecordsActivity.setList$lambda$0$0$0(this.f6365IO, aIRecords, (DslAdapterItem) obj);
                }
            });
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.fa
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InterpretationRecordsActivity.setList$lambda$0$0$1((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setList$lambda$0$0$0(final InterpretationRecordsActivity interpretationRecordsActivity, final AIRecords aIRecords, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.ga
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return InterpretationRecordsActivity.setList$lambda$0$0$0$0(this.f6837IO, aIRecords, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setList$lambda$0$0$0$0(final InterpretationRecordsActivity interpretationRecordsActivity, final AIRecords aIRecords, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        i1O0OXO1O.OXO1.OXO1(interpretationRecordsActivity.TAG + " mAIRecords item = " + aIRecords);
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.interpretation_records_language_left_tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(interpretationRecordsActivity.getString(R.string.save_recording_translate) + CertificateUtil.DELIMITER);
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.interpretation_records_language);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(aIRecords.getMTranslateLanguage());
        }
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.interpretation_records_to_language);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(aIRecords.getMTranslateToLanguage());
        }
        TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.interpretation_records_duration);
        if (textViewM3482tv4 != null) {
            textViewM3482tv4.setText(interpretationRecordsActivity.getString(R.string.action_details) + ": " + O0X11OiO.OX110i(aIRecords.getMAudioDuration()));
        }
        TextView textViewM3482tv5 = itemHolder.m3482tv(R.id.interpretation_records_title);
        if (textViewM3482tv5 != null) {
            textViewM3482tv5.setText(aIRecords.getMAITitle());
        }
        TextView textViewM3482tv6 = itemHolder.m3482tv(R.id.interpretation_records_content);
        if (textViewM3482tv6 != null) {
            textViewM3482tv6.setText(aIRecords.getMContent() + aIRecords.getMExtraInfo());
        }
        TextView textViewM3482tv7 = itemHolder.m3482tv(R.id.interpretation_records_location);
        if (textViewM3482tv7 != null) {
            String mLocation = aIRecords.getMLocation();
            if (mLocation.length() == 0) {
                mLocation = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            textViewM3482tv7.setText(mLocation);
        }
        TextView textViewM3482tv8 = itemHolder.m3482tv(R.id.interpretation_records_time);
        if (textViewM3482tv8 != null) {
            textViewM3482tv8.setText(aIRecords.getMLocalTime());
        }
        itemHolder.clickItem(new Function1() { // from class: com.android.mltcode.paycertificationapi.da
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InterpretationRecordsActivity.setList$lambda$0$0$0$0$1(this.f6152IO, aIRecords, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setList$lambda$0$0$0$0$1(InterpretationRecordsActivity interpretationRecordsActivity, AIRecords aIRecords, View it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", aIRecords);
        Intent intent = new Intent(interpretationRecordsActivity, (Class<?>) InterpretationRecordsDetailActivity.class);
        intent.putExtras(bundle);
        interpretationRecordsActivity.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setList$lambda$0$0$1(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$1(InterpretationRecordsActivity interpretationRecordsActivity) {
        List<AIRecords> list = interpretationRecordsActivity.mList;
        if (list == null) {
            Intrinsics.XXO("mList");
            list = null;
        }
        for (AIRecords aIRecords : list) {
            aIRecords.setMIsDelete(1);
            aIRecords.setMIsSync(0);
        }
        AIRecordsDao aIRecordsDao = interpretationRecordsActivity.mRecordsDao;
        List<AIRecords> list2 = interpretationRecordsActivity.mList;
        if (list2 == null) {
            Intrinsics.XXO("mList");
            list2 = null;
        }
        aIRecordsDao.update(list2);
        List<AIRecords> list3 = interpretationRecordsActivity.mList;
        if (list3 == null) {
            Intrinsics.XXO("mList");
            list3 = null;
        }
        list3.clear();
        interpretationRecordsActivity.setList();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @aa1
    public final AIRecordsDao getMRecordsDao() {
        return this.mRecordsDao;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<AIRecords> initList() {
        List<AIRecords> listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(this.mRecordsDao.getListDESC(AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType()));
        this.mList = listOO0Oi10;
        if (listOO0Oi10 != null) {
            return listOO0Oi10;
        }
        Intrinsics.XXO("mList");
        return null;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.interpretation_record));
        ImageView abhTitleRight = getAbhTitleRight();
        abhTitleRight.setVisibility(0);
        abhTitleRight.setImageResource(R.drawable.ai_records_delete_icon);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_interpretation_records;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        setList();
    }

    @sf5(tag = I01XX0.OXi001)
    public final void onRefreshList(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onFirmwareRepair");
        setList();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showDeleteTipPopup();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.clear_ai_chat_list));
            go0Var.IXXOO(1);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.ia
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(InterpretationRecordsActivity.showDeleteTipPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.ja
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(InterpretationRecordsActivity.showDeleteTipPopup$lambda$0$1(this.f8922IO));
                }
            });
            this.mAllDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mAllDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }
}
