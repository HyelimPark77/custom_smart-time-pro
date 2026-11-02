.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->O1O(Landroid/app/Activity;Ljava/lang/String;)V
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
    value = "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n69#3,3:923\n72#3,5:927\n1#4:926\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1\n*L\n853#1:921,2\n863#1:923,3\n863#1:927,5\n863#1:926\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n69#3,3:923\n72#3,5:927\n1#4:926\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1\n*L\n853#1:921,2\n863#1:923,3\n863#1:927,5\n863#1:926\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1;->OXO1:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 18

    move-object/from16 v0, p1

    if-eqz v0, :cond_1

    array-length v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileUrl()Ljava/lang/String;

    move-result-object v8

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileSize()I

    move-result v7

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object v6

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ExtraPackageData;->getVersion()Ljava/lang/String;

    move-result-object v9

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ExtraPackageData;->getInfo()Ljava/lang/String;

    move-result-object v10

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileSize()I

    move-result v11

    new-instance v5, Lcom/sma/smartv3/model/FirmwareVersion;

    const/16 v16, 0x3c0

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lcom/sma/smartv3/model/FirmwareVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v5}, Lcom/sma/smartv3/model/ExtraPackVersions;->setGpsFirmwareVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V

    const-class v0, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1;->OXO1:Landroid/app/Activity;

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;

    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    move-object/from16 v0, p0

    const v1, 0x7f141027

    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f141027

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$toGPSFirmwareRepair$1;->OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
