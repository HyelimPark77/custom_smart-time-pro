package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.HttpProgressCallback;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.CourSelectByType;
import com.sma.smartv3.model.CourseDetails;
import com.sma.smartv3.model.CourseList;
import com.sma.smartv3.model.CourseType;
import com.sma.smartv3.model.RecommendSearch;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.CourseCollect;
import com.sma.smartv3.network.GetChoicenessSearchList;
import com.sma.smartv3.network.GetCourSelectByType;
import com.sma.smartv3.network.GetCourseCollectList;
import com.sma.smartv3.network.GetCourseDetailsList;
import com.sma.smartv3.network.GetCourseList;
import com.sma.smartv3.network.GetRecommendSearchList;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nCourseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseManager.kt\ncom/sma/smartv3/biz/CourseManager\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,316:1\n235#2,11:317\n246#2:329\n256#2:339\n235#2,11:340\n246#2:352\n256#2:362\n235#2,11:363\n246#2:375\n256#2:385\n235#2,11:386\n246#2:398\n256#2:408\n153#2,11:409\n164#2:421\n174#2:431\n153#2,11:432\n164#2:444\n174#2:454\n235#2,11:455\n246#2:467\n256#2:477\n235#2,11:478\n246#2:490\n256#2:500\n1#3:328\n1#3:351\n1#3:374\n1#3:397\n1#3:420\n1#3:443\n1#3:466\n1#3:489\n278#4,8:330\n298#4:338\n278#4,8:353\n298#4:361\n278#4,8:376\n298#4:384\n278#4,8:399\n298#4:407\n226#4,8:422\n245#4:430\n226#4,8:445\n245#4:453\n278#4,8:468\n298#4:476\n278#4,8:491\n298#4:499\n*S KotlinDebug\n*F\n+ 1 CourseManager.kt\ncom/sma/smartv3/biz/CourseManager\n*L\n42#1:317,11\n42#1:329\n42#1:339\n74#1:340,11\n74#1:352\n74#1:362\n103#1:363,11\n103#1:375\n103#1:385\n142#1:386,11\n142#1:398\n142#1:408\n180#1:409,11\n180#1:421\n180#1:431\n210#1:432,11\n210#1:444\n210#1:454\n241#1:455,11\n241#1:467\n241#1:477\n262#1:478,11\n262#1:490\n262#1:500\n42#1:328\n74#1:351\n103#1:374\n142#1:397\n180#1:420\n210#1:443\n241#1:466\n262#1:489\n42#1:330,8\n42#1:338\n74#1:353,8\n74#1:361\n103#1:376,8\n103#1:384\n142#1:399,8\n142#1:407\n180#1:422,8\n180#1:430\n210#1:445,8\n210#1:453\n241#1:468,8\n241#1:476\n262#1:491,8\n262#1:499\n*E\n"})
public final class CourseManager {

    @aa1
    public static final CourseManager OXO1 = new CourseManager();

