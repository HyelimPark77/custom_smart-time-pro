.class public final Lcom/sma/smartv3/ui/device/StockAddActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/StockAddActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n71#2,6:83\n59#3:89\n62#4:90\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n71#2,6:83\n59#3:89\n62#4:90\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/StockAddActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/StockAddActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMClearImg(Lcom/sma/smartv3/ui/device/StockAddActivity;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/StockAddActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/StockAddActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/StockAddActivity;->access$getMClearImg(Lcom/sma/smartv3/ui/device/StockAddActivity;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

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
