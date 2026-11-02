.class public final Lcom/sma/smartv3/network/RequestCommonMethod;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRequestCommonMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,133:1\n183#2,4:134\n196#2:146\n176#2,11:150\n196#2:169\n176#2,11:173\n196#2:192\n252#3,7:138\n270#3:145\n252#3,7:161\n270#3:168\n252#3,7:184\n270#3:191\n19#4:147\n15#4:148\n90#4:149\n18#4,2:170\n15#4:172\n*S KotlinDebug\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n*L\n56#1:134,4\n56#1:146\n100#1:150,11\n100#1:169\n130#1:173,11\n130#1:192\n56#1:138,7\n56#1:145\n100#1:161,7\n100#1:168\n130#1:184,7\n130#1:191\n77#1:147\n77#1:148\n80#1:149\n115#1:170,2\n115#1:172\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRequestCommonMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,133:1\n183#2,4:134\n196#2:146\n176#2,11:150\n196#2:169\n176#2,11:173\n196#2:192\n252#3,7:138\n270#3:145\n252#3,7:161\n270#3:168\n252#3,7:184\n270#3:191\n19#4:147\n15#4:148\n90#4:149\n18#4,2:170\n15#4:172\n*S KotlinDebug\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n*L\n56#1:134,4\n56#1:146\n100#1:150,11\n100#1:169\n130#1:173,11\n130#1:192\n56#1:138,7\n56#1:145\n100#1:161,7\n100#1:168\n130#1:184,7\n130#1:191\n77#1:147\n77#1:148\n80#1:149\n115#1:170,2\n115#1:172\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/network/RequestCommonMethod;

    invoke-direct {v0}, Lcom/sma/smartv3/network/RequestCommonMethod;-><init>()V

    sput-object v0, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getPhoneWithCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const-string p1, "+86"

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/network/RequestCommonMethod;->getPhoneWithCode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic requestVerificationCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    const/4 p6, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/sma/smartv3/network/RequestCommonMethod;->requestVerificationCode(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method


# virtual methods
.method public final getPhoneWithCode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final requestVerificationCode(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 5
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            "Landroid/widget/TextView;",
            "I",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "text"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "showCountDownTimeView"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "@"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p3, v1, v2, v3, v4}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lcom/sma/smartv3/util/UtilsKt;->IXOIIIO(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const p1, 0x7f140d1f

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void

    :cond_1
    invoke-static {p0, v4, p3, v0, v4}, Lcom/sma/smartv3/network/RequestCommonMethod;->getPhoneWithCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p3}, Lcom/blankj/utilcode/util/RegexUtils;->isEmail(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const p1, 0x7f1404d2

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(I)V

    return-void

    :cond_3
    :goto_1
    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {p3, p5}, Lcom/sma/smartv3/network/RequestBodyKt;->getVerificationCodeBody(Ljava/lang/String;I)Ljava/util/HashMap;

    move-result-object p3

    new-instance p5, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;

    invoke-direct {p5, p1, p4, p6}, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$1;-><init>(Landroid/app/Activity;Landroid/widget/TextView;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v1, p1, p2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p2

    sget-object p4, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {p4}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object p4

    const-string p6, "/verification_code/request"

    invoke-virtual {v1, p4, p6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, p3}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance p6, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$$inlined$post$1;

    invoke-direct {p6, p1, p5, p2}, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$$inlined$post$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p4}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/reflect/Type;

    const-class p3, Ljava/lang/String;

    aput-object p3, p2, v2

    const-class p3, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {p3, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance p3, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$$inlined$post$2;

    invoke-direct {p3, p6}, Lcom/sma/smartv3/network/RequestCommonMethod$requestVerificationCode$$inlined$post$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, p3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final updateDeviceInfo(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 42
    .param p1    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "callback"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->X00110X()Z

    move-result v3

    const-class v4, Ljava/lang/String;

    const-class v5, Lcom/sma/androidnetworklib/model/Response;

    const-string v6, "platform"

    const-string v7, "projectId"

    const-string v8, "identity"

    const/4 v9, 0x0

    const-class v10, Lcom/sma/smartv3/model/AppUser;

    if-eqz v3, :cond_3

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v11

    new-instance v12, Lcom/sma/smartv3/model/AppUser;

    const v40, 0x7ffffff

    const/16 v41, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v12 .. v41}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/google/gson/Gson;

    invoke-direct {v13}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11, v10}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_0

    goto :goto_0

    :cond_0
    move-object v12, v11

    :goto_0
    move-object v11, v12

    check-cast v11, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_1

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v11, Lcom/google/gson/Gson;

    invoke-direct {v11}, Lcom/google/gson/Gson;-><init>()V

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "NO_LOGIN_USER_INFO"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x5f

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3, v10}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    if-eqz v3, :cond_1

    move-object v12, v3

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    sget-object v10, Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;->OXO1:Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;->OXO1()Lcom/sma/smartv3/model/BleDevice;

    move-result-object v10

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    check-cast v12, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v12}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v8, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "58"

    invoke-virtual {v11, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "bleName"

    invoke-virtual {v11, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getAddress()Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0x4

    const/16 v18, 0x0

    const-string v14, ":"

    const-string v15, ""

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "macAddress"

    invoke-virtual {v11, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1IX()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "devicePrototype"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getPrototype()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "flag"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getFirmwareFlag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "firmwareVersion"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getVersion()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v13, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v14, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    const/16 v17, 0x6

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "uiVersion"

    invoke-virtual {v11, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "fontVersion"

    const-string v7, "0.0.1"

    invoke-virtual {v11, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    new-instance v7, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$2;

    invoke-direct {v7}, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$2;-><init>()V

    invoke-virtual {v6, v9, v9}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v8

    sget-object v13, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v13}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v13

    const-string v14, "/ble_device/update2"

    invoke-virtual {v6, v13, v14}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v6, v15, v11}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v6, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v13, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$1;

    invoke-direct {v13, v9, v7, v8}, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v6}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v7

    invoke-virtual {v7, v11}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v6

    sget-object v7, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v6, v7}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v6

    invoke-virtual {v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v6

    new-array v2, v2, [Ljava/lang/reflect/Type;

    aput-object v4, v2, v1

    invoke-static {v5, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$2;

    invoke-direct {v2, v13}, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v6, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getSettings()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Lcom/sma/smartv3/model/AppUser;->setSettings(Ljava/lang/String;)V

    if-eqz v3, :cond_2

    sget-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v1, v12, v0}, Lcom/sma/smartv3/biz/UploadInfoManager;->IO(Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_2
    sget-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v1, v12, v0}, Lcom/sma/smartv3/biz/UploadInfoManager;->I0IIOi(Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_3
    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v11, Lcom/google/gson/Gson;

    invoke-direct {v11}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3, v10}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v10}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    :cond_4
    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    sget-object v10, Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;->OXO1:Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/OOiOOO1OI;->OXO1()Lcom/sma/smartv3/model/BleDevice;

    move-result-object v10

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v8, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getProjectId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v7, "name"

    invoke-virtual {v11, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "address"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getAddress()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getPlatform()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "prototype"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getPrototype()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "firmwareFlag"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getFirmwareFlag()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getAgpsType()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v6, "agpsType"

    invoke-virtual {v11, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "version"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getVersion()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "extraInfo"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getExtraInfo()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "settings"

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleDevice;->getSettings()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v3, v9, v9}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v6

    sget-object v7, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v7}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v7

    const-string v8, "/ble_device/update"

    invoke-virtual {v3, v7, v8}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10, v11}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v3, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$3;

    invoke-direct {v7, v9, v0, v6}, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$3;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v3}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v3, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/reflect/Type;

    aput-object v4, v2, v1

    invoke-static {v5, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$4;

    invoke-direct {v2, v7}, Lcom/sma/smartv3/network/RequestCommonMethod$updateDeviceInfo$$inlined$post$default$4;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method
