.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->download(Lcom/sma/smartv3/model/FirmwareVersion;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->upgrade()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " download firmware error -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTvTip(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    const v1, 0x7f141196

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;Z)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$download$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
