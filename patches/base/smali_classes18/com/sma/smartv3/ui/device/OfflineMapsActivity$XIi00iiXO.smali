.class public final Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/pop/MessageListV2Popup$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->showListPopup(Lcom/sma/smartv3/model/MapFileItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Lcom/sma/smartv3/model/MapFileItem;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(ILjava/lang/String;)V
    .locals 7

    const-string p1, "str"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    const v0, 0x7f141056

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MapFileItem;->getImgPath()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/MapFileItem;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const v2, 0x7f141053

    invoke-static {p1, p2, v0, v1, v2}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->access$delete(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Ljava/lang/String;Ljava/lang/String;II)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    const v0, 0x7f141054

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/MapFileItem;->getImgPath()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x7f141055

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->delete$default(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    const v0, 0x7f141057

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/MapFileItem;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    const v4, 0x7f141058

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->delete$default(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    const v0, 0x7f141066

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/OfflineMapsActivity;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/OfflineMapsActivity$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/MapFileItem;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MapFileItem;->getImgPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/OfflineMapsActivity;->access$syneMap(Lcom/sma/smartv3/ui/device/OfflineMapsActivity;Ljava/lang/String;)V

    return-void

    :cond_3
    const p1, 0x7f14105e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_4
    return-void
.end method
