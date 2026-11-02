.class public final Lcom/sma/smartv3/ui/me/UserInfoActivity$onBottomClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/UserInfoActivity;->onBottomClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AppUser;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/UserInfoActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/UserInfoActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/UserInfoActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/UserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/AppUser;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/UserInfoActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/UserInfoActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->access$saveDone(Lcom/sma/smartv3/ui/me/UserInfoActivity;Lcom/sma/smartv3/model/AppUser;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X01I1OX1i()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/BGEMManager;->OXO1:Lcom/sma/smartv3/biz/BGEMManager;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/sma/smartv3/biz/BGEMManager;->IO(Lcom/sma/smartv3/biz/BGEMManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_0
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

    check-cast p1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/UserInfoActivity$onBottomClick$1;->OXO1(Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method
