package com.sma.smartv3.biz.fitness_site.fitbit;

import android.content.Context;
import com.android.mltcode.paycertificationapi.XXI0Xi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cd1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.os0;
import com.android.mltcode.paycertificationapi.tb1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.ironsource.G5;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WorkoutIndexDao;
import com.sma.smartv3.db.entity.WorkoutIndex;
import com.sma.smartv3.pro.R;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFitbitManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitbitManager.kt\ncom/sma/smartv3/biz/fitness_site/fitbit/FitbitManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,221:1\n15#2:222\n18#2,2:223\n15#2:225\n15#2:226\n18#2,2:227\n15#2:229\n11#2,2:230\n18#2,2:232\n15#2:234\n*S KotlinDebug\n*F\n+ 1 FitbitManager.kt\ncom/sma/smartv3/biz/fitness_site/fitbit/FitbitManager\n*L\n42#1:222\n47#1:223,2\n47#1:225\n83#1:226\n113#1:227,2\n113#1:229\n130#1:230,2\n157#1:232,2\n157#1:234\n*E\n"})
public final class FitbitManager {

    @aa1
    public static final FitbitManager INSTANCE = null;
    private static final int STATUS_CODE_UNAUTHORIZED = 401;

    @aa1
    private static final String TAG = "FitbitManager";

    @aa1
    public static final String URL_AUTHORIZE = "https://www.fitbit.com/oauth2/authorize";

    @aa1
    private static final String URL_DEAUTHORIZE = "https://api.fitbit.com/oauth2/revoke";

    @aa1
    private static final String URL_GET_TOKEN = "https://api.fitbit.com/oauth2/token";

    static {
        INSTANCE = new FitbitManager();
    }

