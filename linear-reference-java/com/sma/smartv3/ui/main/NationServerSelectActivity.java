package com.sma.smartv3.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.d11;
import com.android.mltcode.paycertificationapi.e11;
import com.android.mltcode.paycertificationapi.e44;
import com.android.mltcode.paycertificationapi.f11;
import com.android.mltcode.paycertificationapi.g11;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.h11;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiXIXiX;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.j11;
import com.android.mltcode.paycertificationapi.k11;
import com.android.mltcode.paycertificationapi.l11;
import com.android.mltcode.paycertificationapi.m11;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.n11;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.p11;
import com.android.mltcode.paycertificationapi.q11;
import com.android.mltcode.paycertificationapi.r11;
import com.android.mltcode.paycertificationapi.s11;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.t11;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u11;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.v11;
import com.android.mltcode.paycertificationapi.w11;
import com.android.mltcode.paycertificationapi.y11;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.DeveloperServerActivity;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nNationServerSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,581:1\n39#2,3:582\n42#2:588\n44#2,2:590\n39#2,3:593\n42#2:599\n44#2,2:601\n1563#3:585\n1634#3,2:586\n1636#3:589\n1563#3:596\n1634#3,2:597\n1636#3:600\n1869#3,2:603\n1878#3,3:605\n1869#3,2:608\n1869#3,2:625\n774#3:627\n865#3,2:628\n1#4:592\n1#4:633\n55#5,12:610\n84#5,3:622\n69#6,3:630\n72#6,5:634\n*S KotlinDebug\n*F\n+ 1 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n*L\n123#1:582,3\n123#1:588\n123#1:590,2\n124#1:593,3\n124#1:599\n124#1:601,2\n123#1:585\n123#1:586,2\n123#1:589\n124#1:596\n124#1:597,2\n124#1:600\n147#1:603,2\n246#1:605,3\n291#1:608,2\n555#1:625,2\n564#1:627\n564#1:628,2\n536#1:633\n388#1:610,12\n388#1:622,3\n536#1:630,3\n536#1:634,5\n*E\n"})
public final class NationServerSelectActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @tb1
    private d11 curSelectedItem;
    private boolean isGetLocationCode;

    @tb1
    private CommonAdapter<d11> mAdapter;

    @aa1
    private final Lazy mChooseNationText$delegate;

    @aa1
    private List<iiXIXiX> mContinentsList;

    @tb1
    private uq mLoadingPopup;

    @tb1
    private ms mLocationClient;

    @tb1
    private go0 mLocationServerPopup;

    @aa1
    private List<d11> mNationList;

    @aa1
    private final Lazy mNationSearchIcon$delegate;

    @aa1
    private final Lazy mNationSearchText$delegate;

    @aa1
    private final Lazy mNextStep$delegate;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mSelectNation$delegate;

    @tb1
    private go0 mTestServerRemindPop;

    @aa1
    private final List<d11> originalNationList;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy selectServerButton$delegate;

    @aa1
    private final Lazy selectServerIsShow$delegate;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n389#2,3:83\n59#3:86\n62#4:87\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ NationServerSelectActivity IO;

        public OXO1(NationServerSelectActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            String r3 = String.valueOf(r2);
            NationServerSelectActivity.access$searchContent(this.IO, r3);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.main.NationServerSelectActivity$setRecyclerView$1, reason: invalid class name and case insensitive filesystem */
    public static final class C34741 extends CommonAdapter<d11> {
        final /* synthetic */ NationServerSelectActivity this$0;

        public C34741(NationServerSelectActivity r2, List<d11> r3) {
            this.this$0 = r2;
            super(r2, R.layout.layout_item_nation_text, r3);
        }

        public static /* synthetic */ void OXO1(NationServerSelectActivity r0, d11 r1, View r2) {
            convert$lambda$0(r0, r1, r2);
        }

        private static final void convert$lambda$0(NationServerSelectActivity r0, d11 r1, View r2) {
            NationServerSelectActivity.access$upDataNationList(r0, r1);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, d11 r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r2, final d11 r3, int r4) {
            Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
            if (r2 == null) goto L7;
            TextView r5 = (TextView) r2.getView(R.id.item_content);
            if (r5 == null) goto L7;
            r5.setText(e11.iO(r3.XOO0ii0()));
        L7:
            if (r2 == null) goto L9;
            View r6 = r2.getView(R.id.check_selected_icon);
        L10:
            if (r6 != null) goto L12;
        L16:
            if (r2 == null) goto L21;
            View r7 = r2.itemView;
            if (r7 == null) goto L22;
            final NationServerSelectActivity r8 = this.this$0;
            r7.setOnClickListener(new y11(r8, r3));
            return;
        L22:
            return;
        L21:
            return;
        L12:
            if (r3.IO() == false) goto L14;
            int r0 = 0;
        L15:
            r6.setVisibility(r0);
            goto L16
        L14:
            r0 = 4;
            goto L15
        L9:
            r6 = null;
            goto L10
        }
    }

    public NationServerSelectActivity() {
        this.TAG = "NationServerSelectActivity";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new p11(this));
        this.selectServerButton$delegate = LazyKt__LazyJVMKt.iO(new q11(this));
        this.selectServerIsShow$delegate = LazyKt__LazyJVMKt.iO(new r11(this));
        this.mSelectNation$delegate = LazyKt__LazyJVMKt.iO(new s11(this));
        this.mChooseNationText$delegate = LazyKt__LazyJVMKt.iO(new t11(this));
        this.mNationSearchText$delegate = LazyKt__LazyJVMKt.iO(new u11(this));
        this.mNationSearchIcon$delegate = LazyKt__LazyJVMKt.iO(new v11(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new w11(this));
        this.mNextStep$delegate = LazyKt__LazyJVMKt.iO(new g11(this));
        this.originalNationList = new ArrayList();
        this.mNationList = new ArrayList();
        this.mContinentsList = new ArrayList();
    }

    public static /* synthetic */ ImageView I0iXXO(NationServerSelectActivity r0) {
        return mNationSearchIcon_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View I1(NationServerSelectActivity r0) {
        return selectServerIsShow_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I1XOi1(NationServerSelectActivity r0, View r1) {
        onSetListener$lambda$3(r0, r1);
    }

    public static /* synthetic */ RecyclerView IIX1OXO(NationServerSelectActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(NationServerSelectActivity r0) {
        return moreSetting$lambda$0$0(r0);
    }

    public static /* synthetic */ EditText OII(NationServerSelectActivity r0) {
        return mNationSearchText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(NationServerSelectActivity r0, boolean r1) {
        return gotoStartLocation$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OX(NationServerSelectActivity r0) {
        return mChooseNationText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(NationServerSelectActivity r0) {
        return mSelectNation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(NationServerSelectActivity r0, View r1) {
        return onSetListener$lambda$2(r0, r1);
    }

    public static /* synthetic */ void X1ii(NationServerSelectActivity r0, View r1) {
        onSetListener$lambda$4(r0, r1);
    }

    public static /* synthetic */ View XX0(NationServerSelectActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XXI(NationServerSelectActivity r0) {
        return mNextStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(NationServerSelectActivity r0, View r1) {
        onSetListener$lambda$1(r0, r1);
    }

    public static /* synthetic */ View XiOIii1(NationServerSelectActivity r0) {
        return selectServerButton_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$dismissLoading(NationServerSelectActivity r0) {
        r0.dismissLoading();
    }

    public static final /* synthetic */ d11 access$getCurSelectedItem$p(NationServerSelectActivity r0) {
        return r0.curSelectedItem;
    }

    public static final /* synthetic */ Activity access$getMContext(NationServerSelectActivity r0) {
        return r0.getMContext();
    }

    public static final /* synthetic */ List access$getOriginalNationList$p(NationServerSelectActivity r0) {
        return r0.originalNationList;
    }

    public static final /* synthetic */ String access$getTAG$p(NationServerSelectActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$notifyDataSetChanged(NationServerSelectActivity r0) {
        r0.notifyDataSetChanged();
    }

    public static final /* synthetic */ void access$searchContent(NationServerSelectActivity r0, String r1) {
        r0.searchContent(r1);
    }

    public static final /* synthetic */ void access$setDataNationList(NationServerSelectActivity r0, String r1) {
        r0.setDataNationList(r1);
    }

    public static final /* synthetic */ void access$stopLocationClient(NationServerSelectActivity r0) {
        r0.stopLocationClient();
    }

    public static final /* synthetic */ void access$upDataNationList(NationServerSelectActivity r0, d11 r1) {
        r0.upDataNationList(r1);
    }

    private final void changeViewStatus() {
        Iterator<T> r0 = this.mNationList.iterator();
    L3:
        boolean r2 = false;
    L5:
        if (r0.hasNext() == false) goto L11;
        d11 r3 = (d11) r0.next();
        if (r2 == true) goto L10;
        if (r3.IO() == false) goto L3;
    L10:
        r2 = true;
        goto L5
    L11:
        getMNextStep().setEnabled(r2);
    }

    private final void dismissLoading() {
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    private final TextView getMChooseNationText() {
        return (TextView) getValue();
    }

    private final ImageView getMNationSearchIcon() {
        return (ImageView) getValue();
    }

    private final EditText getMNationSearchText() {
        return (EditText) getValue();
    }

    private final Button getMNextStep() {
        return (Button) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final View getMSelectNation() {
        return (View) getValue();
    }

    private final void getNetworkNationData() {
        AndroidNetworking.get("https://api-oss.iot-solution.net/var-www/countrys/countries.min.json").setTag("https://api-oss.iot-solution.net/var-www/countrys/countries.min.json").setPriority(Priority.HIGH).build().getAsJSONObject(new AnonymousClass1(this));
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final View getSelectServerButton() {
        return (View) getValue();
    }

    private final View getSelectServerIsShow() {
        return (View) getValue();
    }

    private final void gotoStartLocation() {
        if (UtilsKt.X1() == true) goto L6;
        locationServerRemind();
        return;
    L6:
        hr1.XXIIO1i11(hr1.OXO1, this, false, new f11(this), 2, null);
    }

    private static final Unit gotoStartLocation$lambda$0(NationServerSelectActivity r0, boolean r1) {
        if (r1 == false) goto L4;
        r0.startLocationClient();
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong("No location permissions", new Object[0]);
        goto L6
    }

    public static /* synthetic */ boolean iIiiO(NationServerSelectActivity r0) {
        return locationServerRemind$lambda$0$0(r0);
    }

    private final void locationServerRemind() {
        if (this.mLocationServerPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.iX(Integer.valueOf(R.string.location_server_notification));
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new m11(this));
        this.mLocationServerPopup = r0;
    L5:
        go0 r1 = this.mLocationServerPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }

    private static final boolean locationServerRemind$lambda$0$0(NationServerSelectActivity r2) {
        r2.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
        return true;
    }

    private static final TextView mChooseNationText_delegate$lambda$0(NationServerSelectActivity r1) {
        return (TextView) r1.findViewById(R.id.choose_nation_search_text);
    }

    private static final ImageView mNationSearchIcon_delegate$lambda$0(NationServerSelectActivity r1) {
        return (ImageView) r1.findViewById(R.id.nation_search_icon);
    }

    private static final EditText mNationSearchText_delegate$lambda$0(NationServerSelectActivity r1) {
        return (EditText) r1.findViewById(R.id.nation_search_text);
    }

    private static final Button mNextStep_delegate$lambda$0(NationServerSelectActivity r1) {
        return (Button) r1.findViewById(R.id.btn_nextStep);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(NationServerSelectActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private static final View mSelectNation_delegate$lambda$0(NationServerSelectActivity r1) {
        return r1.findViewById(R.id.search_nation);
    }

    private static final boolean moreSetting$lambda$0$0(NationServerSelectActivity r2) {
        r2.startActivity(new Intent(r2, DeveloperServerActivity.class));
        return true;
    }

    private final void notifyDataSetChanged() {
        CommonAdapter<d11> r0 = this.mAdapter;
        if (r0 == null) goto L5;
        r0.notifyDataSetChanged();
    L5:
        changeViewStatus();
    }

    private final void onSetListener() {
        EditText r0 = getMNationSearchText();
        Intrinsics.O10IXXX0X(r0, "<get-mNationSearchText>(...)");
        r0.addTextChangedListener(new OXO1(this));
        getMNationSearchIcon().setOnClickListener(new h11(this));
        getSelectServerButton().setVisibility(8);
        getSelectServerIsShow().setOnLongClickListener(new j11(this));
        getMNextStep().setOnClickListener(new k11(this));
        getMSelectNation().setOnClickListener(new l11(this));
    }

    private static final void onSetListener$lambda$1(NationServerSelectActivity r0, View r1) {
        r0.searchContent(r0.getMNationSearchText().getText().toString());
    }

    private static final boolean onSetListener$lambda$2(NationServerSelectActivity r0, View r1) {
        r0.getSelectServerButton().setVisibility(0);
        return true;
    }

    private static final void onSetListener$lambda$3(NationServerSelectActivity r0, View r1) {
        d11 r2 = r0.curSelectedItem;
        if (r2 == null) goto L6;
        Intrinsics.XXI(r2);
        r0.routeByCountry(r2.I0IIOi());
        return;
    L6:
        ToastUtils.showLong(r0.getString(R.string.data_nation_server_select), new Object[0]);
    }

    private static final void onSetListener$lambda$4(NationServerSelectActivity r0, View r1) {
        r0.gotoStartLocation();
    }

    private static final View rootView_delegate$lambda$0(NationServerSelectActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void routeByCountry(String r4) {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " routeByCountry ct = " + r4);
        int r0 = r4.hashCode();
        if (r0 == 2092) goto L27;
        if (r0 == 2095) goto L22;
        if (r0 == 2155) goto L17;
        if (r0 == 2224) goto L12;
    L28:
        onAsiaPacific();
        return;
    L12:
        if (r4.equals("EU") == false) goto L28;
        onEuroAmerica();
        return;
    L17:
        if (r4.equals("CN") == false) goto L28;
        onChinaMainland();
        return;
    L22:
        if (r4.equals("AP") == false) goto L28;
        onAsiaPacific();
        return;
    L27:
        if (r4.equals("AM") == false) goto L28;
        onSiliconValleyServerLl();
    }

    private final void searchContent(String r6) {
        if (r6.length() != 0) goto L15;
        this.mNationList.clear();
        Iterator<T> r7 = this.originalNationList.iterator();
    L6:
        if (r7.hasNext() == false) goto L14;
        d11 r0 = (d11) r7.next();
        d11 r2 = this.curSelectedItem;
        if (r2 == null) goto L10;
        String r3 = r2.XOO0ii0();
    L12:
        if (oe5.OX0X1O10X(r3, r0.XOO0ii0(), true) == false) goto L6;
        r0.OIX0iXi(true);
        goto L6
    L10:
        r3 = null;
        goto L12
    L14:
        this.mNationList.addAll(this.originalNationList);
    L22:
        notifyDataSetChanged();
        return;
    L15:
        List<d11> r1 = this.originalNationList;
        ArrayList r4 = new ArrayList();
        Iterator<T> r5 = r1.iterator();
    L17:
        if (r5.hasNext() == false) goto L21;
        Object r8 = r5.next();
        if (StringsKt__StringsKt.iOiXX(((d11) r8).OIi0(), r6, true) == false) goto L17;
        r4.add(r8);
        goto L17
    L21:
        this.mNationList.clear();
        this.mNationList.addAll(r4);
        goto L22
    }

    private static final View selectServerButton_delegate$lambda$0(NationServerSelectActivity r1) {
        return r1.findViewById(R.id.server_select_img_button);
    }

    private static final View selectServerIsShow_delegate$lambda$0(NationServerSelectActivity r1) {
        return r1.findViewById(R.id.server_select_tv);
    }

    private final void setDataNationList(String r9) {
        Iterator<T> r0 = this.mNationList.iterator();
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r0.hasNext() == false) goto L13;
        Object r4 = r0.next();
        int r6 = r2 + 1;
        if (r2 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        d11 r5 = (d11) r4;
        r5.OIX0iXi(false);
        if (oe5.OX0X1O10X(r9, r5.XOO0ii0(), true) == false) goto L11;
        r5.OIX0iXi(true);
        this.curSelectedItem = r5;
        r3 = r2;
    L11:
        r2 = r6;
        goto L4
    L13:
        if (this.curSelectedItem == null) goto L15;
        TextView r10 = getMChooseNationText();
        d11 r1 = this.curSelectedItem;
        Intrinsics.XXI(r1);
        r10.setText(e11.iO(r1.XOO0ii0()));
    L15:
        notifyDataSetChanged();
        RecyclerView.LayoutManager r11 = getMRecyclerView().getLayoutManager();
        if ((r11 instanceof LinearLayoutManager) == false) goto L18;
        LinearLayoutManager r12 = (LinearLayoutManager) r11;
    L19:
        if (r12 == null) goto L21;
        int r13 = r12.findFirstVisibleItemPosition();
    L23:
        if (r3 >= (this.originalNationList.size() - 5)) goto L28;
        if (r13 <= r3) goto L26;
        r3 = Math.max(0, r3 - 4);
        goto L28
    L26:
        if (r13 >= r3) goto L28;
        r3 = Math.min(this.originalNationList.size() - 1, r3 + 4);
    L28:
        getMRecyclerView().smoothScrollToPosition(r3);
        return;
    L21:
        r13 = 0;
        goto L23
    L18:
        r12 = null;
        goto L19
    }

    private final void setRecyclerView() {
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        this.mAdapter = new C34741(this, this.mNationList);
        getMRecyclerView().setAdapter(this.mAdapter);
    }

    private final void showLoading(String r3) {
        uq r0 = new uq(this);
        if (TextUtils.isEmpty(r3) == true) goto L5;
        r0.iOOX010X(r3);
    L5:
        this.mLoadingPopup = r0;
        r0.I0iXXO(false);
        uq r4 = this.mLoadingPopup;
        if (r4 == null) goto L9;
        r4.IIX1OXO();
        return;
    }

    public static /* synthetic */ void showLoading$default(NationServerSelectActivity r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        r0.showLoading(r1);
    }

    private final void startLocationClient() {
        showLoading$default(this, null, 1, null);
        if (this.mLocationClient != null) goto L5;
        this.mLocationClient = ns.XIi00iiXO(new C34751(this), false, 2, null);
    L5:
        ms r0 = this.mLocationClient;
        if (r0 == null) goto L9;
        r0.IiI10X(0, false);
        return;
    }

    private final void stopLocationClient() {
        ms r0 = this.mLocationClient;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    private final void toStartLogin() {
        a01.OXO1.IiI10X().put(b01.O001I, true);
        i72.OXO1.XOiXXOO(this);
    }

    private final void upDataNationList(d11 r5) {
        Iterator<T> r0 = this.mNationList.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        d11 r1 = (d11) r0.next();
        r1.OIX0iXi(false);
        if (Intrinsics.XOO0ii0(r5.XOO0ii0(), r1.XOO0ii0()) == false) goto L4;
        this.curSelectedItem = r5;
        r1.OIX0iXi(true);
        goto L4
    L8:
        notifyDataSetChanged();
    }

    @tb1
    public final CommonAdapter<d11> getMAdapter() {
        return this.mAdapter;
    }

    @aa1
    public final List<iiXIXiX> getMContinentsList() {
        return this.mContinentsList;
    }

    @aa1
    public final List<d11> getMNationList() {
        return this.mNationList;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        setBarView();
        getMNextStep().setEnabled(false);
        JsonArray r3 = JsonParser.parseString(a01.OXO1.XIi00iiXO().getString(iiXIXiX.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r3);     // Catch: Exception -> L8
        Collection r5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r4 = r3.iterator();     // Catch: Exception -> L8
    L5:
        if (r4.hasNext() == false) goto L9;
        r5.add(new Gson().fromJson(r4.next(), iiXIXiX.class));     // Catch: Exception -> L8
    L9:
        Collection r6 = r5;
        if (r6.isEmpty() == false) goto L12;
        r6 = e11.XO0O10();
    L12:
        this.mContinentsList = CollectionsKt___CollectionsKt.OO0Oi10(r6);
        JsonArray r1 = JsonParser.parseString(a01.OXO1.XIi00iiXO().getString(d11.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L18
        Intrinsics.XXI(r1);     // Catch: Exception -> L18
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L18
        Iterator<JsonElement> r7 = r1.iterator();     // Catch: Exception -> L18
    L15:
        if (r7.hasNext() == false) goto L19;
        r2.add(new Gson().fromJson(r7.next(), d11.class));     // Catch: Exception -> L18
    L19:
        Collection r8 = r2;
        if (r8.isEmpty() == false) goto L22;
        r8 = e11.O00();
    L22:
        List<d11> r0 = CollectionsKt___CollectionsKt.OO0Oi10(r8);
        this.mNationList = r0;
        this.originalNationList.addAll(r0);
        setRecyclerView();
        getNetworkNationData();
        onSetListener();
        if (UtilsKt.X1() == true) goto L25;
        return;
    L25:
        if (hr1.OXO1.X00Xi1X(this) == false) goto L37;
        gotoStartLocation();
        return;
    L37:
        return;
    L18:
        r2 = CollectionsKt__CollectionsKt.iI();
    L8:
        r5 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    public final boolean isGetLocationCode() {
        return this.isGetLocationCode;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_nation_server_select;
    }

    public final void moreSetting(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (this.mTestServerRemindPop != null) goto L5;
        go0 r5 = new go0(this, 0, 2, null);
        r5.iX(Integer.valueOf(R.string.test_function_remind));
        r5.IXXOO(Integer.valueOf(GravityCompat.START));
        go0.X11iII1O1(r5, Integer.valueOf(R.string.cancel), null, 2, null);
        r5.X1IX(R.string.open_test_function, new n11(this));
        this.mTestServerRemindPop = r5;
    L5:
        go0 r6 = this.mTestServerRemindPop;
        if (r6 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r6.I1XOi1(r0);
        return;
    }

    public final void onAsiaPacific() {
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.X01IiOiIi, e44.OXO1);
        r0.IiI10X().put(b01.II1Xi0, getString(R.string.asia_pacific));
        toStartLogin();
    }

    public final void onChinaMainland() {
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.X01IiOiIi, e44.iO);
        r0.IiI10X().put(b01.II1Xi0, getString(R.string.china_mainland));
        toStartLogin();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        dismissLoading();
        super.onDestroy();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onEmailLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        if (isFinishing() == true) goto L6;
        finish();
        return;
    }

    public final void onEuroAmerica() {
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.X01IiOiIi, e44.XIi00iiXO);
        r0.IiI10X().put(b01.II1Xi0, getString(R.string.europe_and_america));
        toStartLogin();
    }

    public final void onSiliconValleyServerLl() {
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.X01IiOiIi, e44.O00);
        r0.IiI10X().put(b01.II1Xi0, getString(R.string.silicon_valley_of_america_name));
        toStartLogin();
    }

    public final void setBarView() {
        transparentStatusBar();
    }

    public final void setGetLocationCode(boolean r1) {
        this.isGetLocationCode = r1;
    }

    public final void setMAdapter(@tb1 CommonAdapter<d11> r1) {
        this.mAdapter = r1;
    }

    public final void setMContinentsList(@aa1 List<iiXIXiX> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContinentsList = r2;
    }

    public final void setMNationList(@aa1 List<d11> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mNationList = r2;
    }
}
