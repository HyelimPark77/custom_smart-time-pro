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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.dao.AlipayBindInfoDao;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.db.entity.AlipayBindInfo;
import com.sma.smartv3.db.entity.BloodOxygen;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.db.entity.Workout;
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
    public static final Upload OXO1 = null;

    public static final class I0IIOi implements p96<Sleep> {
        public final /* synthetic */ SleepDao OXO1;

        public I0IIOi(SleepDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Sleep> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Sleep> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class I0iXXO implements p96<Workout> {
        public final /* synthetic */ WorkoutDao OXO1;

        public I0iXXO(WorkoutDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Workout> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Workout> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class IiI10X implements p96<Hrv> {
        public final /* synthetic */ HrvDao OXO1;

        public IiI10X(HrvDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Hrv> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Hrv> getList() {
            List<Hrv> r0 = this.OXO1.getListASC();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.Hrv>");
            return (ArrayList) r0;
        }
    }

    public static final class O00 implements p96<HeartRate> {
        public final /* synthetic */ HeartRateDao OXO1;

        public O00(HeartRateDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<HeartRate> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<HeartRate> getList() {
            List<HeartRate> r0 = this.OXO1.getListASC();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.HeartRate>");
            return (ArrayList) r0;
        }
    }

    public static final class OIX0iXi implements p96<Weight> {
        public final /* synthetic */ WeightDao OXO1;

        public OIX0iXi(WeightDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Weight> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Weight> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class OIi0 implements p96<Temperature> {
        public final /* synthetic */ TemperatureDao OXO1;

        public OIi0(TemperatureDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Temperature> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Temperature> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class OXO1 implements p96<Activity> {
        public final /* synthetic */ ActivityDao OXO1;

        public OXO1(ActivityDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Activity> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Activity> getList() {
            List<Activity> r0 = this.OXO1.getListASC();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.Activity>");
            return (ArrayList) r0;
        }
    }

    public static final class XIi00iiXO implements p96<AlipayBindInfo> {
        public final /* synthetic */ AlipayBindInfoDao OXO1;

        public XIi00iiXO(AlipayBindInfoDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<AlipayBindInfo> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<AlipayBindInfo> getList() {
            List<AlipayBindInfo> r0 = this.OXO1.getListASC();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.AlipayBindInfo>");
            return (ArrayList) r0;
        }
    }

    public static final class XO0O10 implements p96<BloodPressure> {
        public final /* synthetic */ BloodPressureDao OXO1;

        public XO0O10(BloodPressureDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<BloodPressure> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<BloodPressure> getList() {
            List<BloodPressure> r0 = this.OXO1.getListASC();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.BloodPressure>");
            return (ArrayList) r0;
        }
    }

    public static final class XOO0ii0 implements p96<Location> {
        public final /* synthetic */ LocationDao OXO1;

        public XOO0ii0(LocationDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<Location> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<Location> getList() {
            return this.OXO1.getListASC();
        }
    }

    public static final class iO implements p96<BloodOxygen> {
        public final /* synthetic */ BloodOxygenDao OXO1;

        public iO(BloodOxygenDao r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public void OXO1(ArrayList<BloodOxygen> r2) {
            Intrinsics.X0O(r2, "data");
            this.OXO1.update(r2);
        }

        @Override // com.android.mltcode.paycertificationapi.p96
        public List<BloodOxygen> getList() {
            List<BloodOxygen> r0 = this.OXO1.getListASC();
            Intrinsics.X1ii(r0, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.db.entity.BloodOxygen>");
            return (ArrayList) r0;
        }
    }

    static {
        OXO1 = new Upload();
    }

    public Upload() {
    }

    public final /* synthetic */ <T> void I0IIOi(Context r31, List<? extends T> r32) {
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == false) goto L57;
        int r2 = 0;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r32)) == false) goto L20;
        if (r32.size() < 2) goto L67;
        int r1 = r32.size() - 2;
        if (r1 < 0) goto L63;
    L11:
        T r3 = r32.get(r2);
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r4 = (Activity) r3;
        int r6 = r2 + 1;
        T r7 = r32.get(r6);
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r8 = (Activity) r7;
        if (r8.getMStep() > 0) goto L14;
    L17:
        if (r2 == r1) goto L69;
        r2 = r6;
        goto L11
    L69:
        return;
    L14:
        if (r8.getMStep() <= r4.getMStep()) goto L17;
        LogUtils.d(new Object[]{r8});
        LogUtils.d(new Object[]{r4});
        X1IIXO r9 = X1IIXO.OXO1;
        String r10 = r31.getPackageName();
        Intrinsics.O10IXXX0X(r10, "getPackageName(...)");
        DataType r11 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r11, "TYPE_STEP_COUNT_DELTA");
        Field r13 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r13, "FIELD_STEPS");
        r9.I1(r31, r10, r11, "StepData", r13, (r8.getMStep() - r4.getMStep()) / 1.0f, r4.getMTime(), r8.getMTime());
        String r12 = r31.getPackageName();
        Intrinsics.O10IXXX0X(r12, "getPackageName(...)");
        DataType r14 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r14, "TYPE_CALORIES_EXPENDED");
        Field r15 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r15, "FIELD_CALORIES");
        r9.I1(r31, r12, r14, "CaloriesData", r15, (r8.getMCalorie() - r4.getMCalorie()) / 10000.0f, r4.getMTime(), r8.getMTime());
        String r16 = r31.getPackageName();
        Intrinsics.O10IXXX0X(r16, "getPackageName(...)");
        DataType r17 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r17, "TYPE_DISTANCE_DELTA");
        Field r18 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r18, "FIELD_DISTANCE");
        r9.I1(r31, r16, r17, "DistanceData", r18, (r8.getMDistance() - r4.getMDistance()) / 10000.0f, r4.getMTime(), r8.getMTime());
        goto L17
    L63:
        return;
    L67:
        return;
    L20:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r32)) == false) goto L26;
        Iterator<? extends T> r0 = r32.iterator();
    L23:
        if (r0.hasNext() == false) goto L70;
        T r5 = r0.next();
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r19 = (HeartRate) r5;
        X1IIXO r110 = X1IIXO.OXO1;
        String r20 = r31.getPackageName();
        Intrinsics.O10IXXX0X(r20, "getPackageName(...)");
        DataType r21 = DataType.TYPE_HEART_RATE_BPM;
        Intrinsics.O10IXXX0X(r21, "TYPE_HEART_RATE_BPM");
        Field r22 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r22, "FIELD_BPM");
        r110.I1(r31, r20, r21, "HeartRateData", r22, r19.getMBpm(), r19.getMTime(), r19.getMTime() + 1000);
        goto L23
    L70:
        return;
    L26:
        if (BloodPressure.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r32)) == false) goto L28;
        return;
    L28:
        if (Sleep.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r32)) == false) goto L52;
        List<? extends T> r23 = r32;
        ArrayList r24 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r23, 10));
        Iterator<T> r25 = r23.iterator();
    L31:
        if (r25.hasNext() == false) goto L33;
        T r26 = r25.next();
        Intrinsics.X1ii(r26, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r27 = (Sleep) r26;
        r24.add(new BleSleep((int) (r27.getMTime() / ((long) 1000)), r27.getMMode(), r27.getMSoft(), r27.getMStrong()));
        goto L31
    L33:
        BleSleep.Companion r28 = BleSleep.Companion;
        T r29 = r32.get(0);
        Intrinsics.X1ii(r29, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r30 = r28.analyseSleep(r24, ((Sleep) r29).getMAlgorithmType());
        if (r30.isEmpty() == false) goto L36;
        return;
    L36:
        if (r30.size() < 2) goto L68;
        ArrayList<X1IIXO.OXO1> r33 = new ArrayList();
        int r34 = r30.size() - 2;
        if (r34 < 0) goto L49;
    L40:
        int r35 = r30.get(r2).getMTime();
        int r36 = r2 + 1;
        int r37 = r30.get(r36).getMTime();
        int r111 = r30.get(r36).getMMode();
        if (r111 == 1) goto L45;
        if (r111 == 2) goto L44;
        String r112 = FitnessActivities.SLEEP_AWAKE;
    L46:
        r33.add(new X1IIXO.OXO1(r35, r37, r112));
        if (r2 == r34) goto L49;
        r2 = r36;
        goto L40
    L44:
        r112 = FitnessActivities.SLEEP_LIGHT;
        goto L46
    L45:
        r112 = FitnessActivities.SLEEP_DEEP;
    L49:
        X1IIXO r113 = X1IIXO.OXO1;
        String r38 = r31.getPackageName();
        Intrinsics.O10IXXX0X(r38, "getPackageName(...)");
        r113.i010I(r31, r38, "SleepData", "SleepData to GoogleFit", "SleepData by " + r31.getString(R.string.app_name), r33);
        return;
    L68:
        return;
    L52:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r32)) == false) goto L66;
        Iterator<? extends T> r39 = r32.iterator();
    L55:
        if (r39.hasNext() == false) goto L71;
        T r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r41 = (Weight) r40;
        X1IIXO r114 = X1IIXO.OXO1;
        String r42 = r31.getPackageName();
        Intrinsics.O10IXXX0X(r42, "getPackageName(...)");
        DataType r43 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r43, "TYPE_WEIGHT");
        Field r44 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r44, "FIELD_WEIGHT");
        r114.I1(r31, r42, r43, "WeightData", r44, r41.getMWeight(), r41.getMTime(), r41.getMTime() + 1000);
        goto L55
    L71:
        return;
    L66:
        return;
    }

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
    public final void I0iXXO(Context r43, String r44) {
        SleepDao r1 = MyDb.INSTANCE.getMDatabase().sleepDao();
        List<Sleep> r2 = r1.getListASC();
        I0IIOi r3 = new I0IIOi(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Sleep> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Sleep> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadSleep.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Sleep> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Sleep> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Sleep> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Sleep r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, r100.getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Sleep> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void IO(Context r43, String r44) {
        HrvDao r1 = MyDb.INSTANCE.getMDatabase().hrvDao();
        List<Hrv> r2 = r1.getListASC();
        IiI10X r3 = new IiI10X(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Hrv> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Hrv> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadHrv.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Hrv> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Hrv> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Hrv> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Hrv> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void IiI10X(Context r43, String r44) {
        BloodPressureDao r1 = MyDb.INSTANCE.getMDatabase().bloodPressureDao();
        List<BloodPressure> r2 = r1.getListASC();
        XO0O10 r3 = new XO0O10(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<BloodPressure> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<BloodPressure> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadBloodPressure.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<BloodPressure> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<BloodPressure> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<BloodPressure> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<BloodPressure> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void O00(Context r43, String r44) {
        BloodOxygenDao r1 = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
        List<BloodOxygen> r2 = r1.getListASC();
        iO r3 = new iO(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<BloodOxygen> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<BloodOxygen> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadBloodOxygen.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<BloodOxygen> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<BloodOxygen> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<BloodOxygen> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<BloodOxygen> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void O10IXXX0X(Context r43, String r44) {
        WorkoutDao r1 = MyDb.INSTANCE.getMDatabase().workoutDao();
        List<Workout> r2 = r1.getListASC();
        I0iXXO r3 = new I0iXXO(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Workout> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Workout> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadWorkout.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Workout> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Workout> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Workout> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Workout> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void OIX0iXi(Context r43, String r44) {
        LocationDao r1 = MyDb.INSTANCE.getMDatabase().locationDao();
        List<Location> r2 = r1.getListASC();
        XOO0ii0 r3 = new XOO0ii0(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Location> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Location> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadLocation.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Location> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Location> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Location> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Location> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void OIi0(Context r43, String r44) {
        HeartRateDao r1 = MyDb.INSTANCE.getMDatabase().heartRateDao();
        List<HeartRate> r2 = r1.getListASC();
        O00 r3 = new O00(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<HeartRate> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<HeartRate> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadHeartRate.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<HeartRate> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        HeartRate r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<HeartRate> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<HeartRate> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<HeartRate> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

    public final long OXO1(long r3) {
        return (r3 - SMADataUploadData.defaultTime) / ((long) 1000);
    }

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
    public final void X1ii(Context r43, String r44) {
        WeightDao r1 = MyDb.INSTANCE.getMDatabase().weightDao();
        List<Weight> r2 = r1.getListASC();
        OIX0iXi r3 = new OIX0iXi(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Weight> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Weight> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadWeight.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Weight> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Weight> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Weight> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Weight> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Weight r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final /* synthetic */ <T> void XIi00iiXO(Context r43, String r44, String r45, List<? extends T> r46, p96<T> r47) {
        Intrinsics.X1ii(r46, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r3 = (ArrayList) r46;
        List<? extends T> r4 = r46;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r4.isEmpty())});
    L4:
        if (r4.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r4 = r4;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<? extends T> r5 = r46;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r5));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r7 = r5.iterator();
    L73:
        if (r7.hasNext() == false) goto L75;
        T r11 = r7.next();
        Intrinsics.X1ii(r11, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r12 = (Activity) r11;
        r12.setMIsSync(1);
        UploadActivityData r14 = new UploadActivityData();
        r14.setTime(OXO1.OXO1(r12.getMTime()));
        r14.setMode(r12.getMMode());
        r14.setState(r12.getMState());
        r14.setStep(r12.getMStep());
        r14.setCalorie(r12.getMCalorie() / 10000);
        r14.setDistance(r12.getMDistance() / 10000);
        r14.set_delete(r12.getMIsDelete());
        r6.add(r14);
        goto L73
    L75:
        r0.setData(r6);
        UploadData r1 = r0;
    L76:
        boolean r15 = true;
        UploadData r2 = r1;
    L148:
        NetWorkUtils r17 = NetWorkUtils.INSTANCE;
        Object r18 = r2;
        if (r2 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r18 = Unit.OXO1;
    L151:
        r17.postJsonExecute(r45, r18, new Upload$upload$13(r47, r46));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L85;
        UploadData r19 = new UploadData();
        r19.setIdentity(r44);
        ArrayList r20 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r24 = r5.iterator();
    L81:
        if (r24.hasNext() == false) goto L83;
        T r25 = r24.next();
        Intrinsics.X1ii(r25, r21);
        HeartRate r26 = (HeartRate) r25;
        r26.setMIsSync(1);
        UploadHeartRateData r27 = new UploadHeartRateData();
        r27.setTime(OXO1.OXO1(r26.getMTime()));
        r27.setBpm(r26.getMBpm());
        r20.add(r27);
        goto L81
    L83:
        r19.setData(r20);
        r1 = r19;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L92;
        UploadData r28 = new UploadData();
        r28.setIdentity(r44);
        ArrayList r29 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r30 = r5.iterator();
    L88:
        if (r30.hasNext() == false) goto L90;
        T r31 = r30.next();
        Intrinsics.X1ii(r31, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r32 = (Hrv) r31;
        r32.setMIsSync(1);
        UploadHrvData r33 = new UploadHrvData();
        r33.setTime(OXO1.OXO1(r32.getMTime()));
        r33.setValue(r32.getMValue());
        r33.setAvg_value(r32.getMAvgValue());
        r29.add(r33);
        goto L88
    L90:
        r28.setData(r29);
        r1 = r28;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L99;
        UploadData r34 = new UploadData();
        r34.setIdentity(r44);
        ArrayList r35 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r36 = r5.iterator();
    L95:
        if (r36.hasNext() == false) goto L97;
        T r37 = r36.next();
        Intrinsics.X1ii(r37, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r38 = (BloodPressure) r37;
        r38.setMIsSync(1);
        UploadBloodPressureData r39 = new UploadBloodPressureData();
        r39.setTime(OXO1.OXO1(r38.getMTime()));
        r39.setSystolic(r38.getMSystolic());
        r39.setDiastolic(r38.getMDiastolic());
        r35.add(r39);
        goto L95
    L97:
        r34.setData(r35);
        r1 = r34;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L106;
        UploadData r40 = new UploadData();
        r40.setIdentity(r44);
        ArrayList r41 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r42 = r5.iterator();
    L102:
        if (r42.hasNext() == false) goto L104;
        T r48 = r42.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r41.add(r50);
        goto L102
    L104:
        r40.setData(r41);
        r1 = r40;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r53 = r5.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        T r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r1 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r59 = r5.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        T r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r1 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r65 = r5.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        T r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r1 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r71 = r5.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        T r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r1 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r78 = r5.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        T r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r1 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r84 = r5.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        T r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r15 = true;
        r82.setData(r83);
        r2 = r82;
        goto L148
    L147:
        r15 = true;
        r2 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r46, new Upload$upload$1(r47, r46));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == true) goto L10;
        r4 = r4;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L33;
        Iterator<? extends T> r88 = r46.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        T r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<? extends T> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L60;
        List<? extends T> r94 = r46;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator<T> r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        T r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        T r100 = r46.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r46)) == false) goto L66;
        Iterator<? extends T> r109 = r46.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        T r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r46.size() < 2) goto L23;
        int r119 = r46.size() - 2;
        if (r119 < 0) goto L23;
        r4 = r4;
        int r120 = 0;
    L14:
        T r121 = r46.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        T r124 = r46.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void XO0O10(Context r43, String r44) {
        AlipayBindInfoDao r1 = MyDb.INSTANCE.getMDatabase().alipayBindInfoDao();
        LogUtils.d(new Object[]{"DataWorker upload data uploadAlipayBindInfoData"});
        List<AlipayBindInfo> r2 = r1.getListASC();
        XIi00iiXO r3 = new XIi00iiXO(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<AlipayBindInfo> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<AlipayBindInfo> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadAlipayBindInfo.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<AlipayBindInfo> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<AlipayBindInfo> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<AlipayBindInfo> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<AlipayBindInfo> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

    public final void XOO0ii0(@aa1 Context r34) {
        Intrinsics.X0O(r34, "context");
        SPUtils r2 = a01.OXO1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        AppUser r5 = (AppUser) r3;
        LogUtils.d(new Object[]{"DataWorker upload data " + r5.getIdentity()});
        if (r5.getIdentity().length() <= 0) goto L9;
        iO(r34, r5.getIdentity());
        OIi0(r34, r5.getIdentity());
        IiI10X(r34, r5.getIdentity());
        OIX0iXi(r34, r5.getIdentity());
        I0iXXO(r34, r5.getIdentity());
        X1ii(r34, r5.getIdentity());
        O10IXXX0X(r34, r5.getIdentity());
        XXI(r34, r5.getIdentity());
        O00(r34, r5.getIdentity());
        IO(r34, r5.getIdentity());
    L9:
        XO0O10(r34, r5.getIdentity());
    }

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
    public final void XXI(Context r43, String r44) {
        TemperatureDao r1 = MyDb.INSTANCE.getMDatabase().temperatureDao();
        List<Temperature> r2 = r1.getListASC();
        OIi0 r3 = new OIi0(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Temperature> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Temperature> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadTemperature.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Temperature> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Temperature> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Temperature> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Temperature> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Object r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = (Activity) r121;
        int r123 = r120 + 1;
        Object r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = (Activity) r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }

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
    public final void iO(Context r43, String r44) {
        ActivityDao r1 = MyDb.INSTANCE.getMDatabase().activityDao();
        List<Activity> r2 = r1.getListASC();
        OXO1 r3 = new OXO1(r1);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type java.util.ArrayList<T of com.sma.smartv3.work.Upload.upload>");
        ArrayList r4 = (ArrayList) r2;
        List<Activity> r5 = r2;
        LogUtils.i(new Object[]{"HEALTH_CONNECT " + (!r5.isEmpty())});
    L4:
        if (r5.isEmpty() == true) goto L152;
        SystemClock.sleep(15000);
        Class<Sleep> r8 = Sleep.class;
        Class<BloodPressure> r9 = BloodPressure.class;
        String r10 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r13 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (a01.OXO1.IiI10X().getBoolean(b01.X1ii) == true) goto L8;
    L23:
        r5 = r5;
    L24:
        Class<Sleep> r22 = r8;
        Class<BloodPressure> r23 = r9;
    L25:
        String r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        String r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
    L66:
        List<Activity> r6 = r2;
        BaseApplication.I1.OXO1().put(CollectionsKt___CollectionsKt.i0I0O111I(r6));
        I01XX0.OXO1(I01XX0.O001I, Boolean.TRUE);
        if (i72.OXO1.OX0X1O10X() == true) goto L68;
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L78;
        UploadData r0 = new UploadData();
        r0.setIdentity(r44);
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r11 = r6.iterator();
    L73:
        if (r11.hasNext() == false) goto L75;
        Object r12 = r11.next();
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r14 = (Activity) r12;
        r14.setMIsSync(1);
        UploadActivityData r15 = new UploadActivityData();
        r15.setTime(OXO1.OXO1(r14.getMTime()));
        r15.setMode(r14.getMMode());
        r15.setState(r14.getMState());
        r15.setStep(r14.getMStep());
        r15.setCalorie(r14.getMCalorie() / 10000);
        r15.setDistance(r14.getMDistance() / 10000);
        r15.set_delete(r14.getMIsDelete());
        r7.add(r15);
        goto L73
    L75:
        r0.setData(r7);
        UploadData r17 = r0;
    L76:
        boolean r18 = true;
        UploadData r19 = r17;
    L148:
        NetWorkUtils r20 = NetWorkUtils.INSTANCE;
        Object r24 = r19;
        if (r19 != null) goto L151;
        Intrinsics.XXO(WorkInitializer.I1);
        r24 = Unit.OXO1;
    L151:
        r20.postJsonExecute(UploadActivity.URL, r24, new Upload$upload$13(r3, r2));
        goto L4
    L78:
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L85;
        UploadData r25 = new UploadData();
        r25.setIdentity(r44);
        ArrayList r26 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r27 = r6.iterator();
    L81:
        if (r27.hasNext() == false) goto L83;
        Object r28 = r27.next();
        Intrinsics.X1ii(r28, r21);
        HeartRate r29 = (HeartRate) r28;
        r29.setMIsSync(1);
        UploadHeartRateData r30 = new UploadHeartRateData();
        r30.setTime(OXO1.OXO1(r29.getMTime()));
        r30.setBpm(r29.getMBpm());
        r26.add(r30);
        goto L81
    L83:
        r25.setData(r26);
        r17 = r25;
        goto L76
    L85:
        if (Hrv.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L92;
        UploadData r31 = new UploadData();
        r31.setIdentity(r44);
        ArrayList r32 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r33 = r6.iterator();
    L88:
        if (r33.hasNext() == false) goto L90;
        Object r34 = r33.next();
        Intrinsics.X1ii(r34, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Hrv");
        Hrv r35 = (Hrv) r34;
        r35.setMIsSync(1);
        UploadHrvData r36 = new UploadHrvData();
        r36.setTime(OXO1.OXO1(r35.getMTime()));
        r36.setValue(r35.getMValue());
        r36.setAvg_value(r35.getMAvgValue());
        r32.add(r36);
        goto L88
    L90:
        r31.setData(r32);
        r17 = r31;
        goto L76
    L92:
        if (r23.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L99;
        UploadData r37 = new UploadData();
        r37.setIdentity(r44);
        ArrayList r38 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r39 = r6.iterator();
    L95:
        if (r39.hasNext() == false) goto L97;
        Object r40 = r39.next();
        Intrinsics.X1ii(r40, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure");
        BloodPressure r41 = (BloodPressure) r40;
        r41.setMIsSync(1);
        UploadBloodPressureData r42 = new UploadBloodPressureData();
        r42.setTime(OXO1.OXO1(r41.getMTime()));
        r42.setSystolic(r41.getMSystolic());
        r42.setDiastolic(r41.getMDiastolic());
        r38.add(r42);
        goto L95
    L97:
        r37.setData(r38);
        r17 = r37;
        goto L76
    L99:
        if (BloodOxygen.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L106;
        UploadData r45 = new UploadData();
        r45.setIdentity(r44);
        ArrayList r46 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r47 = r6.iterator();
    L102:
        if (r47.hasNext() == false) goto L104;
        Object r48 = r47.next();
        Intrinsics.X1ii(r48, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen");
        BloodOxygen r49 = (BloodOxygen) r48;
        r49.setMIsSync(1);
        UploadBloodOxygenData r50 = new UploadBloodOxygenData();
        r50.setTime(OXO1.OXO1(r49.getMTime()));
        r50.setValue(r49.getMValue());
        r46.add(r50);
        goto L102
    L104:
        r45.setData(r46);
        r17 = r45;
        goto L76
    L106:
        if (Location.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L113;
        UploadData r51 = new UploadData();
        r51.setIdentity(r44);
        ArrayList r52 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r53 = r6.iterator();
    L109:
        if (r53.hasNext() == false) goto L111;
        Object r54 = r53.next();
        Intrinsics.X1ii(r54, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Location");
        Location r55 = (Location) r54;
        r55.setMIsSync(1);
        UploadLocationData r56 = new UploadLocationData();
        r56.setTime(OXO1.OXO1(r55.getMTime()));
        r56.setAltitude(r55.getMAltitude());
        r56.setLongitude(r55.getMLongitude());
        r56.setLatitude(r55.getMLatitude());
        r56.setSource(r55.getMSource());
        r52.add(r56);
        goto L109
    L111:
        r51.setData(r52);
        r17 = r51;
        goto L76
    L113:
        if (r22.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L120;
        UploadData r57 = new UploadData();
        r57.setIdentity(r44);
        ArrayList r58 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r59 = r6.iterator();
    L116:
        if (r59.hasNext() == false) goto L118;
        Object r60 = r59.next();
        Intrinsics.X1ii(r60, r16);
        Sleep r61 = (Sleep) r60;
        r61.setMIsSync(1);
        UploadSleepData r62 = new UploadSleepData();
        r62.setTime(OXO1.OXO1(r61.getMTime()));
        r62.setMode(r61.getMMode());
        r62.setSoft(r61.getMSoft());
        r62.setStrong(r61.getMStrong());
        r58.add(r62);
        goto L116
    L118:
        r57.setData(r58);
        r17 = r57;
        goto L76
    L120:
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L127;
        UploadData r63 = new UploadData();
        r63.setIdentity(r44);
        ArrayList r64 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r65 = r6.iterator();
    L123:
        if (r65.hasNext() == false) goto L125;
        Object r66 = r65.next();
        Intrinsics.X1ii(r66, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r67 = (Weight) r66;
        r67.setMIsSync(1);
        UploadWeightData r68 = new UploadWeightData();
        r68.setTime(OXO1.OXO1(r67.getMTime()));
        r68.setWeight(r67.getMWeight());
        r64.add(r68);
        goto L123
    L125:
        r63.setData(r64);
        r17 = r63;
        goto L76
    L127:
        if (Workout.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L134;
        UploadData r69 = new UploadData();
        r69.setIdentity(r44);
        ArrayList r70 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r71 = r6.iterator();
    L130:
        if (r71.hasNext() == false) goto L132;
        Object r72 = r71.next();
        Intrinsics.X1ii(r72, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        Workout r73 = (Workout) r72;
        r73.setMIsSync(1);
        UploadWorkoutData r74 = new UploadWorkoutData();
        Upload r75 = OXO1;
        r74.setStart(r75.OXO1(r73.getMStart()));
        r74.setEnd(r75.OXO1(r73.getMEnd()));
        r74.setDuration(r73.getMDuration());
        r74.setAltitude(r73.getMAltitude());
        r74.setAirPressure(r73.getMAirPressure());
        r74.setSpm(r73.getMSpm());
        r74.setMode(r73.getMMode());
        r74.setStep(r73.getMStep());
        r74.setDistance(r73.getMDistance());
        r74.setCalorie(r73.getMCalorie());
        r74.setSpeed(r73.getMSpeed());
        r74.setPace(r73.getMPace());
        r74.set_delete(r73.getMIsDelete());
        r74.setMAvgBpm(r73.getMAvgBpm());
        r74.setMMaxBpm(r73.getMMaxBpm());
        r74.setMMinBpm(r73.getMMinBpm());
        r74.setMMaxSpm(r73.getMMaxSpm());
        r74.setMMinSpm(r73.getMMinSpm());
        r74.setMMaxPace(r73.getMMaxPace());
        r74.setMMinPace(r73.getMMinPace());
        r74.setMMaxAltitude(r73.getMMaxAltitude());
        r74.setMMinAltitude(r73.getMMinAltitude());
        r74.setMMinStress(r73.getMMinStress());
        r74.setMMaxStress(r73.getMMaxStress());
        r74.setMAvgStress(r73.getMAvgStress());
        r74.setMSource(r73.getMSource());
        r74.setMFeel(r73.getMFeel());
        r74.setMPrototype(r73.getMPrototype());
        r74.setMFirmwareFlag(r73.getMFirmwareFlag());
        r74.setMBleName(r73.getMBleName());
        r70.add(r74);
        goto L130
    L132:
        r69.setData(r70);
        r17 = r69;
        goto L76
    L134:
        if (Temperature.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L141;
        UploadData r76 = new UploadData();
        r76.setIdentity(r44);
        ArrayList r77 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r78 = r6.iterator();
    L137:
        if (r78.hasNext() == false) goto L139;
        Object r79 = r78.next();
        Intrinsics.X1ii(r79, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Temperature");
        Temperature r80 = (Temperature) r79;
        r80.setMIsSync(1);
        UploadTemperatureData r81 = new UploadTemperatureData();
        r81.setTime(OXO1.OXO1(r80.getMTime()));
        r81.setTemperature(r80.getMTemperature());
        r77.add(r81);
        goto L137
    L139:
        r76.setData(r77);
        r17 = r76;
        goto L76
    L141:
        if (AlipayBindInfo.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L147;
        UploadData r82 = new UploadData();
        r82.setIdentity(r44);
        ArrayList r83 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));
        Iterator<T> r84 = r6.iterator();
    L144:
        if (r84.hasNext() == false) goto L146;
        Object r85 = r84.next();
        Intrinsics.X1ii(r85, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AlipayBindInfo");
        AlipayBindInfo r86 = (AlipayBindInfo) r85;
        r86.setMIsSync(1);
        UploadAlipayBindInfoData r87 = new UploadAlipayBindInfoData();
        r87.setTime(OXO1.OXO1(r86.getMTime()));
        r87.setBleName(r86.getMBleName());
        r87.setFirmwareFlag(r86.getMFirmwareFlag());
        r87.setMacAddress(r86.getMMacAddress());
        r87.setFirmwareVersion(r86.getMFirmwareVersion());
        r87.setAppVersion(r86.getMAppVersion());
        r87.setResult(r86.getMResult());
        r83.add(r87);
        goto L144
    L146:
        r18 = true;
        r82.setData(r83);
        r19 = r82;
        goto L148
    L147:
        r18 = true;
        r19 = null;
        goto L148
    L68:
        UploadOSSWorker.OXO1.OIX0iXi(r2, new Upload$upload$1(r3, r2));
        goto L4
    L8:
        if (Activity.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L10;
        r5 = r5;
        if (HeartRate.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L33;
        Iterator<Activity> r88 = r2.iterator();
    L30:
        if (r88.hasNext() == false) goto L24;
        Object r89 = r88.next();
        Intrinsics.X1ii(r89, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate");
        HeartRate r90 = (HeartRate) r89;
        X1IIXO r310 = X1IIXO.OXO1;
        String r91 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r91, "getPackageName(...)");
        DataType r92 = DataType.TYPE_HEART_RATE_BPM;
        Iterator<Activity> r110 = r88;
        Intrinsics.O10IXXX0X(r92, "TYPE_HEART_RATE_BPM");
        Field r93 = Field.FIELD_BPM;
        Intrinsics.O10IXXX0X(r93, "FIELD_BPM");
        r310.I1(r43, r91, r92, "HeartRateData", r93, r90.getMBpm(), r90.getMTime(), r90.getMTime() + 1000);
        r88 = r110;
        goto L30
    L33:
        if (r9.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == true) goto L24;
        if (r8.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L60;
        List<Activity> r94 = r2;
        ArrayList r95 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r94, 10));
        Iterator r96 = r94.iterator();
    L38:
        if (r96.hasNext() == false) goto L40;
        Object r97 = r96.next();
        Intrinsics.X1ii(r97, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        Sleep r98 = (Sleep) r97;
        r95.add(new BleSleep((int) (r98.getMTime() / ((long) 1000)), r98.getMMode(), r98.getMSoft(), r98.getMStrong()));
        r96 = r96;
        r8 = r8;
        r9 = r9;
        goto L38
    L40:
        r22 = r8;
        r23 = r9;
        BleSleep.Companion r99 = BleSleep.Companion;
        Object r100 = r2.get(0);
        Intrinsics.X1ii(r100, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep");
        List<BleSleep> r101 = r99.analyseSleep(r95, ((Sleep) r100).getMAlgorithmType());
        if (r101.isEmpty() == true) goto L25;
        if (r101.size() < 2) goto L25;
        ArrayList<X1IIXO.OXO1> r102 = new ArrayList();
        int r103 = r101.size() - 2;
        if (r103 < 0) goto L58;
        int r104 = 0;
    L48:
        int r105 = r101.get(r104).getMTime();
        r16 = r13;
        int r111 = r104 + 1;
        r21 = r10;
        int r112 = r101.get(r111).getMTime();
        List<BleSleep> r113 = r101;
        int r106 = r101.get(r111).getMMode();
        if (r106 != 1) goto L51;
        String r107 = FitnessActivities.SLEEP_DEEP;
    L55:
        r102.add(new X1IIXO.OXO1(r105, r112, r107));
        if (r104 == r103) goto L59;
        r13 = r16;
        r104 = r111;
        r101 = r113;
        r10 = r21;
    L59:
        X1IIXO r311 = X1IIXO.OXO1;
        String r108 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r108, "getPackageName(...)");
        r311.i010I(r43, r108, "SleepData", "SleepData to GoogleFit", "SleepData by " + r43.getString(R.string.app_name), r102);
        goto L66
    L51:
        if (r106 == 2) goto L53;
        r107 = FitnessActivities.SLEEP_AWAKE;
        goto L55
    L53:
        r107 = FitnessActivities.SLEEP_LIGHT;
        goto L55
    L58:
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        goto L59
    L60:
        r22 = r8;
        r23 = r9;
        r21 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate";
        r16 = "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep";
        if (Weight.class.isInstance(CollectionsKt___CollectionsKt.IIII0iI(r2)) == false) goto L66;
        Iterator<Activity> r109 = r2.iterator();
    L64:
        if (r109.hasNext() == false) goto L66;
        Object r114 = r109.next();
        Intrinsics.X1ii(r114, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight");
        Weight r115 = (Weight) r114;
        X1IIXO r312 = X1IIXO.OXO1;
        String r116 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r116, "getPackageName(...)");
        DataType r117 = DataType.TYPE_WEIGHT;
        Intrinsics.O10IXXX0X(r117, "TYPE_WEIGHT");
        Field r118 = Field.FIELD_WEIGHT;
        Intrinsics.O10IXXX0X(r118, "FIELD_WEIGHT");
        r312.I1(r43, r116, r117, "WeightData", r118, r115.getMWeight(), r115.getMTime(), r115.getMTime() + 1000);
        goto L64
    L10:
        if (r2.size() < 2) goto L23;
        int r119 = r2.size() - 2;
        if (r119 < 0) goto L23;
        r5 = r5;
        int r120 = 0;
    L14:
        Activity r121 = r2.get(r120);
        Intrinsics.X1ii(r121, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r122 = r121;
        int r123 = r120 + 1;
        Activity r124 = r2.get(r123);
        Intrinsics.X1ii(r124, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity");
        Activity r125 = r124;
        if (r125.getMStep() <= 0) goto L20;
        int r126 = r123;
        if (r125.getMStep() <= r122.getMStep()) goto L21;
        LogUtils.d(new Object[]{r125});
        LogUtils.d(new Object[]{r122});
        X1IIXO r210 = X1IIXO.OXO1;
        String r127 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r127, "getPackageName(...)");
        DataType r128 = DataType.TYPE_STEP_COUNT_DELTA;
        Intrinsics.O10IXXX0X(r128, "TYPE_STEP_COUNT_DELTA");
        Field r129 = Field.FIELD_STEPS;
        Intrinsics.O10IXXX0X(r129, "FIELD_STEPS");
        r210.I1(r43, r127, r128, "StepData", r129, (r125.getMStep() - r122.getMStep()) / 1.0f, r122.getMTime(), r125.getMTime());
        String r130 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r130, "getPackageName(...)");
        DataType r131 = DataType.TYPE_CALORIES_EXPENDED;
        Intrinsics.O10IXXX0X(r131, "TYPE_CALORIES_EXPENDED");
        Field r132 = Field.FIELD_CALORIES;
        Intrinsics.O10IXXX0X(r132, "FIELD_CALORIES");
        r210.I1(r43, r130, r131, "CaloriesData", r132, (r125.getMCalorie() - r122.getMCalorie()) / 10000.0f, r122.getMTime(), r125.getMTime());
        String r133 = r43.getPackageName();
        Intrinsics.O10IXXX0X(r133, "getPackageName(...)");
        DataType r134 = DataType.TYPE_DISTANCE_DELTA;
        Intrinsics.O10IXXX0X(r134, "TYPE_DISTANCE_DELTA");
        Field r135 = Field.FIELD_DISTANCE;
        Intrinsics.O10IXXX0X(r135, "FIELD_DISTANCE");
        r210.I1(r43, r133, r134, "DistanceData", r135, (r125.getMDistance() - r122.getMDistance()) / 10000.0f, r122.getMTime(), r125.getMTime());
    L21:
        if (r120 == r119) goto L24;
        r120 = r126;
        goto L14
    L20:
        r126 = r123;
        goto L21
    }
}
