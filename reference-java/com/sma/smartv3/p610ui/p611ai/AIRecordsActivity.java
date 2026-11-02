package com.sma.smartv3.p610ui.p611ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.IntentUtils;
import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.biz.p242ad.ADPAdError;
import com.sma.smartv3.biz.p242ad.ADPAdListener;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIRecordsViewData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.p611ai.AIRecordsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1869#2,2:281\n1869#2,2:302\n173#3,7:283\n180#3,3:291\n143#3,7:294\n183#3:301\n1#4:290\n*S KotlinDebug\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n*L\n190#1:281,2\n250#1:302,2\n140#1:283,7\n140#1:291,3\n140#1:294,7\n140#1:301\n140#1:290\n*E\n"})
public class AIRecordsActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static final int REQUEST_DELETE = 255;

    @tb1
    private AIFunction mAIFunction;
    public List<AIRecordsViewData> mAdapterData;

    @tb1
    private go0 mAllDeleteTipPopup;

    @tb1
    private go0 mDeleteTipPopup;

    @tb1
    private List<AIRecords> mList;

    @aa1
    private final String TAG = "AIRecords";

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI1IiOO1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIRecordsActivity.abhTitleRight_delegate$lambda$0(this.f2912IO);
        }
    });

    @aa1
    private final AIRecordsDao mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();
    private boolean showItemClick = true;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO extends ADPCAdListener {
        public XIi00iiXO() {
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.this.TAG + " -> Ad State : Loaded");
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.AIRecordsActivity$iO */
    public static final class C18647iO extends ADPAdListener {
        public C18647iO() {
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.this.TAG + " -> Ad State : Loaded");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(AIRecordsActivity aIRecordsActivity) {
        return (ImageView) aIRecordsActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAllDeletePopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAllDeletePopup$lambda$0$1(AIRecordsActivity aIRecordsActivity) {
        List<AIRecords> list = aIRecordsActivity.mList;
        if (list != null) {
            for (AIRecords aIRecords : list) {
                aIRecords.setMIsDelete(1);
                aIRecords.setMIsSync(0);
            }
        }
        AIRecordsDao aIRecordsDao = aIRecordsActivity.mRecordsDao;
        List<AIRecords> list2 = aIRecordsActivity.mList;
        Intrinsics.XXI(list2);
        aIRecordsDao.update(list2);
        aIRecordsActivity.getMAdapterData().clear();
        aIRecordsActivity.showList(aIRecordsActivity.getMAdapterData());
        aIRecordsActivity.getDslAdapter().notifyDataSetChanged();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePopup$lambda$0$1(AIRecords aIRecords, AIRecords aIRecords2, AIRecordsActivity aIRecordsActivity, int i) {
        aIRecords.setMIsDelete(1);
        aIRecords.setMIsSync(0);
        aIRecords2.setMIsDelete(1);
        aIRecords2.setMIsSync(0);
        aIRecordsActivity.mRecordsDao.update(aIRecords);
        aIRecordsActivity.mRecordsDao.update(aIRecords2);
        aIRecordsActivity.getMAdapterData().remove(i);
        aIRecordsActivity.showList(aIRecordsActivity.getMAdapterData());
        aIRecordsActivity.getDslAdapter().notifyDataSetChanged();
        ToastUtils.showLong(R.string.success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        if (!aIRecordsActivity.showItemClick) {
            aIRecordsActivity.setResult(-1);
            aIRecordsActivity.finish();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(List list, final AIRecordsActivity aIRecordsActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        if (list.isEmpty()) {
            DslAdapter.setAdapterStatus$default(aIRecordsActivity.getDslAdapter(), 1, null, 2, null);
        } else {
            DslAdapter.setAdapterStatus$default(aIRecordsActivity.getDslAdapter(), 0, null, 2, null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final AIRecordsViewData aIRecordsViewData = (AIRecordsViewData) it.next();
                DslAdapterExKt.O10IXXX0X(renderAdapter, R.layout.item_ai_records, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOO0Xi
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AIRecordsActivity.showList$lambda$0$0(aIRecordsViewData, aIRecordsActivity, (DslAdapterItem) obj);
                    }
                });
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final AIRecordsViewData aIRecordsViewData, final AIRecordsActivity aIRecordsActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iIIIi
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AIRecordsActivity.showList$lambda$0$0$0(aIRecordsViewData, aIRecordsActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(final AIRecordsViewData aIRecordsViewData, final AIRecordsActivity aIRecordsActivity, DslViewHolder itemHolder, final int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        final AIRecords first = aIRecordsViewData.getFirst();
        Intrinsics.XXI(first);
        final AIRecords last = aIRecordsViewData.getLast();
        Intrinsics.XXI(last);
        final String str = aIRecordsActivity.getString(R.string.problem) + " : " + first.getMContent();
        if (aIRecordsActivity.showItemClick) {
            final String str2 = aIRecordsActivity.getString(R.string.generate_results) + " : " + last.getMContent();
            TextView textViewM3482tv = itemHolder.m3482tv(R.id.item_ai_records_results);
            if (textViewM3482tv != null) {
                textViewM3482tv.setMaxHeight(300);
            }
            View view = itemHolder.view(R.id.item_ai_records_delete);
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = itemHolder.view(R.id.item_ai_records_share);
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = itemHolder.view(R.id.item_ai_records_delete);
            if (view3 != null) {
                view3.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I011X
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        this.f1051IO.showDeletePopup(first, last, i);
                    }
                });
            }
            View view4 = itemHolder.view(R.id.item_ai_records_share);
            if (view4 != null) {
                view4.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iiX0i1IX
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        AIRecordsActivity.showList$lambda$0$0$0$1(this.f8626IO, str, str2, view5);
                    }
                });
            }
            itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OI1i1i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    AIRecordsActivity.showList$lambda$0$0$0$2(this.f2938IO, aIRecordsViewData, view5);
                }
            });
        } else {
            View view5 = itemHolder.view(R.id.item_ai_records_delete);
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = itemHolder.view(R.id.item_ai_records_share);
            if (view6 != null) {
                view6.setVisibility(8);
            }
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.item_ai_records_question);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(str);
            textViewM3482tv2.setTextIsSelectable(!aIRecordsActivity.showItemClick);
        }
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.item_ai_records_results);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setTextIsSelectable(!aIRecordsActivity.showItemClick);
        }
        SpanUtils.with(textViewM3482tv3).append(aIRecordsActivity.getString(R.string.generate_results)).setForegroundColor(ContextCompat.getColor(aIRecordsActivity.getMContext(), R.color.ai_results_tv_bg)).append(" : " + last.getMContent()).create();
        TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.item_ai_records_time);
        if (textViewM3482tv4 != null) {
            textViewM3482tv4.setText(last.getMLocalTime());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$1(AIRecordsActivity aIRecordsActivity, String str, String str2, View view) {
        aIRecordsActivity.share(str + "\n\n" + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$2(AIRecordsActivity aIRecordsActivity, AIRecordsViewData aIRecordsViewData, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", aIRecordsViewData);
        Intent intent = new Intent(aIRecordsActivity, (Class<?>) AIRecordsDetailActivity.class);
        intent.putExtras(bundle);
        aIRecordsActivity.startActivityForResult(intent, 255);
    }

    @tb1
    public final AIFunction getMAIFunction() {
        return this.mAIFunction;
    }

    @aa1
    public final List<AIRecordsViewData> getMAdapterData() {
        List<AIRecordsViewData> list = this.mAdapterData;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mAdapterData");
        return null;
    }

    @tb1
    public final List<AIRecords> getMList() {
        return this.mList;
    }

    @aa1
    public final AIRecordsDao getMRecordsDao() {
        return this.mRecordsDao;
    }

    public final boolean getShowItemClick() {
        return this.showItemClick;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        this.mAIFunction = (AIFunction) mArg3;
    }

    @aa1
    public List<AIRecordsViewData> initList() {
        AIRecordsDao aIRecordsDao = this.mRecordsDao;
        AIFunction aIFunction = this.mAIFunction;
        AIFunctionType type = aIFunction != null ? aIFunction.getType() : null;
        Intrinsics.XXI(type);
        this.mList = aIRecordsDao.getListASC(type.getType());
        setMAdapterData(new ArrayList());
        List<AIRecords> list = this.mList;
        if (list != null) {
            AIRecordsViewData aIRecordsViewData = null;
            for (AIRecords aIRecords : list) {
                if (aIRecords.getMType() == 1) {
                    aIRecordsViewData = new AIRecordsViewData(null, null, 3, null);
                    aIRecordsViewData.setFirst(aIRecords);
                } else if (aIRecords.getMType() == 2 && aIRecordsViewData != null) {
                    aIRecordsViewData.setLast(aIRecords);
                    getMAdapterData().add(aIRecordsViewData);
                }
            }
        }
        setMAdapterData(CollectionsKt___CollectionsKt.OO0Oi10(CollectionsKt___CollectionsKt.IOOIXiI1(getMAdapterData())));
        return getMAdapterData();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ADPAdContainerView aDPAdContainerView;
        super.initView();
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        if (textView != null) {
            textView.setText(R.string.history_record);
        }
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getDslAdapter().getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sms_empty));
        initList();
        showList(getMAdapterData());
        i72 i72Var = i72.OXO1;
        if (i72Var.IX0iIX()) {
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) findViewById(R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + aDPCAdContainerView.getAdUnitId());
                aDPCAdContainerView.setAdListener(new XIi00iiXO());
                ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, 0, false, null, 15, null);
                return;
            }
            return;
        }
        if (!i72Var.IOi1O0() || (aDPAdContainerView = (ADPAdContainerView) findViewById(R.id.adpAdContainerView)) == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + aDPAdContainerView.getAdUnitId());
        aDPAdContainerView.setAdListener(new C18647iO());
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, 0, false, null, 15, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_records;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 255) {
            initList();
            showList(getMAdapterData());
        }
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onRefresh() {
        initList();
        getRefreshLayout().setRefreshing(false);
        getDslAdapter().notifyDataSetChanged();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showAllDeletePopup();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void setMAIFunction(@tb1 AIFunction aIFunction) {
        this.mAIFunction = aIFunction;
    }

    public final void setMAdapterData(@aa1 List<AIRecordsViewData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mAdapterData = list;
    }

    public final void setMList(@tb1 List<AIRecords> list) {
        this.mList = list;
    }

    public final void setShowItemClick(boolean z) {
        this.showItemClick = z;
    }

    public final void share(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        ClipboardUtils.copyText(content);
        startActivity(IntentUtils.getShareTextIntent(content));
    }

    public final void showAllDeletePopup() {
        if (this.mAllDeleteTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.clear_ai_chat_records_list));
            go0Var.IXXOO(1);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.X11
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIRecordsActivity.showAllDeletePopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OXii10I
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIRecordsActivity.showAllDeletePopup$lambda$0$1(this.f3591IO));
                }
            });
            this.mAllDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mAllDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void showDeletePopup(@aa1 final AIRecords mQuestion, @aa1 final AIRecords mResults, final int i) {
        Intrinsics.X0O(mQuestion, "mQuestion");
        Intrinsics.X0O(mResults, "mResults");
        if (this.mDeleteTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.clear_ai_chat_current_records));
            go0Var.IXXOO(1);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiiOIIi0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIRecordsActivity.showDeletePopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iO11i
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIRecordsActivity.showDeletePopup$lambda$0$1(mQuestion, mResults, this, i));
                }
            });
            this.mDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void showList(@aa1 final List<AIRecordsViewData> list) {
        Intrinsics.X0O(list, "list");
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.II1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIRecordsActivity.showList$lambda$0(list, this, (DslAdapter) obj);
            }
        });
    }
}
