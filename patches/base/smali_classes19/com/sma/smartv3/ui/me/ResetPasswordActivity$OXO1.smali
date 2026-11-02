.class public final Lcom/sma/smartv3/ui/me/ResetPasswordActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/me/ResetPasswordActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/ResetPasswordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$OXO1;->IO:Lcom/sma/smartv3/ui/me/ResetPasswordActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->access$getBtnNextStep(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
