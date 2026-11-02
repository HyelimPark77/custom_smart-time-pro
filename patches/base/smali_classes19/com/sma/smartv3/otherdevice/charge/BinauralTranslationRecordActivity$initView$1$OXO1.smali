.class public final Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/model/AISpeech;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public O00(Lcom/sma/smartv3/model/AISpeech;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1$OXO1;->O00(Lcom/sma/smartv3/model/AISpeech;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0ec9

    return v0
.end method

.method public XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/AISpeech;I)V
    .locals 3

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mAISpeech"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AISpeech;->getText()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0cdc

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    iget-object p3, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AISpeech;->getStartTime()J

    move-result-wide v0

    invoke-static {p3, v0, v1}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$updateTimerText(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;J)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1$OXO1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AISpeech;->getEndTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;->access$updateTimerText(Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity;J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " - "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a188d

    invoke-virtual {p1, v0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    const p3, 0x7f0a18aa

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AISpeech;->getDst()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AISpeech;->getDst()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/model/AISpeech;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity$initView$1$OXO1;->XO0O10(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/AISpeech;I)V

    return-void
.end method
