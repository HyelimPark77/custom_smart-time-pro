.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/bestmafen/baseble/scanner/BleDevice;)Z
    .locals 9

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "DEVELOPER_UPDATE_BLE_NAME"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "getString(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/16 v6, -0x3c

    const-string v7, "DEVELOPER_SIGNAL_VALUE"

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result p1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v7, v6}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-le p1, v0, :cond_0

    return v5

    :cond_0
    return v4

    :cond_1
    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v8

    invoke-virtual {v8, v7, v6}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v6

    if-le v1, v6, :cond_3

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/android/mltcode/paycertificationapi/q62;->iOO1ii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->access$isOTA(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    return v5

    :cond_3
    return v4
.end method
