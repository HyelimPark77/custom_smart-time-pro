package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IIO0I00XI;
import com.android.mltcode.paycertificationapi.IiiiXOXX;
import com.android.mltcode.paycertificationapi.OXOOOi1OI;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.XO00IX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iXOIO1;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.UriUtils;
import com.sma.smartv3.db.entity.HealthyReport;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.item.HeathAIAnalyzeItem;
import com.sma.smartv3.ui.status.item.HeathReportsBaseItem;
import com.sma.smartv3.ui.status.item.HeathReportsTopItem;
import com.sma.smartv3.ui.status.item.MainStatusFunctionsItem;
import com.sma.smartv3.util.HeathReportsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,147:1\n1#2:148\n1#2:160\n1563#3:149\n1634#3,3:150\n1563#3:153\n1634#3,3:154\n69#4,3:157\n72#4,5:161\n*S KotlinDebug\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n*L\n144#1:160\n107#1:149\n107#1:150,3\n112#1:153\n112#1:154,3\n144#1:157,3\n144#1:161,5\n*E\n"})
public final class HeathReportsResultActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @tb1
    private DslAdapter dslAdapter;

    @aa1
    private final Lazy mGenerateBtn$delegate;

    @tb1
    private HealthyReport mHealthyReport;

    @tb1
    private RecyclerView mRecyclerView;

    @aa1
    private final Lazy mShareLayout$delegate;

    @tb1
    private List<TodayData> mTodayDataList;
    private long reportsId;

    @aa1
    private final ArrayList<DslAdapterItem> showList;

    public HeathReportsResultActivity() {
        this.TAG = "HeathReportsResultActivity";
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new XO00IX(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new IiiiXOXX(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new IIO0I00XI(this));
        this.mShareLayout$delegate = LazyKt__LazyJVMKt.iO(new OXOOOi1OI(this));
        this.showList = new ArrayList();
        this.mGenerateBtn$delegate = LazyKt__LazyJVMKt.iO(new iXOIO1(this));
        this.reportsId = -1;
    }

    public static /* synthetic */ TextView I0iXXO(HeathReportsResultActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView O10IXXX0X(HeathReportsResultActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(HeathReportsResultActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(HeathReportsResultActivity r0) {
        return mShareLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(HeathReportsResultActivity r0) {
        return mGenerateBtn_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(HeathReportsResultActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(HeathReportsResultActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(HeathReportsResultActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final TextView getMGenerateBtn() {
        return (TextView) getValue();
    }

    private final View getMShareLayout() {
        return (View) getValue();
    }

    private static final TextView mGenerateBtn_delegate$lambda$0(HeathReportsResultActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_generate_report);
    }

    private static final View mShareLayout_delegate$lambda$0(HeathReportsResultActivity r1) {
        return r1.findViewById(R.id.share_layout);
    }

    @aa1
    public final ArrayList<DslAdapterItem> getShowList() {
        return this.showList;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        String r6 = getMArg0();
        if (r6 == null) goto L5;
        long r2 = Long.parseLong(r6);
    L6:
        this.reportsId = r2;
        if (r2 <= (-1)) goto L10;
        HeathReportsUtils r7 = HeathReportsUtils.OXO1;
        HealthyReport r0 = r7.i010I(r2);
        this.mHealthyReport = r0;
        this.mTodayDataList = r7.OX110i(r0);
        return;
    L10:
        return;
    L5:
        r2 = -1;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.health_report));
        LibExKt.XX1Oi(getMGenerateBtn(), true);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_share_hrg);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.ic_waring);
        getAbhTitleOtherRight().setImageTintList(gk4.O00(this, R.color.text_color));
        showCard();
        View r0 = findViewById(R.id.rv);
        Intrinsics.XXI(r0);
        RecyclerView r1 = (RecyclerView) r0;
        this.mRecyclerView = r1;
        if (r1 == null) goto L5;
        r1.setItemViewCacheSize(10);
    L5:
        RecyclerView r2 = this.mRecyclerView;
        if (r2 == null) goto L8;
        r2.setItemAnimator(null);
    L8:
        RecyclerView r3 = this.mRecyclerView;
        if (r3 == null) goto L11;
        r3.setLayoutManager(new GridLayoutManager(getMContext(), 1));
    L11:
        DslAdapter r4 = new DslAdapter(this.showList);
        RecyclerView r5 = this.mRecyclerView;
        if (r5 == null) goto L14;
        r5.setAdapter(r4);
    L14:
        this.dslAdapter = r4;
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

    public final void onTitleRightOtherClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, HistoryDefinitionActivity.class));
    }

    @aa1
    public final ArrayList<DslAdapterItem> showCard() {
        this.showList.clear();
        HealthyReport r0 = this.mHealthyReport;
        if (r0 == null) goto L5;
        long r1 = r0.getMTime();
    L6:
        HeathReportsTopItem r2 = new HeathReportsTopItem(r1, true, this.mHealthyReport);
        this.showList.add(r2);
        ArrayList r3 = new ArrayList();
        List<TodayData> r4 = this.mTodayDataList;
        if (r4 == null) goto L12;
        List<TodayData> r5 = r4;
        ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r7 = r5.iterator();
    L10:
        if (r7.hasNext() == false) goto L12;
        r6.add(Boolean.valueOf(r3.add(new HeathReportsBaseItem((TodayData) r7.next()))));
    L12:
        ArrayList<DslAdapterItem> r8 = this.showList;
        MainStatusFunctionsItem r9 = new MainStatusFunctionsItem();
        r9.setItems(r3);
        r8.add(r9);
        List<TodayData> r10 = this.mTodayDataList;
        if (r10 == null) goto L19;
        List<TodayData> r11 = r10;
        ArrayList r12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r11, 10));
        Iterator<T> r13 = r11.iterator();
    L16:
        if (r13.hasNext() == false) goto L19;
        TodayData r14 = (TodayData) r13.next();
        r12.add(Boolean.valueOf(this.showList.add(new HeathAIAnalyzeItem(r14))));
    L19:
        return this.showList;
    L5:
        r1 = a01.OXO1.OXO1().getLong(b01.XOO0Xi, 0);
        goto L6
    }
}
