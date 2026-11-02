.class public final Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->initEditText()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    :cond_0
    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->access$getBytesLimit$p(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)I

    move-result v1

    if-le v0, v1, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->access$getTvCount(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object p3, p0, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity$OXO1;->IO:Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;

    invoke-static {p3}, Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;->access$getBytesLimit$p(Lcom/sma/smartv3/ui/ai/AIAnswerBaseActivity;)I

    move-result p3

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
