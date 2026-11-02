.class public final Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n104#2,6:83\n59#3:89\n62#4:90\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n104#2,6:83\n59#3:89\n62#4:90\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->getTextChangedLastTime()J

    move-result-wide v2

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-virtual {v2, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setTextChangedLastTime(J)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$OXO1;->IO:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->searchName(Ljava/lang/String;)V

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
