.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;->twoPopup(Z)V
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
.field public final synthetic OXO1:Z

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;


# direct methods
.method public constructor <init>(ZLcom/sma/smartv3/ui/device/DeviceFragment;)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->OXO1:Z

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;Z)Z
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I10XXX;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/I10XXX;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    const/4 p0, 0x0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, v0, p2, p0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return p2
.end method

.method public static final O00(ZLcom/sma/smartv3/ui/device/DeviceFragment;)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$threePopup(Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic OXO1(ZLcom/sma/smartv3/ui/device/DeviceFragment;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->O00(ZLcom/sma/smartv3/ui/device/DeviceFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XOO0ii0(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;ZLcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p3

    const-string v0, "DEVICE_POWER"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result p3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFlag()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/16 p0, 0x14

    goto :goto_0

    :cond_0
    const/16 p0, 0x32

    :goto_0
    if-lt p3, p0, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$toFirmwareUpgrade(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    goto :goto_1

    :cond_1
    const p0, 0x7f140bf4

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    if-eqz p2, :cond_2

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$threePopup(Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;Z)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->IiI10X(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public XO0O10(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 8

    const-string v0, "firmware_version_changed"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFlag()I

    move-result v3

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->OXO1:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$threePopup(Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    return-void

    :cond_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/DeviceFragment;)Landroid/app/Activity;

    move-result-object v5

    invoke-direct {v4, v5, v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-boolean v5, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->OXO1:Z

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    const v7, 0x7f140fe3

    invoke-virtual {v4, v7}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFlag()I

    move-result v0

    const/4 v7, 0x1

    if-ne v0, v7, :cond_1

    invoke-static {v4, v1, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f14146c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X1XX;

    invoke-direct {v1, v5, v6}, Lcom/android/mltcode/paycertificationapi/X1XX;-><init>(ZLcom/sma/smartv3/ui/device/DeviceFragment;)V

    invoke-virtual {v4, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    :goto_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIX1i1O;

    invoke-direct {v0, p1, v6, v5}, Lcom/android/mltcode/paycertificationapi/XIX1i1O;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    const p1, 0x7f14034b

    invoke-virtual {v4, p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v3, v4}, Lcom/sma/smartv3/ui/device/DeviceFragment;->setMOTAMessagePopup(Lcom/android/mltcode/paycertificationapi/go0;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getMOTAMessagePopup()Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void

    :cond_2
    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/DeviceFragment;)Landroid/app/Activity;

    move-result-object v3

    invoke-static {p1, v3, v0, v2, v1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->O00(Lcom/sma/smartv3/biz/DeviceInfoChecker;Landroid/app/Activity;ZILjava/lang/Object;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->OXO1:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$threePopup(Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    :cond_3
    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "firmware_version_changed"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/DeviceFragment;)Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v1, v0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->O00(Lcom/sma/smartv3/biz/DeviceInfoChecker;Landroid/app/Activity;ZILjava/lang/Object;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->OXO1:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XIi00iiXO:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1, v3}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$threePopup(Lcom/sma/smartv3/ui/device/DeviceFragment;Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment$I0iXXO;->XO0O10(Lcom/sma/smartv3/model/FirmwareVersion;)V

    return-void
.end method
