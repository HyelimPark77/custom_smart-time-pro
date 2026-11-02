.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->onBottomClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 6

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->uploadDownloadInfo$default(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " download language error -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;->OXO1(Ljava/lang/String;)V

    return-void
.end method
