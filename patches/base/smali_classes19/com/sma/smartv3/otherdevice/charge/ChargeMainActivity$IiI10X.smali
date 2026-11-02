.class public final Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;->onFirmwareUpgrade(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
        "Lcom/sma/smartv3/model/FirmwareVersion;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChargeMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1136:1\n69#2,3:1137\n72#2,5:1141\n1#3:1140\n*S KotlinDebug\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n*L\n946#1:1137,3\n946#1:1141,5\n946#1:1140\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChargeMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1136:1\n69#2,3:1137\n72#2,5:1141\n1#3:1140\n*S KotlinDebug\n*F\n+ 1 ChargeMainActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChargeMainActivity$onFirmwareUpgrade$1$1\n*L\n946#1:1137,3\n946#1:1141,5\n946#1:1140\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$IiI10X;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->I0i0()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$IiI10X;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->IiI10X(Landroid/app/Activity;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$IiI10X;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f14011e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChargeMainActivity$IiI10X;->OXO1(Lcom/sma/smartv3/model/FirmwareVersion;)V

    return-void
.end method