    @aa1
    public static final String XIi00iiXO = "CourseManager";

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0IIOi(CourseManager courseManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "INDEX";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        courseManager.XOO0ii0(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0iXXO(CourseManager courseManager, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        courseManager.OIX0iXi(str, str2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IIX1OXO(CourseManager courseManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "INDEX";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        courseManager.I1XOi1(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38089IO(CourseManager courseManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = GetCourSelectByType.COURSE_DIFF;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        courseManager.OIi0(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IiI10X(CourseManager courseManager, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        courseManager.O00(str, str2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X0O(CourseManager courseManager, String str, String str2, String str3, String str4, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            function1 = null;
        }
        courseManager.O10IXXX0X(str, str2, str3, str4, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void X1ii(CourseManager courseManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "course_type";
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        courseManager.XXI(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XIi00iiXO(CourseManager courseManager, String str, String str2, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        courseManager.OXO1(str, str2, z, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XO0O10(CourseManager courseManager, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        courseManager.m38090iO(str, function1);
    }

    public final void I1XOi1(@aa1 String type, @tb1 final Function1<? super RecommendSearch[], Unit> function1) {
        Intrinsics.X0O(type, "type");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> choicenessSearchListBody = RequestBodyKt.getChoicenessSearchListBody(type);
        final O1XIiIO<RecommendSearch[]> o1XIiIO = new O1XIiIO<RecommendSearch[]>() { // from class: com.sma.smartv3.biz.CourseManager$getRecommendSearchListList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(RecommendSearch[] recommendSearchArr) {
                LogUtils.m11128d("getCourseDetails -> " + recommendSearchArr);
                if (recommendSearchArr != null) {
                    try {
                        if (!(recommendSearchArr.length == 0)) {
                            recommendSearchArr[0].setOnCreateTime(System.currentTimeMillis());
                        }
                        a01.OXO1.O00().put(b01.XXI0XOIX, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(recommendSearchArr)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<RecommendSearch[], Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(null);
                            return;
                        }
                        return;
                    }
                }
                Function1<RecommendSearch[], Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(recommendSearchArr);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getCourseDetails -> " + error);
                Function1<RecommendSearch[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetRecommendSearchList.URL);
        String str = strConvertBaseUrl + GetRecommendSearchList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(choicenessSearchListBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetRecommendSearchList.URL;
        final O1XIiIO<Response<RecommendSearch[]>> o1XIiIO2 = new O1XIiIO<Response<RecommendSearch[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getRecommendSearchListList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<RecommendSearch[]> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) choicenessSearchListBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, RecommendSearch[].class), new ParsedRequestListener<Response<RecommendSearch[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getRecommendSearchListList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<RecommendSearch[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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

    public final void O00(@aa1 String fileUrl, @aa1 String fileName, @tb1 final Function1<? super Integer, Unit> function1) {
        Intrinsics.X0O(fileUrl, "fileUrl");
        Intrinsics.X0O(fileName, "fileName");
        if (fileUrl.length() == 0) {
            if (function1 != null) {
                function1.invoke2(-1);
            }
        } else {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = -1;
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            String absolutePath = uz0.i0X000X0O(sz0.OXO1).getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            netWorkUtils.download(fileUrl, absolutePath, fileName, new HttpProgressCallback<String>() { // from class: com.sma.smartv3.biz.CourseManager$downloadCourse$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    Function1<Integer, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(101);
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    Function1<Integer, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(-1);
                    }
                }

                @Override // com.sma.androidnetworklib.method.HttpProgressCallback
                public void handleProgress(int i) {
                    Ref.IntRef intRef2 = intRef;
                    if (intRef2.element != i) {
                        intRef2.element = i;
                        Function1<Integer, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(Integer.valueOf(i));
                        }
                    }
                }
            });
        }
    }

    public final void O10IXXX0X(@tb1 String str, @tb1 String str2, @tb1 String str3, @tb1 String str4, @tb1 final Function1<? super Boolean, Unit> function1) {
        LogUtils.m11130i("getOnLineCourseList -> " + str + ", " + str2 + ", " + str3 + ", " + str4);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> courseBody = RequestBodyKt.getCourseBody(str, str2, str3, str4);
        final O1XIiIO<CourseList[]> o1XIiIO = new O1XIiIO<CourseList[]>() { // from class: com.sma.smartv3.biz.CourseManager$getOnLineCourseList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourseList[] courseListArr) {
                LogUtils.m11128d("getOnLineCourseList -> " + (courseListArr != null ? Integer.valueOf(courseListArr.length) : null));
                if (courseListArr != null) {
                    try {
                        a01.OXO1.O00().put(b01.IXiOXO, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(courseListArr)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<Boolean, Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                }
                Function1<Boolean, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getOnLinWatchFaceList -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourseList.URL);
        String str5 = strConvertBaseUrl + GetCourseList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(courseBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str5, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str6 = strConvertBaseUrl + GetCourseList.URL;
        final O1XIiIO<Response<CourseList[]>> o1XIiIO2 = new O1XIiIO<Response<CourseList[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getOnLineCourseList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourseList[]> response) {
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
        AndroidNetworking.post(str6).addHeaders(headersMap).addBodyParameter((Map<String, String>) courseBody).setTag((Object) str6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourseList[].class), new ParsedRequestListener<Response<CourseList[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getOnLineCourseList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourseList[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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

    public final void OIX0iXi(@aa1 String id, @aa1 String uid, @tb1 final Function1<? super CourseDetails, Unit> function1) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(uid, "uid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> courseDetailsBody = RequestBodyKt.getCourseDetailsBody(id, uid);
        final O1XIiIO<CourseDetails> o1XIiIO = new O1XIiIO<CourseDetails>() { // from class: com.sma.smartv3.biz.CourseManager$getCourseDetails$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourseDetails courseDetails) {
                LogUtils.m11128d("getCourseDetails -> " + courseDetails);
                try {
                    Function1<CourseDetails, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(courseDetails);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<CourseDetails, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getCourseDetails -> " + error);
                Function1<CourseDetails, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourseDetailsList.URL);
        String str = strConvertBaseUrl + GetCourseDetailsList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(courseDetailsBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetCourseDetailsList.URL;
        final O1XIiIO<Response<CourseDetails>> o1XIiIO2 = new O1XIiIO<Response<CourseDetails>>() { // from class: com.sma.smartv3.biz.CourseManager$getCourseDetails$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourseDetails> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) courseDetailsBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourseDetails.class), new ParsedRequestListener<Response<CourseDetails>>() { // from class: com.sma.smartv3.biz.CourseManager$getCourseDetails$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourseDetails> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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

    public final void OIi0(@aa1 String type, @tb1 final Function1<? super CourSelectByType[], Unit> function1) {
        Intrinsics.X0O(type, "type");
        LogUtils.m11128d("getCourSelectByType -> " + type);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> courSelectByTypeBody = RequestBodyKt.getCourSelectByTypeBody(type);
        final O1XIiIO<CourSelectByType[]> o1XIiIO = new O1XIiIO<CourSelectByType[]>() { // from class: com.sma.smartv3.biz.CourseManager$getCourSelectByType$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourSelectByType[] courSelectByTypeArr) {
                LogUtils.m11128d("getCourSelectByType -> " + courSelectByTypeArr);
                try {
                    Function1<CourSelectByType[], Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(courSelectByTypeArr);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<CourSelectByType[], Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getCourSelectByType -> " + error);
                Function1<CourSelectByType[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourSelectByType.URL);
        String str = strConvertBaseUrl + GetCourSelectByType.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(courSelectByTypeBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetCourSelectByType.URL;
        final O1XIiIO<Response<CourSelectByType[]>> o1XIiIO2 = new O1XIiIO<Response<CourSelectByType[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getCourSelectByType$$inlined$getV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourSelectByType[]> response) {
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
        AndroidNetworking.get(str2).addQueryParameter((Map<String, String>) courSelectByTypeBody).setTag((Object) str2).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourSelectByType[].class), new ParsedRequestListener<Response<CourSelectByType[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getCourSelectByType$$inlined$getV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourSelectByType[]> response) {
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

    public final void OXO1(@aa1 String cid, @aa1 String uid, boolean z, @tb1 final Function1<? super String, Unit> function1) {
        Intrinsics.X0O(cid, "cid");
        Intrinsics.X0O(uid, "uid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> courseCollectBody = RequestBodyKt.getCourseCollectBody(cid, uid, z ? Api.f51338Y : "N");
        final O1XIiIO<CourseList> o1XIiIO = new O1XIiIO<CourseList>() { // from class: com.sma.smartv3.biz.CourseManager$courseCollect$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourseList courseList) {
                LogUtils.m11128d("courseCollect ");
                Function1<String, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2("");
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("courseCollect -> " + error);
                Function1<String, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(error);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), CourseCollect.URL);
        String str = strConvertBaseUrl + CourseCollect.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(courseCollectBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + CourseCollect.URL;
        final O1XIiIO<Response<CourseList>> o1XIiIO2 = new O1XIiIO<Response<CourseList>>() { // from class: com.sma.smartv3.biz.CourseManager$courseCollect$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourseList> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) courseCollectBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourseList.class), new ParsedRequestListener<Response<CourseList>>() { // from class: com.sma.smartv3.biz.CourseManager$courseCollect$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourseList> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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

    public final void XOO0ii0(@aa1 String type, @tb1 final Function1<? super CourseList[], Unit> function1) {
        Intrinsics.X0O(type, "type");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> choicenessSearchListBody = RequestBodyKt.getChoicenessSearchListBody(type);
        final O1XIiIO<CourseList[]> o1XIiIO = new O1XIiIO<CourseList[]>() { // from class: com.sma.smartv3.biz.CourseManager$getChoicenessSearchList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourseList[] courseListArr) {
                LogUtils.m11128d("getCourseDetails -> " + courseListArr);
                if (courseListArr != null) {
                    try {
                        if (!(courseListArr.length == 0)) {
                            courseListArr[0].setOnSaveTime(System.currentTimeMillis());
                        }
                        a01.OXO1.O00().put(b01.iOX, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(courseListArr)));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Function1<CourseList[], Unit> function2 = function1;
                        if (function2 != null) {
                            function2.invoke2(null);
                            return;
                        }
                        return;
                    }
                }
                Function1<CourseList[], Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(courseListArr);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getCourseDetails -> " + error);
                Function1<CourseList[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetChoicenessSearchList.URL);
        String str = strConvertBaseUrl + GetChoicenessSearchList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(choicenessSearchListBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetChoicenessSearchList.URL;
        final O1XIiIO<Response<CourseList[]>> o1XIiIO2 = new O1XIiIO<Response<CourseList[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getChoicenessSearchList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourseList[]> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) choicenessSearchListBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourseList[].class), new ParsedRequestListener<Response<CourseList[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getChoicenessSearchList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourseList[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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

    public final void XXI(@aa1 String type, @tb1 final Function1<? super CourseType[], Unit> function1) {
        Intrinsics.X0O(type, "type");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String str = "/system/dict/data/type/" + type;
        HashMap<String, String> courseTypeListBody = RequestBodyKt.getCourseTypeListBody(type);
        final O1XIiIO<CourseType[]> o1XIiIO = new O1XIiIO<CourseType[]>() { // from class: com.sma.smartv3.biz.CourseManager$getCourseType$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourseType[] courseTypeArr) {
                LogUtils.m11128d("getCourseType -> " + courseTypeArr);
                try {
                    Function1<CourseType[], Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(courseTypeArr);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<CourseType[], Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("getCourseType -> " + error);
                Function1<CourseType[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), str);
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(courseTypeListBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + str;
        final O1XIiIO<Response<CourseType[]>> o1XIiIO2 = new O1XIiIO<Response<CourseType[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getCourseType$$inlined$getV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourseType[]> response) {
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
        AndroidNetworking.get(str2).addQueryParameter((Map<String, String>) courseTypeListBody).setTag((Object) str2).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourseType[].class), new ParsedRequestListener<Response<CourseType[]>>() { // from class: com.sma.smartv3.biz.CourseManager$getCourseType$$inlined$getV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourseType[]> response) {
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

    /* JADX INFO: renamed from: iO */
    public final void m38090iO(@aa1 String uid, @tb1 final Function1<? super CourseList[], Unit> function1) {
        Intrinsics.X0O(uid, "uid");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> courseCollectList = RequestBodyKt.getCourseCollectList(uid);
        final O1XIiIO<CourseList[]> o1XIiIO = new O1XIiIO<CourseList[]>() { // from class: com.sma.smartv3.biz.CourseManager$courseCollectList$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(CourseList[] courseListArr) {
                LogUtils.m11128d("courseCollect ");
                try {
                    Function1<CourseList[], Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(courseListArr);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Function1<CourseList[], Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(null);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("courseCollect -> " + error);
                Function1<CourseList[], Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetCourseCollectList.URL);
        String str = strConvertBaseUrl + GetCourseCollectList.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(courseCollectList);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetCourseCollectList.URL;
        final O1XIiIO<Response<CourseList[]>> o1XIiIO2 = new O1XIiIO<Response<CourseList[]>>() { // from class: com.sma.smartv3.biz.CourseManager$courseCollectList$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<CourseList[]> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) courseCollectList).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, CourseList[].class), new ParsedRequestListener<Response<CourseList[]>>() { // from class: com.sma.smartv3.biz.CourseManager$courseCollectList$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<CourseList[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                if (aNError != null) {
                    aNError.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", errorDetail:");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                sb.append(", exception:");
                sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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
