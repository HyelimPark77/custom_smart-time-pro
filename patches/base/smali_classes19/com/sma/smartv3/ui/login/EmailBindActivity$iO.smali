.class public final Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/EmailBindActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/EmailBindActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getVerificationCode(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getVerificationCode(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$changeEmail(Lcom/sma/smartv3/ui/login/EmailBindActivity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$iO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getTvCodeError(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
