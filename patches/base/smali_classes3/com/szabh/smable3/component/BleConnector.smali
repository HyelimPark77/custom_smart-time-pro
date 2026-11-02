.class public final Lcom/szabh/smable3/component/BleConnector;
.super Lcom/szabh/smable3/component/BaseBleConnector;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/component/BleConnector$Builder;
    }
.end annotation


# static fields
.field public static final CH_MTK_OTA_META:Ljava/lang/String; = "c6a22916-f821-18bf-9704-0266f20e80fd"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/szabh/smable3/component/BleConnector;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final SERVICE_MTK:Ljava/lang/String; = "c6a22905-f821-18bf-9704-0266f20e80fd"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/component/BleConnector;

    invoke-direct {v0}, Lcom/szabh/smable3/component/BleConnector;-><init>()V

    sput-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/szabh/smable3/component/BaseBleConnector;-><init>()V

    return-void
.end method


# virtual methods
.method public final activateMultiDeviceConnector(Lcom/szabh/smable3/component/MultiDeviceBleConnector;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/component/MultiDeviceBleConnector;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "connector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleCache;->activateMultiDeviceActiveBleCache(Lcom/szabh/smable3/component/BaseBleCache;)V

    return-void
.end method

.method public addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleHandleCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public connectClassic()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->connectClassic()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->connectClassic()V

    return-void
.end method

.method public connectHID()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->connectHID()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->connectHID()V

    return-void
.end method

.method public getBleCache()Lcom/szabh/smable3/component/BaseBleCache;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->getBleCache()Lcom/szabh/smable3/component/BaseBleCache;

    move-result-object v0

    return-object v0
.end method

.method public getCurBleConnector()Lcom/szabh/smable3/component/BaseBleConnector;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->getCurBleConnector()Lcom/szabh/smable3/component/BaseBleConnector;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->getCurBleConnector()Lcom/szabh/smable3/component/BaseBleConnector;

    move-result-object v0

    return-object v0
.end method

.method public isAvailable()Z
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isAvailable()Z

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->isAvailable()Z

    move-result v0

    return v0
.end method

.method public isBound()Z
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBound()Z

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBound()Z

    move-result v0

    return v0
.end method

.method public isBoundClassic()Z
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundClassic()Z

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundClassic()Z

    move-result v0

    return v0
.end method

.method public removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleHandleCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public sendData(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZ)Z
    .locals 8
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleConnector.sendData -> bleKey="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", multiDeviceActiveConnector="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", useMulti="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v2, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", this@BleConnector hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v2, :cond_2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-virtual/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZ)Z

    move-result p1

    return p1

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-super/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZ)Z

    move-result p1

    return p1
.end method

.method public sendInt8(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZ)Z
    .locals 8
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleConnector.sendInt8 -> bleKey="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", multiDeviceActiveConnector="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", useMulti="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v2, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v2, :cond_2

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-virtual/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZ)Z

    move-result p1

    return p1

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-super/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZ)Z

    move-result p1

    return p1
.end method

.method public sendList(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Ljava/util/List;ZZ)Z
    .locals 7
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/BleKey;",
            "Lcom/szabh/smable3/BleKeyFlag;",
            "Ljava/util/List<",
            "+",
            "Lcom/bestmafen/baseble/data/BleBuffer;",
            ">;ZZ)Z"
        }
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v1, :cond_0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleConnector;->sendList(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Ljava/util/List;ZZ)Z

    move-result p1

    return p1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-super/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleConnector;->sendList(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Ljava/util/List;ZZ)Z

    move-result p1

    return p1
.end method

.method public sendObject(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZ)Z
    .locals 8
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/bestmafen/baseble/data/BleBuffer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleConnector.sendObject -> bleKey="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", multiDeviceActiveConnector="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", useMulti="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v2, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v2, :cond_2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-virtual/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZ)Z

    move-result p1

    return p1

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-super/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZ)Z

    move-result p1

    return p1
.end method

.method public sendStream(Lcom/szabh/smable3/BleKey;II)Z
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;II)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;II)Z

    move-result p1

    return p1
.end method

.method public sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "file"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/File;I)Z

    move-result p1

    return p1
.end method

.method public sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/InputStream;I)Z
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/io/InputStream;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/InputStream;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/io/InputStream;I)Z

    move-result p1

    return p1
.end method

.method public sendStream(Lcom/szabh/smable3/BleKey;Ljava/lang/String;I)Z
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/lang/String;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;Ljava/lang/String;I)Z

    move-result p1

    return p1
.end method

.method public sendStream(Lcom/szabh/smable3/BleKey;[BI)Z
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    move-result p1

    return p1
.end method

.method public unbind()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->unbind()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/szabh/smable3/component/BaseBleConnector;->unbind()V

    return-void
.end method

.method public unbindClassic(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->unbindClassic(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->unbindClassic(Ljava/lang/String;)V

    return-void
.end method

.method public unbindHID(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->multiDeviceActiveConnector:Lcom/szabh/smable3/component/BaseBleConnector;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->unbindHID(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BaseBleConnector;->unbindHID(Ljava/lang/String;)V

    return-void
.end method
