package com.sma.smartv3.ui.me;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I0OOO0OO;
import com.android.mltcode.paycertificationapi.IX0XOXOOI;
import com.android.mltcode.paycertificationapi.IXIOXXi;
import com.android.mltcode.paycertificationapi.O00XXII10;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX10OiI1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1OOI0;
import com.android.mltcode.paycertificationapi.iO101I0X;
import com.android.mltcode.paycertificationapi.iXOiI0XX0;
import com.android.mltcode.paycertificationapi.iiO1Xi0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.l4digital.fastscroll.FastScrollRecyclerView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.BleFirmwareVersionInfoList;
import com.sma.smartv3.model.DeviceOnlineInfo;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleFirmwareList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,193:1\n1563#2:194\n1634#2,3:195\n176#3,11:198\n196#3:217\n252#4,7:209\n270#4:216\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n*L\n52#1:194\n52#1:195,3\n174#1:198,11\n174#1:217\n174#1:209,7\n174#1:216\n*E\n"})
public final class DeveloperOtaSelectBleNameActivity extends BaseListActivity<String> {

    @aa1
    private final Lazy btNext$delegate;

    @aa1
    private ArrayList<String> dataList;

    @tb1
    private CommonAdapter<String> mRecyclerAdapter;

    @aa1
    private final Lazy recyclerView$delegate;

    @aa1
    private final ArrayList<String> searchList;

    @aa1
    private final Lazy searchView$delegate;

    @aa1
    private final Lazy select_group_ll$delegate;

    @aa1
    private final Lazy toolbar$delegate;

    @aa1
    private final Lazy tvSelect$delegate;

    @aa1
    private final Lazy tvSelectRemind$delegate;

    @SourceDebugExtension({"SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1869#2,2:194\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n*L\n103#1:194,2\n*E\n"})
    public static final class OXO1 implements MaterialSearchView.I0IIOi {
        public final /* synthetic */ DeveloperOtaSelectBleNameActivity IO;

