.class public final Lcom/sma/smartv3/util/OffLineMapManagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOffLineMapManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,190:1\n18#2,2:191\n15#2:193\n15#2:224\n18#2,2:225\n15#2:227\n27#2,2:250\n18#2,2:252\n15#2:254\n304#3,11:194\n323#3:223\n312#3,3:228\n323#3:249\n282#3,11:255\n301#3:275\n383#4,18:205\n383#4,18:231\n278#4,8:266\n298#4:274\n*S KotlinDebug\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n*L\n45#1:191,2\n45#1:193\n94#1:224\n103#1:225,2\n103#1:227\n133#1:250,2\n154#1:252,2\n154#1:254\n54#1:194,11\n54#1:223\n109#1:228,3\n109#1:249\n160#1:255,11\n160#1:275\n54#1:205,18\n109#1:231,18\n160#1:266,8\n160#1:274\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOffLineMapManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,190:1\n18#2,2:191\n15#2:193\n15#2:224\n18#2,2:225\n15#2:227\n27#2,2:250\n18#2,2:252\n15#2:254\n304#3,11:194\n323#3:223\n312#3,3:228\n323#3:249\n282#3,11:255\n301#3:275\n383#4,18:205\n383#4,18:231\n278#4,8:266\n298#4:274\n*S KotlinDebug\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n*L\n45#1:191,2\n45#1:193\n94#1:224\n103#1:225,2\n103#1:227\n133#1:250,2\n154#1:252,2\n154#1:254\n54#1:194,11\n54#1:223\n109#1:228,3\n109#1:249\n160#1:255,11\n160#1:275\n54#1:205,18\n109#1:231,18\n160#1:266,8\n160#1:274\n*E\n"
    }
.end annotation


