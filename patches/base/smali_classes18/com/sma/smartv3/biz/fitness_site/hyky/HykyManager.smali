.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n18#2,2:392\n15#2:394\n18#2,2:395\n15#2:397\n18#2,2:398\n15#2:400\n18#2,2:401\n15#2:403\n18#2,2:404\n15#2:406\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n*L\n57#1:392,2\n57#1:394\n71#1:395,2\n71#1:397\n72#1:398,2\n72#1:400\n95#1:401,2\n95#1:403\n178#1:404,2\n178#1:406\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,391:1\n18#2,2:392\n15#2:394\n18#2,2:395\n15#2:397\n18#2,2:398\n15#2:400\n18#2,2:401\n15#2:403\n18#2,2:404\n15#2:406\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager\n*L\n57#1:392,2\n57#1:394\n71#1:395,2\n71#1:397\n72#1:398,2\n72#1:400\n95#1:401,2\n95#1:403\n178#1:404,2\n178#1:406\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final instance$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDeviceCode:Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mHykyModel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHykyUpload$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private token:Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II1O1i;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/II1O1i;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->instance$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "HykyManager"

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->TAG:Ljava/lang/String;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/ng5;->iO(Lkotlinx/coroutines/XiOIO;ILjava/lang/Object;)Lkotlinx/coroutines/O00;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    iput-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->token:Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iX0XiXXOi;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/iX0XiXXOi;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mHykyUpload$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0iOOOX0i;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/i0iOOOX0i;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mHykyModel$delegate:Lkotlin/Lazy;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_1
    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    iput-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_2
    check-cast v0, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mDeviceCode:Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mBleHandleCallback:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    return-void
.end method

.method public static synthetic OXO1()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->instance_delegate$lambda$0()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XIi00iiXO()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mHykyUpload_delegate$lambda$0()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getInstance$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->instance$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static final synthetic access$getMBleHandleCallback$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mBleHandleCallback:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    return-object p0
.end method

.method public static final synthetic access$getMHykyModel(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getMHykyModel()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v0

    return-object v0
.end method

.method private final getMHykyModel()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mHykyModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    return-object v0
.end method

.method private final getMHykyUpload()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mHykyUpload$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    return-object v0
.end method

.method public static synthetic iO()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mHykyModel_delegate$lambda$0()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object v0

    return-object v0
.end method

.method private static final instance_delegate$lambda$0()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;-><init>()V

    return-object v0
.end method

.method private final isEnable()Z
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "HYKY_AUTH_STATE"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mDeviceCode:Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;->deviceInfoExists()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    sget-object v5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->noAreaCodePhone()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    move v3, v4

    :cond_2
    if-eqz v3, :cond_3

    iput-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    :cond_3
    return v3
.end method

.method private static final mHykyModel_delegate$lambda$0()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;-><init>()V

    return-object v0
.end method

.method private static final mHykyUpload_delegate$lambda$0()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bindDevice(Z)V
    .locals 8

    if-nez p1, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mBleHandleCallback:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$bindDevice$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;ZLkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final checkAuthStatus(Landroid/app/Activity;)V
    .locals 9
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->TAG:Ljava/lang/String;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " checkAuthStatus: start "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "UPLOAD_SLEEP_HYKY_DATE"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I0IIOi()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v3, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " 00:00:00"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " checkAuthStatus: firstUploadDate = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    :cond_2
    check-cast p1, Lcom/sma/smartv3/model/AppUser;

    sget-object v1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceMac(Z)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->isLogin()Z

    move-result v3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->getPhone()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " checkAuthStatus:  isLogin = "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " , phone = "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , deviceMAC = "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->isLogin()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AppUser;->noAreaCodePhone()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_4
    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v5, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v1, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$checkAuthStatus$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lcom/sma/smartv3/model/AppUser;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_5
    :goto_0
    return-void
.end method

.method public final getMAppUser()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-object v0
.end method

.method public final getMDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mDeviceCode:Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    return-object v0
.end method

.method public final getScope()Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-object v0
.end method

.method public final getToken()Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->token:Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    return-object v0
.end method

.method public final getUploadSleepLastDate()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I0IIOi()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v6, 0x1

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " 00:00:00"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UPLOAD_SLEEP_HYKY_DATE"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getMHykyModel()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyModel;->refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setMAppUser(Lcom/sma/smartv3/model/AppUser;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public final setMDeviceCode(Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->mDeviceCode:Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    return-void
.end method

.method public final setToken(Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->token:Lcom/sma/smartv3/biz/fitness_site/hyky/GetTokenHYKY$HykyTokenData;

    return-void
.end method

.method public final uploadData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->isEnable()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getMHykyUpload()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUpload;->putData(Ljava/util/List;)V

    return-void
.end method

.method public final uploadDataWeight(Lcom/sma/smartv3/db/entity/Weight;)V
    .locals 7
    .param p1    # Lcom/sma/smartv3/db/entity/Weight;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDataWeight$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDataWeight$1;-><init>(Lcom/sma/smartv3/db/entity/Weight;Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final uploadDeviceInfo()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iIIX0XI()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->scope:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDeviceInfo$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$uploadDeviceInfo$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
