.class public final Lcom/sma/smartv3/ui/login/PersonalInformationActivity$doneClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/PersonalInformationActivity;->doneClick(Landroid/view/View;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/PersonalInformationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$doneClick$1;->OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/AppUser;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$doneClick$1;->OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/login/PersonalInformationActivity;->access$setDone(Lcom/sma/smartv3/ui/login/PersonalInformationActivity;Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "PersonalInformationActivity doneClick  handleError "

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "IS_LOGIN_USERINFO_ERROR"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$doneClick$1;->OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/PersonalInformationActivity;->access$getMAppUser$p(Lcom/sma/smartv3/ui/login/PersonalInformationActivity;)Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/login/PersonalInformationActivity;->access$setDone(Lcom/sma/smartv3/ui/login/PersonalInformationActivity;Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$doneClick$1;->OXO1(Lcom/sma/smartv3/model/AppUser;)V

    return-void
.end method
