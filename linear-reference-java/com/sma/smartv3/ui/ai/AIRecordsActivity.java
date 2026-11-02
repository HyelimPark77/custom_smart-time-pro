package com.sma.smartv3.ui.ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I011X;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.II1;
import com.android.mltcode.paycertificationapi.IiiiOIIi0;
import com.android.mltcode.paycertificationapi.OI1IiOO1i;
import com.android.mltcode.paycertificationapi.OI1i1i;
import com.android.mltcode.paycertificationapi.OXii10I;
import com.android.mltcode.paycertificationapi.X11;
import com.android.mltcode.paycertificationapi.XOO0Xi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIIIi;
import com.android.mltcode.paycertificationapi.iO11i;
import com.android.mltcode.paycertificationapi.iiX0i1IX;
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
import com.sma.smartv3.biz.ad.ADPAdError;
import com.sma.smartv3.biz.ad.ADPAdListener;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIRecordsViewData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1869#2,2:281\n1869#2,2:302\n173#3,7:283\n180#3,3:291\n143#3,7:294\n183#3:301\n1#4:290\n*S KotlinDebug\n*F\n+ 1 AIRecordsActivity.kt\ncom/sma/smartv3/ui/ai/AIRecordsActivity\n*L\n190#1:281,2\n250#1:302,2\n140#1:283,7\n140#1:291,3\n140#1:294,7\n140#1:301\n140#1:290\n*E\n"})
public class AIRecordsActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static final int REQUEST_DELETE = 255;

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleRight$delegate;

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
    private final AIRecordsDao mRecordsDao;
    private boolean showItemClick;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public static final class XIi00iiXO extends ADPCAdListener {
        public final /* synthetic */ AIRecordsActivity OXO1;

        public XIi00iiXO(AIRecordsActivity r1) {
            this.OXO1 = r1;
        }

        public void onADError(ADPCAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
        }

        public void onADReceive(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
        }
    }

    public static final class iO extends ADPAdListener {
        public final /* synthetic */ AIRecordsActivity OXO1;

        public iO(AIRecordsActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdFailed(ADPAdError r4, String r5) {
            Intrinsics.X0O(r4, "error");
            Intrinsics.X0O(r5, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Error, Info: " + r4.getCode() + ", " + r4.getMsg());
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdLoaded(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(AIRecordsActivity.access$getTAG$p(this.OXO1) + " -> Ad State : Loaded");
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public AIRecordsActivity() {
        this.TAG = "AIRecords";
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new OI1IiOO1i(this));
        this.mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();
        this.showItemClick = true;
    }

    public static /* synthetic */ Unit I0iXXO(AIRecordsViewData r0, AIRecordsActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return showList$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ boolean I1XOi1() {
        return showAllDeletePopup$lambda$0$0();
    }

    public static /* synthetic */ void IIX1OXO(AIRecordsActivity r0, AIRecordsViewData r1, View r2) {
        showList$lambda$0$0$0$2(r0, r1, r2);
    }

    public static /* synthetic */ Unit O10IXXX0X(List r0, AIRecordsActivity r1, DslAdapter r2) {
        return showList$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void OiIIX101O(AIRecordsActivity r0, String r1, String r2, View r3) {
        showList$lambda$0$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit X0O(AIRecordsViewData r0, AIRecordsActivity r1, DslAdapterItem r2) {
        return showList$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ ImageView X1ii(AIRecordsActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(AIRecordsActivity r0, AIRecords r1, AIRecords r2, int r3, View r4) {
        showList$lambda$0$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ boolean XXI(AIRecords r0, AIRecords r1, AIRecordsActivity r2, int r3) {
        return showDeletePopup$lambda$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ boolean XiOIO(AIRecordsActivity r0) {
        return showAllDeletePopup$lambda$0$1(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(AIRecordsActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ String access$getTAG$p(AIRecordsActivity r0) {
        return r0.TAG;
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public static /* synthetic */ boolean iIiiO() {
        return showDeletePopup$lambda$0$0();
    }

    private static final boolean showAllDeletePopup$lambda$0$0() {
        return true;
    }

    private static final boolean showAllDeletePopup$lambda$0$1(AIRecordsActivity r4) {
        List<AIRecords> r0 = r4.mList;
        if (r0 == null) goto L8;
        Iterator<T> r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        AIRecords r2 = (AIRecords) r1.next();
        r2.setMIsDelete(1);
        r2.setMIsSync(0);
    L8:
        AIRecordsDao r3 = r4.mRecordsDao;
        List<AIRecords> r5 = r4.mList;
        Intrinsics.XXI(r5);
        r3.update(r5);
        r4.getMAdapterData().clear();
        r4.showList(r4.getMAdapterData());
        r4.getDslAdapter().notifyDataSetChanged();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    private static final boolean showDeletePopup$lambda$0$0() {
        return true;
    }

    private static final boolean showDeletePopup$lambda$0$1(AIRecords r2, AIRecords r3, AIRecordsActivity r4, int r5) {
        r2.setMIsDelete(1);
        r2.setMIsSync(0);
        r3.setMIsDelete(1);
        r3.setMIsSync(0);
        r4.mRecordsDao.update(r2);
        r4.mRecordsDao.update(r3);
        r4.getMAdapterData().remove(r5);
        r4.showList(r4.getMAdapterData());
        r4.getDslAdapter().notifyDataSetChanged();
        ToastUtils.showLong(R.string.success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        if (r4.showItemClick == true) goto L5;
        r4.setResult(-1);
        r4.finish();
    L5:
        return true;
    }

    private static final Unit showList$lambda$0(List r4, final AIRecordsActivity r5, DslAdapter r6) {
        Intrinsics.X0O(r6, "$this$renderAdapter");
        if (r4.isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r5.getDslAdapter(), 1, null, 2, null);
    L10:
        return Unit.OXO1;
    L5:
        DslAdapter.setAdapterStatus$default(r5.getDslAdapter(), 0, null, 2, null);
        Iterator r7 = r4.iterator();
    L7:
        if (r7.hasNext() == false) goto L10;
        final AIRecordsViewData r0 = (AIRecordsViewData) r7.next();
        DslAdapterExKt.O10IXXX0X(r6, R.layout.item_ai_records, new XOO0Xi(r0, r5));
        goto L7
    }

    private static final Unit showList$lambda$0$0(final AIRecordsViewData r1, final AIRecordsActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new iIIIi(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(final AIRecordsViewData r9, final AIRecordsActivity r10, DslViewHolder r11, final int r12, DslAdapterItem r13, List r14) {
        Intrinsics.X0O(r11, "itemHolder");
        Intrinsics.X0O(r13, "<unused var>");
        Intrinsics.X0O(r14, "<unused var>");
        final AIRecords r15 = r9.getFirst();
        Intrinsics.XXI(r15);
        final AIRecords r16 = r9.getLast();
        Intrinsics.XXI(r16);
        final String r1 = r10.getString(R.string.problem) + " : " + r15.getMContent();
        if (r10.showItemClick == false) goto L20;
        final String r2 = r10.getString(R.string.generate_results) + " : " + r16.getMContent();
        TextView r7 = r11.tv(R.id.item_ai_records_results);
        if (r7 == null) goto L7;
        r7.setMaxHeight(300);
    L7:
        View r8 = r11.view(R.id.item_ai_records_delete);
        if (r8 == null) goto L10;
        r8.setVisibility(0);
    L10:
        View r17 = r11.view(R.id.item_ai_records_share);
        if (r17 == null) goto L13;
        r17.setVisibility(0);
    L13:
        View r6 = r11.view(R.id.item_ai_records_delete);
        if (r6 == null) goto L16;
        r6.setOnClickListener(new I011X(r10, r15, r16, r12));
    L16:
        View r18 = r11.view(R.id.item_ai_records_share);
        if (r18 == null) goto L19;
        r18.setOnClickListener(new iiX0i1IX(r10, r1, r2));
    L19:
        r11.itemView.setOnClickListener(new OI1i1i(r10, r9));
    L26:
        TextView r19 = r11.tv(R.id.item_ai_records_question);
        if (r19 == null) goto L29;
        r19.setText(r1);
        r19.setTextIsSelectable(!r10.showItemClick);
    L29:
        TextView r20 = r11.tv(R.id.item_ai_records_results);
        if (r20 == null) goto L32;
        r20.setTextIsSelectable(!r10.showItemClick);
    L32:
        SpanUtils.with(r20).append(r10.getString(R.string.generate_results)).setForegroundColor(ContextCompat.getColor(r10.getMContext(), R.color.ai_results_tv_bg)).append(" : " + r16.getMContent()).create();
        TextView r21 = r11.tv(R.id.item_ai_records_time);
        if (r21 == null) goto L36;
        r21.setText(r16.getMLocalTime());
    L36:
        return Unit.OXO1;
    L20:
        View r22 = r11.view(R.id.item_ai_records_delete);
        if (r22 == null) goto L23;
        r22.setVisibility(8);
    L23:
        View r23 = r11.view(R.id.item_ai_records_share);
        if (r23 == null) goto L26;
        r23.setVisibility(8);
        goto L26
    }

    private static final void showList$lambda$0$0$0$0(AIRecordsActivity r0, AIRecords r1, AIRecords r2, int r3, View r4) {
        r0.showDeletePopup(r1, r2, r3);
    }

    private static final void showList$lambda$0$0$0$1(AIRecordsActivity r0, String r1, String r2, View r3) {
        r0.share(r1 + "\n\n" + r2);
    }

    private static final void showList$lambda$0$0$0$2(AIRecordsActivity r2, AIRecordsViewData r3, View r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r3);
        Intent r6 = new Intent(r2, AIRecordsDetailActivity.class);
        r6.putExtras(r5);
        r2.startActivityForResult(r6, 255);
    }

    @tb1
    public final AIFunction getMAIFunction() {
        return this.mAIFunction;
    }

    @aa1
    public final List<AIRecordsViewData> getMAdapterData() {
        List<AIRecordsViewData> r0 = this.mAdapterData;
        if (r0 == null) goto L5;
        return r0;
    L5:
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        this.mAIFunction = (AIFunction) r3;
    }

    @aa1
    public List<AIRecordsViewData> initList() {
        AIRecordsDao r0 = this.mRecordsDao;
        AIFunction r1 = this.mAIFunction;
        if (r1 == null) goto L5;
        AIFunctionType r2 = r1.getType();
    L6:
        Intrinsics.XXI(r2);
        this.mList = r0.getListASC(r2.getType());
        setMAdapterData(new ArrayList());
        List<AIRecords> r3 = this.mList;
        if (r3 == null) goto L18;
        Iterator<T> r4 = r3.iterator();
        AIRecordsViewData r5 = null;
    L10:
        if (r4.hasNext() == false) goto L18;
        AIRecords r6 = (AIRecords) r4.next();
        if (r6.getMType() == 1) goto L13;
        if (r6.getMType() != 2) goto L10;
        if (r5 == null) goto L10;
        r5.setLast(r6);
        getMAdapterData().add(r5);
        goto L10
    L13:
        r5 = new AIRecordsViewData(null, null, 3, null);
        r5.setFirst(r6);
    L18:
        setMAdapterData(CollectionsKt___CollectionsKt.OO0Oi10(CollectionsKt___CollectionsKt.IOOIXiI1(getMAdapterData())));
        return getMAdapterData();
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        if (r0 == null) goto L5;
        r0.setText(R.string.history_record);
    L5:
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_clean_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getDslAdapter().getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sms_empty));
        initList();
        showList(getMAdapterData());
        i72 r1 = i72.OXO1;
        if (r1.IX0iIX() == false) goto L12;
        ADPCAdContainerView r3 = (ADPCAdContainerView) findViewById(R.id.adpcAdContainerView);
        if (r3 == null) goto L17;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + r3.getAdUnitId());
        r3.setAdListener(new XIi00iiXO(this));
        ADPCAdContainerView.loadAdView$default(r3, null, 0, false, null, 15, null);
        return;
    L17:
        return;
    L12:
        if (r1.IOi1O0() == false) goto L18;
        ADPAdContainerView r4 = (ADPAdContainerView) findViewById(R.id.adpAdContainerView);
        if (r4 == null) goto L19;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + r4.getAdUnitId());
        r4.setAdListener(new iO(this));
        ADPAdContainerView.loadAdView$default(r4, null, 0, false, null, 15, null);
        return;
    L19:
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_records;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r1, int r2, @tb1 Intent r3) {
        super.onActivityResult(r1, r2, r3);
        if (r2 == (-1)) goto L5;
        return;
    L5:
        if (r1 != 255) goto L9;
        initList();
        showList(getMAdapterData());
        return;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onRefresh() {
        initList();
        getRefreshLayout().setRefreshing(false);
        getDslAdapter().notifyDataSetChanged();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showAllDeletePopup();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }

    public final void setMAIFunction(@tb1 AIFunction r1) {
        this.mAIFunction = r1;
    }

    public final void setMAdapterData(@aa1 List<AIRecordsViewData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAdapterData = r2;
    }

    public final void setMList(@tb1 List<AIRecords> r1) {
        this.mList = r1;
    }

    public final void setShowItemClick(boolean r1) {
        this.showItemClick = r1;
    }

    public final void share(@aa1 String r2) {
        Intrinsics.X0O(r2, "content");
        ClipboardUtils.copyText(r2);
        startActivity(IntentUtils.getShareTextIntent(r2));
    }

    public final void showAllDeletePopup() {
        if (this.mAllDeleteTipPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.clear_ai_chat_records_list));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new X11());
        r0.X1IX(R.string.confirm, new OXii10I(this));
        this.mAllDeleteTipPopup = r0;
    L5:
        go0 r1 = this.mAllDeleteTipPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    public final void showDeletePopup(@aa1 final AIRecords r5, @aa1 final AIRecords r6, final int r7) {
        Intrinsics.X0O(r5, "mQuestion");
        Intrinsics.X0O(r6, "mResults");
        if (this.mDeleteTipPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.clear_ai_chat_current_records));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new IiiiOIIi0());
        r0.X1IX(R.string.confirm, new iO11i(r5, r6, this, r7));
        this.mDeleteTipPopup = r0;
    L5:
        go0 r8 = this.mDeleteTipPopup;
        if (r8 == null) goto L9;
        r8.IIX1OXO();
        return;
    }

    public final void showList(@aa1 final List<AIRecordsViewData> r3) {
        Intrinsics.X0O(r3, "list");
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new II1(r3, this));
    }
}
