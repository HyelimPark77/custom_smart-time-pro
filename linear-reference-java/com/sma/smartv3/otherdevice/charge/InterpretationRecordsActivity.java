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
import com.android.mltcode.paycertificationapi.ba;
import com.android.mltcode.paycertificationapi.ca;
import com.android.mltcode.paycertificationapi.da;
import com.android.mltcode.paycertificationapi.ea;
import com.android.mltcode.paycertificationapi.fa;
import com.android.mltcode.paycertificationapi.ga;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.ha;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ia;
import com.android.mltcode.paycertificationapi.ja;
import com.android.mltcode.paycertificationapi.ka;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nInterpretationRecordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n1#2:191\n87#3,7:184\n94#3,3:192\n70#3,7:195\n97#3:202\n1869#4,2:203\n*S KotlinDebug\n*F\n+ 1 InterpretationRecordsActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsActivity\n*L\n104#1:191\n104#1:184,7\n104#1:192,3\n104#1:195,7\n104#1:202\n138#1:203,2\n*E\n"})
public final class InterpretationRecordsActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @tb1
    private go0 mAllDeleteTipPopup;
    private List<AIRecords> mList;

    @aa1
    private final AIRecordsDao mRecordsDao;

    public InterpretationRecordsActivity() {
        this.TAG = "InterpretationRecordsActivity";
        this.mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new ba(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ca(this));
    }

    public static /* synthetic */ Unit I0iXXO(DslAdapter r0) {
        return setList$lambda$0$0$1(r0);
    }

    public static /* synthetic */ boolean I1XOi1() {
        return showDeleteTipPopup$lambda$0$0();
    }

    public static /* synthetic */ boolean IIX1OXO(InterpretationRecordsActivity r0) {
        return showDeleteTipPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(InterpretationRecordsActivity r0, DslAdapter r1) {
        return setList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(InterpretationRecordsActivity r0, AIRecords r1, DslAdapterItem r2) {
        return setList$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X1ii(InterpretationRecordsActivity r0, AIRecords r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return setList$lambda$0$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ TextView XX0(InterpretationRecordsActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(InterpretationRecordsActivity r0, AIRecords r1, View r2) {
        return setList$lambda$0$0$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit XiOIO(InterpretationRecordsActivity r0, DslAdapter r1) {
        return setList$lambda$0$0(r0, r1);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(InterpretationRecordsActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(InterpretationRecordsActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ ImageView iIiiO(InterpretationRecordsActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private final void setList() {
        initList();
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = this.TAG;
        List<AIRecords> r2 = this.mList;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mList");
        r2 = null;
    L5:
        r0.OXO1(r1 + " list = " + r2.size());
        renderAdapter(new ka(this));
    }

    private static final Unit setList$lambda$0(final InterpretationRecordsActivity r2, final DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r2.getDslAdapter().clearAllItems();
        r3.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(500, new ha(r2, r3));
        return Unit.OXO1;
    }

    private static final Unit setList$lambda$0$0(final InterpretationRecordsActivity r10, DslAdapter r11) {
        List<AIRecords> r0 = r10.mList;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mList");
        r0 = null;
    L5:
        Iterator<AIRecords> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        final AIRecords r2 = r1.next();
        DslAdapterExKt.O10IXXX0X(r10.getDslAdapter(), R.layout.item_list_interpretation_records, new ea(r10, r2));
        goto L7
    L9:
        DslAdapter.render$default(r11, false, null, new fa(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit setList$lambda$0$0$0(final InterpretationRecordsActivity r1, final AIRecords r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemBindOverride(new ga(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit setList$lambda$0$0$0$0(final InterpretationRecordsActivity r1, final AIRecords r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "adapterItem");
        Intrinsics.X0O(r6, "<unused var>");
        i1O0OXO1O.OXO1.OXO1(r1.TAG + " mAIRecords item = " + r2);
        TextView r7 = r3.tv(R.id.interpretation_records_language_left_tv);
        if (r7 == null) goto L5;
        r7.setText(r1.getString(R.string.save_recording_translate) + CertificateUtil.DELIMITER);
    L5:
        TextView r8 = r3.tv(R.id.interpretation_records_language);
        if (r8 == null) goto L8;
        r8.setText(r2.getMTranslateLanguage());
    L8:
        TextView r9 = r3.tv(R.id.interpretation_records_to_language);
        if (r9 == null) goto L11;
        r9.setText(r2.getMTranslateToLanguage());
    L11:
        TextView r10 = r3.tv(R.id.interpretation_records_duration);
        if (r10 == null) goto L14;
        r10.setText(r1.getString(R.string.action_details) + ": " + O0X11OiO.OX110i(r2.getMAudioDuration()));
    L14:
        TextView r11 = r3.tv(R.id.interpretation_records_title);
        if (r11 == null) goto L17;
        r11.setText(r2.getMAITitle());
    L17:
        TextView r12 = r3.tv(R.id.interpretation_records_content);
        if (r12 == null) goto L20;
        r12.setText(r2.getMContent() + r2.getMExtraInfo());
    L20:
        TextView r13 = r3.tv(R.id.interpretation_records_location);
        if (r13 == null) goto L26;
        String r14 = r2.getMLocation();
        if (r14.length() != 0) goto L25;
        r14 = HelpFormatter.DEFAULT_OPT_PREFIX;
    L25:
        r13.setText(r14);
    L26:
        TextView r15 = r3.tv(R.id.interpretation_records_time);
        if (r15 == null) goto L29;
        r15.setText(r2.getMLocalTime());
    L29:
        r3.clickItem(new da(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit setList$lambda$0$0$0$0$1(InterpretationRecordsActivity r2, AIRecords r3, View r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", r3);
        Intent r6 = new Intent(r2, InterpretationRecordsDetailActivity.class);
        r6.putExtras(r5);
        r2.startActivity(r6);
        return Unit.OXO1;
    }

    private static final Unit setList$lambda$0$0$1(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    private static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$0$1(InterpretationRecordsActivity r5) {
        List<AIRecords> r0 = r5.mList;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mList");
        r0 = null;
    L5:
        Iterator<T> r1 = r0.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        AIRecords r3 = (AIRecords) r1.next();
        r3.setMIsDelete(1);
        r3.setMIsSync(0);
        goto L7
    L9:
        AIRecordsDao r2 = r5.mRecordsDao;
        List<AIRecords> r4 = r5.mList;
        if (r4 != null) goto L12;
        Intrinsics.XXO("mList");
        r4 = null;
    L12:
        r2.update(r4);
        List<AIRecords> r6 = r5.mList;
        if (r6 != null) goto L15;
        Intrinsics.XXO("mList");
        r6 = null;
    L15:
        r6.clear();
        r5.setList();
        ToastUtils.showLong(R.string.clear_success);
        I01XX0.XIi00iiXO(I01XX0.XOX0O0, null, 2, null);
        return true;
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final AIRecordsDao getMRecordsDao() {
        return this.mRecordsDao;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<AIRecords> initList() {
        List<AIRecords> r0 = CollectionsKt___CollectionsKt.OO0Oi10(this.mRecordsDao.getListDESC(AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType()));
        this.mList = r0;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mList");
        return null;
    L6:
        return r0;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.interpretation_record));
        ImageView r0 = getAbhTitleRight();
        r0.setVisibility(0);
        r0.setImageResource(R.drawable.ai_records_delete_icon);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
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
    public final void onRefreshList(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.d(new Object[]{"onFirmwareRepair"});
        setList();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showDeleteTipPopup();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.clear_ai_chat_list));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new ia());
        r0.X1IX(R.string.confirm, new ja(this));
        this.mAllDeleteTipPopup = r0;
    L5:
        go0 r1 = this.mAllDeleteTipPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }
}
