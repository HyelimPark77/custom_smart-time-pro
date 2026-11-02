.class public final Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/android/mltcode/paycertificationapi/dc;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,75:1\n18#2,2:76\n15#2:78\n*S KotlinDebug\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n*L\n30#1:76,2\n30#1:78\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,75:1\n18#2,2:76\n15#2:78\n*S KotlinDebug\n*F\n+ 1 DeveloperInfoActivity.kt\ncom/sma/smartv3/ui/me/DeveloperInfoActivity\n*L\n30#1:76,2\n30#1:78\n*E\n"
    }
.end annotation


# instance fields
.field private final mDeviceInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mIsOpenRunTimeLog:Z

.field private final mMtkOtaMeta$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mNotificationListener$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mWeather:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mWeatherForecast:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mWeatherRealtime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mWeatherStatus:Lcom/android/mltcode/paycertificationapi/tv6;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mNotificationListener$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/android/mltcode/paycertificationapi/tv6;

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
    check-cast v1, Lcom/android/mltcode/paycertificationapi/tv6;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mWeatherStatus:Lcom/android/mltcode/paycertificationapi/tv6;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-class v4, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mWeatherRealtime:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST:Lcom/szabh/smable3/BleKey;

    const-class v4, Lcom/szabh/smable3/entity/BleWeatherForecast;

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mWeatherForecast:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n\n"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mWeather:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1XI0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I1XI0;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mDeviceInfo$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0iI000XX;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I0iI000XX;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mMtkOtaMeta$delegate:Lkotlin/Lazy;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "IS_OPEN_DEBUG_MODE"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mIsOpenRunTimeLog:Z

    sget-object v3, Lcom/szabh/smable3/BleKey;->SEDENTARINESS:Lcom/szabh/smable3/BleKey;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-class v4, Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mSedentarinessSettings:Lcom/szabh/smable3/entity/BleSedentarinessSettings;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mNotificationListener_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mMtkOtaMeta_delegate$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XXI()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mDeviceInfo_delegate$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final getMDeviceInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mDeviceInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getMMtkOtaMeta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mMtkOtaMeta$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getMNotificationListener()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mNotificationListener$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final mDeviceInfo_delegate$lambda$0()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final mMtkOtaMeta_delegate$lambda$0()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMtkOtaMeta()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final mNotificationListener_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/sma/smartv3/ble/MyNotificationListenerService;->O001I:Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;->O00(Landroid/content/Context;)Z

    move-result p0

    invoke-virtual {v0}, Lcom/sma/smartv3/ble/MyNotificationListenerService$OXO1;->IiI10X()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isEnabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ", isRunning="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/android/mltcode/paycertificationapi/dc;I)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/dc;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p3, p3, 0x1

    .line 2
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/dc;->IiI10X()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ". "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x1020014

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    const p3, 0x1020015

    .line 3
    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/dc;->O00()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/android/mltcode/paycertificationapi/dc;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/android/mltcode/paycertificationapi/dc;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 14
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/dc;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dc;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i0iIXiI()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Support Devices"

    invoke-direct {v0, v3, v2}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dc;

    const-string v3, "NotificationListenerService"

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->getMNotificationListener()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v2

    new-instance v2, Lcom/android/mltcode/paycertificationapi/dc;

    const-string v4, "Weather"

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->mWeather:Ljava/lang/String;

    invoke-direct {v2, v4, v5}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v3

    new-instance v3, Lcom/android/mltcode/paycertificationapi/dc;

    const-string v5, "BleDeviceInfo"

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->getMDeviceInfo()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v5, v6}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v4

    new-instance v4, Lcom/android/mltcode/paycertificationapi/dc;

    const-string v6, "MtkOtaMeta"

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperInfoActivity;->getMMtkOtaMeta()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v6, v7}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v5

    new-instance v5, Lcom/android/mltcode/paycertificationapi/dc;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/q62;->O1i0()Lcom/sma/smartv3/model/DeviceConfigInfo;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "OnlineDeviceConfigInfo"

    invoke-direct {v5, v7, v6}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/dc;

    sget-object v7, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v8, Lcom/szabh/smable3/BleKey;->GOMORE_SET:Lcom/szabh/smable3/BleKey;

    const/16 v12, 0xc

    const/4 v13, 0x0

    const-class v9, Lcom/szabh/smable3/entity/BleGoMoreSettings;

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleGoMoreSettings;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleGoMoreSettings;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "gomore"

    invoke-direct {v6, v8, v7}, Lcom/android/mltcode/paycertificationapi/dc;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array/range {v0 .. v6}, [Lcom/android/mltcode/paycertificationapi/dc;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x1090004

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0060

    return v0
.end method
