.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
        "Lcom/sma/smartv3/model/ExtraPackageData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n78#2,3:3224\n81#2,5:3228\n1#3:3227\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n*L\n1579#1:3224,3\n1579#1:3228,5\n1579#1:3227\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n78#2,3:3224\n81#2,5:3228\n1#3:3227\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$aGPSUpgradeItem$2$1$1$1$1\n*L\n1579#1:3224,3\n1579#1:3228,5\n1579#1:3227\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$toSyncAGPS(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment$XIi00iiXO;->OXO1(Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
