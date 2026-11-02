package com.sma.smartv3.ui.status;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I00X101XX;
import com.android.mltcode.paycertificationapi.IIO0XXI;
import com.android.mltcode.paycertificationapi.IOXXIIOX1;
import com.android.mltcode.paycertificationapi.O0OOOXXX;
import com.android.mltcode.paycertificationapi.OXXOO0O;
import com.android.mltcode.paycertificationapi.Oi0O11II;
import com.android.mltcode.paycertificationapi.XI0III0O;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XXOX;
import com.android.mltcode.paycertificationapi.XXiX1IO;
import com.android.mltcode.paycertificationapi.XiIO0OII;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iX10Ii;
import com.android.mltcode.paycertificationapi.iiiXOiX0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.item.HeathReportsBaseItem;
import com.sma.smartv3.ui.status.item.HeathReportsTopItem;
import com.sma.smartv3.ui.status.item.MainStatusFunctionsItem;
import com.sma.smartv3.util.HeathReportsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsGenerateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n1#2:198\n1#2:210\n1563#3:199\n1634#3,3:200\n87#4,7:203\n94#4,3:211\n70#4,7:214\n97#4:221\n*S KotlinDebug\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n*L\n135#1:210\n165#1:199\n165#1:200,3\n135#1:203,7\n135#1:211,3\n135#1:214,7\n135#1:221\n*E\n"})
public final class HeathReportsGenerateActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @tb1
    private DslAdapter dslAdapter;
    private int forNumber;

    @aa1
    private final Lazy mGenerateBtn$delegate;

    @aa1
    private final Lazy mGenerateImgView$delegate;

    @aa1
    private final Lazy mGenerateTvView$delegate;

    @aa1
    private final Handler mHandler;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mShareLayout$delegate;

    @tb1
    private List<TodayData> mTodayDataList;

    @aa1
    private final ArrayList<DslAdapterItem> showList;

    public HeathReportsGenerateActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new iX10Ii(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XXiX1IO(this));
        this.mGenerateBtn$delegate = LazyKt__LazyJVMKt.iO(new IOXXIIOX1(this));
        this.mGenerateImgView$delegate = LazyKt__LazyJVMKt.iO(new XXOX(this));
        this.mGenerateTvView$delegate = LazyKt__LazyJVMKt.iO(new Oi0O11II(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new OXXOO0O(this));
        this.mShareLayout$delegate = LazyKt__LazyJVMKt.iO(new XiIO0OII(this));
        this.showList = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.forNumber = 1;
    }

    public static /* synthetic */ Unit I0iXXO(HeathReportsGenerateActivity r0, long r1) {
        return startAIAnalyze$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(HeathReportsGenerateActivity r0) {
        return initView$lambda$1(r0);
    }

    public static /* synthetic */ View IIX1OXO(HeathReportsGenerateActivity r0) {
        return mGenerateTvView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(HeathReportsGenerateActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(HeathReportsGenerateActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView OiIIX101O(HeathReportsGenerateActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(HeathReportsGenerateActivity r0) {
        return mShareLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(HeathReportsGenerateActivity r0) {
        initView$lambda$1$0(r0);
    }

    public static /* synthetic */ void XX0(HeathReportsGenerateActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XXI(HeathReportsGenerateActivity r0) {
        return mGenerateBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(HeathReportsGenerateActivity r0, TodayData r1, AIAnswer r2) {
        return startAIAnalyze$lambda$0(r0, r1, r2);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final TextView getMGenerateBtn() {
        return (TextView) getValue();
    }

    private final View getMGenerateImgView() {
        return (View) getValue();
    }

    private final View getMGenerateTvView() {
        return (View) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final View getMShareLayout() {
        return (View) getValue();
    }

    public static /* synthetic */ View iIiiO(HeathReportsGenerateActivity r0) {
        return mGenerateImgView_delegate$lambda$0(r0);
    }

    private final void initRecyclerView() {
        getMRecyclerView().setItemViewCacheSize(30);
        getMRecyclerView().setItemAnimator(null);
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(getMContext(), 1, false));
        DslAdapter r0 = new DslAdapter(this.showList);
        getMRecyclerView().setAdapter(r0);
        this.dslAdapter = r0;
        Intrinsics.XXI(r0);
        r0.notifyDataChanged();
    }

    private static final void initView$lambda$0(HeathReportsGenerateActivity r1, View r2) {
        if (r1.mTodayDataList == null) goto L8;
        r1.getMGenerateImgView().setVisibility(0);
        r1.getMGenerateTvView().setVisibility(0);
        r1.getMRecyclerView().setVisibility(8);
        r1.getMGenerateBtn().setVisibility(8);
        r1.forNumber = 1;
        List<TodayData> r3 = r1.mTodayDataList;
        Intrinsics.XXI(r3);
        if (r3.size() <= 0) goto L10;
        r1.startAIAnalyze();
        return;
    L10:
        return;
    L8:
        ToastUtils.showLong(R.string.heath_reports_lack_of_data_tip);
    }

    private static final Unit initView$lambda$1(final HeathReportsGenerateActivity r2) {
        r2.showCard(HeathReportsUtils.OXO1.O1O());
        r2.mHandler.post(new iiiXOiX0(r2));
        return Unit.OXO1;
    }

    private static final void initView$lambda$1$0(HeathReportsGenerateActivity r0) {
        r0.initRecyclerView();
    }

    private static final TextView mGenerateBtn_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_generate_report);
    }

    private static final View mGenerateImgView_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return r1.findViewById(R.id.iv_reports_generation);
    }

    private static final View mGenerateTvView_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return r1.findViewById(R.id.tv_reports_generation);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private static final View mShareLayout_delegate$lambda$0(HeathReportsGenerateActivity r1) {
        return r1.findViewById(R.id.share_layout);
    }

    private final ArrayList<DslAdapterItem> showCard(List<TodayData> r7) {
        this.mTodayDataList = r7;
        this.showList.clear();
        long r0 = a01.OXO1.OXO1().getLong(b01.XOO0Xi, 0);
        this.showList.add(new HeathReportsTopItem(r0, false, null));
        ArrayList r1 = new ArrayList();
        List<TodayData> r8 = r7;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));
        Iterator<T> r9 = r8.iterator();
    L4:
        if (r9.hasNext() == false) goto L6;
        r2.add(Boolean.valueOf(r1.add(new HeathReportsBaseItem((TodayData) r9.next()))));
        goto L4
    L6:
        ArrayList<DslAdapterItem> r10 = this.showList;
        MainStatusFunctionsItem r3 = new MainStatusFunctionsItem();
        r3.setItems(r1);
        r10.add(r3);
        return this.showList;
    }

    private final void startAIAnalyze() {
        List<TodayData> r0 = this.mTodayDataList;
        Intrinsics.XXI(r0);
        final TodayData r1 = r0.get(this.forNumber - 1);
        HeathReportsUtils r2 = HeathReportsUtils.OXO1;
        String r3 = HeathReportsUtils.iX1O1(r2, r1.getDataType(), r1.getTitle(), r1.getValue(), 0, 8, null);
        if (r3.length() <= 0) goto L6;
        HeathReportsUtils.iXi(r2, r3, 0, new IIO0XXI(this, r1), 2, null);
        return;
    }

    private static final Unit startAIAnalyze$lambda$0(final HeathReportsGenerateActivity r1, TodayData r2, AIAnswer r3) {
        r1.forNumber++;
        if (r3 == null) goto L9;
        String r0 = r3.getText();
        if (r0 == null) goto L9;
        if (r0.length() <= 0) goto L9;
        r2.setMExtraInfo(r3.getText());
    L9:
        int r4 = r1.forNumber;
        List<TodayData> r5 = r1.mTodayDataList;
        Intrinsics.XXI(r5);
        if (r4 < r5.size()) goto L12;
        HeathReportsUtils.OXO1.OO(r1.mTodayDataList, new I00X101XX(r1));
    L14:
        return Unit.OXO1;
    L12:
        r1.startAIAnalyze();
        goto L14
    }

    private static final Unit startAIAnalyze$lambda$0$0(HeathReportsGenerateActivity r4, long r5) {
        if (r5 <= 0) goto L5;
        a01.OXO1.OXO1().put(b01.XOO0Xi, System.currentTimeMillis());
        String r6 = String.valueOf(r5);
        Bundle r7 = new Bundle();
        r7.putString("mArg0", r6);
        r7.putParcelable("mArg2", null);
        r7.putSerializable("mArg3", null);
        Intent r8 = new Intent(r4, HeathReportsResultActivity.class);
        r8.putExtras(r7);
        r4.startActivity(r8);
        r4.finish();
    L7:
        return Unit.OXO1;
    L5:
        ToastUtils.showLong(r4.getString(R.string.generate_failed), new Object[0]);
        goto L7
    }

    public final int getForNumber() {
        return this.forNumber;
    }

    @aa1
    public final ArrayList<DslAdapterItem> getShowList() {
        return this.showList;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @SuppressLint({"NotifyDataSetChanged"})
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.health_report));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_share_hrg);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        initRecyclerView();
        getMGenerateBtn().setOnClickListener(new O0OOOXXX(this));
        ThreadsKt.iO(false, false, null, null, 0, new XI0III0O(this), 31, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_heath_reports;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        Bitmap r6 = Bitmap.createBitmap(getMShareLayout().getWidth(), getMShareLayout().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r6, "createBitmap(...)");
        Canvas r0 = new Canvas(r6);
        XIi1i01O r1 = XIi1i01O.OXO1;
        View r2 = getMShareLayout();
        Intrinsics.O10IXXX0X(r2, "<get-mShareLayout>(...)");
        r0.drawBitmap(r1.XIi00iiXO(r2), 0.0f, 0.0f, null);
        sz0 r3 = sz0.OXO1;
        ImageUtils.save(r6, uz0.XOX0O0(r3), Bitmap.CompressFormat.JPEG);
        Intent r7 = new Intent("android.intent.action.SEND");
        r7.putExtra("android.intent.extra.TEXT", "");
        r7.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(uz0.XOX0O0(r3)));
        r7.setType("image/*");
        Intent r8 = Intent.createChooser(r7, "");
        Intrinsics.O10IXXX0X(r8, "createChooser(...)");
        r8.addFlags(268435456);
        startActivity(r8);
    }

    public final void setForNumber(int r1) {
        this.forNumber = r1;
    }
}
