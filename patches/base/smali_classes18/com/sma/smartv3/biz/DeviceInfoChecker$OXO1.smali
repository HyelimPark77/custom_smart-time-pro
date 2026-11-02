.class public final Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/DeviceInfoChecker;->IXXOO(Landroid/app/Activity;Ljava/lang/String;)V
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
    value = "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n27#2,2:941\n27#2,2:943\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n69#3,3:945\n72#3,5:949\n69#3,3:954\n72#3,5:958\n1#4:926\n1#4:935\n1#4:948\n1#4:957\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n*L\n489#1:921,2\n495#1:941,2\n501#1:943,2\n491#1:923,3\n491#1:927,5\n492#1:932,3\n492#1:936,5\n506#1:945,3\n506#1:949,5\n507#1:954,3\n507#1:958,5\n491#1:926\n492#1:935\n506#1:948\n507#1:957\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceInfoChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,920:1\n11#2,2:921\n27#2,2:941\n27#2,2:943\n69#3,3:923\n72#3,5:927\n69#3,3:932\n72#3,5:936\n69#3,3:945\n72#3,5:949\n69#3,3:954\n72#3,5:958\n1#4:926\n1#4:935\n1#4:948\n1#4:957\n*S KotlinDebug\n*F\n+ 1 DeviceInfoChecker.kt\ncom/sma/smartv3/biz/DeviceInfoChecker$toFontRepair$1\n*L\n489#1:921,2\n495#1:941,2\n501#1:943,2\n491#1:923,3\n491#1:927,5\n492#1:932,3\n492#1:936,5\n506#1:945,3\n506#1:949,5\n507#1:954,3\n507#1:958,5\n491#1:926\n492#1:935\n506#1:948\n507#1:957\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;->OXO1:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 3

    const-class v0, Lcom/sma/smartv3/model/ExtraPackageData;

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    aget-object v2, p1, v1

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    aget-object p1, p1, v1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->XX00i10X()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;->OXO1:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FontRepairSmaActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;->OXO1:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    :goto_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    const p1, 0x7f141027

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object p1

    const-string v0, "JL"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f141027

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->XX00i10X()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;->OXO1:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FontRepairSmaActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;->OXO1:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/DeviceInfoChecker$OXO1;->OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
