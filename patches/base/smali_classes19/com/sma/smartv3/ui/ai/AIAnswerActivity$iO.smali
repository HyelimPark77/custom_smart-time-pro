.class public final Lcom/sma/smartv3/ui/ai/AIAnswerActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addEditLayout(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n130#2,2:83\n59#3:85\n62#4:86\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 AIAnswerActivity.kt\ncom/sma/smartv3/ui/ai/AIAnswerActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n130#2,2:83\n59#3:85\n62#4:86\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$iO;->IO:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$iO;->IO:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->XOO0ii0(Ljava/lang/String;)V

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
