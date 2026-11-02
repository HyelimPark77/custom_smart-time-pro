.class public final Lcom/sma/smartv3/ui/main/NationServerSelectActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->onSetListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n389#2,3:83\n59#3:86\n62#4:87\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 NationServerSelectActivity.kt\ncom/sma/smartv3/ui/main/NationServerSelectActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n389#2,3:83\n59#3:86\n62#4:87\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$OXO1;->IO:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/NationServerSelectActivity$OXO1;->IO:Lcom/sma/smartv3/ui/main/NationServerSelectActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/main/NationServerSelectActivity;->access$searchContent(Lcom/sma/smartv3/ui/main/NationServerSelectActivity;Ljava/lang/String;)V

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
