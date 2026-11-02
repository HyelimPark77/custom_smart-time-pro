package com.sma.smartv3.work;

import android.content.Context;
import android.os.SystemClock;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X1IIXO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.p96;
import com.bestmafen.androidbase.base.BaseApplication;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.WorkInitializer;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SMADataUploadData;
import com.sma.smartv3.model.UploadActivityData;
import com.sma.smartv3.model.UploadAlipayBindInfoData;
import com.sma.smartv3.model.UploadBloodOxygenData;
import com.sma.smartv3.model.UploadBloodPressureData;
import com.sma.smartv3.model.UploadData;
import com.sma.smartv3.model.UploadHeartRateData;
import com.sma.smartv3.model.UploadHrvData;
import com.sma.smartv3.model.UploadLocationData;
import com.sma.smartv3.model.UploadSleepData;
import com.sma.smartv3.model.UploadTemperatureData;
import com.sma.smartv3.model.UploadWeightData;
import com.sma.smartv3.model.UploadWorkoutData;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.UploadActivity;
import com.sma.smartv3.network.UploadAlipayBindInfo;
import com.sma.smartv3.network.UploadBloodOxygen;
import com.sma.smartv3.network.UploadBloodPressure;
import com.sma.smartv3.network.UploadHeartRate;
import com.sma.smartv3.network.UploadHrv;
import com.sma.smartv3.network.UploadLocation;
import com.sma.smartv3.network.UploadSleep;
import com.sma.smartv3.network.UploadTemperature;
import com.sma.smartv3.network.UploadWeight;
import com.sma.smartv3.network.UploadWorkout;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.dao.AlipayBindInfoDao;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.HrvDao;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p608db.entity.AlipayBindInfo;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleSleep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDataWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataWorker.kt\ncom/sma/smartv3/work/Upload\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,965:1\n279#1,5:968\n533#1,68:973\n601#1,7:1044\n609#1,55:1052\n285#1,6:1107\n306#1,7:1113\n313#1,11:1122\n325#1,8:1134\n333#1,6:1144\n340#1,8:1151\n348#1,7:1161\n356#1,7:1169\n363#1,7:1178\n371#1,8:1186\n379#1,6:1196\n386#1,7:1203\n393#1,9:1212\n403#1,7:1222\n410#1,8:1231\n419#1,7:1240\n426#1,6:1249\n433#1,7:1256\n440#1,34:1265\n475#1,7:1300\n482#1,6:1309\n489#1,7:1316\n496#1,11:1325\n508#1,7:1337\n530#1:1344\n279#1,5:1345\n533#1,68:1350\n601#1,7:1421\n609#1,55:1429\n285#1,6:1484\n306#1,7:1490\n313#1,11:1499\n325#1,8:1511\n333#1,6:1521\n340#1,8:1528\n348#1,7:1538\n356#1,7:1546\n363#1,7:1555\n371#1,8:1563\n379#1,6:1573\n386#1,7:1580\n393#1,9:1589\n403#1,7:1599\n410#1,8:1608\n419#1,7:1617\n426#1,6:1626\n433#1,7:1633\n440#1,34:1642\n475#1,7:1677\n482#1,6:1686\n489#1,7:1693\n496#1,11:1702\n508#1,7:1714\n530#1:1721\n279#1,5:1722\n533#1,68:1727\n601#1,7:1798\n609#1,55:1806\n285#1,6:1861\n306#1,7:1867\n313#1,11:1876\n325#1,8:1888\n333#1,6:1898\n340#1,8:1905\n348#1,7:1915\n356#1,7:1923\n363#1,7:1932\n371#1,8:1940\n379#1,6:1950\n386#1,7:1957\n393#1,9:1966\n403#1,7:1976\n410#1,8:1985\n419#1,7:1994\n426#1,6:2003\n433#1,7:2010\n440#1,34:2019\n475#1,7:2054\n482#1,6:2063\n489#1,7:2070\n496#1,11:2079\n508#1,7:2091\n530#1:2098\n279#1,5:2099\n533#1,68:2104\n601#1,7:2175\n609#1,55:2183\n285#1,6:2238\n306#1,7:2244\n313#1,11:2253\n325#1,8:2265\n333#1,6:2275\n340#1,8:2282\n348#1,7:2292\n356#1,7:2300\n363#1,7:2309\n371#1,8:2317\n379#1,6:2327\n386#1,7:2334\n393#1,9:2343\n403#1,7:2353\n410#1,8:2362\n419#1,7:2371\n426#1,6:2380\n433#1,7:2387\n440#1,34:2396\n475#1,7:2431\n482#1,6:2440\n489#1,7:2447\n496#1,11:2456\n508#1,7:2468\n530#1:2475\n279#1,5:2476\n533#1,68:2481\n601#1,7:2552\n609#1,55:2560\n285#1,6:2615\n306#1,7:2621\n313#1,11:2630\n325#1,8:2642\n333#1,6:2652\n340#1,8:2659\n348#1,7:2669\n356#1,7:2677\n363#1,7:2686\n371#1,8:2694\n379#1,6:2704\n386#1,7:2711\n393#1,9:2720\n403#1,7:2730\n410#1,8:2739\n419#1,7:2748\n426#1,6:2757\n433#1,7:2764\n440#1,34:2773\n475#1,7:2808\n482#1,6:2817\n489#1,7:2824\n496#1,11:2833\n508#1,7:2845\n530#1:2852\n279#1,5:2853\n533#1,68:2858\n601#1,7:2929\n609#1,55:2937\n285#1,6:2992\n306#1,7:2998\n313#1,11:3007\n325#1,8:3019\n333#1,6:3029\n340#1,8:3036\n348#1,7:3046\n356#1,7:3054\n363#1,7:3063\n371#1,8:3071\n379#1,6:3081\n386#1,7:3088\n393#1,9:3097\n403#1,7:3107\n410#1,8:3116\n419#1,7:3125\n426#1,6:3134\n433#1,7:3141\n440#1,34:3150\n475#1,7:3185\n482#1,6:3194\n489#1,7:3201\n496#1,11:3210\n508#1,7:3222\n530#1:3229\n279#1,5:3230\n533#1,68:3235\n601#1,7:3306\n609#1,55:3314\n285#1,6:3369\n306#1,7:3375\n313#1,11:3384\n325#1,8:3396\n333#1,6:3406\n340#1,8:3413\n348#1,7:3423\n356#1,7:3431\n363#1,7:3440\n371#1,8:3448\n379#1,6:3458\n386#1,7:3465\n393#1,9:3474\n403#1,7:3484\n410#1,8:3493\n419#1,7:3502\n426#1,6:3511\n433#1,7:3518\n440#1,34:3527\n475#1,7:3562\n482#1,6:3571\n489#1,7:3578\n496#1,11:3587\n508#1,7:3599\n530#1:3606\n279#1,5:3607\n533#1,68:3612\n601#1,7:3683\n609#1,55:3691\n285#1,6:3746\n306#1,7:3752\n313#1,11:3761\n325#1,8:3773\n333#1,6:3783\n340#1,8:3790\n348#1,7:3800\n356#1,7:3808\n363#1,7:3817\n371#1,8:3825\n379#1,6:3835\n386#1,7:3842\n393#1,9:3851\n403#1,7:3861\n410#1,8:3870\n419#1,7:3879\n426#1,6:3888\n433#1,7:3895\n440#1,34:3904\n475#1,7:3939\n482#1,6:3948\n489#1,7:3955\n496#1,11:3964\n508#1,7:3976\n530#1:3983\n279#1,5:3984\n533#1,68:3989\n601#1,7:4060\n609#1,55:4068\n285#1,6:4123\n306#1,7:4129\n313#1,11:4138\n325#1,8:4150\n333#1,6:4160\n340#1,8:4167\n348#1,7:4177\n356#1,7:4185\n363#1,7:4194\n371#1,8:4202\n379#1,6:4212\n386#1,7:4219\n393#1,9:4228\n403#1,7:4238\n410#1,8:4247\n419#1,7:4256\n426#1,6:4265\n433#1,7:4272\n440#1,34:4281\n475#1,7:4316\n482#1,6:4325\n489#1,7:4332\n496#1,11:4341\n508#1,7:4353\n530#1:4360\n279#1,5:4361\n533#1,68:4366\n601#1,7:4437\n609#1,55:4445\n285#1,6:4500\n306#1,7:4506\n313#1,11:4515\n325#1,8:4527\n333#1,6:4537\n340#1,8:4544\n348#1,7:4554\n356#1,7:4562\n363#1,7:4571\n371#1,8:4579\n379#1,6:4589\n386#1,7:4596\n393#1,9:4605\n403#1,7:4615\n410#1,8:4624\n419#1,7:4633\n426#1,6:4642\n433#1,7:4649\n440#1,34:4658\n475#1,7:4693\n482#1,6:4702\n489#1,7:4709\n496#1,11:4718\n508#1,7:4730\n530#1:4737\n279#1,5:4738\n533#1,68:4743\n601#1,7:4814\n609#1,55:4822\n285#1,6:4877\n306#1,7:4883\n313#1,11:4892\n325#1,8:4904\n333#1,6:4914\n340#1,8:4921\n348#1,7:4931\n356#1,7:4939\n363#1,7:4948\n371#1,8:4956\n379#1,6:4966\n386#1,7:4973\n393#1,9:4982\n403#1,7:4992\n410#1,8:5001\n419#1,7:5010\n426#1,6:5019\n433#1,7:5026\n440#1,34:5035\n475#1,7:5070\n482#1,6:5079\n489#1,7:5086\n496#1,11:5095\n508#1,7:5107\n530#1:5114\n533#1,68:5115\n601#1,7:5186\n609#1,55:5194\n19#2:966\n15#2:967\n1563#3:1041\n1634#3,2:1042\n1636#3:1051\n1634#3,2:1120\n1636#3:1133\n1634#3,2:1142\n1636#3:1150\n1634#3,2:1159\n1636#3:1168\n1634#3,2:1176\n1636#3:1185\n1634#3,2:1194\n1636#3:1202\n1634#3,2:1210\n1636#3:1221\n1634#3,2:1229\n1636#3:1239\n1634#3,2:1247\n1636#3:1255\n1634#3,2:1263\n1636#3:1299\n1634#3,2:1307\n1636#3:1315\n1634#3,2:1323\n1636#3:1336\n1563#3:1418\n1634#3,2:1419\n1636#3:1428\n1634#3,2:1497\n1636#3:1510\n1634#3,2:1519\n1636#3:1527\n1634#3,2:1536\n1636#3:1545\n1634#3,2:1553\n1636#3:1562\n1634#3,2:1571\n1636#3:1579\n1634#3,2:1587\n1636#3:1598\n1634#3,2:1606\n1636#3:1616\n1634#3,2:1624\n1636#3:1632\n1634#3,2:1640\n1636#3:1676\n1634#3,2:1684\n1636#3:1692\n1634#3,2:1700\n1636#3:1713\n1563#3:1795\n1634#3,2:1796\n1636#3:1805\n1634#3,2:1874\n1636#3:1887\n1634#3,2:1896\n1636#3:1904\n1634#3,2:1913\n1636#3:1922\n1634#3,2:1930\n1636#3:1939\n1634#3,2:1948\n1636#3:1956\n1634#3,2:1964\n1636#3:1975\n1634#3,2:1983\n1636#3:1993\n1634#3,2:2001\n1636#3:2009\n1634#3,2:2017\n1636#3:2053\n1634#3,2:2061\n1636#3:2069\n1634#3,2:2077\n1636#3:2090\n1563#3:2172\n1634#3,2:2173\n1636#3:2182\n1634#3,2:2251\n1636#3:2264\n1634#3,2:2273\n1636#3:2281\n1634#3,2:2290\n1636#3:2299\n1634#3,2:2307\n1636#3:2316\n1634#3,2:2325\n1636#3:2333\n1634#3,2:2341\n1636#3:2352\n1634#3,2:2360\n1636#3:2370\n1634#3,2:2378\n1636#3:2386\n1634#3,2:2394\n1636#3:2430\n1634#3,2:2438\n1636#3:2446\n1634#3,2:2454\n1636#3:2467\n1563#3:2549\n1634#3,2:2550\n1636#3:2559\n1634#3,2:2628\n1636#3:2641\n1634#3,2:2650\n1636#3:2658\n1634#3,2:2667\n1636#3:2676\n1634#3,2:2684\n1636#3:2693\n1634#3,2:2702\n1636#3:2710\n1634#3,2:2718\n1636#3:2729\n1634#3,2:2737\n1636#3:2747\n1634#3,2:2755\n1636#3:2763\n1634#3,2:2771\n1636#3:2807\n1634#3,2:2815\n1636#3:2823\n1634#3,2:2831\n1636#3:2844\n1563#3:2926\n1634#3,2:2927\n1636#3:2936\n1634#3,2:3005\n1636#3:3018\n1634#3,2:3027\n1636#3:3035\n1634#3,2:3044\n1636#3:3053\n1634#3,2:3061\n1636#3:3070\n1634#3,2:3079\n1636#3:3087\n1634#3,2:3095\n1636#3:3106\n1634#3,2:3114\n1636#3:3124\n1634#3,2:3132\n1636#3:3140\n1634#3,2:3148\n1636#3:3184\n1634#3,2:3192\n1636#3:3200\n1634#3,2:3208\n1636#3:3221\n1563#3:3303\n1634#3,2:3304\n1636#3:3313\n1634#3,2:3382\n1636#3:3395\n1634#3,2:3404\n1636#3:3412\n1634#3,2:3421\n1636#3:3430\n1634#3,2:3438\n1636#3:3447\n1634#3,2:3456\n1636#3:3464\n1634#3,2:3472\n1636#3:3483\n1634#3,2:3491\n1636#3:3501\n1634#3,2:3509\n1636#3:3517\n1634#3,2:3525\n1636#3:3561\n1634#3,2:3569\n1636#3:3577\n1634#3,2:3585\n1636#3:3598\n1563#3:3680\n1634#3,2:3681\n1636#3:3690\n1634#3,2:3759\n1636#3:3772\n1634#3,2:3781\n1636#3:3789\n1634#3,2:3798\n1636#3:3807\n1634#3,2:3815\n1636#3:3824\n1634#3,2:3833\n1636#3:3841\n1634#3,2:3849\n1636#3:3860\n1634#3,2:3868\n1636#3:3878\n1634#3,2:3886\n1636#3:3894\n1634#3,2:3902\n1636#3:3938\n1634#3,2:3946\n1636#3:3954\n1634#3,2:3962\n1636#3:3975\n1563#3:4057\n1634#3,2:4058\n1636#3:4067\n1634#3,2:4136\n1636#3:4149\n1634#3,2:4158\n1636#3:4166\n1634#3,2:4175\n1636#3:4184\n1634#3,2:4192\n1636#3:4201\n1634#3,2:4210\n1636#3:4218\n1634#3,2:4226\n1636#3:4237\n1634#3,2:4245\n1636#3:4255\n1634#3,2:4263\n1636#3:4271\n1634#3,2:4279\n1636#3:4315\n1634#3,2:4323\n1636#3:4331\n1634#3,2:4339\n1636#3:4352\n1563#3:4434\n1634#3,2:4435\n1636#3:4444\n1634#3,2:4513\n1636#3:4526\n1634#3,2:4535\n1636#3:4543\n1634#3,2:4552\n1636#3:4561\n1634#3,2:4569\n1636#3:4578\n1634#3,2:4587\n1636#3:4595\n1634#3,2:4603\n1636#3:4614\n1634#3,2:4622\n1636#3:4632\n1634#3,2:4640\n1636#3:4648\n1634#3,2:4656\n1636#3:4692\n1634#3,2:4700\n1636#3:4708\n1634#3,2:4716\n1636#3:4729\n1563#3:4811\n1634#3,2:4812\n1636#3:4821\n1634#3,2:4890\n1636#3:4903\n1634#3,2:4912\n1636#3:4920\n1634#3,2:4929\n1636#3:4938\n1634#3,2:4946\n1636#3:4955\n1634#3,2:4964\n1636#3:4972\n1634#3,2:4980\n1636#3:4991\n1634#3,2:4999\n1636#3:5009\n1634#3,2:5017\n1636#3:5025\n1634#3,2:5033\n1636#3:5069\n1634#3,2:5077\n1636#3:5085\n1634#3,2:5093\n1636#3:5106\n1563#3:5183\n1634#3,2:5184\n1636#3:5193\n1563#3:5249\n1634#3,3:5250\n1563#3:5253\n1634#3,3:5254\n1563#3:5257\n1634#3,3:5258\n1563#3:5261\n1634#3,3:5262\n1563#3:5265\n1634#3,3:5266\n1563#3:5269\n1634#3,3:5270\n1563#3:5273\n1634#3,3:5274\n1563#3:5277\n1634#3,3:5278\n1563#3:5281\n1634#3,3:5282\n1563#3:5285\n1634#3,3:5286\n1563#3:5289\n1634#3,3:5290\n1563#3:5293\n1634#3,3:5294\n*S KotlinDebug\n*F\n+ 1 DataWorker.kt\ncom/sma/smartv3/work/Upload\n*L\n83#1:968,5\n83#1:973,68\n83#1:1044,7\n83#1:1052,55\n83#1:1107,6\n83#1:1113,7\n83#1:1122,11\n83#1:1134,8\n83#1:1144,6\n83#1:1151,8\n83#1:1161,7\n83#1:1169,7\n83#1:1178,7\n83#1:1186,8\n83#1:1196,6\n83#1:1203,7\n83#1:1212,9\n83#1:1222,7\n83#1:1231,8\n83#1:1240,7\n83#1:1249,6\n83#1:1256,7\n83#1:1265,34\n83#1:1300,7\n83#1:1309,6\n83#1:1316,7\n83#1:1325,11\n83#1:1337,7\n83#1:1344\n100#1:1345,5\n100#1:1350,68\n100#1:1421,7\n100#1:1429,55\n100#1:1484,6\n100#1:1490,7\n100#1:1499,11\n100#1:1511,8\n100#1:1521,6\n100#1:1528,8\n100#1:1538,7\n100#1:1546,7\n100#1:1555,7\n100#1:1563,8\n100#1:1573,6\n100#1:1580,7\n100#1:1589,9\n100#1:1599,7\n100#1:1608,8\n100#1:1617,7\n100#1:1626,6\n100#1:1633,7\n100#1:1642,34\n100#1:1677,7\n100#1:1686,6\n100#1:1693,7\n100#1:1702,11\n100#1:1714,7\n100#1:1721\n117#1:1722,5\n117#1:1727,68\n117#1:1798,7\n117#1:1806,55\n117#1:1861,6\n117#1:1867,7\n117#1:1876,11\n117#1:1888,8\n117#1:1898,6\n117#1:1905,8\n117#1:1915,7\n117#1:1923,7\n117#1:1932,7\n117#1:1940,8\n117#1:1950,6\n117#1:1957,7\n117#1:1966,9\n117#1:1976,7\n117#1:1985,8\n117#1:1994,7\n117#1:2003,6\n117#1:2010,7\n117#1:2019,34\n117#1:2054,7\n117#1:2063,6\n117#1:2070,7\n117#1:2079,11\n117#1:2091,7\n117#1:2098\n134#1:2099,5\n134#1:2104,68\n134#1:2175,7\n134#1:2183,55\n134#1:2238,6\n134#1:2244,7\n134#1:2253,11\n134#1:2265,8\n134#1:2275,6\n134#1:2282,8\n134#1:2292,7\n134#1:2300,7\n134#1:2309,7\n134#1:2317,8\n134#1:2327,6\n134#1:2334,7\n134#1:2343,9\n134#1:2353,7\n134#1:2362,8\n134#1:2371,7\n134#1:2380,6\n134#1:2387,7\n134#1:2396,34\n134#1:2431,7\n134#1:2440,6\n134#1:2447,7\n134#1:2456,11\n134#1:2468,7\n134#1:2475\n151#1:2476,5\n151#1:2481,68\n151#1:2552,7\n151#1:2560,55\n151#1:2615,6\n151#1:2621,7\n151#1:2630,11\n151#1:2642,8\n151#1:2652,6\n151#1:2659,8\n151#1:2669,7\n151#1:2677,7\n151#1:2686,7\n151#1:2694,8\n151#1:2704,6\n151#1:2711,7\n151#1:2720,9\n151#1:2730,7\n151#1:2739,8\n151#1:2748,7\n151#1:2757,6\n151#1:2764,7\n151#1:2773,34\n151#1:2808,7\n151#1:2817,6\n151#1:2824,7\n151#1:2833,11\n151#1:2845,7\n151#1:2852\n169#1:2853,5\n169#1:2858,68\n169#1:2929,7\n169#1:2937,55\n169#1:2992,6\n169#1:2998,7\n169#1:3007,11\n169#1:3019,8\n169#1:3029,6\n169#1:3036,8\n169#1:3046,7\n169#1:3054,7\n169#1:3063,7\n169#1:3071,8\n169#1:3081,6\n169#1:3088,7\n169#1:3097,9\n169#1:3107,7\n169#1:3116,8\n169#1:3125,7\n169#1:3134,6\n169#1:3141,7\n169#1:3150,34\n169#1:3185,7\n169#1:3194,6\n169#1:3201,7\n169#1:3210,11\n169#1:3222,7\n169#1:3229\n186#1:3230,5\n186#1:3235,68\n186#1:3306,7\n186#1:3314,55\n186#1:3369,6\n186#1:3375,7\n186#1:3384,11\n186#1:3396,8\n186#1:3406,6\n186#1:3413,8\n186#1:3423,7\n186#1:3431,7\n186#1:3440,7\n186#1:3448,8\n186#1:3458,6\n186#1:3465,7\n186#1:3474,9\n186#1:3484,7\n186#1:3493,8\n186#1:3502,7\n186#1:3511,6\n186#1:3518,7\n186#1:3527,34\n186#1:3562,7\n186#1:3571,6\n186#1:3578,7\n186#1:3587,11\n186#1:3599,7\n186#1:3606\n203#1:3607,5\n203#1:3612,68\n203#1:3683,7\n203#1:3691,55\n203#1:3746,6\n203#1:3752,7\n203#1:3761,11\n203#1:3773,8\n203#1:3783,6\n203#1:3790,8\n203#1:3800,7\n203#1:3808,7\n203#1:3817,7\n203#1:3825,8\n203#1:3835,6\n203#1:3842,7\n203#1:3851,9\n203#1:3861,7\n203#1:3870,8\n203#1:3879,7\n203#1:3888,6\n203#1:3895,7\n203#1:3904,34\n203#1:3939,7\n203#1:3948,6\n203#1:3955,7\n203#1:3964,11\n203#1:3976,7\n203#1:3983\n220#1:3984,5\n220#1:3989,68\n220#1:4060,7\n220#1:4068,55\n220#1:4123,6\n220#1:4129,7\n220#1:4138,11\n220#1:4150,8\n220#1:4160,6\n220#1:4167,8\n220#1:4177,7\n220#1:4185,7\n220#1:4194,7\n220#1:4202,8\n220#1:4212,6\n220#1:4219,7\n220#1:4228,9\n220#1:4238,7\n220#1:4247,8\n220#1:4256,7\n220#1:4265,6\n220#1:4272,7\n220#1:4281,34\n220#1:4316,7\n220#1:4325,6\n220#1:4332,7\n220#1:4341,11\n220#1:4353,7\n220#1:4360\n237#1:4361,5\n237#1:4366,68\n237#1:4437,7\n237#1:4445,55\n237#1:4500,6\n237#1:4506,7\n237#1:4515,11\n237#1:4527,8\n237#1:4537,6\n237#1:4544,8\n237#1:4554,7\n237#1:4562,7\n237#1:4571,7\n237#1:4579,8\n237#1:4589,6\n237#1:4596,7\n237#1:4605,9\n237#1:4615,7\n237#1:4624,8\n237#1:4633,7\n237#1:4642,6\n237#1:4649,7\n237#1:4658,34\n237#1:4693,7\n237#1:4702,6\n237#1:4709,7\n237#1:4718,11\n237#1:4730,7\n237#1:4737\n256#1:4738,5\n256#1:4743,68\n256#1:4814,7\n256#1:4822,55\n256#1:4877,6\n256#1:4883,7\n256#1:4892,11\n256#1:4904,8\n256#1:4914,6\n256#1:4921,8\n256#1:4931,7\n256#1:4939,7\n256#1:4948,7\n256#1:4956,8\n256#1:4966,6\n256#1:4973,7\n256#1:4982,9\n256#1:4992,7\n256#1:5001,8\n256#1:5010,7\n256#1:5019,6\n256#1:5026,7\n256#1:5035,34\n256#1:5070,7\n256#1:5079,6\n256#1:5086,7\n256#1:5095,11\n256#1:5107,7\n256#1:5114\n283#1:5115,68\n283#1:5186,7\n283#1:5194,55\n62#1:966\n62#1:967\n83#1:1041\n83#1:1042,2\n83#1:1051\n83#1:1120,2\n83#1:1133\n83#1:1142,2\n83#1:1150\n83#1:1159,2\n83#1:1168\n83#1:1176,2\n83#1:1185\n83#1:1194,2\n83#1:1202\n83#1:1210,2\n83#1:1221\n83#1:1229,2\n83#1:1239\n83#1:1247,2\n83#1:1255\n83#1:1263,2\n83#1:1299\n83#1:1307,2\n83#1:1315\n83#1:1323,2\n83#1:1336\n100#1:1418\n100#1:1419,2\n100#1:1428\n100#1:1497,2\n100#1:1510\n100#1:1519,2\n100#1:1527\n100#1:1536,2\n100#1:1545\n100#1:1553,2\n100#1:1562\n100#1:1571,2\n100#1:1579\n100#1:1587,2\n100#1:1598\n100#1:1606,2\n100#1:1616\n100#1:1624,2\n100#1:1632\n100#1:1640,2\n100#1:1676\n100#1:1684,2\n100#1:1692\n100#1:1700,2\n100#1:1713\n117#1:1795\n117#1:1796,2\n117#1:1805\n117#1:1874,2\n117#1:1887\n117#1:1896,2\n117#1:1904\n117#1:1913,2\n117#1:1922\n117#1:1930,2\n117#1:1939\n117#1:1948,2\n117#1:1956\n117#1:1964,2\n117#1:1975\n117#1:1983,2\n117#1:1993\n117#1:2001,2\n117#1:2009\n117#1:2017,2\n117#1:2053\n117#1:2061,2\n117#1:2069\n117#1:2077,2\n117#1:2090\n134#1:2172\n134#1:2173,2\n134#1:2182\n134#1:2251,2\n134#1:2264\n134#1:2273,2\n134#1:2281\n134#1:2290,2\n134#1:2299\n134#1:2307,2\n134#1:2316\n134#1:2325,2\n134#1:2333\n134#1:2341,2\n134#1:2352\n134#1:2360,2\n134#1:2370\n134#1:2378,2\n134#1:2386\n134#1:2394,2\n134#1:2430\n134#1:2438,2\n134#1:2446\n134#1:2454,2\n134#1:2467\n151#1:2549\n151#1:2550,2\n151#1:2559\n151#1:2628,2\n151#1:2641\n151#1:2650,2\n151#1:2658\n151#1:2667,2\n151#1:2676\n151#1:2684,2\n151#1:2693\n151#1:2702,2\n151#1:2710\n151#1:2718,2\n151#1:2729\n151#1:2737,2\n151#1:2747\n151#1:2755,2\n151#1:2763\n151#1:2771,2\n151#1:2807\n151#1:2815,2\n151#1:2823\n151#1:2831,2\n151#1:2844\n169#1:2926\n169#1:2927,2\n169#1:2936\n169#1:3005,2\n169#1:3018\n169#1:3027,2\n169#1:3035\n169#1:3044,2\n169#1:3053\n169#1:3061,2\n169#1:3070\n169#1:3079,2\n169#1:3087\n169#1:3095,2\n169#1:3106\n169#1:3114,2\n169#1:3124\n169#1:3132,2\n169#1:3140\n169#1:3148,2\n169#1:3184\n169#1:3192,2\n169#1:3200\n169#1:3208,2\n169#1:3221\n186#1:3303\n186#1:3304,2\n186#1:3313\n186#1:3382,2\n186#1:3395\n186#1:3404,2\n186#1:3412\n186#1:3421,2\n186#1:3430\n186#1:3438,2\n186#1:3447\n186#1:3456,2\n186#1:3464\n186#1:3472,2\n186#1:3483\n186#1:3491,2\n186#1:3501\n186#1:3509,2\n186#1:3517\n186#1:3525,2\n186#1:3561\n186#1:3569,2\n186#1:3577\n186#1:3585,2\n186#1:3598\n203#1:3680\n203#1:3681,2\n203#1:3690\n203#1:3759,2\n203#1:3772\n203#1:3781,2\n203#1:3789\n203#1:3798,2\n203#1:3807\n203#1:3815,2\n203#1:3824\n203#1:3833,2\n203#1:3841\n203#1:3849,2\n203#1:3860\n203#1:3868,2\n203#1:3878\n203#1:3886,2\n203#1:3894\n203#1:3902,2\n203#1:3938\n203#1:3946,2\n203#1:3954\n203#1:3962,2\n203#1:3975\n220#1:4057\n220#1:4058,2\n220#1:4067\n220#1:4136,2\n220#1:4149\n220#1:4158,2\n220#1:4166\n220#1:4175,2\n220#1:4184\n220#1:4192,2\n220#1:4201\n220#1:4210,2\n220#1:4218\n220#1:4226,2\n220#1:4237\n220#1:4245,2\n220#1:4255\n220#1:4263,2\n220#1:4271\n220#1:4279,2\n220#1:4315\n220#1:4323,2\n220#1:4331\n220#1:4339,2\n220#1:4352\n237#1:4434\n237#1:4435,2\n237#1:4444\n237#1:4513,2\n237#1:4526\n237#1:4535,2\n237#1:4543\n237#1:4552,2\n237#1:4561\n237#1:4569,2\n237#1:4578\n237#1:4587,2\n237#1:4595\n237#1:4603,2\n237#1:4614\n237#1:4622,2\n237#1:4632\n237#1:4640,2\n237#1:4648\n237#1:4656,2\n237#1:4692\n237#1:4700,2\n237#1:4708\n237#1:4716,2\n237#1:4729\n256#1:4811\n256#1:4812,2\n256#1:4821\n256#1:4890,2\n256#1:4903\n256#1:4912,2\n256#1:4920\n256#1:4929,2\n256#1:4938\n256#1:4946,2\n256#1:4955\n256#1:4964,2\n256#1:4972\n256#1:4980,2\n256#1:4991\n256#1:4999,2\n256#1:5009\n256#1:5017,2\n256#1:5025\n256#1:5033,2\n256#1:5069\n256#1:5077,2\n256#1:5085\n256#1:5093,2\n256#1:5106\n283#1:5183\n283#1:5184,2\n283#1:5193\n312#1:5249\n312#1:5250,3\n332#1:5253\n332#1:5254,3\n347#1:5257\n347#1:5258,3\n362#1:5261\n362#1:5262,3\n378#1:5265\n378#1:5266,3\n392#1:5269\n392#1:5270,3\n409#1:5273\n409#1:5274,3\n425#1:5277\n425#1:5278,3\n439#1:5281\n439#1:5282,3\n481#1:5285\n481#1:5286,3\n495#1:5289\n495#1:5290,3\n600#1:5293\n600#1:5294,3\n*E\n"})
public final class Upload {

