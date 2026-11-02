.class public final Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n75#2,4:83\n59#3:87\n62#4:88\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n75#2,4:83\n59#3:87\n62#4:88\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->isProgrammaticallySet()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/SearchFuncActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/ai/SearchFuncActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/ai/SearchFuncActivity;->access$editChanged(Lcom/sma/smartv3/ui/ai/SearchFuncActivity;Landroid/text/Editable;)V

    :cond_0
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
