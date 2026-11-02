package com.sma.smartv3.p610ui.p612me;

import android.R;
import android.app.Activity;
import android.content.Intent;
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
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
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
import com.sma.smartv3.p610ui.p612me.DeveloperOtaSelectBleNameActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,193:1\n1563#2:194\n1634#2,3:195\n176#3,11:198\n196#3:217\n252#4,7:209\n270#4:216\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity\n*L\n52#1:194\n52#1:195,3\n174#1:198,11\n174#1:217\n174#1:209,7\n174#1:216\n*E\n"})
public final class DeveloperOtaSelectBleNameActivity extends BaseListActivity<String> {

    @tb1
    private CommonAdapter<String> mRecyclerAdapter;

    @aa1
    private final Lazy tvSelectRemind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiO1Xi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.tvSelectRemind_delegate$lambda$0(this.f8601IO);
        }
    });

    @aa1
    private final Lazy tvSelect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0OOO0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.tvSelect_delegate$lambda$0(this.f1166IO);
        }
    });

    @aa1
    private final Lazy btNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00XXII10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.btNext_delegate$lambda$0(this.f2383IO);
        }
    });

    @aa1
    private final Lazy toolbar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX0XOXOOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.toolbar_delegate$lambda$0(this.f1948IO);
        }
    });

    @aa1
    private final Lazy searchView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OOI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.searchView_delegate$lambda$0(this.f7627IO);
        }
    });

    @aa1
    private final Lazy recyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXOiI0XX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.recyclerView_delegate$lambda$0(this.f8375IO);
        }
    });

    @aa1
    private final Lazy select_group_ll$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO101I0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectBleNameActivity.select_group_ll_delegate$lambda$0(this.f8019IO);
        }
    });

    @aa1
    private final ArrayList<String> searchList = new ArrayList<>();

    @aa1
    private ArrayList<String> dataList = new ArrayList<>();

    @SourceDebugExtension({"SMAP\nDeveloperOtaSelectBleNameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1869#2,2:194\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectBleNameActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectBleNameActivity$initView$3\n*L\n103#1:194,2\n*E\n"})
    public static final class OXO1 implements MaterialSearchView.I0IIOi {
        public OXO1() {
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
        public boolean onQueryTextChange(String newText) {
            Intrinsics.X0O(newText, "newText");
            LogUtils.m11128d("onQueryTextChange => " + newText);
            DeveloperOtaSelectBleNameActivity.this.searchList.clear();
            if (TextUtils.isEmpty(newText)) {
                DeveloperOtaSelectBleNameActivity.this.getRecyclerView().setVisibility(8);
                DeveloperOtaSelectBleNameActivity.this.getSelect_group_ll().setVisibility(0);
            } else {
                ArrayList<String> arrayList = DeveloperOtaSelectBleNameActivity.this.dataList;
                DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity = DeveloperOtaSelectBleNameActivity.this;
                for (String str : arrayList) {
                    if (StringsKt__StringsKt.iOiXX(str, newText, true)) {
                        developerOtaSelectBleNameActivity.searchList.add(str);
                    }
                }
                if (DeveloperOtaSelectBleNameActivity.this.searchList.isEmpty()) {
                    DeveloperOtaSelectBleNameActivity.this.getRecyclerView().setVisibility(8);
                    DeveloperOtaSelectBleNameActivity.this.getSelect_group_ll().setVisibility(0);
                } else if (DeveloperOtaSelectBleNameActivity.this.getRecyclerView().getVisibility() == 8) {
                    DeveloperOtaSelectBleNameActivity.this.getRecyclerView().setVisibility(0);
                    DeveloperOtaSelectBleNameActivity.this.getSelect_group_ll().setVisibility(8);
                }
                CommonAdapter commonAdapter = DeveloperOtaSelectBleNameActivity.this.mRecyclerAdapter;
                if (commonAdapter != null) {
                    commonAdapter.notifyDataSetChanged();
                }
            }
            return false;
        }

        @Override // com.miguelcatalan.materialsearchview.MaterialSearchView.I0IIOi
        public boolean onQueryTextSubmit(String query) {
            Intrinsics.X0O(query, "query");
            return false;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperOtaSelectBleNameActivity$initView$1 */
    public static final class C188951 extends CommonAdapter<String> {
        public C188951(ArrayList<String> arrayList) {
            super(DeveloperOtaSelectBleNameActivity.this, R.layout.simple_list_item_1, arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity, String str, View view) {
            if (developerOtaSelectBleNameActivity.getRecyclerView().getVisibility() == 0) {
                developerOtaSelectBleNameActivity.getRecyclerView().setVisibility(8);
                developerOtaSelectBleNameActivity.getSelect_group_ll().setVisibility(0);
            }
            developerOtaSelectBleNameActivity.getTvSelect().setText(str);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return DeveloperOtaSelectBleNameActivity.this.searchList.size();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder viewHolder, final String item, int i) {
            Intrinsics.X0O(viewHolder, "viewHolder");
            Intrinsics.X0O(item, "item");
            final DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity = DeveloperOtaSelectBleNameActivity.this;
            viewHolder.setText(R.id.text1, item);
            viewHolder.setOnClickListener(R.id.text1, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XX10OiI1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeveloperOtaSelectBleNameActivity.C188951.convert$lambda$0$0(developerOtaSelectBleNameActivity, item, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (AppCompatButton) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.bt_next);
    }

    private final AppCompatButton getBtNext() {
        return (AppCompatButton) this.btNext$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FastScrollRecyclerView getRecyclerView() {
        return (FastScrollRecyclerView) this.recyclerView$delegate.getValue();
    }

    private final MaterialSearchView getSearchView() {
        return (MaterialSearchView) this.searchView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout getSelect_group_ll() {
        return (LinearLayout) this.select_group_ll$delegate.getValue();
    }

    private final Toolbar getToolbar() {
        return (Toolbar) this.toolbar$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvSelect() {
        return (TextView) this.tvSelect$delegate.getValue();
    }

    private final TextView getTvSelectRemind() {
        return (TextView) this.tvSelectRemind$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity, String str, View view) {
        developerOtaSelectBleNameActivity.getTvSelect().setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FastScrollRecyclerView recyclerView_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (FastScrollRecyclerView) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialSearchView searchView_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (MaterialSearchView) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.search_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout select_group_ll_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (LinearLayout) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.select_group_ll);
    }

    private final void setSearchIconColor(MenuItem menuItem, Integer num) {
        Drawable icon;
        if (num == null || (icon = menuItem.getIcon()) == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(icon);
        DrawableCompat.setTint(drawableWrap.mutate(), num.intValue());
        menuItem.setIcon(drawableWrap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Toolbar toolbar_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (Toolbar) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.toolbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (TextView) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.tv_select_remind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity) {
        return (TextView) developerOtaSelectBleNameActivity.findViewById(com.sma.smartv3.pro.R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        HashSet hashSet = new HashSet();
        List<DeviceOnlineInfo> listOXI0Xi = q62.OXO1.OXI0Xi();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listOXI0Xi, 10));
        Iterator<T> it = listOXI0Xi.iterator();
        while (it.hasNext()) {
            arrayList.add(((DeviceOnlineInfo) it.next()).getBleName());
        }
        hashSet.addAll(arrayList);
        q62 q62Var = q62.OXO1;
        hashSet.addAll(q62Var.i0iIXiI());
        this.dataList.addAll(CollectionsKt___CollectionsKt.XIi(hashSet));
        LogUtils.m11128d("onlines:" + arrayList.size() + ", local:" + q62Var.i0iIXiI().size() + ", merge：" + this.dataList.size());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<String> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(com.sma.smartv3.pro.R.string.select_remind_select_bluetooth_name);
        setSupportActionBar(getToolbar());
        C188951 c188951 = new C188951(this.searchList);
        getRecyclerView().setAdapter(c188951);
        this.mRecyclerAdapter = c188951;
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        getSearchView().X01IiOiIi(false);
        getSearchView().setOnQueryTextListener(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_test_ota_select_blename_list;
    }

    public final void nextOnClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getTvSelect().getText().toString().length() == 0) {
            ToastUtils.showLong(com.sma.smartv3.pro.R.string.select_remind_bluetooth_name);
            return;
        }
        getBtNext().setVisibility(8);
        ToastUtils.showLong("Network request, please wait", new Object[0]);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> bleFirmwareAllListBody = RequestBodyKt.getBleFirmwareAllListBody(getTvSelect().getText().toString());
        final O1XIiIO<BleFirmwareVersionInfoList> o1XIiIO = new O1XIiIO<BleFirmwareVersionInfoList>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectBleNameActivity.nextOnClick.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BleFirmwareVersionInfoList bleFirmwareVersionInfoList) {
                a01.OXO1.XIi00iiXO().put(BleFirmwareVersionInfoList.class.getName(), new Gson().toJson(bleFirmwareVersionInfoList));
                DeveloperOtaSelectBleNameActivity developerOtaSelectBleNameActivity = DeveloperOtaSelectBleNameActivity.this;
                developerOtaSelectBleNameActivity.startActivity(new Intent(developerOtaSelectBleNameActivity, (Class<?>) DeveloperOtaSelectDeviceModeActivity.class));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(com.sma.smartv3.pro.R.string.already_the_latest_version);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareList.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleFirmwareList.URL, bleFirmwareAllListBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleFirmwareList.URL;
        final O1XIiIO<Response<BleFirmwareVersionInfoList>> o1XIiIO2 = new O1XIiIO<Response<BleFirmwareVersionInfoList>>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<BleFirmwareVersionInfoList> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) bleFirmwareAllListBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, BleFirmwareVersionInfoList.class), new ParsedRequestListener<Response<BleFirmwareVersionInfoList>>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectBleNameActivity$nextOnClick$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<BleFirmwareVersionInfoList> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@aa1 Menu menu) {
        Intrinsics.X0O(menu, "menu");
        getMenuInflater().inflate(com.sma.smartv3.pro.R.menu.pick_menu_main, menu);
        MenuItem menuItemFindItem = menu.findItem(com.sma.smartv3.pro.R.id.mcp_action_search);
        Intrinsics.XXI(menuItemFindItem);
        setSearchIconColor(menuItemFindItem, Integer.valueOf(Color.parseColor("#333333")));
        getSearchView().setMenuItem(menuItemFindItem);
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 final String item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(R.id.text1, item);
        holder.O10IXXX0X(R.id.text1, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.IXIOXXi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeveloperOtaSelectBleNameActivity.initItem$lambda$0$0(this.f2019IO, item, view);
            }
        });
    }
}
