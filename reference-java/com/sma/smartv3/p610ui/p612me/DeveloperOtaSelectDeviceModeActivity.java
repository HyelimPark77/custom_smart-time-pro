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
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.BleFirmwareInfo;
import com.sma.smartv3.model.BleFirmwareVersionInfoList;
import com.sma.smartv3.model.FirmwareVersionList;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleFirmwareVersionList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.p612me.DeveloperOtaSelectDeviceModeActivity;
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
@SourceDebugExtension({"SMAP\nDeveloperOtaSelectDeviceModeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,94:1\n19#2:95\n15#2:96\n11#2,2:117\n176#3,11:97\n196#3:116\n252#4,7:108\n270#4:115\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity\n*L\n37#1:95\n37#1:96\n60#1:117,2\n75#1:97,11\n75#1:116\n75#1:108,7\n75#1:115\n*E\n"})
public final class DeveloperOtaSelectDeviceModeActivity extends BaseListActivity<BleFirmwareInfo> {
    private ArrayList<BleFirmwareInfo> dataList;
    private int firmwareID;

    @aa1
    private final Lazy tvSelectRemind$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOI00IIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectDeviceModeActivity.tvSelectRemind_delegate$lambda$0(this.f8055IO);
        }
    });

    @aa1
    private final Lazy tvSelect$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXOI1O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectDeviceModeActivity.tvSelect_delegate$lambda$0(this.f8359IO);
        }
    });

    @aa1
    private final Lazy btNext$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOI1iiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperOtaSelectDeviceModeActivity.btNext_delegate$lambda$0(this.f3217IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatButton btNext_delegate$lambda$0(DeveloperOtaSelectDeviceModeActivity developerOtaSelectDeviceModeActivity) {
        return (AppCompatButton) developerOtaSelectDeviceModeActivity.findViewById(R.id.bt_next);
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
    public static final void initItem$lambda$0$0(DeveloperOtaSelectDeviceModeActivity developerOtaSelectDeviceModeActivity, BleFirmwareInfo bleFirmwareInfo, View view) {
        developerOtaSelectDeviceModeActivity.firmwareID = bleFirmwareInfo.getId();
        developerOtaSelectDeviceModeActivity.getTvSelect().setText(bleFirmwareInfo.getBleName() + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + bleFirmwareInfo.getFlag() + HelpFormatter.DEFAULT_LONG_OPT_PREFIX + bleFirmwareInfo.getRemark());
        a01.OXO1.XIi00iiXO().put(BleFirmwareInfo.class.getName(), new Gson().toJson(bleFirmwareInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelectRemind_delegate$lambda$0(DeveloperOtaSelectDeviceModeActivity developerOtaSelectDeviceModeActivity) {
        return (TextView) developerOtaSelectDeviceModeActivity.findViewById(R.id.tv_select_remind);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSelect_delegate$lambda$0(DeveloperOtaSelectDeviceModeActivity developerOtaSelectDeviceModeActivity) {
        return (TextView) developerOtaSelectDeviceModeActivity.findViewById(R.id.tv_select);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        Object bleFirmwareVersionInfoList = new BleFirmwareVersionInfoList(0, null, 3, null);
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(BleFirmwareVersionInfoList.class.getName()), (Class<Object>) BleFirmwareVersionInfoList.class);
        if (objFromJson != null) {
            bleFirmwareVersionInfoList = objFromJson;
        }
        this.dataList = ((BleFirmwareVersionInfoList) bleFirmwareVersionInfoList).getData();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<BleFirmwareInfo> initList() {
        ArrayList<BleFirmwareInfo> arrayList = this.dataList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.XXO("dataList");
        return null;
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTvSelectRemind().setText(R.string.select_remind_firmware_mode);
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
        if (this.firmwareID == 0) {
            ToastUtils.showLong(R.string.check_firmware_mode);
            return;
        }
        getBtNext().setVisibility(8);
        ToastUtils.showLong("Network request, please wait", new Object[0]);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> bleFirmwareVersionListBody = RequestBodyKt.getBleFirmwareVersionListBody(String.valueOf(this.firmwareID));
        final O1XIiIO<FirmwareVersionList> o1XIiIO = new O1XIiIO<FirmwareVersionList>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectDeviceModeActivity.nextOnClick.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(FirmwareVersionList firmwareVersionList) {
                a01.OXO1.XIi00iiXO().put(FirmwareVersionList.class.getName(), new Gson().toJson(firmwareVersionList));
                DeveloperOtaSelectDeviceModeActivity developerOtaSelectDeviceModeActivity = DeveloperOtaSelectDeviceModeActivity.this;
                developerOtaSelectDeviceModeActivity.startActivity(new Intent(developerOtaSelectDeviceModeActivity, (Class<?>) DeveloperOtaSelectFirmwareActivity.class));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(R.string.already_the_latest_version);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BleFirmwareVersionList.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BleFirmwareVersionList.URL, bleFirmwareVersionListBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BleFirmwareVersionList.URL;
        final O1XIiIO<Response<FirmwareVersionList>> o1XIiIO2 = new O1XIiIO<Response<FirmwareVersionList>>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectDeviceModeActivity$nextOnClick$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<FirmwareVersionList> response) {
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) bleFirmwareVersionListBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, FirmwareVersionList.class), new ParsedRequestListener<Response<FirmwareVersionList>>() { // from class: com.sma.smartv3.ui.me.DeveloperOtaSelectDeviceModeActivity$nextOnClick$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<FirmwareVersionList> response) {
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
    public void initItem(@aa1 ug6 holder, @aa1 final BleFirmwareInfo item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(android.R.id.text1, "id:" + item.getId() + "\nbleName:" + item.getBleName() + "\nflag:" + item.getFlag() + "\nremark:" + item.getRemark());
        holder.O10IXXX0X(android.R.id.text1, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XX1O00Xi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeveloperOtaSelectDeviceModeActivity.initItem$lambda$0$0(this.f4988IO, item, view);
            }
        });
    }
}
