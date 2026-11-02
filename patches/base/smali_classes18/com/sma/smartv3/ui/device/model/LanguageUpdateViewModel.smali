.class public final Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanguageUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n310#2,11:401\n310#2,11:412\n774#3:423\n865#3,2:424\n1788#3,4:426\n774#3:430\n865#3,2:431\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel\n*L\n72#1:401,11\n167#1:412,11\n275#1:423\n275#1:424,2\n282#1:426,4\n286#1:430\n286#1:431,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageUpdateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n310#2,11:401\n310#2,11:412\n774#3:423\n865#3,2:424\n1788#3,4:426\n774#3:430\n865#3,2:431\n*S KotlinDebug\n*F\n+ 1 LanguageUpdateViewModel.kt\ncom/sma/smartv3/ui/device/model/LanguageUpdateViewModel\n*L\n72#1:401,11\n167#1:412,11\n275#1:423\n275#1:424,2\n282#1:426,4\n286#1:430\n286#1:431,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDevLanguageData:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iX1IIXX11;",
            ">;"
        }
    .end annotation
.end field

.field private mLanguagesMaxCount:I

.field private final mServiceLanguageData:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/y44;",
            ">;"
        }
    .end annotation
.end field

.field private popup:Landroidx/lifecycle/MutableLiveData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/android/mltcode/paycertificationapi/qk$OXO1;",
            ">;"
        }
    .end annotation
.end field

.field private uiType:Landroidx/lifecycle/MutableLiveData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/sma/smartv3/ui/device/model/LanguageUiType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    const-string v0, "LanguageUpdateViewModel"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->TAG:Ljava/lang/String;

    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->uiType:Landroidx/lifecycle/MutableLiveData;

    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qk$OXO1;

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    invoke-direct/range {v1 .. v7}, Lcom/android/mltcode/paycertificationapi/qk$OXO1;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->popup:Landroidx/lifecycle/MutableLiveData;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mDevLanguageData:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mServiceLanguageData:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$binFileToDevice(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->binFileToDevice(Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBleDevicesLanguageData(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getBleDevicesLanguageData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLanguageBinData(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getLanguageBinData(Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getServerLanguageList(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->getServerLanguageList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method private final binFileToDevice(Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/rk;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;

    invoke-direct {v1, p0, p1, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/android/mltcode/paycertificationapi/rk;Lcom/android/mltcode/paycertificationapi/IO0i;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v2, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v4, Ljava/io/File;

    sget-object v5, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/rk;->XIi00iiXO()Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v5, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    new-instance p1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XIi00iiXO;

    invoke-direct {p1, v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;)V

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method private final getBleDevicesLanguageData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/szabh/smable3/entity/BleDeviceLanguages2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$O00;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$O00;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v2, v1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->DEVICE_LANGUAGES2:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    new-instance v2, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XO0O10;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$O00;)V

    invoke-interface {v0, v2}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object v0
.end method

.method private final getLanguageBinData(Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/rk;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/rk;->XIi00iiXO()Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileUrl()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/rk;->XIi00iiXO()Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object p1

    new-instance v4, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$getLanguageBinData$2$1;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {v1, v2, v3, p1, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object p1
.end method

.method private final getServerLanguageList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-[",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkotlin/coroutines/SafeContinuation;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    sget-object v1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    new-instance v2, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$IiI10X;

    invoke-direct {v2, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$IiI10X;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->XiOIii1(Lcom/sma/smartv3/biz/DeviceInfoChecker;Lcom/android/mltcode/paycertificationapi/O0Oiii;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lkotlin/coroutines/SafeContinuation;->XIi00iiXO()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_0
    return-object v0
.end method

.method public static synthetic refreshData$default(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/sma/smartv3/ui/device/model/LanguageUiType;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/sma/smartv3/ui/device/model/LanguageUiType;->NORMAL:Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->refreshData(Lcom/sma/smartv3/ui/device/model/LanguageUiType;)V

    return-void
.end method


# virtual methods
.method public final bottomClick()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->uiType:Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/model/LanguageUiType;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mServiceLanguageData:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v3, v0, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/y44;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/y44;->XiOIO()I

    move-result v5

    if-eq v5, v1, :cond_4

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/y44;->XiOIO()I

    move-result v5

    if-eq v5, v2, :cond_4

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/y44;->iIiiO()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_4
    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_1

    :cond_5
    :goto_2
    iget v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mLanguagesMaxCount:I

    if-gt v4, v0, :cond_8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mServiceLanguageData:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/android/mltcode/paycertificationapi/y44;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/y44;->XiOIO()I

    move-result v4

    if-ne v4, v1, :cond_6

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {p0, v2}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->updateLanguage(Ljava/util/List;)V

    return-void

    :cond_8
    const v0, 0x7f140dee

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mDevLanguageData:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->IIX1OXO()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->XIi00iiXO()Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->updateLanguage(Ljava/util/List;)V

    return-void
.end method

.method public final getMDevLanguageData()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/iX1IIXX11;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mDevLanguageData:Ljava/util/List;

    return-object v0
.end method

.method public final getMLanguagesMaxCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mLanguagesMaxCount:I

    return v0
.end method

.method public final getMServiceLanguageData()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/y44;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mServiceLanguageData:Ljava/util/List;

    return-object v0
.end method

.method public final getPopup()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/android/mltcode/paycertificationapi/qk$OXO1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->popup:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getUiType()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/sma/smartv3/ui/device/model/LanguageUiType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->uiType:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final refreshData(Lcom/sma/smartv3/ui/device/model/LanguageUiType;)V
    .locals 7
    .param p1    # Lcom/sma/smartv3/ui/device/model/LanguageUiType;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$refreshData$1;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Lcom/sma/smartv3/ui/device/model/LanguageUiType;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final removeDeviceLanguagesByIndex(I)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mDevLanguageData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->OXO1()Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;->getMCode()I

    move-result v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mServiceLanguageData:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/android/mltcode/paycertificationapi/y44;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/y44;->XIi00iiXO()Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result v3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iX1IIXX11;->OXO1()Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;->getMCode()I

    move-result v4

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/android/mltcode/paycertificationapi/y44;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/y44;->IiI10X(Lcom/szabh/smable3/entity/BleDeviceLanguagesItem;)V

    :cond_2
    return-void
.end method

.method public final setMLanguagesMaxCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->mLanguagesMaxCount:I

    return-void
.end method

.method public final setPopup(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/android/mltcode/paycertificationapi/qk$OXO1;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->popup:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method

.method public final setUiType(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/sma/smartv3/ui/device/model/LanguageUiType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->uiType:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method

.method public final updateLanguage(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/mltcode/paycertificationapi/rk;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$updateLanguage$1;-><init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