# static fields
.field public static final OXO1:Ljava/lang/String; = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCntVNj2x3Kw/0EndhE8+zOianIG0TdPtMrAwWPRwHLdNsd02lE4KsmkZW/9Ac1uno54vydj7D6/Bb0UAKJ5LaocX6nZ66DtYVKPS2Vr45F0shSnzJTGInk68EwrdWRWmZuNccVkDfntIKCjcbw5ha1lZ9EG66hBrJEJHR0Ru2/kwIDAQAB"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String; = "https://map.iipii.net/user/login"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final iO:Ljava/lang/String; = "https://map.iipii.net/optionalMap/generateFile"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public static synthetic I0IIOi(DDDDDDLandroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v15, v2

    goto :goto_0

    :cond_0
    move-object/from16 v15, p12

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    move-object/from16 v16, v2

    goto :goto_1

    :cond_1
    move-object/from16 v16, p13

    :goto_1
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_2

    move-object/from16 v17, v2

    :goto_2
    move-wide/from16 v3, p0

    move-wide/from16 v5, p2

    move-wide/from16 v7, p4

    move-wide/from16 v9, p6

    move-wide/from16 v11, p8

    move-wide/from16 v13, p10

    goto :goto_3

    :cond_2
    move-object/from16 v17, p14

    goto :goto_2

    :goto_3
    invoke-static/range {v3 .. v17}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->XOO0ii0(DDDDDDLandroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic IO(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p0, "18928414055"

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/yb2;->OXO1:Lcom/android/mltcode/paycertificationapi/yb2;

    const-string p4, "666666"

    const-string v0, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCntVNj2x3Kw/0EndhE8+zOianIG0TdPtMrAwWPRwHLdNsd02lE4KsmkZW/9Ac1uno54vydj7D6/Bb0UAKJ5LaocX6nZ66DtYVKPS2Vr45F0shSnzJTGInk68EwrdWRWmZuNccVkDfntIKCjcbw5ha1lZ9EG66hBrJEJHR0Ru2/kwIDAQAB"

    invoke-virtual {p1, p4, v0}, Lcom/android/mltcode/paycertificationapi/yb2;->OXO1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->OIi0(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final IiI10X(Ljava/lang/String;Landroid/app/Activity;Z)Lkotlin/Unit;
    .locals 5

    if-eqz p2, :cond_1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "getOffLineAuthInfo ->"

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "deviceId"

    invoke-virtual {p2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "type"

    const-string v1, "0001"

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/OffLineUserSession;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/model/OffLineUserSession;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "Content-Type"

    const-string v3, "application/json"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/OffLineUserSession;->getToken()Ljava/lang/String;

    move-result-object v2

    const-string v3, "token"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "userId"

    invoke-virtual {v0}, Lcom/sma/smartv3/model/OffLineUserSession;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v2, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$1$1;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {v0, p1, p0}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p0

    invoke-static {}, Lkotlin/collections/OXO1;->I1()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, p2}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "https://map.iipii.net/auth/getAuthInfo"

    invoke-virtual {v0, v4, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$1;

    invoke-direct {v0, p1, v2, p0}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v4}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0, v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    sget-object p1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p0, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/reflect/Type;

    const-class p2, Lcom/sma/smartv3/model/OffLineAuthInfo;

    const/4 v1, 0x0

    aput-object p2, p1, v1

    const-class p2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {p2, p1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$2;

    invoke-direct {p2, v0}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p0, p1, p2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    :cond_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic O00(Ljava/lang/String;Landroid/app/Activity;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->XO0O10(Ljava/lang/String;Landroid/app/Activity;)V

    return-void
.end method

.method public static final OIi0(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "phone"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "pwd"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/OffLineUserSession;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    :cond_0
    check-cast v2, Lcom/sma/smartv3/model/OffLineUserSession;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/OffLineUserSession;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "offLineUserLogin ->"

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "Content-Type"

    const-string v0, "application/json"

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v0, Lcom/sma/smartv3/util/OffLineMapManagerKt$onOffLineUserLogin$1;

    invoke-direct {v0, p2}, Lcom/sma/smartv3/util/OffLineMapManagerKt$onOffLineUserLogin$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/OXO1;->I1()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, p0}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const-string v5, "https://map.iipii.net/user/login"

    invoke-virtual {p1, v5, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance p1, Lcom/sma/smartv3/util/OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$1;

    invoke-direct {p1, p2, v0, v1}, Lcom/sma/smartv3/util/OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v5}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addApplicationJsonBody(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p0, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p0

    const-class p2, Lcom/sma/androidnetworklib/model/Response;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-static {p2, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/util/OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$2;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p0, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_1
    if-eqz p2, :cond_2

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public static synthetic OXO1(Ljava/lang/String;Landroid/app/Activity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->IiI10X(Ljava/lang/String;Landroid/app/Activity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->iO(Ljava/lang/String;)V

    return-void
.end method

.method public static final XO0O10(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "uuid"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wd1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/wd1;-><init>(Ljava/lang/String;Landroid/app/Activity;)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    invoke-static {p1, p1, v0, p0, p1}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->IO(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public static final XOO0ii0(DDDDDDLandroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p12    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p13    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p14    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDDDD",
            "Landroid/app/Activity;",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/sma/smartv3/model/OffLineGenerateFileVo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p12

    const/4 v1, 0x0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "offLineGenerateFile ->"

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string p1, "minLongitude"

    invoke-virtual {v2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string p1, "minLatitude"

    invoke-virtual {v2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string p1, "maxLongitude"

    invoke-virtual {v2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6, p7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    const-string p1, "maxLatitude"

    invoke-virtual {v2, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance p2, Lcom/google/gson/Gson;

    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    const-class p3, Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string p4, "type"

    invoke-virtual {v2, p4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;->getMUuid()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    const-string p3, "deviceUuid"

    invoke-virtual {v2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object p3

    const-string p4, "manufacturer"

    invoke-virtual {v2, p4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "model"

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPrototype()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p3, "reservedStorage"

    invoke-virtual {v2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p10, p11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p3, "locationLat"

    invoke-virtual {v2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p8, p9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p3, "locationLon"

    invoke-virtual {v2, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    const-class p3, Lcom/sma/smartv3/model/OffLineUserSession;

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-virtual {p3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    :cond_2
    check-cast p0, Lcom/sma/smartv3/model/OffLineUserSession;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p3, "Content-Type"

    const-string p4, "application/json"

    invoke-virtual {p1, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/OffLineUserSession;->getToken()Ljava/lang/String;

    move-result-object p3

    const-string p4, "token"

    invoke-virtual {p1, p4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "userId"

    invoke-virtual {p0}, Lcom/sma/smartv3/model/OffLineUserSession;->getUserId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance p3, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineGenerateFile$1;

    move-object/from16 p4, p14

    invoke-direct {p3, p4}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineGenerateFile$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object/from16 p4, p13

    invoke-virtual {p0, v0, p4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p4

    invoke-static {}, Lkotlin/collections/OXO1;->I1()Ljava/util/Map;

    move-result-object p5

    invoke-static {p5, p1}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p5

    invoke-static {p5, v2}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p5

    const-string v3, "https://map.iipii.net/optionalMap/generateFile"

    invoke-virtual {p0, v3, p5}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance p0, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$1;

    invoke-direct {p0, v0, p3, p4}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v3}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addApplicationJsonBody(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p3, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class p3, Lcom/sma/smartv3/model/OffLineGenerateFileVo;

    aput-object p3, p2, v1

    const-class p3, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {p3, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$2;

    invoke-direct {p3, p0}, Lcom/sma/smartv3/util/OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, p3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public static final iO(Ljava/lang/String;)V
    .locals 7

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "\u975e\u6cd5\u8bf7\u6c42"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p0

    const/4 v6, -0x1

    if-le p0, v6, :cond_0

    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-class v0, Lcom/sma/smartv3/model/OffLineUserSession;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    const p0, 0x7f141196

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "12002"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p0

    if-le p0, v6, :cond_1

    const p0, 0x7f140e7b

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Object;

    invoke-static {v0, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
