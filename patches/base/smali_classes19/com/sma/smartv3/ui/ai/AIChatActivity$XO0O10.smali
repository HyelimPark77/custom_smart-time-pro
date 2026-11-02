.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIChatActivity;->sendCurrent(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1<",
        "Lcom/sma/smartv3/model/AIAnswer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getReceived()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    const v1, 0x7f141196

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "mAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$scrollView(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method

.method public bridge synthetic XIi00iiXO(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->iO(Lcom/sma/smartv3/model/AIAnswer;)V

    return-void
.end method

.method public iO(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getReceived()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getReceived()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result v2

    if-ne v2, v1, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMStatus(I)V

    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result p1

    const/4 v0, 0x0

    const-string v2, "mAdapter"

    if-ne p1, v1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$scrollView(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getLastScrollTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    cmp-long p1, v3, v5

    if-lez p1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object p1

    if-nez p1, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v0, p1

    :goto_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$scrollView(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    :cond_6
    return-void
.end method