    private FitbitManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createActivity$default(FitbitManager r0, WorkoutIndex r1, String r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.createActivity(r1, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deauthorizeFit$default(FitbitManager r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        r0.deauthorizeFit(r1);
    }

    private final String getActivityId(int r2) {
        if (r2 != 7) goto L5;
        return "90009";
    L5:
        if (r2 != 14) goto L7;
        return "52001";
    L7:
        if (r2 == 22) goto L24;
        switch(r2) {
            case 10: goto L22;
            case 11: goto L20;
            case 12: goto L18;
            default: goto L9;
        };
    L9:
        switch(r2) {
            case 16: goto L16;
            case 17: goto L14;
            case 18: goto L12;
            default: goto L10;
        };
    L10:
        return "2060";
    L12:
        return "15020";
    L14:
        return "15210";
    L16:
        return "15040";
    L18:
        return "90013";
    L20:
        return "90024";
    L22:
        return "90001";
    L24:
        return "90005";
    }

    private final void updateWorkoutIndexFitbitSynced(WorkoutIndex r3) {
        WorkoutIndexDao r0 = MyDb.INSTANCE.getMDatabase().workoutIndexDao();
        r3.setMSyncStatus(r3.getMSyncStatus() | 2);
        r0.update(r3);
    }

    public final void createActivity(@aa1 WorkoutIndex r8, @aa1 String r9, @tb1 Function1<? super Boolean, Unit> r10) {
        Intrinsics.X0O(r8, "workoutIndex");
        Intrinsics.X0O(r9, "userId");
        LogUtils.v(new Object[]{"FitbitManager createActivity -> " + r8});
        if ((r8.getMSyncStatus() & 2) <= 0) goto L7;
        if (r10 == null) goto L29;
        r10.invoke(Boolean.TRUE);
        return;
    L29:
        return;
    L7:
        FitbitWorkout r1 = XXI0Xi.OXO1(r8);
        if (r1 != null) goto L13;
        updateWorkoutIndexFitbitSynced(r8);
        if (r10 == null) goto L30;
        r10.invoke(Boolean.TRUE);
        return;
    L30:
        return;
    L13:
        LogUtils.d(new Object[]{"FitbitManager createActivity -> " + r1});
        String r2 = getActivityId(r8.getMMode());     // Catch: Exception -> L17
        ANRequest.PostRequestBuilder r11 = AndroidNetworking.post("https://api.fitbit.com/1/user/" + r9 + "/activities.json").setContentType(G5.L);     // Catch: Exception -> L17
        Object r4 = new Gson().fromJson(a01.OXO1.IiI10X().getString(FitbitToken.class.getName()), FitbitToken.class);     // Catch: Exception -> L17
        if (r4 != null) goto L19;
        r4 = FitbitToken.class.newInstance();     // Catch: Exception -> L17
    L19:
        r11.addHeaders("Authorization", "Bearer " + ((FitbitToken) r4).getAccess_token()).addBodyParameter(AdUnitActivity.EXTRA_ACTIVITY_ID, r2).addBodyParameter("activitName", "").addBodyParameter("manualCalories", "300").addBodyParameter("startTime", "15:00").addBodyParameter("durationMillis", String.valueOf(r1.getMElapsedTime())).addBodyParameter("duration", String.valueOf(r1.getMElapsedTime())).addBodyParameter(os0.OII, "500").addBodyParameter("date", r1.getMDate()).addBodyParameter("steps", "200").setTag("FitbitManager createActivity").setPriority(Priority.HIGH).build().getAsJSONObject(new FitbitManager$createActivity$response$1());     // Catch: Exception -> L17
        Unit r12 = Unit.OXO1;     // Catch: Exception -> L17
        updateWorkoutIndexFitbitSynced(r8);     // Catch: Exception -> L17
        if (r10 == null) goto L31;
        r10.invoke(Boolean.TRUE);     // Catch: Exception -> L17
        return;
    L31:
        return;
    L17:
        e = move-exception;
        i1O0OXO1O r13 = i1O0OXO1O.OXO1;
        e.printStackTrace();
        r13.OXO1("FitbitManager createActivity -> exception : " + Unit.OXO1);
        if (r10 == null) goto L32;
        r10.invoke(Boolean.FALSE);
        return;
    }

    public final void deauthorizeFit(@tb1 final Function1<? super Boolean, Unit> r5) {
        SPUtils r0 = a01.OXO1.IiI10X();
        FitbitToken r1 = (FitbitToken) new Gson().fromJson(r0.getString(FitbitToken.class.getName()), FitbitToken.class);
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.getAccess_token().length() != 0) goto L7;
        return;
    L7:
        AndroidNetworking.post(URL_DEAUTHORIZE).addBodyParameter("access_token", r1.getAccess_token()).setTag("FitbitManager deauthorizeFit").setPriority(Priority.HIGH).build().getAsJSONObject(new AnonymousClass1(r5));
    }

    public final void getToken(@aa1 Context r10, @aa1 String r11, @aa1 String r12, @aa1 final Function1<? super Boolean, Unit> r13) {
        Intrinsics.X0O(r10, "context");
        Intrinsics.X0O(r11, "code");
        Intrinsics.X0O(r12, "code_verifier");
        Intrinsics.X0O(r13, "callback");
        String r14 = oe5.IXO0OOi(r11, "#_", "", false, 4, null);
        AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", r10.getString(R.string.fitbit_client_id)).addBodyParameter("code", r14).addBodyParameter("code_verifier", r12).addBodyParameter("grant_type", "authorization_code").setPriority(Priority.HIGH).build().getAsObject(FitbitToken.class, new C33831(r13));
    }

    public final boolean isEnabled() {
        SPUtils r0 = a01.OXO1.IiI10X();
        if (new Gson().fromJson(r0.getString(FitbitToken.class.getName()), FitbitToken.class) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isExpired() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new Gson().fromJson(r0.getString(FitbitToken.class.getName()), FitbitToken.class);
        if (r1 != null) goto L5;
        r1 = FitbitToken.class.newInstance();
    L5:
        long r2 = (((FitbitToken) r1).getExpires_at() * 1000) - TimeUnit.MINUTES.toMillis(5);
        if (System.currentTimeMillis() <= r2) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean refreshToken(@aa1 Context r7) {
        Intrinsics.X0O(r7, "context");
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(FitbitToken.class.getName()), FitbitToken.class);
        if (r2 != null) goto L5;
        r2 = FitbitToken.class.newInstance();
    L5:
        FitbitToken r3 = (FitbitToken) r2;
        Object r8 = AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", r7.getString(R.string.fitbit_client_id)).addBodyParameter("client_secret", r7.getString(R.string.fitbit_client_secret)).addBodyParameter("grant_type", cd1.IO).addBodyParameter(cd1.IO, r3.getRefresh_token()).setTag("FitbitManager refreshToken").setPriority(Priority.HIGH).build().executeForObject(FitbitToken.class).getResult();     // Catch: Exception -> L8
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.fitbit.FitbitToken");     // Catch: Exception -> L8
        FitbitToken r9 = (FitbitToken) r8;     // Catch: Exception -> L8
    L9:
        if (r9 == null) goto L11;
        a01.OXO1.IiI10X().put(FitbitToken.class.getName(), new Gson().toJson(r9));
        return true;
    L11:
        return false;
    L8:
        r9 = null;
        goto L9
    }
}
