.class public final Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/wq5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/StartGoogleActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/StartGoogleActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/StartGoogleActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/login/StartGoogleActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "lb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V
    .locals 1

    if-nez p1, :cond_0

    const p1, 0x7f140e31

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/login/StartGoogleActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/login/StartGoogleActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/login/StartGoogleActivity;->access$thirdPartyLogin(Lcom/sma/smartv3/ui/login/StartGoogleActivity;Lcom/sma/androidthirdpartylogin/model/LoginResponse;)V

    return-void
.end method
