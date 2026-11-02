.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXiIO0i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->detailSyncDial()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMItemPosition()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;)Lcom/sma/smartv3/view/ProgressButtonV2;

    move-result-object v4

    const-string v3, "access$getProgressButton(...)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getBinUrl()Ljava/lang/String;

    move-result-object v5

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getPreviewUrl()Ljava/lang/String;

    move-result-object v6

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->getMDialType()I

    move-result v7

    move v3, p1

    invoke-static/range {v0 .. v7}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;->access$syncDial(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivity;IIILcom/sma/smartv3/view/ProgressButtonV2;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method
