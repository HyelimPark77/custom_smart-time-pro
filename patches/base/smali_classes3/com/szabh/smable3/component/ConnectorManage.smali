.class public final Lcom/szabh/smable3/component/ConnectorManage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConnectorManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectorManage.kt\ncom/szabh/smable3/component/ConnectorManage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n1#2:195\n1869#3,2:196\n*S KotlinDebug\n*F\n+ 1 ConnectorManage.kt\ncom/szabh/smable3/component/ConnectorManage\n*L\n134#1:196,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConnectorManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectorManage.kt\ncom/szabh/smable3/component/ConnectorManage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n1#2:195\n1869#3,2:196\n*S KotlinDebug\n*F\n+ 1 ConnectorManage.kt\ncom/szabh/smable3/component/ConnectorManage\n*L\n134#1:196,2\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/component/ConnectorManage;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static isMultiDevice:Z

.field private static mApp:Landroid/app/Application;

.field private static final mBleConnectors:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/component/MultiDeviceBleConnector;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/ConnectorManage;

    invoke-direct {v0}, Lcom/szabh/smable3/component/ConnectorManage;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/ConnectorManage;->INSTANCE:Lcom/szabh/smable3/component/ConnectorManage;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/functions/Function1;Lcom/szabh/smable3/component/MultiDeviceBleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/ConnectorManage;->forConnector$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/szabh/smable3/component/MultiDeviceBleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final forConnector$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/szabh/smable3/component/MultiDeviceBleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final forEachConnector(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/component/MultiDeviceBleConnector;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/szabh/smable3/component/MultiDeviceBleConnector;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final buildBleConnector(Ljava/lang/String;)Lcom/szabh/smable3/component/MultiDeviceBleConnector;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

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

    check-cast v3, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    if-nez v1, :cond_3

    new-instance v3, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-direct {v3}, Lcom/szabh/smable3/component/MultiDeviceBleConnector;-><init>()V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mApp:Landroid/app/Application;

    if-nez v0, :cond_2

    const-string v0, "mApp"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    sget-object v0, Lcom/szabh/smable3/component/BaseBleCache;->Companion:Lcom/szabh/smable3/component/BaseBleCache$Companion;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleCache$Companion;->create(Ljava/lang/String;)Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v11

    const/16 v12, 0x7e

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v13}, Lcom/szabh/smable3/component/BaseBleConnector;->init$default(Lcom/szabh/smable3/component/BaseBleConnector;Landroid/content/Context;ZZZZZILcom/szabh/smable3/component/BaseBleCache;ILjava/lang/Object;)Lcom/szabh/smable3/component/BaseBleConnector;

    sget-object p1, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->setRefreshDeviceInfo(Z)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v3}, Lcom/szabh/smable3/component/BleConnector;->activateMultiDeviceConnector(Lcom/szabh/smable3/component/MultiDeviceBleConnector;)V

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleCache;->activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V

    return-object v3

    :cond_3
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v1}, Lcom/szabh/smable3/component/BleConnector;->activateMultiDeviceConnector(Lcom/szabh/smable3/component/MultiDeviceBleConnector;)V

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleCache;->activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V

    return-object v1
.end method

.method public final deleteMultiDeviceBleConnector(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->clear()V

    invoke-virtual {v1}, Lcom/szabh/smable3/component/MultiDeviceBleConnector;->removeCallbacksAndMessages()V

    sget-object p1, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleCache;->clear()V

    :cond_2
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final forConnector(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/szabh/smable3/component/MultiDeviceBleConnector;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0i1I1IX;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/X0i1I1IX;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, v0, v1}, Lcom/szabh/smable3/component/ConnectorManage;->forEachConnector(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getCurDeviceBleConnector(Ljava/lang/String;)Lcom/szabh/smable3/component/MultiDeviceBleConnector;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

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

    check-cast v3, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    return-object v2
.end method

.method public final getMultiDeviceBleConnector(Ljava/lang/String;)Lcom/szabh/smable3/component/MultiDeviceBleConnector;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/szabh/smable3/component/ConnectorManage;->getCurDeviceBleConnector(Ljava/lang/String;)Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleCache;->activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->activateMultiDeviceConnector(Lcom/szabh/smable3/component/MultiDeviceBleConnector;)V

    :cond_0
    return-object p1
.end method

.method public final getMultiDeviceList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/component/MultiDeviceBleConnector;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    return-object v0
.end method

.method public final init(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mApp:Landroid/app/Application;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sput-object p1, Lcom/szabh/smable3/component/ConnectorManage;->mApp:Landroid/app/Application;

    return-void
.end method

.method public final isMultiDevice()Z
    .locals 1

    sget-boolean v0, Lcom/szabh/smable3/component/ConnectorManage;->isMultiDevice:Z

    return v0
.end method

.method public final newBleConnector(Ljava/lang/String;)Lcom/szabh/smable3/component/MultiDeviceBleConnector;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

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

    check-cast v3, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-virtual {v3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    if-nez v1, :cond_3

    new-instance v3, Lcom/szabh/smable3/component/MultiDeviceBleConnector;

    invoke-direct {v3}, Lcom/szabh/smable3/component/MultiDeviceBleConnector;-><init>()V

    sget-object v0, Lcom/szabh/smable3/component/ConnectorManage;->mApp:Landroid/app/Application;

    if-nez v0, :cond_2

    const-string v0, "mApp"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    sget-object v0, Lcom/szabh/smable3/component/BaseBleCache;->Companion:Lcom/szabh/smable3/component/BaseBleCache$Companion;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleCache$Companion;->create(Ljava/lang/String;)Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v11

    const/16 v12, 0x7e

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v13}, Lcom/szabh/smable3/component/BaseBleConnector;->init$default(Lcom/szabh/smable3/component/BaseBleConnector;Landroid/content/Context;ZZZZZILcom/szabh/smable3/component/BaseBleCache;ILjava/lang/Object;)Lcom/szabh/smable3/component/BaseBleConnector;

    sget-object p1, Lcom/szabh/smable3/component/ConnectorManage;->mBleConnectors:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->setRefreshDeviceInfo(Z)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v3}, Lcom/szabh/smable3/component/BleConnector;->activateMultiDeviceConnector(Lcom/szabh/smable3/component/MultiDeviceBleConnector;)V

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleCache;->activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V

    return-object v3

    :cond_3
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v1}, Lcom/szabh/smable3/component/BleConnector;->activateMultiDeviceConnector(Lcom/szabh/smable3/component/MultiDeviceBleConnector;)V

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleCache;->activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V

    return-object v1
.end method

.method public final setMultiDevice(Z)V
    .locals 0

    sput-boolean p1, Lcom/szabh/smable3/component/ConnectorManage;->isMultiDevice:Z

    return-void
.end method
