.class public final Lcom/sma/smartv3/view/SquareVerificationCodeView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/SquareVerificationCodeView;->initEditText()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/SquareVerificationCodeView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/SquareVerificationCodeView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/SquareVerificationCodeView$OXO1;->IO:Lcom/sma/smartv3/view/SquareVerificationCodeView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/SquareVerificationCodeView$OXO1;->IO:Lcom/sma/smartv3/view/SquareVerificationCodeView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/view/SquareVerificationCodeView$OXO1;->IO:Lcom/sma/smartv3/view/SquareVerificationCodeView;

    invoke-static {v1}, Lcom/sma/smartv3/view/SquareVerificationCodeView;->access$getCODE_COUNT$p(Lcom/sma/smartv3/view/SquareVerificationCodeView;)I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/view/SquareVerificationCodeView$OXO1;->IO:Lcom/sma/smartv3/view/SquareVerificationCodeView;

    invoke-static {v0}, Lcom/sma/smartv3/view/SquareVerificationCodeView;->access$closeKeyboard(Lcom/sma/smartv3/view/SquareVerificationCodeView;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/SquareVerificationCodeView$OXO1;->IO:Lcom/sma/smartv3/view/SquareVerificationCodeView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/SquareVerificationCodeView;->getOnCodeCompleteListener()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
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
