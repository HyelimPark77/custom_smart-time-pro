.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->OIi0(Lcom/android/mltcode/paycertificationapi/O0Oiii;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/sma/smartv3/model/ExtraPackageData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,920:1\n11#2,2:921\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1\n*L\n816#1:921,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,920:1\n11#2,2:921\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1\n*L\n816#1:921,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O0Oiii;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
            "Lcom/sma/smartv3/model/ExtraPackageData;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "null"

    if-eqz v1, :cond_2

    array-length v3, v1

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-nez v3, :cond_2

    aget-object v3, v1, v4

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ExtraPackageData;->getVersion()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v6, Lcom/szabh/smable3/BleKey;->GPS_FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v7, "0.0.0"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "checkGPSFirmwareVersion -> same version"

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-interface {v1, v2}, Lcom/android/mltcode/paycertificationapi/O0Oiii;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "checkGPSFirmwareVersion -> new version: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/model/ExtraPackVersions;

    const/16 v13, 0x7f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileUrl()Ljava/lang/String;

    move-result-object v10

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileSize()I

    move-result v9

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object v8

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackageData;->getVersion()Ljava/lang/String;

    move-result-object v11

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackageData;->getInfo()Ljava/lang/String;

    move-result-object v12

    aget-object v6, v1, v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileSize()I

    move-result v13

    new-instance v7, Lcom/sma/smartv3/model/FirmwareVersion;

    const/16 v18, 0x3c0

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v7 .. v19}, Lcom/sma/smartv3/model/FirmwareVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Lcom/sma/smartv3/model/ExtraPackVersions;->setGpsFirmwareVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V

    aget-object v1, v1, v4

    invoke-interface {v3, v1}, Lcom/android/mltcode/paycertificationapi/O0Oiii;->onSuccess(Ljava/lang/Object;)V

    const-class v1, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v1, v0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-interface {v1, v2}, Lcom/android/mltcode/paycertificationapi/O0Oiii;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O0Oiii;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O0Oiii;->onFailure(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkGPSFirmwareVersion$1;->OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
