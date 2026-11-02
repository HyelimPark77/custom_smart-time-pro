package com.sma.smartv3.p610ui.p612me;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I0101;
import com.android.mltcode.paycertificationapi.IX00X0iX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XOIO10IIO;
import com.android.mltcode.paycertificationapi.XOi01OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.j36;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.p057io.Location;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.p610ui.p612me.DeveloperTuyaQueryActivity;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperTuyaQueryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,268:1\n176#2,11:269\n196#2:288\n176#2,11:289\n196#2:308\n176#2,11:309\n196#2:328\n252#3,7:280\n270#3:287\n252#3,7:300\n270#3:307\n252#3,7:320\n270#3:327\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity\n*L\n143#1:269,11\n143#1:288\n178#1:289,11\n178#1:308\n222#1:309,11\n222#1:328\n143#1:280,7\n143#1:287\n178#1:300,7\n178#1:307\n222#1:320,7\n222#1:327\n*E\n"})
public final class DeveloperTuyaQueryActivity extends BaseActivity {

    @tb1
    private C3006uq mLoadingPopup;
    private String mMac;
    private String mName;

    @tb1
    private dj4 mPopup;

    @aa1
    private final Lazy tvInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiXIIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaQueryActivity.tvInfo_delegate$lambda$0(this.f3780IO);
        }
    });

    @aa1
    private final Lazy tvState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0IOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaQueryActivity.tvState_delegate$lambda$0(this.f2453IO);
        }
    });

    @aa1
    private final Lazy btnOperate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXI11X01O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaQueryActivity.btnOperate_delegate$lambda$0(this.f3454IO);
        }
    });

    @aa1
    private final Lazy tvCount$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXIXXX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaQueryActivity.tvCount_delegate$lambda$0(this.f8330IO);
        }
    });

    @aa1
    private final List<String> list = CollectionsKt__CollectionsKt.Ii1iii0("0-主板烧录", "1-产线一检", "2-产线二检", "3-包装", "99-恢复默认状态（全部状态置为0）");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnOperate_delegate$lambda$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity) {
        return (Button) developerTuyaQueryActivity.findViewById(R.id.btn_operate);
    }

    private final Button getBtnOperate() {
        return (Button) this.btnOperate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMNow() {
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getShareFile(String str) {
        return sz0.OXO1.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvCount() {
        return (TextView) this.tvCount$delegate.getValue();
    }

    private final TextView getTvInfo() {
        return (TextView) this.tvInfo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTvState() {
        return (TextView) this.tvState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExportCsv$lambda$0$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity) {
        developerTuyaQueryActivity.export();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onOperate$lambda$0$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity, int i) {
        developerTuyaQueryActivity.getBtnOperate().setText("当前：\n" + ((Object) developerTuyaQueryActivity.list.get(i)));
        a01.OXO1.XIi00iiXO().put(IX00X0iX.OXO1, i);
        developerTuyaQueryActivity.queryCount(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onQuery$lambda$0$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity) {
        int i = a01.OXO1.XIi00iiXO().getInt(IX00X0iX.OXO1, 0);
        if (i == 4) {
            developerTuyaQueryActivity.query(99);
            return true;
        }
        developerTuyaQueryActivity.query(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCount_delegate$lambda$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity) {
        return (TextView) developerTuyaQueryActivity.findViewById(R.id.tvCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvInfo_delegate$lambda$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity) {
        return (TextView) developerTuyaQueryActivity.findViewById(R.id.tvInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvState_delegate$lambda$0(DeveloperTuyaQueryActivity developerTuyaQueryActivity) {
        return (TextView) developerTuyaQueryActivity.findViewById(R.id.tvState);
    }

    public final void export() {
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(getMContext());
            c3006uq.I0iXXO(false);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        String str = this.mName;
        final Activity activity = null;
        if (str == null) {
            Intrinsics.XXO("mName");
            str = null;
        }
        map.put("bleName", str);
        final O1XIiIO<j36[]> o1XIiIO = new O1XIiIO<j36[]>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity.export.3
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(j36[] j36VarArr) {
                if (j36VarArr == null || j36VarArr.length == 0) {
                    C3006uq c3006uq3 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                    if (c3006uq3 != null) {
                        c3006uq3.dismiss();
                    }
                    ToastUtils.showLong("没有数据", new Object[0]);
                    return;
                }
                DeveloperTuyaQueryActivity developerTuyaQueryActivity = DeveloperTuyaQueryActivity.this;
                File shareFile = developerTuyaQueryActivity.getShareFile(developerTuyaQueryActivity.getMNow() + ".csv");
                FileUtils.createOrExistsFile(shareFile);
                StringBuilder sb = new StringBuilder();
                sb.append("id,bleName,mac,uuid,tuYaKey,info\n");
                for (j36 j36Var : j36VarArr) {
                    sb.append(j36Var.getId() + I000IiI1O.C2156iO.XO0O10 + j36Var.getBleName() + I000IiI1O.C2156iO.XO0O10 + j36Var.getMac() + I000IiI1O.C2156iO.XO0O10 + j36Var.getUuid() + I000IiI1O.C2156iO.XO0O10 + j36Var.m2361iO() + I000IiI1O.C2156iO.XO0O10 + oe5.IXO0OOi(j36Var.getInfo(), I000IiI1O.C2156iO.XO0O10, " ", false, 4, null) + "\n");
                }
                FileIOUtils.writeFileFromString(shareFile, sb.toString());
                C3006uq c3006uq4 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                if (c3006uq4 != null) {
                    c3006uq4.dismiss();
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", "Share Csv");
                intent.putExtra("android.intent.extra.STREAM", sz0.OXO1.XO0O10(shareFile));
                intent.setType("*/*");
                DeveloperTuyaQueryActivity.this.startActivity(Intent.createChooser(intent, "Share Csv"));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(error, new Object[0]);
                C3006uq c3006uq3 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), I0101.XIi00iiXO);
        netWorkUtils.printParam(strConvertBaseUrl + I0101.XIi00iiXO, map);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + I0101.XIi00iiXO;
        final O1XIiIO<Response<j36[]>> o1XIiIO2 = new O1XIiIO<Response<j36[]>>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity$export$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<j36[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq3 = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) map).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, j36[].class), new ParsedRequestListener<Response<j36[]>>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity$export$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<j36[]> response) {
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        this.mName = String.valueOf(getIntent().getStringExtra("name"));
        this.mMac = String.valueOf(getIntent().getStringExtra("mac"));
        TextView tvInfo = getTvInfo();
        String str = this.mName;
        String str2 = null;
        if (str == null) {
            Intrinsics.XXO("mName");
            str = null;
        }
        String str3 = this.mMac;
        if (str3 == null) {
            Intrinsics.XXO("mMac");
        } else {
            str2 = str3;
        }
        tvInfo.setText("蓝牙名\n" + str + "\n\n\n地址\n" + str2);
        Button btnOperate = getBtnOperate();
        List<String> list = this.list;
        a01 a01Var = a01.OXO1;
        btnOperate.setText("当前：\n" + ((Object) list.get(a01Var.XIi00iiXO().getInt(IX00X0iX.OXO1, 0))));
        queryCount(a01Var.XIi00iiXO().getInt(IX00X0iX.OXO1, 0));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_test_tuya_query;
    }

    public final void onExportCsv(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        go0 go0Var = new go0(this, 0, 2, null);
        go0Var.m1864iI("是否导出数据？");
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIiIXO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeveloperTuyaQueryActivity.onExportCsv$lambda$0$0(this.f3239IO));
            }
        });
        go0Var.X0O(R.id.root_view);
    }

    public final void onOperate(@aa1 View view) {
        DeveloperTuyaQueryActivity developerTuyaQueryActivity;
        Intrinsics.X0O(view, "view");
        if (this.mPopup == null) {
            developerTuyaQueryActivity = this;
            dj4 dj4Var = new dj4(developerTuyaQueryActivity, this.list, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1i1X
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(DeveloperTuyaQueryActivity.onOperate$lambda$0$0(this.f2837IO, ((Integer) obj).intValue()));
                }
            });
            developerTuyaQueryActivity.mPopup = dj4Var;
        } else {
            developerTuyaQueryActivity = this;
        }
        dj4 dj4Var2 = developerTuyaQueryActivity.mPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(a01.OXO1.XIi00iiXO().getInt(IX00X0iX.OXO1, 0));
            dj4Var2.X0O(R.id.root_view);
        }
    }

    public final void onQuery(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        go0 go0Var = new go0(this, 0, 2, null);
        go0Var.m1864iI("当前：\n" + ((Object) this.list.get(a01.OXO1.XIi00iiXO().getInt(IX00X0iX.OXO1, 0))));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.X1OI1IIiO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(DeveloperTuyaQueryActivity.onQuery$lambda$0$0(this.f4300IO));
            }
        });
        go0Var.X0O(R.id.root_view);
    }

    public final void query(int i) {
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(getMContext());
            c3006uq.I0iXXO(false);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        String str = this.mName;
        final Activity activity = null;
        if (str == null) {
            Intrinsics.XXO("mName");
            str = null;
        }
        map.put("bleName", str);
        String str2 = this.mMac;
        if (str2 == null) {
            Intrinsics.XXO("mMac");
            str2 = null;
        }
        map.put("mac", str2);
        map.put("queryStep", String.valueOf(i));
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity.query.3
            /* JADX WARN: Code duplicated, block: B:35:0x005d  */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str3) {
                String str4;
                TextView tvState = DeveloperTuyaQueryActivity.this.getTvState();
                if (str3 == null) {
                    str4 = "未知";
                } else {
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 48) {
                        if (iHashCode != 49) {
                            if (iHashCode != 1444) {
                                if (iHashCode != 1445) {
                                    if (iHashCode == 1824 && str3.equals("99")) {
                                        str4 = "恢复了默认状态";
                                    } else {
                                        str4 = "未知";
                                    }
                                } else if (str3.equals("-2")) {
                                    str4 = "不支持";
                                } else {
                                    str4 = "未知";
                                }
                            } else if (str3.equals("-1")) {
                                str4 = "不存在授权码";
                            } else {
                                str4 = "未知";
                            }
                        } else if (str3.equals("1")) {
                            str4 = "标记成功";
                        } else {
                            str4 = "未知";
                        }
                    } else if (str3.equals("0")) {
                        str4 = "已被标记";
                    } else {
                        str4 = "未知";
                    }
                }
                tvState.setText(str3 + CertificateUtil.DELIMITER + str4);
                C3006uq c3006uq3 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(error, new Object[0]);
                C3006uq c3006uq3 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), XOIO10IIO.XIi00iiXO);
        netWorkUtils.printParam(strConvertBaseUrl + XOIO10IIO.XIi00iiXO, map);
        NetWork netWork = NetWork.OXO1;
        String str3 = strConvertBaseUrl + XOIO10IIO.XIi00iiXO;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity$query$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq3 = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str3).addBodyParameter((Map<String, String>) map).setTag((Object) str3).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity$query$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
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

    public final void queryCount(int i) {
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(getMContext());
            c3006uq.I0iXXO(false);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap map = new HashMap();
        String str = this.mName;
        final Activity activity = null;
        if (str == null) {
            Intrinsics.XXO("mName");
            str = null;
        }
        map.put("bleName", str);
        map.put("queryStep", i == 4 ? "99" : String.valueOf(i));
        final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity.queryCount.3
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str2) {
                if (str2 != null) {
                    int i2 = Integer.parseInt((String) StringsKt__StringsKt.i1I(str2, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null).get(0));
                    int i3 = Integer.parseInt((String) StringsKt__StringsKt.i1I(str2, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null).get(1));
                    DeveloperTuyaQueryActivity.this.getTvCount().setText("已使用：" + i2 + "，未使用：" + (i3 - i2) + "，总数：" + i3);
                }
                C3006uq c3006uq3 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(error, new Object[0]);
                C3006uq c3006uq3 = DeveloperTuyaQueryActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), XOi01OiO.XIi00iiXO);
        netWorkUtils.printParam(strConvertBaseUrl + XOi01OiO.XIi00iiXO, map);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + XOi01OiO.XIi00iiXO;
        final O1XIiIO<Response<String>> o1XIiIO2 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq3 = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) map).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.ui.me.DeveloperTuyaQueryActivity$queryCount$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<String> response) {
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
}
