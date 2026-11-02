.class public final Lcom/sma/smartv3/ui/me/SettingsActivity$deleteAccount$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/SettingsActivity;->deleteAccount(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/SettingsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/SettingsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/SettingsActivity$deleteAccount$1$1$1;->OXO1:Lcom/sma/smartv3/ui/me/SettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/SettingsActivity$deleteAccount$1$1$1;->OXO1:Lcom/sma/smartv3/ui/me/SettingsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/SettingsActivity;->access$exit(Lcom/sma/smartv3/ui/me/SettingsActivity;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/SettingsActivity$deleteAccount$1$1$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
