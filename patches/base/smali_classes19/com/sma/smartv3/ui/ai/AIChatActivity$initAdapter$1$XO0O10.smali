.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/jc<",
        "Lcom/sma/smartv3/db/entity/AIRecords;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$addQuestion(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/widget/TextView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->IiI10X(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V
    .locals 0

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "mAIRecords"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a1940

    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;

    invoke-static {p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;->access$getMContext$p$s-1623866647(Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1;)Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f0607a5

    invoke-static {p2, p3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/XOIX;

    invoke-direct {p3, p2, p1}, Lcom/android/mltcode/paycertificationapi/XOIX;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Landroid/widget/TextView;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic OXO1(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p1, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->XOO0ii0(Lcom/sma/smartv3/db/entity/AIRecords;I)Z

    move-result p1

    return p1
.end method

.method public XIi00iiXO()I
    .locals 1

    const v0, 0x7f0d0eb6

    return v0
.end method

.method public XOO0ii0(Lcom/sma/smartv3/db/entity/AIRecords;I)Z
    .locals 1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result p1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return p2
.end method

.method public bridge synthetic iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lcom/sma/smartv3/db/entity/AIRecords;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIChatActivity$initAdapter$1$XO0O10;->O00(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/db/entity/AIRecords;I)V

    return-void
.end method
