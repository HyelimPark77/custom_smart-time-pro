.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->XO0O10(Landroid/app/Activity;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/ExtraPackVersions;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,920:1\n11#2,2:921\n15#2:923\n27#2,2:924\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n*L\n222#1:921,2\n223#1:923\n267#1:924,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,920:1\n11#2,2:921\n15#2:923\n27#2,2:924\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1\n*L\n222#1:921,2\n223#1:923\n267#1:924,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Z

.field public final synthetic XIi00iiXO:Landroid/app/Activity;


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->OXO1:Z

    iput-object p2, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->XIi00iiXO:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Landroid/app/Activity;Lcom/sma/smartv3/model/FirmwareVersion;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->iO(Landroid/app/Activity;Lcom/sma/smartv3/model/FirmwareVersion;)Z

    move-result p0

    return p0
.end method

.method public static final iO(Landroid/app/Activity;Lcom/sma/smartv3/model/FirmwareVersion;)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DEVICE_POWER"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {v0, p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->i010I(Landroid/app/Activity;Lcom/sma/smartv3/model/FirmwareVersion;)V

    goto :goto_0

    :cond_0
    const p0, 0x7f140bf4

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public XIi00iiXO(Lcom/sma/smartv3/model/ExtraPackVersions;)V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/FirmwareVersion;

    const/4 v1, 0x0

    if-nez v0, :cond_7

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_7

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_7

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getFontPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    if-nez v2, :cond_7

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getGpsFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_3

    :cond_3
    move-object v2, v1

    :goto_3
    if-nez v2, :cond_7

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getNetworkFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_4

    :cond_4
    move-object v2, v1

    :goto_4
    if-nez v2, :cond_7

    iget-boolean p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->OXO1:Z

    if-nez p1, :cond_6

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->II1Xi0()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_5

    :cond_5
    return-void

    :cond_6
    :goto_5
    const p1, 0x7f14011e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_7
    new-instance v2, Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v3, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->XIi00iiXO:Landroid/app/Activity;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->XIi00iiXO:Landroid/app/Activity;

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v4, 0x7f14146d    # 1.968318E38f

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const/16 v4, 0x11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getGpsFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object p1

    goto :goto_6

    :cond_8
    move-object p1, v1

    :goto_6
    if-eqz p1, :cond_9

    invoke-static {v2, v1, v1, v5, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const p1, 0x7f140fe0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_7

    :cond_9
    const p1, 0x7f14146c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v2, p1, v1, v5, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const p1, 0x7f140fe3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_7
    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iX0iOiXO0;

    invoke-direct {p1, v3, v0}, Lcom/android/mltcode/paycertificationapi/iX0iOiXO0;-><init>(Landroid/app/Activity;Lcom/sma/smartv3/model/FirmwareVersion;)V

    const v0, 0x7f14034b

    invoke-virtual {v2, v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->OXO1:Z

    if-nez p1, :cond_1

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->II1Xi0()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const p1, 0x7f14011e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$checkExtraPack$1;->XIi00iiXO(Lcom/sma/smartv3/model/ExtraPackVersions;)V

    return-void
.end method
