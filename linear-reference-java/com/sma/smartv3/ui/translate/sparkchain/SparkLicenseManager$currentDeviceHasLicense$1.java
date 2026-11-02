package com.sma.smartv3.ui.translate.sparkchain;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetSparkAuthorize;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkLicenseManager$currentDeviceHasLicense$1", f = "SparkLicenseManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nSparkLicenseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkLicenseManager.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,99:1\n235#2,11:100\n246#2:112\n256#2:122\n1#3:111\n278#4,8:113\n298#4:121\n*S KotlinDebug\n*F\n+ 1 SparkLicenseManager.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1\n*L\n46#1:100,11\n46#1:112\n46#1:122\n46#1:111\n46#1:113,8\n46#1:121\n*E\n"})
public final class SparkLicenseManager$currentDeviceHasLicense$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SparkLicenseManager this$0;

    public SparkLicenseManager$currentDeviceHasLicense$1(SparkLicenseManager r1, Continuation<? super SparkLicenseManager$currentDeviceHasLicense$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new SparkLicenseManager$currentDeviceHasLicense$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((SparkLicenseManager$currentDeviceHasLicense$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r12) {
        pb.I0iXXO();
        if (this.label != 0) goto L11;
        ResultKt.X1ii(r12);
        if (SparkLicenseManager.iO(this.this$0).get() == true) goto L7;
        SparkLicenseManager.iO(this.this$0).set(false);
        NetWorkUtils r13 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getSparkAuthorizeBody();
        final SparkLicenseManager r3 = this.this$0;
        final O1XIiIO<Boolean> r2 = new AnonymousClass1(r3);
        Map<String, String> r4 = r13.getHeadersMap();
        final Activity r5 = null;
        final uq r6 = r13.loadPopup(null, null);
        String r7 = r13.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetSparkAuthorize.URL);
        String r8 = r7 + GetSparkAuthorize.URL;
        Map<String, ? extends Object> r9 = kotlin.collections.OXO1.X111IO(r1);
        r9.putAll(r4);
        Unit r10 = Unit.OXO1;
        r13.printParam(r8, r9);
        NetWork r14 = NetWork.OXO1;
        String r15 = r7 + GetSparkAuthorize.URL;
        final O1XIiIO<Response<Boolean>> r11 = new SparkLicenseManager$currentDeviceHasLicense$1$invokeSuspend$$inlined$postV2$default$1(r5, r2, r6);
        AndroidNetworking.post(r15).addHeaders(r4).addBodyParameter(r1).setTag(r15).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Boolean.class}), new SparkLicenseManager$currentDeviceHasLicense$1$invokeSuspend$$inlined$postV2$default$2(r11));
        return r10;
    L7:
        return Unit.OXO1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
