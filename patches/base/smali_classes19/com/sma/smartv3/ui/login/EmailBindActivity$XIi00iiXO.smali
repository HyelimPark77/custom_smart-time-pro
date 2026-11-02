.class public final Lcom/sma/smartv3/ui/login/EmailBindActivity$XIi00iiXO;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getBottomBtn(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/login/EmailBindActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/login/EmailBindActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/login/EmailBindActivity;->access$getEmail(Lcom/sma/smartv3/ui/login/EmailBindActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "@"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

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
