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
import com.android.mltcode.paycertificationapi.ud5;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.ironsource.C11921G5;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WorkoutIndexDao;
import com.sma.smartv3.p608db.entity.WorkoutIndex;
import com.sma.smartv3.pro.R;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nFitbitManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitbitManager.kt\ncom/sma/smartv3/biz/fitness_site/fitbit/FitbitManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,221:1\n15#2:222\n18#2,2:223\n15#2:225\n15#2:226\n18#2,2:227\n15#2:229\n11#2,2:230\n18#2,2:232\n15#2:234\n*S KotlinDebug\n*F\n+ 1 FitbitManager.kt\ncom/sma/smartv3/biz/fitness_site/fitbit/FitbitManager\n*L\n42#1:222\n47#1:223,2\n47#1:225\n83#1:226\n113#1:227,2\n113#1:229\n130#1:230,2\n157#1:232,2\n157#1:234\n*E\n"})
public final class FitbitManager {

    @aa1
    public static final FitbitManager INSTANCE = new FitbitManager();
    private static final int STATUS_CODE_UNAUTHORIZED = 401;

    @aa1
    private static final String TAG = "FitbitManager";

    @aa1
    public static final String URL_AUTHORIZE = "https://www.fitbit.com/oauth2/authorize";

    @aa1
    private static final String URL_DEAUTHORIZE = "https://api.fitbit.com/oauth2/revoke";

    @aa1
    private static final String URL_GET_TOKEN = "https://api.fitbit.com/oauth2/token";

