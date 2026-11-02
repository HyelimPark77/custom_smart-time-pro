.class public final Lcom/sma/smartv3/biz/UploadInfoManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUploadInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n90#2:253\n19#2:254\n15#2:255\n90#2:256\n19#2:313\n15#2:314\n90#2:315\n90#2:376\n848#3,30:257\n878#3,3:288\n891#3,4:300\n905#3:312\n99#3,16:316\n123#3:355\n176#3,11:356\n196#3:375\n1#4:287\n226#5,8:291\n245#5:299\n252#5,7:304\n270#5:311\n116#5,23:332\n252#5,7:367\n270#5:374\n*S KotlinDebug\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n*L\n64#1:253\n68#1:254\n68#1:255\n71#1:256\n156#1:313\n156#1:314\n159#1:315\n243#1:376\n123#1:257,30\n123#1:288,3\n123#1:300,4\n123#1:312\n184#1:316,16\n184#1:355\n211#1:356,11\n211#1:375\n123#1:287\n123#1:291,8\n123#1:299\n123#1:304,7\n123#1:311\n184#1:332,23\n211#1:367,7\n211#1:374\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUploadInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n90#2:253\n19#2:254\n15#2:255\n90#2:256\n19#2:313\n15#2:314\n90#2:315\n90#2:376\n848#3,30:257\n878#3,3:288\n891#3,4:300\n905#3:312\n99#3,16:316\n123#3:355\n176#3,11:356\n196#3:375\n1#4:287\n226#5,8:291\n245#5:299\n252#5,7:304\n270#5:311\n116#5,23:332\n252#5,7:367\n270#5:374\n*S KotlinDebug\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n*L\n64#1:253\n68#1:254\n68#1:255\n71#1:256\n156#1:313\n156#1:314\n159#1:315\n243#1:376\n123#1:257,30\n123#1:288,3\n123#1:300,4\n123#1:312\n184#1:316,16\n184#1:355\n211#1:356,11\n211#1:375\n123#1:287\n123#1:291,8\n123#1:299\n123#1:304,7\n123#1:311\n184#1:332,23\n211#1:367,7\n211#1:374\n*E\n"
    }
.end annotation


