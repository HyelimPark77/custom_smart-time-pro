.class public final Lcom/sma/smartv3/db/entity/BleDeviceCache;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/db/entity/BleDeviceCache;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "BleDeviceCache"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mDeviceInfo:Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static final mDeviceInfoDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/db/entity/BleDeviceCache;

    invoke-direct {v0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;-><init>()V

    sput-object v0, Lcom/sma/smartv3/db/entity/BleDeviceCache;->INSTANCE:Lcom/sma/smartv3/db/entity/BleDeviceCache;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1X1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/i1X1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfoDao$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1()Lcom/sma/smartv3/db/dao/DeviceInfoDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfoDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    return-object v0
.end method

.method private final getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfoDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    return-object v0
.end method

.method private static final mDeviceInfoDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/DeviceInfoDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->deviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final addDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleDeviceCache addDeviceInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->insertOrUpdate(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)J

    return-void
.end method

.method public final getActiveDeviceInfo()Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->getActiveDevice()Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public final getDeviceInfo(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->getDeviceByMac(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    move-result-object p1

    return-object p1
.end method

.method public final getDeviceInfos()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/RecordDeviceInfo;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->getAllDevices()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getMDeviceInfo()Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfo:Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    return-object v0
.end method

.method public final removeDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleDeviceCache removeDeviceInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->getMMac()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->deleteByMac(Ljava/lang/String;)I

    return-void
.end method

.method public final setActiveDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfo:Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->setActive(Z)V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleDeviceCache setActiveDeviceInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->getMMac()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->setActiveDevice(Ljava/lang/String;)V

    return-void
.end method

.method public final setMDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfo:Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    return-void
.end method

.method public final updateDeviceInfo(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)V
    .locals 3
    .param p1    # Lcom/sma/smartv3/db/entity/RecordDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/RecordDeviceInfo;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    sput-object p1, Lcom/sma/smartv3/db/entity/BleDeviceCache;->mDeviceInfo:Lcom/sma/smartv3/db/entity/RecordDeviceInfo;

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleDeviceCache updateDeviceInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/BleDeviceCache;->getMDeviceInfoDao()Lcom/sma/smartv3/db/dao/DeviceInfoDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/DeviceInfoDao;->insertOrUpdate(Lcom/sma/smartv3/db/entity/RecordDeviceInfo;)J

    return-void
.end method