    private FitbitManager() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createActivity$default(FitbitManager fitbitManager, WorkoutIndex workoutIndex, String str, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        fitbitManager.createActivity(workoutIndex, str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deauthorizeFit$default(FitbitManager fitbitManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        fitbitManager.deauthorizeFit(function1);
    }

    private final String getActivityId(int i) {
        if (i == 7) {
            return "90009";
        }
        if (i == 14) {
            return "52001";
        }
        if (i == 22) {
            return "90005";
        }
        switch (i) {
            case 10:
                return "90001";
            case 11:
                return "90024";
            case 12:
                return "90013";
            default:
                switch (i) {
                    case 16:
                        return "15040";
                    case 17:
                        return "15210";
                    case 18:
                        return "15020";
                    default:
                        return "2060";
                }
        }
    }

    private final void updateWorkoutIndexFitbitSynced(WorkoutIndex workoutIndex) {
        WorkoutIndexDao workoutIndexDao = MyDb.INSTANCE.getMDatabase().workoutIndexDao();
        workoutIndex.setMSyncStatus(workoutIndex.getMSyncStatus() | 2);
        workoutIndexDao.update(workoutIndex);
    }

    public final void createActivity(@aa1 WorkoutIndex workoutIndex, @aa1 String userId, @tb1 Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(workoutIndex, "workoutIndex");
        Intrinsics.X0O(userId, "userId");
        LogUtils.m11131v("FitbitManager createActivity -> " + workoutIndex);
        if ((workoutIndex.getMSyncStatus() & 2) > 0) {
            if (function1 != null) {
                function1.invoke2(Boolean.TRUE);
                return;
            }
            return;
        }
        FitbitWorkout fitbitWorkoutOXO1 = XXI0Xi.OXO1(workoutIndex);
        if (fitbitWorkoutOXO1 == null) {
            updateWorkoutIndexFitbitSynced(workoutIndex);
            if (function1 != null) {
                function1.invoke2(Boolean.TRUE);
                return;
            }
            return;
        }
        LogUtils.m11128d("FitbitManager createActivity -> " + fitbitWorkoutOXO1);
        try {
            String activityId = getActivityId(workoutIndex.getMMode());
            ANRequest.PostRequestBuilder contentType = AndroidNetworking.post("https://api.fitbit.com/1/user/" + userId + "/activities.json").setContentType(C11921G5.f28906L);
            Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(FitbitToken.class.getName()), (Class<Object>) FitbitToken.class);
            if (objFromJson == null) {
                objFromJson = FitbitToken.class.newInstance();
            }
            contentType.addHeaders("Authorization", "Bearer " + ((FitbitToken) objFromJson).getAccess_token()).addBodyParameter(AdUnitActivity.EXTRA_ACTIVITY_ID, activityId).addBodyParameter("activitName", "").addBodyParameter("manualCalories", "300").addBodyParameter("startTime", "15:00").addBodyParameter("durationMillis", String.valueOf(fitbitWorkoutOXO1.getMElapsedTime())).addBodyParameter("duration", String.valueOf(fitbitWorkoutOXO1.getMElapsedTime())).addBodyParameter(os0.OII, "500").addBodyParameter("date", fitbitWorkoutOXO1.getMDate()).addBodyParameter("steps", "200").setTag((Object) "FitbitManager createActivity").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager$createActivity$response$1
                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onError(ANError aNError) {
                    LogUtils.m11128d("FitbitManager createActivity ANError-> " + aNError + ud5.I0iXXO);
                }

                @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
                public void onResponse(JSONObject jSONObject) {
                    LogUtils.m11128d("FitbitManager createActivity -> " + jSONObject);
                }
            });
            Unit unit = Unit.OXO1;
            updateWorkoutIndexFitbitSynced(workoutIndex);
            if (function1 != null) {
                function1.invoke2(Boolean.TRUE);
            }
        } catch (Exception e) {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            e.printStackTrace();
            i1o0oxo1o.OXO1("FitbitManager createActivity -> exception : " + Unit.OXO1);
            if (function1 != null) {
                function1.invoke2(Boolean.FALSE);
            }
        }
    }

    public final void deauthorizeFit(@tb1 final Function1<? super Boolean, Unit> function1) {
        FitbitToken fitbitToken = (FitbitToken) new Gson().fromJson(a01.OXO1.IiI10X().getString(FitbitToken.class.getName()), FitbitToken.class);
        if (fitbitToken == null || fitbitToken.getAccess_token().length() == 0) {
            return;
        }
        AndroidNetworking.post(URL_DEAUTHORIZE).addBodyParameter("access_token", fitbitToken.getAccess_token()).setTag((Object) "FitbitManager deauthorizeFit").setPriority(Priority.HIGH).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager.deauthorizeFit.1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError anError) {
                Intrinsics.X0O(anError, "anError");
                if (anError.getErrorCode() == 401) {
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                    }
                    a01.OXO1.IiI10X().remove(FitbitToken.class.getName());
                    return;
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.FALSE);
                }
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject response) {
                Intrinsics.X0O(response, "response");
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.TRUE);
                }
                a01.OXO1.IiI10X().remove(FitbitToken.class.getName());
            }
        });
    }

    public final void getToken(@aa1 Context context, @aa1 String code, @aa1 String code_verifier, @aa1 final Function1<? super Boolean, Unit> callback) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(code_verifier, "code_verifier");
        Intrinsics.X0O(callback, "callback");
        AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", context.getString(R.string.fitbit_client_id)).addBodyParameter("code", oe5.IXO0OOi(code, "#_", "", false, 4, null)).addBodyParameter("code_verifier", code_verifier).addBodyParameter("grant_type", "authorization_code").setPriority(Priority.HIGH).build().getAsObject(FitbitToken.class, new ParsedRequestListener<FitbitToken>() { // from class: com.sma.smartv3.biz.fitness_site.fitbit.FitbitManager.getToken.1
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError anError) {
                Intrinsics.X0O(anError, "anError");
                callback.invoke2(Boolean.FALSE);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(FitbitToken response) {
                Intrinsics.X0O(response, "response");
                a01.OXO1.IiI10X().put(FitbitToken.class.getName(), new Gson().toJson(response));
                callback.invoke2(Boolean.TRUE);
            }
        });
    }

    public final boolean isEnabled() {
        return new Gson().fromJson(a01.OXO1.IiI10X().getString(FitbitToken.class.getName()), FitbitToken.class) != null;
    }

    public final boolean isExpired() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(FitbitToken.class.getName()), (Class<Object>) FitbitToken.class);
        if (objFromJson == null) {
            objFromJson = FitbitToken.class.newInstance();
        }
        return System.currentTimeMillis() > (((FitbitToken) objFromJson).getExpires_at() * 1000) - TimeUnit.MINUTES.toMillis(5L);
    }

    public final boolean refreshToken(@aa1 Context context) throws IllegalAccessException, InstantiationException {
        FitbitToken fitbitToken;
        Intrinsics.X0O(context, "context");
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(FitbitToken.class.getName()), (Class<Object>) FitbitToken.class);
        if (objFromJson == null) {
            objFromJson = FitbitToken.class.newInstance();
        }
        try {
            Object result = AndroidNetworking.post(URL_GET_TOKEN).addBodyParameter("client_id", context.getString(R.string.fitbit_client_id)).addBodyParameter("client_secret", context.getString(R.string.fitbit_client_secret)).addBodyParameter("grant_type", cd1.f5954IO).addBodyParameter(cd1.f5954IO, ((FitbitToken) objFromJson).getRefresh_token()).setTag((Object) "FitbitManager refreshToken").setPriority(Priority.HIGH).build().executeForObject(FitbitToken.class).getResult();
            Intrinsics.X1ii(result, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.fitbit.FitbitToken");
            fitbitToken = (FitbitToken) result;
        } catch (Exception unused) {
            fitbitToken = null;
        }
        if (fitbitToken == null) {
            return false;
        }
        a01.OXO1.IiI10X().put(FitbitToken.class.getName(), new Gson().toJson(fitbitToken));
        return true;
    }
}