# static fields
.field public static final OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static iO:Lcom/android/mltcode/paycertificationapi/ms;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/UploadInfoManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    const-string v0, "UploadInfoManager"

    sput-object v0, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/biz/UploadInfoManager;Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/UploadInfoManager;->IO(Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/biz/UploadInfoManager;Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/UploadInfoManager;->I0IIOi(Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/biz/UploadInfoManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/UploadInfoManager;->IiI10X()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/biz/UploadInfoManager;DDLcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO(DDLcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method


# virtual methods
.method public final I0IIOi(Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 5
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/AppUser;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "appUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getWeight()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const p1, 0x7f14147f

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/UploadInfoManager;->O00(Lcom/sma/smartv3/model/AppUser;)V

    sget-object v0, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " uploadLoginUserInfo -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setThirdPlatform(Lcom/sma/smartv3/model/ThirdPlatform;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0IIOi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/biz/UploadInfoManager$uploadLoginUserInfo$1;

    invoke-direct {v3, p2}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadLoginUserInfo$1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v1, v0, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p2

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    sget-object v1, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/appuser/update"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$1;

    invoke-direct {v4, v0, v3, p2}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "avatar"

    invoke-virtual {p2, v0, v2}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartFile(Ljava/lang/String;Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    :cond_1
    invoke-virtual {p2, p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/network/NetWorkUtils$upload$$inlined$upload$1;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils$upload$$inlined$upload$1;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class v0, Lcom/sma/smartv3/model/AppUser;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/biz/UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$2;

    invoke-direct {v0, v4}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final I0iXXO()V
    .locals 35

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RAW_WEATHER_REALTIME"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v5, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/WeatherRealtime;

    sget-object v2, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " uploadPhoneInfo weather -> "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v5, Lcom/sma/smartv3/model/AppUser;

    const v33, 0x7ffffff

    const/16 v34, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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

    invoke-direct/range {v5 .. v34}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    const-class v7, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    check-cast v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v6, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-nez v3, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "NO_LOGIN_USER_INFO"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AppUser;

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    move-object v5, v0

    :goto_1
    move-object/from16 v0, p0

    goto :goto_2

    :cond_1
    move-object/from16 v0, p0

    invoke-static {v0, v5, v8, v6, v8}, Lcom/sma/smartv3/biz/UploadInfoManager;->OIX0iXi(Lcom/sma/smartv3/biz/UploadInfoManager;Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void

    :cond_2
    move v3, v9

    goto :goto_1

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " uploadPhoneInfo appUser -> "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-nez v1, :cond_4

    const-string v1, "LOCATION"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->iO:Lcom/android/mltcode/paycertificationapi/ms;

    if-nez v1, :cond_3

    new-instance v1, Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadPhoneInfo$1;-><init>()V

    invoke-static {v1, v9, v6, v8}, Lcom/android/mltcode/paycertificationapi/ns;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IO0OI;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->iO:Lcom/android/mltcode/paycertificationapi/ms;

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " startLocation"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->iO:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v1, :cond_5

    const v2, 0x7f140c4f

    invoke-virtual {v1, v2, v9}, Lcom/android/mltcode/paycertificationapi/ms;->IiI10X(IZ)V

    return-void

    :cond_4
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getCity()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/UploadInfoManager;->XOO0ii0()V

    :cond_5
    return-void
.end method

.method public final IO(Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 6
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/AppUser;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "appUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/UploadInfoManager;->O00(Lcom/sma/smartv3/model/AppUser;)V

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setServer(I)V

    sget-object v0, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " uploadNoLoginUserInfo -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {p1}, Lcom/sma/smartv3/network/RequestBodyKt;->getUploadNoLoginUserInfo(Lcom/sma/smartv3/model/AppUser;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/biz/UploadInfoManager$uploadNoLoginUserInfo$1;

    invoke-direct {v1, p2}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadNoLoginUserInfo$1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v3}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/appuser/upload_no_login_user_info"

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, p1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/biz/UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$1;

    invoke-direct {v3, p2, v1, v2}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class v0, Lcom/sma/smartv3/model/AppUser;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v0, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/biz/UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$2;

    invoke-direct {v0, v3}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final IiI10X()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/UploadInfoManager;->iO:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method

.method public final O00(Lcom/sma/smartv3/model/AppUser;)V
    .locals 5
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "appUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->iIXi1iiXI()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setServer(I)V

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setProjectId(I)V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X11iII1O1()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setOsVersion(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXX11i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setPhoneModel(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XX1Oi()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setPhoneIdentity(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->iiiO(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setCountry(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RAW_WEATHER_REALTIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/WeatherRealtime;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/WeatherRealtime;->getSys_country()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/model/AppUser;->setCountry(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/model/AppUser;->setCity(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/model/WeatherRealtime;->getLon()F

    move-result v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/model/AppUser;->setLongitude(F)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/WeatherRealtime;->getLat()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AppUser;->setLatitude(F)V

    :cond_2
    return-void
.end method

.method public final XIi00iiXO(DDLcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 18
    .param p5    # Lcom/android/mltcode/paycertificationapi/O1XIiIO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Lcom/sma/smartv3/model/WeatherRealtime;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x1

    const-string v2, "lon"

    const-string v3, "lat"

    sget-object v4, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " getCity -> "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v6, p1

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v8, p3

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v4, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static/range {p1 .. p4}, Lcom/sma/smartv3/network/RequestBodyKt;->getWeatherRealtimeBody(DD)Ljava/util/HashMap;

    move-result-object v5

    new-instance v6, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$1;

    move-object/from16 v7, p5

    invoke-direct {v6, v7}, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v4, v8, v8}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v9

    sget-object v10, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v10}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v10

    const-string v11, "/weather_info/realtime"

    invoke-virtual {v4, v10, v11}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v12}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v13

    const-class v14, Lcom/sma/smartv3/model/WeatherRealtime;

    const-class v15, Lcom/sma/androidnetworklib/model/Response;

    const/16 v16, 0x0

    const-string v0, " getNewApiWeather : enableNewWeatherApi = "

    if-eqz v13, :cond_4

    invoke-static {v11, v11, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->XIIIO(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v12

    if-eqz v12, :cond_0

    const-string v12, "/weather_info/realtime/v2"

    goto :goto_0

    :cond_0
    const-string v12, "/weather_info/forecast"

    invoke-static {v11, v12, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->XIIIO(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v12

    if-eqz v12, :cond_1

    const-string v12, "/weather_info/forecast/v2"

    goto :goto_0

    :cond_1
    move-object v12, v11

    :goto_0
    invoke-static {v5}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v13

    :try_start_0
    invoke-interface {v13, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2

    new-instance v8, Ljava/math/BigDecimal;

    invoke-interface {v13, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object/from16 v1, v17

    check-cast v1, Ljava/lang/String;

    invoke-direct {v8, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 p2, v14

    const/4 v14, 0x1

    :try_start_1
    invoke-virtual {v8, v14, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_0
    move-object/from16 p2, v14

    goto :goto_2

    :cond_2
    move-object/from16 p2, v14

    :goto_1
    invoke-interface {v13, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/math/BigDecimal;

    invoke-interface {v13, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v3, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v14, 0x1

    invoke-virtual {v1, v14, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_3
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v4, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/UploadInfoManager;->XO0O10()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v6, v9}, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v2}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v14, 0x1

    new-array v2, v14, [Ljava/lang/reflect/Type;

    aput-object p2, v2, v16

    invoke-static {v15, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$2;

    invoke-direct {v3, v1}, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v2, v3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_4
    move-object/from16 p2, v14

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v7}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/UploadInfoManager;->XO0O10()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$3;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v6, v9}, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$3;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v14, 0x1

    new-array v2, v14, [Ljava/lang/reflect/Type;

    aput-object p2, v2, v16

    invoke-static {v15, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$4;

    invoke-direct {v3, v1}, Lcom/sma/smartv3/biz/UploadInfoManager$getCity$$inlined$getNewApiWeather$default$4;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v2, v3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final XO0O10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/UploadInfoManager;->XIi00iiXO:Ljava/lang/String;

    return-object v0
.end method

.method public final XOO0ii0()V
    .locals 33

    move-object/from16 v0, p0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    new-instance v2, Lcom/sma/smartv3/biz/UploadInfoManager$uploadInfo$1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/UploadInfoManager$uploadInfo$1;-><init>()V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/network/RequestCommonMethod;->updateDeviceInfo(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/model/AppUser;

    const v31, 0x7ffffff

    const/16 v32, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

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

    invoke-direct/range {v3 .. v32}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    move-object v2, v3

    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getIdentity()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NO_LOGIN_USER_INFO"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    move-object v3, v1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    const/4 v1, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    invoke-static {v0, v3, v4, v1, v4}, Lcom/sma/smartv3/biz/UploadInfoManager;->OIX0iXi(Lcom/sma/smartv3/biz/UploadInfoManager;Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void

    :cond_3
    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    invoke-static {v0, v3, v4, v1, v4}, Lcom/sma/smartv3/biz/UploadInfoManager;->OIi0(Lcom/sma/smartv3/biz/UploadInfoManager;Lcom/sma/smartv3/model/AppUser;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void
.end method
