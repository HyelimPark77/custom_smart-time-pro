package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.BleFirmwareInfo;
import com.sma.smartv3.model.ExtraPackageDataList;
import com.sma.smartv3.model.FirmwareVersion;
import com.sma.smartv3.model.FirmwareVersionList;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleExtraPackVersionList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.p612me.DeveloperOtaSelectFirmwareActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectFirmwareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n19#2:107\n15#2:108\n19#2:109\n15#2:110\n11#2,2:140\n176#3,11:111\n196#3:130\n252#4,7:122\n270#4:129\n69#5,3:131\n72#5,5:135\n1#6:134\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectFirmwareActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity\n*L\n39#1:107\n39#1:108\n41#1:109\n41#1:110\n64#1:140,2\n80#1:111,11\n80#1:130\n80#1:122,7\n80#1:129\n101#1:131,3\n101#1:135,5\n101#1:134\n*E\n"})
public final class DeveloperOtaSelectFirmwareActivity extends BaseListActivity<FirmwareVersion> {
    private ArrayList<FirmwareVersion> dataList;
    private int firmwareID;

    @aa1
    private final Lazy tvSelectRemind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOI10X0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectFirmwareActivity.tvSelectRemind_delegate$lambda$0(this.f8059IO);
        }
    });

    @aa1
    private final Lazy tvSelect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXO0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectFirmwareActivity.tvSelect_delegate$lambda$0(this.f8343IO);
        }
    });

    @aa1
    private final Lazy btNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1ii11Xi0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectFirmwareActivity.btNext_delegate$lambda$0(this.f7729IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectFirmwareActivity developerOtaSelectFirmwareActivity) {
        return (AppCompatButton) developerOtaSelectFirmwareActivity.findViewById(R.id.bt_next);
    }

    private final AppCompatButton getBtNext() {
        return (AppCompatButton) this.btNext$delegate.getValue();
    }

    private final TextView getTvSelect() {
        return (TextView) this.tvSelect$delegate.getValue();
    }

    private final TextView getTvSelectRemind() {
        return (TextView) this.tvSelectRemind$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0$0(DeveloperOtaSelectFirmwareActivity developerOtaSelectFirmwareActivity, FirmwareVersion firmwareVersion, View view) {
        developerOtaSelectFirmwareActivity.getTvSelect().setText(firmwareVersion.getVersion() + "  -- " + firmwareVersion.getInfo());
        a01.OXO1.XIi00iiXO().put(FirmwareVersion.class.getName(), new Gson().toJson(firmwareVersion));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectFirmwareActivity developerOtaSelectFirmwareActivity) {
        return (TextView) developerOtaSelectFirmwareActivity.findViewById(R.id.tv_select_remind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectFirmwareActivity developerOtaSelectFirmwareActivity) {
        return (TextView) developerOtaSelectFirmwareActivity.findViewById(R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsXIi00iiXO = a01Var.XIi00iiXO();
        Object firmwareVersionList = new FirmwareVersionList(0, null, 3, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(FirmwareVersionList.class.getName()), (Class<Object>) FirmwareVersionList.class);
        if (objFromJson != null) {
            firmwareVersionList = objFromJson;
        }
        this.dataList = ((FirmwareVersionList) firmwareVersionList).getData();
        SPUtils sPUtilsXIi00iiXO2 = a01Var.XIi00iiXO();
        Object bleFirmwareInfo = new BleFirmwareInfo(0, 0, null, null, null, 31, null);
        Object objFromJson2 = new Gson().fromJson(sPUtilsXIi00iiXO2.getString(BleFirmwareInfo.class.getName()), (Class<Object>) BleFirmwareInfo.class);
        if (objFromJson2 != null) {
            bleFirmwareInfo = objFromJson2;
        }
        this.firmwareID = ((BleFirmwareInfo) bleFirmwareInfo).getId();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<FirmwareVersion> initList() {
        ArrayList<FirmwareVersion> arrayList = this.dataList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.XXO("dataList");
        return null;
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(R.string.select_remind_firmware_info);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return android.R.layout.simple_list_item_1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_test_ota_select_version_list;
    }

    public final void nextOnClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getBtNext().setVisibility(8);
        int i = a01.OXO1.XIi00iiXO().getInt(b01.X11iII1O1);
        if (i != 0) {
            if (i != 1 && i != 2 && i != 4) {
                if (i != 5) {
                    if (i != 6 && i != 7) {
                        return;
                    }
                }
            }
            startActivity(new Intent(this, (Class<?>) DeveloperOtaStartActivity.class));
            return;
        }
        ToastUtils.showLong("Network request, please wait", new Object[0]);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> bleFirmwareVersionListBody = RequestBodyKt.getBleFirmwareVersionListBody(String.valueOf(this.firmwareID));
        final O1XIiIO<ExtraPackageDataList> o1XIiIO = new O1XIiIO<ExtraPackageDataList>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectFirmwareActivity.nextOnClick.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(ExtraPackageDataList extraPackageDataList) {
                a01.OXO1.XIi00iiXO().put(ExtraPackageDataList.class.getName(), new Gson().toJson(extraPackageDataList));
                if (extraPackageDataList == null || extraPackageDataList.getTotal() != 0) {
                    DeveloperOtaSelectFirmwareActivity developerOtaSelectFirmwareActivity = DeveloperOtaSelectFirmwareActivity.this;
                    developerOtaSelectFirmwareActivity.startActivity(new Intent(developerOtaSelectFirmwareActivity, (Class<?>) DeveloperOtaSelectExtraPackageUIActivity.class));
                } else {
                    DeveloperOtaSelectFirmwareActivity developerOtaSelectFirmwareActivity2 = DeveloperOtaSelectFirmwareActivity.this;
                    developerOtaSelectFirmwareActivity2.startActivity(new Intent(developerOtaSelectFirmwareActivity2, (Class<?>) DeveloperOtaStartActivity.class));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(R.string.already_the_latest_version);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleExtraPackVersionList.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleExtraPackVersionList.URL, bleFirmwareVersionListBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleExtraPackVersionList.URL;
        final O1XIiIO<Response<ExtraPackageDataList>> o1XIiIO2 = new O1XIiIO<Response<ExtraPackageDataList>>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<ExtraPackageDataList> response) {
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) bleFirmwareVersionListBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, ExtraPackageDataList.class), new ParsedRequestListener<Response<ExtraPackageDataList>>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectFirmwareActivity$nextOnClick$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<ExtraPackageDataList> response) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getBtNext().setVisibility(0);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 final FirmwareVersion item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(android.R.id.text1, "firmwareVersion:" + item.getVersion() + "\nfileName:" + item.getFileName() + "\ninfo:" + item.getInfo());
        holder.O10IXXX0X(android.R.id.text1, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1XiOiI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeveloperOtaSelectFirmwareActivity.initItem$lambda$0$0(this.f2820IO, item, view);
            }
        });
    }
}