    @aa1
    public static final Upload OXO1 = new Upload();

    public static final class I0IIOi implements p96<Sleep> {
        public final /* synthetic */ SleepDao OXO1;

        public I0IIOi(SleepDao sleepDao) {
            this.OXO1 = sleepDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Sleep> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Sleep> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class I0iXXO implements p96<Workout> {
        public final /* synthetic */ WorkoutDao OXO1;

        public I0iXXO(WorkoutDao workoutDao) {
            this.OXO1 = workoutDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Workout> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Workout> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class IiI10X implements p96<Hrv> {
        public final /* synthetic */ HrvDao OXO1;

        public IiI10X(HrvDao hrvDao) {
            this.OXO1 = hrvDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Hrv> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Hrv> getList() {
            List<Hrv> listASC = this.OXO1.getListASC();
            Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.Hrv>");
            return (ArrayList) listASC;
        }
    }

    public static final class O00 implements p96<HeartRate> {
        public final /* synthetic */ HeartRateDao OXO1;

        public O00(HeartRateDao heartRateDao) {
            this.OXO1 = heartRateDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<HeartRate> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<HeartRate> getList() {
            List<HeartRate> listASC = this.OXO1.getListASC();
            Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.HeartRate>");
            return (ArrayList) listASC;
        }
    }

    public static final class OIX0iXi implements p96<Weight> {
        public final /* synthetic */ WeightDao OXO1;

        public OIX0iXi(WeightDao weightDao) {
            this.OXO1 = weightDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Weight> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Weight> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class OIi0 implements p96<Temperature> {
        public final /* synthetic */ TemperatureDao OXO1;

        public OIi0(TemperatureDao temperatureDao) {
            this.OXO1 = temperatureDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Temperature> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Temperature> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class OXO1 implements p96<Activity> {
        public final /* synthetic */ ActivityDao OXO1;

        public OXO1(ActivityDao activityDao) {
            this.OXO1 = activityDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Activity> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Activity> getList() {
            List<Activity> listASC = this.OXO1.getListASC();
            Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.Activity>");
            return (ArrayList) listASC;
        }
    }

    public static final class XIi00iiXO implements p96<AlipayBindInfo> {
        public final /* synthetic */ AlipayBindInfoDao OXO1;

        public XIi00iiXO(AlipayBindInfoDao alipayBindInfoDao) {
            this.OXO1 = alipayBindInfoDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<AlipayBindInfo> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<AlipayBindInfo> getList() {
            List<AlipayBindInfo> listASC = this.OXO1.getListASC();
            Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.AlipayBindInfo>");
            return (ArrayList) listASC;
        }
    }

    public static final class XO0O10 implements p96<BloodPressure> {
        public final /* synthetic */ BloodPressureDao OXO1;

        public XO0O10(BloodPressureDao bloodPressureDao) {
            this.OXO1 = bloodPressureDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<BloodPressure> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<BloodPressure> getList() {
            List<BloodPressure> listASC = this.OXO1.getListASC();
            Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.BloodPressure>");
            return (ArrayList) listASC;
        }
    }

    public static final class XOO0ii0 implements p96<Location> {
        public final /* synthetic */ LocationDao OXO1;

        public XOO0ii0(LocationDao locationDao) {
            this.OXO1 = locationDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Location> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Location> getList() {
            return this.OXO1.getListASC();
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.work.Upload$iO */
    public static final class C19080iO implements p96<BloodOxygen> {
        public final /* synthetic */ BloodOxygenDao OXO1;

        public C19080iO(BloodOxygenDao bloodOxygenDao) {
            this.OXO1 = bloodOxygenDao;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<BloodOxygen> data) {
            Intrinsics.X0O(data, "data");
            this.OXO1.update(data);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<BloodOxygen> getList() {
            List<BloodOxygen> listASC = this.OXO1.getListASC();
            Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.BloodOxygen>");
            return (ArrayList) listASC;
        }
    }

    public final /* synthetic */ <T> void I0IIOi(Context context, List<? extends T> list) {
        int size;
        if (!a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
            return;
        }
        int i = 0;
        if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
            if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                for (T t : list) {
                    Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                    HeartRate heartRate = (HeartRate) t;
                    X1IIXO x1iixo = X1IIXO.OXO1;
                    String packageName = context.getPackageName();
                    Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                    DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                    Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                    Field FIELD_BPM = Field.FIELD_BPM;
                    Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                    x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                }
                return;
            }
            if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                return;
            }
            if (!Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    for (T t2 : list) {
                        Intrinsics.X1ii(t2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight = (Weight) t2;
                        X1IIXO x1iixo2 = X1IIXO.OXO1;
                        String packageName2 = context.getPackageName();
                        Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                        x1iixo2.m1143I1(context, packageName2, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                    }
                    return;
                }
                return;
            }
            List<? extends T> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
            for (T t3 : list2) {
                Intrinsics.X1ii(t3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                Sleep sleep = (Sleep) t3;
                arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
            }
            BleSleep.Companion companion = BleSleep.Companion;
            T t4 = list.get(0);
            Intrinsics.X1ii(t4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
            List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) t4).getMAlgorithmType());
            if (listAnalyseSleep.isEmpty() || listAnalyseSleep.size() < 2) {
                return;
            }
            ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
            int size2 = listAnalyseSleep.size() - 2;
            if (size2 >= 0) {
                while (true) {
                    int mTime = listAnalyseSleep.get(i).getMTime();
                    int i2 = i + 1;
                    int mTime2 = listAnalyseSleep.get(i2).getMTime();
                    int mMode = listAnalyseSleep.get(i2).getMMode();
                    arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                    if (i == size2) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            X1IIXO x1iixo3 = X1IIXO.OXO1;
            String packageName3 = context.getPackageName();
            Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
            x1iixo3.i010I(context, packageName3, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
            return;
        }
        if (list.size() < 2 || (size = list.size() - 2) < 0) {
            return;
        }
        while (true) {
            T t5 = list.get(i);
            Intrinsics.X1ii(t5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
            Activity activity = (Activity) t5;
            int i3 = i + 1;
            T t6 = list.get(i3);
            Intrinsics.X1ii(t6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
            Activity activity2 = (Activity) t6;
            if (activity2.getMStep() > 0 && activity2.getMStep() > activity.getMStep()) {
                LogUtils.m11128d(activity2);
                LogUtils.m11128d(activity);
                X1IIXO x1iixo4 = X1IIXO.OXO1;
                String packageName4 = context.getPackageName();
                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                Field FIELD_STEPS = Field.FIELD_STEPS;
                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                String packageName5 = context.getPackageName();
                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                String packageName6 = context.getPackageName();
                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
            }
            if (i == size) {
                return;
            } else {
                i = i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void I0iXXO(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        SleepDao sleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();
        List<Sleep> listASC = sleepDao.getListASC();
        I0IIOi i0IIOi = new I0IIOi(sleepDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Sleep> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Sleep> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Sleep> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Sleep> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Sleep sleep2 = listASC.get(0);
                                Intrinsics.X1ii(sleep2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, sleep2.getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj2 : listASC) {
                                        Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj2;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj3 = listASC.get(i4);
                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj3;
                        int i5 = i4 + 1;
                        Object obj4 = listASC.get(i5);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj4;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Sleep> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(i0IIOi, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj5 : list4) {
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj5;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, str2);
                        HeartRate heartRate2 = (HeartRate) obj6;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj7;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj8;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj9;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj10;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, str3);
                        Sleep sleep3 = (Sleep) obj11;
                        sleep3.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep3.getMTime()));
                        uploadSleepData.setMode(sleep3.getMMode());
                        uploadSleepData.setSoft(sleep3.getMSoft());
                        uploadSleepData.setStrong(sleep3.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj12;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj13;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj14 : list4) {
                            Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj14;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj15;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadSleep.URL, obj, new Upload$upload$13(i0IIOi, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadSleep.URL, obj, new Upload$upload$13(i0IIOi, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: IO */
    public final void m38956IO(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        HrvDao hrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();
        List<Hrv> listASC = hrvDao.getListASC();
        IiI10X iiI10X = new IiI10X(hrvDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Hrv> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Hrv> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Hrv> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Hrv> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Hrv> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(iiI10X, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadHrv.URL, obj, new Upload$upload$13(iiI10X, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadHrv.URL, obj, new Upload$upload$13(iiI10X, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void IiI10X(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        BloodPressureDao bloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();
        List<BloodPressure> listASC = bloodPressureDao.getListASC();
        XO0O10 xo0o10 = new XO0O10(bloodPressureDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<BloodPressure> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<BloodPressure> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<BloodPressure> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<BloodPressure> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<BloodPressure> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(xo0o10, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadBloodPressure.URL, obj, new Upload$upload$13(xo0o10, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadBloodPressure.URL, obj, new Upload$upload$13(xo0o10, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void O00(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        BloodOxygenDao bloodOxygenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
        List<BloodOxygen> listASC = bloodOxygenDao.getListASC();
        C19080iO c19080iO = new C19080iO(bloodOxygenDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<BloodOxygen> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<BloodOxygen> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<BloodOxygen> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<BloodOxygen> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<BloodOxygen> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(c19080iO, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadBloodOxygen.URL, obj, new Upload$upload$13(c19080iO, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadBloodOxygen.URL, obj, new Upload$upload$13(c19080iO, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void O10IXXX0X(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        WorkoutDao workoutDao = MyDb.INSTANCE.getMDatabase().workoutDao();
        List<Workout> listASC = workoutDao.getListASC();
        I0iXXO i0iXXO = new I0iXXO(workoutDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Workout> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Workout> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Workout> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Workout> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Workout> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(i0iXXO, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadWorkout.URL, obj, new Upload$upload$13(i0iXXO, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadWorkout.URL, obj, new Upload$upload$13(i0iXXO, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OIX0iXi(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        LocationDao locationDao = MyDb.INSTANCE.getMDatabase().locationDao();
        List<Location> listASC = locationDao.getListASC();
        XOO0ii0 xOO0ii0 = new XOO0ii0(locationDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Location> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Location> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Location> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Location> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Location> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(xOO0ii0, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadLocation.URL, obj, new Upload$upload$13(xOO0ii0, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadLocation.URL, obj, new Upload$upload$13(xOO0ii0, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OIi0(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        HeartRateDao heartRateDao = MyDb.INSTANCE.getMDatabase().heartRateDao();
        List<HeartRate> listASC = heartRateDao.getListASC();
        O00 o00 = new O00(heartRateDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<HeartRate> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<HeartRate> it = listASC.iterator();
                        while (it.hasNext()) {
                            HeartRate next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<HeartRate> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<HeartRate> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<HeartRate> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(o00, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadHeartRate.URL, obj, new Upload$upload$13(o00, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadHeartRate.URL, obj, new Upload$upload$13(o00, listASC));
            }
        }
    }

    public final long OXO1(long j) {
        return (j - SMADataUploadData.defaultTime) / ((long) 1000);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void X1ii(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        WeightDao weightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        List<Weight> listASC = weightDao.getListASC();
        OIX0iXi oIX0iXi = new OIX0iXi(weightDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Weight> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Weight> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Weight> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Weight> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Weight weight : listASC) {
                                        Intrinsics.X1ii(weight, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight2 = weight;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight2.getMWeight(), weight2.getMTime(), weight2.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj3 = listASC.get(i4);
                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj3;
                        int i5 = i4 + 1;
                        Object obj4 = listASC.get(i5);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj4;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Weight> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(oIX0iXi, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj5 : list4) {
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj5;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, str2);
                        HeartRate heartRate2 = (HeartRate) obj6;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj7;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj8;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj9;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj10;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, str3);
                        Sleep sleep2 = (Sleep) obj11;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight3 = (Weight) obj12;
                        weight3.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight3.getMTime()));
                        uploadWeightData.setWeight(weight3.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj13;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj14 : list4) {
                            Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj14;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj15;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadWeight.URL, obj, new Upload$upload$13(oIX0iXi, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadWeight.URL, obj, new Upload$upload$13(oIX0iXi, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0888  */
    /* JADX WARN: Code duplicated, block: B:23:0x0164  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ <T> void XIi00iiXO(Context context, String str, String str2, List<? extends T> list, p96<T> p96Var) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str3;
        String str4;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        Intrinsics.X1ii(list, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<? extends T> list2 = list;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list2.isEmpty()));
        while (!list2.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str6 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    list2 = list2;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                        Iterator<? extends T> it = list.iterator();
                        while (it.hasNext()) {
                            T next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<? extends T> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                                List<? extends T> list3 = list;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
                                Iterator<T> it3 = list3.iterator();
                                while (it3.hasNext()) {
                                    T next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                T t = list.get(0);
                                Intrinsics.X1ii(t, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) t).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str4 = str6;
                                            int i3 = i2 + 1;
                                            str3 = str5;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list4 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str6 = str4;
                                            i2 = i3;
                                            listAnalyseSleep = list4;
                                            str5 = str3;
                                        }
                                    } else {
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                                    for (T t2 : list) {
                                        Intrinsics.X1ii(t2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) t2;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (list.size() >= 2 && (size = list.size() - 2) >= 0) {
                    list2 = list2;
                    int i4 = 0;
                    while (true) {
                        T t3 = list.get(i4);
                        Intrinsics.X1ii(t3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) t3;
                        int i5 = i4 + 1;
                        T t4 = list.get(i5);
                        Intrinsics.X1ii(t4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) t4;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list2 = list2;
                }
                cls2 = cls3;
                cls = cls4;
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list2 = list2;
                cls2 = cls3;
                cls = cls4;
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<? extends T> list5 = list;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list5));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(list, new Upload$upload$1(p96Var, list));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t5 : list5) {
                        Intrinsics.X1ii(t5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) t5;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t6 : list5) {
                        Intrinsics.X1ii(t6, str3);
                        HeartRate heartRate2 = (HeartRate) t6;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t7 : list5) {
                        Intrinsics.X1ii(t7, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) t7;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t8 : list5) {
                        Intrinsics.X1ii(t8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) t8;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t9 : list5) {
                        Intrinsics.X1ii(t9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) t9;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t10 : list5) {
                        Intrinsics.X1ii(t10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) t10;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t11 : list5) {
                        Intrinsics.X1ii(t11, str4);
                        Sleep sleep2 = (Sleep) t11;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t12 : list5) {
                        Intrinsics.X1ii(t12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) t12;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                    for (T t13 : list5) {
                        Intrinsics.X1ii(t13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) t13;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                        for (T t14 : list5) {
                            Intrinsics.X1ii(t14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) t14;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(list))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list5, 10));
                        for (T t15 : list5) {
                            Intrinsics.X1ii(t15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) t15;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(str2, obj, new Upload$upload$13(p96Var, list));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(str2, obj, new Upload$upload$13(p96Var, list));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x017c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void XO0O10(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        AlipayBindInfoDao alipayBindInfoDao = MyDb.INSTANCE.getMDatabase().alipayBindInfoDao();
        LogUtils.m11128d("DataWorker upload data uploadAlipayBindInfoData");
        List<AlipayBindInfo> listASC = alipayBindInfoDao.getListASC();
        XIi00iiXO xIi00iiXO = new XIi00iiXO(alipayBindInfoDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<AlipayBindInfo> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<AlipayBindInfo> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<AlipayBindInfo> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<AlipayBindInfo> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<AlipayBindInfo> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(xIi00iiXO, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadAlipayBindInfo.URL, obj, new Upload$upload$13(xIi00iiXO, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadAlipayBindInfo.URL, obj, new Upload$upload$13(xIi00iiXO, listASC));
            }
        }
    }

    public final void XOO0ii0(@aa1 Context context) throws InterruptedException {
        Intrinsics.X0O(context, "context");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        LogUtils.m11128d("DataWorker upload data " + appUser2.getIdentity());
        if (appUser2.getIdentity().length() > 0) {
            m38957iO(context, appUser2.getIdentity());
            OIi0(context, appUser2.getIdentity());
            IiI10X(context, appUser2.getIdentity());
            OIX0iXi(context, appUser2.getIdentity());
            I0iXXO(context, appUser2.getIdentity());
            X1ii(context, appUser2.getIdentity());
            O10IXXX0X(context, appUser2.getIdentity());
            XXI(context, appUser2.getIdentity());
            O00(context, appUser2.getIdentity());
            m38956IO(context, appUser2.getIdentity());
        }
        XO0O10(context, appUser2.getIdentity());
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void XXI(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        TemperatureDao temperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
        List<Temperature> listASC = temperatureDao.getListASC();
        OIi0 oIi0 = new OIi0(temperatureDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Temperature> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Temperature> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Temperature> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Temperature> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Object obj4 = listASC.get(i4);
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity = (Activity) obj4;
                        int i5 = i4 + 1;
                        Object obj5 = listASC.get(i5);
                        Intrinsics.X1ii(obj5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = (Activity) obj5;
                        if (activity2.getMStep() > 0) {
                            i = i5;
                            if (activity2.getMStep() > activity.getMStep()) {
                                LogUtils.m11128d(activity2);
                                LogUtils.m11128d(activity);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity2.getMStep() - activity.getMStep()) / 1.0f, activity.getMTime(), activity2.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity2.getMCalorie() - activity.getMCalorie()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity2.getMDistance() - activity.getMDistance()) / 10000.0f, activity.getMTime(), activity2.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Temperature> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(oIi0, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity3 = (Activity) obj6;
                        activity3.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity3.getMTime()));
                        uploadActivityData.setMode(activity3.getMMode());
                        uploadActivityData.setState(activity3.getMState());
                        uploadActivityData.setStep(activity3.getMStep());
                        uploadActivityData.setCalorie(activity3.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity3.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity3.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, str2);
                        HeartRate heartRate2 = (HeartRate) obj7;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj8;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj9;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj10;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj11;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, str3);
                        Sleep sleep2 = (Sleep) obj12;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj13 : list4) {
                        Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj13;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj14 : list4) {
                        Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj14;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj15 : list4) {
                            Intrinsics.X1ii(obj15, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj15;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj16 : list4) {
                            Intrinsics.X1ii(obj16, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj16;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadTemperature.URL, obj, new Upload$upload$13(oIi0, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadTemperature.URL, obj, new Upload$upload$13(oIi0, listASC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0897  */
    /* JADX WARN: Code duplicated, block: B:23:0x0173  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: iO */
    public final void m38957iO(Context context, String str) throws InterruptedException {
        Class<BloodPressure> cls;
        Class<Sleep> cls2;
        String str2;
        String str3;
        boolean z;
        UploadData uploadData;
        Object obj;
        UploadData uploadData2;
        int size;
        int i;
        ActivityDao activityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        List<Activity> listASC = activityDao.getListASC();
        OXO1 oxo1 = new OXO1(activityDao);
        Intrinsics.X1ii(listASC, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        List<Activity> list = listASC;
        LogUtils.m11130i("HEALTH_CONNECT " + (!list.isEmpty()));
        while (!list.isEmpty()) {
            SystemClock.sleep(15000L);
            Class<Sleep> cls3 = Sleep.class;
            Class<BloodPressure> cls4 = BloodPressure.class;
            String str4 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
            String str5 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            if (a01.OXO1.IiI10X().getBoolean(b01.X1ii)) {
                if (!Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    list = list;
                    if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        Iterator<Activity> it = listASC.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            Intrinsics.X1ii(next, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
                            HeartRate heartRate = (HeartRate) next;
                            X1IIXO x1iixo = X1IIXO.OXO1;
                            String packageName = context.getPackageName();
                            Intrinsics.O10IXXX0X(packageName, "getPackageName(...)");
                            DataType TYPE_HEART_RATE_BPM = DataType.TYPE_HEART_RATE_BPM;
                            Iterator<Activity> it2 = it;
                            Intrinsics.O10IXXX0X(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
                            Field FIELD_BPM = Field.FIELD_BPM;
                            Intrinsics.O10IXXX0X(FIELD_BPM, "FIELD_BPM");
                            x1iixo.m1143I1(context, packageName, TYPE_HEART_RATE_BPM, "HeartRateData", FIELD_BPM, heartRate.getMBpm(), heartRate.getMTime(), heartRate.getMTime() + 1000);
                            it = it2;
                        }
                    } else {
                        if (!cls4.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                            if (cls3.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                List<Activity> list2 = listASC;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    Intrinsics.X1ii(next2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                    Sleep sleep = (Sleep) next2;
                                    arrayList.add(new BleSleep((int) (sleep.getMTime() / ((long) 1000)), sleep.getMMode(), sleep.getMSoft(), sleep.getMStrong()));
                                    it3 = it3;
                                    cls3 = cls3;
                                    cls4 = cls4;
                                }
                                cls2 = cls3;
                                cls = cls4;
                                BleSleep.Companion companion = BleSleep.Companion;
                                Object obj2 = listASC.get(0);
                                Intrinsics.X1ii(obj2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
                                List<BleSleep> listAnalyseSleep = companion.analyseSleep(arrayList, ((Sleep) obj2).getMAlgorithmType());
                                if (!listAnalyseSleep.isEmpty() && listAnalyseSleep.size() >= 2) {
                                    ArrayList<X1IIXO.OXO1> arrayList2 = new ArrayList<>();
                                    int size2 = listAnalyseSleep.size() - 2;
                                    if (size2 >= 0) {
                                        int i2 = 0;
                                        while (true) {
                                            int mTime = listAnalyseSleep.get(i2).getMTime();
                                            str3 = str5;
                                            int i3 = i2 + 1;
                                            str2 = str4;
                                            int mTime2 = listAnalyseSleep.get(i3).getMTime();
                                            List<BleSleep> list3 = listAnalyseSleep;
                                            int mMode = listAnalyseSleep.get(i3).getMMode();
                                            arrayList2.add(new X1IIXO.OXO1(mTime, mTime2, mMode != 1 ? mMode != 2 ? FitnessActivities.SLEEP_AWAKE : FitnessActivities.SLEEP_LIGHT : FitnessActivities.SLEEP_DEEP));
                                            if (i2 == size2) {
                                                break;
                                            }
                                            str5 = str3;
                                            i2 = i3;
                                            listAnalyseSleep = list3;
                                            str4 = str2;
                                        }
                                    } else {
                                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                    }
                                    X1IIXO x1iixo2 = X1IIXO.OXO1;
                                    String packageName2 = context.getPackageName();
                                    Intrinsics.O10IXXX0X(packageName2, "getPackageName(...)");
                                    x1iixo2.i010I(context, packageName2, "SleepData", "SleepData to GoogleFit", "SleepData by " + context.getString(R.string.app_name), arrayList2);
                                }
                            } else {
                                cls2 = cls3;
                                cls = cls4;
                                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                                if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                                    for (Object obj3 : listASC) {
                                        Intrinsics.X1ii(obj3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                                        Weight weight = (Weight) obj3;
                                        X1IIXO x1iixo3 = X1IIXO.OXO1;
                                        String packageName3 = context.getPackageName();
                                        Intrinsics.O10IXXX0X(packageName3, "getPackageName(...)");
                                        DataType TYPE_WEIGHT = DataType.TYPE_WEIGHT;
                                        Intrinsics.O10IXXX0X(TYPE_WEIGHT, "TYPE_WEIGHT");
                                        Field FIELD_WEIGHT = Field.FIELD_WEIGHT;
                                        Intrinsics.O10IXXX0X(FIELD_WEIGHT, "FIELD_WEIGHT");
                                        x1iixo3.m1143I1(context, packageName3, TYPE_WEIGHT, "WeightData", FIELD_WEIGHT, weight.getMWeight(), weight.getMTime(), weight.getMTime() + 1000);
                                    }
                                }
                            }
                        }
                        str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                        str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
                    }
                } else if (listASC.size() >= 2 && (size = listASC.size() - 2) >= 0) {
                    list = list;
                    int i4 = 0;
                    while (true) {
                        Activity activity = listASC.get(i4);
                        Intrinsics.X1ii(activity, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity2 = activity;
                        int i5 = i4 + 1;
                        Activity activity3 = listASC.get(i5);
                        Intrinsics.X1ii(activity3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity4 = activity3;
                        if (activity4.getMStep() > 0) {
                            i = i5;
                            if (activity4.getMStep() > activity2.getMStep()) {
                                LogUtils.m11128d(activity4);
                                LogUtils.m11128d(activity2);
                                X1IIXO x1iixo4 = X1IIXO.OXO1;
                                String packageName4 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName4, "getPackageName(...)");
                                DataType TYPE_STEP_COUNT_DELTA = DataType.TYPE_STEP_COUNT_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
                                Field FIELD_STEPS = Field.FIELD_STEPS;
                                Intrinsics.O10IXXX0X(FIELD_STEPS, "FIELD_STEPS");
                                x1iixo4.m1143I1(context, packageName4, TYPE_STEP_COUNT_DELTA, "StepData", FIELD_STEPS, (activity4.getMStep() - activity2.getMStep()) / 1.0f, activity2.getMTime(), activity4.getMTime());
                                String packageName5 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName5, "getPackageName(...)");
                                DataType TYPE_CALORIES_EXPENDED = DataType.TYPE_CALORIES_EXPENDED;
                                Intrinsics.O10IXXX0X(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
                                Field FIELD_CALORIES = Field.FIELD_CALORIES;
                                Intrinsics.O10IXXX0X(FIELD_CALORIES, "FIELD_CALORIES");
                                x1iixo4.m1143I1(context, packageName5, TYPE_CALORIES_EXPENDED, "CaloriesData", FIELD_CALORIES, (activity4.getMCalorie() - activity2.getMCalorie()) / 10000.0f, activity2.getMTime(), activity4.getMTime());
                                String packageName6 = context.getPackageName();
                                Intrinsics.O10IXXX0X(packageName6, "getPackageName(...)");
                                DataType TYPE_DISTANCE_DELTA = DataType.TYPE_DISTANCE_DELTA;
                                Intrinsics.O10IXXX0X(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
                                Field FIELD_DISTANCE = Field.FIELD_DISTANCE;
                                Intrinsics.O10IXXX0X(FIELD_DISTANCE, "FIELD_DISTANCE");
                                x1iixo4.m1143I1(context, packageName6, TYPE_DISTANCE_DELTA, "DistanceData", FIELD_DISTANCE, (activity4.getMDistance() - activity2.getMDistance()) / 10000.0f, activity2.getMTime(), activity4.getMTime());
                            }
                        } else {
                            i = i5;
                        }
                        if (i4 == size) {
                            break;
                        } else {
                            i4 = i;
                        }
                    }
                } else {
                    list = list;
                }
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            } else {
                list = list;
                cls2 = cls3;
                cls = cls4;
                str2 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
                str3 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
            }
            List<Activity> list4 = listASC;
            BaseApplication.f20378I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(list4));
            I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
            if (i72.OXO1.OX0X1O10X()) {
                UploadOSSWorker.OXO1.OIX0iXi(listASC, new Upload$upload$1(oxo1, listASC));
            } else {
                if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData3 = new UploadData();
                    uploadData3.setIdentity(str);
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj4 : list4) {
                        Intrinsics.X1ii(obj4, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
                        Activity activity5 = (Activity) obj4;
                        activity5.setMIsSync(1);
                        UploadActivityData uploadActivityData = new UploadActivityData();
                        uploadActivityData.setTime(OXO1.OXO1(activity5.getMTime()));
                        uploadActivityData.setMode(activity5.getMMode());
                        uploadActivityData.setState(activity5.getMState());
                        uploadActivityData.setStep(activity5.getMStep());
                        uploadActivityData.setCalorie(activity5.getMCalorie() / 10000);
                        uploadActivityData.setDistance(activity5.getMDistance() / 10000);
                        uploadActivityData.set_delete(activity5.getMIsDelete());
                        arrayList3.add(uploadActivityData);
                    }
                    uploadData3.setData(arrayList3);
                    uploadData2 = uploadData3;
                } else if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData4 = new UploadData();
                    uploadData4.setIdentity(str);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj5 : list4) {
                        Intrinsics.X1ii(obj5, str2);
                        HeartRate heartRate2 = (HeartRate) obj5;
                        heartRate2.setMIsSync(1);
                        UploadHeartRateData uploadHeartRateData = new UploadHeartRateData();
                        uploadHeartRateData.setTime(OXO1.OXO1(heartRate2.getMTime()));
                        uploadHeartRateData.setBpm(heartRate2.getMBpm());
                        arrayList4.add(uploadHeartRateData);
                    }
                    uploadData4.setData(arrayList4);
                    uploadData2 = uploadData4;
                } else if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData5 = new UploadData();
                    uploadData5.setIdentity(str);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj6 : list4) {
                        Intrinsics.X1ii(obj6, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
                        Hrv hrv = (Hrv) obj6;
                        hrv.setMIsSync(1);
                        UploadHrvData uploadHrvData = new UploadHrvData();
                        uploadHrvData.setTime(OXO1.OXO1(hrv.getMTime()));
                        uploadHrvData.setValue(hrv.getMValue());
                        uploadHrvData.setAvg_value(hrv.getMAvgValue());
                        arrayList5.add(uploadHrvData);
                    }
                    uploadData5.setData(arrayList5);
                    uploadData2 = uploadData5;
                } else if (cls.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData6 = new UploadData();
                    uploadData6.setIdentity(str);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj7 : list4) {
                        Intrinsics.X1ii(obj7, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
                        BloodPressure bloodPressure = (BloodPressure) obj7;
                        bloodPressure.setMIsSync(1);
                        UploadBloodPressureData uploadBloodPressureData = new UploadBloodPressureData();
                        uploadBloodPressureData.setTime(OXO1.OXO1(bloodPressure.getMTime()));
                        uploadBloodPressureData.setSystolic(bloodPressure.getMSystolic());
                        uploadBloodPressureData.setDiastolic(bloodPressure.getMDiastolic());
                        arrayList6.add(uploadBloodPressureData);
                    }
                    uploadData6.setData(arrayList6);
                    uploadData2 = uploadData6;
                } else if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData7 = new UploadData();
                    uploadData7.setIdentity(str);
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj8 : list4) {
                        Intrinsics.X1ii(obj8, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
                        BloodOxygen bloodOxygen = (BloodOxygen) obj8;
                        bloodOxygen.setMIsSync(1);
                        UploadBloodOxygenData uploadBloodOxygenData = new UploadBloodOxygenData();
                        uploadBloodOxygenData.setTime(OXO1.OXO1(bloodOxygen.getMTime()));
                        uploadBloodOxygenData.setValue(bloodOxygen.getMValue());
                        arrayList7.add(uploadBloodOxygenData);
                    }
                    uploadData7.setData(arrayList7);
                    uploadData2 = uploadData7;
                } else if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData8 = new UploadData();
                    uploadData8.setIdentity(str);
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj9 : list4) {
                        Intrinsics.X1ii(obj9, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
                        Location location = (Location) obj9;
                        location.setMIsSync(1);
                        UploadLocationData uploadLocationData = new UploadLocationData();
                        uploadLocationData.setTime(OXO1.OXO1(location.getMTime()));
                        uploadLocationData.setAltitude(location.getMAltitude());
                        uploadLocationData.setLongitude(location.getMLongitude());
                        uploadLocationData.setLatitude(location.getMLatitude());
                        uploadLocationData.setSource(location.getMSource());
                        arrayList8.add(uploadLocationData);
                    }
                    uploadData8.setData(arrayList8);
                    uploadData2 = uploadData8;
                } else if (cls2.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData9 = new UploadData();
                    uploadData9.setIdentity(str);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj10 : list4) {
                        Intrinsics.X1ii(obj10, str3);
                        Sleep sleep2 = (Sleep) obj10;
                        sleep2.setMIsSync(1);
                        UploadSleepData uploadSleepData = new UploadSleepData();
                        uploadSleepData.setTime(OXO1.OXO1(sleep2.getMTime()));
                        uploadSleepData.setMode(sleep2.getMMode());
                        uploadSleepData.setSoft(sleep2.getMSoft());
                        uploadSleepData.setStrong(sleep2.getMStrong());
                        arrayList9.add(uploadSleepData);
                    }
                    uploadData9.setData(arrayList9);
                    uploadData2 = uploadData9;
                } else if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData10 = new UploadData();
                    uploadData10.setIdentity(str);
                    ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj11 : list4) {
                        Intrinsics.X1ii(obj11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
                        Weight weight2 = (Weight) obj11;
                        weight2.setMIsSync(1);
                        UploadWeightData uploadWeightData = new UploadWeightData();
                        uploadWeightData.setTime(OXO1.OXO1(weight2.getMTime()));
                        uploadWeightData.setWeight(weight2.getMWeight());
                        arrayList10.add(uploadWeightData);
                    }
                    uploadData10.setData(arrayList10);
                    uploadData2 = uploadData10;
                } else if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                    UploadData uploadData11 = new UploadData();
                    uploadData11.setIdentity(str);
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                    for (Object obj12 : list4) {
                        Intrinsics.X1ii(obj12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
                        Workout workout = (Workout) obj12;
                        workout.setMIsSync(1);
                        UploadWorkoutData uploadWorkoutData = new UploadWorkoutData();
                        Upload upload = OXO1;
                        uploadWorkoutData.setStart(upload.OXO1(workout.getMStart()));
                        uploadWorkoutData.setEnd(upload.OXO1(workout.getMEnd()));
                        uploadWorkoutData.setDuration(workout.getMDuration());
                        uploadWorkoutData.setAltitude(workout.getMAltitude());
                        uploadWorkoutData.setAirPressure(workout.getMAirPressure());
                        uploadWorkoutData.setSpm(workout.getMSpm());
                        uploadWorkoutData.setMode(workout.getMMode());
                        uploadWorkoutData.setStep(workout.getMStep());
                        uploadWorkoutData.setDistance(workout.getMDistance());
                        uploadWorkoutData.setCalorie(workout.getMCalorie());
                        uploadWorkoutData.setSpeed(workout.getMSpeed());
                        uploadWorkoutData.setPace(workout.getMPace());
                        uploadWorkoutData.set_delete(workout.getMIsDelete());
                        uploadWorkoutData.setMAvgBpm(workout.getMAvgBpm());
                        uploadWorkoutData.setMMaxBpm(workout.getMMaxBpm());
                        uploadWorkoutData.setMMinBpm(workout.getMMinBpm());
                        uploadWorkoutData.setMMaxSpm(workout.getMMaxSpm());
                        uploadWorkoutData.setMMinSpm(workout.getMMinSpm());
                        uploadWorkoutData.setMMaxPace(workout.getMMaxPace());
                        uploadWorkoutData.setMMinPace(workout.getMMinPace());
                        uploadWorkoutData.setMMaxAltitude(workout.getMMaxAltitude());
                        uploadWorkoutData.setMMinAltitude(workout.getMMinAltitude());
                        uploadWorkoutData.setMMinStress(workout.getMMinStress());
                        uploadWorkoutData.setMMaxStress(workout.getMMaxStress());
                        uploadWorkoutData.setMAvgStress(workout.getMAvgStress());
                        uploadWorkoutData.setMSource(workout.getMSource());
                        uploadWorkoutData.setMFeel(workout.getMFeel());
                        uploadWorkoutData.setMPrototype(workout.getMPrototype());
                        uploadWorkoutData.setMFirmwareFlag(workout.getMFirmwareFlag());
                        uploadWorkoutData.setMBleName(workout.getMBleName());
                        arrayList11.add(uploadWorkoutData);
                    }
                    uploadData11.setData(arrayList11);
                    uploadData2 = uploadData11;
                } else {
                    if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData12 = new UploadData();
                        uploadData12.setIdentity(str);
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj13 : list4) {
                            Intrinsics.X1ii(obj13, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
                            Temperature temperature = (Temperature) obj13;
                            temperature.setMIsSync(1);
                            UploadTemperatureData uploadTemperatureData = new UploadTemperatureData();
                            uploadTemperatureData.setTime(OXO1.OXO1(temperature.getMTime()));
                            uploadTemperatureData.setTemperature(temperature.getMTemperature());
                            arrayList12.add(uploadTemperatureData);
                        }
                        uploadData12.setData(arrayList12);
                        uploadData2 = uploadData12;
                    } else if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(listASC))) {
                        UploadData uploadData13 = new UploadData();
                        uploadData13.setIdentity(str);
                        ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list4, 10));
                        for (Object obj14 : list4) {
                            Intrinsics.X1ii(obj14, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
                            AlipayBindInfo alipayBindInfo = (AlipayBindInfo) obj14;
                            alipayBindInfo.setMIsSync(1);
                            UploadAlipayBindInfoData uploadAlipayBindInfoData = new UploadAlipayBindInfoData();
                            uploadAlipayBindInfoData.setTime(OXO1.OXO1(alipayBindInfo.getMTime()));
                            uploadAlipayBindInfoData.setBleName(alipayBindInfo.getMBleName());
                            uploadAlipayBindInfoData.setFirmwareFlag(alipayBindInfo.getMFirmwareFlag());
                            uploadAlipayBindInfoData.setMacAddress(alipayBindInfo.getMMacAddress());
                            uploadAlipayBindInfoData.setFirmwareVersion(alipayBindInfo.getMFirmwareVersion());
                            uploadAlipayBindInfoData.setAppVersion(alipayBindInfo.getMAppVersion());
                            uploadAlipayBindInfoData.setResult(alipayBindInfo.getMResult());
                            arrayList13.add(uploadAlipayBindInfoData);
                        }
                        z = true;
                        uploadData13.setData(arrayList13);
                        uploadData = uploadData13;
                    } else {
                        z = true;
                        uploadData = null;
                    }
                    NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
                    obj = uploadData;
                    if (uploadData == null) {
                        Intrinsics.XXO(WorkInitializer.f51286I1);
                        obj = Unit.OXO1;
                    }
                    netWorkUtils.postJsonExecute(UploadActivity.URL, obj, new Upload$upload$13(oxo1, listASC));
                }
                z = true;
                uploadData = uploadData2;
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                obj = uploadData;
                if (uploadData == null) {
                    Intrinsics.XXO(WorkInitializer.f51286I1);
                    obj = Unit.OXO1;
                }
                netWorkUtils2.postJsonExecute(UploadActivity.URL, obj, new Upload$upload$13(oxo1, listASC));
            }
        }
    }
}
