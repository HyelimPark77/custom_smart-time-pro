.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$OIX0iXi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;->threePopup(Z)V
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


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIX0iXi;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIX0iXi;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->setMServerLanguageList([Lcom/sma/smartv3/model/ExtraPackageData;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->DEVICE_LANGUAGES2:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIX0iXi;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$fourPopup(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment$OIX0iXi;->OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
