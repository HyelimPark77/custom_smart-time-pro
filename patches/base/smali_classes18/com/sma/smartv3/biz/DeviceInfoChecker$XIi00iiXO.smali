.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->iI(Landroid/app/Activity;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
        "[",
        "Lcom/sma/smartv3/model/ExtraPackageData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n1#4:926\n1#4:935\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n*L\n462#1:921,2\n464#1:923,3\n464#1:927,5\n465#1:932,3\n465#1:936,5\n464#1:926\n465#1:935\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n1#4:926\n1#4:935\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toUIRepair$1\n*L\n462#1:921,2\n464#1:923,3\n464#1:927,5\n465#1:932,3\n465#1:936,5\n464#1:926\n465#1:935\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$XIi00iiXO;->OXO1:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Landroid/app/Activity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$XIi00iiXO;->iO(Landroid/app/Activity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final iO(Landroid/app/Activity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/UiRepairSmaActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public XIi00iiXO([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 4

    if-eqz p1, :cond_3

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-object v1, p1, v0

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    aget-object p1, p1, v0

    const-class v2, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Xi1i0XOX0()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const p1, 0x7f1412c0

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$XIi00iiXO;->OXO1:Landroid/app/Activity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X0XIOI;

    invoke-direct {v2, p1}, Lcom/android/mltcode/paycertificationapi/X0XIOI;-><init>(Landroid/app/Activity;)V

    const/4 p1, 0x0

    invoke-static {v0, v2, v1, p1}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$XIi00iiXO;->OXO1:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/UiRepairRActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    :goto_0
    const p1, 0x7f141027

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f141027

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$XIi00iiXO;->XIi00iiXO([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
