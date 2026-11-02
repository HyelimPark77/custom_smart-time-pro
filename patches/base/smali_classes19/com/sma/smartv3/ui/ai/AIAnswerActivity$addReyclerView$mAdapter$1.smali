.class public final Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIAnswerActivity;->addReyclerView(Ljava/util/List;ILjava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $tabData:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;Landroid/app/Activity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;->$tabData:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    const p2, 0x7f0d0eb2

    invoke-direct {p0, p3, p2, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;Ljava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;->convert$lambda$1(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;Ljava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;Landroid/view/View;)V

    return-void
.end method

.method private static final convert$lambda$1(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;Ljava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->XOO0ii0(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V

    return-void
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
    .locals 1

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0a0bf7

    .line 2
    invoke-virtual {p1, p3, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 3
    iget-object p3, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;->$tabData:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    .line 4
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f081699

    goto :goto_0

    :cond_0
    const v0, 0x7f081648

    .line 5
    :goto_0
    invoke-virtual {p3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 6
    iget-object p3, p0, Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;->$tabData:Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOO1ii1;

    invoke-direct {v0, p3, p2, p0}, Lcom/android/mltcode/paycertificationapi/iOO1ii1;-><init>(Lcom/sma/smartv3/ui/ai/AIAnswerActivity$OXO1;Ljava/lang/String;Lcom/sma/smartv3/ui/ai/AIAnswerActivity$addReyclerView$mAdapter$1;)V

    const p2, 0x7f0a06fe

    invoke-virtual {p1, p2, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    return-void
.end method
