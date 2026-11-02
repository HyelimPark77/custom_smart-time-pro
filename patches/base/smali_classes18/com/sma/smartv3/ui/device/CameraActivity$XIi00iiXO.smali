.class public final Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/CameraActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/CameraActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    invoke-direct {p0, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x15e

    if-gt p1, v0, :cond_5

    const/16 v0, 0xa

    if-ge p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x51

    if-gt v0, p1, :cond_2

    const/16 v0, 0x64

    if-ge p1, v0, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    const/16 v0, 0x5a

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/CameraActivity;->access$setMDisplayOrientation$p(Lcom/sma/smartv3/ui/device/CameraActivity;I)V

    return-void

    :cond_2
    const/16 v0, 0xab

    if-gt v0, p1, :cond_3

    const/16 v0, 0xbe

    if-ge p1, v0, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    const/16 v0, 0xb4

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/CameraActivity;->access$setMDisplayOrientation$p(Lcom/sma/smartv3/ui/device/CameraActivity;I)V

    return-void

    :cond_3
    const/16 v0, 0x105

    if-gt v0, p1, :cond_4

    const/16 v0, 0x118

    if-ge p1, v0, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    const/16 v0, 0x10e

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/CameraActivity;->access$setMDisplayOrientation$p(Lcom/sma/smartv3/ui/device/CameraActivity;I)V

    :cond_4
    return-void

    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/CameraActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/CameraActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/CameraActivity;->access$setMDisplayOrientation$p(Lcom/sma/smartv3/ui/device/CameraActivity;I)V

    return-void
.end method
