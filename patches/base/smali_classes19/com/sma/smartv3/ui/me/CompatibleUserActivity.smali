.class public final Lcom/sma/smartv3/ui/me/CompatibleUserActivity;
.super Lcom/sma/smartv3/ui/me/UserInfoActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public setupHeight()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AppUser:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->getTvHeight()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f140ba4

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->getMAppUser()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l76;->OXO1(F)[I

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/UserInfoActivity;->getTvHeight()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    aget v2, v0, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f14039e

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
