.class public final Lcom/sma/smartv3/ui/me/LanguageListActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/LanguageListActivity;->initView()V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/LanguageListActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/LanguageListActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/LanguageListActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/LanguageListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 1

    if-eqz p1, :cond_1

    array-length v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/LanguageListActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/LanguageListActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/me/LanguageListActivity;->access$showData(Lcom/sma/smartv3/ui/me/LanguageListActivity;[Lcom/sma/smartv3/model/ExtraPackageData;)V

    :cond_1
    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/LanguageListActivity$OXO1;->OXO1([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