        public OXO1(DeveloperOtaSelectBleNameActivity r1) {
            this.IO = r1;
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
        public boolean onQueryTextChange(String r7) {
            Intrinsics.X0O(r7, "newText");
            LogUtils.d(new Object[]{"onQueryTextChange => " + r7});
            DeveloperOtaSelectBleNameActivity.access$getSearchList$p(this.IO).clear();
            if (TextUtils.isEmpty(r7) == true) goto L19;
            ArrayList r0 = DeveloperOtaSelectBleNameActivity.access$getDataList$p(this.IO);
            DeveloperOtaSelectBleNameActivity r3 = this.IO;
            Iterator r1 = r0.iterator();
        L6:
            if (r1.hasNext() == false) goto L11;
            String r4 = (String) r1.next();
            if (StringsKt__StringsKt.iOiXX(r4, r7, true) == false) goto L6;
            DeveloperOtaSelectBleNameActivity.access$getSearchList$p(r3).add(r4);
            goto L6
        L11:
            if (DeveloperOtaSelectBleNameActivity.access$getSearchList$p(this.IO).isEmpty() == false) goto L13;
            DeveloperOtaSelectBleNameActivity.access$getRecyclerView(this.IO).setVisibility(8);
            DeveloperOtaSelectBleNameActivity.access$getSelect_group_ll(this.IO).setVisibility(0);
        L16:
            CommonAdapter r8 = DeveloperOtaSelectBleNameActivity.access$getMRecyclerAdapter$p(this.IO);
            if (r8 == null) goto L20;
            r8.notifyDataSetChanged();
        L20:
            return false;
        L13:
            if (DeveloperOtaSelectBleNameActivity.access$getRecyclerView(this.IO).getVisibility() != 8) goto L16;
            DeveloperOtaSelectBleNameActivity.access$getRecyclerView(this.IO).setVisibility(0);
            DeveloperOtaSelectBleNameActivity.access$getSelect_group_ll(this.IO).setVisibility(8);
            goto L16
        L19:
            DeveloperOtaSelectBleNameActivity.access$getRecyclerView(this.IO).setVisibility(8);
            DeveloperOtaSelectBleNameActivity.access$getSelect_group_ll(this.IO).setVisibility(0);
            goto L20
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
        public boolean onQueryTextSubmit(String r2) {
            Intrinsics.X0O(r2, "query");
            return false;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperOtaSelectBleNameActivity$initView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends CommonAdapter<String> {
        final /* synthetic */ DeveloperOtaSelectBleNameActivity this$0;

        public AnonymousClass1(DeveloperOtaSelectBleNameActivity r2, ArrayList<String> r3) {
            this.this$0 = r2;
            super(r2, R.layout.simple_list_item_1, r3);
        }

        public static /* synthetic */ void OXO1(DeveloperOtaSelectBleNameActivity r0, String r1, View r2) {
            convert$lambda$0$0(r0, r1, r2);
        }

        private static final void convert$lambda$0$0(DeveloperOtaSelectBleNameActivity r1, String r2, View r3) {
            if (DeveloperOtaSelectBleNameActivity.access$getRecyclerView(r1).getVisibility() != 0) goto L5;
            DeveloperOtaSelectBleNameActivity.access$getRecyclerView(r1).setVisibility(8);
            DeveloperOtaSelectBleNameActivity.access$getSelect_group_ll(r1).setVisibility(0);
        L5:
            DeveloperOtaSelectBleNameActivity.access$getTvSelect(r1).setText(r2);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, String r2, int r3) {
            convert2(r1, r2, r3);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return DeveloperOtaSelectBleNameActivity.access$getSearchList$p(this.this$0).size();
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r3, final String r4, int r5) {
            Intrinsics.X0O(r3, "viewHolder");
            Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
            final DeveloperOtaSelectBleNameActivity r6 = this.this$0;
            r3.setText(R.id.text1, r4);
            r3.setOnClickListener(R.id.text1, new XX10OiI1(r6, r4));
        }
    }

    public DeveloperOtaSelectBleNameActivity() {
        this.tvSelectRemind$delegate = LazyKt__LazyJVMKt.iO(new iiO1Xi0(this));
        this.tvSelect$delegate = LazyKt__LazyJVMKt.iO(new I0OOO0OO(this));
        this.btNext$delegate = LazyKt__LazyJVMKt.iO(new O00XXII10(this));
        this.toolbar$delegate = LazyKt__LazyJVMKt.iO(new IX0XOXOOI(this));
        this.searchView$delegate = LazyKt__LazyJVMKt.iO(new i1OOI0(this));
        this.recyclerView$delegate = LazyKt__LazyJVMKt.iO(new iXOiI0XX0(this));
        this.select_group_ll$delegate = LazyKt__LazyJVMKt.iO(new iO101I0X(this));
        this.searchList = new ArrayList();
        this.dataList = new ArrayList();
    }

    public static /* synthetic */ FastScrollRecyclerView I0iXXO(DeveloperOtaSelectBleNameActivity r0) {
        return recyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(DeveloperOtaSelectBleNameActivity r0) {
        return tvSelect_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void IIX1OXO(DeveloperOtaSelectBleNameActivity r0, String r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Toolbar O10IXXX0X(DeveloperOtaSelectBleNameActivity r0) {
        return toolbar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AppCompatButton OIX0iXi(DeveloperOtaSelectBleNameActivity r0) {
        return btNext_delegate$lambda$0(r0);
    }

    public static /* synthetic */ MaterialSearchView X0O(DeveloperOtaSelectBleNameActivity r0) {
        return searchView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(DeveloperOtaSelectBleNameActivity r0) {
        return tvSelectRemind_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XXI(DeveloperOtaSelectBleNameActivity r0) {
        return select_group_ll_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ ArrayList access$getDataList$p(DeveloperOtaSelectBleNameActivity r0) {
        return r0.dataList;
    }

    public static final /* synthetic */ CommonAdapter access$getMRecyclerAdapter$p(DeveloperOtaSelectBleNameActivity r0) {
        return r0.mRecyclerAdapter;
    }

    public static final /* synthetic */ FastScrollRecyclerView access$getRecyclerView(DeveloperOtaSelectBleNameActivity r0) {
        return r0.getRecyclerView();
    }

    public static final /* synthetic */ ArrayList access$getSearchList$p(DeveloperOtaSelectBleNameActivity r0) {
        return r0.searchList;
    }

    public static final /* synthetic */ LinearLayout access$getSelect_group_ll(DeveloperOtaSelectBleNameActivity r0) {
        return r0.getSelect_group_ll();
    }

    public static final /* synthetic */ TextView access$getTvSelect(DeveloperOtaSelectBleNameActivity r0) {
        return r0.getTvSelect();
    }

    private static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (AppCompatButton) r1.findViewById(com.sma.smartv3.pro.R.id.bt_next);
    }

    private final AppCompatButton getBtNext() {
        return (AppCompatButton) getValue();
    }

    private final FastScrollRecyclerView getRecyclerView() {
        return (FastScrollRecyclerView) getValue();
    }

    private final MaterialSearchView getSearchView() {
        return (MaterialSearchView) getValue();
    }

    private final LinearLayout getSelect_group_ll() {
        return (LinearLayout) getValue();
    }

    private final Toolbar getToolbar() {
        return (Toolbar) getValue();
    }

    private final TextView getTvSelect() {
        return (TextView) getValue();
    }

    private final TextView getTvSelectRemind() {
        return (TextView) getValue();
    }

    private static final void initItem$lambda$0$0(DeveloperOtaSelectBleNameActivity r0, String r1, View r2) {
        r0.getTvSelect().setText(r1);
    }

    private static final FastScrollRecyclerView recyclerView_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (FastScrollRecyclerView) r1.findViewById(com.sma.smartv3.pro.R.id.recyclerView);
    }

    private static final MaterialSearchView searchView_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (MaterialSearchView) r1.findViewById(com.sma.smartv3.pro.R.id.search_view);
    }

    private static final LinearLayout select_group_ll_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (LinearLayout) r1.findViewById(com.sma.smartv3.pro.R.id.select_group_ll);
    }

    private final void setSearchIconColor(MenuItem r3, Integer r4) {
        if (r4 == null) goto L7;
        Drawable r0 = r3.getIcon();
        if (r0 == null) goto L8;
        Drawable r1 = DrawableCompat.wrap(r0);
        DrawableCompat.setTint(r1.mutate(), r4.intValue());
        r3.setIcon(r1);
        return;
    L8:
        return;
    }

    private static final Toolbar toolbar_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (Toolbar) r1.findViewById(com.sma.smartv3.pro.R.id.toolbar);
    }

    private static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (TextView) r1.findViewById(com.sma.smartv3.pro.R.id.tv_select_remind);
    }

    private static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectBleNameActivity r1) {
        return (TextView) r1.findViewById(com.sma.smartv3.pro.R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r5) {
        HashSet r6 = new HashSet();
        List<DeviceOnlineInfo> r0 = q62.OXO1.OXI0Xi();
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        r1.add(((DeviceOnlineInfo) r2.next()).getBleName());
        goto L4
    L6:
        r6.addAll(r1);
        q62 r3 = q62.OXO1;
        r6.addAll(r3.i0iIXiI());
        this.dataList.addAll(CollectionsKt___CollectionsKt.XIi(r6));
        LogUtils.d(new Object[]{"onlines:" + r1.size() + ", local:" + r3.i0iIXiI().size() + ", merge：" + this.dataList.size()});
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (String) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<String> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(com.sma.smartv3.pro.R.string.select_remind_select_bluetooth_name);
        setSupportActionBar(getToolbar());
        AnonymousClass1 r1 = new AnonymousClass1(this, this.searchList);
        getRecyclerView().setAdapter(r1);
        this.mRecyclerAdapter = r1;
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        getSearchView().X01IiOiIi(false);
        getSearchView().setOnQueryTextListener(new OXO1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_test_ota_select_blename_list;
    }

    public final void nextOnClick(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        if (getTvSelect().getText().toString().length() != 0) goto L6;
        ToastUtils.showLong(com.sma.smartv3.pro.R.string.select_remind_bluetooth_name);
        return;
    L6:
        getBtNext().setVisibility(8);
        ToastUtils.showLong("Network request, please wait", new Object[0]);
        NetWorkUtils r10 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getBleFirmwareAllListBody(getTvSelect().getText().toString());
        final O1XIiIO<BleFirmwareVersionInfoList> r2 = new C34771(this);
        final Activity r3 = null;
        final uq r4 = r10.loadPopup(null, null);
        String r5 = r10.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareList.URL);
        r10.printParam(r5 + BleFirmwareList.URL, r1);
        NetWork r11 = NetWork.OXO1;
        String r12 = r5 + BleFirmwareList.URL;
        final O1XIiIO<Response<BleFirmwareVersionInfoList>> r6 = new DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$1(r3, r2, r4);
        AndroidNetworking.post(r12).addBodyParameter(r1).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{BleFirmwareVersionInfoList.class}), new DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$2(r6));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@aa1 Menu r3) {
        Intrinsics.X0O(r3, "menu");
        getMenuInflater().inflate(com.sma.smartv3.pro.R.menu.pick_menu_main, r3);
        MenuItem r4 = r3.findItem(com.sma.smartv3.pro.R.id.mcp_action_search);
        Intrinsics.XXI(r4);
        setSearchIconColor(r4, Integer.valueOf(Color.parseColor("#333333")));
        getSearchView().setMenuItem(r4);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    public void initItem(@aa1 ug6 r2, @aa1 final String r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.text1, r3);
        r2.O10IXXX0X(R.id.text1, new IXIOXXi(this, r3));
    }
}
