.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;->checkVersionByClickFirmware()V
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


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$O00;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$O00;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$toFirmwareUpgrade(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    return-void

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$O00;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/DeviceFragment;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->XO0O10(Landroid/app/Activity;Z)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$O00;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/DeviceFragment;)Landroid/app/Activity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->XO0O10(Landroid/app/Activity;Z)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment$O00;->OXO1(Lcom/sma/smartv3/model/FirmwareVersion;)V

    return-void
.end method
